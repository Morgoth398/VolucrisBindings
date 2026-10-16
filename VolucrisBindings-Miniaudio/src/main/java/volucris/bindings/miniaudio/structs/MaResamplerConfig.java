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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaResamplerConfig
		implements Struct<MaResamplerConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_IN_HANDLE;
	public static final VarHandle SAMPLE_RATE_OUT_HANDLE;
	public static final VarHandle ALGORITHM_HANDLE;
	public static final VarHandle P_BACKEND_VTABLE_HANDLE;
	public static final VarHandle P_BACKEND_USER_DATA_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_IN_BYTE_OFFSET;
	public static final long SAMPLE_RATE_OUT_BYTE_OFFSET;
	public static final long ALGORITHM_BYTE_OFFSET;
	public static final long P_BACKEND_VTABLE_BYTE_OFFSET;
	public static final long P_BACKEND_USER_DATA_BYTE_OFFSET;
	public static final long LINEAR_BYTE_OFFSET;

	private final MemorySegment segment;

	private final Linear linear;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("sampleRateIn"),
		    JAVA_INT.withName("sampleRateOut"),
		    JAVA_INT.withName("algorithm"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pBackendVTable"),
		    UNBOUNDED_ADDRESS.withName("pBackendUserData"),
		    Linear.LAYOUT.withName("linear"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_resampler_config").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRateIn"));
		SAMPLE_RATE_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRateOut"));
		ALGORITHM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("algorithm"));
		P_BACKEND_VTABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBackendVTable"));
		P_BACKEND_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBackendUserData"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRateIn"));
		SAMPLE_RATE_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRateOut"));
		ALGORITHM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("algorithm"));
		P_BACKEND_VTABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBackendVTable"));
		P_BACKEND_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBackendUserData"));
		LINEAR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linear"));
		//@formatter:on
	}

	public MaResamplerConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaResamplerConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaResamplerConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    linear = new Linear(segment.asSlice(LINEAR_BYTE_OFFSET, Linear.LAYOUT));
	}

    /// @see #format()
    public MaResamplerConfig format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaResamplerConfig channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRateIn()
    public MaResamplerConfig sampleRateIn(int sampleRateIn) {
    	SAMPLE_RATE_IN_HANDLE.set(segment, 0L, sampleRateIn);
    	return this;
    }
    
    public int sampleRateIn() {
    	return (int) SAMPLE_RATE_IN_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRateOut()
    public MaResamplerConfig sampleRateOut(int sampleRateOut) {
    	SAMPLE_RATE_OUT_HANDLE.set(segment, 0L, sampleRateOut);
    	return this;
    }
    
    public int sampleRateOut() {
    	return (int) SAMPLE_RATE_OUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #algorithm()
    public MaResamplerConfig algorithm(int algorithm) {
    	ALGORITHM_HANDLE.set(segment, 0L, algorithm);
    	return this;
    }
    
    public int algorithm() {
    	return (int) ALGORITHM_HANDLE.get(segment, 0L);
    }
    
    /// @see #pBackendVTable()
    public MaResamplerConfig pBackendVTable(MaResamplingBackendVtable pBackendVTable) {
    	P_BACKEND_VTABLE_HANDLE.set(segment, 0L, pBackendVTable.memorySegment());
    	return this;
    }
    
    public @Nullable MaResamplingBackendVtable pBackendVTable() {
    	MemorySegment segment = (MemorySegment) P_BACKEND_VTABLE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResamplingBackendVtable(segment);
    }
    
    /// @see #pBackendUserData()
    public MaResamplerConfig pBackendUserData(MemorySegment pBackendUserData) {
    	P_BACKEND_USER_DATA_HANDLE.set(segment, 0L, pBackendUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pBackendUserData() {
    	MemorySegment segment = (MemorySegment) P_BACKEND_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #linear()
    public MaResamplerConfig linear(Consumer<Linear> consumer) {
    	consumer.accept(linear);
    	return this;
    }
    
    /// @see #linear()
    public MaResamplerConfig linear(Linear other) {
    	linear.set(other);
    	return this;
    }
    
    public Linear linear() {
    	return linear;
    }
    
    @Override
    public MaResamplerConfig set(MaResamplerConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaResamplerConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaResamplerConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaResamplerConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResamplerConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaResamplerConfig> array(Arena arena, MaResamplerConfig... structs) {
        NativeStructArray<MaResamplerConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResamplerConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaResamplerConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaResamplerConfig(segment)
        );
    }

	public static class Linear implements Struct<Linear> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle LPF_ORDER_HANDLE;
	
		public static final long LPF_ORDER_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    JAVA_INT.withName("lpfOrder")
			).withName("Linear").withByteAlignment(4);
			
			LPF_ORDER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lpfOrder"));
			
			LPF_ORDER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lpfOrder"));
			//@formatter:on
		}
	
		public Linear() {
		    this(Arena.ofAuto());
		}
		
		public Linear(Arena arena) {
		    this(arena.allocate(LAYOUT));
		}
		
		public Linear(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #lpfOrder()
	    public Linear lpfOrder(int lpfOrder) {
	    	LPF_ORDER_HANDLE.set(segment, 0L, lpfOrder);
	    	return this;
	    }
	    
	    public int lpfOrder() {
	    	return (int) LPF_ORDER_HANDLE.get(segment, 0L);
	    }
	    
	    @Override
	    public Linear set(Linear other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Linear set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Linear> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Linear> array(Arena arena, int count) {
	        return new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Linear(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Linear> array(Arena arena, Linear... structs) {
	        NativeStructArray<Linear> array = new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Linear(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Linear> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Linear(segment)
	        );
	    }
	
	}
}