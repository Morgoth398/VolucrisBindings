/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaLpf
		implements Struct<MaLpf> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle LPF1_COUNT_HANDLE;
	public static final VarHandle LPF2_COUNT_HANDLE;
	public static final VarHandle P_LPF1_HANDLE;
	public static final VarHandle P_LPF2_HANDLE;
	public static final VarHandle _P_HEAP_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long LPF1_COUNT_BYTE_OFFSET;
	public static final long LPF2_COUNT_BYTE_OFFSET;
	public static final long P_LPF1_BYTE_OFFSET;
	public static final long P_LPF2_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("sampleRate"),
		    JAVA_INT.withName("lpf1Count"),
		    JAVA_INT.withName("lpf2Count"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pLPF1"),
		    UNBOUNDED_ADDRESS.withName("pLPF2"),
		    UNBOUNDED_ADDRESS.withName("_pHeap"),
		    JAVA_INT.withName("_ownsHeap"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_lpf").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		LPF1_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lpf1Count"));
		LPF2_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lpf2Count"));
		P_LPF1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLPF1"));
		P_LPF2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLPF2"));
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		LPF1_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lpf1Count"));
		LPF2_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lpf2Count"));
		P_LPF1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLPF1"));
		P_LPF2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLPF2"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		//@formatter:on
	}

	public MaLpf() {
	    this(Arena.ofAuto());
	}
	
	public MaLpf(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaLpf(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #format()
    public MaLpf format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaLpf channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaLpf sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #lpf1Count()
    public MaLpf lpf1Count(int lpf1Count) {
    	LPF1_COUNT_HANDLE.set(segment, 0L, lpf1Count);
    	return this;
    }
    
    public int lpf1Count() {
    	return (int) LPF1_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #lpf2Count()
    public MaLpf lpf2Count(int lpf2Count) {
    	LPF2_COUNT_HANDLE.set(segment, 0L, lpf2Count);
    	return this;
    }
    
    public int lpf2Count() {
    	return (int) LPF2_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pLPF1()
    public MaLpf pLPF1(MaLpf1 pLPF1) {
    	P_LPF1_HANDLE.set(segment, 0L, pLPF1.memorySegment());
    	return this;
    }
    
    public @Nullable MaLpf1 pLPF1() {
    	MemorySegment segment = (MemorySegment) P_LPF1_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLpf1(segment);
    }
    
    /// @see #pLPF2()
    public MaLpf pLPF2(MaLpf2 pLPF2) {
    	P_LPF2_HANDLE.set(segment, 0L, pLPF2.memorySegment());
    	return this;
    }
    
    public @Nullable MaLpf2 pLPF2() {
    	MemorySegment segment = (MemorySegment) P_LPF2_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLpf2(segment);
    }
    
    /// @see #_pHeap()
    public MaLpf _pHeap(MemorySegment _pHeap) {
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
    public MaLpf _ownsHeap(int _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public int _ownsHeap() {
    	return (int) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaLpf set(MaLpf other) {
        return set(other.segment);
    }
    
    @Override
    public MaLpf set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaLpf> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaLpf> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaLpf(segment),
            count
        );
    }
    
    public static NativeStructArray<MaLpf> array(Arena arena, MaLpf... structs) {
        NativeStructArray<MaLpf> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaLpf(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaLpf> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaLpf(segment)
        );
    }

}