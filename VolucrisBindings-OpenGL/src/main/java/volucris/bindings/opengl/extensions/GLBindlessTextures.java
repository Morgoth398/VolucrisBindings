/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.opengl.extensions;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeLongArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class GLBindlessTextures {

	public static final int GL_UNSIGNED_INT64_ARB = 0x140F;

	private static final LazyConstant<Boolean> GL_ARB_BINDLESS_TEXTURE;

	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEXTURE_HANDLE_ARB;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEXTURE_SAMPLER_HANDLE_ARB;
	private static final LazyConstant<MethodHandle> GLAD_GL_MAKE_TEXTURE_HANDLE_RESIDENT_ARB;
	private static final LazyConstant<MethodHandle> GLAD_GL_MAKE_TEXTURE_HANDLE_NON_RESIDENT_ARB;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_IMAGE_HANDLE_ARB;
	private static final LazyConstant<MethodHandle> GLAD_GL_MAKE_IMAGE_HANDLE_RESIDENT_ARB;
	private static final LazyConstant<MethodHandle> GLAD_GL_MAKE_IMAGE_HANDLE_NON_RESIDENT_ARB;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_HANDLEUI64_ARB;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_HANDLEUI64V_ARB;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_HANDLEUI64_ARB;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_HANDLEUI64V_ARB;
	private static final LazyConstant<MethodHandle> GLAD_GL_IS_TEXTURE_HANDLE_RESIDENT_ARB;
	private static final LazyConstant<MethodHandle> GLAD_GL_IS_IMAGE_HANDLE_RESIDENT_ARB;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_L1UI64_ARB;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_L1UI64V_ARB;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_VERTEX_ATTRIB_LUI64V_ARB;

	static {
		//@formatter:off
		GL_ARB_BINDLESS_TEXTURE = booleanSymbol("GLAD_GL_ARB_bindless_texture", true);
		
		GLAD_GL_GET_TEXTURE_HANDLE_ARB = downcallHandle(true, "glad_glGetTextureHandleARB", JAVA_LONG, JAVA_INT);
		GLAD_GL_GET_TEXTURE_SAMPLER_HANDLE_ARB = downcallHandle(true, "glad_glGetTextureSamplerHandleARB", JAVA_LONG, JAVA_INT, JAVA_INT);
		GLAD_GL_MAKE_TEXTURE_HANDLE_RESIDENT_ARB = downcallHandleVoid(true, "glad_glMakeTextureHandleResidentARB", JAVA_LONG);
		GLAD_GL_MAKE_TEXTURE_HANDLE_NON_RESIDENT_ARB = downcallHandleVoid(true, "glad_glMakeTextureHandleNonResidentARB", JAVA_LONG);
		GLAD_GL_GET_IMAGE_HANDLE_ARB = downcallHandle(true, "glad_glGetImageHandleARB", JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_INT);
		GLAD_GL_MAKE_IMAGE_HANDLE_RESIDENT_ARB = downcallHandleVoid(true, "glad_glMakeImageHandleResidentARB", JAVA_LONG, JAVA_INT);
		GLAD_GL_MAKE_IMAGE_HANDLE_NON_RESIDENT_ARB = downcallHandleVoid(true, "glad_glMakeImageHandleNonResidentARB", JAVA_LONG);
		GLAD_GL_UNIFORM_HANDLEUI64_ARB = downcallHandleVoid(true, "glad_glUniformHandleui64ARB", JAVA_INT, JAVA_LONG);
		GLAD_GL_UNIFORM_HANDLEUI64V_ARB = downcallHandleVoid(true, "glad_glUniformHandleui64vARB", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_HANDLEUI64_ARB = downcallHandleVoid(true, "glad_glProgramUniformHandleui64ARB", JAVA_INT, JAVA_INT, JAVA_LONG);
		GLAD_GL_PROGRAM_UNIFORM_HANDLEUI64V_ARB = downcallHandleVoid(true, "glad_glProgramUniformHandleui64vARB", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_IS_TEXTURE_HANDLE_RESIDENT_ARB = downcallHandle(true, "glad_glIsTextureHandleResidentARB", JAVA_BYTE, JAVA_LONG);
		GLAD_GL_IS_IMAGE_HANDLE_RESIDENT_ARB = downcallHandle(true, "glad_glIsImageHandleResidentARB", JAVA_BYTE, JAVA_LONG);
		GLAD_GL_VERTEX_ATTRIB_L1UI64_ARB = downcallHandleVoid(true, "glad_glVertexAttribL1ui64ARB", JAVA_INT, JAVA_LONG);
		GLAD_GL_VERTEX_ATTRIB_L1UI64V_ARB = downcallHandleVoid(true, "glad_glVertexAttribL1ui64vARB", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_VERTEX_ATTRIB_LUI64V_ARB = downcallHandleVoid(true, "glad_glGetVertexAttribLui64vARB", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	private GLBindlessTextures() {
	}

    public static final boolean GL_ARB_bindless_texture() {
        return GL_ARB_BINDLESS_TEXTURE.get();
    }
    
    public static long glGetTextureHandleARB(
    	int texture
    ) {
    	MethodHandle method = GLAD_GL_GET_TEXTURE_HANDLE_ARB.get();
    	try {
    		return (long) method.invokeExact(
    			texture
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static long glGetTextureSamplerHandleARB(
    	int texture,
    	int sampler
    ) {
    	MethodHandle method = GLAD_GL_GET_TEXTURE_SAMPLER_HANDLE_ARB.get();
    	try {
    		return (long) method.invokeExact(
    			texture,
    			sampler
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glMakeTextureHandleResidentARB(
    	long handle
    ) {
    	MethodHandle method = GLAD_GL_MAKE_TEXTURE_HANDLE_RESIDENT_ARB.get();
    	try {
    		 method.invokeExact(
    			handle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glMakeTextureHandleNonResidentARB(
    	long handle
    ) {
    	MethodHandle method = GLAD_GL_MAKE_TEXTURE_HANDLE_NON_RESIDENT_ARB.get();
    	try {
    		 method.invokeExact(
    			handle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static long glGetImageHandleARB(
    	int texture,
    	int level,
    	byte layered,
    	int layer,
    	int format
    ) {
    	MethodHandle method = GLAD_GL_GET_IMAGE_HANDLE_ARB.get();
    	try {
    		return (long) method.invokeExact(
    			texture,
    			level,
    			layered,
    			layer,
    			format
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glMakeImageHandleResidentARB(
    	long handle,
    	int access
    ) {
    	MethodHandle method = GLAD_GL_MAKE_IMAGE_HANDLE_RESIDENT_ARB.get();
    	try {
    		 method.invokeExact(
    			handle,
    			access
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glMakeImageHandleNonResidentARB(
    	long handle
    ) {
    	MethodHandle method = GLAD_GL_MAKE_IMAGE_HANDLE_NON_RESIDENT_ARB.get();
    	try {
    		 method.invokeExact(
    			handle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniformHandleui64ARB(
    	int location,
    	long value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_HANDLEUI64_ARB.get();
    	try {
    		 method.invokeExact(
    			location,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniformHandleui64vARB(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_HANDLEUI64V_ARB.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformHandleui64vARB].
    public static void glUniformHandleui64vARB(
    	int location,
    	int count,
    	NativeLongArray value
    ) {
    	glUniformHandleui64vARB(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformHandleui64ARB(
    	int program,
    	int location,
    	long value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_HANDLEUI64_ARB.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniformHandleui64vARB(
    	int program,
    	int location,
    	int count,
    	MemorySegment values
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_HANDLEUI64V_ARB.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			values
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformHandleui64vARB].
    public static void glProgramUniformHandleui64vARB(
    	int program,
    	int location,
    	int count,
    	NativeLongArray values
    ) {
    	glProgramUniformHandleui64vARB(
    		program,
    		location,
    		count,
    		values.memorySegment()
    	);
    }
    
    public static byte glIsTextureHandleResidentARB(
    	long handle
    ) {
    	MethodHandle method = GLAD_GL_IS_TEXTURE_HANDLE_RESIDENT_ARB.get();
    	try {
    		return (byte) method.invokeExact(
    			handle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static byte glIsImageHandleResidentARB(
    	long handle
    ) {
    	MethodHandle method = GLAD_GL_IS_IMAGE_HANDLE_RESIDENT_ARB.get();
    	try {
    		return (byte) method.invokeExact(
    			handle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribL1ui64ARB(
    	int index,
    	long x
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_L1UI64_ARB.get();
    	try {
    		 method.invokeExact(
    			index,
    			x
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribL1ui64vARB(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_L1UI64V_ARB.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribL1ui64vARB].
    public static void glVertexAttribL1ui64vARB(
    	int index,
    	NativeLongArray v
    ) {
    	glVertexAttribL1ui64vARB(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glGetVertexAttribLui64vARB(
    	int index,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_VERTEX_ATTRIB_LUI64V_ARB.get();
    	try {
    		 method.invokeExact(
    			index,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetVertexAttribLui64vARB].
    public static void glGetVertexAttribLui64vARB(
    	int index,
    	int pname,
    	NativeLongArray params
    ) {
    	glGetVertexAttribLui64vARB(
    		index,
    		pname,
    		params.memorySegment()
    	);
    }

}