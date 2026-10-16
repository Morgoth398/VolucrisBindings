/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaLcg
		implements Struct<MaLcg> {

	public static final StructLayout LAYOUT;

	public static final VarHandle STATE_HANDLE;

	public static final long STATE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("state")
		).withName("ma_lcg").withByteAlignment(4);
		
		STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("state"));
		
		STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("state"));
		//@formatter:on
	}

	public MaLcg() {
	    this(Arena.ofAuto());
	}
	
	public MaLcg(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaLcg(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #state()
    public MaLcg state(int state) {
    	STATE_HANDLE.set(segment, 0L, state);
    	return this;
    }
    
    public int state() {
    	return (int) STATE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaLcg set(MaLcg other) {
        return set(other.segment);
    }
    
    @Override
    public MaLcg set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaLcg> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaLcg> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaLcg(segment),
            count
        );
    }
    
    public static NativeStructArray<MaLcg> array(Arena arena, MaLcg... structs) {
        NativeStructArray<MaLcg> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaLcg(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaLcg> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaLcg(segment)
        );
    }

}