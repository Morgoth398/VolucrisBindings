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

public final class VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR
		implements Struct<VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle INDIRECT_MEMORY_COPY_HANDLE;
    public static final VarHandle INDIRECT_MEMORY_TO_IMAGE_COPY_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long INDIRECT_MEMORY_COPY_BYTE_OFFSET;
    public static final long INDIRECT_MEMORY_TO_IMAGE_COPY_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("indirectMemoryCopy"),
            JAVA_INT.withName("indirectMemoryToImageCopy")
        ).withName("VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        INDIRECT_MEMORY_COPY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indirectMemoryCopy"));
        INDIRECT_MEMORY_TO_IMAGE_COPY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indirectMemoryToImageCopy"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        INDIRECT_MEMORY_COPY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indirectMemoryCopy"));
        INDIRECT_MEMORY_TO_IMAGE_COPY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indirectMemoryToImageCopy"));
        //@formatter:on
    }

    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #indirectMemoryCopy()
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR indirectMemoryCopy(int indirectMemoryCopy) {
    	INDIRECT_MEMORY_COPY_HANDLE.set(segment, 0L, indirectMemoryCopy);
    	return this;
    }
    
    public int indirectMemoryCopy() {
    	return (int) INDIRECT_MEMORY_COPY_HANDLE.get(segment, 0L);
    }
    
    /// @see #indirectMemoryToImageCopy()
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR indirectMemoryToImageCopy(int indirectMemoryToImageCopy) {
    	INDIRECT_MEMORY_TO_IMAGE_COPY_HANDLE.set(segment, 0L, indirectMemoryToImageCopy);
    	return this;
    }
    
    public int indirectMemoryToImageCopy() {
    	return (int) INDIRECT_MEMORY_TO_IMAGE_COPY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR set(VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR> array(Arena arena, VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(segment)
        );
    }
    
}