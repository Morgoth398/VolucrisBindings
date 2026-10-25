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

public final class VkPhysicalDeviceMaintenance7PropertiesKHR
		implements Struct<VkPhysicalDeviceMaintenance7PropertiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ROBUST_FRAGMENT_SHADING_RATE_ATTACHMENT_ACCESS_HANDLE;
	public static final VarHandle SEPARATE_DEPTH_STENCIL_ATTACHMENT_ACCESS_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_TOTAL_UNIFORM_BUFFERS_DYNAMIC_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_TOTAL_STORAGE_BUFFERS_DYNAMIC_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_TOTAL_BUFFERS_DYNAMIC_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_UNIFORM_BUFFERS_DYNAMIC_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_STORAGE_BUFFERS_DYNAMIC_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_BUFFERS_DYNAMIC_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ROBUST_FRAGMENT_SHADING_RATE_ATTACHMENT_ACCESS_BYTE_OFFSET;
	public static final long SEPARATE_DEPTH_STENCIL_ATTACHMENT_ACCESS_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_TOTAL_UNIFORM_BUFFERS_DYNAMIC_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_TOTAL_STORAGE_BUFFERS_DYNAMIC_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_TOTAL_BUFFERS_DYNAMIC_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_UNIFORM_BUFFERS_DYNAMIC_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_STORAGE_BUFFERS_DYNAMIC_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_BUFFERS_DYNAMIC_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("robustFragmentShadingRateAttachmentAccess"),
		    JAVA_INT.withName("separateDepthStencilAttachmentAccess"),
		    JAVA_INT.withName("maxDescriptorSetTotalUniformBuffersDynamic"),
		    JAVA_INT.withName("maxDescriptorSetTotalStorageBuffersDynamic"),
		    JAVA_INT.withName("maxDescriptorSetTotalBuffersDynamic"),
		    JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic"),
		    JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic"),
		    JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic")
		).withName("VkPhysicalDeviceMaintenance7PropertiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ROBUST_FRAGMENT_SHADING_RATE_ATTACHMENT_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("robustFragmentShadingRateAttachmentAccess"));
		SEPARATE_DEPTH_STENCIL_ATTACHMENT_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("separateDepthStencilAttachmentAccess"));
		MAX_DESCRIPTOR_SET_TOTAL_UNIFORM_BUFFERS_DYNAMIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetTotalUniformBuffersDynamic"));
		MAX_DESCRIPTOR_SET_TOTAL_STORAGE_BUFFERS_DYNAMIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetTotalStorageBuffersDynamic"));
		MAX_DESCRIPTOR_SET_TOTAL_BUFFERS_DYNAMIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetTotalBuffersDynamic"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_UNIFORM_BUFFERS_DYNAMIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_STORAGE_BUFFERS_DYNAMIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_BUFFERS_DYNAMIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ROBUST_FRAGMENT_SHADING_RATE_ATTACHMENT_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("robustFragmentShadingRateAttachmentAccess"));
		SEPARATE_DEPTH_STENCIL_ATTACHMENT_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("separateDepthStencilAttachmentAccess"));
		MAX_DESCRIPTOR_SET_TOTAL_UNIFORM_BUFFERS_DYNAMIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetTotalUniformBuffersDynamic"));
		MAX_DESCRIPTOR_SET_TOTAL_STORAGE_BUFFERS_DYNAMIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetTotalStorageBuffersDynamic"));
		MAX_DESCRIPTOR_SET_TOTAL_BUFFERS_DYNAMIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetTotalBuffersDynamic"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_UNIFORM_BUFFERS_DYNAMIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_STORAGE_BUFFERS_DYNAMIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_BUFFERS_DYNAMIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic"));
		//@formatter:on
	}

	public VkPhysicalDeviceMaintenance7PropertiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceMaintenance7PropertiesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceMaintenance7PropertiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceMaintenance7PropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMaintenance7PropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #robustFragmentShadingRateAttachmentAccess()
    public VkPhysicalDeviceMaintenance7PropertiesKHR robustFragmentShadingRateAttachmentAccess(int robustFragmentShadingRateAttachmentAccess) {
    	ROBUST_FRAGMENT_SHADING_RATE_ATTACHMENT_ACCESS_HANDLE.set(segment, 0L, robustFragmentShadingRateAttachmentAccess);
    	return this;
    }
    
    public int robustFragmentShadingRateAttachmentAccess() {
    	return (int) ROBUST_FRAGMENT_SHADING_RATE_ATTACHMENT_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #separateDepthStencilAttachmentAccess()
    public VkPhysicalDeviceMaintenance7PropertiesKHR separateDepthStencilAttachmentAccess(int separateDepthStencilAttachmentAccess) {
    	SEPARATE_DEPTH_STENCIL_ATTACHMENT_ACCESS_HANDLE.set(segment, 0L, separateDepthStencilAttachmentAccess);
    	return this;
    }
    
    public int separateDepthStencilAttachmentAccess() {
    	return (int) SEPARATE_DEPTH_STENCIL_ATTACHMENT_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetTotalUniformBuffersDynamic()
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalUniformBuffersDynamic(int maxDescriptorSetTotalUniformBuffersDynamic) {
    	MAX_DESCRIPTOR_SET_TOTAL_UNIFORM_BUFFERS_DYNAMIC_HANDLE.set(segment, 0L, maxDescriptorSetTotalUniformBuffersDynamic);
    	return this;
    }
    
    public int maxDescriptorSetTotalUniformBuffersDynamic() {
    	return (int) MAX_DESCRIPTOR_SET_TOTAL_UNIFORM_BUFFERS_DYNAMIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetTotalStorageBuffersDynamic()
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalStorageBuffersDynamic(int maxDescriptorSetTotalStorageBuffersDynamic) {
    	MAX_DESCRIPTOR_SET_TOTAL_STORAGE_BUFFERS_DYNAMIC_HANDLE.set(segment, 0L, maxDescriptorSetTotalStorageBuffersDynamic);
    	return this;
    }
    
    public int maxDescriptorSetTotalStorageBuffersDynamic() {
    	return (int) MAX_DESCRIPTOR_SET_TOTAL_STORAGE_BUFFERS_DYNAMIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetTotalBuffersDynamic()
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalBuffersDynamic(int maxDescriptorSetTotalBuffersDynamic) {
    	MAX_DESCRIPTOR_SET_TOTAL_BUFFERS_DYNAMIC_HANDLE.set(segment, 0L, maxDescriptorSetTotalBuffersDynamic);
    	return this;
    }
    
    public int maxDescriptorSetTotalBuffersDynamic() {
    	return (int) MAX_DESCRIPTOR_SET_TOTAL_BUFFERS_DYNAMIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic()
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_UNIFORM_BUFFERS_DYNAMIC_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_UNIFORM_BUFFERS_DYNAMIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic()
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_STORAGE_BUFFERS_DYNAMIC_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_STORAGE_BUFFERS_DYNAMIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindTotalBuffersDynamic()
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(int maxDescriptorSetUpdateAfterBindTotalBuffersDynamic) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_BUFFERS_DYNAMIC_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindTotalBuffersDynamic);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindTotalBuffersDynamic() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_TOTAL_BUFFERS_DYNAMIC_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance7PropertiesKHR set(VkPhysicalDeviceMaintenance7PropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance7PropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMaintenance7PropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance7PropertiesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance7PropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance7PropertiesKHR> array(SegmentAllocator allocator, VkPhysicalDeviceMaintenance7PropertiesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceMaintenance7PropertiesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance7PropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance7PropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance7PropertiesKHR(segment)
        );
    }

}