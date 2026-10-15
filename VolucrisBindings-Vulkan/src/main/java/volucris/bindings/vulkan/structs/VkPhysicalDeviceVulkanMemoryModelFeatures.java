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

public final class VkPhysicalDeviceVulkanMemoryModelFeatures
		implements Struct<VkPhysicalDeviceVulkanMemoryModelFeatures> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VULKAN_MEMORY_MODEL_HANDLE;
	public static final VarHandle VULKAN_MEMORY_MODEL_DEVICE_SCOPE_HANDLE;
	public static final VarHandle VULKAN_MEMORY_MODEL_AVAILABILITY_VISIBILITY_CHAINS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VULKAN_MEMORY_MODEL_BYTE_OFFSET;
	public static final long VULKAN_MEMORY_MODEL_DEVICE_SCOPE_BYTE_OFFSET;
	public static final long VULKAN_MEMORY_MODEL_AVAILABILITY_VISIBILITY_CHAINS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("vulkanMemoryModel"),
		    JAVA_INT.withName("vulkanMemoryModelDeviceScope"),
		    JAVA_INT.withName("vulkanMemoryModelAvailabilityVisibilityChains"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceVulkanMemoryModelFeatures").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VULKAN_MEMORY_MODEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vulkanMemoryModel"));
		VULKAN_MEMORY_MODEL_DEVICE_SCOPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
		VULKAN_MEMORY_MODEL_AVAILABILITY_VISIBILITY_CHAINS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VULKAN_MEMORY_MODEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModel"));
		VULKAN_MEMORY_MODEL_DEVICE_SCOPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
		VULKAN_MEMORY_MODEL_AVAILABILITY_VISIBILITY_CHAINS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
		//@formatter:on
	}

	public VkPhysicalDeviceVulkanMemoryModelFeatures() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceVulkanMemoryModelFeatures(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceVulkanMemoryModelFeatures(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceVulkanMemoryModelFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceVulkanMemoryModelFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #vulkanMemoryModel()
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModel(int vulkanMemoryModel) {
    	VULKAN_MEMORY_MODEL_HANDLE.set(segment, 0L, vulkanMemoryModel);
    	return this;
    }
    
    public int vulkanMemoryModel() {
    	return (int) VULKAN_MEMORY_MODEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #vulkanMemoryModelDeviceScope()
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelDeviceScope(int vulkanMemoryModelDeviceScope) {
    	VULKAN_MEMORY_MODEL_DEVICE_SCOPE_HANDLE.set(segment, 0L, vulkanMemoryModelDeviceScope);
    	return this;
    }
    
    public int vulkanMemoryModelDeviceScope() {
    	return (int) VULKAN_MEMORY_MODEL_DEVICE_SCOPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #vulkanMemoryModelAvailabilityVisibilityChains()
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelAvailabilityVisibilityChains(int vulkanMemoryModelAvailabilityVisibilityChains) {
    	VULKAN_MEMORY_MODEL_AVAILABILITY_VISIBILITY_CHAINS_HANDLE.set(segment, 0L, vulkanMemoryModelAvailabilityVisibilityChains);
    	return this;
    }
    
    public int vulkanMemoryModelAvailabilityVisibilityChains() {
    	return (int) VULKAN_MEMORY_MODEL_AVAILABILITY_VISIBILITY_CHAINS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceVulkanMemoryModelFeatures set(VkPhysicalDeviceVulkanMemoryModelFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceVulkanMemoryModelFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceVulkanMemoryModelFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkanMemoryModelFeatures> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkanMemoryModelFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkanMemoryModelFeatures> array(Arena arena, VkPhysicalDeviceVulkanMemoryModelFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceVulkanMemoryModelFeatures> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkanMemoryModelFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkanMemoryModelFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkanMemoryModelFeatures(segment)
        );
    }

}