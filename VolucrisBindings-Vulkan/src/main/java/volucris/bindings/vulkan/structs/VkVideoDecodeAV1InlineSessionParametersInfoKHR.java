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

public final class VkVideoDecodeAV1InlineSessionParametersInfoKHR
		implements Struct<VkVideoDecodeAV1InlineSessionParametersInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_STD_SEQUENCE_HEADER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_STD_SEQUENCE_HEADER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pStdSequenceHeader")
		).withName("VkVideoDecodeAV1InlineSessionParametersInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_STD_SEQUENCE_HEADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdSequenceHeader"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_STD_SEQUENCE_HEADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdSequenceHeader"));
		//@formatter:on
	}

	public VkVideoDecodeAV1InlineSessionParametersInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoDecodeAV1InlineSessionParametersInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoDecodeAV1InlineSessionParametersInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR pNext(MemorySegment pNext) {
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
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR pStdSequenceHeader(StdVideoAV1SequenceHeader pStdSequenceHeader) {
    	P_STD_SEQUENCE_HEADER_HANDLE.set(segment, 0L, pStdSequenceHeader.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoAV1SequenceHeader pStdSequenceHeader() {
    	MemorySegment segment = (MemorySegment) P_STD_SEQUENCE_HEADER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoAV1SequenceHeader(segment);
    }
    
    @Override
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR set(VkVideoDecodeAV1InlineSessionParametersInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeAV1InlineSessionParametersInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeAV1InlineSessionParametersInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoDecodeAV1InlineSessionParametersInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeAV1InlineSessionParametersInfoKHR> array(SegmentAllocator allocator, VkVideoDecodeAV1InlineSessionParametersInfoKHR... structs) {
        NativeStructArray<VkVideoDecodeAV1InlineSessionParametersInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoDecodeAV1InlineSessionParametersInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeAV1InlineSessionParametersInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeAV1InlineSessionParametersInfoKHR(segment)
        );
    }

}