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
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaAllocationCallbacks
		implements Struct<MaAllocationCallbacks> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_USER_DATA_HANDLE;
	public static final VarHandle ON_MALLOC_HANDLE;
	public static final VarHandle ON_REALLOC_HANDLE;
	public static final VarHandle ON_FREE_HANDLE;

	public static final long P_USER_DATA_BYTE_OFFSET;
	public static final long ON_MALLOC_BYTE_OFFSET;
	public static final long ON_REALLOC_BYTE_OFFSET;
	public static final long ON_FREE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pUserData"),
		    UNBOUNDED_ADDRESS.withName("onMalloc"),
		    UNBOUNDED_ADDRESS.withName("onRealloc"),
		    UNBOUNDED_ADDRESS.withName("onFree")
		).withName("ma_allocation_callbacks").withByteAlignment(8);
		
		P_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUserData"));
		ON_MALLOC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onMalloc"));
		ON_REALLOC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onRealloc"));
		ON_FREE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onFree"));
		
		P_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
		ON_MALLOC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onMalloc"));
		ON_REALLOC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onRealloc"));
		ON_FREE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onFree"));
		//@formatter:on
	}

	public MaAllocationCallbacks() {
	    this(Arena.ofAuto());
	}
	
	public MaAllocationCallbacks(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaAllocationCallbacks(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #pUserData()
    public MaAllocationCallbacks pUserData(MemorySegment pUserData) {
    	P_USER_DATA_HANDLE.set(segment, 0L, pUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pUserData() {
    	MemorySegment segment = (MemorySegment) P_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #onMalloc()
    public MaAllocationCallbacks onMalloc(MaOnMalloc onMalloc) {
    	ON_MALLOC_HANDLE.set(segment, 0L, onMalloc.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnMalloc onMalloc() {
    	MemorySegment segment = (MemorySegment) ON_MALLOC_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnMalloc.get(segment);
    }
    
    /// @see #onRealloc()
    public MaAllocationCallbacks onRealloc(MaOnRealloc onRealloc) {
    	ON_REALLOC_HANDLE.set(segment, 0L, onRealloc.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnRealloc onRealloc() {
    	MemorySegment segment = (MemorySegment) ON_REALLOC_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnRealloc.get(segment);
    }
    
    /// @see #onFree()
    public MaAllocationCallbacks onFree(MaOnFree onFree) {
    	ON_FREE_HANDLE.set(segment, 0L, onFree.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnFree onFree() {
    	MemorySegment segment = (MemorySegment) ON_FREE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnFree.get(segment);
    }
    
    @Override
    public MaAllocationCallbacks set(MaAllocationCallbacks other) {
        return set(other.segment);
    }
    
    @Override
    public MaAllocationCallbacks set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaAllocationCallbacks> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaAllocationCallbacks> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaAllocationCallbacks(segment),
            count
        );
    }
    
    public static NativeStructArray<MaAllocationCallbacks> array(SegmentAllocator allocator, MaAllocationCallbacks... structs) {
        NativeStructArray<MaAllocationCallbacks> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaAllocationCallbacks(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaAllocationCallbacks> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaAllocationCallbacks(segment)
        );
    }

}