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

public final class VkVideoDecodeAV1DpbSlotInfoKHR
		implements Struct<VkVideoDecodeAV1DpbSlotInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_STD_REFERENCE_INFO_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_STD_REFERENCE_INFO_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pStdReferenceInfo")
		).withName("VkVideoDecodeAV1DpbSlotInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_STD_REFERENCE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdReferenceInfo"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_STD_REFERENCE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdReferenceInfo"));
		//@formatter:on
	}

	public VkVideoDecodeAV1DpbSlotInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoDecodeAV1DpbSlotInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoDecodeAV1DpbSlotInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoDecodeAV1DpbSlotInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeAV1DpbSlotInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pStdReferenceInfo()
    public VkVideoDecodeAV1DpbSlotInfoKHR pStdReferenceInfo(StdVideoDecodeAV1ReferenceInfo pStdReferenceInfo) {
    	P_STD_REFERENCE_INFO_HANDLE.set(segment, 0L, pStdReferenceInfo.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoDecodeAV1ReferenceInfo pStdReferenceInfo() {
    	MemorySegment segment = (MemorySegment) P_STD_REFERENCE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoDecodeAV1ReferenceInfo(segment);
    }
    
    @Override
    public VkVideoDecodeAV1DpbSlotInfoKHR set(VkVideoDecodeAV1DpbSlotInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeAV1DpbSlotInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeAV1DpbSlotInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeAV1DpbSlotInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoDecodeAV1DpbSlotInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeAV1DpbSlotInfoKHR> array(SegmentAllocator allocator, VkVideoDecodeAV1DpbSlotInfoKHR... structs) {
        NativeStructArray<VkVideoDecodeAV1DpbSlotInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoDecodeAV1DpbSlotInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeAV1DpbSlotInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeAV1DpbSlotInfoKHR(segment)
        );
    }

}