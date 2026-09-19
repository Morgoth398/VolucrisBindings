# StbImage
```Java
	public static void main(String[] args) {
		
		StbLoader.loadStbImageNativeLibrary();

		try (Arena arena = Arena.ofConfined()) {
			NativeIntArray x = new NativeIntArray(arena, 1);
			NativeIntArray y = new NativeIntArray(arena, 1);
			NativeIntArray channelsInFile = new NativeIntArray(arena, 1);
			
			/// From the StbImage documentation:
			/// 
			/// >The number of components N is 'desired_channels' if desired_channels is
			/// non-zero, or channels_in_file otherwise. If desired_channels is non-zero,
			/// channels_in_file has the number of components that would have been output
			/// otherwise.
			int desiredChannels = 4;
			
			/// Load the image directly from the file system.
			/// 
			/// Use `StbImage.stbi_load_from_memory` to load the image from memory.
			NativeByteArray pixels = StbImage.stbi_load("some/valid/image/path", x, y, channelsInFile, desiredChannels);
			
			/// Check if image loading failed
			if (pixels == null) {
				System.err.println(StbImage.stbi_failure_reason());
				throw new RuntimeException("Image loading failed.");
			}
			
			/// Do something with the pixels
			
			/// Free the memory
			StbImage.stbi_image_free(pixels.memorySegment());
		}
	}
```

# StbImageWrite
```Java
public static void main(String[] args) {

	StbLoader.loadStbImageWriteNativeLibrary();

	try (Arena arena = Arena.ofConfined()) {
		int width = 500;
		int height = 500;

		int channels = 4;

		NativeByteArray pixels = new NativeByteArray(arena, width * height * channels);

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {

				float u = (float) x / (width - 1);
				float v = (float) y / (height - 1);

				// Four corner colors
				float[] topLeft = { 1.0f, 0.0f, 0.0f }; // Red
				float[] topRight = { 0.5f, 0.0f, 1.0f }; // Purple
				float[] bottomLeft = { 1.0f, 0.5f, 0.0f }; // Orange
				float[] bottomRight = { 0.0f, 0.3f, 1.0f }; // Blue

				// Bilinear interpolation
				float r = topLeft[0] * (1 - u) * (1 - v) +
						topRight[0] * u * (1 - v) +
						bottomLeft[0] * (1 - u) * v +
						bottomRight[0] * u * v;

				float g = topLeft[1] * (1 - u) * (1 - v) +
						topRight[1] * u * (1 - v) +
						bottomLeft[1] * (1 - u) * v +
						bottomRight[1] * u * v;

				float b = topLeft[2] * (1 - u) * (1 - v) +
						topRight[2] * u * (1 - v) +
						bottomLeft[2] * (1 - u) * v +
						bottomRight[2] * u * v;

				int i = (y * width + x) * channels;

				// Convert 0.0-1.0 floats directly to 0-255 bytes
				pixels.set(i + 0, (byte) (r * 255.0f));
				pixels.set(i + 1, (byte) (g * 255.0f));
				pixels.set(i + 2, (byte) (b * 255.0f));
				pixels.set(i + 3, (byte) 255);
			}
		}

		int errorCode = StbImageWrite.stbi_write_png(
				"StbImageWrite.png", width, width, channels, pixels.memorySegment(), 0
		);

		if (errorCode == 0)
			throw new RuntimeException("Failed to write png image");

	}
}
```