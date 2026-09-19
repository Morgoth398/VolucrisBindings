package generation;

import java.util.HashMap;

import volucris.bindings.generator.parsing.NativeFunctionPointer;
import volucris.bindings.generator.parsing.NativeRecord;
import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;

public class StbImageGeneration {

	public static void main(String[] args) {
		
		HeaderFile headerFile = new HeaderFile("src/main/resources/nativeSources/stbImage-2.30/stb_image.h"); 
		
		Generator generator = new Generator("src/main/resources/configs/stbImage/globalConfig.yaml", headerFile);
		
		generator.generate("src/main/resources/configs/stbImage/StbImage.yaml");
		generator.generate("src/main/resources/configs/stbImage/StbImageIoCallbacks.yaml");
		
		NativeRecord record = headerFile.getRecord("stbi_io_callbacks");
		
		HashMap<String, NativeFunctionPointer> additionalFunctionsPointers = new HashMap<>();
		record.getFunctionPointerFields().forEach(functionPointerField -> {
			NativeFunctionPointer functionPointer = functionPointerField.getFunctionPointer();
			additionalFunctionsPointers.put(functionPointer.getName(), functionPointer);
		});
		
		generator.generateCallbacks("src/main/resources/configs/stbImage/callbacks.yaml", additionalFunctionsPointers);
	}
	
}
