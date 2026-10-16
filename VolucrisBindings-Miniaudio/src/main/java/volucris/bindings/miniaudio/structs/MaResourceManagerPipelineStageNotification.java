/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaResourceManagerPipelineStageNotification
		implements Struct<MaResourceManagerPipelineStageNotification> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_NOTIFICATION_HANDLE;
	public static final VarHandle P_FENCE_HANDLE;

	public static final long P_NOTIFICATION_BYTE_OFFSET;
	public static final long P_FENCE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pNotification"),
		    UNBOUNDED_ADDRESS.withName("pFence")
		).withName("ma_resource_manager_pipeline_stage_notification").withByteAlignment(8);
		
		P_NOTIFICATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNotification"));
		P_FENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pFence"));
		
		P_NOTIFICATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNotification"));
		P_FENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pFence"));
		//@formatter:on
	}

	public MaResourceManagerPipelineStageNotification() {
	    this(Arena.ofAuto());
	}
	
	public MaResourceManagerPipelineStageNotification(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaResourceManagerPipelineStageNotification(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #pNotification()
    public MaResourceManagerPipelineStageNotification pNotification(MemorySegment pNotification) {
    	P_NOTIFICATION_HANDLE.set(segment, 0L, pNotification);
    	return this;
    }
    
    public @Nullable MemorySegment pNotification() {
    	MemorySegment segment = (MemorySegment) P_NOTIFICATION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pFence()
    public MaResourceManagerPipelineStageNotification pFence(MaFence pFence) {
    	P_FENCE_HANDLE.set(segment, 0L, pFence.memorySegment());
    	return this;
    }
    
    public @Nullable MaFence pFence() {
    	MemorySegment segment = (MemorySegment) P_FENCE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaFence(segment);
    }
    
    @Override
    public MaResourceManagerPipelineStageNotification set(MaResourceManagerPipelineStageNotification other) {
        return set(other.segment);
    }
    
    @Override
    public MaResourceManagerPipelineStageNotification set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaResourceManagerPipelineStageNotification> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaResourceManagerPipelineStageNotification> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManagerPipelineStageNotification(segment),
            count
        );
    }
    
    public static NativeStructArray<MaResourceManagerPipelineStageNotification> array(Arena arena, MaResourceManagerPipelineStageNotification... structs) {
        NativeStructArray<MaResourceManagerPipelineStageNotification> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManagerPipelineStageNotification(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaResourceManagerPipelineStageNotification> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaResourceManagerPipelineStageNotification(segment)
        );
    }

}