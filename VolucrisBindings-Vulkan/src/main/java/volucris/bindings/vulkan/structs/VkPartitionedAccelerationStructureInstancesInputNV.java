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

public final class VkPartitionedAccelerationStructureInstancesInputNV
		implements Struct<VkPartitionedAccelerationStructureInstancesInputNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle INSTANCE_COUNT_HANDLE;
    public static final VarHandle MAX_INSTANCE_PER_PARTITION_COUNT_HANDLE;
    public static final VarHandle PARTITION_COUNT_HANDLE;
    public static final VarHandle MAX_INSTANCE_IN_GLOBAL_PARTITION_COUNT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long INSTANCE_COUNT_BYTE_OFFSET;
    public static final long MAX_INSTANCE_PER_PARTITION_COUNT_BYTE_OFFSET;
    public static final long PARTITION_COUNT_BYTE_OFFSET;
    public static final long MAX_INSTANCE_IN_GLOBAL_PARTITION_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("instanceCount"),
            JAVA_INT.withName("maxInstancePerPartitionCount"),
            JAVA_INT.withName("partitionCount"),
            JAVA_INT.withName("maxInstanceInGlobalPartitionCount"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPartitionedAccelerationStructureInstancesInputNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        INSTANCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("instanceCount"));
        MAX_INSTANCE_PER_PARTITION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxInstancePerPartitionCount"));
        PARTITION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("partitionCount"));
        MAX_INSTANCE_IN_GLOBAL_PARTITION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxInstanceInGlobalPartitionCount"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        INSTANCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("instanceCount"));
        MAX_INSTANCE_PER_PARTITION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxInstancePerPartitionCount"));
        PARTITION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("partitionCount"));
        MAX_INSTANCE_IN_GLOBAL_PARTITION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxInstanceInGlobalPartitionCount"));
        //@formatter:on
    }

    public VkPartitionedAccelerationStructureInstancesInputNV() {
        this(Arena.ofAuto());
    }
    
    public VkPartitionedAccelerationStructureInstancesInputNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPartitionedAccelerationStructureInstancesInputNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPartitionedAccelerationStructureInstancesInputNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPartitionedAccelerationStructureInstancesInputNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkPartitionedAccelerationStructureInstancesInputNV flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #instanceCount()
    public VkPartitionedAccelerationStructureInstancesInputNV instanceCount(int instanceCount) {
    	INSTANCE_COUNT_HANDLE.set(segment, 0L, instanceCount);
    	return this;
    }
    
    public int instanceCount() {
    	return (int) INSTANCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxInstancePerPartitionCount()
    public VkPartitionedAccelerationStructureInstancesInputNV maxInstancePerPartitionCount(int maxInstancePerPartitionCount) {
    	MAX_INSTANCE_PER_PARTITION_COUNT_HANDLE.set(segment, 0L, maxInstancePerPartitionCount);
    	return this;
    }
    
    public int maxInstancePerPartitionCount() {
    	return (int) MAX_INSTANCE_PER_PARTITION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #partitionCount()
    public VkPartitionedAccelerationStructureInstancesInputNV partitionCount(int partitionCount) {
    	PARTITION_COUNT_HANDLE.set(segment, 0L, partitionCount);
    	return this;
    }
    
    public int partitionCount() {
    	return (int) PARTITION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxInstanceInGlobalPartitionCount()
    public VkPartitionedAccelerationStructureInstancesInputNV maxInstanceInGlobalPartitionCount(int maxInstanceInGlobalPartitionCount) {
    	MAX_INSTANCE_IN_GLOBAL_PARTITION_COUNT_HANDLE.set(segment, 0L, maxInstanceInGlobalPartitionCount);
    	return this;
    }
    
    public int maxInstanceInGlobalPartitionCount() {
    	return (int) MAX_INSTANCE_IN_GLOBAL_PARTITION_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPartitionedAccelerationStructureInstancesInputNV set(VkPartitionedAccelerationStructureInstancesInputNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPartitionedAccelerationStructureInstancesInputNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPartitionedAccelerationStructureInstancesInputNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPartitionedAccelerationStructureInstancesInputNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPartitionedAccelerationStructureInstancesInputNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPartitionedAccelerationStructureInstancesInputNV> array(Arena arena, VkPartitionedAccelerationStructureInstancesInputNV... structs) {
        NativeStructArray<VkPartitionedAccelerationStructureInstancesInputNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPartitionedAccelerationStructureInstancesInputNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPartitionedAccelerationStructureInstancesInputNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPartitionedAccelerationStructureInstancesInputNV(segment)
        );
    }
    
}