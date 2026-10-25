/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeShortArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaLinearResampler
		implements Struct<MaLinearResampler> {

	public static final StructLayout LAYOUT;

	public static final VarHandle IN_ADVANCE_INT_HANDLE;
	public static final VarHandle IN_ADVANCE_FRAC_HANDLE;
	public static final VarHandle IN_TIME_INT_HANDLE;
	public static final VarHandle IN_TIME_FRAC_HANDLE;
	public static final VarHandle _P_HEAP_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;

	public static final long CONFIG_BYTE_OFFSET;
	public static final long IN_ADVANCE_INT_BYTE_OFFSET;
	public static final long IN_ADVANCE_FRAC_BYTE_OFFSET;
	public static final long IN_TIME_INT_BYTE_OFFSET;
	public static final long IN_TIME_FRAC_BYTE_OFFSET;
	public static final long X0_BYTE_OFFSET;
	public static final long X1_BYTE_OFFSET;
	public static final long LPF_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaLinearResamplerConfig config;
	private final X0 x0;
	private final X1 x1;
	private final MaLpf lpf;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaLinearResamplerConfig.LAYOUT.withName("config"),
		    JAVA_INT.withName("inAdvanceInt"),
		    JAVA_INT.withName("inAdvanceFrac"),
		    JAVA_INT.withName("inTimeInt"),
		    JAVA_INT.withName("inTimeFrac"),
		    X0.LAYOUT.withName("x0"),
		    X1.LAYOUT.withName("x1"),
		    MaLpf.LAYOUT.withName("lpf"),
		    UNBOUNDED_ADDRESS.withName("_pHeap"),
		    JAVA_INT.withName("_ownsHeap"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_linear_resampler").withByteAlignment(8);
		
		IN_ADVANCE_INT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inAdvanceInt"));
		IN_ADVANCE_FRAC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inAdvanceFrac"));
		IN_TIME_INT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inTimeInt"));
		IN_TIME_FRAC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inTimeFrac"));
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		
		CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("config"));
		IN_ADVANCE_INT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inAdvanceInt"));
		IN_ADVANCE_FRAC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inAdvanceFrac"));
		IN_TIME_INT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inTimeInt"));
		IN_TIME_FRAC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inTimeFrac"));
		X0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("x0"));
		X1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("x1"));
		LPF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lpf"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		//@formatter:on
	}

	public MaLinearResampler() {
	    this(Arena.ofAuto());
	}
	
	public MaLinearResampler(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaLinearResampler(MemorySegment segment) {
	    this.segment = segment;
	
	    config = new MaLinearResamplerConfig(segment.asSlice(CONFIG_BYTE_OFFSET, MaLinearResamplerConfig.LAYOUT));
	    x0 = new X0(segment.asSlice(X0_BYTE_OFFSET, X0.LAYOUT));
	    x1 = new X1(segment.asSlice(X1_BYTE_OFFSET, X1.LAYOUT));
	    lpf = new MaLpf(segment.asSlice(LPF_BYTE_OFFSET, MaLpf.LAYOUT));
	}

    /// @see #config()
    public MaLinearResampler config(Consumer<MaLinearResamplerConfig> consumer) {
    	consumer.accept(config);
    	return this;
    }
    
    /// @see #config()
    public MaLinearResampler config(MaLinearResamplerConfig other) {
    	config.set(other);
    	return this;
    }
    
    public MaLinearResamplerConfig config() {
    	return config;
    }
    
    /// @see #inAdvanceInt()
    public MaLinearResampler inAdvanceInt(int inAdvanceInt) {
    	IN_ADVANCE_INT_HANDLE.set(segment, 0L, inAdvanceInt);
    	return this;
    }
    
    public int inAdvanceInt() {
    	return (int) IN_ADVANCE_INT_HANDLE.get(segment, 0L);
    }
    
    /// @see #inAdvanceFrac()
    public MaLinearResampler inAdvanceFrac(int inAdvanceFrac) {
    	IN_ADVANCE_FRAC_HANDLE.set(segment, 0L, inAdvanceFrac);
    	return this;
    }
    
    public int inAdvanceFrac() {
    	return (int) IN_ADVANCE_FRAC_HANDLE.get(segment, 0L);
    }
    
    /// @see #inTimeInt()
    public MaLinearResampler inTimeInt(int inTimeInt) {
    	IN_TIME_INT_HANDLE.set(segment, 0L, inTimeInt);
    	return this;
    }
    
    public int inTimeInt() {
    	return (int) IN_TIME_INT_HANDLE.get(segment, 0L);
    }
    
    /// @see #inTimeFrac()
    public MaLinearResampler inTimeFrac(int inTimeFrac) {
    	IN_TIME_FRAC_HANDLE.set(segment, 0L, inTimeFrac);
    	return this;
    }
    
    public int inTimeFrac() {
    	return (int) IN_TIME_FRAC_HANDLE.get(segment, 0L);
    }
    
    /// @see #x0()
    public MaLinearResampler x0(Consumer<X0> consumer) {
    	consumer.accept(x0);
    	return this;
    }
    
    /// @see #x0()
    public MaLinearResampler x0(X0 other) {
    	x0.set(other);
    	return this;
    }
    
    public X0 x0() {
    	return x0;
    }
    
    /// @see #x1()
    public MaLinearResampler x1(Consumer<X1> consumer) {
    	consumer.accept(x1);
    	return this;
    }
    
    /// @see #x1()
    public MaLinearResampler x1(X1 other) {
    	x1.set(other);
    	return this;
    }
    
    public X1 x1() {
    	return x1;
    }
    
    /// @see #lpf()
    public MaLinearResampler lpf(Consumer<MaLpf> consumer) {
    	consumer.accept(lpf);
    	return this;
    }
    
    /// @see #lpf()
    public MaLinearResampler lpf(MaLpf other) {
    	lpf.set(other);
    	return this;
    }
    
    public MaLpf lpf() {
    	return lpf;
    }
    
    /// @see #_pHeap()
    public MaLinearResampler _pHeap(MemorySegment _pHeap) {
    	_P_HEAP_HANDLE.set(segment, 0L, _pHeap);
    	return this;
    }
    
    public @Nullable MemorySegment _pHeap() {
    	MemorySegment segment = (MemorySegment) _P_HEAP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #_ownsHeap()
    public MaLinearResampler _ownsHeap(int _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public int _ownsHeap() {
    	return (int) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaLinearResampler set(MaLinearResampler other) {
        return set(other.segment);
    }
    
    @Override
    public MaLinearResampler set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaLinearResampler> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaLinearResampler> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaLinearResampler(segment),
            count
        );
    }
    
    public static NativeStructArray<MaLinearResampler> array(SegmentAllocator allocator, MaLinearResampler... structs) {
        NativeStructArray<MaLinearResampler> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaLinearResampler(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaLinearResampler> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaLinearResampler(segment)
        );
    }

	public static class X0 implements Struct<X0> {
	
		public static final UnionLayout LAYOUT;
	
		public static final VarHandle F32_HANDLE;
		public static final VarHandle S16_HANDLE;
	
		public static final long F32_BYTE_OFFSET;
		public static final long S16_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.unionLayout(
			    UNBOUNDED_ADDRESS.withName("f32"),
			    UNBOUNDED_ADDRESS.withName("s16")
			).withName("X0").withByteAlignment(8);
			
			F32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("f32"));
			S16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("s16"));
			
			F32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("f32"));
			S16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("s16"));
			//@formatter:on
		}
	
		public X0() {
		    this(Arena.ofAuto());
		}
		
		public X0(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public X0(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #f32()
	    public X0 f32(NativeFloatArray f32) {
	    	F32_HANDLE.set(segment, 0L, f32.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeFloatArray f32() {
	    	MemorySegment segment = (MemorySegment) F32_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeFloatArray(segment);
	    }
	    
	    /// @see #s16()
	    public X0 s16(NativeShortArray s16) {
	    	S16_HANDLE.set(segment, 0L, s16.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeShortArray s16() {
	    	MemorySegment segment = (MemorySegment) S16_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeShortArray(segment);
	    }
	    
	    @Override
	    public X0 set(X0 other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public X0 set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<X0> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<X0> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new X0(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<X0> array(SegmentAllocator allocator, X0... structs) {
	        NativeStructArray<X0> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new X0(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<X0> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new X0(segment)
	        );
	    }
	
	}
    
	public static class X1 implements Struct<X1> {
	
		public static final UnionLayout LAYOUT;
	
		public static final VarHandle F32_HANDLE;
		public static final VarHandle S16_HANDLE;
	
		public static final long F32_BYTE_OFFSET;
		public static final long S16_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.unionLayout(
			    UNBOUNDED_ADDRESS.withName("f32"),
			    UNBOUNDED_ADDRESS.withName("s16")
			).withName("X1").withByteAlignment(8);
			
			F32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("f32"));
			S16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("s16"));
			
			F32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("f32"));
			S16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("s16"));
			//@formatter:on
		}
	
		public X1() {
		    this(Arena.ofAuto());
		}
		
		public X1(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public X1(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #f32()
	    public X1 f32(NativeFloatArray f32) {
	    	F32_HANDLE.set(segment, 0L, f32.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeFloatArray f32() {
	    	MemorySegment segment = (MemorySegment) F32_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeFloatArray(segment);
	    }
	    
	    /// @see #s16()
	    public X1 s16(NativeShortArray s16) {
	    	S16_HANDLE.set(segment, 0L, s16.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeShortArray s16() {
	    	MemorySegment segment = (MemorySegment) S16_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeShortArray(segment);
	    }
	    
	    @Override
	    public X1 set(X1 other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public X1 set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<X1> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<X1> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new X1(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<X1> array(SegmentAllocator allocator, X1... structs) {
	        NativeStructArray<X1> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new X1(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<X1> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new X1(segment)
	        );
	    }
	
	}
}