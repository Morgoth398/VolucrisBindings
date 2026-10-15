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

public final class MsdfConfig
		implements Struct<MsdfConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle OVERLAP_SUPPORT_HANDLE;

	public static final long OVERLAP_SUPPORT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("overlap_support")
		).withName("msdf_config").withByteAlignment(4);
		
		OVERLAP_SUPPORT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("overlap_support"));
		
		OVERLAP_SUPPORT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("overlap_support"));
		//@formatter:on
	}

	public MsdfConfig() {
	    this(Arena.ofAuto());
	}
	
	public MsdfConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MsdfConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #overlap_support()
    public MsdfConfig overlap_support(int overlap_support) {
    	OVERLAP_SUPPORT_HANDLE.set(segment, 0L, overlap_support);
    	return this;
    }
    
    public int overlap_support() {
    	return (int) OVERLAP_SUPPORT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MsdfConfig set(MsdfConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MsdfConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MsdfConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MsdfConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MsdfConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MsdfConfig> array(Arena arena, MsdfConfig... structs) {
        NativeStructArray<MsdfConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MsdfConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MsdfConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MsdfConfig(segment)
        );
    }

}