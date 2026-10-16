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

public final class MaPcmRb
		implements Struct<MaPcmRb> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;

	public static final long DS_BYTE_OFFSET;
	public static final long RB_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaDataSourceBase ds;
	private final MaRb rb;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaDataSourceBase.LAYOUT.withName("ds"),
		    MaRb.LAYOUT.withName("rb"),
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("sampleRate"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_pcm_rb").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		
		DS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ds"));
		RB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rb"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		//@formatter:on
	}

	public MaPcmRb() {
	    this(Arena.ofAuto());
	}
	
	public MaPcmRb(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaPcmRb(MemorySegment segment) {
	    this.segment = segment;
	
	    ds = new MaDataSourceBase(segment.asSlice(DS_BYTE_OFFSET, MaDataSourceBase.LAYOUT));
	    rb = new MaRb(segment.asSlice(RB_BYTE_OFFSET, MaRb.LAYOUT));
	}

    /// @see #ds()
    public MaPcmRb ds(Consumer<MaDataSourceBase> consumer) {
    	consumer.accept(ds);
    	return this;
    }
    
    /// @see #ds()
    public MaPcmRb ds(MaDataSourceBase other) {
    	ds.set(other);
    	return this;
    }
    
    public MaDataSourceBase ds() {
    	return ds;
    }
    
    /// @see #rb()
    public MaPcmRb rb(Consumer<MaRb> consumer) {
    	consumer.accept(rb);
    	return this;
    }
    
    /// @see #rb()
    public MaPcmRb rb(MaRb other) {
    	rb.set(other);
    	return this;
    }
    
    public MaRb rb() {
    	return rb;
    }
    
    /// @see #format()
    public MaPcmRb format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaPcmRb channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaPcmRb sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaPcmRb set(MaPcmRb other) {
        return set(other.segment);
    }
    
    @Override
    public MaPcmRb set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaPcmRb> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaPcmRb> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaPcmRb(segment),
            count
        );
    }
    
    public static NativeStructArray<MaPcmRb> array(Arena arena, MaPcmRb... structs) {
        NativeStructArray<MaPcmRb> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaPcmRb(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaPcmRb> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaPcmRb(segment)
        );
    }

}