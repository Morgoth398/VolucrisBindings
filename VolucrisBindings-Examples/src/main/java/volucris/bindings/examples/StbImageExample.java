package volucris.bindings.examples;

import java.lang.foreign.Arena;

import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.stb.StbLoader;
import volucris.bindings.stb.image.StbImage;

public class StbImageExample implements Runnable {

	private final byte[] image;

	public StbImageExample() {
		image = new byte[] {
				-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82,
				0, 0, 0, 16, 0, 0, 0, 16, 8, 6, 0, 0, 0, 31, -13, -1,
				97, 0, 0, 0, 7, 116, 73, 77, 69, 7, -24, 9, 23, 11, 8, 15,
				-94, 46, 70, 96, 0, 0, 0, 23, 116, 69, 88, 116, 83, 111, 102, 116,
				119, 97, 114, 101, 0, 71, 76, 68, 80, 78, 71, 32, 118, 101, 114, 32,
				51, 46, 52, 113, -123, -92, -31, 0, 0, 0, 8, 116, 112, 78, 71, 71,
				76, 68, 51, 0, 0, 0, 0, 74, -128, 41, 31, 0, 0, 0, 4, 103,
				65, 77, 65, 0, 0, -79, -113, 11, -4, 97, 5, 0, 0, 0, 6, 98,
				75, 71, 68, 0, -1, 0, -1, 0, -1, -96, -67, -89, -109, 0, 0, 0,
				-97, 73, 68, 65, 84, 120, -100, -115, -110, -53, 9, 0, 33, 12, 68, 83,
				-82, 5, 120, -73, 4, 75, 118, 113, 97, 100, 124, 27, 101, 15, 65, 9,
				102, 126, 38, 122, -17, -61, -85, -75, 54, 106, -83, 111, -23, 94, 74, -39,
				122, 94, -95, -117, 15, -16, -111, 106, 2, 9, 76, 111, -61, 89, -100, -119,
				-52, 39, -32, -91, -64, 45, -24, 100, -33, -43, -86, -62, -111, -55, -90, -109,
				57, -7, 76, -112, 49, 43, 90, -46, 57, -25, 54, 5, 100, -15, -5, -15,
				23, 28, -99, 12, 55, 123, 11, -128, 59, -112, 5, 120, -78, -72, -66, 49,
				-53, 33, 27, -50, -106, 46, -90, 92, 46, 18, 45, 113, -63, -74, 111, -52,
				-92, -35, 100, -45, 110, 16, -47, -19, 48, -76, 44, -24, 112, -60, 63, -55,
				123, -17, -93, -32, -74, 76, -89, 32, -45, 12, 8, -54, 76, -100, -20, 1,
				121, -28, 119, -61, 59, -44, 120, 30, 0, 0, 0, 0, 73, 69, 78, 68,
				-82, 66, 96, -126
		};
	}

	@Override
	public void run() {

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

			NativeByteArray pixels = StbImage.stbi_load_from_memory(
					new NativeByteArray(arena, image), image.length, x, y, channelsInFile, desiredChannels
			);

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

}
