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

/// ```
/// ***********************************************************************************************************************************************************
/// 
/// Low-Pass Filtering
/// 
/// ************************************************************************************************************************************************************
/// ```
public final class MaLpf1Config
		implements Struct<MaLpf1Config> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle CUTOFF_FREQUENCY_HANDLE;
	public static final VarHandle Q_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long CUTOFF_FREQUENCY_BYTE_OFFSET;
	public static final long Q_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("sampleRate"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_DOUBLE.withName("cutoffFrequency"),
		    JAVA_DOUBLE.withName("q")
		).withName("ma_lpf1_config").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		CUTOFF_FREQUENCY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cutoffFrequency"));
		Q_HANDLE = LAYOUT.varHandle(PathElement.groupElement("q"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		CUTOFF_FREQUENCY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cutoffFrequency"));
		Q_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("q"));
		//@formatter:on
	}

	public MaLpf1Config() {
	    this(Arena.ofAuto());
	}
	
	public MaLpf1Config(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaLpf1Config(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #format()
    public MaLpf1Config format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaLpf1Config channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaLpf1Config sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #cutoffFrequency()
    public MaLpf1Config cutoffFrequency(double cutoffFrequency) {
    	CUTOFF_FREQUENCY_HANDLE.set(segment, 0L, cutoffFrequency);
    	return this;
    }
    
    public double cutoffFrequency() {
    	return (double) CUTOFF_FREQUENCY_HANDLE.get(segment, 0L);
    }
    
    /// @see #q()
    public MaLpf1Config q(double q) {
    	Q_HANDLE.set(segment, 0L, q);
    	return this;
    }
    
    public double q() {
    	return (double) Q_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaLpf1Config set(MaLpf1Config other) {
        return set(other.segment);
    }
    
    @Override
    public MaLpf1Config set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaLpf1Config> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaLpf1Config> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaLpf1Config(segment),
            count
        );
    }
    
    public static NativeStructArray<MaLpf1Config> array(Arena arena, MaLpf1Config... structs) {
        NativeStructArray<MaLpf1Config> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaLpf1Config(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaLpf1Config> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaLpf1Config(segment)
        );
    }

}