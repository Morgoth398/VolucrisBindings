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

public final class VkVideoDecodeH265ProfileInfoKHR
		implements Struct<VkVideoDecodeH265ProfileInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STD_PROFILE_IDC_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STD_PROFILE_IDC_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("stdProfileIdc"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkVideoDecodeH265ProfileInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STD_PROFILE_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stdProfileIdc"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STD_PROFILE_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stdProfileIdc"));
		//@formatter:on
	}

	public VkVideoDecodeH265ProfileInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoDecodeH265ProfileInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoDecodeH265ProfileInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoDecodeH265ProfileInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeH265ProfileInfoKHR pNext(MemorySegment pNext) {
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
    public VkVideoDecodeH265ProfileInfoKHR stdProfileIdc(int stdProfileIdc) {
    	STD_PROFILE_IDC_HANDLE.set(segment, 0L, stdProfileIdc);
    	return this;
    }
    
    public int stdProfileIdc() {
    	return (int) STD_PROFILE_IDC_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoDecodeH265ProfileInfoKHR set(VkVideoDecodeH265ProfileInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeH265ProfileInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeH265ProfileInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeH265ProfileInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeH265ProfileInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeH265ProfileInfoKHR> array(Arena arena, VkVideoDecodeH265ProfileInfoKHR... structs) {
        NativeStructArray<VkVideoDecodeH265ProfileInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeH265ProfileInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeH265ProfileInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeH265ProfileInfoKHR(segment)
        );
    }

}