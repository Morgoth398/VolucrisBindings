/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vma.VmaAllocation;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;
import static volucris.bindings.core.FFMUtils.UNBOUNDED_ADDRESS;

/// ```
/// Single move of an allocation to be done for defragmentation.
/// ```
public final class VmaDefragmentationMove
		implements Struct<VmaDefragmentationMove> {

	public static final StructLayout LAYOUT;

	public static final VarHandle OPERATION_HANDLE;
	public static final VarHandle SRC_ALLOCATION_HANDLE;
	public static final VarHandle DST_TMP_ALLOCATION_HANDLE;

	public static final long OPERATION_BYTE_OFFSET;
	public static final long SRC_ALLOCATION_BYTE_OFFSET;
	public static final long DST_TMP_ALLOCATION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("operation"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("srcAllocation"),
		    UNBOUNDED_ADDRESS.withName("dstTmpAllocation")
		).withName("VmaDefragmentationMove").withByteAlignment(8);
		
		OPERATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("operation"));
		SRC_ALLOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcAllocation"));
		DST_TMP_ALLOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstTmpAllocation"));
		
		OPERATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("operation"));
		SRC_ALLOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcAllocation"));
		DST_TMP_ALLOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstTmpAllocation"));
		//@formatter:on
	}

	public VmaDefragmentationMove() {
	    this(Arena.ofAuto());
	}
	
	public VmaDefragmentationMove(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VmaDefragmentationMove(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #operation()
    public VmaDefragmentationMove operation(int operation) {
    	OPERATION_HANDLE.set(segment, 0L, operation);
    	return this;
    }
    
    /// ```
    /// Operation to be performed on the allocation by vmaEndDefragmentationPass(). Default value is #VMA_DEFRAGMENTATION_MOVE_OPERATION_COPY. You can modify it.
    /// ```
    public int operation() {
    	return (int) OPERATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcAllocation()
    public VmaDefragmentationMove srcAllocation(VmaAllocation srcAllocation) {
    	SRC_ALLOCATION_HANDLE.set(segment, 0L, srcAllocation.memorySegment());
    	return this;
    }
    
    /// ```
    /// Allocation that should be moved.
    /// ```
    public @Nullable VmaAllocation srcAllocation() {
    	MemorySegment segment = (MemorySegment) SRC_ALLOCATION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VmaAllocation(segment);
    }
    
    /// @see #dstTmpAllocation()
    public VmaDefragmentationMove dstTmpAllocation(VmaAllocation dstTmpAllocation) {
    	DST_TMP_ALLOCATION_HANDLE.set(segment, 0L, dstTmpAllocation.memorySegment());
    	return this;
    }
    
    /// ```
    /// \brief Temporary allocation pointing to destination memory that will replace `srcAllocation`.
    /// 
    ///     \warning Do not store this allocation in your data structures! It exists only temporarily, for the duration of the defragmentation pass,
    ///     to be used for binding new buffer/image to the destination memory using e.g. vmaBindBufferMemory().
    ///     vmaEndDefragmentationPass() will destroy it and make `srcAllocation` point to this memory.
    /// ```
    public @Nullable VmaAllocation dstTmpAllocation() {
    	MemorySegment segment = (MemorySegment) DST_TMP_ALLOCATION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VmaAllocation(segment);
    }
    
    @Override
    public VmaDefragmentationMove set(VmaDefragmentationMove other) {
        return set(other.segment);
    }
    
    @Override
    public VmaDefragmentationMove set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaDefragmentationMove> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaDefragmentationMove> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaDefragmentationMove(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaDefragmentationMove> array(Arena arena, VmaDefragmentationMove... structs) {
        NativeStructArray<VmaDefragmentationMove> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaDefragmentationMove(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaDefragmentationMove> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaDefragmentationMove(segment)
        );
    }

}