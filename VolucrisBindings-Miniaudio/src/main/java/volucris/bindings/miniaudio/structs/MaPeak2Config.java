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
/// Peaking EQ Filter
/// 
/// ************************************************************************************************************************************************************
/// ```
public final class MaPeak2Config
		implements Struct<MaPeak2Config> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle GAIN_DB_HANDLE;
	public static final VarHandle Q_HANDLE;
	public static final VarHandle FREQUENCY_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long GAIN_DB_BYTE_OFFSET;
	public static final long Q_BYTE_OFFSET;
	public static final long FREQUENCY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("sampleRate"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_DOUBLE.withName("gainDB"),
		    JAVA_DOUBLE.withName("q"),
		    JAVA_DOUBLE.withName("frequency")
		).withName("ma_peak2_config").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		GAIN_DB_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gainDB"));
		Q_HANDLE = LAYOUT.varHandle(PathElement.groupElement("q"));
		FREQUENCY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frequency"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		GAIN_DB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gainDB"));
		Q_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("q"));
		FREQUENCY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frequency"));
		//@formatter:on
	}

	public MaPeak2Config() {
	    this(Arena.ofAuto());
	}
	
	public MaPeak2Config(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaPeak2Config(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #format()
    public MaPeak2Config format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaPeak2Config channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaPeak2Config sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #gainDB()
    public MaPeak2Config gainDB(double gainDB) {
    	GAIN_DB_HANDLE.set(segment, 0L, gainDB);
    	return this;
    }
    
    public double gainDB() {
    	return (double) GAIN_DB_HANDLE.get(segment, 0L);
    }
    
    /// @see #q()
    public MaPeak2Config q(double q) {
    	Q_HANDLE.set(segment, 0L, q);
    	return this;
    }
    
    public double q() {
    	return (double) Q_HANDLE.get(segment, 0L);
    }
    
    /// @see #frequency()
    public MaPeak2Config frequency(double frequency) {
    	FREQUENCY_HANDLE.set(segment, 0L, frequency);
    	return this;
    }
    
    public double frequency() {
    	return (double) FREQUENCY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaPeak2Config set(MaPeak2Config other) {
        return set(other.segment);
    }
    
    @Override
    public MaPeak2Config set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaPeak2Config> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaPeak2Config> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaPeak2Config(segment),
            count
        );
    }
    
    public static NativeStructArray<MaPeak2Config> array(Arena arena, MaPeak2Config... structs) {
        NativeStructArray<MaPeak2Config> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaPeak2Config(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaPeak2Config> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaPeak2Config(segment)
        );
    }

}