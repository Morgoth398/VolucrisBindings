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

public final class MaDecodingBackendConfig
		implements Struct<MaDecodingBackendConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PREFERRED_FORMAT_HANDLE;
	public static final VarHandle SEEK_POINT_COUNT_HANDLE;

	public static final long PREFERRED_FORMAT_BYTE_OFFSET;
	public static final long SEEK_POINT_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("preferredFormat"),
		    JAVA_INT.withName("seekPointCount")
		).withName("ma_decoding_backend_config").withByteAlignment(4);
		
		PREFERRED_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredFormat"));
		SEEK_POINT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("seekPointCount"));
		
		PREFERRED_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredFormat"));
		SEEK_POINT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seekPointCount"));
		//@formatter:on
	}

	public MaDecodingBackendConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaDecodingBackendConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaDecodingBackendConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #preferredFormat()
    public MaDecodingBackendConfig preferredFormat(int preferredFormat) {
    	PREFERRED_FORMAT_HANDLE.set(segment, 0L, preferredFormat);
    	return this;
    }
    
    public int preferredFormat() {
    	return (int) PREFERRED_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #seekPointCount()
    public MaDecodingBackendConfig seekPointCount(int seekPointCount) {
    	SEEK_POINT_COUNT_HANDLE.set(segment, 0L, seekPointCount);
    	return this;
    }
    
    public int seekPointCount() {
    	return (int) SEEK_POINT_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaDecodingBackendConfig set(MaDecodingBackendConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaDecodingBackendConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDecodingBackendConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDecodingBackendConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDecodingBackendConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDecodingBackendConfig> array(Arena arena, MaDecodingBackendConfig... structs) {
        NativeStructArray<MaDecodingBackendConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDecodingBackendConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDecodingBackendConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDecodingBackendConfig(segment)
        );
    }

}