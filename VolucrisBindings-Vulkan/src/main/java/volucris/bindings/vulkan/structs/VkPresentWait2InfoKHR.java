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

public final class VkPresentWait2InfoKHR
		implements Struct<VkPresentWait2InfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PRESENT_ID_HANDLE;
	public static final VarHandle TIMEOUT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PRESENT_ID_BYTE_OFFSET;
	public static final long TIMEOUT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("presentId"),
		    JAVA_LONG.withName("timeout")
		).withName("VkPresentWait2InfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PRESENT_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentId"));
		TIMEOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("timeout"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PRESENT_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentId"));
		TIMEOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timeout"));
		//@formatter:on
	}

	public VkPresentWait2InfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPresentWait2InfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPresentWait2InfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPresentWait2InfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPresentWait2InfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #presentId()
    public VkPresentWait2InfoKHR presentId(long presentId) {
    	PRESENT_ID_HANDLE.set(segment, 0L, presentId);
    	return this;
    }
    
    public long presentId() {
    	return (long) PRESENT_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #timeout()
    public VkPresentWait2InfoKHR timeout(long timeout) {
    	TIMEOUT_HANDLE.set(segment, 0L, timeout);
    	return this;
    }
    
    public long timeout() {
    	return (long) TIMEOUT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPresentWait2InfoKHR set(VkPresentWait2InfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPresentWait2InfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPresentWait2InfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPresentWait2InfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPresentWait2InfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPresentWait2InfoKHR> array(SegmentAllocator allocator, VkPresentWait2InfoKHR... structs) {
        NativeStructArray<VkPresentWait2InfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPresentWait2InfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPresentWait2InfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPresentWait2InfoKHR(segment)
        );
    }

}