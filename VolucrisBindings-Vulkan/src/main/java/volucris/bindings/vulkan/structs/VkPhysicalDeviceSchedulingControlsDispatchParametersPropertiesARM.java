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

public final class VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM
		implements Struct<VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SCHEDULING_CONTROLS_MAX_WARPS_COUNT_HANDLE;
	public static final VarHandle SCHEDULING_CONTROLS_MAX_QUEUED_BATCHES_COUNT_HANDLE;
	public static final VarHandle SCHEDULING_CONTROLS_MAX_WORK_GROUP_BATCH_SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SCHEDULING_CONTROLS_MAX_WARPS_COUNT_BYTE_OFFSET;
	public static final long SCHEDULING_CONTROLS_MAX_QUEUED_BATCHES_COUNT_BYTE_OFFSET;
	public static final long SCHEDULING_CONTROLS_MAX_WORK_GROUP_BATCH_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("schedulingControlsMaxWarpsCount"),
		    JAVA_INT.withName("schedulingControlsMaxQueuedBatchesCount"),
		    JAVA_INT.withName("schedulingControlsMaxWorkGroupBatchSize"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SCHEDULING_CONTROLS_MAX_WARPS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("schedulingControlsMaxWarpsCount"));
		SCHEDULING_CONTROLS_MAX_QUEUED_BATCHES_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("schedulingControlsMaxQueuedBatchesCount"));
		SCHEDULING_CONTROLS_MAX_WORK_GROUP_BATCH_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("schedulingControlsMaxWorkGroupBatchSize"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SCHEDULING_CONTROLS_MAX_WARPS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("schedulingControlsMaxWarpsCount"));
		SCHEDULING_CONTROLS_MAX_QUEUED_BATCHES_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("schedulingControlsMaxQueuedBatchesCount"));
		SCHEDULING_CONTROLS_MAX_WORK_GROUP_BATCH_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("schedulingControlsMaxWorkGroupBatchSize"));
		//@formatter:on
	}

	public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #schedulingControlsMaxWarpsCount()
    public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM schedulingControlsMaxWarpsCount(int schedulingControlsMaxWarpsCount) {
    	SCHEDULING_CONTROLS_MAX_WARPS_COUNT_HANDLE.set(segment, 0L, schedulingControlsMaxWarpsCount);
    	return this;
    }
    
    public int schedulingControlsMaxWarpsCount() {
    	return (int) SCHEDULING_CONTROLS_MAX_WARPS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #schedulingControlsMaxQueuedBatchesCount()
    public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM schedulingControlsMaxQueuedBatchesCount(int schedulingControlsMaxQueuedBatchesCount) {
    	SCHEDULING_CONTROLS_MAX_QUEUED_BATCHES_COUNT_HANDLE.set(segment, 0L, schedulingControlsMaxQueuedBatchesCount);
    	return this;
    }
    
    public int schedulingControlsMaxQueuedBatchesCount() {
    	return (int) SCHEDULING_CONTROLS_MAX_QUEUED_BATCHES_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #schedulingControlsMaxWorkGroupBatchSize()
    public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM schedulingControlsMaxWorkGroupBatchSize(int schedulingControlsMaxWorkGroupBatchSize) {
    	SCHEDULING_CONTROLS_MAX_WORK_GROUP_BATCH_SIZE_HANDLE.set(segment, 0L, schedulingControlsMaxWorkGroupBatchSize);
    	return this;
    }
    
    public int schedulingControlsMaxWorkGroupBatchSize() {
    	return (int) SCHEDULING_CONTROLS_MAX_WORK_GROUP_BATCH_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM set(VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM> array(Arena arena, VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM... structs) {
        NativeStructArray<VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM(segment)
        );
    }

}