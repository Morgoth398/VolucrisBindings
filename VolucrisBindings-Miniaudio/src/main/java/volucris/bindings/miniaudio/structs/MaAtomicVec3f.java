/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaAtomicVec3f
		implements Struct<MaAtomicVec3f> {

	public static final StructLayout LAYOUT;

	public static final VarHandle LOCK_HANDLE;

	public static final long V_BYTE_OFFSET;
	public static final long LOCK_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaVec3f v;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaVec3f.LAYOUT.withName("v"),
		    JAVA_INT.withName("lock")
		).withName("ma_atomic_vec3f").withByteAlignment(4);
		
		LOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lock"));
		
		V_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("v"));
		LOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lock"));
		//@formatter:on
	}

	public MaAtomicVec3f() {
	    this(Arena.ofAuto());
	}
	
	public MaAtomicVec3f(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaAtomicVec3f(MemorySegment segment) {
	    this.segment = segment;
	
	    v = new MaVec3f(segment.asSlice(V_BYTE_OFFSET, MaVec3f.LAYOUT));
	}

    /// @see #v()
    public MaAtomicVec3f v(Consumer<MaVec3f> consumer) {
    	consumer.accept(v);
    	return this;
    }
    
    /// @see #v()
    public MaAtomicVec3f v(MaVec3f other) {
    	v.set(other);
    	return this;
    }
    
    public MaVec3f v() {
    	return v;
    }
    
    /// @see #lock()
    public MaAtomicVec3f lock(int lock) {
    	LOCK_HANDLE.set(segment, 0L, lock);
    	return this;
    }
    
    public int lock() {
    	return (int) LOCK_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaAtomicVec3f set(MaAtomicVec3f other) {
        return set(other.segment);
    }
    
    @Override
    public MaAtomicVec3f set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaAtomicVec3f> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaAtomicVec3f> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaAtomicVec3f(segment),
            count
        );
    }
    
    public static NativeStructArray<MaAtomicVec3f> array(Arena arena, MaAtomicVec3f... structs) {
        NativeStructArray<MaAtomicVec3f> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaAtomicVec3f(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaAtomicVec3f> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaAtomicVec3f(segment)
        );
    }

}