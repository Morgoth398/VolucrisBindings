package volucris.bindings.generator.parsing;

public class NativeVariable {

	private final String name;
	
	public NativeVariable(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Variable: " + name;
	}
	
	public String getName() {
		return name;
	}
	
}
