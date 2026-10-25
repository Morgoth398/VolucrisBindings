/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma.structs;

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
import static volucris.bindings.core.FFMUtils.UNBOUNDED_ADDRESS;

/// ```
/// \brief Parameters for incremental defragmentation steps.
/// 
/// To be used with function vmaBeginDefragmentationPass().
/// ```
public final class VmaDefragmentationPassMoveInfo
		implements Struct<VmaDefragmentationPassMoveInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle MOVE_COUNT_HANDLE;
	public static final VarHandle P_MOVES_HANDLE;

	public static final long MOVE_COUNT_BYTE_OFFSET;
	public static final long P_MOVES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("moveCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pMoves")
		).withName("VmaDefragmentationPassMoveInfo").withByteAlignment(8);
		
		MOVE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("moveCount"));
		P_MOVES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMoves"));
		
		MOVE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("moveCount"));
		P_MOVES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMoves"));
		//@formatter:on
	}

	public VmaDefragmentationPassMoveInfo() {
	    this(Arena.ofAuto());
	}
	
	public VmaDefragmentationPassMoveInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VmaDefragmentationPassMoveInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #moveCount()
    public VmaDefragmentationPassMoveInfo moveCount(int moveCount) {
    	MOVE_COUNT_HANDLE.set(segment, 0L, moveCount);
    	return this;
    }
    
    /// ```
    /// Number of elements in the `pMoves` array.
    /// ```
    public int moveCount() {
    	return (int) MOVE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pMoves()
    public VmaDefragmentationPassMoveInfo pMoves(VmaDefragmentationMove pMoves) {
    	P_MOVES_HANDLE.set(segment, 0L, pMoves.memorySegment());
    	return this;
    }
    
    /// ```
    /// \brief Array of moves to be performed by the user in the current defragmentation pass.
    /// 
    ///     Pointer to an array of `moveCount` elements, owned by VMA, created in vmaBeginDefragmentationPass(), destroyed in vmaEndDefragmentationPass().
    /// 
    ///     For each element, you should:
    /// 
    ///     1. Create a new buffer/image in the place pointed by VmaDefragmentationMove::dstMemory + VmaDefragmentationMove::dstOffset.
    ///     2. Copy data from the VmaDefragmentationMove::srcAllocation e.g. using `vkCmdCopyBuffer`, `vkCmdCopyImage`.
    ///     3. Make sure these commands finished executing on the GPU.
    ///     4. Destroy the old buffer/image.
    /// 
    ///     Only then you can finish defragmentation pass by calling vmaEndDefragmentationPass().
    ///     After this call, the allocation will point to the new place in memory.
    /// 
    ///     Alternatively, if you cannot move specific allocation, you can set VmaDefragmentationMove::operation to #VMA_DEFRAGMENTATION_MOVE_OPERATION_IGNORE.
    /// 
    ///     Alternatively, if you decide you want to completely remove the allocation:
    /// 
    ///     1. Destroy its buffer/image.
    ///     2. Set VmaDefragmentationMove::operation to #VMA_DEFRAGMENTATION_MOVE_OPERATION_DESTROY.
    /// 
    ///     Then, after vmaEndDefragmentationPass() the allocation will be freed.
    /// ```
    public @Nullable VmaDefragmentationMove pMoves() {
    	MemorySegment segment = (MemorySegment) P_MOVES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VmaDefragmentationMove(segment);
    }
    
    @Override
    public VmaDefragmentationPassMoveInfo set(VmaDefragmentationPassMoveInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VmaDefragmentationPassMoveInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaDefragmentationPassMoveInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaDefragmentationPassMoveInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VmaDefragmentationPassMoveInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaDefragmentationPassMoveInfo> array(SegmentAllocator allocator, VmaDefragmentationPassMoveInfo... structs) {
        NativeStructArray<VmaDefragmentationPassMoveInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VmaDefragmentationPassMoveInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaDefragmentationPassMoveInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaDefragmentationPassMoveInfo(segment)
        );
    }

}