# Meshoptimizer
```Java
public static void main(String[] args)  {

	MeshoptimizerLoader.loadNativeLibrary();

	try (Arena arena = Arena.ofConfined()) {
		float[] vertices = ...; // This example assumes that one vertex has only a position (x, y, z)
		int[] indices = ...;
		
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
```