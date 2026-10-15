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
import volucris.bindings.vma.VmaAllocateDeviceMemoryFunction;
import volucris.bindings.vma.VmaFreeDeviceMemoryFunction;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;
import static volucris.bindings.core.FFMUtils.UNBOUNDED_ADDRESS;

/// ```
/// \brief Set of callbacks that the library will call for `vkAllocateMemory` and `vkFreeMemory`.
/// 
/// Provided for informative purpose, e.g. to gather statistics about number of
/// allocations or total amount of memory allocated in Vulkan.
/// 
/// Used in VmaAllocatorCreateInfo::pDeviceMemoryCallbacks.
/// ```
public final class VmaDeviceMemoryCallbacks
		implements Struct<VmaDeviceMemoryCallbacks> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PFN_ALLOCATE_HANDLE;
	public static final VarHandle PFN_FREE_HANDLE;
	public static final VarHandle P_USER_DATA_HANDLE;

	public static final long PFN_ALLOCATE_BYTE_OFFSET;
	public static final long PFN_FREE_BYTE_OFFSET;
	public static final long P_USER_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pfnAllocate"),
		    UNBOUNDED_ADDRESS.withName("pfnFree"),
		    UNBOUNDED_ADDRESS.withName("pUserData")
		).withName("VmaDeviceMemoryCallbacks").withByteAlignment(8);
		
		PFN_ALLOCATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pfnAllocate"));
		PFN_FREE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pfnFree"));
		P_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUserData"));
		
		PFN_ALLOCATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pfnAllocate"));
		PFN_FREE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pfnFree"));
		P_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
		//@formatter:on
	}

	public VmaDeviceMemoryCallbacks() {
	    this(Arena.ofAuto());
	}
	
	public VmaDeviceMemoryCallbacks(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VmaDeviceMemoryCallbacks(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #pfnAllocate()
    public VmaDeviceMemoryCallbacks pfnAllocate(VmaAllocateDeviceMemoryFunction pfnAllocate) {
    	PFN_ALLOCATE_HANDLE.set(segment, 0L, pfnAllocate.memorySegment());
    	return this;
    }
    
    /// ```
    /// Optional, can be null.
    /// ```
    public @Nullable VmaAllocateDeviceMemoryFunction pfnAllocate() {
    	MemorySegment segment = (MemorySegment) PFN_ALLOCATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return VmaAllocateDeviceMemoryFunction.get(segment);
    }
    
    /// @see #pfnFree()
    public VmaDeviceMemoryCallbacks pfnFree(VmaFreeDeviceMemoryFunction pfnFree) {
    	PFN_FREE_HANDLE.set(segment, 0L, pfnFree.memorySegment());
    	return this;
    }
    
    /// ```
    /// Optional, can be null.
    /// ```
    public @Nullable VmaFreeDeviceMemoryFunction pfnFree() {
    	MemorySegment segment = (MemorySegment) PFN_FREE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return VmaFreeDeviceMemoryFunction.get(segment);
    }
    
    /// @see #pUserData()
    public VmaDeviceMemoryCallbacks pUserData(MemorySegment pUserData) {
    	P_USER_DATA_HANDLE.set(segment, 0L, pUserData);
    	return this;
    }
    
    /// ```
    /// Optional, can be null.
    /// ```
    public @Nullable MemorySegment pUserData() {
    	MemorySegment segment = (MemorySegment) P_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VmaDeviceMemoryCallbacks set(VmaDeviceMemoryCallbacks other) {
        return set(other.segment);
    }
    
    @Override
    public VmaDeviceMemoryCallbacks set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaDeviceMemoryCallbacks> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaDeviceMemoryCallbacks> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaDeviceMemoryCallbacks(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaDeviceMemoryCallbacks> array(Arena arena, VmaDeviceMemoryCallbacks... structs) {
        NativeStructArray<VmaDeviceMemoryCallbacks> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaDeviceMemoryCallbacks(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaDeviceMemoryCallbacks> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaDeviceMemoryCallbacks(segment)
        );
    }

}