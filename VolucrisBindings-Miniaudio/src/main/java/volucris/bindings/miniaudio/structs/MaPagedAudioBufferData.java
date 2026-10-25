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

public final class MaPagedAudioBufferData
		implements Struct<MaPagedAudioBufferData> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle P_TAIL_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long HEAD_BYTE_OFFSET;
	public static final long P_TAIL_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaPagedAudioBufferPage head;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    MaPagedAudioBufferPage.LAYOUT.withName("head"),
		    UNBOUNDED_ADDRESS.withName("pTail")
		).withName("ma_paged_audio_buffer_data").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		P_TAIL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTail"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		HEAD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("head"));
		P_TAIL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTail"));
		//@formatter:on
	}

	public MaPagedAudioBufferData() {
	    this(Arena.ofAuto());
	}
	
	public MaPagedAudioBufferData(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaPagedAudioBufferData(MemorySegment segment) {
	    this.segment = segment;
	
	    head = new MaPagedAudioBufferPage(segment.asSlice(HEAD_BYTE_OFFSET, MaPagedAudioBufferPage.LAYOUT));
	}

    /// @see #format()
    public MaPagedAudioBufferData format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaPagedAudioBufferData channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #head()
    public MaPagedAudioBufferData head(Consumer<MaPagedAudioBufferPage> consumer) {
    	consumer.accept(head);
    	return this;
    }
    
    /// @see #head()
    public MaPagedAudioBufferData head(MaPagedAudioBufferPage other) {
    	head.set(other);
    	return this;
    }
    
    public MaPagedAudioBufferPage head() {
    	return head;
    }
    
    /// @see #pTail()
    public MaPagedAudioBufferData pTail(MaPagedAudioBufferPage pTail) {
    	P_TAIL_HANDLE.set(segment, 0L, pTail.memorySegment());
    	return this;
    }
    
    public @Nullable MaPagedAudioBufferPage pTail() {
    	MemorySegment segment = (MemorySegment) P_TAIL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaPagedAudioBufferPage(segment);
    }
    
    @Override
    public MaPagedAudioBufferData set(MaPagedAudioBufferData other) {
        return set(other.segment);
    }
    
    @Override
    public MaPagedAudioBufferData set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaPagedAudioBufferData> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaPagedAudioBufferData> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaPagedAudioBufferData(segment),
            count
        );
    }
    
    public static NativeStructArray<MaPagedAudioBufferData> array(SegmentAllocator allocator, MaPagedAudioBufferData... structs) {
        NativeStructArray<MaPagedAudioBufferData> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaPagedAudioBufferData(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaPagedAudioBufferData> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaPagedAudioBufferData(segment)
        );
    }

}