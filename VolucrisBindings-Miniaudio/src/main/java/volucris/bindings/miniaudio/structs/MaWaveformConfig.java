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

public final class MaWaveformConfig
		implements Struct<MaWaveformConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle TYPE_HANDLE;
	public static final VarHandle AMPLITUDE_HANDLE;
	public static final VarHandle FREQUENCY_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long TYPE_BYTE_OFFSET;
	public static final long AMPLITUDE_BYTE_OFFSET;
	public static final long FREQUENCY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("sampleRate"),
		    JAVA_INT.withName("type"),
		    JAVA_DOUBLE.withName("amplitude"),
		    JAVA_DOUBLE.withName("frequency")
		).withName("ma_waveform_config").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
		AMPLITUDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("amplitude"));
		FREQUENCY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frequency"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
		AMPLITUDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("amplitude"));
		FREQUENCY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frequency"));
		//@formatter:on
	}

	public MaWaveformConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaWaveformConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaWaveformConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #format()
    public MaWaveformConfig format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaWaveformConfig channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaWaveformConfig sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #type()
    public MaWaveformConfig type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #amplitude()
    public MaWaveformConfig amplitude(double amplitude) {
    	AMPLITUDE_HANDLE.set(segment, 0L, amplitude);
    	return this;
    }
    
    public double amplitude() {
    	return (double) AMPLITUDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #frequency()
    public MaWaveformConfig frequency(double frequency) {
    	FREQUENCY_HANDLE.set(segment, 0L, frequency);
    	return this;
    }
    
    public double frequency() {
    	return (double) FREQUENCY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaWaveformConfig set(MaWaveformConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaWaveformConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaWaveformConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaWaveformConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaWaveformConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaWaveformConfig> array(Arena arena, MaWaveformConfig... structs) {
        NativeStructArray<MaWaveformConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaWaveformConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaWaveformConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaWaveformConfig(segment)
        );
    }

}