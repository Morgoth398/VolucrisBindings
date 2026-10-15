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

public final class VkVideoEncodeH265NaluSliceSegmentInfoKHR
		implements Struct<VkVideoEncodeH265NaluSliceSegmentInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle CONSTANT_QP_HANDLE;
	public static final VarHandle P_STD_SLICE_SEGMENT_HEADER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long CONSTANT_QP_BYTE_OFFSET;
	public static final long P_STD_SLICE_SEGMENT_HEADER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("constantQp"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pStdSliceSegmentHeader")
		).withName("VkVideoEncodeH265NaluSliceSegmentInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		CONSTANT_QP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("constantQp"));
		P_STD_SLICE_SEGMENT_HEADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdSliceSegmentHeader"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		CONSTANT_QP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("constantQp"));
		P_STD_SLICE_SEGMENT_HEADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdSliceSegmentHeader"));
		//@formatter:on
	}

	public VkVideoEncodeH265NaluSliceSegmentInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeH265NaluSliceSegmentInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoEncodeH265NaluSliceSegmentInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #constantQp()
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR constantQp(int constantQp) {
    	CONSTANT_QP_HANDLE.set(segment, 0L, constantQp);
    	return this;
    }
    
    public int constantQp() {
    	return (int) CONSTANT_QP_HANDLE.get(segment, 0L);
    }
    
    /// @see #pStdSliceSegmentHeader()
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR pStdSliceSegmentHeader(StdVideoEncodeH265SliceSegmentHeader pStdSliceSegmentHeader) {
    	P_STD_SLICE_SEGMENT_HEADER_HANDLE.set(segment, 0L, pStdSliceSegmentHeader.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoEncodeH265SliceSegmentHeader pStdSliceSegmentHeader() {
    	MemorySegment segment = (MemorySegment) P_STD_SLICE_SEGMENT_HEADER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoEncodeH265SliceSegmentHeader(segment);
    }
    
    @Override
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR set(VkVideoEncodeH265NaluSliceSegmentInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH265NaluSliceSegmentInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH265NaluSliceSegmentInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH265NaluSliceSegmentInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH265NaluSliceSegmentInfoKHR> array(Arena arena, VkVideoEncodeH265NaluSliceSegmentInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeH265NaluSliceSegmentInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH265NaluSliceSegmentInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH265NaluSliceSegmentInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH265NaluSliceSegmentInfoKHR(segment)
        );
    }

}