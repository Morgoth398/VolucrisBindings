/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.glfw;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeShortArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// @brief Gamma ramp.
/// 
/// This describes the gamma ramp for a monitor.
/// 
/// @sa @ref monitor_gamma
/// @sa @ref glfwGetGammaRamp
/// @sa @ref glfwSetGammaRamp
/// 
/// @since Added in version 3.0.
/// 
/// @ingroup monitor
/// ```
public final class GLFWgammaramp
		implements Struct<GLFWgammaramp> {

    public static final StructLayout LAYOUT;

    public static final VarHandle RED_HANDLE;
    public static final VarHandle GREEN_HANDLE;
    public static final VarHandle BLUE_HANDLE;
    public static final VarHandle SIZE_HANDLE;

    public static final long RED_BYTE_OFFSET;
    public static final long GREEN_BYTE_OFFSET;
    public static final long BLUE_BYTE_OFFSET;
    public static final long SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("red"),
            UNBOUNDED_ADDRESS.withName("green"),
            UNBOUNDED_ADDRESS.withName("blue"),
            JAVA_INT.withName("size"),
            MemoryLayout.paddingLayout(4)
        ).withName("GLFWgammaramp").withByteAlignment(8);
        
        RED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("red"));
        GREEN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("green"));
        BLUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blue"));
        SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
        
        RED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("red"));
        GREEN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("green"));
        BLUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blue"));
        SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
        //@formatter:on
    }

    public GLFWgammaramp() {
        this(Arena.ofAuto());
    }
    
    public GLFWgammaramp(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public GLFWgammaramp(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #red()
    public GLFWgammaramp red(NativeShortArray red) {
    	RED_HANDLE.set(segment, 0L, red.memorySegment());
    	return this;
    }
    
    /// ```
    /// An array of value describing the response of the red channel.
    /// ```
    public @Nullable NativeShortArray red() {
    	MemorySegment segment = (MemorySegment) RED_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeShortArray(segment);
    }
    
    /// @see #green()
    public GLFWgammaramp green(NativeShortArray green) {
    	GREEN_HANDLE.set(segment, 0L, green.memorySegment());
    	return this;
    }
    
    /// ```
    /// An array of value describing the response of the green channel.
    /// ```
    public @Nullable NativeShortArray green() {
    	MemorySegment segment = (MemorySegment) GREEN_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeShortArray(segment);
    }
    
    /// @see #blue()
    public GLFWgammaramp blue(NativeShortArray blue) {
    	BLUE_HANDLE.set(segment, 0L, blue.memorySegment());
    	return this;
    }
    
    /// ```
    /// An array of value describing the response of the blue channel.
    /// ```
    public @Nullable NativeShortArray blue() {
    	MemorySegment segment = (MemorySegment) BLUE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeShortArray(segment);
    }
    
    /// @see #size()
    public GLFWgammaramp size(int size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    /// ```
    /// The number of elements in each array.
    /// ```
    public int size() {
    	return (int) SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public GLFWgammaramp set(GLFWgammaramp other) {
        return set(other.segment);
    }
    
    @Override
    public GLFWgammaramp set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<GLFWgammaramp> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<GLFWgammaramp> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new GLFWgammaramp(segment),
            count
        );
    }
    
    public static NativeStructArray<GLFWgammaramp> array(Arena arena, GLFWgammaramp... structs) {
        NativeStructArray<GLFWgammaramp> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new GLFWgammaramp(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<GLFWgammaramp> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new GLFWgammaramp(segment)
        );
    }
    
}