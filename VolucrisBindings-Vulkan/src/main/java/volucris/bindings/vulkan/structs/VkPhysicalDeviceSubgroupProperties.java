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

public final class VkPhysicalDeviceSubgroupProperties
		implements Struct<VkPhysicalDeviceSubgroupProperties> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SUBGROUP_SIZE_HANDLE;
    public static final VarHandle SUPPORTED_STAGES_HANDLE;
    public static final VarHandle SUPPORTED_OPERATIONS_HANDLE;
    public static final VarHandle QUAD_OPERATIONS_IN_ALL_STAGES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SUBGROUP_SIZE_BYTE_OFFSET;
    public static final long SUPPORTED_STAGES_BYTE_OFFSET;
    public static final long SUPPORTED_OPERATIONS_BYTE_OFFSET;
    public static final long QUAD_OPERATIONS_IN_ALL_STAGES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("subgroupSize"),
            JAVA_INT.withName("supportedStages"),
            JAVA_INT.withName("supportedOperations"),
            JAVA_INT.withName("quadOperationsInAllStages")
        ).withName("VkPhysicalDeviceSubgroupProperties").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SUBGROUP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subgroupSize"));
        SUPPORTED_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedStages"));
        SUPPORTED_OPERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedOperations"));
        QUAD_OPERATIONS_IN_ALL_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("quadOperationsInAllStages"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SUBGROUP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subgroupSize"));
        SUPPORTED_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedStages"));
        SUPPORTED_OPERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedOperations"));
        QUAD_OPERATIONS_IN_ALL_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("quadOperationsInAllStages"));
        //@formatter:on
    }

    public VkPhysicalDeviceSubgroupProperties() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceSubgroupProperties(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceSubgroupProperties(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceSubgroupProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceSubgroupProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #subgroupSize()
    public VkPhysicalDeviceSubgroupProperties subgroupSize(int subgroupSize) {
    	SUBGROUP_SIZE_HANDLE.set(segment, 0L, subgroupSize);
    	return this;
    }
    
    public int subgroupSize() {
    	return (int) SUBGROUP_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedStages()
    public VkPhysicalDeviceSubgroupProperties supportedStages(int supportedStages) {
    	SUPPORTED_STAGES_HANDLE.set(segment, 0L, supportedStages);
    	return this;
    }
    
    public int supportedStages() {
    	return (int) SUPPORTED_STAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedOperations()
    public VkPhysicalDeviceSubgroupProperties supportedOperations(int supportedOperations) {
    	SUPPORTED_OPERATIONS_HANDLE.set(segment, 0L, supportedOperations);
    	return this;
    }
    
    public int supportedOperations() {
    	return (int) SUPPORTED_OPERATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #quadOperationsInAllStages()
    public VkPhysicalDeviceSubgroupProperties quadOperationsInAllStages(int quadOperationsInAllStages) {
    	QUAD_OPERATIONS_IN_ALL_STAGES_HANDLE.set(segment, 0L, quadOperationsInAllStages);
    	return this;
    }
    
    public int quadOperationsInAllStages() {
    	return (int) QUAD_OPERATIONS_IN_ALL_STAGES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceSubgroupProperties set(VkPhysicalDeviceSubgroupProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceSubgroupProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceSubgroupProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceSubgroupProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceSubgroupProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceSubgroupProperties> array(Arena arena, VkPhysicalDeviceSubgroupProperties... structs) {
        NativeStructArray<VkPhysicalDeviceSubgroupProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceSubgroupProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceSubgroupProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceSubgroupProperties(segment)
        );
    }
    
}