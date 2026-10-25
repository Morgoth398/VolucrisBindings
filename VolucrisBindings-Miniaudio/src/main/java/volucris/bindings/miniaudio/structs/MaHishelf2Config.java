/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// ***********************************************************************************************************************************************************
/// 
/// High Shelf Filter
/// 
/// ************************************************************************************************************************************************************
/// ```
public final class MaHishelf2Config
		implements Struct<MaHishelf2Config> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle GAIN_DB_HANDLE;
	public static final VarHandle SHELF_SLOPE_HANDLE;
	public static final VarHandle FREQUENCY_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long GAIN_DB_BYTE_OFFSET;
	public static final long SHELF_SLOPE_BYTE_OFFSET;
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
		    JAVA_DOUBLE.withName("shelfSlope"),
		    JAVA_DOUBLE.withName("frequency")
		).withName("ma_hishelf2_config").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		GAIN_DB_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gainDB"));
		SHELF_SLOPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shelfSlope"));
		FREQUENCY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frequency"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		GAIN_DB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gainDB"));
		SHELF_SLOPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shelfSlope"));
		FREQUENCY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frequency"));
		//@formatter:on
	}

	public MaHishelf2Config() {
	    this(Arena.ofAuto());
	}
	
	public MaHishelf2Config(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaHishelf2Config(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #format()
    public MaHishelf2Config format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaHishelf2Config channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaHishelf2Config sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #gainDB()
    public MaHishelf2Config gainDB(double gainDB) {
    	GAIN_DB_HANDLE.set(segment, 0L, gainDB);
    	return this;
    }
    
    public double gainDB() {
    	return (double) GAIN_DB_HANDLE.get(segment, 0L);
    }
    
    /// @see #shelfSlope()
    public MaHishelf2Config shelfSlope(double shelfSlope) {
    	SHELF_SLOPE_HANDLE.set(segment, 0L, shelfSlope);
    	return this;
    }
    
    public double shelfSlope() {
    	return (double) SHELF_SLOPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #frequency()
    public MaHishelf2Config frequency(double frequency) {
    	FREQUENCY_HANDLE.set(segment, 0L, frequency);
    	return this;
    }
    
    public double frequency() {
    	return (double) FREQUENCY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaHishelf2Config set(MaHishelf2Config other) {
        return set(other.segment);
    }
    
    @Override
    public MaHishelf2Config set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaHishelf2Config> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaHishelf2Config> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaHishelf2Config(segment),
            count
        );
    }
    
    public static NativeStructArray<MaHishelf2Config> array(SegmentAllocator allocator, MaHishelf2Config... structs) {
        NativeStructArray<MaHishelf2Config> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaHishelf2Config(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaHishelf2Config> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaHishelf2Config(segment)
        );
    }

}