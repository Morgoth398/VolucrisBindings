/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPhysicalDeviceMemoryProperties2
		implements Struct<VkPhysicalDeviceMemoryProperties2> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MEMORY_PROPERTIES_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkPhysicalDeviceMemoryProperties memoryProperties;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkPhysicalDeviceMemoryProperties.LAYOUT.withName("memoryProperties")
        ).withName("VkPhysicalDeviceMemoryProperties2").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MEMORY_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryProperties"));
        //@formatter:on
    }

    public VkPhysicalDeviceMemoryProperties2() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceMemoryProperties2(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceMemoryProperties2(MemorySegment segment) {
        this.segment = segment;
    
        memoryProperties = new VkPhysicalDeviceMemoryProperties(segment.asSlice(MEMORY_PROPERTIES_BYTE_OFFSET, VkPhysicalDeviceMemoryProperties.LAYOUT));
    }

    /// @see #sType()
    public VkPhysicalDeviceMemoryProperties2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMemoryProperties2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #memoryProperties()
    public VkPhysicalDeviceMemoryProperties2 memoryProperties(Consumer<VkPhysicalDeviceMemoryProperties> consumer) {
    	consumer.accept(memoryProperties);
    	return this;
    }
    
    /// @see #memoryProperties()
    public VkPhysicalDeviceMemoryProperties2 memoryProperties(VkPhysicalDeviceMemoryProperties other) {
    	memoryProperties.set(other);
    	return this;
    }
    
    public VkPhysicalDeviceMemoryProperties memoryProperties() {
    	return memoryProperties;
    }
    
    @Override
    public VkPhysicalDeviceMemoryProperties2 set(VkPhysicalDeviceMemoryProperties2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMemoryProperties2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMemoryProperties2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMemoryProperties2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMemoryProperties2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMemoryProperties2> array(Arena arena, VkPhysicalDeviceMemoryProperties2... structs) {
        NativeStructArray<VkPhysicalDeviceMemoryProperties2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMemoryProperties2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMemoryProperties2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMemoryProperties2(segment)
        );
    }
    
}