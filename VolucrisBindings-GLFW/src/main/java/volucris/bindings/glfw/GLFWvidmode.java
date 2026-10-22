/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.glfw;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// @brief Video mode type.
/// 
/// This describes a single video mode.
/// 
/// @sa @ref monitor_modes
/// @sa @ref glfwGetVideoMode
/// @sa @ref glfwGetVideoModes
/// 
/// @since Added in version 1.0.
/// __GLFW 3:__ Added refresh rate member.
/// 
/// @ingroup monitor
/// ```
public final class GLFWvidmode
		implements Struct<GLFWvidmode> {

	public static final StructLayout LAYOUT;

	public static final VarHandle WIDTH_HANDLE;
	public static final VarHandle HEIGHT_HANDLE;
	public static final VarHandle RED_BITS_HANDLE;
	public static final VarHandle GREEN_BITS_HANDLE;
	public static final VarHandle BLUE_BITS_HANDLE;
	public static final VarHandle REFRESH_RATE_HANDLE;

	public static final long WIDTH_BYTE_OFFSET;
	public static final long HEIGHT_BYTE_OFFSET;
	public static final long RED_BITS_BYTE_OFFSET;
	public static final long GREEN_BITS_BYTE_OFFSET;
	public static final long BLUE_BITS_BYTE_OFFSET;
	public static final long REFRESH_RATE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("width"),
		    JAVA_INT.withName("height"),
		    JAVA_INT.withName("redBits"),
		    JAVA_INT.withName("greenBits"),
		    JAVA_INT.withName("blueBits"),
		    JAVA_INT.withName("refreshRate")
		).withName("GLFWvidmode").withByteAlignment(4);
		
		WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("width"));
		HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("height"));
		RED_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("redBits"));
		GREEN_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("greenBits"));
		BLUE_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blueBits"));
		REFRESH_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("refreshRate"));
		
		WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("width"));
		HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("height"));
		RED_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("redBits"));
		GREEN_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("greenBits"));
		BLUE_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blueBits"));
		REFRESH_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("refreshRate"));
		//@formatter:on
	}

	public GLFWvidmode() {
	    this(Arena.ofAuto());
	}
	
	public GLFWvidmode(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public GLFWvidmode(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #width()
    public GLFWvidmode width(int width) {
    	WIDTH_HANDLE.set(segment, 0L, width);
    	return this;
    }
    
    /// ```
    /// The width, in screen coordinates, of the video mode.
    /// ```
    public int width() {
    	return (int) WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #height()
    public GLFWvidmode height(int height) {
    	HEIGHT_HANDLE.set(segment, 0L, height);
    	return this;
    }
    
    /// ```
    /// The height, in screen coordinates, of the video mode.
    /// ```
    public int height() {
    	return (int) HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #redBits()
    public GLFWvidmode redBits(int redBits) {
    	RED_BITS_HANDLE.set(segment, 0L, redBits);
    	return this;
    }
    
    /// ```
    /// The bit depth of the red channel of the video mode.
    /// ```
    public int redBits() {
    	return (int) RED_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #greenBits()
    public GLFWvidmode greenBits(int greenBits) {
    	GREEN_BITS_HANDLE.set(segment, 0L, greenBits);
    	return this;
    }
    
    /// ```
    /// The bit depth of the green channel of the video mode.
    /// ```
    public int greenBits() {
    	return (int) GREEN_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #blueBits()
    public GLFWvidmode blueBits(int blueBits) {
    	BLUE_BITS_HANDLE.set(segment, 0L, blueBits);
    	return this;
    }
    
    /// ```
    /// The bit depth of the blue channel of the video mode.
    /// ```
    public int blueBits() {
    	return (int) BLUE_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #refreshRate()
    public GLFWvidmode refreshRate(int refreshRate) {
    	REFRESH_RATE_HANDLE.set(segment, 0L, refreshRate);
    	return this;
    }
    
    /// ```
    /// The refresh rate, in Hz, of the video mode.
    /// ```
    public int refreshRate() {
    	return (int) REFRESH_RATE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public GLFWvidmode set(GLFWvidmode other) {
        return set(other.segment);
    }
    
    @Override
    public GLFWvidmode set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<GLFWvidmode> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<GLFWvidmode> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new GLFWvidmode(segment),
            count
        );
    }
    
    public static NativeStructArray<GLFWvidmode> array(Arena arena, GLFWvidmode... structs) {
        NativeStructArray<GLFWvidmode> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new GLFWvidmode(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<GLFWvidmode> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new GLFWvidmode(segment)
        );
    }

}