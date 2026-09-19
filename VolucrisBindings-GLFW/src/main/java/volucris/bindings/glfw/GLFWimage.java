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
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// @brief Image data.
/// 
/// This describes a single 2D image.  See the documentation for each related
/// function what the expected pixel format is.
/// 
/// @sa @ref cursor_custom
/// @sa @ref window_icon
/// 
/// @since Added in version 2.1.
/// @glfw3 Removed format and bytes-per-pixel members.
/// 
/// @ingroup window
/// ```
public final class GLFWimage
		implements Struct<GLFWimage> {

    public static final StructLayout LAYOUT;

    public static final VarHandle WIDTH_HANDLE;
    public static final VarHandle HEIGHT_HANDLE;
    public static final VarHandle PIXELS_HANDLE;

    public static final long WIDTH_BYTE_OFFSET;
    public static final long HEIGHT_BYTE_OFFSET;
    public static final long PIXELS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height"),
            UNBOUNDED_ADDRESS.withName("pixels")
        ).withName("GLFWimage").withByteAlignment(8);
        
        WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("width"));
        HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("height"));
        PIXELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pixels"));
        
        WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("width"));
        HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("height"));
        PIXELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pixels"));
        //@formatter:on
    }

    public GLFWimage() {
        this(Arena.ofAuto());
    }
    
    public GLFWimage(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public GLFWimage(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #width()
    public GLFWimage width(int width) {
    	WIDTH_HANDLE.set(segment, 0L, width);
    	return this;
    }
    
    /// ```
    /// The width, in pixels, of this image.
    /// ```
    public int width() {
    	return (int) WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #height()
    public GLFWimage height(int height) {
    	HEIGHT_HANDLE.set(segment, 0L, height);
    	return this;
    }
    
    /// ```
    /// The height, in pixels, of this image.
    /// ```
    public int height() {
    	return (int) HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pixels()
    public GLFWimage pixels(NativeByteArray pixels) {
    	PIXELS_HANDLE.set(segment, 0L, pixels.memorySegment());
    	return this;
    }
    
    /// ```
    /// The pixel data of this image, arranged left-to-right, top-to-bottom.
    /// ```
    public @Nullable NativeByteArray pixels() {
    	MemorySegment segment = (MemorySegment) PIXELS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    @Override
    public GLFWimage set(GLFWimage other) {
        return set(other.segment);
    }
    
    @Override
    public GLFWimage set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<GLFWimage> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<GLFWimage> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new GLFWimage(segment),
            count
        );
    }
    
    public static NativeStructArray<GLFWimage> array(Arena arena, GLFWimage... structs) {
        NativeStructArray<GLFWimage> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new GLFWimage(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<GLFWimage> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new GLFWimage(segment)
        );
    }
    
}