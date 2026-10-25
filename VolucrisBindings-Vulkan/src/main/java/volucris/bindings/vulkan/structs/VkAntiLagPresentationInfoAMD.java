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

public final class VkAntiLagPresentationInfoAMD
		implements Struct<VkAntiLagPresentationInfoAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STAGE_HANDLE;
	public static final VarHandle FRAME_INDEX_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STAGE_BYTE_OFFSET;
	public static final long FRAME_INDEX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("stage"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("frameIndex")
		).withName("VkAntiLagPresentationInfoAMD").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stage"));
		FRAME_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frameIndex"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stage"));
		FRAME_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frameIndex"));
		//@formatter:on
	}

	public VkAntiLagPresentationInfoAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkAntiLagPresentationInfoAMD(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkAntiLagPresentationInfoAMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkAntiLagPresentationInfoAMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAntiLagPresentationInfoAMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #stage()
    public VkAntiLagPresentationInfoAMD stage(int stage) {
    	STAGE_HANDLE.set(segment, 0L, stage);
    	return this;
    }
    
    public int stage() {
    	return (int) STAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #frameIndex()
    public VkAntiLagPresentationInfoAMD frameIndex(long frameIndex) {
    	FRAME_INDEX_HANDLE.set(segment, 0L, frameIndex);
    	return this;
    }
    
    public long frameIndex() {
    	return (long) FRAME_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAntiLagPresentationInfoAMD set(VkAntiLagPresentationInfoAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkAntiLagPresentationInfoAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAntiLagPresentationInfoAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAntiLagPresentationInfoAMD> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAntiLagPresentationInfoAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAntiLagPresentationInfoAMD> array(SegmentAllocator allocator, VkAntiLagPresentationInfoAMD... structs) {
        NativeStructArray<VkAntiLagPresentationInfoAMD> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAntiLagPresentationInfoAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAntiLagPresentationInfoAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAntiLagPresentationInfoAMD(segment)
        );
    }

}