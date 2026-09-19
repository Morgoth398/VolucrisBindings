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

public final class VkSparseMemoryBind
		implements Struct<VkSparseMemoryBind> {

    public static final StructLayout LAYOUT;

    public static final VarHandle RESOURCE_OFFSET_HANDLE;
    public static final VarHandle SIZE_HANDLE;
    public static final VarHandle MEMORY_HANDLE;
    public static final VarHandle MEMORY_OFFSET_HANDLE;
    public static final VarHandle FLAGS_HANDLE;

    public static final long RESOURCE_OFFSET_BYTE_OFFSET;
    public static final long SIZE_BYTE_OFFSET;
    public static final long MEMORY_BYTE_OFFSET;
    public static final long MEMORY_OFFSET_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("resourceOffset"),
            JAVA_LONG.withName("size"),
            UNBOUNDED_ADDRESS.withName("memory"),
            JAVA_LONG.withName("memoryOffset"),
            JAVA_INT.withName("flags"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkSparseMemoryBind").withByteAlignment(8);
        
        RESOURCE_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("resourceOffset"));
        SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
        MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memory"));
        MEMORY_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryOffset"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        
        RESOURCE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resourceOffset"));
        SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
        MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memory"));
        MEMORY_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        //@formatter:on
    }

    public VkSparseMemoryBind() {
        this(Arena.ofAuto());
    }
    
    public VkSparseMemoryBind(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSparseMemoryBind(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #resourceOffset()
    public VkSparseMemoryBind resourceOffset(long resourceOffset) {
    	RESOURCE_OFFSET_HANDLE.set(segment, 0L, resourceOffset);
    	return this;
    }
    
    public long resourceOffset() {
    	return (long) RESOURCE_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkSparseMemoryBind size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #memory()
    public VkSparseMemoryBind memory(VkDeviceMemory memory) {
    	MEMORY_HANDLE.set(segment, 0L, memory.memorySegment());
    	return this;
    }
    
    public @Nullable VkDeviceMemory memory() {
    	MemorySegment segment = (MemorySegment) MEMORY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDeviceMemory(segment);
    }
    
    /// @see #memoryOffset()
    public VkSparseMemoryBind memoryOffset(long memoryOffset) {
    	MEMORY_OFFSET_HANDLE.set(segment, 0L, memoryOffset);
    	return this;
    }
    
    public long memoryOffset() {
    	return (long) MEMORY_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkSparseMemoryBind flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSparseMemoryBind set(VkSparseMemoryBind other) {
        return set(other.segment);
    }
    
    @Override
    public VkSparseMemoryBind set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSparseMemoryBind> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSparseMemoryBind> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSparseMemoryBind(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSparseMemoryBind> array(Arena arena, VkSparseMemoryBind... structs) {
        NativeStructArray<VkSparseMemoryBind> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSparseMemoryBind(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSparseMemoryBind> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSparseMemoryBind(segment)
        );
    }
    
}