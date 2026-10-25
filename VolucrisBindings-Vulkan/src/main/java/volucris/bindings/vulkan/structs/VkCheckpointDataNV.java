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

public final class VkCheckpointDataNV
		implements Struct<VkCheckpointDataNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STAGE_HANDLE;
	public static final VarHandle P_CHECKPOINT_MARKER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STAGE_BYTE_OFFSET;
	public static final long P_CHECKPOINT_MARKER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("stage"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pCheckpointMarker")
		).withName("VkCheckpointDataNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stage"));
		P_CHECKPOINT_MARKER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCheckpointMarker"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stage"));
		P_CHECKPOINT_MARKER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCheckpointMarker"));
		//@formatter:on
	}

	public VkCheckpointDataNV() {
	    this(Arena.ofAuto());
	}
	
	public VkCheckpointDataNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkCheckpointDataNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkCheckpointDataNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCheckpointDataNV pNext(MemorySegment pNext) {
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
    public VkCheckpointDataNV stage(int stage) {
    	STAGE_HANDLE.set(segment, 0L, stage);
    	return this;
    }
    
    public int stage() {
    	return (int) STAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCheckpointMarker()
    public VkCheckpointDataNV pCheckpointMarker(MemorySegment pCheckpointMarker) {
    	P_CHECKPOINT_MARKER_HANDLE.set(segment, 0L, pCheckpointMarker);
    	return this;
    }
    
    public @Nullable MemorySegment pCheckpointMarker() {
    	MemorySegment segment = (MemorySegment) P_CHECKPOINT_MARKER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkCheckpointDataNV set(VkCheckpointDataNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkCheckpointDataNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCheckpointDataNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCheckpointDataNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCheckpointDataNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCheckpointDataNV> array(SegmentAllocator allocator, VkCheckpointDataNV... structs) {
        NativeStructArray<VkCheckpointDataNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCheckpointDataNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCheckpointDataNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCheckpointDataNV(segment)
        );
    }

}