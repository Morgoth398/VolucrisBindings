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

public final class VkBindImageMemoryInfo
		implements Struct<VkBindImageMemoryInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle IMAGE_HANDLE;
    public static final VarHandle MEMORY_HANDLE;
    public static final VarHandle MEMORY_OFFSET_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long IMAGE_BYTE_OFFSET;
    public static final long MEMORY_BYTE_OFFSET;
    public static final long MEMORY_OFFSET_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("image"),
            UNBOUNDED_ADDRESS.withName("memory"),
            JAVA_LONG.withName("memoryOffset")
        ).withName("VkBindImageMemoryInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("image"));
        MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memory"));
        MEMORY_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryOffset"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("image"));
        MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memory"));
        MEMORY_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
        //@formatter:on
    }

    public VkBindImageMemoryInfo() {
        this(Arena.ofAuto());
    }
    
    public VkBindImageMemoryInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkBindImageMemoryInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkBindImageMemoryInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBindImageMemoryInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #image()
    public VkBindImageMemoryInfo image(VkImage image) {
    	IMAGE_HANDLE.set(segment, 0L, image.memorySegment());
    	return this;
    }
    
    public @Nullable VkImage image() {
    	MemorySegment segment = (MemorySegment) IMAGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImage(segment);
    }
    
    /// @see #memory()
    public VkBindImageMemoryInfo memory(VkDeviceMemory memory) {
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
    public VkBindImageMemoryInfo memoryOffset(long memoryOffset) {
    	MEMORY_OFFSET_HANDLE.set(segment, 0L, memoryOffset);
    	return this;
    }
    
    public long memoryOffset() {
    	return (long) MEMORY_OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkBindImageMemoryInfo set(VkBindImageMemoryInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindImageMemoryInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindImageMemoryInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindImageMemoryInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindImageMemoryInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindImageMemoryInfo> array(Arena arena, VkBindImageMemoryInfo... structs) {
        NativeStructArray<VkBindImageMemoryInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindImageMemoryInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindImageMemoryInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindImageMemoryInfo(segment)
        );
    }
    
}