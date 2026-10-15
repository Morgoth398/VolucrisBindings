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

public final class VkVideoEncodeAV1SessionParametersCreateInfoKHR
		implements Struct<VkVideoEncodeAV1SessionParametersCreateInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_STD_SEQUENCE_HEADER_HANDLE;
	public static final VarHandle P_STD_DECODER_MODEL_INFO_HANDLE;
	public static final VarHandle STD_OPERATING_POINT_COUNT_HANDLE;
	public static final VarHandle P_STD_OPERATING_POINTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_STD_SEQUENCE_HEADER_BYTE_OFFSET;
	public static final long P_STD_DECODER_MODEL_INFO_BYTE_OFFSET;
	public static final long STD_OPERATING_POINT_COUNT_BYTE_OFFSET;
	public static final long P_STD_OPERATING_POINTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pStdSequenceHeader"),
		    UNBOUNDED_ADDRESS.withName("pStdDecoderModelInfo"),
		    JAVA_INT.withName("stdOperatingPointCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pStdOperatingPoints")
		).withName("VkVideoEncodeAV1SessionParametersCreateInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_STD_SEQUENCE_HEADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdSequenceHeader"));
		P_STD_DECODER_MODEL_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdDecoderModelInfo"));
		STD_OPERATING_POINT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stdOperatingPointCount"));
		P_STD_OPERATING_POINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdOperatingPoints"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_STD_SEQUENCE_HEADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdSequenceHeader"));
		P_STD_DECODER_MODEL_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdDecoderModelInfo"));
		STD_OPERATING_POINT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stdOperatingPointCount"));
		P_STD_OPERATING_POINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdOperatingPoints"));
		//@formatter:on
	}

	public VkVideoEncodeAV1SessionParametersCreateInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeAV1SessionParametersCreateInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoEncodeAV1SessionParametersCreateInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pStdSequenceHeader()
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdSequenceHeader(StdVideoAV1SequenceHeader pStdSequenceHeader) {
    	P_STD_SEQUENCE_HEADER_HANDLE.set(segment, 0L, pStdSequenceHeader.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoAV1SequenceHeader pStdSequenceHeader() {
    	MemorySegment segment = (MemorySegment) P_STD_SEQUENCE_HEADER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoAV1SequenceHeader(segment);
    }
    
    /// @see #pStdDecoderModelInfo()
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdDecoderModelInfo(StdVideoEncodeAV1DecoderModelInfo pStdDecoderModelInfo) {
    	P_STD_DECODER_MODEL_INFO_HANDLE.set(segment, 0L, pStdDecoderModelInfo.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoEncodeAV1DecoderModelInfo pStdDecoderModelInfo() {
    	MemorySegment segment = (MemorySegment) P_STD_DECODER_MODEL_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoEncodeAV1DecoderModelInfo(segment);
    }
    
    /// @see #stdOperatingPointCount()
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR stdOperatingPointCount(int stdOperatingPointCount) {
    	STD_OPERATING_POINT_COUNT_HANDLE.set(segment, 0L, stdOperatingPointCount);
    	return this;
    }
    
    public int stdOperatingPointCount() {
    	return (int) STD_OPERATING_POINT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pStdOperatingPoints()
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdOperatingPoints(NativeStructArray<StdVideoEncodeAV1OperatingPointInfo> pStdOperatingPoints) {
    	P_STD_OPERATING_POINTS_HANDLE.set(segment, 0L, pStdOperatingPoints.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<StdVideoEncodeAV1OperatingPointInfo> pStdOperatingPoints() {
    	MemorySegment segment = (MemorySegment) P_STD_OPERATING_POINTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return StdVideoEncodeAV1OperatingPointInfo.array(segment);
    }
    
    @Override
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR set(VkVideoEncodeAV1SessionParametersCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeAV1SessionParametersCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeAV1SessionParametersCreateInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeAV1SessionParametersCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeAV1SessionParametersCreateInfoKHR> array(Arena arena, VkVideoEncodeAV1SessionParametersCreateInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeAV1SessionParametersCreateInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeAV1SessionParametersCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeAV1SessionParametersCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeAV1SessionParametersCreateInfoKHR(segment)
        );
    }

}