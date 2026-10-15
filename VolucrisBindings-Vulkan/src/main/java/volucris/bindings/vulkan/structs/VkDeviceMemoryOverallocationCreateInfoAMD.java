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

public final class VkDeviceMemoryOverallocationCreateInfoAMD
		implements Struct<VkDeviceMemoryOverallocationCreateInfoAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle OVERALLOCATION_BEHAVIOR_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long OVERALLOCATION_BEHAVIOR_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("overallocationBehavior"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDeviceMemoryOverallocationCreateInfoAMD").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		OVERALLOCATION_BEHAVIOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("overallocationBehavior"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		OVERALLOCATION_BEHAVIOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("overallocationBehavior"));
		//@formatter:on
	}

	public VkDeviceMemoryOverallocationCreateInfoAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceMemoryOverallocationCreateInfoAMD(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDeviceMemoryOverallocationCreateInfoAMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDeviceMemoryOverallocationCreateInfoAMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceMemoryOverallocationCreateInfoAMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #overallocationBehavior()
    public VkDeviceMemoryOverallocationCreateInfoAMD overallocationBehavior(int overallocationBehavior) {
    	OVERALLOCATION_BEHAVIOR_HANDLE.set(segment, 0L, overallocationBehavior);
    	return this;
    }
    
    public int overallocationBehavior() {
    	return (int) OVERALLOCATION_BEHAVIOR_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDeviceMemoryOverallocationCreateInfoAMD set(VkDeviceMemoryOverallocationCreateInfoAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceMemoryOverallocationCreateInfoAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceMemoryOverallocationCreateInfoAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceMemoryOverallocationCreateInfoAMD> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceMemoryOverallocationCreateInfoAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceMemoryOverallocationCreateInfoAMD> array(Arena arena, VkDeviceMemoryOverallocationCreateInfoAMD... structs) {
        NativeStructArray<VkDeviceMemoryOverallocationCreateInfoAMD> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceMemoryOverallocationCreateInfoAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceMemoryOverallocationCreateInfoAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceMemoryOverallocationCreateInfoAMD(segment)
        );
    }

}