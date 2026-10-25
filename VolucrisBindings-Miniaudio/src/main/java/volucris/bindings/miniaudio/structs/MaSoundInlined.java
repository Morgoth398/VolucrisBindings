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

public final class MaSoundInlined
		implements Struct<MaSoundInlined> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_PREV_HANDLE;

	public static final long SOUND_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_PREV_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaSound sound;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaSound.LAYOUT.withName("sound"),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pPrev")
		).withName("ma_sound_inlined").withByteAlignment(8);
		
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_PREV_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPrev"));
		
		SOUND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sound"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_PREV_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPrev"));
		//@formatter:on
	}

	public MaSoundInlined() {
	    this(Arena.ofAuto());
	}
	
	public MaSoundInlined(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaSoundInlined(MemorySegment segment) {
	    this.segment = segment;
	
	    sound = new MaSound(segment.asSlice(SOUND_BYTE_OFFSET, MaSound.LAYOUT));
	}

    /// @see #sound()
    public MaSoundInlined sound(Consumer<MaSound> consumer) {
    	consumer.accept(sound);
    	return this;
    }
    
    /// @see #sound()
    public MaSoundInlined sound(MaSound other) {
    	sound.set(other);
    	return this;
    }
    
    public MaSound sound() {
    	return sound;
    }
    
    /// @see #pNext()
    public MaSoundInlined pNext(MaSoundInlined pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext.memorySegment());
    	return this;
    }
    
    public @Nullable MaSoundInlined pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaSoundInlined(segment);
    }
    
    /// @see #pPrev()
    public MaSoundInlined pPrev(MaSoundInlined pPrev) {
    	P_PREV_HANDLE.set(segment, 0L, pPrev.memorySegment());
    	return this;
    }
    
    public @Nullable MaSoundInlined pPrev() {
    	MemorySegment segment = (MemorySegment) P_PREV_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaSoundInlined(segment);
    }
    
    @Override
    public MaSoundInlined set(MaSoundInlined other) {
        return set(other.segment);
    }
    
    @Override
    public MaSoundInlined set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaSoundInlined> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaSoundInlined> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaSoundInlined(segment),
            count
        );
    }
    
    public static NativeStructArray<MaSoundInlined> array(SegmentAllocator allocator, MaSoundInlined... structs) {
        NativeStructArray<MaSoundInlined> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaSoundInlined(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaSoundInlined> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaSoundInlined(segment)
        );
    }

}