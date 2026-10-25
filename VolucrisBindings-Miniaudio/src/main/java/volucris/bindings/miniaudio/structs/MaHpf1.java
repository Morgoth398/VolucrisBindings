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
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaHpf1
		implements Struct<MaHpf1> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle P_R1_HANDLE;
	public static final VarHandle _P_HEAP_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long A_BYTE_OFFSET;
	public static final long P_R1_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaBiquadCoefficient a;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    MaBiquadCoefficient.LAYOUT.withName("a"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pR1"),
		    UNBOUNDED_ADDRESS.withName("_pHeap"),
		    JAVA_INT.withName("_ownsHeap"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_hpf1").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		P_R1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pR1"));
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a"));
		P_R1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pR1"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		//@formatter:on
	}

	public MaHpf1() {
	    this(Arena.ofAuto());
	}
	
	public MaHpf1(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaHpf1(MemorySegment segment) {
	    this.segment = segment;
	
	    a = new MaBiquadCoefficient(segment.asSlice(A_BYTE_OFFSET, MaBiquadCoefficient.LAYOUT));
	}

    /// @see #format()
    public MaHpf1 format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaHpf1 channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #a()
    public MaHpf1 a(Consumer<MaBiquadCoefficient> consumer) {
    	consumer.accept(a);
    	return this;
    }
    
    /// @see #a()
    public MaHpf1 a(MaBiquadCoefficient other) {
    	a.set(other);
    	return this;
    }
    
    public MaBiquadCoefficient a() {
    	return a;
    }
    
    /// @see #pR1()
    public MaHpf1 pR1(MaBiquadCoefficient pR1) {
    	P_R1_HANDLE.set(segment, 0L, pR1.memorySegment());
    	return this;
    }
    
    public @Nullable MaBiquadCoefficient pR1() {
    	MemorySegment segment = (MemorySegment) P_R1_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaBiquadCoefficient(segment);
    }
    
    /// @see #_pHeap()
    public MaHpf1 _pHeap(MemorySegment _pHeap) {
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
    public MaHpf1 _ownsHeap(int _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public int _ownsHeap() {
    	return (int) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaHpf1 set(MaHpf1 other) {
        return set(other.segment);
    }
    
    @Override
    public MaHpf1 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaHpf1> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaHpf1> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaHpf1(segment),
            count
        );
    }
    
    public static NativeStructArray<MaHpf1> array(SegmentAllocator allocator, MaHpf1... structs) {
        NativeStructArray<MaHpf1> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaHpf1(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaHpf1> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaHpf1(segment)
        );
    }

}