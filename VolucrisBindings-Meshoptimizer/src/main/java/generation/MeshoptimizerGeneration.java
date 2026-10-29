package generation;

import java.util.HashMap;
import java.util.Map;

import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.FunctionPointerParameter;
import volucris.bindings.generator.parsing.HeaderFile;
import volucris.bindings.generator.parsing.NativeFunctionPointer;

public class MeshoptimizerGeneration {

	public static void main(String[] args) {
		
		HeaderFile headerFile = new HeaderFile("src/main/resources/nativeSources/meshoptimizer-1.3/src/meshoptimizer.h");
		
		Generator generator = new Generator("src/main/resources/configs/globalConfig.yaml", headerFile);
		
		generator.generate("src/main/resources/configs/Meshoptimizer.yaml");
		
		generator.generate("src/main/resources/configs/MeshoptBounds.yaml");
		generator.generate("src/main/resources/configs/MeshoptCoverageStatistics.yaml");
		generator.generate("src/main/resources/configs/MeshoptMeshlet.yaml");
		generator.generate("src/main/resources/configs/MeshoptOverdrawStatistics.yaml");
		generator.generate("src/main/resources/configs/MeshoptStream.yaml");
		generator.generate("src/main/resources/configs/MeshoptVertexCacheStatistics.yaml");
		generator.generate("src/main/resources/configs/MeshoptVertexFetchStatistics.yaml");
		
		generator.generateEnums("src/main/resources/configs/enumsConfigs.yaml");
		
		Map<String, NativeFunctionPointer> functionPointers = new HashMap<>();
		headerFile.getFunction("meshopt_generateVertexRemapCustom").getParameters().forEach(parameter -> {
			if (parameter instanceof FunctionPointerParameter functionPointerParameter) {
				NativeFunctionPointer functionPointer = functionPointerParameter.getFunctionPointer();
				
				functionPointers.put(functionPointer.getName(), functionPointer);
			}
		});
		headerFile.getFunction("meshopt_setAllocator").getParameters().forEach(parameter -> {
			if (parameter instanceof FunctionPointerParameter functionPointerParameter) {
				NativeFunctionPointer functionPointer = functionPointerParameter.getFunctionPointer();
				
				functionPointers.put(functionPointer.getName(), functionPointer);
			}
		});
		
		generator.generateCallbacks("src/main/resources/configs/callbacks.yaml", functionPointers);
	}

}
