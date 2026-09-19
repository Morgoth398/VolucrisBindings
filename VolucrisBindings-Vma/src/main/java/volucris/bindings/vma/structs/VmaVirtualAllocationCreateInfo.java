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
/// Parameters of created virtual allocation to be passed to vmaVirtualAllocate().
/// ```
public final class VmaVirtualAllocationCreateInfo
		implements Struct<VmaVirtualAllocationCreateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SIZE_HANDLE;
    public static final VarHandle ALIGNMENT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle P_USER_DATA_HANDLE;

    public static final long SIZE_BYTE_OFFSET;
    public static final long ALIGNMENT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long P_USER_DATA_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("size"),
            JAVA_LONG.withName("alignment"),
            JAVA_INT.withName("flags"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pUserData")
        ).withName("VmaVirtualAllocationCreateInfo").withByteAlignment(8);
        
        SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
        ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("alignment"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        P_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUserData"));
        
        SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
        ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("alignment"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        P_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
        //@formatter:on
    }

    public VmaVirtualAllocationCreateInfo() {
        this(Arena.ofAuto());
    }
    
    public VmaVirtualAllocationCreateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VmaVirtualAllocationCreateInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #size()
    public VmaVirtualAllocationCreateInfo size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    /// ```
    /// \brief Size of the allocation.
    /// 
    ///     Cannot be zero.
    /// ```
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #alignment()
    public VmaVirtualAllocationCreateInfo alignment(long alignment) {
    	ALIGNMENT_HANDLE.set(segment, 0L, alignment);
    	return this;
    }
    
    /// ```
    /// \brief Required alignment of the allocation. Optional.
    /// 
    ///     Must be power of two. Special value 0 has the same meaning as 1 - means no special alignment is required, so allocation can start at any offset.
    /// ```
    public long alignment() {
    	return (long) ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VmaVirtualAllocationCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    /// ```
    /// \brief Use combination of #VmaVirtualAllocationCreateFlagBits.
    /// ```
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pUserData()
    public VmaVirtualAllocationCreateInfo pUserData(MemorySegment pUserData) {
    	P_USER_DATA_HANDLE.set(segment, 0L, pUserData);
    	return this;
    }
    
    /// ```
    /// \brief Custom pointer to be associated with the allocation. Optional.
    /// 
    ///     It can be any value and can be used for user-defined purposes. It can be fetched or changed later.
    /// ```
    public @Nullable MemorySegment pUserData() {
    	MemorySegment segment = (MemorySegment) P_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VmaVirtualAllocationCreateInfo set(VmaVirtualAllocationCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VmaVirtualAllocationCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaVirtualAllocationCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaVirtualAllocationCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaVirtualAllocationCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaVirtualAllocationCreateInfo> array(Arena arena, VmaVirtualAllocationCreateInfo... structs) {
        NativeStructArray<VmaVirtualAllocationCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaVirtualAllocationCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaVirtualAllocationCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaVirtualAllocationCreateInfo(segment)
        );
    }
    
}