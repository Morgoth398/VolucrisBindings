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

public final class VkExternalComputeQueueDeviceCreateInfoNV
		implements Struct<VkExternalComputeQueueDeviceCreateInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle RESERVED_EXTERNAL_QUEUES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long RESERVED_EXTERNAL_QUEUES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("reservedExternalQueues"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkExternalComputeQueueDeviceCreateInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		RESERVED_EXTERNAL_QUEUES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reservedExternalQueues"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		RESERVED_EXTERNAL_QUEUES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reservedExternalQueues"));
		//@formatter:on
	}

	public VkExternalComputeQueueDeviceCreateInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkExternalComputeQueueDeviceCreateInfoNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkExternalComputeQueueDeviceCreateInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkExternalComputeQueueDeviceCreateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkExternalComputeQueueDeviceCreateInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #reservedExternalQueues()
    public VkExternalComputeQueueDeviceCreateInfoNV reservedExternalQueues(int reservedExternalQueues) {
    	RESERVED_EXTERNAL_QUEUES_HANDLE.set(segment, 0L, reservedExternalQueues);
    	return this;
    }
    
    public int reservedExternalQueues() {
    	return (int) RESERVED_EXTERNAL_QUEUES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkExternalComputeQueueDeviceCreateInfoNV set(VkExternalComputeQueueDeviceCreateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkExternalComputeQueueDeviceCreateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkExternalComputeQueueDeviceCreateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkExternalComputeQueueDeviceCreateInfoNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkExternalComputeQueueDeviceCreateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkExternalComputeQueueDeviceCreateInfoNV> array(SegmentAllocator allocator, VkExternalComputeQueueDeviceCreateInfoNV... structs) {
        NativeStructArray<VkExternalComputeQueueDeviceCreateInfoNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkExternalComputeQueueDeviceCreateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkExternalComputeQueueDeviceCreateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkExternalComputeQueueDeviceCreateInfoNV(segment)
        );
    }

}