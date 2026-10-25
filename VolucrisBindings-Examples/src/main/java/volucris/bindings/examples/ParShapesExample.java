package volucris.bindings.examples;

import java.lang.foreign.Arena;

import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.par.ParLoader;
import volucris.bindings.par.ParShapes;
import volucris.bindings.par.ParShapesMesh;

public class ParShapesExample implements Runnable {

	public ParShapesExample() {
		
	}
	
	@SuppressWarnings("unused")
	@Override
	public void run() {
		
		ParLoader.loadNativeLibrary();
		
		try (Arena arena = Arena.ofConfined()) {
			ParShapesMesh parMesh = ParShapes.create_octahedron();
			
			NativeFloatArray rotationAxis = new NativeFloatArray(arena, 3);
			rotationAxis.set(0, 1);
			rotationAxis.set(1, 0);
			rotationAxis.set(2, 0);
			
			ParShapes.scale(parMesh, 5, 5, 5);
			ParShapes.rotate(parMesh, (float) Math.toRadians(50), rotationAxis);
			ParShapes.translate(parMesh, 10, 10, 10);
			
			NativeFloatArray positions = parMesh.points();
			NativeFloatArray normals = parMesh.normals();
			NativeFloatArray texCoords = parMesh.tcoords();
			
			NativeIntArray indices = parMesh.triangles();
			
			int vertexCount = parMesh.npoints();
			int indexCount = parMesh.ntriangles() * 3; // Each triangle has 3 indices
			
			System.out.println("Vertex Count: " + vertexCount);
			System.out.println("Index Count: " + indexCount);
		}
		
	}

}
