package volucris.bindings.generator.parsing;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jspecify.annotations.Nullable;

import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.libclang.CXCursorVisitor;
import volucris.bindings.libclang.ClangIndex;
import volucris.bindings.libclang.enums.CXCursorKind;
import volucris.bindings.libclang.enums.CXVisitorResult;
import volucris.bindings.libclang.structs.CXCursor;
import volucris.bindings.libclang.structs.CXSourceLocation;
import volucris.bindings.libclang.structs.CXString;

public class NativeEnum {

	private final String name;
	private final String comment;

	private final List<NativeEnumConstant> constants;

	public NativeEnum(String name, CXCursor cursor) {
		this.constants = new ArrayList<NativeEnumConstant>();

		try (Arena arena = Arena.ofConfined()) {
			
			if (ClangIndex.clang_Cursor_isAnonymous(cursor) != 0) {
				CXSourceLocation sourceLocation = ClangIndex.clang_getCursorLocation(arena, cursor);

				NativePointerArray file = new NativePointerArray(arena, 1);

				NativeIntArray line = new NativeIntArray(arena, 1);
				NativeIntArray column = new NativeIntArray(arena, 1);
				NativeIntArray offset = new NativeIntArray(arena, 1);

				ClangIndex.clang_getSpellingLocation(sourceLocation, file, line, column, offset);

				this.name = "$anon$" + line.get(0) + ":" + column.get(0);
			} else {
				this.name = name;
			}
			
			CXString rawCommentText = ClangIndex.clang_Cursor_getRawCommentText(arena, cursor);
			comment = ParsingUtils.getCommentText(rawCommentText);
			ClangIndex.clang_disposeString(rawCommentText);

			CXCursorVisitor visitor = new CXCursorVisitor(arena) {
				@Override
				public int invoke(CXCursor cursor, CXCursor parent, MemorySegment client_data) {
					int cursorKind = ClangIndex.clang_getCursorKind(cursor);

					if (cursorKind == CXCursorKind.CX_CURSOR_ENUM_CONSTANT_DECL) {
						NativeEnumConstant constant = new NativeEnumConstant(cursor);
						constants.add(constant);

						if (constant.isPlatformSpecific())
							System.out.println("Enum (" + name + ") constant is platform specific: " + constant);
					}

					return CXVisitorResult.CX_VISIT_CONTINUE;
				}
			};

			ClangIndex.clang_visitChildren(cursor, visitor, MemorySegment.NULL);
		}

		/// Works around a libclang bug where an enumerator without its own doc
		/// comment inherits the comment of the closest preceding enumerator.
		///
		/// Since the first enumerator after a comment is always its real owner,
		/// any following enumerator that reports the same comment is cleared.
		///
		/// Limitation: comments are compared by text, so two enumerators with
		/// identical, separately written comments are wrongly treated as duplicates.
		@Nullable
		String lastComment = null;

		for (NativeEnumConstant constant : constants) {
			String currentComment = constant.getComment();

			if (currentComment == null)
				continue;

			if (currentComment.equals(lastComment)) {
				constant.comment = null;
			} else {
				lastComment = currentComment;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Enum: ").append(name).append(", Constants: ");
		constants.forEach(constant -> stringBuilder.append(constant).append(", "));
		return stringBuilder.toString();
	}

	public String getName() {
		return name;
	}

	public String getComment() {
		return comment;
	}

	public List<NativeEnumConstant> getConstants() {
		return Collections.unmodifiableList(constants);
	}

	public static class NativeEnumConstant extends NativeType {

		private String name;
		private @Nullable String comment;

		private int value;

		public NativeEnumConstant(CXCursor cursor) {
			super(cursor);

			try (Arena arena = Arena.ofConfined()) {
				name = ParsingUtils.getCursorSpelling(cursor);

				CXString rawCommentText = ClangIndex.clang_Cursor_getRawCommentText(arena, cursor);
				comment = ParsingUtils.getCommentText(rawCommentText);
				ClangIndex.clang_disposeString(rawCommentText);

				value = (int) ClangIndex.clang_getEnumConstantDeclValue(cursor);
			}

		}

		@Override
		public String toString() {
			return name + "(" + super.toString() + "), value: " + value;
		}

		public String getName() {
			return name;
		}

		public @Nullable String getComment() {
			return comment;
		}

		public int getValue() {
			return value;
		}

	}
}
