# FastNoise2
```Java
public static void main(String[] args) {

	FastNoise2Loader.loadNativeLibrary();

	try (Arena arena = Arena.ofConfined()) {
		// Helper class for handling nodes. Of course you can use the bindings without this helper class.
		//
		// This node was created with the `Perlin` metadata.
		//
		// That means all the methods in `FastNoise2Node` only accept the variables 
		// specified in the perlin class. At the moment of writing these are:
		// - Perlin.FEATURE_SCALE
		// - Perlin.SEED_OFFSET
		// - Perlin.OUTPUT_MIN
		// - Perlin.OUTPUT_MAX
		FastNoise2Node node = new FastNoise2Node(arena, new Perlin());
		node.setFloat(Perlin.FEATURE_SCALE, 15);

		NativeFloatArray noiseOut = new NativeFloatArray(arena, 100 * 100);
		NativeFloatArray outputMinMax = new NativeFloatArray(arena, 2);

		FastNoise2.genUniformGrid2D(node.getNode(), noiseOut, 0, 0, 100, 100, 1, 1, 10, outputMinMax);

		for (int x = 0; x < 100; x++) {
			for (int y = 0; y < 100; y++) {
				float noise = noiseOut.get(y * 100 + x);

				System.out.print(String.format(Locale.ENGLISH, "%7.4f", noise) + " ");
			}
			System.out.println();
		}

		System.out.println("Min: " + outputMinMax.get(0) + ", Max: " + outputMinMax.get(1));
	}

}
```