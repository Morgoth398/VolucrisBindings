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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkFrameBoundaryTensorsARM
		implements Struct<VkFrameBoundaryTensorsARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TENSOR_COUNT_HANDLE;
	public static final VarHandle P_TENSORS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TENSOR_COUNT_BYTE_OFFSET;
	public static final long P_TENSORS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("tensorCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pTensors")
		).withName("VkFrameBoundaryTensorsARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TENSOR_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tensorCount"));
		P_TENSORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTensors"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TENSOR_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tensorCount"));
		P_TENSORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTensors"));
		//@formatter:on
	}

	public VkFrameBoundaryTensorsARM() {
	    this(Arena.ofAuto());
	}
	
	public VkFrameBoundaryTensorsARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkFrameBoundaryTensorsARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkFrameBoundaryTensorsARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkFrameBoundaryTensorsARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #tensorCount()
    public VkFrameBoundaryTensorsARM tensorCount(int tensorCount) {
    	TENSOR_COUNT_HANDLE.set(segment, 0L, tensorCount);
    	return this;
    }
    
    public int tensorCount() {
    	return (int) TENSOR_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pTensors()
    public VkFrameBoundaryTensorsARM pTensors(NativePointerArray pTensors) {
    	P_TENSORS_HANDLE.set(segment, 0L, pTensors.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pTensors() {
    	MemorySegment segment = (MemorySegment) P_TENSORS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public VkFrameBoundaryTensorsARM set(VkFrameBoundaryTensorsARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkFrameBoundaryTensorsARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkFrameBoundaryTensorsARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkFrameBoundaryTensorsARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkFrameBoundaryTensorsARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkFrameBoundaryTensorsARM> array(SegmentAllocator allocator, VkFrameBoundaryTensorsARM... structs) {
        NativeStructArray<VkFrameBoundaryTensorsARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkFrameBoundaryTensorsARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkFrameBoundaryTensorsARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkFrameBoundaryTensorsARM(segment)
        );
    }

}