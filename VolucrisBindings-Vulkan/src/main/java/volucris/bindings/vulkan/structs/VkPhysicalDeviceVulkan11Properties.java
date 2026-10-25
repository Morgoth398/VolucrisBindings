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

public final class VkPhysicalDeviceVulkan11Properties
		implements Struct<VkPhysicalDeviceVulkan11Properties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DEVICE_UUID_HANDLE;
	public static final VarHandle DRIVER_UUID_HANDLE;
	public static final VarHandle DEVICE_LUID_HANDLE;
	public static final VarHandle DEVICE_NODE_MASK_HANDLE;
	public static final VarHandle DEVICE_LUIDVALID_HANDLE;
	public static final VarHandle SUBGROUP_SIZE_HANDLE;
	public static final VarHandle SUBGROUP_SUPPORTED_STAGES_HANDLE;
	public static final VarHandle SUBGROUP_SUPPORTED_OPERATIONS_HANDLE;
	public static final VarHandle SUBGROUP_QUAD_OPERATIONS_IN_ALL_STAGES_HANDLE;
	public static final VarHandle POINT_CLIPPING_BEHAVIOR_HANDLE;
	public static final VarHandle MAX_MULTIVIEW_VIEW_COUNT_HANDLE;
	public static final VarHandle MAX_MULTIVIEW_INSTANCE_INDEX_HANDLE;
	public static final VarHandle PROTECTED_NO_FAULT_HANDLE;
	public static final VarHandle MAX_PER_SET_DESCRIPTORS_HANDLE;
	public static final VarHandle MAX_MEMORY_ALLOCATION_SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DEVICE_UUID_BYTE_OFFSET;
	public static final long DRIVER_UUID_BYTE_OFFSET;
	public static final long DEVICE_LUID_BYTE_OFFSET;
	public static final long DEVICE_NODE_MASK_BYTE_OFFSET;
	public static final long DEVICE_LUIDVALID_BYTE_OFFSET;
	public static final long SUBGROUP_SIZE_BYTE_OFFSET;
	public static final long SUBGROUP_SUPPORTED_STAGES_BYTE_OFFSET;
	public static final long SUBGROUP_SUPPORTED_OPERATIONS_BYTE_OFFSET;
	public static final long SUBGROUP_QUAD_OPERATIONS_IN_ALL_STAGES_BYTE_OFFSET;
	public static final long POINT_CLIPPING_BEHAVIOR_BYTE_OFFSET;
	public static final long MAX_MULTIVIEW_VIEW_COUNT_BYTE_OFFSET;
	public static final long MAX_MULTIVIEW_INSTANCE_INDEX_BYTE_OFFSET;
	public static final long PROTECTED_NO_FAULT_BYTE_OFFSET;
	public static final long MAX_PER_SET_DESCRIPTORS_BYTE_OFFSET;
	public static final long MAX_MEMORY_ALLOCATION_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("deviceUUID"),
		    MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("driverUUID"),
		    MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("deviceLUID"),
		    JAVA_INT.withName("deviceNodeMask"),
		    JAVA_INT.withName("deviceLUIDValid"),
		    JAVA_INT.withName("subgroupSize"),
		    JAVA_INT.withName("subgroupSupportedStages"),
		    JAVA_INT.withName("subgroupSupportedOperations"),
		    JAVA_INT.withName("subgroupQuadOperationsInAllStages"),
		    JAVA_INT.withName("pointClippingBehavior"),
		    JAVA_INT.withName("maxMultiviewViewCount"),
		    JAVA_INT.withName("maxMultiviewInstanceIndex"),
		    JAVA_INT.withName("protectedNoFault"),
		    JAVA_INT.withName("maxPerSetDescriptors"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("maxMemoryAllocationSize")
		).withName("VkPhysicalDeviceVulkan11Properties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DEVICE_UUID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceUUID"), PathElement.sequenceElement());
		DRIVER_UUID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("driverUUID"), PathElement.sequenceElement());
		DEVICE_LUID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceLUID"), PathElement.sequenceElement());
		DEVICE_NODE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceNodeMask"));
		DEVICE_LUIDVALID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceLUIDValid"));
		SUBGROUP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subgroupSize"));
		SUBGROUP_SUPPORTED_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subgroupSupportedStages"));
		SUBGROUP_SUPPORTED_OPERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subgroupSupportedOperations"));
		SUBGROUP_QUAD_OPERATIONS_IN_ALL_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subgroupQuadOperationsInAllStages"));
		POINT_CLIPPING_BEHAVIOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pointClippingBehavior"));
		MAX_MULTIVIEW_VIEW_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMultiviewViewCount"));
		MAX_MULTIVIEW_INSTANCE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMultiviewInstanceIndex"));
		PROTECTED_NO_FAULT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("protectedNoFault"));
		MAX_PER_SET_DESCRIPTORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerSetDescriptors"));
		MAX_MEMORY_ALLOCATION_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMemoryAllocationSize"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DEVICE_UUID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceUUID"));
		DRIVER_UUID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("driverUUID"));
		DEVICE_LUID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceLUID"));
		DEVICE_NODE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceNodeMask"));
		DEVICE_LUIDVALID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceLUIDValid"));
		SUBGROUP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subgroupSize"));
		SUBGROUP_SUPPORTED_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subgroupSupportedStages"));
		SUBGROUP_SUPPORTED_OPERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subgroupSupportedOperations"));
		SUBGROUP_QUAD_OPERATIONS_IN_ALL_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subgroupQuadOperationsInAllStages"));
		POINT_CLIPPING_BEHAVIOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pointClippingBehavior"));
		MAX_MULTIVIEW_VIEW_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMultiviewViewCount"));
		MAX_MULTIVIEW_INSTANCE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMultiviewInstanceIndex"));
		PROTECTED_NO_FAULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("protectedNoFault"));
		MAX_PER_SET_DESCRIPTORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerSetDescriptors"));
		MAX_MEMORY_ALLOCATION_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMemoryAllocationSize"));
		//@formatter:on
	}

	public VkPhysicalDeviceVulkan11Properties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceVulkan11Properties(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceVulkan11Properties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceVulkan11Properties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceVulkan11Properties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #deviceUUID(int)
    public VkPhysicalDeviceVulkan11Properties deviceUUID(byte deviceUUID, int index0) {
    	DEVICE_UUID_HANDLE.set(segment, 0L, index0, deviceUUID);
    	return this;
    }
    
    public byte deviceUUID(int index0) {
    	return (byte) DEVICE_UUID_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #driverUUID(int)
    public VkPhysicalDeviceVulkan11Properties driverUUID(byte driverUUID, int index0) {
    	DRIVER_UUID_HANDLE.set(segment, 0L, index0, driverUUID);
    	return this;
    }
    
    public byte driverUUID(int index0) {
    	return (byte) DRIVER_UUID_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #deviceLUID(int)
    public VkPhysicalDeviceVulkan11Properties deviceLUID(byte deviceLUID, int index0) {
    	DEVICE_LUID_HANDLE.set(segment, 0L, index0, deviceLUID);
    	return this;
    }
    
    public byte deviceLUID(int index0) {
    	return (byte) DEVICE_LUID_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #deviceNodeMask()
    public VkPhysicalDeviceVulkan11Properties deviceNodeMask(int deviceNodeMask) {
    	DEVICE_NODE_MASK_HANDLE.set(segment, 0L, deviceNodeMask);
    	return this;
    }
    
    public int deviceNodeMask() {
    	return (int) DEVICE_NODE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceLUIDValid()
    public VkPhysicalDeviceVulkan11Properties deviceLUIDValid(int deviceLUIDValid) {
    	DEVICE_LUIDVALID_HANDLE.set(segment, 0L, deviceLUIDValid);
    	return this;
    }
    
    public int deviceLUIDValid() {
    	return (int) DEVICE_LUIDVALID_HANDLE.get(segment, 0L);
    }
    
    /// @see #subgroupSize()
    public VkPhysicalDeviceVulkan11Properties subgroupSize(int subgroupSize) {
    	SUBGROUP_SIZE_HANDLE.set(segment, 0L, subgroupSize);
    	return this;
    }
    
    public int subgroupSize() {
    	return (int) SUBGROUP_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #subgroupSupportedStages()
    public VkPhysicalDeviceVulkan11Properties subgroupSupportedStages(int subgroupSupportedStages) {
    	SUBGROUP_SUPPORTED_STAGES_HANDLE.set(segment, 0L, subgroupSupportedStages);
    	return this;
    }
    
    public int subgroupSupportedStages() {
    	return (int) SUBGROUP_SUPPORTED_STAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #subgroupSupportedOperations()
    public VkPhysicalDeviceVulkan11Properties subgroupSupportedOperations(int subgroupSupportedOperations) {
    	SUBGROUP_SUPPORTED_OPERATIONS_HANDLE.set(segment, 0L, subgroupSupportedOperations);
    	return this;
    }
    
    public int subgroupSupportedOperations() {
    	return (int) SUBGROUP_SUPPORTED_OPERATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #subgroupQuadOperationsInAllStages()
    public VkPhysicalDeviceVulkan11Properties subgroupQuadOperationsInAllStages(int subgroupQuadOperationsInAllStages) {
    	SUBGROUP_QUAD_OPERATIONS_IN_ALL_STAGES_HANDLE.set(segment, 0L, subgroupQuadOperationsInAllStages);
    	return this;
    }
    
    public int subgroupQuadOperationsInAllStages() {
    	return (int) SUBGROUP_QUAD_OPERATIONS_IN_ALL_STAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #pointClippingBehavior()
    public VkPhysicalDeviceVulkan11Properties pointClippingBehavior(int pointClippingBehavior) {
    	POINT_CLIPPING_BEHAVIOR_HANDLE.set(segment, 0L, pointClippingBehavior);
    	return this;
    }
    
    public int pointClippingBehavior() {
    	return (int) POINT_CLIPPING_BEHAVIOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMultiviewViewCount()
    public VkPhysicalDeviceVulkan11Properties maxMultiviewViewCount(int maxMultiviewViewCount) {
    	MAX_MULTIVIEW_VIEW_COUNT_HANDLE.set(segment, 0L, maxMultiviewViewCount);
    	return this;
    }
    
    public int maxMultiviewViewCount() {
    	return (int) MAX_MULTIVIEW_VIEW_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMultiviewInstanceIndex()
    public VkPhysicalDeviceVulkan11Properties maxMultiviewInstanceIndex(int maxMultiviewInstanceIndex) {
    	MAX_MULTIVIEW_INSTANCE_INDEX_HANDLE.set(segment, 0L, maxMultiviewInstanceIndex);
    	return this;
    }
    
    public int maxMultiviewInstanceIndex() {
    	return (int) MAX_MULTIVIEW_INSTANCE_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #protectedNoFault()
    public VkPhysicalDeviceVulkan11Properties protectedNoFault(int protectedNoFault) {
    	PROTECTED_NO_FAULT_HANDLE.set(segment, 0L, protectedNoFault);
    	return this;
    }
    
    public int protectedNoFault() {
    	return (int) PROTECTED_NO_FAULT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerSetDescriptors()
    public VkPhysicalDeviceVulkan11Properties maxPerSetDescriptors(int maxPerSetDescriptors) {
    	MAX_PER_SET_DESCRIPTORS_HANDLE.set(segment, 0L, maxPerSetDescriptors);
    	return this;
    }
    
    public int maxPerSetDescriptors() {
    	return (int) MAX_PER_SET_DESCRIPTORS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMemoryAllocationSize()
    public VkPhysicalDeviceVulkan11Properties maxMemoryAllocationSize(long maxMemoryAllocationSize) {
    	MAX_MEMORY_ALLOCATION_SIZE_HANDLE.set(segment, 0L, maxMemoryAllocationSize);
    	return this;
    }
    
    public long maxMemoryAllocationSize() {
    	return (long) MAX_MEMORY_ALLOCATION_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceVulkan11Properties set(VkPhysicalDeviceVulkan11Properties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceVulkan11Properties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceVulkan11Properties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan11Properties> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan11Properties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan11Properties> array(SegmentAllocator allocator, VkPhysicalDeviceVulkan11Properties... structs) {
        NativeStructArray<VkPhysicalDeviceVulkan11Properties> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan11Properties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan11Properties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan11Properties(segment)
        );
    }

}