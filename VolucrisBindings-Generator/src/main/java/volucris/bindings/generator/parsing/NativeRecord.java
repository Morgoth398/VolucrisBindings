package volucris.bindings.generator.parsing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.lwjgl.llvm.CXCursor;
import org.lwjgl.llvm.CXCursorVisitor;
import org.lwjgl.llvm.CXString;
import org.lwjgl.llvm.CXType;
import org.lwjgl.llvm.ClangIndex;
import org.lwjgl.system.MemoryStack;

import org.jspecify.annotations.Nullable;

public class NativeRecord {

	private final List<NativeField> fields;

	private final String name;
	private final String comment;

	private final boolean isUnion;

	private final long alignment;
	private final long size;

	public NativeRecord(CXCursor cursor, String name, boolean isUnion, boolean reportPlatformSpecificity) {
		this.name = name;
		this.isUnion = isUnion;

		final List<NativeField> fields = new ArrayList<NativeField>();

		try (MemoryStack stack = MemoryStack.stackPush()) {
			final CXString cxString = CXString.calloc(stack);

			final CXType cxType = CXType.calloc(stack);
			final CXType result = CXType.calloc(stack);

			ClangIndex.clang_Cursor_getRawCommentText(cursor, cxString);
			this.comment = ParsingUtils.getCommentText(cxString);

			final CXCursorVisitor visitor = new CXCursorVisitor() {
				public int invoke(CXCursor cursor, CXCursor parent, long client_data) {
					int cursorKind = ClangIndex.clang_getCursorKind(cursor);

					if (cursorKind != ClangIndex.CXCursor_FieldDecl)
						return ClangIndex.CXChildVisit_Continue;

					final boolean isBitField = ClangIndex.clang_Cursor_isBitField(cursor);

					/// The argument for parameter `cursorResult` must be null as the current cursor
					/// can already be used for creating a [NativeFunctionPointer]. But why this is the case
					/// I do not know. For function pointers outside of records (see [HeaderFile] for `ClangIndex.CXCursor_VarDecl`
					/// or `ClangIndex.CXCursor_TypedefDecl`) the parameter `cursorResult` is
					/// necessary and must under no circumstances be nullified.
					final boolean isFunctionPointer = ParsingUtils.isFunctionPointer(cursor, null, result);

					if (isBitField) {
						fields.add(new BitField(cursor));
					} else if (isFunctionPointer) {
						String functionPointerName = ParsingUtils.getFunctionPointerName(cursor, name);

						fields.add(
								new FunctionPointerField(cursor, result, functionPointerName, reportPlatformSpecificity)
						);
					} else {
						fields.add(new RecordField(cursor));
					}

					return ClangIndex.CXChildVisit_Continue;
				};
			};

			ClangIndex.clang_visitChildren(cursor, visitor, 0);

			visitor.free();

			ClangIndex.clang_getCursorType(cursor, cxType);
			this.size = ClangIndex.clang_Type_getSizeOf(cxType);
			this.alignment = ClangIndex.clang_Type_getAlignOf(cxType);

			if (fields.size() == 0) {
				this.fields = List.of();
				return;
			}

			boolean containsBitFields = fields.stream().filter(BitField.class::isInstance).count() > 0;

			if (containsBitFields && !isUnion) {
				List<NativeField> updatedFields = handleBitFields(fields);

				handlePadding(updatedFields);

				this.fields = Collections.unmodifiableList(updatedFields);
			} else {
				if (!isUnion)
					handlePadding(fields);

				this.fields = Collections.unmodifiableList(fields);
			}
		}

	}

	private List<NativeField> handleBitFields(List<NativeField> fields) {
		List<NativeField> updatedFields = new ArrayList<NativeField>(fields.size());

		List<BitField> bitFieldGroup = new ArrayList<BitField>();

		int bitFieldIndex = 0;

		for (int i = 0; i < fields.size(); i++) {
			NativeField field = fields.get(i);

			if (field instanceof BitField bitField) {
				boolean zeroWidth = bitField.width == 0;

				boolean createNewGroup;

				if (zeroWidth) {
					createNewGroup = true;
				} else if (bitFieldGroup.isEmpty()) {
					createNewGroup = false;
				} else {
					BitField currentBitField = bitFieldGroup.getFirst();

					long unitStart = alignDown(currentBitField.bitOffset, currentBitField.typeSize);

					boolean sameType = currentBitField.type.equals(bitField.type);
					boolean sameUnit = bitField.bitOffset >= unitStart
							&& bitField.bitOffset + bitField.width <= unitStart + currentBitField.typeSize;

					createNewGroup = !(sameType && sameUnit);
				}

				if (createNewGroup) {
					updatedFields.add(getBitFieldGroupField(bitFieldGroup, bitFieldIndex++));
					bitFieldGroup.clear();
				}

				if (!zeroWidth)
					bitFieldGroup.add(bitField);
			} else {
				if (!bitFieldGroup.isEmpty()) {
					updatedFields.add(getBitFieldGroupField(bitFieldGroup, bitFieldIndex++));
					bitFieldGroup.clear();
				}

				updatedFields.add(field);
			}
		}

		if (!bitFieldGroup.isEmpty()) {
			updatedFields.add(getBitFieldGroupField(bitFieldGroup, bitFieldIndex++));
			bitFieldGroup.clear();
		}

		return updatedFields;
	}

	private RecordField getBitFieldGroupField(List<BitField> bitFieldGroup, int bitFieldIndex) {
		RecordField field = new RecordField(bitFieldGroup.getFirst(), "bitFields" + bitFieldIndex);

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("All bit fields contained in this field with their bit width:\n");
		bitFieldGroup.forEach(bitField -> {
			stringBuilder.append(bitField.getName()).append(" : ").append(bitField.width).append("\n");
		});

		field.comment = stringBuilder.toString();

		return field;
	}

	private long alignDown(long value, long align) {
		return (value / align) * align;
	}

	private void handlePadding(List<NativeField> fields) {
		for (int i = 0; i < fields.size() - 1; i++) {
			TypedField currentField = (TypedField) fields.get(i);
			TypedField nextField = (TypedField) fields.get(i + 1);

			long padding = nextField.getOffset() - (currentField.getOffset() + currentField.getSize());

			if (padding > 0) {
				fields.add(i + 1, new PaddingField(padding));
				i += 1;
			}
		}

		TypedField lastField = (TypedField) fields.getLast();

		long padding = size - (lastField.getOffset() + lastField.getSize());

		if (padding > 0)
			fields.add(new PaddingField(padding));
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Record : ").append(name);
		stringBuilder.append(", IsUnion: ").append(isUnion);
		stringBuilder.append(", Size: ").append(size);
		stringBuilder.append(", Alignment: ").append(alignment);
		stringBuilder.append(", Fields: ");
		fields.forEach(field -> stringBuilder.append(field).append(", "));
		return stringBuilder.toString();
	}

	public List<NativeField> getFields() {
		return fields;
	}

	public int getFunctionPointerFieldsCount() {
		return (int) fields.stream()
				.filter(FunctionPointerField.class::isInstance)
				.count();
	}

	public List<FunctionPointerField> getFunctionPointerFields() {
		return fields.stream()
				.filter(FunctionPointerField.class::isInstance)
				.map(FunctionPointerField.class::cast)
				.toList();
	}

	public String getName() {
		return name;
	}

	public @Nullable String getComment() {
		return comment;
	}

	public long getAlignment() {
		return alignment;
	}

	public long getSize() {
		return size;
	}

	public boolean isUnion() {
		return isUnion;
	}

	public static interface NativeField {
		long getSize();
	}

	public static interface TypedField extends NativeField {
		String getName();

		@Nullable
		String getComment();

		long getAlignment();

		long getOffset();
	}

	public static class PaddingField implements NativeField {

		private final long size;

		public PaddingField(long size) {
			this.size = size;
		}

		@Override
		public String toString() {
			return "padding(" + size + ")";
		}

		@Override
		public long getSize() {
			return size;
		}

	}

	public static class RecordField extends NativeType implements TypedField {

		private final String name;

		private final long offset;
		private final long size;
		private final long alignment;

		private String comment;

		public RecordField(CXCursor cursor) {
			super(cursor);

			try (MemoryStack stack = MemoryStack.stackPush()) {
				CXType cursorType = CXType.calloc(stack);
				CXString cxString = CXString.calloc(stack);

				ClangIndex.clang_getCursorSpelling(cursor, cxString);
				ClangIndex.clang_getCursorType(cursor, cursorType);

				this.name = ClangIndex.clang_getCString(cxString);
				this.offset = ClangIndex.clang_Cursor_getOffsetOfField(cursor) / 8; // Method returns offset in bits.
																					// Must be converted to bytes.
				this.size = ClangIndex.clang_Type_getSizeOf(cursorType);
				this.alignment = ClangIndex.clang_Type_getAlignOf(cursorType);

				ClangIndex.clang_Cursor_getRawCommentText(cursor, cxString);
				this.comment = ParsingUtils.getCommentText(cxString);
			}
		}

		public RecordField(BitField bitField, String name) {
			super(bitField);

			this.name = name;
			this.comment = bitField.getComment();
			this.offset = bitField.getOffset();
			this.size = bitField.getSize();
			this.alignment = bitField.getAlignment();
		}

		@Override
		public String toString() {
			return name
					+ "( Offset: " + offset
					+ ", Size: " + size
					+ ", Alignment: " + alignment
					+ ", " + super.toString() + ")";
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public @Nullable String getComment() {
			return comment;
		}

		@Override
		public long getSize() {
			return size;
		}

		@Override
		public long getAlignment() {
			return alignment;
		}

		@Override
		public long getOffset() {
			return offset;
		}
	}

	public static class FunctionPointerField extends RecordField {

		private NativeFunctionPointer functionPointer;

		public FunctionPointerField(
				CXCursor cursor,
				CXType functionPointerType,
				String functionPointerName,
				boolean reportPlatformSpecificity
		) {
			super(cursor);

			this.functionPointer = new NativeFunctionPointer(
					functionPointerType, cursor, functionPointerName, reportPlatformSpecificity
			);
		}

		public NativeFunctionPointer getFunctionPointer() {
			return functionPointer;
		}

		@Override
		public String toString() {
			return super.toString() + ", " + functionPointer.toString();
		}

	}

	private static class BitField extends RecordField {

		private final long bitOffset;
		private final long typeSize; // in bits
		private final long width;

		public BitField(CXCursor cursor) {
			super(cursor);

			this.bitOffset = ClangIndex.clang_Cursor_getOffsetOfField(cursor);
			this.width = ClangIndex.clang_getFieldDeclBitWidth(cursor);

			typeSize = switch (type.typeKind()) {
				case LONG -> 64;
				case INT -> 32;
				case SHORT -> 16;
				case BYTE -> 8;
				default -> throw new RuntimeException("Invalid bit field type: " + type.typeKind());
			};
		}

	}

}
