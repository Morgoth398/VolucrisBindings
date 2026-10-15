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

public final class StdVideoAV1CDEF
		implements Struct<StdVideoAV1CDEF> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CDEF_DAMPING_MINUS_3_HANDLE;
	public static final VarHandle CDEF_BITS_HANDLE;
	public static final VarHandle CDEF_Y_PRI_STRENGTH_HANDLE;
	public static final VarHandle CDEF_Y_SEC_STRENGTH_HANDLE;
	public static final VarHandle CDEF_UV_PRI_STRENGTH_HANDLE;
	public static final VarHandle CDEF_UV_SEC_STRENGTH_HANDLE;

	public static final long CDEF_DAMPING_MINUS_3_BYTE_OFFSET;
	public static final long CDEF_BITS_BYTE_OFFSET;
	public static final long CDEF_Y_PRI_STRENGTH_BYTE_OFFSET;
	public static final long CDEF_Y_SEC_STRENGTH_BYTE_OFFSET;
	public static final long CDEF_UV_PRI_STRENGTH_BYTE_OFFSET;
	public static final long CDEF_UV_SEC_STRENGTH_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_BYTE.withName("cdef_damping_minus_3"),
		    JAVA_BYTE.withName("cdef_bits"),
		    MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("cdef_y_pri_strength"),
		    MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("cdef_y_sec_strength"),
		    MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("cdef_uv_pri_strength"),
		    MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("cdef_uv_sec_strength")
		).withName("StdVideoAV1CDEF").withByteAlignment(1);
		
		CDEF_DAMPING_MINUS_3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cdef_damping_minus_3"));
		CDEF_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cdef_bits"));
		CDEF_Y_PRI_STRENGTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cdef_y_pri_strength"), PathElement.sequenceElement());
		CDEF_Y_SEC_STRENGTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cdef_y_sec_strength"), PathElement.sequenceElement());
		CDEF_UV_PRI_STRENGTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cdef_uv_pri_strength"), PathElement.sequenceElement());
		CDEF_UV_SEC_STRENGTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cdef_uv_sec_strength"), PathElement.sequenceElement());
		
		CDEF_DAMPING_MINUS_3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cdef_damping_minus_3"));
		CDEF_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cdef_bits"));
		CDEF_Y_PRI_STRENGTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cdef_y_pri_strength"));
		CDEF_Y_SEC_STRENGTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cdef_y_sec_strength"));
		CDEF_UV_PRI_STRENGTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cdef_uv_pri_strength"));
		CDEF_UV_SEC_STRENGTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cdef_uv_sec_strength"));
		//@formatter:on
	}

	public StdVideoAV1CDEF() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoAV1CDEF(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoAV1CDEF(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #cdef_damping_minus_3()
    public StdVideoAV1CDEF cdef_damping_minus_3(byte cdef_damping_minus_3) {
    	CDEF_DAMPING_MINUS_3_HANDLE.set(segment, 0L, cdef_damping_minus_3);
    	return this;
    }
    
    public byte cdef_damping_minus_3() {
    	return (byte) CDEF_DAMPING_MINUS_3_HANDLE.get(segment, 0L);
    }
    
    /// @see #cdef_bits()
    public StdVideoAV1CDEF cdef_bits(byte cdef_bits) {
    	CDEF_BITS_HANDLE.set(segment, 0L, cdef_bits);
    	return this;
    }
    
    public byte cdef_bits() {
    	return (byte) CDEF_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #cdef_y_pri_strength(int)
    public StdVideoAV1CDEF cdef_y_pri_strength(byte cdef_y_pri_strength, int index0) {
    	CDEF_Y_PRI_STRENGTH_HANDLE.set(segment, 0L, index0, cdef_y_pri_strength);
    	return this;
    }
    
    public byte cdef_y_pri_strength(int index0) {
    	return (byte) CDEF_Y_PRI_STRENGTH_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #cdef_y_sec_strength(int)
    public StdVideoAV1CDEF cdef_y_sec_strength(byte cdef_y_sec_strength, int index0) {
    	CDEF_Y_SEC_STRENGTH_HANDLE.set(segment, 0L, index0, cdef_y_sec_strength);
    	return this;
    }
    
    public byte cdef_y_sec_strength(int index0) {
    	return (byte) CDEF_Y_SEC_STRENGTH_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #cdef_uv_pri_strength(int)
    public StdVideoAV1CDEF cdef_uv_pri_strength(byte cdef_uv_pri_strength, int index0) {
    	CDEF_UV_PRI_STRENGTH_HANDLE.set(segment, 0L, index0, cdef_uv_pri_strength);
    	return this;
    }
    
    public byte cdef_uv_pri_strength(int index0) {
    	return (byte) CDEF_UV_PRI_STRENGTH_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #cdef_uv_sec_strength(int)
    public StdVideoAV1CDEF cdef_uv_sec_strength(byte cdef_uv_sec_strength, int index0) {
    	CDEF_UV_SEC_STRENGTH_HANDLE.set(segment, 0L, index0, cdef_uv_sec_strength);
    	return this;
    }
    
    public byte cdef_uv_sec_strength(int index0) {
    	return (byte) CDEF_UV_SEC_STRENGTH_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public StdVideoAV1CDEF set(StdVideoAV1CDEF other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoAV1CDEF set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoAV1CDEF> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoAV1CDEF> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1CDEF(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoAV1CDEF> array(Arena arena, StdVideoAV1CDEF... structs) {
        NativeStructArray<StdVideoAV1CDEF> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1CDEF(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoAV1CDEF> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoAV1CDEF(segment)
        );
    }

}