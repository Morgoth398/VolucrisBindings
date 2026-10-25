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

public final class VkVideoDecodeH265SessionParametersCreateInfoKHR
		implements Struct<VkVideoDecodeH265SessionParametersCreateInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_STD_VPSCOUNT_HANDLE;
	public static final VarHandle MAX_STD_SPSCOUNT_HANDLE;
	public static final VarHandle MAX_STD_PPSCOUNT_HANDLE;
	public static final VarHandle P_PARAMETERS_ADD_INFO_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_STD_VPSCOUNT_BYTE_OFFSET;
	public static final long MAX_STD_SPSCOUNT_BYTE_OFFSET;
	public static final long MAX_STD_PPSCOUNT_BYTE_OFFSET;
	public static final long P_PARAMETERS_ADD_INFO_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maxStdVPSCount"),
		    JAVA_INT.withName("maxStdSPSCount"),
		    JAVA_INT.withName("maxStdPPSCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pParametersAddInfo")
		).withName("VkVideoDecodeH265SessionParametersCreateInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_STD_VPSCOUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxStdVPSCount"));
		MAX_STD_SPSCOUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxStdSPSCount"));
		MAX_STD_PPSCOUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxStdPPSCount"));
		P_PARAMETERS_ADD_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pParametersAddInfo"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_STD_VPSCOUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxStdVPSCount"));
		MAX_STD_SPSCOUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxStdSPSCount"));
		MAX_STD_PPSCOUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxStdPPSCount"));
		P_PARAMETERS_ADD_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pParametersAddInfo"));
		//@formatter:on
	}

	public VkVideoDecodeH265SessionParametersCreateInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoDecodeH265SessionParametersCreateInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoDecodeH265SessionParametersCreateInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoDecodeH265SessionParametersCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeH265SessionParametersCreateInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxStdVPSCount()
    public VkVideoDecodeH265SessionParametersCreateInfoKHR maxStdVPSCount(int maxStdVPSCount) {
    	MAX_STD_VPSCOUNT_HANDLE.set(segment, 0L, maxStdVPSCount);
    	return this;
    }
    
    public int maxStdVPSCount() {
    	return (int) MAX_STD_VPSCOUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxStdSPSCount()
    public VkVideoDecodeH265SessionParametersCreateInfoKHR maxStdSPSCount(int maxStdSPSCount) {
    	MAX_STD_SPSCOUNT_HANDLE.set(segment, 0L, maxStdSPSCount);
    	return this;
    }
    
    public int maxStdSPSCount() {
    	return (int) MAX_STD_SPSCOUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxStdPPSCount()
    public VkVideoDecodeH265SessionParametersCreateInfoKHR maxStdPPSCount(int maxStdPPSCount) {
    	MAX_STD_PPSCOUNT_HANDLE.set(segment, 0L, maxStdPPSCount);
    	return this;
    }
    
    public int maxStdPPSCount() {
    	return (int) MAX_STD_PPSCOUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pParametersAddInfo()
    public VkVideoDecodeH265SessionParametersCreateInfoKHR pParametersAddInfo(VkVideoDecodeH265SessionParametersAddInfoKHR pParametersAddInfo) {
    	P_PARAMETERS_ADD_INFO_HANDLE.set(segment, 0L, pParametersAddInfo.memorySegment());
    	return this;
    }
    
    public @Nullable VkVideoDecodeH265SessionParametersAddInfoKHR pParametersAddInfo() {
    	MemorySegment segment = (MemorySegment) P_PARAMETERS_ADD_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkVideoDecodeH265SessionParametersAddInfoKHR(segment);
    }
    
    @Override
    public VkVideoDecodeH265SessionParametersCreateInfoKHR set(VkVideoDecodeH265SessionParametersCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeH265SessionParametersCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeH265SessionParametersCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeH265SessionParametersCreateInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoDecodeH265SessionParametersCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeH265SessionParametersCreateInfoKHR> array(SegmentAllocator allocator, VkVideoDecodeH265SessionParametersCreateInfoKHR... structs) {
        NativeStructArray<VkVideoDecodeH265SessionParametersCreateInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoDecodeH265SessionParametersCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeH265SessionParametersCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeH265SessionParametersCreateInfoKHR(segment)
        );
    }

}