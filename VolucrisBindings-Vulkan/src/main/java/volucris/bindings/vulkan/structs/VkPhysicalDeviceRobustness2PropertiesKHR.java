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

public final class VkPhysicalDeviceRobustness2PropertiesKHR
		implements Struct<VkPhysicalDeviceRobustness2PropertiesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle ROBUST_STORAGE_BUFFER_ACCESS_SIZE_ALIGNMENT_HANDLE;
    public static final VarHandle ROBUST_UNIFORM_BUFFER_ACCESS_SIZE_ALIGNMENT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long ROBUST_STORAGE_BUFFER_ACCESS_SIZE_ALIGNMENT_BYTE_OFFSET;
    public static final long ROBUST_UNIFORM_BUFFER_ACCESS_SIZE_ALIGNMENT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("robustStorageBufferAccessSizeAlignment"),
            JAVA_LONG.withName("robustUniformBufferAccessSizeAlignment")
        ).withName("VkPhysicalDeviceRobustness2PropertiesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        ROBUST_STORAGE_BUFFER_ACCESS_SIZE_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("robustStorageBufferAccessSizeAlignment"));
        ROBUST_UNIFORM_BUFFER_ACCESS_SIZE_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("robustUniformBufferAccessSizeAlignment"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        ROBUST_STORAGE_BUFFER_ACCESS_SIZE_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("robustStorageBufferAccessSizeAlignment"));
        ROBUST_UNIFORM_BUFFER_ACCESS_SIZE_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("robustUniformBufferAccessSizeAlignment"));
        //@formatter:on
    }

    public VkPhysicalDeviceRobustness2PropertiesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceRobustness2PropertiesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceRobustness2PropertiesKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceRobustness2PropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceRobustness2PropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #robustStorageBufferAccessSizeAlignment()
    public VkPhysicalDeviceRobustness2PropertiesKHR robustStorageBufferAccessSizeAlignment(long robustStorageBufferAccessSizeAlignment) {
    	ROBUST_STORAGE_BUFFER_ACCESS_SIZE_ALIGNMENT_HANDLE.set(segment, 0L, robustStorageBufferAccessSizeAlignment);
    	return this;
    }
    
    public long robustStorageBufferAccessSizeAlignment() {
    	return (long) ROBUST_STORAGE_BUFFER_ACCESS_SIZE_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #robustUniformBufferAccessSizeAlignment()
    public VkPhysicalDeviceRobustness2PropertiesKHR robustUniformBufferAccessSizeAlignment(long robustUniformBufferAccessSizeAlignment) {
    	ROBUST_UNIFORM_BUFFER_ACCESS_SIZE_ALIGNMENT_HANDLE.set(segment, 0L, robustUniformBufferAccessSizeAlignment);
    	return this;
    }
    
    public long robustUniformBufferAccessSizeAlignment() {
    	return (long) ROBUST_UNIFORM_BUFFER_ACCESS_SIZE_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceRobustness2PropertiesKHR set(VkPhysicalDeviceRobustness2PropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceRobustness2PropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceRobustness2PropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceRobustness2PropertiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceRobustness2PropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceRobustness2PropertiesKHR> array(Arena arena, VkPhysicalDeviceRobustness2PropertiesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceRobustness2PropertiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceRobustness2PropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceRobustness2PropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceRobustness2PropertiesKHR(segment)
        );
    }
    
}