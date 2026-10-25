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

public final class VkCopyTensorInfoARM
		implements Struct<VkCopyTensorInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SRC_TENSOR_HANDLE;
	public static final VarHandle DST_TENSOR_HANDLE;
	public static final VarHandle REGION_COUNT_HANDLE;
	public static final VarHandle P_REGIONS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SRC_TENSOR_BYTE_OFFSET;
	public static final long DST_TENSOR_BYTE_OFFSET;
	public static final long REGION_COUNT_BYTE_OFFSET;
	public static final long P_REGIONS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("srcTensor"),
		    UNBOUNDED_ADDRESS.withName("dstTensor"),
		    JAVA_INT.withName("regionCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pRegions")
		).withName("VkCopyTensorInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SRC_TENSOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcTensor"));
		DST_TENSOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstTensor"));
		REGION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("regionCount"));
		P_REGIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pRegions"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SRC_TENSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcTensor"));
		DST_TENSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstTensor"));
		REGION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
		P_REGIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
		//@formatter:on
	}

	public VkCopyTensorInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkCopyTensorInfoARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkCopyTensorInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkCopyTensorInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCopyTensorInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #srcTensor()
    public VkCopyTensorInfoARM srcTensor(VkTensorARM srcTensor) {
    	SRC_TENSOR_HANDLE.set(segment, 0L, srcTensor.memorySegment());
    	return this;
    }
    
    public @Nullable VkTensorARM srcTensor() {
    	MemorySegment segment = (MemorySegment) SRC_TENSOR_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkTensorARM(segment);
    }
    
    /// @see #dstTensor()
    public VkCopyTensorInfoARM dstTensor(VkTensorARM dstTensor) {
    	DST_TENSOR_HANDLE.set(segment, 0L, dstTensor.memorySegment());
    	return this;
    }
    
    public @Nullable VkTensorARM dstTensor() {
    	MemorySegment segment = (MemorySegment) DST_TENSOR_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkTensorARM(segment);
    }
    
    /// @see #regionCount()
    public VkCopyTensorInfoARM regionCount(int regionCount) {
    	REGION_COUNT_HANDLE.set(segment, 0L, regionCount);
    	return this;
    }
    
    public int regionCount() {
    	return (int) REGION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pRegions()
    public VkCopyTensorInfoARM pRegions(NativeStructArray<VkTensorCopyARM> pRegions) {
    	P_REGIONS_HANDLE.set(segment, 0L, pRegions.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkTensorCopyARM> pRegions() {
    	MemorySegment segment = (MemorySegment) P_REGIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkTensorCopyARM.array(segment);
    }
    
    @Override
    public VkCopyTensorInfoARM set(VkCopyTensorInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkCopyTensorInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCopyTensorInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCopyTensorInfoARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCopyTensorInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCopyTensorInfoARM> array(SegmentAllocator allocator, VkCopyTensorInfoARM... structs) {
        NativeStructArray<VkCopyTensorInfoARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCopyTensorInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCopyTensorInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCopyTensorInfoARM(segment)
        );
    }

}