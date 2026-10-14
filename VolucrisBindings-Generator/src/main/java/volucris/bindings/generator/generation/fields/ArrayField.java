package volucris.bindings.generator.generation.fields;

import java.util.List;

import volucris.bindings.generator.generation.Modifier;

public class ArrayField extends Field {

	private final String type;
	
	private final String elementType;
	
	public ArrayField(String name, String elementType, int depth, Modifier... modifiers) {
		super(name, modifiers);
		
		if (depth < 1)
			throw new RuntimeException("An array needs at least a depth of 1.");
		
		this.elementType = elementType;
		this.type = elementType + "[]".repeat(depth);
	}

	@Override
	public String getType() {
		return type;
	}

	public String getElementType() {
		return elementType;
	}
	
	@Override
	public List<String> getRequiredImports() {
		return List.of();
	}

	@Override
	public FieldCategory getFieldCategory() {
		return FieldCategory.OTHER_FIELD;
	}
	
}
