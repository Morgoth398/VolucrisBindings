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

public final class MaHpfConfig
		implements Struct<MaHpfConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle CUTOFF_FREQUENCY_HANDLE;
	public static final VarHandle ORDER_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long CUTOFF_FREQUENCY_BYTE_OFFSET;
	public static final long ORDER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("sampleRate"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_DOUBLE.withName("cutoffFrequency"),
		    JAVA_INT.withName("order"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_hpf_config").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		CUTOFF_FREQUENCY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cutoffFrequency"));
		ORDER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("order"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		CUTOFF_FREQUENCY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cutoffFrequency"));
		ORDER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("order"));
		//@formatter:on
	}

	public MaHpfConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaHpfConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaHpfConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #format()
    public MaHpfConfig format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaHpfConfig channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaHpfConfig sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #cutoffFrequency()
    public MaHpfConfig cutoffFrequency(double cutoffFrequency) {
    	CUTOFF_FREQUENCY_HANDLE.set(segment, 0L, cutoffFrequency);
    	return this;
    }
    
    public double cutoffFrequency() {
    	return (double) CUTOFF_FREQUENCY_HANDLE.get(segment, 0L);
    }
    
    /// @see #order()
    public MaHpfConfig order(int order) {
    	ORDER_HANDLE.set(segment, 0L, order);
    	return this;
    }
    
    public int order() {
    	return (int) ORDER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaHpfConfig set(MaHpfConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaHpfConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaHpfConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaHpfConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaHpfConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaHpfConfig> array(SegmentAllocator allocator, MaHpfConfig... structs) {
        NativeStructArray<MaHpfConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaHpfConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaHpfConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaHpfConfig(segment)
        );
    }

}