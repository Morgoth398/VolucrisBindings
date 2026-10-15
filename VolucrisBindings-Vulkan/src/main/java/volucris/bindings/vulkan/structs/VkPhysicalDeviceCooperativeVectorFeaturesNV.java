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

public final class VkPhysicalDeviceCooperativeVectorFeaturesNV
		implements Struct<VkPhysicalDeviceCooperativeVectorFeaturesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COOPERATIVE_VECTOR_HANDLE;
	public static final VarHandle COOPERATIVE_VECTOR_TRAINING_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COOPERATIVE_VECTOR_BYTE_OFFSET;
	public static final long COOPERATIVE_VECTOR_TRAINING_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("cooperativeVector"),
		    JAVA_INT.withName("cooperativeVectorTraining")
		).withName("VkPhysicalDeviceCooperativeVectorFeaturesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COOPERATIVE_VECTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeVector"));
		COOPERATIVE_VECTOR_TRAINING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeVectorTraining"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COOPERATIVE_VECTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeVector"));
		COOPERATIVE_VECTOR_TRAINING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeVectorTraining"));
		//@formatter:on
	}

	public VkPhysicalDeviceCooperativeVectorFeaturesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceCooperativeVectorFeaturesNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceCooperativeVectorFeaturesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceCooperativeVectorFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceCooperativeVectorFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #cooperativeVector()
    public VkPhysicalDeviceCooperativeVectorFeaturesNV cooperativeVector(int cooperativeVector) {
    	COOPERATIVE_VECTOR_HANDLE.set(segment, 0L, cooperativeVector);
    	return this;
    }
    
    public int cooperativeVector() {
    	return (int) COOPERATIVE_VECTOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #cooperativeVectorTraining()
    public VkPhysicalDeviceCooperativeVectorFeaturesNV cooperativeVectorTraining(int cooperativeVectorTraining) {
    	COOPERATIVE_VECTOR_TRAINING_HANDLE.set(segment, 0L, cooperativeVectorTraining);
    	return this;
    }
    
    public int cooperativeVectorTraining() {
    	return (int) COOPERATIVE_VECTOR_TRAINING_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceCooperativeVectorFeaturesNV set(VkPhysicalDeviceCooperativeVectorFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceCooperativeVectorFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceCooperativeVectorFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeVectorFeaturesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeVectorFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeVectorFeaturesNV> array(Arena arena, VkPhysicalDeviceCooperativeVectorFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceCooperativeVectorFeaturesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeVectorFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeVectorFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeVectorFeaturesNV(segment)
        );
    }

}