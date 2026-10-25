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

public final class VkVideoEncodeH265SessionCreateInfoKHR
		implements Struct<VkVideoEncodeH265SessionCreateInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle USE_MAX_LEVEL_IDC_HANDLE;
	public static final VarHandle MAX_LEVEL_IDC_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long USE_MAX_LEVEL_IDC_BYTE_OFFSET;
	public static final long MAX_LEVEL_IDC_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("useMaxLevelIdc"),
		    JAVA_INT.withName("maxLevelIdc")
		).withName("VkVideoEncodeH265SessionCreateInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		USE_MAX_LEVEL_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("useMaxLevelIdc"));
		MAX_LEVEL_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxLevelIdc"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		USE_MAX_LEVEL_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useMaxLevelIdc"));
		MAX_LEVEL_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxLevelIdc"));
		//@formatter:on
	}

	public VkVideoEncodeH265SessionCreateInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeH265SessionCreateInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoEncodeH265SessionCreateInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeH265SessionCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeH265SessionCreateInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #useMaxLevelIdc()
    public VkVideoEncodeH265SessionCreateInfoKHR useMaxLevelIdc(int useMaxLevelIdc) {
    	USE_MAX_LEVEL_IDC_HANDLE.set(segment, 0L, useMaxLevelIdc);
    	return this;
    }
    
    public int useMaxLevelIdc() {
    	return (int) USE_MAX_LEVEL_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxLevelIdc()
    public VkVideoEncodeH265SessionCreateInfoKHR maxLevelIdc(int maxLevelIdc) {
    	MAX_LEVEL_IDC_HANDLE.set(segment, 0L, maxLevelIdc);
    	return this;
    }
    
    public int maxLevelIdc() {
    	return (int) MAX_LEVEL_IDC_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeH265SessionCreateInfoKHR set(VkVideoEncodeH265SessionCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH265SessionCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH265SessionCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH265SessionCreateInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeH265SessionCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH265SessionCreateInfoKHR> array(SegmentAllocator allocator, VkVideoEncodeH265SessionCreateInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeH265SessionCreateInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeH265SessionCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH265SessionCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH265SessionCreateInfoKHR(segment)
        );
    }

}