package volucris.bindings.generator.parsing;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jspecify.annotations.Nullable;

import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.libclang.CXFieldVisitor;
import volucris.bindings.libclang.ClangIndex;
import volucris.bindings.libclang.enums.CXCursorKind;
import volucris.bindings.libclang.enums.CXVisitorResult;
import volucris.bindings.libclang.structs.CXCursor;
import volucris.bindings.libclang.structs.CXSourceLocation;
import volucris.bindings.libclang.structs.CXString;
import volucris.bindings.libclang.structs.CXType;

public class NativeRecord {

	private final List<NativeMember> members;

	private final String name;
	private final String comment;

	private final boolean isUnion;

	private final long alignment;
	private final long size;

	public NativeRecord(String name, CXCursor recordCursor, boolean reportPlatformSpecificity) {
		this.name = name;
		this.isUnion = ClangIndex.clang_getCursorKind(recordCursor) == CXCursorKind.CX_CURSOR_UNION_DECL;

		List<NativeMember> members = new ArrayList<NativeMember>();

		try (Arena arena = Arena.ofConfined()) {
			CXString rawCommentText = ClangIndex.clang_Cursor_getRawCommentText(arena, recordCursor);
			comment = ParsingUtils.getCommentText(rawCommentText);
			ClangIndex.clang_disposeString(rawCommentText);

			CXFieldVisitor visitor = new CXFieldVisitor(arena) {
				@Override
				public int invoke(CXCursor cursor, MemorySegment client_data) {
					int cursorKind = ClangIndex.clang_getCursorKind(cursor);

					if (cursorKind == CXCursorKind.CX_CURSOR_FIELD_DECL) {
						CXCursor cursorResult = new CXCursor(arena);
						CXType typeResult = new CXType(arena);

						if (ClangIndex.clang_Cursor_isBitField(cursor) != 0) {
							members.add(new BitField(cursor));
						} else if (ParsingUtils.isFunctionPointer(cursor, cursorResult, typeResult)) {
							if (ParsingUtils.isFunctionPointerInlined(cursorResult)) {
								members.add(
										new FunctionPointerField(
												cursorResult,
												typeResult,
												ParsingUtils.getFunctionPointerName(cursorResult, name),
												reportPlatformSpecificity
										)
								);
							} else {
								members.add(new NativeField(cursor));
							}
						} else if (ParsingUtils.isUnnamedRecordField(cursor, cursorResult)) {
							members.add(
									new UnnamedRecordField(cursor, cursorResult, reportPlatformSpecificity)
							);
						} else if (ParsingUtils.isAnonymousRecordField(cursor, cursorResult)) {
							members.add(
									new AnonymousRecord(
											cursor,
											cursorResult,
											reportPlatformSpecificity
									)
							);
						} else {
							members.add(new NativeField(cursor));
						}
					}

					return CXVisitorResult.CX_VISIT_CONTINUE;
				}
			};

			ClangIndex.clang_Type_visitFields(
					ClangIndex.clang_getCursorType(arena, recordCursor),
					visitor,
					MemorySegment.NULL
			);

			CXType cursorType = ClangIndex.clang_getCursorType(arena, recordCursor);

			this.size = ClangIndex.clang_Type_getSizeOf(cursorType);
			this.alignment = ClangIndex.clang_Type_getAlignOf(cursorType);

			if (members.size() == 0) {
				this.members = List.of();
				return;
			}

			boolean containsBitFields = members.stream().filter(BitField.class::isInstance).count() > 0;

			if (containsBitFields) {
				List<NativeMember> updatedFields = handleBitFields(members);

				if (!isUnion) {
					handleStructPadding(updatedFields);
				} else {
					handleUnionPadding(updatedFields);
				}

				this.members = Collections.unmodifiableList(updatedFields);
			} else {
				if (!isUnion) {
					handleStructPadding(members);
				} else {
					handleUnionPadding(members);
				}

				this.members = Collections.unmodifiableList(members);
			}

			if (reportPlatformSpecificity) {
				this.members.stream()
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

	private List<NativeMember> handleBitFields(List<NativeMember> members) {
		List<NativeMember> updatedFields = new ArrayList<NativeMember>(members.size());

		List<BitField> bitFieldGroup = new ArrayList<BitField>();

		int bitFieldIndex = 0;

		for (int i = 0; i < members.size(); i++) {
			NativeMember member = members.get(i);

			if (member instanceof BitField bitField) {
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

				updatedFields.add(member);
			}
		}

		if (!bitFieldGroup.isEmpty()) {
			updatedFields.add(getBitFieldGroupField(bitFieldGroup, bitFieldIndex++));
			bitFieldGroup.clear();
		}

		return updatedFields;
	}

	private NativeField getBitFieldGroupField(List<BitField> bitFieldGroup, int bitFieldIndex) {
		NativeField field = new NativeField(bitFieldGroup.getFirst(), "bitFields" + bitFieldIndex);

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

	private void handleStructPadding(List<NativeMember> members) {
		if (members.stream().anyMatch(Padding.class::isInstance))
			throw new RuntimeException("No padding memebers should be present at this point.");

		for (int i = 0; i < members.size() - 1; i++) {
			NativeMember currentField = members.get(i);
			NativeMember nextField = members.get(i + 1);

			long padding = nextField.getOffset() - (currentField.getOffset() + currentField.getSize());

			if (padding > 0) {
				members.add(i + 1, new Padding(padding, currentField.getOffset() + currentField.getSize()));
				i += 1;
			}
		}

		NativeMember lastField = members.getLast();

		long padding = size - (lastField.getOffset() + lastField.getSize());

		if (padding > 0)
			members.add(new Padding(padding, lastField.getOffset() + lastField.getSize()));
	}

	/// The size of an union is rounded up to a multiple of its alignment in C,
	/// so it can actually be larger than its largest member.
	/// 
	/// As a union layout is only as large as its largest member in the FFM API
	/// one padding field with the full size of the union is added to avoid
	/// a memory mismatch.
	private void handleUnionPadding(List<NativeMember> members) {
		if (members.stream().anyMatch(Padding.class::isInstance))
			throw new RuntimeException("No padding memebers should be present at this point.");

		long maxFieldSize = members.stream().mapToLong(NativeMember::getSize).max().getAsLong();

		if (size > maxFieldSize) {
			members.add(new Padding(size, 0));
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
		members.forEach(field -> stringBuilder.append(field).append(", "));
		return stringBuilder.toString();
	}

	public int getMembersCount() {
		return members.size();
	}

	public List<NativeMember> getMembers() {
		return members;
	}

	public int getFunctionPointerFieldsCount() {
		return (int) members.stream()
				.filter(FunctionPointerField.class::isInstance)
				.count();
	}

	public List<FunctionPointerField> getFunctionPointerFields() {
		return members.stream()
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

	/// Anything occupying space in a record.
	public static sealed interface NativeMember permits Padding, AnonymousRecord, NamedNativeMember {
		long getSize();

		long getOffset();
	}

	/// A [NativeMember] that has a name.
	public static sealed interface NamedNativeMember extends NativeMember permits NativeField {
		String getName();

		@Nullable
		String getComment();

		long getAlignment();
	}

	public static final class Padding implements NativeMember {

		private final long size;
		private final long offset;

		public Padding(long size, long offset) {
			this.size = size;
			this.offset = offset;
		}

		@Override
		public String toString() {
			return "padding(" + size + ")";
		}

		@Override
		public long getSize() {
			return size;
		}

		@Override
		public long getOffset() {
			return offset;
		}

	}

	/// @see ParsingUtils#isAnonymousRecordField(CXCursor, CXCursor)
	public static final class AnonymousRecord implements NativeMember {

		private final NativeRecord nativeRecord;

		private final String name;

		private final long offset;

		public AnonymousRecord(
				CXCursor fieldCursor, CXCursor anonymousRecordCursor, boolean reportPlatformSpecificity
		) {
			try (Arena arena = Arena.ofConfined()) {
				CXSourceLocation sourceLocation = ClangIndex.clang_getCursorLocation(arena, fieldCursor);

				NativePointerArray file = new NativePointerArray(arena, 1);

				NativeIntArray line = new NativeIntArray(arena, 1);
				NativeIntArray column = new NativeIntArray(arena, 1);
				NativeIntArray offset = new NativeIntArray(arena, 1);

				ClangIndex.clang_getSpellingLocation(sourceLocation, file, line, column, offset);

				this.name = "$anon$" + line.get(0) + ":" + column.get(0);

				this.nativeRecord = new NativeRecord(name, anonymousRecordCursor, reportPlatformSpecificity);

				this.offset = ClangIndex.clang_Cursor_getOffsetOfField(fieldCursor) / 8;
			}
		}

		@Override
		public String toString() {
			return "Anonymous Record( Offset: " + offset + ", " + nativeRecord.toString() + ")";
		}

		/// This return an artificial name for this anonymous record.
		public String getArtificalName() {
			return name;
		}

		@Override
		public long getSize() {
			return nativeRecord.getSize();
		}

		@Override
		public long getOffset() {
			return offset;
		}

		public NativeRecord getNativeRecord() {
			return nativeRecord;
		}

	}

	public static sealed class NativeField extends NativeType implements NamedNativeMember
			permits FunctionPointerField, UnnamedRecordField, BitField {

		private final String name;

		private final long offset;
		private final long size;
		private final long alignment;

		private String comment;

		public NativeField(CXCursor cursor) {
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

		public NativeField(BitField bitField, String name) {
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
	public static final class FunctionPointerField extends NativeField {

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

	/// @see ParsingUtils#isUnnamedRecordField(CXCursor, CXCursor)
	public static final class UnnamedRecordField extends NativeField {

		private final NativeRecord nativeRecord;

		public UnnamedRecordField(
				CXCursor fieldCursor,
				CXCursor unnamedRecordCursor,
				boolean reportPlatformSpecificity
		) {
			super(fieldCursor);

			this.nativeRecord = new NativeRecord(
					Character.toUpperCase(getName().charAt(0)) + getName().substring(1),
					unnamedRecordCursor,
					reportPlatformSpecificity
			);
		}

		public NativeRecord getNativeRecord() {
			return nativeRecord;
		}

		@Override
		public String toString() {
			return super.toString() + ", " + nativeRecord.toString();
		}

	}

	private static final class BitField extends NativeField {

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
