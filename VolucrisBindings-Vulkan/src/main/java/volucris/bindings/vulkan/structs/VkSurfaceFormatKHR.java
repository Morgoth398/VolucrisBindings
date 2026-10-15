/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkSurfaceFormatKHR
		implements Struct<VkSurfaceFormatKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle COLOR_SPACE_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long COLOR_SPACE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("colorSpace")
		).withName("VkSurfaceFormatKHR").withByteAlignment(4);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		COLOR_SPACE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("colorSpace"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		COLOR_SPACE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("colorSpace"));
		//@formatter:on
	}

	public VkSurfaceFormatKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkSurfaceFormatKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSurfaceFormatKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #format()
    public VkSurfaceFormatKHR format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #colorSpace()
    public VkSurfaceFormatKHR colorSpace(int colorSpace) {
    	COLOR_SPACE_HANDLE.set(segment, 0L, colorSpace);
    	return this;
    }
    
    public int colorSpace() {
    	return (int) COLOR_SPACE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSurfaceFormatKHR set(VkSurfaceFormatKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkSurfaceFormatKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSurfaceFormatKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSurfaceFormatKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSurfaceFormatKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSurfaceFormatKHR> array(Arena arena, VkSurfaceFormatKHR... structs) {
        NativeStructArray<VkSurfaceFormatKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSurfaceFormatKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSurfaceFormatKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSurfaceFormatKHR(segment)
        );
    }

}