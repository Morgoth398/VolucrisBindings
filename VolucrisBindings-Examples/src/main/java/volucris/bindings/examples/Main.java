package volucris.bindings.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		List<Example> examples = List.of(
				new Example("Assimp", new AssimpExample()),
				new Example("FastNoise2", new FastNoise2Example()),
				new Example("Miniaudio", new MiniaudioExample()),
				new Example("Msdfgen", new MsdfgenExample()),
				new Example("GLFW", new GLFWExample()),
				new Example("ParShapes", new ParShapesExample()),
				new Example("ParOctasphere", new ParOctasphereExample()),
				new Example("StbImageWrite", new StbImageWriteExample()),
				new Example("StbImage", new StbImageExample()),
				new Example("StbVorbis", new StbVorbisExample()),
				new Example("Yoga", new YogaExample()),
				new Example("Mimalloc", new MimallocExample()),
				new Example("Rpmalloc", new RpmallocExample())
		);

	    Set<String> excluded = new HashSet<>();
	    for (String arg : args) {
	        if (arg.startsWith("--exclude=")) {
	            for (String name : arg.substring("--exclude=".length()).split(",")) {
	                excluded.add(name.trim().toLowerCase());
	            }
	        }
	    }

	    List<Example> examplesToRun = examples.stream()
	            .filter(e -> !excluded.contains(e.name().toLowerCase()))
	            .toList();
		
		List<FailedExample> failedExamples = new ArrayList<>();
		
		for (Example example : examplesToRun) {
			try {
				example.runnable().run();
			} catch (Exception e) {
				failedExamples.add(new FailedExample(example.name(), e));
			}
		}
		
		if (!failedExamples.isEmpty()) {
			failedExamples.forEach(failedExample -> {
				System.err.println("Example " + failedExample.name() + " failed.");
				failedExample.exception().printStackTrace();
				System.out.println("--------------------------");
			});
			
			throw new RuntimeException("At least one example failed.");
		}
	}

	private static record Example(String name, Runnable runnable) {
		
	}
	
	private static record FailedExample(String name, Exception exception) {
		
	}
	
}
