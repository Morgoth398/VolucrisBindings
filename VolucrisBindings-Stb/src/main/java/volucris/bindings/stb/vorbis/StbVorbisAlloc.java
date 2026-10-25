/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.stb.vorbis;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class StbVorbisAlloc
		implements Struct<StbVorbisAlloc> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ALLOC_BUFFER_HANDLE;
	public static final VarHandle ALLOC_BUFFER_LENGTH_IN_BYTES_HANDLE;

	public static final long ALLOC_BUFFER_BYTE_OFFSET;
	public static final long ALLOC_BUFFER_LENGTH_IN_BYTES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("alloc_buffer"),
		    JAVA_INT.withName("alloc_buffer_length_in_bytes"),
		    MemoryLayout.paddingLayout(4)
		).withName("stb_vorbis_alloc").withByteAlignment(8);
		
		ALLOC_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("alloc_buffer"));
		ALLOC_BUFFER_LENGTH_IN_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("alloc_buffer_length_in_bytes"));
		
		ALLOC_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("alloc_buffer"));
		ALLOC_BUFFER_LENGTH_IN_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("alloc_buffer_length_in_bytes"));
		//@formatter:on
	}

	public StbVorbisAlloc() {
	    this(Arena.ofAuto());
	}
	
	public StbVorbisAlloc(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StbVorbisAlloc(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #alloc_buffer()
    public StbVorbisAlloc alloc_buffer(NativeByteArray alloc_buffer) {
    	ALLOC_BUFFER_HANDLE.set(segment, 0L, alloc_buffer.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray alloc_buffer() {
    	MemorySegment segment = (MemorySegment) ALLOC_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #alloc_buffer_length_in_bytes()
    public StbVorbisAlloc alloc_buffer_length_in_bytes(int alloc_buffer_length_in_bytes) {
    	ALLOC_BUFFER_LENGTH_IN_BYTES_HANDLE.set(segment, 0L, alloc_buffer_length_in_bytes);
    	return this;
    }
    
    public int alloc_buffer_length_in_bytes() {
    	return (int) ALLOC_BUFFER_LENGTH_IN_BYTES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StbVorbisAlloc set(StbVorbisAlloc other) {
        return set(other.segment);
    }
    
    @Override
    public StbVorbisAlloc set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StbVorbisAlloc> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StbVorbisAlloc> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StbVorbisAlloc(segment),
            count
        );
    }
    
    public static NativeStructArray<StbVorbisAlloc> array(SegmentAllocator allocator, StbVorbisAlloc... structs) {
        NativeStructArray<StbVorbisAlloc> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StbVorbisAlloc(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StbVorbisAlloc> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StbVorbisAlloc(segment)
        );
    }

}