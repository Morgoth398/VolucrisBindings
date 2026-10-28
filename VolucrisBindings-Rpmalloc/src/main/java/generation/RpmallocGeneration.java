package generation;

import java.util.HashMap;
import java.util.Map;

import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;
import volucris.bindings.generator.parsing.NativeFunctionPointer;

public class RpmallocGeneration {

	public static void main(String[] args) {
		
		HeaderFile headerFile = new HeaderFile("src/main/resources/nativeSources/rpmalloc/rpmalloc.h");
		
		Generator generator = new Generator("src/main/resources/configs/globalConfig.yaml", headerFile);
		
		generator.generate("src/main/resources/configs/Rpmalloc.yaml");
		
		generator.generate("src/main/resources/configs/RpmallocGlobalStatistics.yaml");
		generator.generate("src/main/resources/configs/RpmallocThreadStatistics.yaml");
		generator.generate("src/main/resources/configs/RpmallocInterface.yaml");
		generator.generate("src/main/resources/configs/RpmallocConfig.yaml");
		
		Map<String, NativeFunctionPointer> functionPointers = new HashMap<>();
		headerFile.getRecord("rpmalloc_interface_t").getFunctionPointerFields().forEach(field -> {
			NativeFunctionPointer functionPointer = field.getFunctionPointer();
			functionPointers.put(functionPointer.getName(), functionPointer);
		});
		
		generator.generateCallbacks("src/main/resources/configs/callbacks.yaml", functionPointers);
	}

}
