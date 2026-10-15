/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkAllocationCallbacks
		implements Struct<VkAllocationCallbacks> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_USER_DATA_HANDLE;
	public static final VarHandle PFN_ALLOCATION_HANDLE;
	public static final VarHandle PFN_REALLOCATION_HANDLE;
	public static final VarHandle PFN_FREE_HANDLE;
	public static final VarHandle PFN_INTERNAL_ALLOCATION_HANDLE;
	public static final VarHandle PFN_INTERNAL_FREE_HANDLE;

	public static final long P_USER_DATA_BYTE_OFFSET;
	public static final long PFN_ALLOCATION_BYTE_OFFSET;
	public static final long PFN_REALLOCATION_BYTE_OFFSET;
	public static final long PFN_FREE_BYTE_OFFSET;
	public static final long PFN_INTERNAL_ALLOCATION_BYTE_OFFSET;
	public static final long PFN_INTERNAL_FREE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pUserData"),
		    UNBOUNDED_ADDRESS.withName("pfnAllocation"),
		    UNBOUNDED_ADDRESS.withName("pfnReallocation"),
		    UNBOUNDED_ADDRESS.withName("pfnFree"),
		    UNBOUNDED_ADDRESS.withName("pfnInternalAllocation"),
		    UNBOUNDED_ADDRESS.withName("pfnInternalFree")
		).withName("VkAllocationCallbacks").withByteAlignment(8);
		
		P_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUserData"));
		PFN_ALLOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pfnAllocation"));
		PFN_REALLOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pfnReallocation"));
		PFN_FREE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pfnFree"));
		PFN_INTERNAL_ALLOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pfnInternalAllocation"));
		PFN_INTERNAL_FREE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pfnInternalFree"));
		
		P_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
		PFN_ALLOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pfnAllocation"));
		PFN_REALLOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pfnReallocation"));
		PFN_FREE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pfnFree"));
		PFN_INTERNAL_ALLOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pfnInternalAllocation"));
		PFN_INTERNAL_FREE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pfnInternalFree"));
		//@formatter:on
	}

	public VkAllocationCallbacks() {
	    this(Arena.ofAuto());
	}
	
	public VkAllocationCallbacks(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkAllocationCallbacks(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #pUserData()
    public VkAllocationCallbacks pUserData(MemorySegment pUserData) {
    	P_USER_DATA_HANDLE.set(segment, 0L, pUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pUserData() {
    	MemorySegment segment = (MemorySegment) P_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pfnAllocation()
    public VkAllocationCallbacks pfnAllocation(VkAllocationFunction pfnAllocation) {
    	PFN_ALLOCATION_HANDLE.set(segment, 0L, pfnAllocation.memorySegment());
    	return this;
    }
    
    public @Nullable VkAllocationFunction pfnAllocation() {
    	MemorySegment segment = (MemorySegment) PFN_ALLOCATION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return VkAllocationFunction.get(segment);
    }
    
    /// @see #pfnReallocation()
    public VkAllocationCallbacks pfnReallocation(VkReallocationFunction pfnReallocation) {
    	PFN_REALLOCATION_HANDLE.set(segment, 0L, pfnReallocation.memorySegment());
    	return this;
    }
    
    public @Nullable VkReallocationFunction pfnReallocation() {
    	MemorySegment segment = (MemorySegment) PFN_REALLOCATION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return VkReallocationFunction.get(segment);
    }
    
    /// @see #pfnFree()
    public VkAllocationCallbacks pfnFree(VkFreeFunction pfnFree) {
    	PFN_FREE_HANDLE.set(segment, 0L, pfnFree.memorySegment());
    	return this;
    }
    
    public @Nullable VkFreeFunction pfnFree() {
    	MemorySegment segment = (MemorySegment) PFN_FREE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return VkFreeFunction.get(segment);
    }
    
    /// @see #pfnInternalAllocation()
    public VkAllocationCallbacks pfnInternalAllocation(VkInternalAllocationNotification pfnInternalAllocation) {
    	PFN_INTERNAL_ALLOCATION_HANDLE.set(segment, 0L, pfnInternalAllocation.memorySegment());
    	return this;
    }
    
    public @Nullable VkInternalAllocationNotification pfnInternalAllocation() {
    	MemorySegment segment = (MemorySegment) PFN_INTERNAL_ALLOCATION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return VkInternalAllocationNotification.get(segment);
    }
    
    /// @see #pfnInternalFree()
    public VkAllocationCallbacks pfnInternalFree(VkInternalFreeNotification pfnInternalFree) {
    	PFN_INTERNAL_FREE_HANDLE.set(segment, 0L, pfnInternalFree.memorySegment());
    	return this;
    }
    
    public @Nullable VkInternalFreeNotification pfnInternalFree() {
    	MemorySegment segment = (MemorySegment) PFN_INTERNAL_FREE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return VkInternalFreeNotification.get(segment);
    }
    
    @Override
    public VkAllocationCallbacks set(VkAllocationCallbacks other) {
        return set(other.segment);
    }
    
    @Override
    public VkAllocationCallbacks set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAllocationCallbacks> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAllocationCallbacks> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAllocationCallbacks(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAllocationCallbacks> array(Arena arena, VkAllocationCallbacks... structs) {
        NativeStructArray<VkAllocationCallbacks> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAllocationCallbacks(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAllocationCallbacks> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAllocationCallbacks(segment)
        );
    }

}