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

public final class MaBpf
		implements Struct<MaBpf> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle BPF2_COUNT_HANDLE;
	public static final VarHandle P_BPF2_HANDLE;
	public static final VarHandle _P_HEAP_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long BPF2_COUNT_BYTE_OFFSET;
	public static final long P_BPF2_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("bpf2Count"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pBPF2"),
		    UNBOUNDED_ADDRESS.withName("_pHeap"),
		    JAVA_INT.withName("_ownsHeap"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_bpf").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		BPF2_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bpf2Count"));
		P_BPF2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBPF2"));
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		BPF2_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bpf2Count"));
		P_BPF2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBPF2"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		//@formatter:on
	}

	public MaBpf() {
	    this(Arena.ofAuto());
	}
	
	public MaBpf(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaBpf(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #format()
    public MaBpf format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaBpf channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #bpf2Count()
    public MaBpf bpf2Count(int bpf2Count) {
    	BPF2_COUNT_HANDLE.set(segment, 0L, bpf2Count);
    	return this;
    }
    
    public int bpf2Count() {
    	return (int) BPF2_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pBPF2()
    public MaBpf pBPF2(MaBpf2 pBPF2) {
    	P_BPF2_HANDLE.set(segment, 0L, pBPF2.memorySegment());
    	return this;
    }
    
    public @Nullable MaBpf2 pBPF2() {
    	MemorySegment segment = (MemorySegment) P_BPF2_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaBpf2(segment);
    }
    
    /// @see #_pHeap()
    public MaBpf _pHeap(MemorySegment _pHeap) {
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
    public MaBpf _ownsHeap(int _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public int _ownsHeap() {
    	return (int) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaBpf set(MaBpf other) {
        return set(other.segment);
    }
    
    @Override
    public MaBpf set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaBpf> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaBpf> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaBpf(segment),
            count
        );
    }
    
    public static NativeStructArray<MaBpf> array(Arena arena, MaBpf... structs) {
        NativeStructArray<MaBpf> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaBpf(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaBpf> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaBpf(segment)
        );
    }

}