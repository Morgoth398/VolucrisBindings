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

public final class MaFileInfo
		implements Struct<MaFileInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SIZE_IN_BYTES_HANDLE;

	public static final long SIZE_IN_BYTES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("sizeInBytes")
		).withName("ma_file_info").withByteAlignment(8);
		
		SIZE_IN_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sizeInBytes"));
		
		SIZE_IN_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sizeInBytes"));
		//@formatter:on
	}

	public MaFileInfo() {
	    this(Arena.ofAuto());
	}
	
	public MaFileInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaFileInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sizeInBytes()
    public MaFileInfo sizeInBytes(long sizeInBytes) {
    	SIZE_IN_BYTES_HANDLE.set(segment, 0L, sizeInBytes);
    	return this;
    }
    
    public long sizeInBytes() {
    	return (long) SIZE_IN_BYTES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaFileInfo set(MaFileInfo other) {
        return set(other.segment);
    }
    
    @Override
    public MaFileInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaFileInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaFileInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaFileInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<MaFileInfo> array(Arena arena, MaFileInfo... structs) {
        NativeStructArray<MaFileInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaFileInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaFileInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaFileInfo(segment)
        );
    }

}