/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaTimer
		implements Struct<MaTimer> {

	public static final UnionLayout LAYOUT;

	public static final VarHandle COUNTER_HANDLE;
	public static final VarHandle COUNTER_D_HANDLE;

	public static final long COUNTER_BYTE_OFFSET;
	public static final long COUNTER_D_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.unionLayout(
		    JAVA_LONG.withName("counter"),
		    JAVA_DOUBLE.withName("counterD")
		).withName("ma_timer").withByteAlignment(8);
		
		COUNTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("counter"));
		COUNTER_D_HANDLE = LAYOUT.varHandle(PathElement.groupElement("counterD"));
		
		COUNTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("counter"));
		COUNTER_D_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("counterD"));
		//@formatter:on
	}

	public MaTimer() {
	    this(Arena.ofAuto());
	}
	
	public MaTimer(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaTimer(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #counter()
    public MaTimer counter(long counter) {
    	COUNTER_HANDLE.set(segment, 0L, counter);
    	return this;
    }
    
    public long counter() {
    	return (long) COUNTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #counterD()
    public MaTimer counterD(double counterD) {
    	COUNTER_D_HANDLE.set(segment, 0L, counterD);
    	return this;
    }
    
    public double counterD() {
    	return (double) COUNTER_D_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaTimer set(MaTimer other) {
        return set(other.segment);
    }
    
    @Override
    public MaTimer set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaTimer> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaTimer> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaTimer(segment),
            count
        );
    }
    
    public static NativeStructArray<MaTimer> array(Arena arena, MaTimer... structs) {
        NativeStructArray<MaTimer> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaTimer(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaTimer> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaTimer(segment)
        );
    }

}