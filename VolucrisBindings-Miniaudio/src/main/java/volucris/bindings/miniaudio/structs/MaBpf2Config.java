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
/// Band-Pass Filtering
/// 
/// ************************************************************************************************************************************************************
/// ```
public final class MaBpf2Config
		implements Struct<MaBpf2Config> {

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
		).withName("ma_bpf2_config").withByteAlignment(8);
		
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

	public MaBpf2Config() {
	    this(Arena.ofAuto());
	}
	
	public MaBpf2Config(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaBpf2Config(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #format()
    public MaBpf2Config format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaBpf2Config channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaBpf2Config sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #cutoffFrequency()
    public MaBpf2Config cutoffFrequency(double cutoffFrequency) {
    	CUTOFF_FREQUENCY_HANDLE.set(segment, 0L, cutoffFrequency);
    	return this;
    }
    
    public double cutoffFrequency() {
    	return (double) CUTOFF_FREQUENCY_HANDLE.get(segment, 0L);
    }
    
    /// @see #q()
    public MaBpf2Config q(double q) {
    	Q_HANDLE.set(segment, 0L, q);
    	return this;
    }
    
    public double q() {
    	return (double) Q_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaBpf2Config set(MaBpf2Config other) {
        return set(other.segment);
    }
    
    @Override
    public MaBpf2Config set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaBpf2Config> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaBpf2Config> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaBpf2Config(segment),
            count
        );
    }
    
    public static NativeStructArray<MaBpf2Config> array(Arena arena, MaBpf2Config... structs) {
        NativeStructArray<MaBpf2Config> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaBpf2Config(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaBpf2Config> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaBpf2Config(segment)
        );
    }

}