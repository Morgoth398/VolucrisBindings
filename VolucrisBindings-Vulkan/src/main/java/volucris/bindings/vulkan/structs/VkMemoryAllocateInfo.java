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

public final class VkMemoryAllocateInfo
		implements Struct<VkMemoryAllocateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle ALLOCATION_SIZE_HANDLE;
    public static final VarHandle MEMORY_TYPE_INDEX_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long ALLOCATION_SIZE_BYTE_OFFSET;
    public static final long MEMORY_TYPE_INDEX_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("allocationSize"),
            JAVA_INT.withName("memoryTypeIndex"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkMemoryAllocateInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        ALLOCATION_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("allocationSize"));
        MEMORY_TYPE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryTypeIndex"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        ALLOCATION_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationSize"));
        MEMORY_TYPE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeIndex"));
        //@formatter:on
    }

    public VkMemoryAllocateInfo() {
        this(Arena.ofAuto());
    }
    
    public VkMemoryAllocateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkMemoryAllocateInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkMemoryAllocateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMemoryAllocateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #allocationSize()
    public VkMemoryAllocateInfo allocationSize(long allocationSize) {
    	ALLOCATION_SIZE_HANDLE.set(segment, 0L, allocationSize);
    	return this;
    }
    
    public long allocationSize() {
    	return (long) ALLOCATION_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #memoryTypeIndex()
    public VkMemoryAllocateInfo memoryTypeIndex(int memoryTypeIndex) {
    	MEMORY_TYPE_INDEX_HANDLE.set(segment, 0L, memoryTypeIndex);
    	return this;
    }
    
    public int memoryTypeIndex() {
    	return (int) MEMORY_TYPE_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMemoryAllocateInfo set(VkMemoryAllocateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkMemoryAllocateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMemoryAllocateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMemoryAllocateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryAllocateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMemoryAllocateInfo> array(Arena arena, VkMemoryAllocateInfo... structs) {
        NativeStructArray<VkMemoryAllocateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryAllocateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMemoryAllocateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMemoryAllocateInfo(segment)
        );
    }
    
}