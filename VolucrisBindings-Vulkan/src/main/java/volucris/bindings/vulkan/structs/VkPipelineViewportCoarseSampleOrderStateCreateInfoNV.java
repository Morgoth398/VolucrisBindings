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

public final class VkPipelineViewportCoarseSampleOrderStateCreateInfoNV
		implements Struct<VkPipelineViewportCoarseSampleOrderStateCreateInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SAMPLE_ORDER_TYPE_HANDLE;
	public static final VarHandle CUSTOM_SAMPLE_ORDER_COUNT_HANDLE;
	public static final VarHandle P_CUSTOM_SAMPLE_ORDERS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SAMPLE_ORDER_TYPE_BYTE_OFFSET;
	public static final long CUSTOM_SAMPLE_ORDER_COUNT_BYTE_OFFSET;
	public static final long P_CUSTOM_SAMPLE_ORDERS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("sampleOrderType"),
		    JAVA_INT.withName("customSampleOrderCount"),
		    UNBOUNDED_ADDRESS.withName("pCustomSampleOrders")
		).withName("VkPipelineViewportCoarseSampleOrderStateCreateInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SAMPLE_ORDER_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleOrderType"));
		CUSTOM_SAMPLE_ORDER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("customSampleOrderCount"));
		P_CUSTOM_SAMPLE_ORDERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCustomSampleOrders"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SAMPLE_ORDER_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleOrderType"));
		CUSTOM_SAMPLE_ORDER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("customSampleOrderCount"));
		P_CUSTOM_SAMPLE_ORDERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCustomSampleOrders"));
		//@formatter:on
	}

	public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #sampleOrderType()
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sampleOrderType(int sampleOrderType) {
    	SAMPLE_ORDER_TYPE_HANDLE.set(segment, 0L, sampleOrderType);
    	return this;
    }
    
    public int sampleOrderType() {
    	return (int) SAMPLE_ORDER_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #customSampleOrderCount()
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV customSampleOrderCount(int customSampleOrderCount) {
    	CUSTOM_SAMPLE_ORDER_COUNT_HANDLE.set(segment, 0L, customSampleOrderCount);
    	return this;
    }
    
    public int customSampleOrderCount() {
    	return (int) CUSTOM_SAMPLE_ORDER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCustomSampleOrders()
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pCustomSampleOrders(NativeStructArray<VkCoarseSampleOrderCustomNV> pCustomSampleOrders) {
    	P_CUSTOM_SAMPLE_ORDERS_HANDLE.set(segment, 0L, pCustomSampleOrders.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkCoarseSampleOrderCustomNV> pCustomSampleOrders() {
    	MemorySegment segment = (MemorySegment) P_CUSTOM_SAMPLE_ORDERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkCoarseSampleOrderCustomNV.array(segment);
    }
    
    @Override
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV set(VkPipelineViewportCoarseSampleOrderStateCreateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineViewportCoarseSampleOrderStateCreateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineViewportCoarseSampleOrderStateCreateInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineViewportCoarseSampleOrderStateCreateInfoNV> array(Arena arena, VkPipelineViewportCoarseSampleOrderStateCreateInfoNV... structs) {
        NativeStructArray<VkPipelineViewportCoarseSampleOrderStateCreateInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineViewportCoarseSampleOrderStateCreateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(segment)
        );
    }

}