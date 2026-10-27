/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.mimalloc;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MiSubprocId
		implements Struct<MiSubprocId> {

	public static final StructLayout LAYOUT;

	public static final VarHandle _MI_SUBPROC_ID_HANDLE;

	public static final long _MI_SUBPROC_ID_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("_mi_subproc_id")
		).withName("mi_subproc_id_t").withByteAlignment(8);
		
		_MI_SUBPROC_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_mi_subproc_id"));
		
		_MI_SUBPROC_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_mi_subproc_id"));
		//@formatter:on
	}

	public MiSubprocId() {
	    this(Arena.ofAuto());
	}
	
	public MiSubprocId(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MiSubprocId(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #_mi_subproc_id()
    public MiSubprocId _mi_subproc_id(MemorySegment _mi_subproc_id) {
    	_MI_SUBPROC_ID_HANDLE.set(segment, 0L, _mi_subproc_id);
    	return this;
    }
    
    public @Nullable MemorySegment _mi_subproc_id() {
    	MemorySegment segment = (MemorySegment) _MI_SUBPROC_ID_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public MiSubprocId set(MiSubprocId other) {
        return set(other.segment);
    }
    
    @Override
    public MiSubprocId set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MiSubprocId> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MiSubprocId> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MiSubprocId(segment),
            count
        );
    }
    
    public static NativeStructArray<MiSubprocId> array(SegmentAllocator allocator, MiSubprocId... structs) {
        NativeStructArray<MiSubprocId> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MiSubprocId(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MiSubprocId> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MiSubprocId(segment)
        );
    }

}