package volucris.bindings.generator.generation.fields;

import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.List;

import volucris.bindings.generator.generation.Modifier;

public class SymbolField extends Field {

	private final String type;
	
	private final List<String> requiredImports;
	
	public SymbolField(String name, String type) {
		requiredImports = new ArrayList<String>();
		
		name = name.replaceAll("([\\p{Ll}\\p{Nd}])(\\p{Lu})", "$1_$2").toUpperCase();
		super(name, Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL);
		
		if (type.equals("int")) {
			this.type = "Integer";
		} else if (type.equals("long")) {
			this.type = "Long";
		} else if (type.equals("float")) {
			this.type = "Float";
		} else if (type.equals("double")) {
			this.type = "Double";
		} else if (type.equals("String")) {
			this.type = "String";
		} else if (type.equals("MemorySegment")) {
			this.type = "MemorySegment";
			requiredImports.add(MemorySegment.class.getCanonicalName());
		} else if (type.contains("boolean")) {
			this.type = "Boolean";
		} else {
			throw new RuntimeException("Invalid symbol type.");
		}
	}

	@Override
	public String getType() {
		return "LazyConstant<" + type + ">";
	}
	
	@Override
	public List<String> getRequiredImports() {
		return requiredImports;
	}
	
	
}
