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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaWaveform
		implements Struct<MaWaveform> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ADVANCE_HANDLE;
	public static final VarHandle TIME_HANDLE;

	public static final long DS_BYTE_OFFSET;
	public static final long CONFIG_BYTE_OFFSET;
	public static final long ADVANCE_BYTE_OFFSET;
	public static final long TIME_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaDataSourceBase ds;
	private final MaWaveformConfig config;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaDataSourceBase.LAYOUT.withName("ds"),
		    MaWaveformConfig.LAYOUT.withName("config"),
		    JAVA_DOUBLE.withName("advance"),
		    JAVA_DOUBLE.withName("time")
		).withName("ma_waveform").withByteAlignment(8);
		
		ADVANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("advance"));
		TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("time"));
		
		DS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ds"));
		CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("config"));
		ADVANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("advance"));
		TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("time"));
		//@formatter:on
	}

	public MaWaveform() {
	    this(Arena.ofAuto());
	}
	
	public MaWaveform(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaWaveform(MemorySegment segment) {
	    this.segment = segment;
	
	    ds = new MaDataSourceBase(segment.asSlice(DS_BYTE_OFFSET, MaDataSourceBase.LAYOUT));
	    config = new MaWaveformConfig(segment.asSlice(CONFIG_BYTE_OFFSET, MaWaveformConfig.LAYOUT));
	}

    /// @see #ds()
    public MaWaveform ds(Consumer<MaDataSourceBase> consumer) {
    	consumer.accept(ds);
    	return this;
    }
    
    /// @see #ds()
    public MaWaveform ds(MaDataSourceBase other) {
    	ds.set(other);
    	return this;
    }
    
    public MaDataSourceBase ds() {
    	return ds;
    }
    
    /// @see #config()
    public MaWaveform config(Consumer<MaWaveformConfig> consumer) {
    	consumer.accept(config);
    	return this;
    }
    
    /// @see #config()
    public MaWaveform config(MaWaveformConfig other) {
    	config.set(other);
    	return this;
    }
    
    public MaWaveformConfig config() {
    	return config;
    }
    
    /// @see #advance()
    public MaWaveform advance(double advance) {
    	ADVANCE_HANDLE.set(segment, 0L, advance);
    	return this;
    }
    
    public double advance() {
    	return (double) ADVANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #time()
    public MaWaveform time(double time) {
    	TIME_HANDLE.set(segment, 0L, time);
    	return this;
    }
    
    public double time() {
    	return (double) TIME_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaWaveform set(MaWaveform other) {
        return set(other.segment);
    }
    
    @Override
    public MaWaveform set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaWaveform> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaWaveform> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaWaveform(segment),
            count
        );
    }
    
    public static NativeStructArray<MaWaveform> array(Arena arena, MaWaveform... structs) {
        NativeStructArray<MaWaveform> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaWaveform(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaWaveform> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaWaveform(segment)
        );
    }

}