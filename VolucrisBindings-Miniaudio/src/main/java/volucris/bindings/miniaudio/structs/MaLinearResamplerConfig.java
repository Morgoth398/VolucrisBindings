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
/// Resampling
/// 
/// ************************************************************************************************************************************************************
/// ```
public final class MaLinearResamplerConfig
		implements Struct<MaLinearResamplerConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_IN_HANDLE;
	public static final VarHandle SAMPLE_RATE_OUT_HANDLE;
	public static final VarHandle LPF_ORDER_HANDLE;
	public static final VarHandle LPF_NYQUIST_FACTOR_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_IN_BYTE_OFFSET;
	public static final long SAMPLE_RATE_OUT_BYTE_OFFSET;
	public static final long LPF_ORDER_BYTE_OFFSET;
	public static final long LPF_NYQUIST_FACTOR_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("sampleRateIn"),
		    JAVA_INT.withName("sampleRateOut"),
		    JAVA_INT.withName("lpfOrder"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_DOUBLE.withName("lpfNyquistFactor")
		).withName("ma_linear_resampler_config").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRateIn"));
		SAMPLE_RATE_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRateOut"));
		LPF_ORDER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lpfOrder"));
		LPF_NYQUIST_FACTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lpfNyquistFactor"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRateIn"));
		SAMPLE_RATE_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRateOut"));
		LPF_ORDER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lpfOrder"));
		LPF_NYQUIST_FACTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lpfNyquistFactor"));
		//@formatter:on
	}

	public MaLinearResamplerConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaLinearResamplerConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaLinearResamplerConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #format()
    public MaLinearResamplerConfig format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaLinearResamplerConfig channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRateIn()
    public MaLinearResamplerConfig sampleRateIn(int sampleRateIn) {
    	SAMPLE_RATE_IN_HANDLE.set(segment, 0L, sampleRateIn);
    	return this;
    }
    
    public int sampleRateIn() {
    	return (int) SAMPLE_RATE_IN_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRateOut()
    public MaLinearResamplerConfig sampleRateOut(int sampleRateOut) {
    	SAMPLE_RATE_OUT_HANDLE.set(segment, 0L, sampleRateOut);
    	return this;
    }
    
    public int sampleRateOut() {
    	return (int) SAMPLE_RATE_OUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #lpfOrder()
    public MaLinearResamplerConfig lpfOrder(int lpfOrder) {
    	LPF_ORDER_HANDLE.set(segment, 0L, lpfOrder);
    	return this;
    }
    
    public int lpfOrder() {
    	return (int) LPF_ORDER_HANDLE.get(segment, 0L);
    }
    
    /// @see #lpfNyquistFactor()
    public MaLinearResamplerConfig lpfNyquistFactor(double lpfNyquistFactor) {
    	LPF_NYQUIST_FACTOR_HANDLE.set(segment, 0L, lpfNyquistFactor);
    	return this;
    }
    
    public double lpfNyquistFactor() {
    	return (double) LPF_NYQUIST_FACTOR_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaLinearResamplerConfig set(MaLinearResamplerConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaLinearResamplerConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaLinearResamplerConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaLinearResamplerConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaLinearResamplerConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaLinearResamplerConfig> array(SegmentAllocator allocator, MaLinearResamplerConfig... structs) {
        NativeStructArray<MaLinearResamplerConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaLinearResamplerConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaLinearResamplerConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaLinearResamplerConfig(segment)
        );
    }

}