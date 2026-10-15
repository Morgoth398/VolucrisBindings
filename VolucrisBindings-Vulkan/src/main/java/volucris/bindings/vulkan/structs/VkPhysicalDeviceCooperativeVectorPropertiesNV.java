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

public final class VkPhysicalDeviceCooperativeVectorPropertiesNV
		implements Struct<VkPhysicalDeviceCooperativeVectorPropertiesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COOPERATIVE_VECTOR_SUPPORTED_STAGES_HANDLE;
	public static final VarHandle COOPERATIVE_VECTOR_TRAINING_FLOAT16_ACCUMULATION_HANDLE;
	public static final VarHandle COOPERATIVE_VECTOR_TRAINING_FLOAT32_ACCUMULATION_HANDLE;
	public static final VarHandle MAX_COOPERATIVE_VECTOR_COMPONENTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COOPERATIVE_VECTOR_SUPPORTED_STAGES_BYTE_OFFSET;
	public static final long COOPERATIVE_VECTOR_TRAINING_FLOAT16_ACCUMULATION_BYTE_OFFSET;
	public static final long COOPERATIVE_VECTOR_TRAINING_FLOAT32_ACCUMULATION_BYTE_OFFSET;
	public static final long MAX_COOPERATIVE_VECTOR_COMPONENTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("cooperativeVectorSupportedStages"),
		    JAVA_INT.withName("cooperativeVectorTrainingFloat16Accumulation"),
		    JAVA_INT.withName("cooperativeVectorTrainingFloat32Accumulation"),
		    JAVA_INT.withName("maxCooperativeVectorComponents")
		).withName("VkPhysicalDeviceCooperativeVectorPropertiesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COOPERATIVE_VECTOR_SUPPORTED_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeVectorSupportedStages"));
		COOPERATIVE_VECTOR_TRAINING_FLOAT16_ACCUMULATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeVectorTrainingFloat16Accumulation"));
		COOPERATIVE_VECTOR_TRAINING_FLOAT32_ACCUMULATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeVectorTrainingFloat32Accumulation"));
		MAX_COOPERATIVE_VECTOR_COMPONENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxCooperativeVectorComponents"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COOPERATIVE_VECTOR_SUPPORTED_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeVectorSupportedStages"));
		COOPERATIVE_VECTOR_TRAINING_FLOAT16_ACCUMULATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeVectorTrainingFloat16Accumulation"));
		COOPERATIVE_VECTOR_TRAINING_FLOAT32_ACCUMULATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeVectorTrainingFloat32Accumulation"));
		MAX_COOPERATIVE_VECTOR_COMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxCooperativeVectorComponents"));
		//@formatter:on
	}

	public VkPhysicalDeviceCooperativeVectorPropertiesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceCooperativeVectorPropertiesNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceCooperativeVectorPropertiesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceCooperativeVectorPropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceCooperativeVectorPropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #cooperativeVectorSupportedStages()
    public VkPhysicalDeviceCooperativeVectorPropertiesNV cooperativeVectorSupportedStages(int cooperativeVectorSupportedStages) {
    	COOPERATIVE_VECTOR_SUPPORTED_STAGES_HANDLE.set(segment, 0L, cooperativeVectorSupportedStages);
    	return this;
    }
    
    public int cooperativeVectorSupportedStages() {
    	return (int) COOPERATIVE_VECTOR_SUPPORTED_STAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #cooperativeVectorTrainingFloat16Accumulation()
    public VkPhysicalDeviceCooperativeVectorPropertiesNV cooperativeVectorTrainingFloat16Accumulation(int cooperativeVectorTrainingFloat16Accumulation) {
    	COOPERATIVE_VECTOR_TRAINING_FLOAT16_ACCUMULATION_HANDLE.set(segment, 0L, cooperativeVectorTrainingFloat16Accumulation);
    	return this;
    }
    
    public int cooperativeVectorTrainingFloat16Accumulation() {
    	return (int) COOPERATIVE_VECTOR_TRAINING_FLOAT16_ACCUMULATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #cooperativeVectorTrainingFloat32Accumulation()
    public VkPhysicalDeviceCooperativeVectorPropertiesNV cooperativeVectorTrainingFloat32Accumulation(int cooperativeVectorTrainingFloat32Accumulation) {
    	COOPERATIVE_VECTOR_TRAINING_FLOAT32_ACCUMULATION_HANDLE.set(segment, 0L, cooperativeVectorTrainingFloat32Accumulation);
    	return this;
    }
    
    public int cooperativeVectorTrainingFloat32Accumulation() {
    	return (int) COOPERATIVE_VECTOR_TRAINING_FLOAT32_ACCUMULATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxCooperativeVectorComponents()
    public VkPhysicalDeviceCooperativeVectorPropertiesNV maxCooperativeVectorComponents(int maxCooperativeVectorComponents) {
    	MAX_COOPERATIVE_VECTOR_COMPONENTS_HANDLE.set(segment, 0L, maxCooperativeVectorComponents);
    	return this;
    }
    
    public int maxCooperativeVectorComponents() {
    	return (int) MAX_COOPERATIVE_VECTOR_COMPONENTS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceCooperativeVectorPropertiesNV set(VkPhysicalDeviceCooperativeVectorPropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceCooperativeVectorPropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceCooperativeVectorPropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeVectorPropertiesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeVectorPropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeVectorPropertiesNV> array(Arena arena, VkPhysicalDeviceCooperativeVectorPropertiesNV... structs) {
        NativeStructArray<VkPhysicalDeviceCooperativeVectorPropertiesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeVectorPropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeVectorPropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeVectorPropertiesNV(segment)
        );
    }

}