/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.stb.imageWrite;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.MemoryStack;
import volucris.bindings.core.NativeFloatArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class StbImageWrite {

    private static final LazyConstant<MethodHandle> STBI_WRITE_PNG;
    private static final LazyConstant<MethodHandle> STBI_WRITE_BMP;
    private static final LazyConstant<MethodHandle> STBI_WRITE_TGA;
    private static final LazyConstant<MethodHandle> STBI_WRITE_HDR;
    private static final LazyConstant<MethodHandle> STBI_WRITE_JPG;
    private static final LazyConstant<MethodHandle> STBI_WRITE_PNG_TO_FUNC;
    private static final LazyConstant<MethodHandle> STBI_WRITE_BMP_TO_FUNC;
    private static final LazyConstant<MethodHandle> STBI_WRITE_TGA_TO_FUNC;
    private static final LazyConstant<MethodHandle> STBI_WRITE_HDR_TO_FUNC;
    private static final LazyConstant<MethodHandle> STBI_WRITE_JPG_TO_FUNC;
    private static final LazyConstant<MethodHandle> STBI_FLIP_VERTICALLY_ON_WRITE;

    static {
        //@formatter:off
        STBI_WRITE_PNG = downcallHandle("stbi_write_png", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_WRITE_BMP = downcallHandle("stbi_write_bmp", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        STBI_WRITE_TGA = downcallHandle("stbi_write_tga", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        STBI_WRITE_HDR = downcallHandle("stbi_write_hdr", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        STBI_WRITE_JPG = downcallHandle("stbi_write_jpg", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_WRITE_PNG_TO_FUNC = downcallHandle("stbi_write_png_to_func", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_WRITE_BMP_TO_FUNC = downcallHandle("stbi_write_bmp_to_func", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        STBI_WRITE_TGA_TO_FUNC = downcallHandle("stbi_write_tga_to_func", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        STBI_WRITE_HDR_TO_FUNC = downcallHandle("stbi_write_hdr_to_func", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        STBI_WRITE_JPG_TO_FUNC = downcallHandle("stbi_write_jpg_to_func", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_FLIP_VERTICALLY_ON_WRITE = downcallHandleVoid("stbi_flip_vertically_on_write", JAVA_INT);
        //@formatter:on
    }

    private StbImageWrite() {
    }

    public static int stbi_write_png(
    	MemorySegment filename,
    	int w,
    	int h,
    	int comp,
    	MemorySegment data,
    	int stride_in_bytes
    ) {
    	MethodHandle method = STBI_WRITE_PNG.get();
    	try {
    		return (int) method.invokeExact(
    			filename,
    			w,
    			h,
    			comp,
    			data,
    			stride_in_bytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_write_png].
    public static int stbi_write_png(
    	String filename,
    	int w,
    	int h,
    	int comp,
    	MemorySegment data,
    	int stride_in_bytes
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return stbi_write_png(
    			arena.allocateFrom(filename),
    			w,
    			h,
    			comp,
    			data,
    			stride_in_bytes
    		);
    	}
    }
    
    public static int stbi_write_bmp(
    	MemorySegment filename,
    	int w,
    	int h,
    	int comp,
    	MemorySegment data
    ) {
    	MethodHandle method = STBI_WRITE_BMP.get();
    	try {
    		return (int) method.invokeExact(
    			filename,
    			w,
    			h,
    			comp,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_write_bmp].
    public static int stbi_write_bmp(
    	String filename,
    	int w,
    	int h,
    	int comp,
    	MemorySegment data
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return stbi_write_bmp(
    			arena.allocateFrom(filename),
    			w,
    			h,
    			comp,
    			data
    		);
    	}
    }
    
    public static int stbi_write_tga(
    	MemorySegment filename,
    	int w,
    	int h,
    	int comp,
    	MemorySegment data
    ) {
    	MethodHandle method = STBI_WRITE_TGA.get();
    	try {
    		return (int) method.invokeExact(
    			filename,
    			w,
    			h,
    			comp,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_write_tga].
    public static int stbi_write_tga(
    	String filename,
    	int w,
    	int h,
    	int comp,
    	MemorySegment data
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return stbi_write_tga(
    			arena.allocateFrom(filename),
    			w,
    			h,
    			comp,
    			data
    		);
    	}
    }
    
    public static int stbi_write_hdr(
    	MemorySegment filename,
    	int w,
    	int h,
    	int comp,
    	MemorySegment data
    ) {
    	MethodHandle method = STBI_WRITE_HDR.get();
    	try {
    		return (int) method.invokeExact(
    			filename,
    			w,
    			h,
    			comp,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_write_hdr].
    public static int stbi_write_hdr(
    	String filename,
    	int w,
    	int h,
    	int comp,
    	NativeFloatArray data
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return stbi_write_hdr(
    			arena.allocateFrom(filename),
    			w,
    			h,
    			comp,
    			data.memorySegment()
    		);
    	}
    }
    
    public static int stbi_write_jpg(
    	MemorySegment filename,
    	int x,
    	int y,
    	int comp,
    	MemorySegment data,
    	int quality
    ) {
    	MethodHandle method = STBI_WRITE_JPG.get();
    	try {
    		return (int) method.invokeExact(
    			filename,
    			x,
    			y,
    			comp,
    			data,
    			quality
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_write_jpg].
    public static int stbi_write_jpg(
    	String filename,
    	int x,
    	int y,
    	int comp,
    	MemorySegment data,
    	int quality
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return stbi_write_jpg(
    			arena.allocateFrom(filename),
    			x,
    			y,
    			comp,
    			data,
    			quality
    		);
    	}
    }
    
    public static int stbi_write_png_to_func(
    	MemorySegment func,
    	MemorySegment context,
    	int w,
    	int h,
    	int comp,
    	MemorySegment data,
    	int stride_in_bytes
    ) {
    	MethodHandle method = STBI_WRITE_PNG_TO_FUNC.get();
    	try {
    		return (int) method.invokeExact(
    			func,
    			context,
    			w,
    			h,
    			comp,
    			data,
    			stride_in_bytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_write_png_to_func].
    public static int stbi_write_png_to_func(
    	StbImageWriteFunc func,
    	MemorySegment context,
    	int w,
    	int h,
    	int comp,
    	MemorySegment data,
    	int stride_in_bytes
    ) {
    	return stbi_write_png_to_func(
    		func.memorySegment(),
    		context,
    		w,
    		h,
    		comp,
    		data,
    		stride_in_bytes
    	);
    }
    
    public static int stbi_write_bmp_to_func(
    	MemorySegment func,
    	MemorySegment context,
    	int w,
    	int h,
    	int comp,
    	MemorySegment data
    ) {
    	MethodHandle method = STBI_WRITE_BMP_TO_FUNC.get();
    	try {
    		return (int) method.invokeExact(
    			func,
    			context,
    			w,
    			h,
    			comp,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_write_bmp_to_func].
    public static int stbi_write_bmp_to_func(
    	StbImageWriteFunc func,
    	MemorySegment context,
    	int w,
    	int h,
    	int comp,
    	MemorySegment data
    ) {
    	return stbi_write_bmp_to_func(
    		func.memorySegment(),
    		context,
    		w,
    		h,
    		comp,
    		data
    	);
    }
    
    public static int stbi_write_tga_to_func(
    	MemorySegment func,
    	MemorySegment context,
    	int w,
    	int h,
    	int comp,
    	MemorySegment data
    ) {
    	MethodHandle method = STBI_WRITE_TGA_TO_FUNC.get();
    	try {
    		return (int) method.invokeExact(
    			func,
    			context,
    			w,
    			h,
    			comp,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_write_tga_to_func].
    public static int stbi_write_tga_to_func(
    	StbImageWriteFunc func,
    	MemorySegment context,
    	int w,
    	int h,
    	int comp,
    	MemorySegment data
    ) {
    	return stbi_write_tga_to_func(
    		func.memorySegment(),
    		context,
    		w,
    		h,
    		comp,
    		data
    	);
    }
    
    public static int stbi_write_hdr_to_func(
    	MemorySegment func,
    	MemorySegment context,
    	int w,
    	int h,
    	int comp,
    	MemorySegment data
    ) {
    	MethodHandle method = STBI_WRITE_HDR_TO_FUNC.get();
    	try {
    		return (int) method.invokeExact(
    			func,
    			context,
    			w,
    			h,
    			comp,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_write_hdr_to_func].
    public static int stbi_write_hdr_to_func(
    	StbImageWriteFunc func,
    	MemorySegment context,
    	int w,
    	int h,
    	int comp,
    	NativeFloatArray data
    ) {
    	return stbi_write_hdr_to_func(
    		func.memorySegment(),
    		context,
    		w,
    		h,
    		comp,
    		data.memorySegment()
    	);
    }
    
    public static int stbi_write_jpg_to_func(
    	MemorySegment func,
    	MemorySegment context,
    	int x,
    	int y,
    	int comp,
    	MemorySegment data,
    	int quality
    ) {
    	MethodHandle method = STBI_WRITE_JPG_TO_FUNC.get();
    	try {
    		return (int) method.invokeExact(
    			func,
    			context,
    			x,
    			y,
    			comp,
    			data,
    			quality
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_write_jpg_to_func].
    public static int stbi_write_jpg_to_func(
    	StbImageWriteFunc func,
    	MemorySegment context,
    	int x,
    	int y,
    	int comp,
    	MemorySegment data,
    	int quality
    ) {
    	return stbi_write_jpg_to_func(
    		func.memorySegment(),
    		context,
    		x,
    		y,
    		comp,
    		data,
    		quality
    	);
    }
    
    public static void stbi_flip_vertically_on_write(
    	int flip_boolean
    ) {
    	MethodHandle method = STBI_FLIP_VERTICALLY_ON_WRITE.get();
    	try {
    		 method.invokeExact(
    			flip_boolean
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
}