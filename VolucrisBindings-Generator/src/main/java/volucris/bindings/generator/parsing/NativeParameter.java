package volucris.bindings.generator.parsing;

import volucris.bindings.libclang.structs.CXCursor;
import volucris.bindings.libclang.structs.CXType;

public class NativeParameter extends NativeType {
	
	private final String name;
	
	public NativeParameter(CXCursor cursor, String name) {
		super(cursor);

		this.name = name;	
	}
	
	public NativeParameter(CXType type, String name) {
		super(type);
		
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + "(" +  super.toString() + ")";
	}
	
	public String getName() {
		return name;
	}
	
}