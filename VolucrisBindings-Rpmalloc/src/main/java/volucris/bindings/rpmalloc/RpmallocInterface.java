/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.rpmalloc;

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

public final class RpmallocInterface
		implements Struct<RpmallocInterface> {

	public static final StructLayout LAYOUT;

	public static final VarHandle MEMORY_MAP_HANDLE;
	public static final VarHandle MEMORY_COMMIT_HANDLE;
	public static final VarHandle MEMORY_DECOMMIT_HANDLE;
	public static final VarHandle MEMORY_UNMAP_HANDLE;
	public static final VarHandle MAP_FAIL_CALLBACK_HANDLE;
	public static final VarHandle ERROR_CALLBACK_HANDLE;

	public static final long MEMORY_MAP_BYTE_OFFSET;
	public static final long MEMORY_COMMIT_BYTE_OFFSET;
	public static final long MEMORY_DECOMMIT_BYTE_OFFSET;
	public static final long MEMORY_UNMAP_BYTE_OFFSET;
	public static final long MAP_FAIL_CALLBACK_BYTE_OFFSET;
	public static final long ERROR_CALLBACK_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("memory_map"),
		    UNBOUNDED_ADDRESS.withName("memory_commit"),
		    UNBOUNDED_ADDRESS.withName("memory_decommit"),
		    UNBOUNDED_ADDRESS.withName("memory_unmap"),
		    UNBOUNDED_ADDRESS.withName("map_fail_callback"),
		    UNBOUNDED_ADDRESS.withName("error_callback")
		).withName("rpmalloc_interface_t").withByteAlignment(8);
		
		MEMORY_MAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memory_map"));
		MEMORY_COMMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memory_commit"));
		MEMORY_DECOMMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memory_decommit"));
		MEMORY_UNMAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memory_unmap"));
		MAP_FAIL_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("map_fail_callback"));
		ERROR_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("error_callback"));
		
		MEMORY_MAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memory_map"));
		MEMORY_COMMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memory_commit"));
		MEMORY_DECOMMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memory_decommit"));
		MEMORY_UNMAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memory_unmap"));
		MAP_FAIL_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("map_fail_callback"));
		ERROR_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("error_callback"));
		//@formatter:on
	}

	public RpmallocInterface() {
	    this(Arena.ofAuto());
	}
	
	public RpmallocInterface(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public RpmallocInterface(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #memory_map()
    public RpmallocInterface memory_map(RpmallocMemoryMap memory_map) {
    	MEMORY_MAP_HANDLE.set(segment, 0L, memory_map.memorySegment());
    	return this;
    }
    
    /// ```
    /// Map memory pages for the given number of bytes. The returned address MUST be aligned to the given alignment,
    /// which will always be either 0 or the span size. The function can store an alignment offset in the offset
    /// variable in case it performs alignment and the returned pointer is offset from the actual start of the memory
    /// region due to this alignment. This alignment offset will be passed to the memory unmap function. The mapped size
    /// can be stored in the mapped_size variable, which will also be passed to the memory unmap function as the release
    /// parameter once the entire mapped region is ready to be released. If you set a memory_map function, you must also
    /// set a memory_unmap function or else the default implementation will be used for both. This function must be
    /// thread safe, it can be called by multiple threads simultaneously.
    /// ```
    public @Nullable RpmallocMemoryMap memory_map() {
    	MemorySegment segment = (MemorySegment) MEMORY_MAP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return RpmallocMemoryMap.get(segment);
    }
    
    /// @see #memory_commit()
    public RpmallocInterface memory_commit(RpmallocMemoryCommit memory_commit) {
    	MEMORY_COMMIT_HANDLE.set(segment, 0L, memory_commit.memorySegment());
    	return this;
    }
    
    /// ```
    /// Commit a range of memory pages. Return non-zero if the operation failed and the address range could not be committed.
    /// ```
    public @Nullable RpmallocMemoryCommit memory_commit() {
    	MemorySegment segment = (MemorySegment) MEMORY_COMMIT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return RpmallocMemoryCommit.get(segment);
    }
    
    /// @see #memory_decommit()
    public RpmallocInterface memory_decommit(RpmallocMemoryDecommit memory_decommit) {
    	MEMORY_DECOMMIT_HANDLE.set(segment, 0L, memory_decommit.memorySegment());
    	return this;
    }
    
    /// ```
    /// Decommit a range of memory pages. Return non-zero if the operation failed and the address range could not be decommitted.
    /// ```
    public @Nullable RpmallocMemoryDecommit memory_decommit() {
    	MemorySegment segment = (MemorySegment) MEMORY_DECOMMIT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return RpmallocMemoryDecommit.get(segment);
    }
    
    /// @see #memory_unmap()
    public RpmallocInterface memory_unmap(RpmallocMemoryUnmap memory_unmap) {
    	MEMORY_UNMAP_HANDLE.set(segment, 0L, memory_unmap.memorySegment());
    	return this;
    }
    
    /// ```
    /// Unmap the memory pages starting at address and spanning the given number of bytes. If you set a memory_unmap
    /// function, you must also set a memory_map function or else the default implementation will be used for both. This
    /// function must be thread safe, it can be called by multiple threads simultaneously.
    /// ```
    public @Nullable RpmallocMemoryUnmap memory_unmap() {
    	MemorySegment segment = (MemorySegment) MEMORY_UNMAP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return RpmallocMemoryUnmap.get(segment);
    }
    
    /// @see #map_fail_callback()
    public RpmallocInterface map_fail_callback(RpmallocFailCallback map_fail_callback) {
    	MAP_FAIL_CALLBACK_HANDLE.set(segment, 0L, map_fail_callback.memorySegment());
    	return this;
    }
    
    /// ```
    /// Called when a call to map memory pages fails (out of memory). If this callback is not set or returns zero the
    /// library will return a null pointer in the allocation call. If this callback returns non-zero the map call will
    /// be retried. The argument passed is the number of bytes that was requested in the map call. Only used if the
    /// default system memory map function is used (memory_map callback is not set).
    /// ```
    public @Nullable RpmallocFailCallback map_fail_callback() {
    	MemorySegment segment = (MemorySegment) MAP_FAIL_CALLBACK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return RpmallocFailCallback.get(segment);
    }
    
    /// @see #error_callback()
    public RpmallocInterface error_callback(RpmallocErrorCallback error_callback) {
    	ERROR_CALLBACK_HANDLE.set(segment, 0L, error_callback.memorySegment());
    	return this;
    }
    
    /// ```
    /// Called when an assert fails, if asserts are enabled. Will use the standard assert() if this is not set.
    /// ```
    public @Nullable RpmallocErrorCallback error_callback() {
    	MemorySegment segment = (MemorySegment) ERROR_CALLBACK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return RpmallocErrorCallback.get(segment);
    }
    
    @Override
    public RpmallocInterface set(RpmallocInterface other) {
        return set(other.segment);
    }
    
    @Override
    public RpmallocInterface set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<RpmallocInterface> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<RpmallocInterface> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new RpmallocInterface(segment),
            count
        );
    }
    
    public static NativeStructArray<RpmallocInterface> array(SegmentAllocator allocator, RpmallocInterface... structs) {
        NativeStructArray<RpmallocInterface> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new RpmallocInterface(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<RpmallocInterface> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new RpmallocInterface(segment)
        );
    }

}