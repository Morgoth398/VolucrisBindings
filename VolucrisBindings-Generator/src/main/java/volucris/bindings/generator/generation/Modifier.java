package volucris.bindings.generator.generation;

public enum Modifier {
	PUBLIC("public"), STATIC("static"), FINAL("final"), SEALED("sealed"), PRIVATE("private"), ABSTRACT("abstract");
	
	private String string;
	
	Modifier(String string) {
		this.string = string;
	}
	
	@Override
	public String toString() {
		return string;
	}
}
