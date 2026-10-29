package volucris.bindings.examples;

import java.lang.foreign.Arena;
import java.util.Arrays;

import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.meshoptimizer.Meshoptimizer;
import volucris.bindings.meshoptimizer.MeshoptimizerLoader;

public class MeshoptimizerExample implements Runnable {

	private final float[] vertices;

	private final int[] indices;

	public MeshoptimizerExample() {
		vertices = new float[] {
				// front (+z) tri 1: A B C
				-0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0.5f, 0.5f,
				// left (-x) tri 2: E D H
				-0.5f, -0.5f, -0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, -0.5f,
				// top (+y) tri 1: D C G
				-0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, -0.5f,
				// back (-z) tri 2: F H G
				0.5f, -0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f,
				// bottom (-y) tri 1: E F B
				-0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0.5f,
				// right (+x) tri 2: B G C
				0.5f, -0.5f, 0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0.5f,
				// front (+z) tri 2: A C D
				-0.5f, -0.5f, 0.5f, 0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f,
				// back (-z) tri 1: F E H
				0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0.5f, -0.5f,
				// left (-x) tri 1: E A D
				-0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0.5f, 0.5f,
				// top (+y) tri 2: D G H
				-0.5f, 0.5f, 0.5f, 0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f,
				// bottom (-y) tri 2: E B A
				-0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f,
				// right (+x) tri 1: B F G
				0.5f, -0.5f, 0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, -0.5f,
		};

		indices = new int[] {
				0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
				12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
				24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35,
		};

	}

	@Override
	public void run() {

		MeshoptimizerLoader.loadNativeLibrary();

		try (Arena arena = Arena.ofConfined()) {
			NativeFloatArray vertexBuffer = new NativeFloatArray(arena, vertices);
			NativeIntArray indexBuffer = new NativeIntArray(arena, indices);
			NativeIntArray remapBuffer = new NativeIntArray(arena, indices.length);

			long optimizedVertexCount = Meshoptimizer.meshopt_generateVertexRemap(
					remapBuffer,
					indexBuffer,
					indices.length,
					vertexBuffer.memorySegment(),
					vertices.length / 3,
					3 * Float.BYTES
			);

			NativeFloatArray optimizedVertexBuffer = new NativeFloatArray(arena, (int) optimizedVertexCount * 3);
			NativeIntArray optimizedIndexBuffer = new NativeIntArray(arena, indices.length);

			Meshoptimizer.meshopt_remapIndexBuffer(
					optimizedIndexBuffer,
					indexBuffer,
					indices.length,
					remapBuffer
			);

			Meshoptimizer.meshopt_remapVertexBuffer(
					optimizedVertexBuffer.memorySegment(),
					vertexBuffer.memorySegment(),
					vertices.length / 3,
					3 * Float.BYTES,
					remapBuffer
			);

			Meshoptimizer.meshopt_optimizeVertexCache(
					optimizedIndexBuffer,
					optimizedIndexBuffer,
					indices.length,
					optimizedVertexCount
			);

			Meshoptimizer.meshopt_optimizeOverdraw(
					optimizedIndexBuffer,
					optimizedIndexBuffer,
					indices.length,
					optimizedVertexBuffer,
					optimizedVertexCount,
					3 * Float.BYTES,
					1.05f
			);

			Meshoptimizer.meshopt_optimizeVertexFetch(
					optimizedVertexBuffer.memorySegment(),
					optimizedIndexBuffer,
					indices.length,
					optimizedVertexBuffer.memorySegment(),
					optimizedVertexCount,
					3 * Float.BYTES
			);

			System.out.println("Optimized vertex count: " + optimizedVertexCount);		
			System.out.println(Arrays.toString(optimizedVertexBuffer.toArray()));
			
			System.out.println(Arrays.toString(optimizedIndexBuffer.toArray()));
		}

	}

}
