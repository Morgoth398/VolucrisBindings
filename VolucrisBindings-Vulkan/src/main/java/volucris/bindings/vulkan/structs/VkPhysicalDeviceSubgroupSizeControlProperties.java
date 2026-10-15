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

public final class VkPhysicalDeviceSubgroupSizeControlProperties
		implements Struct<VkPhysicalDeviceSubgroupSizeControlProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MIN_SUBGROUP_SIZE_HANDLE;
	public static final VarHandle MAX_SUBGROUP_SIZE_HANDLE;
	public static final VarHandle MAX_COMPUTE_WORKGROUP_SUBGROUPS_HANDLE;
	public static final VarHandle REQUIRED_SUBGROUP_SIZE_STAGES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MIN_SUBGROUP_SIZE_BYTE_OFFSET;
	public static final long MAX_SUBGROUP_SIZE_BYTE_OFFSET;
	public static final long MAX_COMPUTE_WORKGROUP_SUBGROUPS_BYTE_OFFSET;
	public static final long REQUIRED_SUBGROUP_SIZE_STAGES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("minSubgroupSize"),
		    JAVA_INT.withName("maxSubgroupSize"),
		    JAVA_INT.withName("maxComputeWorkgroupSubgroups"),
		    JAVA_INT.withName("requiredSubgroupSizeStages")
		).withName("VkPhysicalDeviceSubgroupSizeControlProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MIN_SUBGROUP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minSubgroupSize"));
		MAX_SUBGROUP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSubgroupSize"));
		MAX_COMPUTE_WORKGROUP_SUBGROUPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxComputeWorkgroupSubgroups"));
		REQUIRED_SUBGROUP_SIZE_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("requiredSubgroupSizeStages"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MIN_SUBGROUP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minSubgroupSize"));
		MAX_SUBGROUP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSubgroupSize"));
		MAX_COMPUTE_WORKGROUP_SUBGROUPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkgroupSubgroups"));
		REQUIRED_SUBGROUP_SIZE_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("requiredSubgroupSizeStages"));
		//@formatter:on
	}

	public VkPhysicalDeviceSubgroupSizeControlProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceSubgroupSizeControlProperties(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceSubgroupSizeControlProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceSubgroupSizeControlProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceSubgroupSizeControlProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #minSubgroupSize()
    public VkPhysicalDeviceSubgroupSizeControlProperties minSubgroupSize(int minSubgroupSize) {
    	MIN_SUBGROUP_SIZE_HANDLE.set(segment, 0L, minSubgroupSize);
    	return this;
    }
    
    public int minSubgroupSize() {
    	return (int) MIN_SUBGROUP_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSubgroupSize()
    public VkPhysicalDeviceSubgroupSizeControlProperties maxSubgroupSize(int maxSubgroupSize) {
    	MAX_SUBGROUP_SIZE_HANDLE.set(segment, 0L, maxSubgroupSize);
    	return this;
    }
    
    public int maxSubgroupSize() {
    	return (int) MAX_SUBGROUP_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxComputeWorkgroupSubgroups()
    public VkPhysicalDeviceSubgroupSizeControlProperties maxComputeWorkgroupSubgroups(int maxComputeWorkgroupSubgroups) {
    	MAX_COMPUTE_WORKGROUP_SUBGROUPS_HANDLE.set(segment, 0L, maxComputeWorkgroupSubgroups);
    	return this;
    }
    
    public int maxComputeWorkgroupSubgroups() {
    	return (int) MAX_COMPUTE_WORKGROUP_SUBGROUPS_HANDLE.get(segment, 0L);
    }
    
    /// @see #requiredSubgroupSizeStages()
    public VkPhysicalDeviceSubgroupSizeControlProperties requiredSubgroupSizeStages(int requiredSubgroupSizeStages) {
    	REQUIRED_SUBGROUP_SIZE_STAGES_HANDLE.set(segment, 0L, requiredSubgroupSizeStages);
    	return this;
    }
    
    public int requiredSubgroupSizeStages() {
    	return (int) REQUIRED_SUBGROUP_SIZE_STAGES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceSubgroupSizeControlProperties set(VkPhysicalDeviceSubgroupSizeControlProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceSubgroupSizeControlProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceSubgroupSizeControlProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceSubgroupSizeControlProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceSubgroupSizeControlProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceSubgroupSizeControlProperties> array(Arena arena, VkPhysicalDeviceSubgroupSizeControlProperties... structs) {
        NativeStructArray<VkPhysicalDeviceSubgroupSizeControlProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceSubgroupSizeControlProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceSubgroupSizeControlProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceSubgroupSizeControlProperties(segment)
        );
    }

}