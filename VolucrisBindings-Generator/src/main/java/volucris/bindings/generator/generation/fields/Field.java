package volucris.bindings.generator.generation.fields;

import java.util.List;

import org.jspecify.annotations.Nullable;
import volucris.bindings.generator.generation.Modifier;

public abstract class Field {

	private final List<Modifier> modifiers;

	private final String name;

	private boolean blankLineBefore;
	private boolean blankLineAfter;

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

	public void setBlankLineBefore(boolean value) {
		blankLineBefore = value;
	}

	public boolean getBlankLineBefore() {
		return blankLineBefore;
	}

	public void setBlankLineAfter(boolean value) {
		blankLineAfter = value;
	}

	public boolean getBlankLineAfter() {
		return blankLineAfter;
	}

}
