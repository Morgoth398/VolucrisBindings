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
/// @brief Gamepad input state
/// 
/// This describes the input state of a gamepad.
/// 
/// @sa @ref gamepad
/// @sa @ref glfwGetGamepadState
/// 
/// @since Added in version 3.3.
/// 
/// @ingroup input
/// ```
public final class GLFWgamepadstate
		implements Struct<GLFWgamepadstate> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BUTTONS_HANDLE;
    public static final VarHandle AXES_HANDLE;

    public static final long BUTTONS_BYTE_OFFSET;
    public static final long AXES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(15, JAVA_BYTE).withName("buttons"),
            MemoryLayout.paddingLayout(1),
            MemoryLayout.sequenceLayout(6, JAVA_FLOAT).withName("axes")
        ).withName("GLFWgamepadstate").withByteAlignment(4);
        
        BUTTONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("buttons"), PathElement.sequenceElement());
        AXES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("axes"), PathElement.sequenceElement());
        
        BUTTONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("buttons"));
        AXES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axes"));
        //@formatter:on
    }

    public GLFWgamepadstate() {
        this(Arena.ofAuto());
    }
    
    public GLFWgamepadstate(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public GLFWgamepadstate(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #buttons(int)
    public GLFWgamepadstate buttons(byte buttons, int index0) {
    	BUTTONS_HANDLE.set(segment, 0L, index0, buttons);
    	return this;
    }
    
    /// ```
    /// The states of each [gamepad button](@ref gamepad_buttons), `GLFW_PRESS`
    /// or `GLFW_RELEASE`.
    /// ```
    public byte buttons(int index0) {
    	return (byte) BUTTONS_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #axes(int)
    public GLFWgamepadstate axes(float axes, int index0) {
    	AXES_HANDLE.set(segment, 0L, index0, axes);
    	return this;
    }
    
    /// ```
    /// The states of each [gamepad axis](@ref gamepad_axes), in the range -1.0
    /// to 1.0 inclusive.
    /// ```
    public float axes(int index0) {
    	return (float) AXES_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public GLFWgamepadstate set(GLFWgamepadstate other) {
        return set(other.segment);
    }
    
    @Override
    public GLFWgamepadstate set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<GLFWgamepadstate> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<GLFWgamepadstate> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new GLFWgamepadstate(segment),
            count
        );
    }
    
    public static NativeStructArray<GLFWgamepadstate> array(Arena arena, GLFWgamepadstate... structs) {
        NativeStructArray<GLFWgamepadstate> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new GLFWgamepadstate(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<GLFWgamepadstate> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new GLFWgamepadstate(segment)
        );
    }
    
}