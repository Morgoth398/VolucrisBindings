package volucris.bindings.generator.parsing;

import volucris.bindings.libclang.structs.CXCursor;
import volucris.bindings.libclang.structs.CXType;

/// This class represents a parameter that is an inlined function pointer.
public class FunctionPointerParameter extends NativeParameter {

	private final NativeFunctionPointer functionPointer;

	public FunctionPointerParameter(
			CXCursor functionPointerCursor,
			CXType functionPointerType,
			String functionPointerName,
			String parameterName,
			boolean reportPlatformSpecificity
	) {
		super(functionPointerCursor, parameterName);

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
