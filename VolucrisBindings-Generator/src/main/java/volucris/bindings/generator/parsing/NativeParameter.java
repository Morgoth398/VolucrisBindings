package volucris.bindings.generator.parsing;

import org.lwjgl.llvm.CXCursor;
import org.lwjgl.llvm.CXType;

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