/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.msdfgen;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MsdfBounds
		implements Struct<MsdfBounds> {

	public static final StructLayout LAYOUT;

	public static final VarHandle L_HANDLE;
	public static final VarHandle B_HANDLE;
	public static final VarHandle R_HANDLE;
	public static final VarHandle T_HANDLE;

	public static final long L_BYTE_OFFSET;
	public static final long B_BYTE_OFFSET;
	public static final long R_BYTE_OFFSET;
	public static final long T_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_DOUBLE.withName("l"),
		    JAVA_DOUBLE.withName("b"),
		    JAVA_DOUBLE.withName("r"),
		    JAVA_DOUBLE.withName("t")
		).withName("msdf_bounds").withByteAlignment(8);
		
		L_HANDLE = LAYOUT.varHandle(PathElement.groupElement("l"));
		B_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b"));
		R_HANDLE = LAYOUT.varHandle(PathElement.groupElement("r"));
		T_HANDLE = LAYOUT.varHandle(PathElement.groupElement("t"));
		
		L_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("l"));
		B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b"));
		R_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("r"));
		T_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("t"));
		//@formatter:on
	}

	public MsdfBounds() {
	    this(Arena.ofAuto());
	}
	
	public MsdfBounds(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MsdfBounds(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #l()
    public MsdfBounds l(double l) {
    	L_HANDLE.set(segment, 0L, l);
    	return this;
    }
    
    public double l() {
    	return (double) L_HANDLE.get(segment, 0L);
    }
    
    /// @see #b()
    public MsdfBounds b(double b) {
    	B_HANDLE.set(segment, 0L, b);
    	return this;
    }
    
    public double b() {
    	return (double) B_HANDLE.get(segment, 0L);
    }
    
    /// @see #r()
    public MsdfBounds r(double r) {
    	R_HANDLE.set(segment, 0L, r);
    	return this;
    }
    
    public double r() {
    	return (double) R_HANDLE.get(segment, 0L);
    }
    
    /// @see #t()
    public MsdfBounds t(double t) {
    	T_HANDLE.set(segment, 0L, t);
    	return this;
    }
    
    public double t() {
    	return (double) T_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MsdfBounds set(MsdfBounds other) {
        return set(other.segment);
    }
    
    @Override
    public MsdfBounds set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MsdfBounds> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MsdfBounds> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MsdfBounds(segment),
            count
        );
    }
    
    public static NativeStructArray<MsdfBounds> array(Arena arena, MsdfBounds... structs) {
        NativeStructArray<MsdfBounds> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MsdfBounds(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MsdfBounds> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MsdfBounds(segment)
        );
    }

}