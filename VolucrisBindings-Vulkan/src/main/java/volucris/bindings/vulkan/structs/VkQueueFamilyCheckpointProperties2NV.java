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

public final class VkQueueFamilyCheckpointProperties2NV
		implements Struct<VkQueueFamilyCheckpointProperties2NV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle CHECKPOINT_EXECUTION_STAGE_MASK_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long CHECKPOINT_EXECUTION_STAGE_MASK_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("checkpointExecutionStageMask")
		).withName("VkQueueFamilyCheckpointProperties2NV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		CHECKPOINT_EXECUTION_STAGE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("checkpointExecutionStageMask"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		CHECKPOINT_EXECUTION_STAGE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("checkpointExecutionStageMask"));
		//@formatter:on
	}

	public VkQueueFamilyCheckpointProperties2NV() {
	    this(Arena.ofAuto());
	}
	
	public VkQueueFamilyCheckpointProperties2NV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkQueueFamilyCheckpointProperties2NV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkQueueFamilyCheckpointProperties2NV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkQueueFamilyCheckpointProperties2NV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #checkpointExecutionStageMask()
    public VkQueueFamilyCheckpointProperties2NV checkpointExecutionStageMask(long checkpointExecutionStageMask) {
    	CHECKPOINT_EXECUTION_STAGE_MASK_HANDLE.set(segment, 0L, checkpointExecutionStageMask);
    	return this;
    }
    
    public long checkpointExecutionStageMask() {
    	return (long) CHECKPOINT_EXECUTION_STAGE_MASK_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkQueueFamilyCheckpointProperties2NV set(VkQueueFamilyCheckpointProperties2NV other) {
        return set(other.segment);
    }
    
    @Override
    public VkQueueFamilyCheckpointProperties2NV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkQueueFamilyCheckpointProperties2NV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkQueueFamilyCheckpointProperties2NV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkQueueFamilyCheckpointProperties2NV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkQueueFamilyCheckpointProperties2NV> array(Arena arena, VkQueueFamilyCheckpointProperties2NV... structs) {
        NativeStructArray<VkQueueFamilyCheckpointProperties2NV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkQueueFamilyCheckpointProperties2NV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkQueueFamilyCheckpointProperties2NV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkQueueFamilyCheckpointProperties2NV(segment)
        );
    }

}