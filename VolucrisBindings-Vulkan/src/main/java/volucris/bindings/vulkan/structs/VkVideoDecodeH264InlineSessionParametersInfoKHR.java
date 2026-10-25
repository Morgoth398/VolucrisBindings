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

public final class VkVideoDecodeH264InlineSessionParametersInfoKHR
		implements Struct<VkVideoDecodeH264InlineSessionParametersInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_STD_SPS_HANDLE;
	public static final VarHandle P_STD_PPS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_STD_SPS_BYTE_OFFSET;
	public static final long P_STD_PPS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pStdSPS"),
		    UNBOUNDED_ADDRESS.withName("pStdPPS")
		).withName("VkVideoDecodeH264InlineSessionParametersInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_STD_SPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdSPS"));
		P_STD_PPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdPPS"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_STD_SPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdSPS"));
		P_STD_PPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdPPS"));
		//@formatter:on
	}

	public VkVideoDecodeH264InlineSessionParametersInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoDecodeH264InlineSessionParametersInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoDecodeH264InlineSessionParametersInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoDecodeH264InlineSessionParametersInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeH264InlineSessionParametersInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pStdSPS()
    public VkVideoDecodeH264InlineSessionParametersInfoKHR pStdSPS(StdVideoH264SequenceParameterSet pStdSPS) {
    	P_STD_SPS_HANDLE.set(segment, 0L, pStdSPS.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH264SequenceParameterSet pStdSPS() {
    	MemorySegment segment = (MemorySegment) P_STD_SPS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH264SequenceParameterSet(segment);
    }
    
    /// @see #pStdPPS()
    public VkVideoDecodeH264InlineSessionParametersInfoKHR pStdPPS(StdVideoH264PictureParameterSet pStdPPS) {
    	P_STD_PPS_HANDLE.set(segment, 0L, pStdPPS.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH264PictureParameterSet pStdPPS() {
    	MemorySegment segment = (MemorySegment) P_STD_PPS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH264PictureParameterSet(segment);
    }
    
    @Override
    public VkVideoDecodeH264InlineSessionParametersInfoKHR set(VkVideoDecodeH264InlineSessionParametersInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeH264InlineSessionParametersInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeH264InlineSessionParametersInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeH264InlineSessionParametersInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoDecodeH264InlineSessionParametersInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeH264InlineSessionParametersInfoKHR> array(SegmentAllocator allocator, VkVideoDecodeH264InlineSessionParametersInfoKHR... structs) {
        NativeStructArray<VkVideoDecodeH264InlineSessionParametersInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoDecodeH264InlineSessionParametersInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeH264InlineSessionParametersInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeH264InlineSessionParametersInfoKHR(segment)
        );
    }

}