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

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;
import static volucris.bindings.core.FFMUtils.UNBOUNDED_ADDRESS;

/// ```
/// Parameters of an existing virtual allocation, returned by vmaGetVirtualAllocationInfo().
/// ```
public final class VmaVirtualAllocationInfo
		implements Struct<VmaVirtualAllocationInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle OFFSET_HANDLE;
	public static final VarHandle SIZE_HANDLE;
	public static final VarHandle P_USER_DATA_HANDLE;

	public static final long OFFSET_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;
	public static final long P_USER_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("offset"),
		    JAVA_LONG.withName("size"),
		    UNBOUNDED_ADDRESS.withName("pUserData")
		).withName("VmaVirtualAllocationInfo").withByteAlignment(8);
		
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		P_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUserData"));
		
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		P_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
		//@formatter:on
	}

	public VmaVirtualAllocationInfo() {
	    this(Arena.ofAuto());
	}
	
	public VmaVirtualAllocationInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VmaVirtualAllocationInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #offset()
    public VmaVirtualAllocationInfo offset(long offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    /// ```
    /// \brief Offset of the allocation.
    /// 
    ///     Offset at which the allocation was made.
    /// ```
    public long offset() {
    	return (long) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VmaVirtualAllocationInfo size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    /// ```
    /// \brief Size of the allocation.
    /// 
    ///     Same value as passed in VmaVirtualAllocationCreateInfo::size.
    /// ```
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pUserData()
    public VmaVirtualAllocationInfo pUserData(MemorySegment pUserData) {
    	P_USER_DATA_HANDLE.set(segment, 0L, pUserData);
    	return this;
    }
    
    /// ```
    /// \brief Custom pointer associated with the allocation.
    /// 
    ///     Same value as passed in VmaVirtualAllocationCreateInfo::pUserData or to vmaSetVirtualAllocationUserData().
    /// ```
    public @Nullable MemorySegment pUserData() {
    	MemorySegment segment = (MemorySegment) P_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VmaVirtualAllocationInfo set(VmaVirtualAllocationInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VmaVirtualAllocationInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaVirtualAllocationInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaVirtualAllocationInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaVirtualAllocationInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaVirtualAllocationInfo> array(Arena arena, VmaVirtualAllocationInfo... structs) {
        NativeStructArray<VmaVirtualAllocationInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaVirtualAllocationInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaVirtualAllocationInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaVirtualAllocationInfo(segment)
        );
    }

}