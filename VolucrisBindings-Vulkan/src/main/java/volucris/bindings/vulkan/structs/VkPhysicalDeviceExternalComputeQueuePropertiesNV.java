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

public final class VkPhysicalDeviceExternalComputeQueuePropertiesNV
		implements Struct<VkPhysicalDeviceExternalComputeQueuePropertiesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle EXTERNAL_DATA_SIZE_HANDLE;
	public static final VarHandle MAX_EXTERNAL_QUEUES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long EXTERNAL_DATA_SIZE_BYTE_OFFSET;
	public static final long MAX_EXTERNAL_QUEUES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("externalDataSize"),
		    JAVA_INT.withName("maxExternalQueues")
		).withName("VkPhysicalDeviceExternalComputeQueuePropertiesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		EXTERNAL_DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("externalDataSize"));
		MAX_EXTERNAL_QUEUES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxExternalQueues"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		EXTERNAL_DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("externalDataSize"));
		MAX_EXTERNAL_QUEUES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxExternalQueues"));
		//@formatter:on
	}

	public VkPhysicalDeviceExternalComputeQueuePropertiesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceExternalComputeQueuePropertiesNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceExternalComputeQueuePropertiesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #externalDataSize()
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV externalDataSize(int externalDataSize) {
    	EXTERNAL_DATA_SIZE_HANDLE.set(segment, 0L, externalDataSize);
    	return this;
    }
    
    public int externalDataSize() {
    	return (int) EXTERNAL_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxExternalQueues()
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV maxExternalQueues(int maxExternalQueues) {
    	MAX_EXTERNAL_QUEUES_HANDLE.set(segment, 0L, maxExternalQueues);
    	return this;
    }
    
    public int maxExternalQueues() {
    	return (int) MAX_EXTERNAL_QUEUES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV set(VkPhysicalDeviceExternalComputeQueuePropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceExternalComputeQueuePropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceExternalComputeQueuePropertiesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceExternalComputeQueuePropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceExternalComputeQueuePropertiesNV> array(Arena arena, VkPhysicalDeviceExternalComputeQueuePropertiesNV... structs) {
        NativeStructArray<VkPhysicalDeviceExternalComputeQueuePropertiesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceExternalComputeQueuePropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceExternalComputeQueuePropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceExternalComputeQueuePropertiesNV(segment)
        );
    }

}