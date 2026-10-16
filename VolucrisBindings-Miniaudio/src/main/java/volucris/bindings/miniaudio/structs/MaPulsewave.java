/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaPulsewave
		implements Struct<MaPulsewave> {

	public static final StructLayout LAYOUT;

	public static final long WAVEFORM_BYTE_OFFSET;
	public static final long CONFIG_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaWaveform waveform;
	private final MaPulsewaveConfig config;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaWaveform.LAYOUT.withName("waveform"),
		    MaPulsewaveConfig.LAYOUT.withName("config")
		).withName("ma_pulsewave").withByteAlignment(8);
		
		WAVEFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveform"));
		CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("config"));
		//@formatter:on
	}

	public MaPulsewave() {
	    this(Arena.ofAuto());
	}
	
	public MaPulsewave(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaPulsewave(MemorySegment segment) {
	    this.segment = segment;
	
	    waveform = new MaWaveform(segment.asSlice(WAVEFORM_BYTE_OFFSET, MaWaveform.LAYOUT));
	    config = new MaPulsewaveConfig(segment.asSlice(CONFIG_BYTE_OFFSET, MaPulsewaveConfig.LAYOUT));
	}

    /// @see #waveform()
    public MaPulsewave waveform(Consumer<MaWaveform> consumer) {
    	consumer.accept(waveform);
    	return this;
    }
    
    /// @see #waveform()
    public MaPulsewave waveform(MaWaveform other) {
    	waveform.set(other);
    	return this;
    }
    
    public MaWaveform waveform() {
    	return waveform;
    }
    
    /// @see #config()
    public MaPulsewave config(Consumer<MaPulsewaveConfig> consumer) {
    	consumer.accept(config);
    	return this;
    }
    
    /// @see #config()
    public MaPulsewave config(MaPulsewaveConfig other) {
    	config.set(other);
    	return this;
    }
    
    public MaPulsewaveConfig config() {
    	return config;
    }
    
    @Override
    public MaPulsewave set(MaPulsewave other) {
        return set(other.segment);
    }
    
    @Override
    public MaPulsewave set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaPulsewave> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaPulsewave> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaPulsewave(segment),
            count
        );
    }
    
    public static NativeStructArray<MaPulsewave> array(Arena arena, MaPulsewave... structs) {
        NativeStructArray<MaPulsewave> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaPulsewave(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaPulsewave> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaPulsewave(segment)
        );
    }

}