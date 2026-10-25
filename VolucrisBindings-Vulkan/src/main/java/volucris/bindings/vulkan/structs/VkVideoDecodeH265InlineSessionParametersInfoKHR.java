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

public final class VkVideoDecodeH265InlineSessionParametersInfoKHR
		implements Struct<VkVideoDecodeH265InlineSessionParametersInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_STD_VPS_HANDLE;
	public static final VarHandle P_STD_SPS_HANDLE;
	public static final VarHandle P_STD_PPS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_STD_VPS_BYTE_OFFSET;
	public static final long P_STD_SPS_BYTE_OFFSET;
	public static final long P_STD_PPS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pStdVPS"),
		    UNBOUNDED_ADDRESS.withName("pStdSPS"),
		    UNBOUNDED_ADDRESS.withName("pStdPPS")
		).withName("VkVideoDecodeH265InlineSessionParametersInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_STD_VPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdVPS"));
		P_STD_SPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdSPS"));
		P_STD_PPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdPPS"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_STD_VPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdVPS"));
		P_STD_SPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdSPS"));
		P_STD_PPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdPPS"));
		//@formatter:on
	}

	public VkVideoDecodeH265InlineSessionParametersInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoDecodeH265InlineSessionParametersInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoDecodeH265InlineSessionParametersInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoDecodeH265InlineSessionParametersInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeH265InlineSessionParametersInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pStdVPS()
    public VkVideoDecodeH265InlineSessionParametersInfoKHR pStdVPS(StdVideoH265VideoParameterSet pStdVPS) {
    	P_STD_VPS_HANDLE.set(segment, 0L, pStdVPS.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH265VideoParameterSet pStdVPS() {
    	MemorySegment segment = (MemorySegment) P_STD_VPS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH265VideoParameterSet(segment);
    }
    
    /// @see #pStdSPS()
    public VkVideoDecodeH265InlineSessionParametersInfoKHR pStdSPS(StdVideoH265SequenceParameterSet pStdSPS) {
    	P_STD_SPS_HANDLE.set(segment, 0L, pStdSPS.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH265SequenceParameterSet pStdSPS() {
    	MemorySegment segment = (MemorySegment) P_STD_SPS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH265SequenceParameterSet(segment);
    }
    
    /// @see #pStdPPS()
    public VkVideoDecodeH265InlineSessionParametersInfoKHR pStdPPS(StdVideoH265PictureParameterSet pStdPPS) {
    	P_STD_PPS_HANDLE.set(segment, 0L, pStdPPS.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH265PictureParameterSet pStdPPS() {
    	MemorySegment segment = (MemorySegment) P_STD_PPS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH265PictureParameterSet(segment);
    }
    
    @Override
    public VkVideoDecodeH265InlineSessionParametersInfoKHR set(VkVideoDecodeH265InlineSessionParametersInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeH265InlineSessionParametersInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeH265InlineSessionParametersInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeH265InlineSessionParametersInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoDecodeH265InlineSessionParametersInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeH265InlineSessionParametersInfoKHR> array(SegmentAllocator allocator, VkVideoDecodeH265InlineSessionParametersInfoKHR... structs) {
        NativeStructArray<VkVideoDecodeH265InlineSessionParametersInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoDecodeH265InlineSessionParametersInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeH265InlineSessionParametersInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeH265InlineSessionParametersInfoKHR(segment)
        );
    }

}