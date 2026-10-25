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

public final class VkVideoEncodeH264GopRemainingFrameInfoKHR
		implements Struct<VkVideoEncodeH264GopRemainingFrameInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle USE_GOP_REMAINING_FRAMES_HANDLE;
	public static final VarHandle GOP_REMAINING_I_HANDLE;
	public static final VarHandle GOP_REMAINING_P_HANDLE;
	public static final VarHandle GOP_REMAINING_B_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long USE_GOP_REMAINING_FRAMES_BYTE_OFFSET;
	public static final long GOP_REMAINING_I_BYTE_OFFSET;
	public static final long GOP_REMAINING_P_BYTE_OFFSET;
	public static final long GOP_REMAINING_B_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("useGopRemainingFrames"),
		    JAVA_INT.withName("gopRemainingI"),
		    JAVA_INT.withName("gopRemainingP"),
		    JAVA_INT.withName("gopRemainingB")
		).withName("VkVideoEncodeH264GopRemainingFrameInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		USE_GOP_REMAINING_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("useGopRemainingFrames"));
		GOP_REMAINING_I_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gopRemainingI"));
		GOP_REMAINING_P_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gopRemainingP"));
		GOP_REMAINING_B_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gopRemainingB"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		USE_GOP_REMAINING_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useGopRemainingFrames"));
		GOP_REMAINING_I_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingI"));
		GOP_REMAINING_P_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingP"));
		GOP_REMAINING_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingB"));
		//@formatter:on
	}

	public VkVideoEncodeH264GopRemainingFrameInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeH264GopRemainingFrameInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoEncodeH264GopRemainingFrameInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeH264GopRemainingFrameInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeH264GopRemainingFrameInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #useGopRemainingFrames()
    public VkVideoEncodeH264GopRemainingFrameInfoKHR useGopRemainingFrames(int useGopRemainingFrames) {
    	USE_GOP_REMAINING_FRAMES_HANDLE.set(segment, 0L, useGopRemainingFrames);
    	return this;
    }
    
    public int useGopRemainingFrames() {
    	return (int) USE_GOP_REMAINING_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #gopRemainingI()
    public VkVideoEncodeH264GopRemainingFrameInfoKHR gopRemainingI(int gopRemainingI) {
    	GOP_REMAINING_I_HANDLE.set(segment, 0L, gopRemainingI);
    	return this;
    }
    
    public int gopRemainingI() {
    	return (int) GOP_REMAINING_I_HANDLE.get(segment, 0L);
    }
    
    /// @see #gopRemainingP()
    public VkVideoEncodeH264GopRemainingFrameInfoKHR gopRemainingP(int gopRemainingP) {
    	GOP_REMAINING_P_HANDLE.set(segment, 0L, gopRemainingP);
    	return this;
    }
    
    public int gopRemainingP() {
    	return (int) GOP_REMAINING_P_HANDLE.get(segment, 0L);
    }
    
    /// @see #gopRemainingB()
    public VkVideoEncodeH264GopRemainingFrameInfoKHR gopRemainingB(int gopRemainingB) {
    	GOP_REMAINING_B_HANDLE.set(segment, 0L, gopRemainingB);
    	return this;
    }
    
    public int gopRemainingB() {
    	return (int) GOP_REMAINING_B_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeH264GopRemainingFrameInfoKHR set(VkVideoEncodeH264GopRemainingFrameInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH264GopRemainingFrameInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH264GopRemainingFrameInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH264GopRemainingFrameInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeH264GopRemainingFrameInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH264GopRemainingFrameInfoKHR> array(SegmentAllocator allocator, VkVideoEncodeH264GopRemainingFrameInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeH264GopRemainingFrameInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeH264GopRemainingFrameInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH264GopRemainingFrameInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH264GopRemainingFrameInfoKHR(segment)
        );
    }

}