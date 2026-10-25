package volucris.bindings.examples;

import java.lang.foreign.Arena;

import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeShortArray;
import volucris.bindings.par.ParLoader;
import volucris.bindings.par.ParOctasphere;
import volucris.bindings.par.ParOctasphereConfig;
import volucris.bindings.par.ParOctasphereMesh;

public class ParOctasphereExample implements Runnable {

	public ParOctasphereExample() {
		
	}
	
	@Override
	public void run() {
		
		ParLoader.loadNativeLibrary();

		try (Arena arena = Arena.ofConfined()) {
			ParOctasphereConfig config = new ParOctasphereConfig(arena)
					.num_subdivisions(5)
					.corner_radius(5);
			
			NativeIntArray num_indices = new NativeIntArray(arena, 1);
			NativeIntArray num_vertices = new NativeIntArray(arena, 1);

			ParOctasphere.get_counts(config, num_indices, num_vertices);

			NativeFloatArray positions = new NativeFloatArray(arena, num_vertices.get(0) * 3);
			NativeFloatArray normals = new NativeFloatArray(arena, num_vertices.get(0) * 3);
			NativeFloatArray texCoords = new NativeFloatArray(arena, num_vertices.get(0) * 2);

			NativeShortArray indices = new NativeShortArray(arena, num_indices.get(0));

			ParOctasphereMesh parOctasphereMesh = new ParOctasphereMesh(arena)
					.positions(positions)
					.normals(normals)
					.texcoords(texCoords)
					.indices(indices);

			ParOctasphere.populate(config, parOctasphereMesh);
			
			System.out.println("Vertex Count " + num_vertices.get(0));
			System.out.println("Index Count " + num_indices.get(0));
		}
		
	}

}
