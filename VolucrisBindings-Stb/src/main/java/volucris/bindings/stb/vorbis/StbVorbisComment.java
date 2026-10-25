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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class StbVorbisComment
		implements Struct<StbVorbisComment> {

	public static final StructLayout LAYOUT;

	public static final VarHandle VENDOR_HANDLE;
	public static final VarHandle COMMENT_LIST_LENGTH_HANDLE;
	public static final VarHandle COMMENT_LIST_HANDLE;

	public static final long VENDOR_BYTE_OFFSET;
	public static final long COMMENT_LIST_LENGTH_BYTE_OFFSET;
	public static final long COMMENT_LIST_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("vendor"),
		    JAVA_INT.withName("comment_list_length"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("comment_list")
		).withName("stb_vorbis_comment").withByteAlignment(8);
		
		VENDOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vendor"));
		COMMENT_LIST_LENGTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("comment_list_length"));
		COMMENT_LIST_HANDLE = LAYOUT.varHandle(PathElement.groupElement("comment_list"));
		
		VENDOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vendor"));
		COMMENT_LIST_LENGTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("comment_list_length"));
		COMMENT_LIST_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("comment_list"));
		//@formatter:on
	}

	public StbVorbisComment() {
	    this(Arena.ofAuto());
	}
	
	public StbVorbisComment(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StbVorbisComment(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #vendor()
    public StbVorbisComment vendor(NativeByteArray vendor) {
    	VENDOR_HANDLE.set(segment, 0L, vendor.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray vendor() {
    	MemorySegment segment = (MemorySegment) VENDOR_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #comment_list_length()
    public StbVorbisComment comment_list_length(int comment_list_length) {
    	COMMENT_LIST_LENGTH_HANDLE.set(segment, 0L, comment_list_length);
    	return this;
    }
    
    public int comment_list_length() {
    	return (int) COMMENT_LIST_LENGTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #comment_list()
    public StbVorbisComment comment_list(NativePointerArray comment_list) {
    	COMMENT_LIST_HANDLE.set(segment, 0L, comment_list.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray comment_list() {
    	MemorySegment segment = (MemorySegment) COMMENT_LIST_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public StbVorbisComment set(StbVorbisComment other) {
        return set(other.segment);
    }
    
    @Override
    public StbVorbisComment set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StbVorbisComment> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StbVorbisComment> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StbVorbisComment(segment),
            count
        );
    }
    
    public static NativeStructArray<StbVorbisComment> array(SegmentAllocator allocator, StbVorbisComment... structs) {
        NativeStructArray<StbVorbisComment> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StbVorbisComment(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StbVorbisComment> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StbVorbisComment(segment)
        );
    }

}