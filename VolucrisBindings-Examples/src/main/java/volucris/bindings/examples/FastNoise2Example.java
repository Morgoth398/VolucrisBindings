package volucris.bindings.examples;

import java.lang.foreign.Arena;
import java.util.Locale;

import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.fastNoise2.FastNoise2;
import volucris.bindings.fastNoise2.FastNoise2Loader;
import volucris.bindings.fastNoise2.FastNoise2Node;
import volucris.bindings.fastNoise2.metadata.Perlin;

public class FastNoise2Example implements Runnable {

	public FastNoise2Example() {
		
	}
	
	@Override
	public void run() {
		
		FastNoise2Loader.loadNativeLibrary();

		try (Arena arena = Arena.ofConfined()) {
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
	
}
