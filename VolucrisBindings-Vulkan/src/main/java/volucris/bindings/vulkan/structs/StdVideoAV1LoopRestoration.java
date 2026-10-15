/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoAV1LoopRestoration
		implements Struct<StdVideoAV1LoopRestoration> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FRAME_RESTORATION_TYPE_HANDLE;
	public static final VarHandle LOOP_RESTORATION_SIZE_HANDLE;

	public static final long FRAME_RESTORATION_TYPE_BYTE_OFFSET;
	public static final long LOOP_RESTORATION_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MemoryLayout.sequenceLayout(3, JAVA_INT).withName("FrameRestorationType"),
		    MemoryLayout.sequenceLayout(3, JAVA_SHORT).withName("LoopRestorationSize"),
		    MemoryLayout.paddingLayout(2)
		).withName("StdVideoAV1LoopRestoration").withByteAlignment(4);
		
		FRAME_RESTORATION_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("FrameRestorationType"), PathElement.sequenceElement());
		LOOP_RESTORATION_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("LoopRestorationSize"), PathElement.sequenceElement());
		
		FRAME_RESTORATION_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("FrameRestorationType"));
		LOOP_RESTORATION_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("LoopRestorationSize"));
		//@formatter:on
	}

	public StdVideoAV1LoopRestoration() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoAV1LoopRestoration(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoAV1LoopRestoration(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #frameRestorationType(int)
    public StdVideoAV1LoopRestoration frameRestorationType(int frameRestorationType, int index0) {
    	FRAME_RESTORATION_TYPE_HANDLE.set(segment, 0L, index0, frameRestorationType);
    	return this;
    }
    
    public int frameRestorationType(int index0) {
    	return (int) FRAME_RESTORATION_TYPE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #loopRestorationSize(int)
    public StdVideoAV1LoopRestoration loopRestorationSize(short loopRestorationSize, int index0) {
    	LOOP_RESTORATION_SIZE_HANDLE.set(segment, 0L, index0, loopRestorationSize);
    	return this;
    }
    
    public short loopRestorationSize(int index0) {
    	return (short) LOOP_RESTORATION_SIZE_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public StdVideoAV1LoopRestoration set(StdVideoAV1LoopRestoration other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoAV1LoopRestoration set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoAV1LoopRestoration> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoAV1LoopRestoration> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1LoopRestoration(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoAV1LoopRestoration> array(Arena arena, StdVideoAV1LoopRestoration... structs) {
        NativeStructArray<StdVideoAV1LoopRestoration> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1LoopRestoration(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoAV1LoopRestoration> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoAV1LoopRestoration(segment)
        );
    }

}