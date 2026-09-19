package volucris.bindings.fastNoise2;

public class Metadata {

	private final String name;

	private final int id;

	public Metadata(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
}
