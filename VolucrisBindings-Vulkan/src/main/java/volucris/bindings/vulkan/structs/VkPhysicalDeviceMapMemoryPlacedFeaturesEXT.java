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

public final class VkPhysicalDeviceMapMemoryPlacedFeaturesEXT
		implements Struct<VkPhysicalDeviceMapMemoryPlacedFeaturesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MEMORY_MAP_PLACED_HANDLE;
    public static final VarHandle MEMORY_MAP_RANGE_PLACED_HANDLE;
    public static final VarHandle MEMORY_UNMAP_RESERVE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MEMORY_MAP_PLACED_BYTE_OFFSET;
    public static final long MEMORY_MAP_RANGE_PLACED_BYTE_OFFSET;
    public static final long MEMORY_UNMAP_RESERVE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("memoryMapPlaced"),
            JAVA_INT.withName("memoryMapRangePlaced"),
            JAVA_INT.withName("memoryUnmapReserve"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceMapMemoryPlacedFeaturesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MEMORY_MAP_PLACED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryMapPlaced"));
        MEMORY_MAP_RANGE_PLACED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryMapRangePlaced"));
        MEMORY_UNMAP_RESERVE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryUnmapReserve"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MEMORY_MAP_PLACED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryMapPlaced"));
        MEMORY_MAP_RANGE_PLACED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryMapRangePlaced"));
        MEMORY_UNMAP_RESERVE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryUnmapReserve"));
        //@formatter:on
    }

    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #memoryMapPlaced()
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryMapPlaced(int memoryMapPlaced) {
    	MEMORY_MAP_PLACED_HANDLE.set(segment, 0L, memoryMapPlaced);
    	return this;
    }
    
    public int memoryMapPlaced() {
    	return (int) MEMORY_MAP_PLACED_HANDLE.get(segment, 0L);
    }
    
    /// @see #memoryMapRangePlaced()
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryMapRangePlaced(int memoryMapRangePlaced) {
    	MEMORY_MAP_RANGE_PLACED_HANDLE.set(segment, 0L, memoryMapRangePlaced);
    	return this;
    }
    
    public int memoryMapRangePlaced() {
    	return (int) MEMORY_MAP_RANGE_PLACED_HANDLE.get(segment, 0L);
    }
    
    /// @see #memoryUnmapReserve()
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryUnmapReserve(int memoryUnmapReserve) {
    	MEMORY_UNMAP_RESERVE_HANDLE.set(segment, 0L, memoryUnmapReserve);
    	return this;
    }
    
    public int memoryUnmapReserve() {
    	return (int) MEMORY_UNMAP_RESERVE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT set(VkPhysicalDeviceMapMemoryPlacedFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMapMemoryPlacedFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMapMemoryPlacedFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMapMemoryPlacedFeaturesEXT> array(Arena arena, VkPhysicalDeviceMapMemoryPlacedFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceMapMemoryPlacedFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMapMemoryPlacedFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(segment)
        );
    }
    
}