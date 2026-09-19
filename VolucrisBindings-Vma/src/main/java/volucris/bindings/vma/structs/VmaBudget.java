/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// \brief Statistics of current memory usage and available budget for a specific memory heap.
/// 
/// These are fast to calculate.
/// See function vmaGetHeapBudgets().
/// ```
public final class VmaBudget
		implements Struct<VmaBudget> {

    public static final StructLayout LAYOUT;

    public static final VarHandle USAGE_HANDLE;
    public static final VarHandle BUDGET_HANDLE;

    public static final long STATISTICS_BYTE_OFFSET;
    public static final long USAGE_BYTE_OFFSET;
    public static final long BUDGET_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VmaStatistics statistics;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            VmaStatistics.LAYOUT.withName("statistics"),
            JAVA_LONG.withName("usage"),
            JAVA_LONG.withName("budget")
        ).withName("VmaBudget").withByteAlignment(8);
        
        USAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usage"));
        BUDGET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("budget"));
        
        STATISTICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("statistics"));
        USAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usage"));
        BUDGET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("budget"));
        //@formatter:on
    }

    public VmaBudget() {
        this(Arena.ofAuto());
    }
    
    public VmaBudget(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VmaBudget(MemorySegment segment) {
        this.segment = segment;
    
        statistics = new VmaStatistics(segment.asSlice(STATISTICS_BYTE_OFFSET, VmaStatistics.LAYOUT));
    }

    /// @see #usage()
    public VmaBudget usage(long usage) {
    	USAGE_HANDLE.set(segment, 0L, usage);
    	return this;
    }
    
    /// ```
    /// \brief Estimated current memory usage of the program, in bytes.
    /// 
    ///     Fetched from system using VK_EXT_memory_budget extension if enabled.
    /// 
    ///     It might be different than `statistics.blockBytes` (usually higher) due to additional implicit objects
    ///     also occupying the memory, like swapchain, pipelines, descriptor heaps, command buffers, or
    ///     `VkDeviceMemory` blocks allocated outside of this library, if any.
    /// ```
    public long usage() {
    	return (long) USAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #budget()
    public VmaBudget budget(long budget) {
    	BUDGET_HANDLE.set(segment, 0L, budget);
    	return this;
    }
    
    /// ```
    /// \brief Estimated amount of memory available to the program, in bytes.
    /// 
    ///     Fetched from system using VK_EXT_memory_budget extension if enabled.
    /// 
    ///     It might be different (most probably smaller) than `VkMemoryHeap::size[heapIndex]` due to factors
    ///     external to the program, decided by the operating system.
    ///     Difference `budget - usage` is the amount of additional memory that can probably
    ///     be allocated without problems. Exceeding the budget may result in various problems.
    /// ```
    public long budget() {
    	return (long) BUDGET_HANDLE.get(segment, 0L);
    }
    
    /// @see #statistics()
    public VmaBudget statistics(Consumer<VmaStatistics> consumer) {
    	consumer.accept(statistics);
    	return this;
    }
    
    /// @see #statistics()
    public VmaBudget statistics(VmaStatistics other) {
    	statistics.set(other);
    	return this;
    }
    
    /// ```
    /// \brief Statistics fetched from the library.
    /// ```
    public VmaStatistics statistics() {
    	return statistics;
    }
    
    @Override
    public VmaBudget set(VmaBudget other) {
        return set(other.segment);
    }
    
    @Override
    public VmaBudget set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaBudget> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaBudget> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaBudget(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaBudget> array(Arena arena, VmaBudget... structs) {
        NativeStructArray<VmaBudget> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaBudget(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaBudget> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaBudget(segment)
        );
    }
    
}