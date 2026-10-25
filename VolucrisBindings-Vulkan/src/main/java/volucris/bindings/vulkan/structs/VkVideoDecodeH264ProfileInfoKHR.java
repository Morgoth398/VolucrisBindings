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

public final class VkVideoDecodeH264ProfileInfoKHR
		implements Struct<VkVideoDecodeH264ProfileInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STD_PROFILE_IDC_HANDLE;
	public static final VarHandle PICTURE_LAYOUT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STD_PROFILE_IDC_BYTE_OFFSET;
	public static final long PICTURE_LAYOUT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("stdProfileIdc"),
		    JAVA_INT.withName("pictureLayout")
		).withName("VkVideoDecodeH264ProfileInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STD_PROFILE_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stdProfileIdc"));
		PICTURE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pictureLayout"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STD_PROFILE_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stdProfileIdc"));
		PICTURE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pictureLayout"));
		//@formatter:on
	}

	public VkVideoDecodeH264ProfileInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoDecodeH264ProfileInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoDecodeH264ProfileInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoDecodeH264ProfileInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeH264ProfileInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #stdProfileIdc()
    public VkVideoDecodeH264ProfileInfoKHR stdProfileIdc(int stdProfileIdc) {
    	STD_PROFILE_IDC_HANDLE.set(segment, 0L, stdProfileIdc);
    	return this;
    }
    
    public int stdProfileIdc() {
    	return (int) STD_PROFILE_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #pictureLayout()
    public VkVideoDecodeH264ProfileInfoKHR pictureLayout(int pictureLayout) {
    	PICTURE_LAYOUT_HANDLE.set(segment, 0L, pictureLayout);
    	return this;
    }
    
    public int pictureLayout() {
    	return (int) PICTURE_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoDecodeH264ProfileInfoKHR set(VkVideoDecodeH264ProfileInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeH264ProfileInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeH264ProfileInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeH264ProfileInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoDecodeH264ProfileInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeH264ProfileInfoKHR> array(SegmentAllocator allocator, VkVideoDecodeH264ProfileInfoKHR... structs) {
        NativeStructArray<VkVideoDecodeH264ProfileInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoDecodeH264ProfileInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeH264ProfileInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeH264ProfileInfoKHR(segment)
        );
    }

}