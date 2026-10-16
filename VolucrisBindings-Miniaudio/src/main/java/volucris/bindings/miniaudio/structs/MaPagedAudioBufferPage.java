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

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaPagedAudioBufferPage
		implements Struct<MaPagedAudioBufferPage> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SIZE_IN_FRAMES_HANDLE;
	public static final VarHandle P_AUDIO_DATA_HANDLE;

	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SIZE_IN_FRAMES_BYTE_OFFSET;
	public static final long P_AUDIO_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("sizeInFrames"),
		    MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("pAudioData"),
		    MemoryLayout.paddingLayout(7)
		).withName("ma_paged_audio_buffer_page").withByteAlignment(8);
		
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SIZE_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sizeInFrames"));
		P_AUDIO_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pAudioData"), PathElement.sequenceElement());
		
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SIZE_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sizeInFrames"));
		P_AUDIO_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pAudioData"));
		//@formatter:on
	}

	public MaPagedAudioBufferPage() {
	    this(Arena.ofAuto());
	}
	
	public MaPagedAudioBufferPage(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaPagedAudioBufferPage(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #pNext()
    public MaPagedAudioBufferPage pNext(MaPagedAudioBufferPage pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext.memorySegment());
    	return this;
    }
    
    public @Nullable MaPagedAudioBufferPage pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaPagedAudioBufferPage(segment);
    }
    
    /// @see #sizeInFrames()
    public MaPagedAudioBufferPage sizeInFrames(long sizeInFrames) {
    	SIZE_IN_FRAMES_HANDLE.set(segment, 0L, sizeInFrames);
    	return this;
    }
    
    public long sizeInFrames() {
    	return (long) SIZE_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #pAudioData(int)
    public MaPagedAudioBufferPage pAudioData(byte pAudioData, int index0) {
    	P_AUDIO_DATA_HANDLE.set(segment, 0L, index0, pAudioData);
    	return this;
    }
    
    public byte pAudioData(int index0) {
    	return (byte) P_AUDIO_DATA_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public MaPagedAudioBufferPage set(MaPagedAudioBufferPage other) {
        return set(other.segment);
    }
    
    @Override
    public MaPagedAudioBufferPage set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaPagedAudioBufferPage> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaPagedAudioBufferPage> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaPagedAudioBufferPage(segment),
            count
        );
    }
    
    public static NativeStructArray<MaPagedAudioBufferPage> array(Arena arena, MaPagedAudioBufferPage... structs) {
        NativeStructArray<MaPagedAudioBufferPage> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaPagedAudioBufferPage(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaPagedAudioBufferPage> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaPagedAudioBufferPage(segment)
        );
    }

}