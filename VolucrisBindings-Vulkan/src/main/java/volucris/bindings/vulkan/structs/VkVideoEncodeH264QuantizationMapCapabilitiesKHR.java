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

public final class VkVideoEncodeH264QuantizationMapCapabilitiesKHR
		implements Struct<VkVideoEncodeH264QuantizationMapCapabilitiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MIN_QP_DELTA_HANDLE;
	public static final VarHandle MAX_QP_DELTA_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MIN_QP_DELTA_BYTE_OFFSET;
	public static final long MAX_QP_DELTA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("minQpDelta"),
		    JAVA_INT.withName("maxQpDelta")
		).withName("VkVideoEncodeH264QuantizationMapCapabilitiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MIN_QP_DELTA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minQpDelta"));
		MAX_QP_DELTA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxQpDelta"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MIN_QP_DELTA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minQpDelta"));
		MAX_QP_DELTA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxQpDelta"));
		//@formatter:on
	}

	public VkVideoEncodeH264QuantizationMapCapabilitiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeH264QuantizationMapCapabilitiesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoEncodeH264QuantizationMapCapabilitiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #minQpDelta()
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR minQpDelta(int minQpDelta) {
    	MIN_QP_DELTA_HANDLE.set(segment, 0L, minQpDelta);
    	return this;
    }
    
    public int minQpDelta() {
    	return (int) MIN_QP_DELTA_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxQpDelta()
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR maxQpDelta(int maxQpDelta) {
    	MAX_QP_DELTA_HANDLE.set(segment, 0L, maxQpDelta);
    	return this;
    }
    
    public int maxQpDelta() {
    	return (int) MAX_QP_DELTA_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR set(VkVideoEncodeH264QuantizationMapCapabilitiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH264QuantizationMapCapabilitiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH264QuantizationMapCapabilitiesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH264QuantizationMapCapabilitiesKHR> array(SegmentAllocator allocator, VkVideoEncodeH264QuantizationMapCapabilitiesKHR... structs) {
        NativeStructArray<VkVideoEncodeH264QuantizationMapCapabilitiesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH264QuantizationMapCapabilitiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(segment)
        );
    }

}