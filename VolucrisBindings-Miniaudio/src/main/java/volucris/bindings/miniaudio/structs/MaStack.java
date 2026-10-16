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

public final class MaStack
		implements Struct<MaStack> {

	public static final StructLayout LAYOUT;

	public static final VarHandle OFFSET_HANDLE;
	public static final VarHandle SIZE_IN_BYTES_HANDLE;
	public static final VarHandle _DATA_HANDLE;

	public static final long OFFSET_BYTE_OFFSET;
	public static final long SIZE_IN_BYTES_BYTE_OFFSET;
	public static final long _DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("offset"),
		    JAVA_LONG.withName("sizeInBytes"),
		    MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("_data"),
		    MemoryLayout.paddingLayout(7)
		).withName("ma_stack").withByteAlignment(8);
		
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		SIZE_IN_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sizeInBytes"));
		_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_data"), PathElement.sequenceElement());
		
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		SIZE_IN_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sizeInBytes"));
		_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_data"));
		//@formatter:on
	}

	public MaStack() {
	    this(Arena.ofAuto());
	}
	
	public MaStack(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaStack(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #offset()
    public MaStack offset(long offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public long offset() {
    	return (long) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #sizeInBytes()
    public MaStack sizeInBytes(long sizeInBytes) {
    	SIZE_IN_BYTES_HANDLE.set(segment, 0L, sizeInBytes);
    	return this;
    }
    
    public long sizeInBytes() {
    	return (long) SIZE_IN_BYTES_HANDLE.get(segment, 0L);
    }
    
    /// @see #_data(int)
    public MaStack _data(byte _data, int index0) {
    	_DATA_HANDLE.set(segment, 0L, index0, _data);
    	return this;
    }
    
    public byte _data(int index0) {
    	return (byte) _DATA_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public MaStack set(MaStack other) {
        return set(other.segment);
    }
    
    @Override
    public MaStack set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaStack> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaStack> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaStack(segment),
            count
        );
    }
    
    public static NativeStructArray<MaStack> array(Arena arena, MaStack... structs) {
        NativeStructArray<MaStack> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaStack(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaStack> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaStack(segment)
        );
    }

}