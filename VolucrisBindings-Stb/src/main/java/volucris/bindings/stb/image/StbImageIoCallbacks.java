/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.stb.image;

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

/// ```
/// ///////////////////////////////////////////////////////////////////////////
/// ```
public final class StbImageIoCallbacks
		implements Struct<StbImageIoCallbacks> {

	public static final StructLayout LAYOUT;

	public static final VarHandle READ_HANDLE;
	public static final VarHandle SKIP_HANDLE;
	public static final VarHandle EOF_HANDLE;

	public static final long READ_BYTE_OFFSET;
	public static final long SKIP_BYTE_OFFSET;
	public static final long EOF_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("read"),
		    UNBOUNDED_ADDRESS.withName("skip"),
		    UNBOUNDED_ADDRESS.withName("eof")
		).withName("stbi_io_callbacks").withByteAlignment(8);
		
		READ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("read"));
		SKIP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("skip"));
		EOF_HANDLE = LAYOUT.varHandle(PathElement.groupElement("eof"));
		
		READ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("read"));
		SKIP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("skip"));
		EOF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("eof"));
		//@formatter:on
	}

	public StbImageIoCallbacks() {
	    this(Arena.ofAuto());
	}
	
	public StbImageIoCallbacks(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StbImageIoCallbacks(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #read()
    public StbImageIoCallbacks read(StbImageReadCallback read) {
    	READ_HANDLE.set(segment, 0L, read.memorySegment());
    	return this;
    }
    
    public @Nullable StbImageReadCallback read() {
    	MemorySegment segment = (MemorySegment) READ_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return StbImageReadCallback.get(segment);
    }
    
    /// @see #skip()
    public StbImageIoCallbacks skip(StbImageSkipCallback skip) {
    	SKIP_HANDLE.set(segment, 0L, skip.memorySegment());
    	return this;
    }
    
    public @Nullable StbImageSkipCallback skip() {
    	MemorySegment segment = (MemorySegment) SKIP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return StbImageSkipCallback.get(segment);
    }
    
    /// @see #eof()
    public StbImageIoCallbacks eof(StbImageSkipEofCallback eof) {
    	EOF_HANDLE.set(segment, 0L, eof.memorySegment());
    	return this;
    }
    
    public @Nullable StbImageSkipEofCallback eof() {
    	MemorySegment segment = (MemorySegment) EOF_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return StbImageSkipEofCallback.get(segment);
    }
    
    @Override
    public StbImageIoCallbacks set(StbImageIoCallbacks other) {
        return set(other.segment);
    }
    
    @Override
    public StbImageIoCallbacks set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StbImageIoCallbacks> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StbImageIoCallbacks> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StbImageIoCallbacks(segment),
            count
        );
    }
    
    public static NativeStructArray<StbImageIoCallbacks> array(SegmentAllocator allocator, StbImageIoCallbacks... structs) {
        NativeStructArray<StbImageIoCallbacks> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StbImageIoCallbacks(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StbImageIoCallbacks> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StbImageIoCallbacks(segment)
        );
    }

}