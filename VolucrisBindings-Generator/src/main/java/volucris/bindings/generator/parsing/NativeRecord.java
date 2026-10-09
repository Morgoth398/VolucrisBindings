package volucris.bindings.generator.parsing;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jspecify.annotations.Nullable;

import volucris.bindings.libclang.CXCursorVisitor;
import volucris.bindings.libclang.ClangIndex;
import volucris.bindings.libclang.enums.CXChildVisitResult;
import volucris.bindings.libclang.enums.CXCursorKind;
import volucris.bindings.libclang.structs.CXCursor;
import volucris.bindings.libclang.structs.CXString;
import volucris.bindings.libclang.structs.CXType;

public class NativeRecord {

	private final List<NativeField> fields;

	private final String name;
	private final String comment;

	private final boolean isUnion;

	private final long alignment;
	private final long size;

	public NativeRecord(String name, CXCursor cursor, boolean isUnion, boolean reportPlatformSpecificity) {
		this.name = name;
		this.isUnion = isUnion;

		List<NativeField> fields = new ArrayList<NativeField>();

		try (Arena arena = Arena.ofConfined()) {
			CXString rawCommentText = ClangIndex.clang_Cursor_getRawCommentText(arena, cursor);
			comment = ParsingUtils.getCommentText(rawCommentText);
			ClangIndex.clang_disposeString(rawCommentText);

			CXCursorVisitor visitor = new CXCursorVisitor(arena) {
				@Override
				public int invoke(CXCursor cursor, CXCursor parent, MemorySegment client_data) {
					int cursorKind = ClangIndex.clang_getCursorKind(cursor);

					if (cursorKind != CXCursorKind.CX_CURSOR_FIELD_DECL)
						return CXChildVisitResult.CX_CHILD_VISIT_CONTINUE;

					final boolean isBitField = ClangIndex.clang_Cursor_isBitField(cursor) != 0;

					CXCursor cursorResult = new CXCursor(arena);
					CXType typeResult = new CXType(arena);

					final boolean isFunctionPointer = ParsingUtils.isFunctionPointer(cursor, cursorResult, typeResult);

					if (isBitField) {
						fields.add(new BitField(cursor));
					} else if (isFunctionPointer) {
						if (ParsingUtils.isFunctionPointerInlined(cursorResult)) {
							fields.add(
									new FunctionPointerField(
											cursorResult,
											typeResult,
											ParsingUtils.getFunctionPointerName(cursorResult, name),
											reportPlatformSpecificity
									)
							);
						} else {
							fields.add(new RecordField(cursor));
						}
					} else {
						fields.add(new RecordField(cursor));
					}

					return CXChildVisitResult.CX_CHILD_VISIT_CONTINUE;
				}
			};

			ClangIndex.clang_visitChildren(cursor, visitor, MemorySegment.NULL);

			CXType cursorType = ClangIndex.clang_getCursorType(arena, cursor);

			this.size = ClangIndex.clang_Type_getSizeOf(cursorType);
			this.alignment = ClangIndex.clang_Type_getAlignOf(cursorType);

			if (fields.size() == 0) {
				this.fields = List.of();
				return;
			}

			boolean containsBitFields = fields.stream().filter(BitField.class::isInstance).count() > 0;

			if (containsBitFields) {
				List<NativeField> updatedFields = handleBitFields(fields);

				if (!isUnion) {
					handleStructPadding(updatedFields);
				} else {
					handleUnionPadding(updatedFields);
				}

				this.fields = Collections.unmodifiableList(updatedFields);
			} else {
				if (!isUnion) {
					handleStructPadding(fields);
				} else {
					handleUnionPadding(fields);
				}
					
				this.fields = Collections.unmodifiableList(fields);
			}

			if (reportPlatformSpecificity) {
				this.fields.stream()
						.filter(NativeType.class::isInstance)
						.map(NativeType.class::cast)
						.filter(NativeType::isPlatformSpecific)
						.forEach(field -> {
							System.out.println(
									"Struct (" + name + ") field is platform specific: " + field.toString()
							);
						});
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

	private void handleStructPadding(List<NativeField> fields) {
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

	/// The size of an union is rounded up to a multiple of its alignment in C,
	/// so it can actually be larger than its largest member.
	/// 
	/// As a union layout is only as large as its largest member in the FFM API
	/// one padding field with the full size of the union is added to avoid
	/// a memory mismatch.
	private void handleUnionPadding(List<NativeField> fields) {
		long maxFieldSize = fields.stream().mapToLong(NativeField::getSize).max().getAsLong();

		if (size > maxFieldSize) {
			fields.add(new PaddingField(size));
		}
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

			try (Arena arena = Arena.ofConfined()) {
				CXType cursorType = ClangIndex.clang_getCursorType(arena, cursor);

				this.name = ParsingUtils.getCursorSpelling(cursor);

				this.offset = ClangIndex.clang_Cursor_getOffsetOfField(cursor) / 8; // Method returns offset in bits.
																					// Must be converted to bytes.
				this.size = ClangIndex.clang_Type_getSizeOf(cursorType);
				this.alignment = ClangIndex.clang_Type_getAlignOf(cursorType);

				CXString rawCommentText = ClangIndex.clang_Cursor_getRawCommentText(arena, cursor);
				this.comment = ParsingUtils.getCommentText(rawCommentText);
				ClangIndex.clang_disposeString(rawCommentText);
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

	/// This class represents a field that is an inlined function pointer.
	public static class FunctionPointerField extends RecordField {

		private final NativeFunctionPointer functionPointer;

		public FunctionPointerField(
				CXCursor functionPointerCursor,
				CXType functionPointerType,
				String functionPointerName,
				boolean reportPlatformSpecificity
		) {
			super(functionPointerCursor);

			this.functionPointer = new NativeFunctionPointer(
					functionPointerName,
					functionPointerType,
					functionPointerCursor,
					reportPlatformSpecificity
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
