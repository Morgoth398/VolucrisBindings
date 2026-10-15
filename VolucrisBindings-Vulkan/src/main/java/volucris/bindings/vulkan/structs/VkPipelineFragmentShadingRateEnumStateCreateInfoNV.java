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

public final class VkPipelineFragmentShadingRateEnumStateCreateInfoNV
		implements Struct<VkPipelineFragmentShadingRateEnumStateCreateInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADING_RATE_TYPE_HANDLE;
	public static final VarHandle SHADING_RATE_HANDLE;
	public static final VarHandle COMBINER_OPS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADING_RATE_TYPE_BYTE_OFFSET;
	public static final long SHADING_RATE_BYTE_OFFSET;
	public static final long COMBINER_OPS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shadingRateType"),
		    JAVA_INT.withName("shadingRate"),
		    MemoryLayout.sequenceLayout(2, JAVA_INT).withName("combinerOps")
		).withName("VkPipelineFragmentShadingRateEnumStateCreateInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADING_RATE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shadingRateType"));
		SHADING_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shadingRate"));
		COMBINER_OPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("combinerOps"), PathElement.sequenceElement());
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADING_RATE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shadingRateType"));
		SHADING_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shadingRate"));
		COMBINER_OPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("combinerOps"));
		//@formatter:on
	}

	public VkPipelineFragmentShadingRateEnumStateCreateInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineFragmentShadingRateEnumStateCreateInfoNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineFragmentShadingRateEnumStateCreateInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shadingRateType()
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRateType(int shadingRateType) {
    	SHADING_RATE_TYPE_HANDLE.set(segment, 0L, shadingRateType);
    	return this;
    }
    
    public int shadingRateType() {
    	return (int) SHADING_RATE_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shadingRate()
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRate(int shadingRate) {
    	SHADING_RATE_HANDLE.set(segment, 0L, shadingRate);
    	return this;
    }
    
    public int shadingRate() {
    	return (int) SHADING_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #combinerOps(int)
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV combinerOps(int combinerOps, int index0) {
    	COMBINER_OPS_HANDLE.set(segment, 0L, index0, combinerOps);
    	return this;
    }
    
    public int combinerOps(int index0) {
    	return (int) COMBINER_OPS_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV set(VkPipelineFragmentShadingRateEnumStateCreateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineFragmentShadingRateEnumStateCreateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineFragmentShadingRateEnumStateCreateInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineFragmentShadingRateEnumStateCreateInfoNV> array(Arena arena, VkPipelineFragmentShadingRateEnumStateCreateInfoNV... structs) {
        NativeStructArray<VkPipelineFragmentShadingRateEnumStateCreateInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineFragmentShadingRateEnumStateCreateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(segment)
        );
    }

}