/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
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

public final class VkPhysicalDeviceDescriptorBufferTensorPropertiesARM
		implements Struct<VkPhysicalDeviceDescriptorBufferTensorPropertiesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TENSOR_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE;
	public static final VarHandle TENSOR_VIEW_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE;
	public static final VarHandle TENSOR_DESCRIPTOR_SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TENSOR_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_BYTE_OFFSET;
	public static final long TENSOR_VIEW_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_BYTE_OFFSET;
	public static final long TENSOR_DESCRIPTOR_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("tensorCaptureReplayDescriptorDataSize"),
		    JAVA_LONG.withName("tensorViewCaptureReplayDescriptorDataSize"),
		    JAVA_LONG.withName("tensorDescriptorSize")
		).withName("VkPhysicalDeviceDescriptorBufferTensorPropertiesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TENSOR_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tensorCaptureReplayDescriptorDataSize"));
		TENSOR_VIEW_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tensorViewCaptureReplayDescriptorDataSize"));
		TENSOR_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tensorDescriptorSize"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TENSOR_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tensorCaptureReplayDescriptorDataSize"));
		TENSOR_VIEW_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tensorViewCaptureReplayDescriptorDataSize"));
		TENSOR_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tensorDescriptorSize"));
		//@formatter:on
	}

	public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #tensorCaptureReplayDescriptorDataSize()
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorCaptureReplayDescriptorDataSize(long tensorCaptureReplayDescriptorDataSize) {
    	TENSOR_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE.set(segment, 0L, tensorCaptureReplayDescriptorDataSize);
    	return this;
    }
    
    public long tensorCaptureReplayDescriptorDataSize() {
    	return (long) TENSOR_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #tensorViewCaptureReplayDescriptorDataSize()
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorViewCaptureReplayDescriptorDataSize(long tensorViewCaptureReplayDescriptorDataSize) {
    	TENSOR_VIEW_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE.set(segment, 0L, tensorViewCaptureReplayDescriptorDataSize);
    	return this;
    }
    
    public long tensorViewCaptureReplayDescriptorDataSize() {
    	return (long) TENSOR_VIEW_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #tensorDescriptorSize()
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorDescriptorSize(long tensorDescriptorSize) {
    	TENSOR_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, tensorDescriptorSize);
    	return this;
    }
    
    public long tensorDescriptorSize() {
    	return (long) TENSOR_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM set(VkPhysicalDeviceDescriptorBufferTensorPropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDescriptorBufferTensorPropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorBufferTensorPropertiesARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorBufferTensorPropertiesARM> array(Arena arena, VkPhysicalDeviceDescriptorBufferTensorPropertiesARM... structs) {
        NativeStructArray<VkPhysicalDeviceDescriptorBufferTensorPropertiesARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorBufferTensorPropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(segment)
        );
    }

}