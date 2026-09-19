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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkBindAccelerationStructureMemoryInfoNV
		implements Struct<VkBindAccelerationStructureMemoryInfoNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle ACCELERATION_STRUCTURE_HANDLE;
    public static final VarHandle MEMORY_HANDLE;
    public static final VarHandle MEMORY_OFFSET_HANDLE;
    public static final VarHandle DEVICE_INDEX_COUNT_HANDLE;
    public static final VarHandle P_DEVICE_INDICES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long ACCELERATION_STRUCTURE_BYTE_OFFSET;
    public static final long MEMORY_BYTE_OFFSET;
    public static final long MEMORY_OFFSET_BYTE_OFFSET;
    public static final long DEVICE_INDEX_COUNT_BYTE_OFFSET;
    public static final long P_DEVICE_INDICES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("accelerationStructure"),
            UNBOUNDED_ADDRESS.withName("memory"),
            JAVA_LONG.withName("memoryOffset"),
            JAVA_INT.withName("deviceIndexCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pDeviceIndices")
        ).withName("VkBindAccelerationStructureMemoryInfoNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        ACCELERATION_STRUCTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructure"));
        MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memory"));
        MEMORY_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryOffset"));
        DEVICE_INDEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceIndexCount"));
        P_DEVICE_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDeviceIndices"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        ACCELERATION_STRUCTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
        MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memory"));
        MEMORY_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
        DEVICE_INDEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceIndexCount"));
        P_DEVICE_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDeviceIndices"));
        //@formatter:on
    }

    public VkBindAccelerationStructureMemoryInfoNV() {
        this(Arena.ofAuto());
    }
    
    public VkBindAccelerationStructureMemoryInfoNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkBindAccelerationStructureMemoryInfoNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkBindAccelerationStructureMemoryInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBindAccelerationStructureMemoryInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #accelerationStructure()
    public VkBindAccelerationStructureMemoryInfoNV accelerationStructure(VkAccelerationStructureNV accelerationStructure) {
    	ACCELERATION_STRUCTURE_HANDLE.set(segment, 0L, accelerationStructure.memorySegment());
    	return this;
    }
    
    public @Nullable VkAccelerationStructureNV accelerationStructure() {
    	MemorySegment segment = (MemorySegment) ACCELERATION_STRUCTURE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkAccelerationStructureNV(segment);
    }
    
    /// @see #memory()
    public VkBindAccelerationStructureMemoryInfoNV memory(VkDeviceMemory memory) {
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
    public VkBindAccelerationStructureMemoryInfoNV memoryOffset(long memoryOffset) {
    	MEMORY_OFFSET_HANDLE.set(segment, 0L, memoryOffset);
    	return this;
    }
    
    public long memoryOffset() {
    	return (long) MEMORY_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceIndexCount()
    public VkBindAccelerationStructureMemoryInfoNV deviceIndexCount(int deviceIndexCount) {
    	DEVICE_INDEX_COUNT_HANDLE.set(segment, 0L, deviceIndexCount);
    	return this;
    }
    
    public int deviceIndexCount() {
    	return (int) DEVICE_INDEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDeviceIndices()
    public VkBindAccelerationStructureMemoryInfoNV pDeviceIndices(NativeIntArray pDeviceIndices) {
    	P_DEVICE_INDICES_HANDLE.set(segment, 0L, pDeviceIndices.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pDeviceIndices() {
    	MemorySegment segment = (MemorySegment) P_DEVICE_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkBindAccelerationStructureMemoryInfoNV set(VkBindAccelerationStructureMemoryInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindAccelerationStructureMemoryInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindAccelerationStructureMemoryInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindAccelerationStructureMemoryInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindAccelerationStructureMemoryInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindAccelerationStructureMemoryInfoNV> array(Arena arena, VkBindAccelerationStructureMemoryInfoNV... structs) {
        NativeStructArray<VkBindAccelerationStructureMemoryInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindAccelerationStructureMemoryInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindAccelerationStructureMemoryInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindAccelerationStructureMemoryInfoNV(segment)
        );
    }
    
}