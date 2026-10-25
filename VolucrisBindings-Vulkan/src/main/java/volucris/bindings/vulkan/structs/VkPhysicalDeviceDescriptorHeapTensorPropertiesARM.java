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

public final class VkPhysicalDeviceDescriptorHeapTensorPropertiesARM
		implements Struct<VkPhysicalDeviceDescriptorHeapTensorPropertiesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TENSOR_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle TENSOR_DESCRIPTOR_ALIGNMENT_HANDLE;
	public static final VarHandle TENSOR_CAPTURE_REPLAY_OPAQUE_DATA_SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TENSOR_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long TENSOR_DESCRIPTOR_ALIGNMENT_BYTE_OFFSET;
	public static final long TENSOR_CAPTURE_REPLAY_OPAQUE_DATA_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("tensorDescriptorSize"),
		    JAVA_LONG.withName("tensorDescriptorAlignment"),
		    JAVA_LONG.withName("tensorCaptureReplayOpaqueDataSize")
		).withName("VkPhysicalDeviceDescriptorHeapTensorPropertiesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TENSOR_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tensorDescriptorSize"));
		TENSOR_DESCRIPTOR_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tensorDescriptorAlignment"));
		TENSOR_CAPTURE_REPLAY_OPAQUE_DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tensorCaptureReplayOpaqueDataSize"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TENSOR_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tensorDescriptorSize"));
		TENSOR_DESCRIPTOR_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tensorDescriptorAlignment"));
		TENSOR_CAPTURE_REPLAY_OPAQUE_DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tensorCaptureReplayOpaqueDataSize"));
		//@formatter:on
	}

	public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #tensorDescriptorSize()
    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM tensorDescriptorSize(long tensorDescriptorSize) {
    	TENSOR_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, tensorDescriptorSize);
    	return this;
    }
    
    public long tensorDescriptorSize() {
    	return (long) TENSOR_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #tensorDescriptorAlignment()
    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM tensorDescriptorAlignment(long tensorDescriptorAlignment) {
    	TENSOR_DESCRIPTOR_ALIGNMENT_HANDLE.set(segment, 0L, tensorDescriptorAlignment);
    	return this;
    }
    
    public long tensorDescriptorAlignment() {
    	return (long) TENSOR_DESCRIPTOR_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #tensorCaptureReplayOpaqueDataSize()
    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM tensorCaptureReplayOpaqueDataSize(long tensorCaptureReplayOpaqueDataSize) {
    	TENSOR_CAPTURE_REPLAY_OPAQUE_DATA_SIZE_HANDLE.set(segment, 0L, tensorCaptureReplayOpaqueDataSize);
    	return this;
    }
    
    public long tensorCaptureReplayOpaqueDataSize() {
    	return (long) TENSOR_CAPTURE_REPLAY_OPAQUE_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM set(VkPhysicalDeviceDescriptorHeapTensorPropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDescriptorHeapTensorPropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorHeapTensorPropertiesARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorHeapTensorPropertiesARM> array(SegmentAllocator allocator, VkPhysicalDeviceDescriptorHeapTensorPropertiesARM... structs) {
        NativeStructArray<VkPhysicalDeviceDescriptorHeapTensorPropertiesARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorHeapTensorPropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(segment)
        );
    }

}