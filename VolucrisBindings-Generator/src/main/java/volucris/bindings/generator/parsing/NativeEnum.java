package volucris.bindings.generator.parsing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.lwjgl.llvm.CXCursor;
import org.lwjgl.llvm.CXCursorVisitor;
import org.lwjgl.llvm.CXString;
import org.lwjgl.llvm.ClangIndex;
import org.lwjgl.system.MemoryStack;

public class NativeEnum {

	private final String name;
	private final String comment;

	private final List<NativeEnumConstant> constants;

	public NativeEnum(CXCursor cursor, String name) {
		this.name = name;

		try (MemoryStack stack = MemoryStack.stackPush()) {
			CXString cxString = CXString.calloc(stack);
			ClangIndex.clang_Cursor_getRawCommentText(cursor, cxString);
			comment = ParsingUtils.getCommentText(cxString);
		}

		List<NativeEnumConstant> constants = new ArrayList<NativeEnumConstant>();

		CXCursorVisitor visitor = new CXCursorVisitor() {
			@Override
			public int invoke(CXCursor cursor, CXCursor parent, long client_data) {
				int cursorKind = ClangIndex.clang_getCursorKind(cursor);
				if (cursorKind == ClangIndex.CXCursor_EnumConstantDecl) {
					NativeEnumConstant constant = new NativeEnumConstant(cursor);
					constants.add(constant);

					if (constant.isPlatformSpecific())
						System.out.println("Enum (" + name + ") constant is platform specific: " + constant);
				}

				return ClangIndex.CXChildVisit_Continue;
			}
		};

		ClangIndex.clang_visitChildren(cursor, visitor, 0);

		visitor.free();

		this.constants = Collections.unmodifiableList(constants);
		
		/// Works around a libclang bug where an enumerator without its own doc
		/// comment inherits the comment of the closest preceding enumerator.
		///
		/// Since the first enumerator after a comment is always its real owner,
		/// any following enumerator that reports the same comment is cleared.
		///
		/// Limitation: comments are compared by text, so two enumerators with
		/// identical, separately written comments are wrongly treated as duplicates.
		@Nullable String lastComment = null;
		
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
		return constants;
	}

	public static class NativeEnumConstant extends NativeType {

		private String name;
		private @Nullable String comment;

		private int value;

		public NativeEnumConstant(CXCursor cursor) {
			super(cursor);

			try (MemoryStack stack = MemoryStack.stackPush()) {
				CXString cxString = CXString.calloc(stack);

				ClangIndex.clang_getCursorSpelling(cursor, cxString);
				name = ClangIndex.clang_getCString(cxString);

				ClangIndex.clang_Cursor_getRawCommentText(cursor, cxString);
				comment = ParsingUtils.getCommentText(cxString);
			}

			value = (int) ClangIndex.clang_getEnumConstantDeclValue(cursor);
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
