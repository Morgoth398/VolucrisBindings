/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.stb.image;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.MemoryStack;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeShortArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class StbImage {

    private static final LazyConstant<MethodHandle> STBI_LOAD_FROM_MEMORY;
    private static final LazyConstant<MethodHandle> STBI_LOAD_FROM_CALLBACKS;
    private static final LazyConstant<MethodHandle> STBI_LOAD;
    private static final LazyConstant<MethodHandle> STBI_LOAD_GIF_FROM_MEMORY;
    private static final LazyConstant<MethodHandle> STBI_LOAD_16_FROM_MEMORY;
    private static final LazyConstant<MethodHandle> STBI_LOAD_16_FROM_CALLBACKS;
    private static final LazyConstant<MethodHandle> STBI_LOAD_16;
    private static final LazyConstant<MethodHandle> STBI_LOADF_FROM_MEMORY;
    private static final LazyConstant<MethodHandle> STBI_LOADF_FROM_CALLBACKS;
    private static final LazyConstant<MethodHandle> STBI_LOADF;
    private static final LazyConstant<MethodHandle> STBI_HDR_TO_LDR_GAMMA;
    private static final LazyConstant<MethodHandle> STBI_HDR_TO_LDR_SCALE;
    private static final LazyConstant<MethodHandle> STBI_LDR_TO_HDR_GAMMA;
    private static final LazyConstant<MethodHandle> STBI_LDR_TO_HDR_SCALE;
    private static final LazyConstant<MethodHandle> STBI_IS_HDR_FROM_CALLBACKS;
    private static final LazyConstant<MethodHandle> STBI_IS_HDR_FROM_MEMORY;
    private static final LazyConstant<MethodHandle> STBI_IS_HDR;
    private static final LazyConstant<MethodHandle> STBI_FAILURE_REASON;
    private static final LazyConstant<MethodHandle> STBI_IMAGE_FREE;
    private static final LazyConstant<MethodHandle> STBI_INFO_FROM_MEMORY;
    private static final LazyConstant<MethodHandle> STBI_INFO_FROM_CALLBACKS;
    private static final LazyConstant<MethodHandle> STBI_IS_16_BIT_FROM_MEMORY;
    private static final LazyConstant<MethodHandle> STBI_IS_16_BIT_FROM_CALLBACKS;
    private static final LazyConstant<MethodHandle> STBI_INFO;
    private static final LazyConstant<MethodHandle> STBI_IS_16_BIT;
    private static final LazyConstant<MethodHandle> STBI_SET_UNPREMULTIPLY_ON_LOAD;
    private static final LazyConstant<MethodHandle> STBI_CONVERT_IPHONE_PNG_TO_RGB;
    private static final LazyConstant<MethodHandle> STBI_SET_FLIP_VERTICALLY_ON_LOAD;
    private static final LazyConstant<MethodHandle> STBI_SET_UNPREMULTIPLY_ON_LOAD_THREAD;
    private static final LazyConstant<MethodHandle> STBI_CONVERT_IPHONE_PNG_TO_RGB_THREAD;
    private static final LazyConstant<MethodHandle> STBI_SET_FLIP_VERTICALLY_ON_LOAD_THREAD;
    private static final LazyConstant<MethodHandle> STBI_ZLIB_DECODE_MALLOC_GUESSSIZE;
    private static final LazyConstant<MethodHandle> STBI_ZLIB_DECODE_MALLOC_GUESSSIZE_HEADERFLAG;
    private static final LazyConstant<MethodHandle> STBI_ZLIB_DECODE_MALLOC;
    private static final LazyConstant<MethodHandle> STBI_ZLIB_DECODE_BUFFER;
    private static final LazyConstant<MethodHandle> STBI_ZLIB_DECODE_NOHEADER_MALLOC;
    private static final LazyConstant<MethodHandle> STBI_ZLIB_DECODE_NOHEADER_BUFFER;

    static {
        //@formatter:off
        STBI_LOAD_FROM_MEMORY = downcallHandle("stbi_load_from_memory", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_LOAD_FROM_CALLBACKS = downcallHandle("stbi_load_from_callbacks", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_LOAD = downcallHandle("stbi_load", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_LOAD_GIF_FROM_MEMORY = downcallHandle("stbi_load_gif_from_memory", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_LOAD_16_FROM_MEMORY = downcallHandle("stbi_load_16_from_memory", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_LOAD_16_FROM_CALLBACKS = downcallHandle("stbi_load_16_from_callbacks", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_LOAD_16 = downcallHandle("stbi_load_16", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_LOADF_FROM_MEMORY = downcallHandle("stbi_loadf_from_memory", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_LOADF_FROM_CALLBACKS = downcallHandle("stbi_loadf_from_callbacks", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_LOADF = downcallHandle("stbi_loadf", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_HDR_TO_LDR_GAMMA = downcallHandleVoid("stbi_hdr_to_ldr_gamma", JAVA_FLOAT);
        STBI_HDR_TO_LDR_SCALE = downcallHandleVoid("stbi_hdr_to_ldr_scale", JAVA_FLOAT);
        STBI_LDR_TO_HDR_GAMMA = downcallHandleVoid("stbi_ldr_to_hdr_gamma", JAVA_FLOAT);
        STBI_LDR_TO_HDR_SCALE = downcallHandleVoid("stbi_ldr_to_hdr_scale", JAVA_FLOAT);
        STBI_IS_HDR_FROM_CALLBACKS = downcallHandle("stbi_is_hdr_from_callbacks", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        STBI_IS_HDR_FROM_MEMORY = downcallHandle("stbi_is_hdr_from_memory", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_IS_HDR = downcallHandle("stbi_is_hdr", JAVA_INT, UNBOUNDED_ADDRESS);
        STBI_FAILURE_REASON = downcallHandle("stbi_failure_reason", UNBOUNDED_ADDRESS);
        STBI_IMAGE_FREE = downcallHandleVoid("stbi_image_free", UNBOUNDED_ADDRESS);
        STBI_INFO_FROM_MEMORY = downcallHandle("stbi_info_from_memory", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        STBI_INFO_FROM_CALLBACKS = downcallHandle("stbi_info_from_callbacks", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        STBI_IS_16_BIT_FROM_MEMORY = downcallHandle("stbi_is_16_bit_from_memory", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_IS_16_BIT_FROM_CALLBACKS = downcallHandle("stbi_is_16_bit_from_callbacks", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        STBI_INFO = downcallHandle("stbi_info", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        STBI_IS_16_BIT = downcallHandle("stbi_is_16_bit", JAVA_INT, UNBOUNDED_ADDRESS);
        STBI_SET_UNPREMULTIPLY_ON_LOAD = downcallHandleVoid("stbi_set_unpremultiply_on_load", JAVA_INT);
        STBI_CONVERT_IPHONE_PNG_TO_RGB = downcallHandleVoid("stbi_convert_iphone_png_to_rgb", JAVA_INT);
        STBI_SET_FLIP_VERTICALLY_ON_LOAD = downcallHandleVoid("stbi_set_flip_vertically_on_load", JAVA_INT);
        STBI_SET_UNPREMULTIPLY_ON_LOAD_THREAD = downcallHandleVoid("stbi_set_unpremultiply_on_load_thread", JAVA_INT);
        STBI_CONVERT_IPHONE_PNG_TO_RGB_THREAD = downcallHandleVoid("stbi_convert_iphone_png_to_rgb_thread", JAVA_INT);
        STBI_SET_FLIP_VERTICALLY_ON_LOAD_THREAD = downcallHandleVoid("stbi_set_flip_vertically_on_load_thread", JAVA_INT);
        STBI_ZLIB_DECODE_MALLOC_GUESSSIZE = downcallHandle("stbi_zlib_decode_malloc_guesssize", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        STBI_ZLIB_DECODE_MALLOC_GUESSSIZE_HEADERFLAG = downcallHandle("stbi_zlib_decode_malloc_guesssize_headerflag", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_ZLIB_DECODE_MALLOC = downcallHandle("stbi_zlib_decode_malloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        STBI_ZLIB_DECODE_BUFFER = downcallHandle("stbi_zlib_decode_buffer", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        STBI_ZLIB_DECODE_NOHEADER_MALLOC = downcallHandle("stbi_zlib_decode_noheader_malloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        STBI_ZLIB_DECODE_NOHEADER_BUFFER = downcallHandle("stbi_zlib_decode_noheader_buffer", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        //@formatter:on
    }

    private StbImage() {
    }

    /// ```
    /// /////////////////////////////////
    /// ```
    public static MemorySegment stbi_load_from_memory(
    	MemorySegment buffer,
    	int len,
    	MemorySegment x,
    	MemorySegment y,
    	MemorySegment channels_in_file,
    	int desired_channels
    ) {
    	MethodHandle method = STBI_LOAD_FROM_MEMORY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			buffer,
    			len,
    			x,
    			y,
    			channels_in_file,
    			desired_channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_load_from_memory].
    public static @Nullable NativeByteArray stbi_load_from_memory(
    	NativeByteArray buffer,
    	int len,
    	NativeIntArray x,
    	NativeIntArray y,
    	NativeIntArray channels_in_file,
    	int desired_channels
    ) {
    	MemorySegment segment = stbi_load_from_memory(
    		buffer.memorySegment(),
    		len,
    		x.memorySegment(),
    		y.memorySegment(),
    		channels_in_file.memorySegment(),
    		desired_channels
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment stbi_load_from_callbacks(
    	MemorySegment clbk,
    	MemorySegment user,
    	MemorySegment x,
    	MemorySegment y,
    	MemorySegment channels_in_file,
    	int desired_channels
    ) {
    	MethodHandle method = STBI_LOAD_FROM_CALLBACKS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			clbk,
    			user,
    			x,
    			y,
    			channels_in_file,
    			desired_channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_load_from_callbacks].
    public static @Nullable NativeByteArray stbi_load_from_callbacks(
    	StbImageIoCallbacks clbk,
    	MemorySegment user,
    	NativeIntArray x,
    	NativeIntArray y,
    	NativeIntArray channels_in_file,
    	int desired_channels
    ) {
    	MemorySegment segment = stbi_load_from_callbacks(
    		clbk.memorySegment(),
    		user,
    		x.memorySegment(),
    		y.memorySegment(),
    		channels_in_file.memorySegment(),
    		desired_channels
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment stbi_load(
    	MemorySegment filename,
    	MemorySegment x,
    	MemorySegment y,
    	MemorySegment channels_in_file,
    	int desired_channels
    ) {
    	MethodHandle method = STBI_LOAD.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			filename,
    			x,
    			y,
    			channels_in_file,
    			desired_channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_load].
    public static @Nullable NativeByteArray stbi_load(
    	String filename,
    	NativeIntArray x,
    	NativeIntArray y,
    	NativeIntArray channels_in_file,
    	int desired_channels
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = stbi_load(
    			arena.allocateFrom(filename),
    			x.memorySegment(),
    			y.memorySegment(),
    			channels_in_file.memorySegment(),
    			desired_channels
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new NativeByteArray(segment);
    	}
    }
    
    public static MemorySegment stbi_load_gif_from_memory(
    	MemorySegment buffer,
    	int len,
    	MemorySegment delays,
    	MemorySegment x,
    	MemorySegment y,
    	MemorySegment z,
    	MemorySegment comp,
    	int req_comp
    ) {
    	MethodHandle method = STBI_LOAD_GIF_FROM_MEMORY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			buffer,
    			len,
    			delays,
    			x,
    			y,
    			z,
    			comp,
    			req_comp
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_load_gif_from_memory].
    public static @Nullable NativeByteArray stbi_load_gif_from_memory(
    	NativeByteArray buffer,
    	int len,
    	NativePointerArray delays,
    	NativeIntArray x,
    	NativeIntArray y,
    	NativeIntArray z,
    	NativeIntArray comp,
    	int req_comp
    ) {
    	MemorySegment segment = stbi_load_gif_from_memory(
    		buffer.memorySegment(),
    		len,
    		delays.memorySegment(),
    		x.memorySegment(),
    		y.memorySegment(),
    		z.memorySegment(),
    		comp.memorySegment(),
    		req_comp
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// ```
    /// /////////////////////////////////
    /// ```
    public static MemorySegment stbi_load_16_from_memory(
    	MemorySegment buffer,
    	int len,
    	MemorySegment x,
    	MemorySegment y,
    	MemorySegment channels_in_file,
    	int desired_channels
    ) {
    	MethodHandle method = STBI_LOAD_16_FROM_MEMORY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			buffer,
    			len,
    			x,
    			y,
    			channels_in_file,
    			desired_channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_load_16_from_memory].
    public static @Nullable NativeShortArray stbi_load_16_from_memory(
    	NativeByteArray buffer,
    	int len,
    	NativeIntArray x,
    	NativeIntArray y,
    	NativeIntArray channels_in_file,
    	int desired_channels
    ) {
    	MemorySegment segment = stbi_load_16_from_memory(
    		buffer.memorySegment(),
    		len,
    		x.memorySegment(),
    		y.memorySegment(),
    		channels_in_file.memorySegment(),
    		desired_channels
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeShortArray(segment);
    }
    
    public static MemorySegment stbi_load_16_from_callbacks(
    	MemorySegment clbk,
    	MemorySegment user,
    	MemorySegment x,
    	MemorySegment y,
    	MemorySegment channels_in_file,
    	int desired_channels
    ) {
    	MethodHandle method = STBI_LOAD_16_FROM_CALLBACKS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			clbk,
    			user,
    			x,
    			y,
    			channels_in_file,
    			desired_channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_load_16_from_callbacks].
    public static @Nullable NativeShortArray stbi_load_16_from_callbacks(
    	StbImageIoCallbacks clbk,
    	MemorySegment user,
    	NativeIntArray x,
    	NativeIntArray y,
    	NativeIntArray channels_in_file,
    	int desired_channels
    ) {
    	MemorySegment segment = stbi_load_16_from_callbacks(
    		clbk.memorySegment(),
    		user,
    		x.memorySegment(),
    		y.memorySegment(),
    		channels_in_file.memorySegment(),
    		desired_channels
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeShortArray(segment);
    }
    
    public static MemorySegment stbi_load_16(
    	MemorySegment filename,
    	MemorySegment x,
    	MemorySegment y,
    	MemorySegment channels_in_file,
    	int desired_channels
    ) {
    	MethodHandle method = STBI_LOAD_16.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			filename,
    			x,
    			y,
    			channels_in_file,
    			desired_channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_load_16].
    public static @Nullable NativeShortArray stbi_load_16(
    	NativeByteArray filename,
    	NativeIntArray x,
    	NativeIntArray y,
    	NativeIntArray channels_in_file,
    	int desired_channels
    ) {
    	MemorySegment segment = stbi_load_16(
    		filename.memorySegment(),
    		x.memorySegment(),
    		y.memorySegment(),
    		channels_in_file.memorySegment(),
    		desired_channels
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeShortArray(segment);
    }
    
    public static MemorySegment stbi_loadf_from_memory(
    	MemorySegment buffer,
    	int len,
    	MemorySegment x,
    	MemorySegment y,
    	MemorySegment channels_in_file,
    	int desired_channels
    ) {
    	MethodHandle method = STBI_LOADF_FROM_MEMORY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			buffer,
    			len,
    			x,
    			y,
    			channels_in_file,
    			desired_channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_loadf_from_memory].
    public static @Nullable NativeFloatArray stbi_loadf_from_memory(
    	NativeByteArray buffer,
    	int len,
    	NativeIntArray x,
    	NativeIntArray y,
    	NativeIntArray channels_in_file,
    	int desired_channels
    ) {
    	MemorySegment segment = stbi_loadf_from_memory(
    		buffer.memorySegment(),
    		len,
    		x.memorySegment(),
    		y.memorySegment(),
    		channels_in_file.memorySegment(),
    		desired_channels
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    public static MemorySegment stbi_loadf_from_callbacks(
    	MemorySegment clbk,
    	MemorySegment user,
    	MemorySegment x,
    	MemorySegment y,
    	MemorySegment channels_in_file,
    	int desired_channels
    ) {
    	MethodHandle method = STBI_LOADF_FROM_CALLBACKS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			clbk,
    			user,
    			x,
    			y,
    			channels_in_file,
    			desired_channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_loadf_from_callbacks].
    public static @Nullable NativeFloatArray stbi_loadf_from_callbacks(
    	StbImageIoCallbacks clbk,
    	MemorySegment user,
    	NativeIntArray x,
    	NativeIntArray y,
    	NativeIntArray channels_in_file,
    	int desired_channels
    ) {
    	MemorySegment segment = stbi_loadf_from_callbacks(
    		clbk.memorySegment(),
    		user,
    		x.memorySegment(),
    		y.memorySegment(),
    		channels_in_file.memorySegment(),
    		desired_channels
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    public static MemorySegment stbi_loadf(
    	MemorySegment filename,
    	MemorySegment x,
    	MemorySegment y,
    	MemorySegment channels_in_file,
    	int desired_channels
    ) {
    	MethodHandle method = STBI_LOADF.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			filename,
    			x,
    			y,
    			channels_in_file,
    			desired_channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_loadf].
    public static @Nullable NativeFloatArray stbi_loadf(
    	NativeByteArray filename,
    	NativeIntArray x,
    	NativeIntArray y,
    	NativeIntArray channels_in_file,
    	int desired_channels
    ) {
    	MemorySegment segment = stbi_loadf(
    		filename.memorySegment(),
    		x.memorySegment(),
    		y.memorySegment(),
    		channels_in_file.memorySegment(),
    		desired_channels
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    public static void stbi_hdr_to_ldr_gamma(
    	float gamma
    ) {
    	MethodHandle method = STBI_HDR_TO_LDR_GAMMA.get();
    	try {
    		 method.invokeExact(
    			gamma
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void stbi_hdr_to_ldr_scale(
    	float scale
    ) {
    	MethodHandle method = STBI_HDR_TO_LDR_SCALE.get();
    	try {
    		 method.invokeExact(
    			scale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void stbi_ldr_to_hdr_gamma(
    	float gamma
    ) {
    	MethodHandle method = STBI_LDR_TO_HDR_GAMMA.get();
    	try {
    		 method.invokeExact(
    			gamma
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void stbi_ldr_to_hdr_scale(
    	float scale
    ) {
    	MethodHandle method = STBI_LDR_TO_HDR_SCALE.get();
    	try {
    		 method.invokeExact(
    			scale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int stbi_is_hdr_from_callbacks(
    	MemorySegment clbk,
    	MemorySegment user
    ) {
    	MethodHandle method = STBI_IS_HDR_FROM_CALLBACKS.get();
    	try {
    		return (int) method.invokeExact(
    			clbk,
    			user
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_is_hdr_from_callbacks].
    public static int stbi_is_hdr_from_callbacks(
    	StbImageIoCallbacks clbk,
    	MemorySegment user
    ) {
    	return stbi_is_hdr_from_callbacks(
    		clbk.memorySegment(),
    		user
    	);
    }
    
    public static int stbi_is_hdr_from_memory(
    	MemorySegment buffer,
    	int len
    ) {
    	MethodHandle method = STBI_IS_HDR_FROM_MEMORY.get();
    	try {
    		return (int) method.invokeExact(
    			buffer,
    			len
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_is_hdr_from_memory].
    public static int stbi_is_hdr_from_memory(
    	NativeByteArray buffer,
    	int len
    ) {
    	return stbi_is_hdr_from_memory(
    		buffer.memorySegment(),
    		len
    	);
    }
    
    public static int stbi_is_hdr(
    	MemorySegment filename
    ) {
    	MethodHandle method = STBI_IS_HDR.get();
    	try {
    		return (int) method.invokeExact(
    			filename
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_is_hdr].
    public static int stbi_is_hdr(
    	NativeByteArray filename
    ) {
    	return stbi_is_hdr(
    		filename.memorySegment()
    	);
    }
    
    public static MemorySegment nstbi_failure_reason() {
    	MethodHandle method = STBI_FAILURE_REASON.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nstbi_failure_reason].
    public static @Nullable String stbi_failure_reason() {
    	MemorySegment segment = nstbi_failure_reason();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return segment.getString(0);
    }
    
    public static void stbi_image_free(
    	MemorySegment retval_from_stbi_load
    ) {
    	MethodHandle method = STBI_IMAGE_FREE.get();
    	try {
    		 method.invokeExact(
    			retval_from_stbi_load
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int stbi_info_from_memory(
    	MemorySegment buffer,
    	int len,
    	MemorySegment x,
    	MemorySegment y,
    	MemorySegment comp
    ) {
    	MethodHandle method = STBI_INFO_FROM_MEMORY.get();
    	try {
    		return (int) method.invokeExact(
    			buffer,
    			len,
    			x,
    			y,
    			comp
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_info_from_memory].
    public static int stbi_info_from_memory(
    	NativeByteArray buffer,
    	int len,
    	NativeIntArray x,
    	NativeIntArray y,
    	NativeIntArray comp
    ) {
    	return stbi_info_from_memory(
    		buffer.memorySegment(),
    		len,
    		x.memorySegment(),
    		y.memorySegment(),
    		comp.memorySegment()
    	);
    }
    
    public static int stbi_info_from_callbacks(
    	MemorySegment clbk,
    	MemorySegment user,
    	MemorySegment x,
    	MemorySegment y,
    	MemorySegment comp
    ) {
    	MethodHandle method = STBI_INFO_FROM_CALLBACKS.get();
    	try {
    		return (int) method.invokeExact(
    			clbk,
    			user,
    			x,
    			y,
    			comp
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_info_from_callbacks].
    public static int stbi_info_from_callbacks(
    	StbImageIoCallbacks clbk,
    	MemorySegment user,
    	NativeIntArray x,
    	NativeIntArray y,
    	NativeIntArray comp
    ) {
    	return stbi_info_from_callbacks(
    		clbk.memorySegment(),
    		user,
    		x.memorySegment(),
    		y.memorySegment(),
    		comp.memorySegment()
    	);
    }
    
    public static int stbi_is_16_bit_from_memory(
    	MemorySegment buffer,
    	int len
    ) {
    	MethodHandle method = STBI_IS_16_BIT_FROM_MEMORY.get();
    	try {
    		return (int) method.invokeExact(
    			buffer,
    			len
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_is_16_bit_from_memory].
    public static int stbi_is_16_bit_from_memory(
    	NativeByteArray buffer,
    	int len
    ) {
    	return stbi_is_16_bit_from_memory(
    		buffer.memorySegment(),
    		len
    	);
    }
    
    public static int stbi_is_16_bit_from_callbacks(
    	MemorySegment clbk,
    	MemorySegment user
    ) {
    	MethodHandle method = STBI_IS_16_BIT_FROM_CALLBACKS.get();
    	try {
    		return (int) method.invokeExact(
    			clbk,
    			user
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_is_16_bit_from_callbacks].
    public static int stbi_is_16_bit_from_callbacks(
    	StbImageIoCallbacks clbk,
    	MemorySegment user
    ) {
    	return stbi_is_16_bit_from_callbacks(
    		clbk.memorySegment(),
    		user
    	);
    }
    
    public static int stbi_info(
    	MemorySegment filename,
    	MemorySegment x,
    	MemorySegment y,
    	MemorySegment comp
    ) {
    	MethodHandle method = STBI_INFO.get();
    	try {
    		return (int) method.invokeExact(
    			filename,
    			x,
    			y,
    			comp
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_info].
    public static int stbi_info(
    	String filename,
    	NativeIntArray x,
    	NativeIntArray y,
    	NativeIntArray comp
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return stbi_info(
    			arena.allocateFrom(filename),
    			x.memorySegment(),
    			y.memorySegment(),
    			comp.memorySegment()
    		);
    	}
    }
    
    public static int stbi_is_16_bit(
    	MemorySegment filename
    ) {
    	MethodHandle method = STBI_IS_16_BIT.get();
    	try {
    		return (int) method.invokeExact(
    			filename
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_is_16_bit].
    public static int stbi_is_16_bit(
    	String filename
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return stbi_is_16_bit(
    			arena.allocateFrom(filename)
    		);
    	}
    }
    
    public static void stbi_set_unpremultiply_on_load(
    	int flag_true_if_should_unpremultiply
    ) {
    	MethodHandle method = STBI_SET_UNPREMULTIPLY_ON_LOAD.get();
    	try {
    		 method.invokeExact(
    			flag_true_if_should_unpremultiply
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void stbi_convert_iphone_png_to_rgb(
    	int flag_true_if_should_convert
    ) {
    	MethodHandle method = STBI_CONVERT_IPHONE_PNG_TO_RGB.get();
    	try {
    		 method.invokeExact(
    			flag_true_if_should_convert
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void stbi_set_flip_vertically_on_load(
    	int flag_true_if_should_flip
    ) {
    	MethodHandle method = STBI_SET_FLIP_VERTICALLY_ON_LOAD.get();
    	try {
    		 method.invokeExact(
    			flag_true_if_should_flip
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void stbi_set_unpremultiply_on_load_thread(
    	int flag_true_if_should_unpremultiply
    ) {
    	MethodHandle method = STBI_SET_UNPREMULTIPLY_ON_LOAD_THREAD.get();
    	try {
    		 method.invokeExact(
    			flag_true_if_should_unpremultiply
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void stbi_convert_iphone_png_to_rgb_thread(
    	int flag_true_if_should_convert
    ) {
    	MethodHandle method = STBI_CONVERT_IPHONE_PNG_TO_RGB_THREAD.get();
    	try {
    		 method.invokeExact(
    			flag_true_if_should_convert
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void stbi_set_flip_vertically_on_load_thread(
    	int flag_true_if_should_flip
    ) {
    	MethodHandle method = STBI_SET_FLIP_VERTICALLY_ON_LOAD_THREAD.get();
    	try {
    		 method.invokeExact(
    			flag_true_if_should_flip
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment stbi_zlib_decode_malloc_guesssize(
    	MemorySegment buffer,
    	int len,
    	int initial_size,
    	MemorySegment outlen
    ) {
    	MethodHandle method = STBI_ZLIB_DECODE_MALLOC_GUESSSIZE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			buffer,
    			len,
    			initial_size,
    			outlen
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_zlib_decode_malloc_guesssize].
    public static @Nullable NativeByteArray stbi_zlib_decode_malloc_guesssize(
    	NativeByteArray buffer,
    	int len,
    	int initial_size,
    	NativeIntArray outlen
    ) {
    	MemorySegment segment = stbi_zlib_decode_malloc_guesssize(
    		buffer.memorySegment(),
    		len,
    		initial_size,
    		outlen.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment stbi_zlib_decode_malloc_guesssize_headerflag(
    	MemorySegment buffer,
    	int len,
    	int initial_size,
    	MemorySegment outlen,
    	int parse_header
    ) {
    	MethodHandle method = STBI_ZLIB_DECODE_MALLOC_GUESSSIZE_HEADERFLAG.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			buffer,
    			len,
    			initial_size,
    			outlen,
    			parse_header
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_zlib_decode_malloc_guesssize_headerflag].
    public static @Nullable NativeByteArray stbi_zlib_decode_malloc_guesssize_headerflag(
    	NativeByteArray buffer,
    	int len,
    	int initial_size,
    	NativeIntArray outlen,
    	int parse_header
    ) {
    	MemorySegment segment = stbi_zlib_decode_malloc_guesssize_headerflag(
    		buffer.memorySegment(),
    		len,
    		initial_size,
    		outlen.memorySegment(),
    		parse_header
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment stbi_zlib_decode_malloc(
    	MemorySegment buffer,
    	int len,
    	MemorySegment outlen
    ) {
    	MethodHandle method = STBI_ZLIB_DECODE_MALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			buffer,
    			len,
    			outlen
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_zlib_decode_malloc].
    public static @Nullable NativeByteArray stbi_zlib_decode_malloc(
    	NativeByteArray buffer,
    	int len,
    	NativeIntArray outlen
    ) {
    	MemorySegment segment = stbi_zlib_decode_malloc(
    		buffer.memorySegment(),
    		len,
    		outlen.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static int stbi_zlib_decode_buffer(
    	MemorySegment obuffer,
    	int olen,
    	MemorySegment ibuffer,
    	int ilen
    ) {
    	MethodHandle method = STBI_ZLIB_DECODE_BUFFER.get();
    	try {
    		return (int) method.invokeExact(
    			obuffer,
    			olen,
    			ibuffer,
    			ilen
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_zlib_decode_buffer].
    public static int stbi_zlib_decode_buffer(
    	NativeByteArray obuffer,
    	int olen,
    	NativeByteArray ibuffer,
    	int ilen
    ) {
    	return stbi_zlib_decode_buffer(
    		obuffer.memorySegment(),
    		olen,
    		ibuffer.memorySegment(),
    		ilen
    	);
    }
    
    public static MemorySegment stbi_zlib_decode_noheader_malloc(
    	MemorySegment buffer,
    	int len,
    	MemorySegment outlen
    ) {
    	MethodHandle method = STBI_ZLIB_DECODE_NOHEADER_MALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			buffer,
    			len,
    			outlen
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_zlib_decode_noheader_malloc].
    public static @Nullable NativeByteArray stbi_zlib_decode_noheader_malloc(
    	NativeByteArray buffer,
    	int len,
    	NativeIntArray outlen
    ) {
    	MemorySegment segment = stbi_zlib_decode_noheader_malloc(
    		buffer.memorySegment(),
    		len,
    		outlen.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static int stbi_zlib_decode_noheader_buffer(
    	MemorySegment obuffer,
    	int olen,
    	MemorySegment ibuffer,
    	int ilen
    ) {
    	MethodHandle method = STBI_ZLIB_DECODE_NOHEADER_BUFFER.get();
    	try {
    		return (int) method.invokeExact(
    			obuffer,
    			olen,
    			ibuffer,
    			ilen
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stbi_zlib_decode_noheader_buffer].
    public static int stbi_zlib_decode_noheader_buffer(
    	NativeByteArray obuffer,
    	int olen,
    	NativeByteArray ibuffer,
    	int ilen
    ) {
    	return stbi_zlib_decode_noheader_buffer(
    		obuffer.memorySegment(),
    		olen,
    		ibuffer.memorySegment(),
    		ilen
    	);
    }
    
}