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

public final class VkDispatchParametersARM
		implements Struct<VkDispatchParametersARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle WORK_GROUP_BATCH_SIZE_HANDLE;
	public static final VarHandle MAX_QUEUED_WORK_GROUP_BATCHES_HANDLE;
	public static final VarHandle MAX_WARPS_PER_SHADER_CORE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long WORK_GROUP_BATCH_SIZE_BYTE_OFFSET;
	public static final long MAX_QUEUED_WORK_GROUP_BATCHES_BYTE_OFFSET;
	public static final long MAX_WARPS_PER_SHADER_CORE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("workGroupBatchSize"),
		    JAVA_INT.withName("maxQueuedWorkGroupBatches"),
		    JAVA_INT.withName("maxWarpsPerShaderCore"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDispatchParametersARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		WORK_GROUP_BATCH_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("workGroupBatchSize"));
		MAX_QUEUED_WORK_GROUP_BATCHES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxQueuedWorkGroupBatches"));
		MAX_WARPS_PER_SHADER_CORE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxWarpsPerShaderCore"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		WORK_GROUP_BATCH_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("workGroupBatchSize"));
		MAX_QUEUED_WORK_GROUP_BATCHES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxQueuedWorkGroupBatches"));
		MAX_WARPS_PER_SHADER_CORE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxWarpsPerShaderCore"));
		//@formatter:on
	}

	public VkDispatchParametersARM() {
	    this(Arena.ofAuto());
	}
	
	public VkDispatchParametersARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDispatchParametersARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDispatchParametersARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDispatchParametersARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #workGroupBatchSize()
    public VkDispatchParametersARM workGroupBatchSize(int workGroupBatchSize) {
    	WORK_GROUP_BATCH_SIZE_HANDLE.set(segment, 0L, workGroupBatchSize);
    	return this;
    }
    
    public int workGroupBatchSize() {
    	return (int) WORK_GROUP_BATCH_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxQueuedWorkGroupBatches()
    public VkDispatchParametersARM maxQueuedWorkGroupBatches(int maxQueuedWorkGroupBatches) {
    	MAX_QUEUED_WORK_GROUP_BATCHES_HANDLE.set(segment, 0L, maxQueuedWorkGroupBatches);
    	return this;
    }
    
    public int maxQueuedWorkGroupBatches() {
    	return (int) MAX_QUEUED_WORK_GROUP_BATCHES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxWarpsPerShaderCore()
    public VkDispatchParametersARM maxWarpsPerShaderCore(int maxWarpsPerShaderCore) {
    	MAX_WARPS_PER_SHADER_CORE_HANDLE.set(segment, 0L, maxWarpsPerShaderCore);
    	return this;
    }
    
    public int maxWarpsPerShaderCore() {
    	return (int) MAX_WARPS_PER_SHADER_CORE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDispatchParametersARM set(VkDispatchParametersARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDispatchParametersARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDispatchParametersARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDispatchParametersARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDispatchParametersARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDispatchParametersARM> array(SegmentAllocator allocator, VkDispatchParametersARM... structs) {
        NativeStructArray<VkDispatchParametersARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDispatchParametersARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDispatchParametersARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDispatchParametersARM(segment)
        );
    }

}