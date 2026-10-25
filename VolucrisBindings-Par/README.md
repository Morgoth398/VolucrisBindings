# ParShapes
```Java
public static void main(String[] args) {
	
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
		
		// Do something with the data
	}
	
}
```

# ParOctasphere
```Java
public static void main(String[] args) {

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
		
		// Do something with the data
	}
}
```