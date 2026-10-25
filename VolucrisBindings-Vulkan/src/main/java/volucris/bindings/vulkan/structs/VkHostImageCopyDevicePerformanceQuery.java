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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkHostImageCopyDevicePerformanceQuery
		implements Struct<VkHostImageCopyDevicePerformanceQuery> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle OPTIMAL_DEVICE_ACCESS_HANDLE;
	public static final VarHandle IDENTICAL_MEMORY_LAYOUT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long OPTIMAL_DEVICE_ACCESS_BYTE_OFFSET;
	public static final long IDENTICAL_MEMORY_LAYOUT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("optimalDeviceAccess"),
		    JAVA_INT.withName("identicalMemoryLayout")
		).withName("VkHostImageCopyDevicePerformanceQuery").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		OPTIMAL_DEVICE_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("optimalDeviceAccess"));
		IDENTICAL_MEMORY_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("identicalMemoryLayout"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		OPTIMAL_DEVICE_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("optimalDeviceAccess"));
		IDENTICAL_MEMORY_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("identicalMemoryLayout"));
		//@formatter:on
	}

	public VkHostImageCopyDevicePerformanceQuery() {
	    this(Arena.ofAuto());
	}
	
	public VkHostImageCopyDevicePerformanceQuery(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkHostImageCopyDevicePerformanceQuery(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkHostImageCopyDevicePerformanceQuery sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkHostImageCopyDevicePerformanceQuery pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #optimalDeviceAccess()
    public VkHostImageCopyDevicePerformanceQuery optimalDeviceAccess(int optimalDeviceAccess) {
    	OPTIMAL_DEVICE_ACCESS_HANDLE.set(segment, 0L, optimalDeviceAccess);
    	return this;
    }
    
    public int optimalDeviceAccess() {
    	return (int) OPTIMAL_DEVICE_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #identicalMemoryLayout()
    public VkHostImageCopyDevicePerformanceQuery identicalMemoryLayout(int identicalMemoryLayout) {
    	IDENTICAL_MEMORY_LAYOUT_HANDLE.set(segment, 0L, identicalMemoryLayout);
    	return this;
    }
    
    public int identicalMemoryLayout() {
    	return (int) IDENTICAL_MEMORY_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkHostImageCopyDevicePerformanceQuery set(VkHostImageCopyDevicePerformanceQuery other) {
        return set(other.segment);
    }
    
    @Override
    public VkHostImageCopyDevicePerformanceQuery set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkHostImageCopyDevicePerformanceQuery> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkHostImageCopyDevicePerformanceQuery> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkHostImageCopyDevicePerformanceQuery(segment),
            count
        );
    }
    
    public static NativeStructArray<VkHostImageCopyDevicePerformanceQuery> array(SegmentAllocator allocator, VkHostImageCopyDevicePerformanceQuery... structs) {
        NativeStructArray<VkHostImageCopyDevicePerformanceQuery> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkHostImageCopyDevicePerformanceQuery(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkHostImageCopyDevicePerformanceQuery> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkHostImageCopyDevicePerformanceQuery(segment)
        );
    }

}