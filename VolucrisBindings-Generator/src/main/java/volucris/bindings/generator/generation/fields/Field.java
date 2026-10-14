package volucris.bindings.generator.generation.fields;

import java.util.List;

import org.jspecify.annotations.Nullable;
import volucris.bindings.generator.generation.Modifier;

public abstract class Field {
	
	private final List<Modifier> modifiers;
	
	private final String name;

	public Field(String name, Modifier... modifiers) {
		this.name = name;
		this.modifiers = List.of(modifiers);
	}

	@Override
	public String toString() {
		return getType() + " " + getName();
	}

	public List<Modifier> getModifiers() {
		return modifiers;
	}

	public String getName() {
		return name;
	}

	public @Nullable String getValue() {
		return null;
	}

	public abstract String getType();

	public abstract List<String> getRequiredImports();
	
	public abstract FieldCategory getFieldCategory();
	
	public List<String> getRequiredStaticImports() {
		return List.of();
	}

}
