/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// \brief  General statistics from current state of the Allocator -
/// total memory usage across all memory heaps and types.
/// 
/// These are slower to calculate. Use for debugging purposes.
/// See function vmaCalculateStatistics().
/// ```
public final class VmaTotalStatistics
		implements Struct<VmaTotalStatistics> {

	public static final StructLayout LAYOUT;

	public static final long MEMORY_TYPE_BYTE_OFFSET;
	public static final long MEMORY_HEAP_BYTE_OFFSET;
	public static final long TOTAL_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VmaDetailedStatistics[] memoryType;
	private final VmaDetailedStatistics[] memoryHeap;
	private final VmaDetailedStatistics total;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MemoryLayout.sequenceLayout(32, VmaDetailedStatistics.LAYOUT).withName("memoryType"),
		    MemoryLayout.sequenceLayout(16, VmaDetailedStatistics.LAYOUT).withName("memoryHeap"),
		    VmaDetailedStatistics.LAYOUT.withName("total")
		).withName("VmaTotalStatistics").withByteAlignment(8);
		
		MEMORY_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryType"));
		MEMORY_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryHeap"));
		TOTAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("total"));
		//@formatter:on
	}

	public VmaTotalStatistics() {
	    this(Arena.ofAuto());
	}
	
	public VmaTotalStatistics(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VmaTotalStatistics(MemorySegment segment) {
	    this.segment = segment;
	
	    memoryType = new VmaDetailedStatistics[32];
	    for (int i = 0; i < 32; i++) {
	        long offset = MEMORY_TYPE_BYTE_OFFSET + i * VmaDetailedStatistics.LAYOUT.byteSize();
	        memoryType[i] = new VmaDetailedStatistics(segment.asSlice(offset, VmaDetailedStatistics.LAYOUT));
	    }
	    memoryHeap = new VmaDetailedStatistics[16];
	    for (int i = 0; i < 16; i++) {
	        long offset = MEMORY_HEAP_BYTE_OFFSET + i * VmaDetailedStatistics.LAYOUT.byteSize();
	        memoryHeap[i] = new VmaDetailedStatistics(segment.asSlice(offset, VmaDetailedStatistics.LAYOUT));
	    }
	    total = new VmaDetailedStatistics(segment.asSlice(TOTAL_BYTE_OFFSET, VmaDetailedStatistics.LAYOUT));
	}

    /// @see #memoryType(int)
    public VmaTotalStatistics memoryType(Consumer<VmaDetailedStatistics> consumer, int index) {
    	consumer.accept(memoryType[index]);
    	return this;
    }
    
    /// @see #memoryType(int)
    public VmaTotalStatistics memoryType(VmaDetailedStatistics other, int index) {
    	memoryType[index].set(other);
    	return this;
    }
    
    public VmaDetailedStatistics memoryType(int index) {
    	return memoryType[index];
    }
    
    /// @see #memoryHeap(int)
    public VmaTotalStatistics memoryHeap(Consumer<VmaDetailedStatistics> consumer, int index) {
    	consumer.accept(memoryHeap[index]);
    	return this;
    }
    
    /// @see #memoryHeap(int)
    public VmaTotalStatistics memoryHeap(VmaDetailedStatistics other, int index) {
    	memoryHeap[index].set(other);
    	return this;
    }
    
    public VmaDetailedStatistics memoryHeap(int index) {
    	return memoryHeap[index];
    }
    
    /// @see #total()
    public VmaTotalStatistics total(Consumer<VmaDetailedStatistics> consumer) {
    	consumer.accept(total);
    	return this;
    }
    
    /// @see #total()
    public VmaTotalStatistics total(VmaDetailedStatistics other) {
    	total.set(other);
    	return this;
    }
    
    public VmaDetailedStatistics total() {
    	return total;
    }
    
    @Override
    public VmaTotalStatistics set(VmaTotalStatistics other) {
        return set(other.segment);
    }
    
    @Override
    public VmaTotalStatistics set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaTotalStatistics> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaTotalStatistics> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaTotalStatistics(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaTotalStatistics> array(Arena arena, VmaTotalStatistics... structs) {
        NativeStructArray<VmaTotalStatistics> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaTotalStatistics(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaTotalStatistics> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaTotalStatistics(segment)
        );
    }

}