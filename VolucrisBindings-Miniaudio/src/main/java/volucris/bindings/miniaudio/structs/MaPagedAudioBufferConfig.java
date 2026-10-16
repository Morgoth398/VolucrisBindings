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

public final class MaPagedAudioBufferConfig
		implements Struct<MaPagedAudioBufferConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_DATA_HANDLE;

	public static final long P_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pData")
		).withName("ma_paged_audio_buffer_config").withByteAlignment(8);
		
		P_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pData"));
		
		P_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pData"));
		//@formatter:on
	}

	public MaPagedAudioBufferConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaPagedAudioBufferConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaPagedAudioBufferConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #pData()
    public MaPagedAudioBufferConfig pData(MaPagedAudioBufferData pData) {
    	P_DATA_HANDLE.set(segment, 0L, pData.memorySegment());
    	return this;
    }
    
    public @Nullable MaPagedAudioBufferData pData() {
    	MemorySegment segment = (MemorySegment) P_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaPagedAudioBufferData(segment);
    }
    
    @Override
    public MaPagedAudioBufferConfig set(MaPagedAudioBufferConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaPagedAudioBufferConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaPagedAudioBufferConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaPagedAudioBufferConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaPagedAudioBufferConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaPagedAudioBufferConfig> array(Arena arena, MaPagedAudioBufferConfig... structs) {
        NativeStructArray<MaPagedAudioBufferConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaPagedAudioBufferConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaPagedAudioBufferConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaPagedAudioBufferConfig(segment)
        );
    }

}