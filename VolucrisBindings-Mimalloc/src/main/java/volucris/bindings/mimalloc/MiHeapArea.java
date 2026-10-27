/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.mimalloc;

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

public final class MiHeapArea
		implements Struct<MiHeapArea> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BLOCKS_HANDLE;
	public static final VarHandle RESERVED_HANDLE;
	public static final VarHandle COMMITTED_HANDLE;
	public static final VarHandle USED_HANDLE;
	public static final VarHandle BLOCK_SIZE_HANDLE;
	public static final VarHandle FULL_BLOCK_SIZE_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;

	public static final long BLOCKS_BYTE_OFFSET;
	public static final long RESERVED_BYTE_OFFSET;
	public static final long COMMITTED_BYTE_OFFSET;
	public static final long USED_BYTE_OFFSET;
	public static final long BLOCK_SIZE_BYTE_OFFSET;
	public static final long FULL_BLOCK_SIZE_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("blocks"),
		    JAVA_LONG.withName("reserved"),
		    JAVA_LONG.withName("committed"),
		    JAVA_LONG.withName("used"),
		    JAVA_LONG.withName("block_size"),
		    JAVA_LONG.withName("full_block_size"),
		    UNBOUNDED_ADDRESS.withName("reserved1")
		).withName("mi_heap_area_s").withByteAlignment(8);
		
		BLOCKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blocks"));
		RESERVED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved"));
		COMMITTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("committed"));
		USED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("used"));
		BLOCK_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("block_size"));
		FULL_BLOCK_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("full_block_size"));
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"));
		
		BLOCKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blocks"));
		RESERVED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved"));
		COMMITTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("committed"));
		USED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("used"));
		BLOCK_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("block_size"));
		FULL_BLOCK_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("full_block_size"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		//@formatter:on
	}

	public MiHeapArea() {
	    this(Arena.ofAuto());
	}
	
	public MiHeapArea(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MiHeapArea(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #blocks()
    public MiHeapArea blocks(MemorySegment blocks) {
    	BLOCKS_HANDLE.set(segment, 0L, blocks);
    	return this;
    }
    
    public @Nullable MemorySegment blocks() {
    	MemorySegment segment = (MemorySegment) BLOCKS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #reserved()
    public MiHeapArea reserved(long reserved) {
    	RESERVED_HANDLE.set(segment, 0L, reserved);
    	return this;
    }
    
    public long reserved() {
    	return (long) RESERVED_HANDLE.get(segment, 0L);
    }
    
    /// @see #committed()
    public MiHeapArea committed(long committed) {
    	COMMITTED_HANDLE.set(segment, 0L, committed);
    	return this;
    }
    
    public long committed() {
    	return (long) COMMITTED_HANDLE.get(segment, 0L);
    }
    
    /// @see #used()
    public MiHeapArea used(long used) {
    	USED_HANDLE.set(segment, 0L, used);
    	return this;
    }
    
    public long used() {
    	return (long) USED_HANDLE.get(segment, 0L);
    }
    
    /// @see #block_size()
    public MiHeapArea block_size(long block_size) {
    	BLOCK_SIZE_HANDLE.set(segment, 0L, block_size);
    	return this;
    }
    
    public long block_size() {
    	return (long) BLOCK_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #full_block_size()
    public MiHeapArea full_block_size(long full_block_size) {
    	FULL_BLOCK_SIZE_HANDLE.set(segment, 0L, full_block_size);
    	return this;
    }
    
    public long full_block_size() {
    	return (long) FULL_BLOCK_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1()
    public MiHeapArea reserved1(MemorySegment reserved1) {
    	RESERVED1_HANDLE.set(segment, 0L, reserved1);
    	return this;
    }
    
    public @Nullable MemorySegment reserved1() {
    	MemorySegment segment = (MemorySegment) RESERVED1_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public MiHeapArea set(MiHeapArea other) {
        return set(other.segment);
    }
    
    @Override
    public MiHeapArea set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MiHeapArea> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MiHeapArea> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MiHeapArea(segment),
            count
        );
    }
    
    public static NativeStructArray<MiHeapArea> array(SegmentAllocator allocator, MiHeapArea... structs) {
        NativeStructArray<MiHeapArea> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MiHeapArea(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MiHeapArea> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MiHeapArea(segment)
        );
    }

}