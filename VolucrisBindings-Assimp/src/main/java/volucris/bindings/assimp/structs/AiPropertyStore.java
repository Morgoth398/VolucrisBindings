/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// C-API: Represents an opaque set of settings to be used during importing.
/// @see aiCreatePropertyStore
/// @see aiReleasePropertyStore
/// @see aiImportFileExWithProperties
/// @see aiSetPropertyInteger
/// @see aiSetPropertyFloat
/// @see aiSetPropertyString
/// @see aiSetPropertyMatrix
/// ```
public final class AiPropertyStore
		implements Struct<AiPropertyStore> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SENTINEL_HANDLE;

	public static final long SENTINEL_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_BYTE.withName("sentinel")
		).withName("aiPropertyStore").withByteAlignment(1);
		
		SENTINEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sentinel"));
		
		SENTINEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sentinel"));
		//@formatter:on
	}

	public AiPropertyStore() {
	    this(Arena.ofAuto());
	}
	
	public AiPropertyStore(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiPropertyStore(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sentinel()
    public AiPropertyStore sentinel(byte sentinel) {
    	SENTINEL_HANDLE.set(segment, 0L, sentinel);
    	return this;
    }
    
    public byte sentinel() {
    	return (byte) SENTINEL_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiPropertyStore set(AiPropertyStore other) {
        return set(other.segment);
    }
    
    @Override
    public AiPropertyStore set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiPropertyStore> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiPropertyStore> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiPropertyStore(segment),
            count
        );
    }
    
    public static NativeStructArray<AiPropertyStore> array(Arena arena, AiPropertyStore... structs) {
        NativeStructArray<AiPropertyStore> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiPropertyStore(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiPropertyStore> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiPropertyStore(segment)
        );
    }

}