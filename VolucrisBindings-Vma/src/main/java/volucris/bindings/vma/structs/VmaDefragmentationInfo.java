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
import volucris.bindings.vma.VmaCheckDefragmentationBreakFunction;
import volucris.bindings.vma.VmaPool;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;
import static volucris.bindings.core.FFMUtils.UNBOUNDED_ADDRESS;

/// ```
/// \brief Parameters for defragmentation.
/// 
/// To be used with function vmaBeginDefragmentation().
/// ```
public final class VmaDefragmentationInfo
		implements Struct<VmaDefragmentationInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle POOL_HANDLE;
	public static final VarHandle MAX_BYTES_PER_PASS_HANDLE;
	public static final VarHandle MAX_ALLOCATIONS_PER_PASS_HANDLE;
	public static final VarHandle PFN_BREAK_CALLBACK_HANDLE;
	public static final VarHandle P_BREAK_CALLBACK_USER_DATA_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long POOL_BYTE_OFFSET;
	public static final long MAX_BYTES_PER_PASS_BYTE_OFFSET;
	public static final long MAX_ALLOCATIONS_PER_PASS_BYTE_OFFSET;
	public static final long PFN_BREAK_CALLBACK_BYTE_OFFSET;
	public static final long P_BREAK_CALLBACK_USER_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pool"),
		    JAVA_LONG.withName("maxBytesPerPass"),
		    JAVA_INT.withName("maxAllocationsPerPass"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pfnBreakCallback"),
		    UNBOUNDED_ADDRESS.withName("pBreakCallbackUserData")
		).withName("VmaDefragmentationInfo").withByteAlignment(8);
		
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		POOL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pool"));
		MAX_BYTES_PER_PASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxBytesPerPass"));
		MAX_ALLOCATIONS_PER_PASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxAllocationsPerPass"));
		PFN_BREAK_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pfnBreakCallback"));
		P_BREAK_CALLBACK_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBreakCallbackUserData"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		POOL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pool"));
		MAX_BYTES_PER_PASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBytesPerPass"));
		MAX_ALLOCATIONS_PER_PASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxAllocationsPerPass"));
		PFN_BREAK_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pfnBreakCallback"));
		P_BREAK_CALLBACK_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBreakCallbackUserData"));
		//@formatter:on
	}

	public VmaDefragmentationInfo() {
	    this(Arena.ofAuto());
	}
	
	public VmaDefragmentationInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VmaDefragmentationInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #flags()
    public VmaDefragmentationInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    /// ```
    /// \brief Use combination of #VmaDefragmentationFlagBits.
    /// ```
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pool()
    public VmaDefragmentationInfo pool(VmaPool pool) {
    	POOL_HANDLE.set(segment, 0L, pool.memorySegment());
    	return this;
    }
    
    /// ```
    /// \brief Custom pool to be defragmented.
    /// 
    ///     If null then default pools will undergo defragmentation process.
    /// ```
    public @Nullable VmaPool pool() {
    	MemorySegment segment = (MemorySegment) POOL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VmaPool(segment);
    }
    
    /// @see #maxBytesPerPass()
    public VmaDefragmentationInfo maxBytesPerPass(long maxBytesPerPass) {
    	MAX_BYTES_PER_PASS_HANDLE.set(segment, 0L, maxBytesPerPass);
    	return this;
    }
    
    /// ```
    /// \brief Maximum numbers of bytes that can be copied during single pass, while moving allocations to different places.
    /// 
    ///     `0` means no limit.
    /// ```
    public long maxBytesPerPass() {
    	return (long) MAX_BYTES_PER_PASS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxAllocationsPerPass()
    public VmaDefragmentationInfo maxAllocationsPerPass(int maxAllocationsPerPass) {
    	MAX_ALLOCATIONS_PER_PASS_HANDLE.set(segment, 0L, maxAllocationsPerPass);
    	return this;
    }
    
    /// ```
    /// \brief Maximum number of allocations that can be moved during single pass to a different place.
    /// 
    ///     `0` means no limit.
    /// ```
    public int maxAllocationsPerPass() {
    	return (int) MAX_ALLOCATIONS_PER_PASS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pfnBreakCallback()
    public VmaDefragmentationInfo pfnBreakCallback(VmaCheckDefragmentationBreakFunction pfnBreakCallback) {
    	PFN_BREAK_CALLBACK_HANDLE.set(segment, 0L, pfnBreakCallback.memorySegment());
    	return this;
    }
    
    /// ```
    /// \brief Optional custom callback for stopping vmaBeginDefragmentation().
    /// 
    ///     Have to return true for breaking current defragmentation pass.
    /// ```
    public @Nullable VmaCheckDefragmentationBreakFunction pfnBreakCallback() {
    	MemorySegment segment = (MemorySegment) PFN_BREAK_CALLBACK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return VmaCheckDefragmentationBreakFunction.get(segment);
    }
    
    /// @see #pBreakCallbackUserData()
    public VmaDefragmentationInfo pBreakCallbackUserData(MemorySegment pBreakCallbackUserData) {
    	P_BREAK_CALLBACK_USER_DATA_HANDLE.set(segment, 0L, pBreakCallbackUserData);
    	return this;
    }
    
    /// ```
    /// \brief Optional data to pass to custom callback for stopping pass of defragmentation.
    /// ```
    public @Nullable MemorySegment pBreakCallbackUserData() {
    	MemorySegment segment = (MemorySegment) P_BREAK_CALLBACK_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VmaDefragmentationInfo set(VmaDefragmentationInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VmaDefragmentationInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaDefragmentationInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaDefragmentationInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VmaDefragmentationInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaDefragmentationInfo> array(SegmentAllocator allocator, VmaDefragmentationInfo... structs) {
        NativeStructArray<VmaDefragmentationInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VmaDefragmentationInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaDefragmentationInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaDefragmentationInfo(segment)
        );
    }

}