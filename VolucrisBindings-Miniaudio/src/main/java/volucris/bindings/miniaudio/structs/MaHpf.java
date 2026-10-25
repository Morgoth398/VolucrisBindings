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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaHpf
		implements Struct<MaHpf> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle HPF1_COUNT_HANDLE;
	public static final VarHandle HPF2_COUNT_HANDLE;
	public static final VarHandle P_HPF1_HANDLE;
	public static final VarHandle P_HPF2_HANDLE;
	public static final VarHandle _P_HEAP_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long HPF1_COUNT_BYTE_OFFSET;
	public static final long HPF2_COUNT_BYTE_OFFSET;
	public static final long P_HPF1_BYTE_OFFSET;
	public static final long P_HPF2_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("sampleRate"),
		    JAVA_INT.withName("hpf1Count"),
		    JAVA_INT.withName("hpf2Count"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pHPF1"),
		    UNBOUNDED_ADDRESS.withName("pHPF2"),
		    UNBOUNDED_ADDRESS.withName("_pHeap"),
		    JAVA_INT.withName("_ownsHeap"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_hpf").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		HPF1_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hpf1Count"));
		HPF2_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hpf2Count"));
		P_HPF1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pHPF1"));
		P_HPF2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pHPF2"));
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		HPF1_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hpf1Count"));
		HPF2_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hpf2Count"));
		P_HPF1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pHPF1"));
		P_HPF2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pHPF2"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		//@formatter:on
	}

	public MaHpf() {
	    this(Arena.ofAuto());
	}
	
	public MaHpf(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaHpf(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #format()
    public MaHpf format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaHpf channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaHpf sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #hpf1Count()
    public MaHpf hpf1Count(int hpf1Count) {
    	HPF1_COUNT_HANDLE.set(segment, 0L, hpf1Count);
    	return this;
    }
    
    public int hpf1Count() {
    	return (int) HPF1_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #hpf2Count()
    public MaHpf hpf2Count(int hpf2Count) {
    	HPF2_COUNT_HANDLE.set(segment, 0L, hpf2Count);
    	return this;
    }
    
    public int hpf2Count() {
    	return (int) HPF2_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pHPF1()
    public MaHpf pHPF1(MaHpf1 pHPF1) {
    	P_HPF1_HANDLE.set(segment, 0L, pHPF1.memorySegment());
    	return this;
    }
    
    public @Nullable MaHpf1 pHPF1() {
    	MemorySegment segment = (MemorySegment) P_HPF1_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaHpf1(segment);
    }
    
    /// @see #pHPF2()
    public MaHpf pHPF2(MaHpf2 pHPF2) {
    	P_HPF2_HANDLE.set(segment, 0L, pHPF2.memorySegment());
    	return this;
    }
    
    public @Nullable MaHpf2 pHPF2() {
    	MemorySegment segment = (MemorySegment) P_HPF2_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaHpf2(segment);
    }
    
    /// @see #_pHeap()
    public MaHpf _pHeap(MemorySegment _pHeap) {
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
    public MaHpf _ownsHeap(int _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public int _ownsHeap() {
    	return (int) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaHpf set(MaHpf other) {
        return set(other.segment);
    }
    
    @Override
    public MaHpf set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaHpf> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaHpf> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaHpf(segment),
            count
        );
    }
    
    public static NativeStructArray<MaHpf> array(SegmentAllocator allocator, MaHpf... structs) {
        NativeStructArray<MaHpf> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaHpf(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaHpf> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaHpf(segment)
        );
    }

}