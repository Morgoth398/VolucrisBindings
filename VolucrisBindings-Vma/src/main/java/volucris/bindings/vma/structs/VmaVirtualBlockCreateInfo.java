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
import volucris.bindings.vulkan.structs.VkAllocationCallbacks;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;
import static volucris.bindings.core.FFMUtils.UNBOUNDED_ADDRESS;

/// ```
/// Parameters of created #VmaVirtualBlock object to be passed to vmaCreateVirtualBlock().
/// ```
public final class VmaVirtualBlockCreateInfo
		implements Struct<VmaVirtualBlockCreateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SIZE_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle P_ALLOCATION_CALLBACKS_HANDLE;

    public static final long SIZE_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long P_ALLOCATION_CALLBACKS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("size"),
            JAVA_INT.withName("flags"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pAllocationCallbacks")
        ).withName("VmaVirtualBlockCreateInfo").withByteAlignment(8);
        
        SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        P_ALLOCATION_CALLBACKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pAllocationCallbacks"));
        
        SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        P_ALLOCATION_CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pAllocationCallbacks"));
        //@formatter:on
    }

    public VmaVirtualBlockCreateInfo() {
        this(Arena.ofAuto());
    }
    
    public VmaVirtualBlockCreateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VmaVirtualBlockCreateInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #size()
    public VmaVirtualBlockCreateInfo size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    /// ```
    /// \brief Total size of the virtual block.
    /// 
    ///     Sizes can be expressed in bytes or any units you want as long as you are consistent in using them.
    ///     For example, if you allocate from some array of structures, 1 can mean single instance of entire structure.
    /// ```
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VmaVirtualBlockCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    /// ```
    /// \brief Use combination of #VmaVirtualBlockCreateFlagBits.
    /// ```
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pAllocationCallbacks()
    public VmaVirtualBlockCreateInfo pAllocationCallbacks(VkAllocationCallbacks pAllocationCallbacks) {
    	P_ALLOCATION_CALLBACKS_HANDLE.set(segment, 0L, pAllocationCallbacks.memorySegment());
    	return this;
    }
    
    /// ```
    /// \brief Custom CPU memory allocation callbacks. Optional.
    /// 
    ///     Optional, can be null. When specified, they will be used for all CPU-side memory allocations.
    /// ```
    public @Nullable VkAllocationCallbacks pAllocationCallbacks() {
    	MemorySegment segment = (MemorySegment) P_ALLOCATION_CALLBACKS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkAllocationCallbacks(segment);
    }
    
    @Override
    public VmaVirtualBlockCreateInfo set(VmaVirtualBlockCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VmaVirtualBlockCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaVirtualBlockCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaVirtualBlockCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaVirtualBlockCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaVirtualBlockCreateInfo> array(Arena arena, VmaVirtualBlockCreateInfo... structs) {
        NativeStructArray<VmaVirtualBlockCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaVirtualBlockCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaVirtualBlockCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaVirtualBlockCreateInfo(segment)
        );
    }
    
}