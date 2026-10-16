/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaDataSourceVtable
		implements Struct<MaDataSourceVtable> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ON_READ_HANDLE;
	public static final VarHandle ON_SEEK_HANDLE;
	public static final VarHandle ON_GET_DATA_FORMAT_HANDLE;
	public static final VarHandle ON_GET_CURSOR_HANDLE;
	public static final VarHandle ON_GET_LENGTH_HANDLE;
	public static final VarHandle ON_SET_LOOPING_HANDLE;
	public static final VarHandle FLAGS_HANDLE;

	public static final long ON_READ_BYTE_OFFSET;
	public static final long ON_SEEK_BYTE_OFFSET;
	public static final long ON_GET_DATA_FORMAT_BYTE_OFFSET;
	public static final long ON_GET_CURSOR_BYTE_OFFSET;
	public static final long ON_GET_LENGTH_BYTE_OFFSET;
	public static final long ON_SET_LOOPING_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("onRead"),
		    UNBOUNDED_ADDRESS.withName("onSeek"),
		    UNBOUNDED_ADDRESS.withName("onGetDataFormat"),
		    UNBOUNDED_ADDRESS.withName("onGetCursor"),
		    UNBOUNDED_ADDRESS.withName("onGetLength"),
		    UNBOUNDED_ADDRESS.withName("onSetLooping"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_data_source_vtable").withByteAlignment(8);
		
		ON_READ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onRead"));
		ON_SEEK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onSeek"));
		ON_GET_DATA_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onGetDataFormat"));
		ON_GET_CURSOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onGetCursor"));
		ON_GET_LENGTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onGetLength"));
		ON_SET_LOOPING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onSetLooping"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		
		ON_READ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onRead"));
		ON_SEEK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onSeek"));
		ON_GET_DATA_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onGetDataFormat"));
		ON_GET_CURSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onGetCursor"));
		ON_GET_LENGTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onGetLength"));
		ON_SET_LOOPING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onSetLooping"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		//@formatter:on
	}

	public MaDataSourceVtable() {
	    this(Arena.ofAuto());
	}
	
	public MaDataSourceVtable(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaDataSourceVtable(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #onRead()
    public MaDataSourceVtable onRead(MaDataSourceOnRead onRead) {
    	ON_READ_HANDLE.set(segment, 0L, onRead.memorySegment());
    	return this;
    }
    
    public @Nullable MaDataSourceOnRead onRead() {
    	MemorySegment segment = (MemorySegment) ON_READ_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDataSourceOnRead.get(segment);
    }
    
    /// @see #onSeek()
    public MaDataSourceVtable onSeek(MaDataSourceOnSeek onSeek) {
    	ON_SEEK_HANDLE.set(segment, 0L, onSeek.memorySegment());
    	return this;
    }
    
    public @Nullable MaDataSourceOnSeek onSeek() {
    	MemorySegment segment = (MemorySegment) ON_SEEK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDataSourceOnSeek.get(segment);
    }
    
    /// @see #onGetDataFormat()
    public MaDataSourceVtable onGetDataFormat(MaDataSourceOnGetDataFormat onGetDataFormat) {
    	ON_GET_DATA_FORMAT_HANDLE.set(segment, 0L, onGetDataFormat.memorySegment());
    	return this;
    }
    
    public @Nullable MaDataSourceOnGetDataFormat onGetDataFormat() {
    	MemorySegment segment = (MemorySegment) ON_GET_DATA_FORMAT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDataSourceOnGetDataFormat.get(segment);
    }
    
    /// @see #onGetCursor()
    public MaDataSourceVtable onGetCursor(MaDataSourceOnGetCursor onGetCursor) {
    	ON_GET_CURSOR_HANDLE.set(segment, 0L, onGetCursor.memorySegment());
    	return this;
    }
    
    public @Nullable MaDataSourceOnGetCursor onGetCursor() {
    	MemorySegment segment = (MemorySegment) ON_GET_CURSOR_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDataSourceOnGetCursor.get(segment);
    }
    
    /// @see #onGetLength()
    public MaDataSourceVtable onGetLength(MaDataSourceOnGetLength onGetLength) {
    	ON_GET_LENGTH_HANDLE.set(segment, 0L, onGetLength.memorySegment());
    	return this;
    }
    
    public @Nullable MaDataSourceOnGetLength onGetLength() {
    	MemorySegment segment = (MemorySegment) ON_GET_LENGTH_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDataSourceOnGetLength.get(segment);
    }
    
    /// @see #onSetLooping()
    public MaDataSourceVtable onSetLooping(MaDataSourceOnSetLooping onSetLooping) {
    	ON_SET_LOOPING_HANDLE.set(segment, 0L, onSetLooping.memorySegment());
    	return this;
    }
    
    public @Nullable MaDataSourceOnSetLooping onSetLooping() {
    	MemorySegment segment = (MemorySegment) ON_SET_LOOPING_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDataSourceOnSetLooping.get(segment);
    }
    
    /// @see #flags()
    public MaDataSourceVtable flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaDataSourceVtable set(MaDataSourceVtable other) {
        return set(other.segment);
    }
    
    @Override
    public MaDataSourceVtable set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDataSourceVtable> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDataSourceVtable> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDataSourceVtable(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDataSourceVtable> array(Arena arena, MaDataSourceVtable... structs) {
        NativeStructArray<MaDataSourceVtable> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDataSourceVtable(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDataSourceVtable> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDataSourceVtable(segment)
        );
    }

}