/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkCoarseSampleLocationNV
		implements Struct<VkCoarseSampleLocationNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PIXEL_X_HANDLE;
	public static final VarHandle PIXEL_Y_HANDLE;
	public static final VarHandle SAMPLE_HANDLE;

	public static final long PIXEL_X_BYTE_OFFSET;
	public static final long PIXEL_Y_BYTE_OFFSET;
	public static final long SAMPLE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("pixelX"),
		    JAVA_INT.withName("pixelY"),
		    JAVA_INT.withName("sample")
		).withName("VkCoarseSampleLocationNV").withByteAlignment(4);
		
		PIXEL_X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pixelX"));
		PIXEL_Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pixelY"));
		SAMPLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sample"));
		
		PIXEL_X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pixelX"));
		PIXEL_Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pixelY"));
		SAMPLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sample"));
		//@formatter:on
	}

	public VkCoarseSampleLocationNV() {
	    this(Arena.ofAuto());
	}
	
	public VkCoarseSampleLocationNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkCoarseSampleLocationNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #pixelX()
    public VkCoarseSampleLocationNV pixelX(int pixelX) {
    	PIXEL_X_HANDLE.set(segment, 0L, pixelX);
    	return this;
    }
    
    public int pixelX() {
    	return (int) PIXEL_X_HANDLE.get(segment, 0L);
    }
    
    /// @see #pixelY()
    public VkCoarseSampleLocationNV pixelY(int pixelY) {
    	PIXEL_Y_HANDLE.set(segment, 0L, pixelY);
    	return this;
    }
    
    public int pixelY() {
    	return (int) PIXEL_Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #sample()
    public VkCoarseSampleLocationNV sample(int sample) {
    	SAMPLE_HANDLE.set(segment, 0L, sample);
    	return this;
    }
    
    public int sample() {
    	return (int) SAMPLE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkCoarseSampleLocationNV set(VkCoarseSampleLocationNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkCoarseSampleLocationNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCoarseSampleLocationNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCoarseSampleLocationNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCoarseSampleLocationNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCoarseSampleLocationNV> array(SegmentAllocator allocator, VkCoarseSampleLocationNV... structs) {
        NativeStructArray<VkCoarseSampleLocationNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCoarseSampleLocationNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCoarseSampleLocationNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCoarseSampleLocationNV(segment)
        );
    }

}