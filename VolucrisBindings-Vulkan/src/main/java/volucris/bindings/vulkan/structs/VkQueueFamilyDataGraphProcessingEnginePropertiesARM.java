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

public final class VkQueueFamilyDataGraphProcessingEnginePropertiesARM
		implements Struct<VkQueueFamilyDataGraphProcessingEnginePropertiesARM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FOREIGN_SEMAPHORE_HANDLE_TYPES_HANDLE;
    public static final VarHandle FOREIGN_MEMORY_HANDLE_TYPES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FOREIGN_SEMAPHORE_HANDLE_TYPES_BYTE_OFFSET;
    public static final long FOREIGN_MEMORY_HANDLE_TYPES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("foreignSemaphoreHandleTypes"),
            JAVA_INT.withName("foreignMemoryHandleTypes")
        ).withName("VkQueueFamilyDataGraphProcessingEnginePropertiesARM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FOREIGN_SEMAPHORE_HANDLE_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("foreignSemaphoreHandleTypes"));
        FOREIGN_MEMORY_HANDLE_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("foreignMemoryHandleTypes"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FOREIGN_SEMAPHORE_HANDLE_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("foreignSemaphoreHandleTypes"));
        FOREIGN_MEMORY_HANDLE_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("foreignMemoryHandleTypes"));
        //@formatter:on
    }

    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM() {
        this(Arena.ofAuto());
    }
    
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #foreignSemaphoreHandleTypes()
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM foreignSemaphoreHandleTypes(int foreignSemaphoreHandleTypes) {
    	FOREIGN_SEMAPHORE_HANDLE_TYPES_HANDLE.set(segment, 0L, foreignSemaphoreHandleTypes);
    	return this;
    }
    
    public int foreignSemaphoreHandleTypes() {
    	return (int) FOREIGN_SEMAPHORE_HANDLE_TYPES_HANDLE.get(segment, 0L);
    }
    
    /// @see #foreignMemoryHandleTypes()
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM foreignMemoryHandleTypes(int foreignMemoryHandleTypes) {
    	FOREIGN_MEMORY_HANDLE_TYPES_HANDLE.set(segment, 0L, foreignMemoryHandleTypes);
    	return this;
    }
    
    public int foreignMemoryHandleTypes() {
    	return (int) FOREIGN_MEMORY_HANDLE_TYPES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM set(VkQueueFamilyDataGraphProcessingEnginePropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkQueueFamilyDataGraphProcessingEnginePropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkQueueFamilyDataGraphProcessingEnginePropertiesARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkQueueFamilyDataGraphProcessingEnginePropertiesARM> array(Arena arena, VkQueueFamilyDataGraphProcessingEnginePropertiesARM... structs) {
        NativeStructArray<VkQueueFamilyDataGraphProcessingEnginePropertiesARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkQueueFamilyDataGraphProcessingEnginePropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(segment)
        );
    }
    
}