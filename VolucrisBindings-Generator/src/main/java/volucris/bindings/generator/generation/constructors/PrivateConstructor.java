package volucris.bindings.generator.generation.constructors;

import java.util.List;

public class PrivateConstructor extends Constructor {

	public PrivateConstructor(String className) {
		String source = 
				"""
				private %s() {
				}
				""".formatted(className);
		super(source, List.of());
	}
	
}
