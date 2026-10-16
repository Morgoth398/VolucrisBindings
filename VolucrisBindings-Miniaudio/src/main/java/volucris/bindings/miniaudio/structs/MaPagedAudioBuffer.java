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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaPagedAudioBuffer
		implements Struct<MaPagedAudioBuffer> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_DATA_HANDLE;
	public static final VarHandle P_CURRENT_HANDLE;
	public static final VarHandle RELATIVE_CURSOR_HANDLE;
	public static final VarHandle ABSOLUTE_CURSOR_HANDLE;

	public static final long DS_BYTE_OFFSET;
	public static final long P_DATA_BYTE_OFFSET;
	public static final long P_CURRENT_BYTE_OFFSET;
	public static final long RELATIVE_CURSOR_BYTE_OFFSET;
	public static final long ABSOLUTE_CURSOR_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaDataSourceBase ds;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaDataSourceBase.LAYOUT.withName("ds"),
		    UNBOUNDED_ADDRESS.withName("pData"),
		    UNBOUNDED_ADDRESS.withName("pCurrent"),
		    JAVA_LONG.withName("relativeCursor"),
		    JAVA_LONG.withName("absoluteCursor")
		).withName("ma_paged_audio_buffer").withByteAlignment(8);
		
		P_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pData"));
		P_CURRENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCurrent"));
		RELATIVE_CURSOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("relativeCursor"));
		ABSOLUTE_CURSOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("absoluteCursor"));
		
		DS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ds"));
		P_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pData"));
		P_CURRENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCurrent"));
		RELATIVE_CURSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("relativeCursor"));
		ABSOLUTE_CURSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("absoluteCursor"));
		//@formatter:on
	}

	public MaPagedAudioBuffer() {
	    this(Arena.ofAuto());
	}
	
	public MaPagedAudioBuffer(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaPagedAudioBuffer(MemorySegment segment) {
	    this.segment = segment;
	
	    ds = new MaDataSourceBase(segment.asSlice(DS_BYTE_OFFSET, MaDataSourceBase.LAYOUT));
	}

    /// @see #ds()
    public MaPagedAudioBuffer ds(Consumer<MaDataSourceBase> consumer) {
    	consumer.accept(ds);
    	return this;
    }
    
    /// @see #ds()
    public MaPagedAudioBuffer ds(MaDataSourceBase other) {
    	ds.set(other);
    	return this;
    }
    
    public MaDataSourceBase ds() {
    	return ds;
    }
    
    /// @see #pData()
    public MaPagedAudioBuffer pData(MaPagedAudioBufferData pData) {
    	P_DATA_HANDLE.set(segment, 0L, pData.memorySegment());
    	return this;
    }
    
    public @Nullable MaPagedAudioBufferData pData() {
    	MemorySegment segment = (MemorySegment) P_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaPagedAudioBufferData(segment);
    }
    
    /// @see #pCurrent()
    public MaPagedAudioBuffer pCurrent(MaPagedAudioBufferPage pCurrent) {
    	P_CURRENT_HANDLE.set(segment, 0L, pCurrent.memorySegment());
    	return this;
    }
    
    public @Nullable MaPagedAudioBufferPage pCurrent() {
    	MemorySegment segment = (MemorySegment) P_CURRENT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaPagedAudioBufferPage(segment);
    }
    
    /// @see #relativeCursor()
    public MaPagedAudioBuffer relativeCursor(long relativeCursor) {
    	RELATIVE_CURSOR_HANDLE.set(segment, 0L, relativeCursor);
    	return this;
    }
    
    public long relativeCursor() {
    	return (long) RELATIVE_CURSOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #absoluteCursor()
    public MaPagedAudioBuffer absoluteCursor(long absoluteCursor) {
    	ABSOLUTE_CURSOR_HANDLE.set(segment, 0L, absoluteCursor);
    	return this;
    }
    
    public long absoluteCursor() {
    	return (long) ABSOLUTE_CURSOR_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaPagedAudioBuffer set(MaPagedAudioBuffer other) {
        return set(other.segment);
    }
    
    @Override
    public MaPagedAudioBuffer set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaPagedAudioBuffer> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaPagedAudioBuffer> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaPagedAudioBuffer(segment),
            count
        );
    }
    
    public static NativeStructArray<MaPagedAudioBuffer> array(Arena arena, MaPagedAudioBuffer... structs) {
        NativeStructArray<MaPagedAudioBuffer> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaPagedAudioBuffer(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaPagedAudioBuffer> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaPagedAudioBuffer(segment)
        );
    }

}