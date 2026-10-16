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

public final class MaBiquad
		implements Struct<MaBiquad> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle P_R1_HANDLE;
	public static final VarHandle P_R2_HANDLE;
	public static final VarHandle _P_HEAP_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long B0_BYTE_OFFSET;
	public static final long B1_BYTE_OFFSET;
	public static final long B2_BYTE_OFFSET;
	public static final long A1_BYTE_OFFSET;
	public static final long A2_BYTE_OFFSET;
	public static final long P_R1_BYTE_OFFSET;
	public static final long P_R2_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaBiquadCoefficient b0;
	private final MaBiquadCoefficient b1;
	private final MaBiquadCoefficient b2;
	private final MaBiquadCoefficient a1;
	private final MaBiquadCoefficient a2;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    MaBiquadCoefficient.LAYOUT.withName("b0"),
		    MaBiquadCoefficient.LAYOUT.withName("b1"),
		    MaBiquadCoefficient.LAYOUT.withName("b2"),
		    MaBiquadCoefficient.LAYOUT.withName("a1"),
		    MaBiquadCoefficient.LAYOUT.withName("a2"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pR1"),
		    UNBOUNDED_ADDRESS.withName("pR2"),
		    UNBOUNDED_ADDRESS.withName("_pHeap"),
		    JAVA_INT.withName("_ownsHeap"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_biquad").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		P_R1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pR1"));
		P_R2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pR2"));
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		B0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b0"));
		B1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b1"));
		B2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b2"));
		A1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a1"));
		A2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a2"));
		P_R1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pR1"));
		P_R2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pR2"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		//@formatter:on
	}

	public MaBiquad() {
	    this(Arena.ofAuto());
	}
	
	public MaBiquad(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaBiquad(MemorySegment segment) {
	    this.segment = segment;
	
	    b0 = new MaBiquadCoefficient(segment.asSlice(B0_BYTE_OFFSET, MaBiquadCoefficient.LAYOUT));
	    b1 = new MaBiquadCoefficient(segment.asSlice(B1_BYTE_OFFSET, MaBiquadCoefficient.LAYOUT));
	    b2 = new MaBiquadCoefficient(segment.asSlice(B2_BYTE_OFFSET, MaBiquadCoefficient.LAYOUT));
	    a1 = new MaBiquadCoefficient(segment.asSlice(A1_BYTE_OFFSET, MaBiquadCoefficient.LAYOUT));
	    a2 = new MaBiquadCoefficient(segment.asSlice(A2_BYTE_OFFSET, MaBiquadCoefficient.LAYOUT));
	}

    /// @see #format()
    public MaBiquad format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaBiquad channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #b0()
    public MaBiquad b0(Consumer<MaBiquadCoefficient> consumer) {
    	consumer.accept(b0);
    	return this;
    }
    
    /// @see #b0()
    public MaBiquad b0(MaBiquadCoefficient other) {
    	b0.set(other);
    	return this;
    }
    
    public MaBiquadCoefficient b0() {
    	return b0;
    }
    
    /// @see #b1()
    public MaBiquad b1(Consumer<MaBiquadCoefficient> consumer) {
    	consumer.accept(b1);
    	return this;
    }
    
    /// @see #b1()
    public MaBiquad b1(MaBiquadCoefficient other) {
    	b1.set(other);
    	return this;
    }
    
    public MaBiquadCoefficient b1() {
    	return b1;
    }
    
    /// @see #b2()
    public MaBiquad b2(Consumer<MaBiquadCoefficient> consumer) {
    	consumer.accept(b2);
    	return this;
    }
    
    /// @see #b2()
    public MaBiquad b2(MaBiquadCoefficient other) {
    	b2.set(other);
    	return this;
    }
    
    public MaBiquadCoefficient b2() {
    	return b2;
    }
    
    /// @see #a1()
    public MaBiquad a1(Consumer<MaBiquadCoefficient> consumer) {
    	consumer.accept(a1);
    	return this;
    }
    
    /// @see #a1()
    public MaBiquad a1(MaBiquadCoefficient other) {
    	a1.set(other);
    	return this;
    }
    
    public MaBiquadCoefficient a1() {
    	return a1;
    }
    
    /// @see #a2()
    public MaBiquad a2(Consumer<MaBiquadCoefficient> consumer) {
    	consumer.accept(a2);
    	return this;
    }
    
    /// @see #a2()
    public MaBiquad a2(MaBiquadCoefficient other) {
    	a2.set(other);
    	return this;
    }
    
    public MaBiquadCoefficient a2() {
    	return a2;
    }
    
    /// @see #pR1()
    public MaBiquad pR1(MaBiquadCoefficient pR1) {
    	P_R1_HANDLE.set(segment, 0L, pR1.memorySegment());
    	return this;
    }
    
    public @Nullable MaBiquadCoefficient pR1() {
    	MemorySegment segment = (MemorySegment) P_R1_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaBiquadCoefficient(segment);
    }
    
    /// @see #pR2()
    public MaBiquad pR2(MaBiquadCoefficient pR2) {
    	P_R2_HANDLE.set(segment, 0L, pR2.memorySegment());
    	return this;
    }
    
    public @Nullable MaBiquadCoefficient pR2() {
    	MemorySegment segment = (MemorySegment) P_R2_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaBiquadCoefficient(segment);
    }
    
    /// @see #_pHeap()
    public MaBiquad _pHeap(MemorySegment _pHeap) {
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
    public MaBiquad _ownsHeap(int _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public int _ownsHeap() {
    	return (int) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaBiquad set(MaBiquad other) {
        return set(other.segment);
    }
    
    @Override
    public MaBiquad set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaBiquad> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaBiquad> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaBiquad(segment),
            count
        );
    }
    
    public static NativeStructArray<MaBiquad> array(Arena arena, MaBiquad... structs) {
        NativeStructArray<MaBiquad> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaBiquad(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaBiquad> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaBiquad(segment)
        );
    }

}