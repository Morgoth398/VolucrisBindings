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

public final class VkMicromapUsageKHR
		implements Struct<VkMicromapUsageKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle COUNT_HANDLE;
	public static final VarHandle SUBDIVISION_LEVEL_HANDLE;
	public static final VarHandle FORMAT_HANDLE;

	public static final long COUNT_BYTE_OFFSET;
	public static final long SUBDIVISION_LEVEL_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("count"),
		    JAVA_INT.withName("subdivisionLevel"),
		    JAVA_INT.withName("format")
		).withName("VkMicromapUsageKHR").withByteAlignment(4);
		
		COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("count"));
		SUBDIVISION_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subdivisionLevel"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		
		COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("count"));
		SUBDIVISION_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subdivisionLevel"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		//@formatter:on
	}

	public VkMicromapUsageKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkMicromapUsageKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkMicromapUsageKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #count()
    public VkMicromapUsageKHR count(int count) {
    	COUNT_HANDLE.set(segment, 0L, count);
    	return this;
    }
    
    public int count() {
    	return (int) COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #subdivisionLevel()
    public VkMicromapUsageKHR subdivisionLevel(int subdivisionLevel) {
    	SUBDIVISION_LEVEL_HANDLE.set(segment, 0L, subdivisionLevel);
    	return this;
    }
    
    public int subdivisionLevel() {
    	return (int) SUBDIVISION_LEVEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #format()
    public VkMicromapUsageKHR format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMicromapUsageKHR set(VkMicromapUsageKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkMicromapUsageKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMicromapUsageKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMicromapUsageKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkMicromapUsageKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMicromapUsageKHR> array(SegmentAllocator allocator, VkMicromapUsageKHR... structs) {
        NativeStructArray<VkMicromapUsageKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkMicromapUsageKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMicromapUsageKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMicromapUsageKHR(segment)
        );
    }

}