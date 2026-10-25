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

public final class VkPhysicalDeviceSubgroupSizeControlFeatures
		implements Struct<VkPhysicalDeviceSubgroupSizeControlFeatures> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SUBGROUP_SIZE_CONTROL_HANDLE;
	public static final VarHandle COMPUTE_FULL_SUBGROUPS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SUBGROUP_SIZE_CONTROL_BYTE_OFFSET;
	public static final long COMPUTE_FULL_SUBGROUPS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("subgroupSizeControl"),
		    JAVA_INT.withName("computeFullSubgroups")
		).withName("VkPhysicalDeviceSubgroupSizeControlFeatures").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SUBGROUP_SIZE_CONTROL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subgroupSizeControl"));
		COMPUTE_FULL_SUBGROUPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("computeFullSubgroups"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SUBGROUP_SIZE_CONTROL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subgroupSizeControl"));
		COMPUTE_FULL_SUBGROUPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("computeFullSubgroups"));
		//@formatter:on
	}

	public VkPhysicalDeviceSubgroupSizeControlFeatures() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceSubgroupSizeControlFeatures(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceSubgroupSizeControlFeatures(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceSubgroupSizeControlFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceSubgroupSizeControlFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #subgroupSizeControl()
    public VkPhysicalDeviceSubgroupSizeControlFeatures subgroupSizeControl(int subgroupSizeControl) {
    	SUBGROUP_SIZE_CONTROL_HANDLE.set(segment, 0L, subgroupSizeControl);
    	return this;
    }
    
    public int subgroupSizeControl() {
    	return (int) SUBGROUP_SIZE_CONTROL_HANDLE.get(segment, 0L);
    }
    
    /// @see #computeFullSubgroups()
    public VkPhysicalDeviceSubgroupSizeControlFeatures computeFullSubgroups(int computeFullSubgroups) {
    	COMPUTE_FULL_SUBGROUPS_HANDLE.set(segment, 0L, computeFullSubgroups);
    	return this;
    }
    
    public int computeFullSubgroups() {
    	return (int) COMPUTE_FULL_SUBGROUPS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceSubgroupSizeControlFeatures set(VkPhysicalDeviceSubgroupSizeControlFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceSubgroupSizeControlFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceSubgroupSizeControlFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceSubgroupSizeControlFeatures> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceSubgroupSizeControlFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceSubgroupSizeControlFeatures> array(SegmentAllocator allocator, VkPhysicalDeviceSubgroupSizeControlFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceSubgroupSizeControlFeatures> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceSubgroupSizeControlFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceSubgroupSizeControlFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceSubgroupSizeControlFeatures(segment)
        );
    }

}