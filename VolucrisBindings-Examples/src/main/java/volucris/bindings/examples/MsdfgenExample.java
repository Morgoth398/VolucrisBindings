package volucris.bindings.examples;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.lang.foreign.Arena;

import javax.imageio.ImageIO;

import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeDoubleArray;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.msdfgen.MsdfBitmap;
import volucris.bindings.msdfgen.MsdfFontScaling;
import volucris.bindings.msdfgen.MsdfFreetype;
import volucris.bindings.msdfgen.MsdfFreetypeFont;
import volucris.bindings.msdfgen.MsdfLoader;
import volucris.bindings.msdfgen.MsdfShape;
import volucris.bindings.msdfgen.MsdfTransform;
import volucris.bindings.msdfgen.Msdfgen;

public class MsdfgenExample implements Runnable {

	private final byte[] font;

	public MsdfgenExample() {
		try (InputStream inputStream = MsdfgenExample.class.getResourceAsStream("/ARIAL.TTF")) {
			font = inputStream.readAllBytes();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void run() {

		MsdfLoader.loadNativeLibrary();

		try (Arena arena = Arena.ofConfined()) {
			NativePointerArray pointerArray = new NativePointerArray(arena, 1);
			NativeDoubleArray advance = new NativeDoubleArray(arena, 1);

			if (Msdfgen.ft_init(pointerArray) != Msdfgen.MSDF_SUCCESS)
				throw new RuntimeException("Failed to initialize msdfgen.");

			MsdfFreetype freetypeHandle = new MsdfFreetype(pointerArray.get(0));

			int result = Msdfgen.ft_load_font_data(
					freetypeHandle, new NativeByteArray(arena, font).memorySegment(), font.length, pointerArray
			);

			if (result != Msdfgen.MSDF_SUCCESS) {
				Msdfgen.ft_deinit(freetypeHandle);
				throw new RuntimeException("Failed to load font.");
			}

			MsdfFreetypeFont freetypeFont = new MsdfFreetypeFont(pointerArray.get(0));

			int errorCode = Msdfgen.ft_font_load_glyph(
					freetypeFont, 'A', MsdfFontScaling.MSDF_FONT_SCALING_EM_NORMALIZED, advance, pointerArray
			);

			if (errorCode != Msdfgen.MSDF_SUCCESS) {
				Msdfgen.ft_font_destroy(freetypeFont);
				Msdfgen.ft_deinit(freetypeHandle);
				throw new RuntimeException("Failed to load glyph.");
			}

			MsdfShape shape = new MsdfShape(pointerArray.get(0));

			Msdfgen.shape_normalize(shape);
			Msdfgen.shape_edge_colors_simple(shape, 3.0);

			MsdfBitmap bitmap = new MsdfBitmap(arena);

			if (Msdfgen.bitmap_alloc(Msdfgen.MSDF_BITMAP_TYPE_MSDF, 32, 32, bitmap) != Msdfgen.MSDF_SUCCESS) {
				Msdfgen.shape_free(shape);
				Msdfgen.ft_font_destroy(freetypeFont);
				Msdfgen.ft_deinit(freetypeHandle);
				throw new RuntimeException("Failed to allocate bitmap.");
			}

			MsdfTransform transform = new MsdfTransform(arena)
					.scale(scale -> scale.x(32).y(32))
					.translation(translation -> translation.x(0.125).y(0.125))
					.distance_mapping(range -> range.lower(-0.5 * 0.125).upper(0.5 * 0.125));

			if (Msdfgen.generate_msdf(bitmap, shape, transform) != Msdfgen.MSDF_SUCCESS) {
				Msdfgen.bitmap_free(bitmap);
				Msdfgen.shape_free(shape);
				Msdfgen.ft_font_destroy(freetypeFont);
				Msdfgen.ft_deinit(freetypeHandle);
				throw new RuntimeException("Failed to generate msdf");
			}

			if (Msdfgen.bitmap_get_pixels(bitmap, pointerArray) != Msdfgen.MSDF_SUCCESS) {
				Msdfgen.bitmap_free(bitmap);
				Msdfgen.shape_free(shape);
				Msdfgen.ft_font_destroy(freetypeFont);
				Msdfgen.ft_deinit(freetypeHandle);
				throw new RuntimeException("Failed to get bitmap pixels.");
			}

			NativeFloatArray pixels = new NativeFloatArray(pointerArray.get(0));

			int width = bitmap.width();
			int height = bitmap.height();

			BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			for (int y = 0; y < height; y++) {
				for (int x = 0; x < width; x++) {
					int p = (y * width + x) * 3;

					int r = Math.max(0, Math.min(255, (int) (pixels.get(p) * 256.0f)));
					int g = Math.max(0, Math.min(255, (int) (pixels.get(p + 1) * 256.0f)));
					int b = Math.max(0, Math.min(255, (int) (pixels.get(p + 2) * 256.0f)));

					image.setRGB(x, y, (r << 16) | (g << 8) | b);
				}
			}

			try {
				ImageIO.write(image, "png", new File("msdf.png"));
			} catch (Exception e) {
				System.err.println("Failed to write image.");
			} finally {
				Msdfgen.bitmap_free(bitmap);
				Msdfgen.shape_free(shape);
				Msdfgen.ft_font_destroy(freetypeFont);
				Msdfgen.ft_deinit(freetypeHandle);
			}
		}

	}

}
