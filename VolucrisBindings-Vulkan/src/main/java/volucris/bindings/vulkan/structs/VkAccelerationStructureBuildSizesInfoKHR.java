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

public final class VkAccelerationStructureBuildSizesInfoKHR
		implements Struct<VkAccelerationStructureBuildSizesInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle ACCELERATION_STRUCTURE_SIZE_HANDLE;
    public static final VarHandle UPDATE_SCRATCH_SIZE_HANDLE;
    public static final VarHandle BUILD_SCRATCH_SIZE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long ACCELERATION_STRUCTURE_SIZE_BYTE_OFFSET;
    public static final long UPDATE_SCRATCH_SIZE_BYTE_OFFSET;
    public static final long BUILD_SCRATCH_SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("accelerationStructureSize"),
            JAVA_LONG.withName("updateScratchSize"),
            JAVA_LONG.withName("buildScratchSize")
        ).withName("VkAccelerationStructureBuildSizesInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        ACCELERATION_STRUCTURE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructureSize"));
        UPDATE_SCRATCH_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("updateScratchSize"));
        BUILD_SCRATCH_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("buildScratchSize"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        ACCELERATION_STRUCTURE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureSize"));
        UPDATE_SCRATCH_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("updateScratchSize"));
        BUILD_SCRATCH_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("buildScratchSize"));
        //@formatter:on
    }

    public VkAccelerationStructureBuildSizesInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkAccelerationStructureBuildSizesInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkAccelerationStructureBuildSizesInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkAccelerationStructureBuildSizesInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureBuildSizesInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #accelerationStructureSize()
    public VkAccelerationStructureBuildSizesInfoKHR accelerationStructureSize(long accelerationStructureSize) {
    	ACCELERATION_STRUCTURE_SIZE_HANDLE.set(segment, 0L, accelerationStructureSize);
    	return this;
    }
    
    public long accelerationStructureSize() {
    	return (long) ACCELERATION_STRUCTURE_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #updateScratchSize()
    public VkAccelerationStructureBuildSizesInfoKHR updateScratchSize(long updateScratchSize) {
    	UPDATE_SCRATCH_SIZE_HANDLE.set(segment, 0L, updateScratchSize);
    	return this;
    }
    
    public long updateScratchSize() {
    	return (long) UPDATE_SCRATCH_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #buildScratchSize()
    public VkAccelerationStructureBuildSizesInfoKHR buildScratchSize(long buildScratchSize) {
    	BUILD_SCRATCH_SIZE_HANDLE.set(segment, 0L, buildScratchSize);
    	return this;
    }
    
    public long buildScratchSize() {
    	return (long) BUILD_SCRATCH_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAccelerationStructureBuildSizesInfoKHR set(VkAccelerationStructureBuildSizesInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureBuildSizesInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureBuildSizesInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureBuildSizesInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureBuildSizesInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureBuildSizesInfoKHR> array(Arena arena, VkAccelerationStructureBuildSizesInfoKHR... structs) {
        NativeStructArray<VkAccelerationStructureBuildSizesInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureBuildSizesInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureBuildSizesInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureBuildSizesInfoKHR(segment)
        );
    }
    
}