/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkPartitionedAccelerationStructureWritePartitionTranslationDataNV
		implements Struct<VkPartitionedAccelerationStructureWritePartitionTranslationDataNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle PARTITION_INDEX_HANDLE;
    public static final VarHandle PARTITION_TRANSLATION_HANDLE;

    public static final long PARTITION_INDEX_BYTE_OFFSET;
    public static final long PARTITION_TRANSLATION_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("partitionIndex"),
            MemoryLayout.sequenceLayout(3, JAVA_FLOAT).withName("partitionTranslation")
        ).withName("VkPartitionedAccelerationStructureWritePartitionTranslationDataNV").withByteAlignment(4);
        
        PARTITION_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("partitionIndex"));
        PARTITION_TRANSLATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("partitionTranslation"), PathElement.sequenceElement());
        
        PARTITION_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("partitionIndex"));
        PARTITION_TRANSLATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("partitionTranslation"));
        //@formatter:on
    }

    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV() {
        this(Arena.ofAuto());
    }
    
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #partitionIndex()
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionIndex(int partitionIndex) {
    	PARTITION_INDEX_HANDLE.set(segment, 0L, partitionIndex);
    	return this;
    }
    
    public int partitionIndex() {
    	return (int) PARTITION_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #partitionTranslation(int)
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionTranslation(float partitionTranslation, int index0) {
    	PARTITION_TRANSLATION_HANDLE.set(segment, 0L, index0, partitionTranslation);
    	return this;
    }
    
    public float partitionTranslation(int index0) {
    	return (float) PARTITION_TRANSLATION_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV set(VkPartitionedAccelerationStructureWritePartitionTranslationDataNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPartitionedAccelerationStructureWritePartitionTranslationDataNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPartitionedAccelerationStructureWritePartitionTranslationDataNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPartitionedAccelerationStructureWritePartitionTranslationDataNV> array(Arena arena, VkPartitionedAccelerationStructureWritePartitionTranslationDataNV... structs) {
        NativeStructArray<VkPartitionedAccelerationStructureWritePartitionTranslationDataNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPartitionedAccelerationStructureWritePartitionTranslationDataNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(segment)
        );
    }
    
}