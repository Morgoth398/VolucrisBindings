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

public final class MaAudioBuffer
		implements Struct<MaAudioBuffer> {

	public static final StructLayout LAYOUT;

	public static final VarHandle OWNS_DATA_HANDLE;
	public static final VarHandle _P_EXTRA_DATA_HANDLE;

	public static final long REF_BYTE_OFFSET;
	public static final long ALLOCATION_CALLBACKS_BYTE_OFFSET;
	public static final long OWNS_DATA_BYTE_OFFSET;
	public static final long _P_EXTRA_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaAudioBufferRef ref;
	private final MaAllocationCallbacks allocationCallbacks;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaAudioBufferRef.LAYOUT.withName("ref"),
		    MaAllocationCallbacks.LAYOUT.withName("allocationCallbacks"),
		    JAVA_INT.withName("ownsData"),
		    MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("_pExtraData"),
		    MemoryLayout.paddingLayout(3)
		).withName("ma_audio_buffer").withByteAlignment(8);
		
		OWNS_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ownsData"));
		_P_EXTRA_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pExtraData"), PathElement.sequenceElement());
		
		REF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ref"));
		ALLOCATION_CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationCallbacks"));
		OWNS_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ownsData"));
		_P_EXTRA_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pExtraData"));
		//@formatter:on
	}

	public MaAudioBuffer() {
	    this(Arena.ofAuto());
	}
	
	public MaAudioBuffer(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaAudioBuffer(MemorySegment segment) {
	    this.segment = segment;
	
	    ref = new MaAudioBufferRef(segment.asSlice(REF_BYTE_OFFSET, MaAudioBufferRef.LAYOUT));
	    allocationCallbacks = new MaAllocationCallbacks(segment.asSlice(ALLOCATION_CALLBACKS_BYTE_OFFSET, MaAllocationCallbacks.LAYOUT));
	}

    /// @see #ref()
    public MaAudioBuffer ref(Consumer<MaAudioBufferRef> consumer) {
    	consumer.accept(ref);
    	return this;
    }
    
    /// @see #ref()
    public MaAudioBuffer ref(MaAudioBufferRef other) {
    	ref.set(other);
    	return this;
    }
    
    public MaAudioBufferRef ref() {
    	return ref;
    }
    
    /// @see #allocationCallbacks()
    public MaAudioBuffer allocationCallbacks(Consumer<MaAllocationCallbacks> consumer) {
    	consumer.accept(allocationCallbacks);
    	return this;
    }
    
    /// @see #allocationCallbacks()
    public MaAudioBuffer allocationCallbacks(MaAllocationCallbacks other) {
    	allocationCallbacks.set(other);
    	return this;
    }
    
    public MaAllocationCallbacks allocationCallbacks() {
    	return allocationCallbacks;
    }
    
    /// @see #ownsData()
    public MaAudioBuffer ownsData(int ownsData) {
    	OWNS_DATA_HANDLE.set(segment, 0L, ownsData);
    	return this;
    }
    
    public int ownsData() {
    	return (int) OWNS_DATA_HANDLE.get(segment, 0L);
    }
    
    /// @see #_pExtraData(int)
    public MaAudioBuffer _pExtraData(byte _pExtraData, int index0) {
    	_P_EXTRA_DATA_HANDLE.set(segment, 0L, index0, _pExtraData);
    	return this;
    }
    
    public byte _pExtraData(int index0) {
    	return (byte) _P_EXTRA_DATA_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public MaAudioBuffer set(MaAudioBuffer other) {
        return set(other.segment);
    }
    
    @Override
    public MaAudioBuffer set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaAudioBuffer> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaAudioBuffer> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaAudioBuffer(segment),
            count
        );
    }
    
    public static NativeStructArray<MaAudioBuffer> array(Arena arena, MaAudioBuffer... structs) {
        NativeStructArray<MaAudioBuffer> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaAudioBuffer(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaAudioBuffer> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaAudioBuffer(segment)
        );
    }

}