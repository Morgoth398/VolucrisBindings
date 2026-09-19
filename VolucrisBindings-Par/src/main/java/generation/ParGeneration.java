package generation;

import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;

public class ParGeneration {

	public static void main(String[] args) {
		
		HeaderFile parShapesHeader = new HeaderFile("src/main/resources/nativeSources/par_shapes.h", "-fparse-all-comments");

		Generator parShapesGenerator = new Generator("src/main/resources/configs/globalConfig.yaml", parShapesHeader);
		parShapesGenerator.generate("src/main/resources/configs/ParShapes.yaml");
		parShapesGenerator.generate("src/main/resources/configs/ParShapesMesh.yaml");
		parShapesGenerator.generateCallbacks("src/main/resources/configs/callbacksConfig.yaml", null);
		
		HeaderFile parOctasphereHeader = new HeaderFile("src/main/resources/nativeSources/par_octasphere.h", "-fparse-all-comments");
		
		Generator parOctasphereGenerator = new Generator("src/main/resources/configs/globalConfig.yaml", parOctasphereHeader);
		parOctasphereGenerator.generate("src/main/resources/configs/ParOctasphere.yaml");
		parOctasphereGenerator.generate("src/main/resources/configs/ParOctasphereConfig.yaml");
		parOctasphereGenerator.generate("src/main/resources/configs/ParOctasphereMesh.yaml");
		
	}

}
