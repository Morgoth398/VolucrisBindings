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

public final class VkSetPresentConfigNV
		implements Struct<VkSetPresentConfigNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle NUM_FRAMES_PER_BATCH_HANDLE;
	public static final VarHandle PRESENT_CONFIG_FEEDBACK_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long NUM_FRAMES_PER_BATCH_BYTE_OFFSET;
	public static final long PRESENT_CONFIG_FEEDBACK_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("numFramesPerBatch"),
		    JAVA_INT.withName("presentConfigFeedback")
		).withName("VkSetPresentConfigNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		NUM_FRAMES_PER_BATCH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numFramesPerBatch"));
		PRESENT_CONFIG_FEEDBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentConfigFeedback"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		NUM_FRAMES_PER_BATCH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numFramesPerBatch"));
		PRESENT_CONFIG_FEEDBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentConfigFeedback"));
		//@formatter:on
	}

	public VkSetPresentConfigNV() {
	    this(Arena.ofAuto());
	}
	
	public VkSetPresentConfigNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSetPresentConfigNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSetPresentConfigNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSetPresentConfigNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #numFramesPerBatch()
    public VkSetPresentConfigNV numFramesPerBatch(int numFramesPerBatch) {
    	NUM_FRAMES_PER_BATCH_HANDLE.set(segment, 0L, numFramesPerBatch);
    	return this;
    }
    
    public int numFramesPerBatch() {
    	return (int) NUM_FRAMES_PER_BATCH_HANDLE.get(segment, 0L);
    }
    
    /// @see #presentConfigFeedback()
    public VkSetPresentConfigNV presentConfigFeedback(int presentConfigFeedback) {
    	PRESENT_CONFIG_FEEDBACK_HANDLE.set(segment, 0L, presentConfigFeedback);
    	return this;
    }
    
    public int presentConfigFeedback() {
    	return (int) PRESENT_CONFIG_FEEDBACK_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSetPresentConfigNV set(VkSetPresentConfigNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkSetPresentConfigNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSetPresentConfigNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSetPresentConfigNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSetPresentConfigNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSetPresentConfigNV> array(SegmentAllocator allocator, VkSetPresentConfigNV... structs) {
        NativeStructArray<VkSetPresentConfigNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSetPresentConfigNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSetPresentConfigNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSetPresentConfigNV(segment)
        );
    }

}