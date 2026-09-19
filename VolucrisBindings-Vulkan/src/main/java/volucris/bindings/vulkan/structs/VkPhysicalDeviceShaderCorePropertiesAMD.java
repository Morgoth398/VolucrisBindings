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

public final class VkPhysicalDeviceShaderCorePropertiesAMD
		implements Struct<VkPhysicalDeviceShaderCorePropertiesAMD> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SHADER_ENGINE_COUNT_HANDLE;
    public static final VarHandle SHADER_ARRAYS_PER_ENGINE_COUNT_HANDLE;
    public static final VarHandle COMPUTE_UNITS_PER_SHADER_ARRAY_HANDLE;
    public static final VarHandle SIMD_PER_COMPUTE_UNIT_HANDLE;
    public static final VarHandle WAVEFRONTS_PER_SIMD_HANDLE;
    public static final VarHandle WAVEFRONT_SIZE_HANDLE;
    public static final VarHandle SGPRS_PER_SIMD_HANDLE;
    public static final VarHandle MIN_SGPR_ALLOCATION_HANDLE;
    public static final VarHandle MAX_SGPR_ALLOCATION_HANDLE;
    public static final VarHandle SGPR_ALLOCATION_GRANULARITY_HANDLE;
    public static final VarHandle VGPRS_PER_SIMD_HANDLE;
    public static final VarHandle MIN_VGPR_ALLOCATION_HANDLE;
    public static final VarHandle MAX_VGPR_ALLOCATION_HANDLE;
    public static final VarHandle VGPR_ALLOCATION_GRANULARITY_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SHADER_ENGINE_COUNT_BYTE_OFFSET;
    public static final long SHADER_ARRAYS_PER_ENGINE_COUNT_BYTE_OFFSET;
    public static final long COMPUTE_UNITS_PER_SHADER_ARRAY_BYTE_OFFSET;
    public static final long SIMD_PER_COMPUTE_UNIT_BYTE_OFFSET;
    public static final long WAVEFRONTS_PER_SIMD_BYTE_OFFSET;
    public static final long WAVEFRONT_SIZE_BYTE_OFFSET;
    public static final long SGPRS_PER_SIMD_BYTE_OFFSET;
    public static final long MIN_SGPR_ALLOCATION_BYTE_OFFSET;
    public static final long MAX_SGPR_ALLOCATION_BYTE_OFFSET;
    public static final long SGPR_ALLOCATION_GRANULARITY_BYTE_OFFSET;
    public static final long VGPRS_PER_SIMD_BYTE_OFFSET;
    public static final long MIN_VGPR_ALLOCATION_BYTE_OFFSET;
    public static final long MAX_VGPR_ALLOCATION_BYTE_OFFSET;
    public static final long VGPR_ALLOCATION_GRANULARITY_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("shaderEngineCount"),
            JAVA_INT.withName("shaderArraysPerEngineCount"),
            JAVA_INT.withName("computeUnitsPerShaderArray"),
            JAVA_INT.withName("simdPerComputeUnit"),
            JAVA_INT.withName("wavefrontsPerSimd"),
            JAVA_INT.withName("wavefrontSize"),
            JAVA_INT.withName("sgprsPerSimd"),
            JAVA_INT.withName("minSgprAllocation"),
            JAVA_INT.withName("maxSgprAllocation"),
            JAVA_INT.withName("sgprAllocationGranularity"),
            JAVA_INT.withName("vgprsPerSimd"),
            JAVA_INT.withName("minVgprAllocation"),
            JAVA_INT.withName("maxVgprAllocation"),
            JAVA_INT.withName("vgprAllocationGranularity")
        ).withName("VkPhysicalDeviceShaderCorePropertiesAMD").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SHADER_ENGINE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderEngineCount"));
        SHADER_ARRAYS_PER_ENGINE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderArraysPerEngineCount"));
        COMPUTE_UNITS_PER_SHADER_ARRAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("computeUnitsPerShaderArray"));
        SIMD_PER_COMPUTE_UNIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("simdPerComputeUnit"));
        WAVEFRONTS_PER_SIMD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("wavefrontsPerSimd"));
        WAVEFRONT_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("wavefrontSize"));
        SGPRS_PER_SIMD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sgprsPerSimd"));
        MIN_SGPR_ALLOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minSgprAllocation"));
        MAX_SGPR_ALLOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSgprAllocation"));
        SGPR_ALLOCATION_GRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sgprAllocationGranularity"));
        VGPRS_PER_SIMD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vgprsPerSimd"));
        MIN_VGPR_ALLOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minVgprAllocation"));
        MAX_VGPR_ALLOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxVgprAllocation"));
        VGPR_ALLOCATION_GRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vgprAllocationGranularity"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SHADER_ENGINE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderEngineCount"));
        SHADER_ARRAYS_PER_ENGINE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderArraysPerEngineCount"));
        COMPUTE_UNITS_PER_SHADER_ARRAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("computeUnitsPerShaderArray"));
        SIMD_PER_COMPUTE_UNIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("simdPerComputeUnit"));
        WAVEFRONTS_PER_SIMD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wavefrontsPerSimd"));
        WAVEFRONT_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wavefrontSize"));
        SGPRS_PER_SIMD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sgprsPerSimd"));
        MIN_SGPR_ALLOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minSgprAllocation"));
        MAX_SGPR_ALLOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSgprAllocation"));
        SGPR_ALLOCATION_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sgprAllocationGranularity"));
        VGPRS_PER_SIMD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vgprsPerSimd"));
        MIN_VGPR_ALLOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minVgprAllocation"));
        MAX_VGPR_ALLOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxVgprAllocation"));
        VGPR_ALLOCATION_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vgprAllocationGranularity"));
        //@formatter:on
    }

    public VkPhysicalDeviceShaderCorePropertiesAMD() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceShaderCorePropertiesAMD(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceShaderCorePropertiesAMD(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceShaderCorePropertiesAMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderCorePropertiesAMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderEngineCount()
    public VkPhysicalDeviceShaderCorePropertiesAMD shaderEngineCount(int shaderEngineCount) {
    	SHADER_ENGINE_COUNT_HANDLE.set(segment, 0L, shaderEngineCount);
    	return this;
    }
    
    public int shaderEngineCount() {
    	return (int) SHADER_ENGINE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderArraysPerEngineCount()
    public VkPhysicalDeviceShaderCorePropertiesAMD shaderArraysPerEngineCount(int shaderArraysPerEngineCount) {
    	SHADER_ARRAYS_PER_ENGINE_COUNT_HANDLE.set(segment, 0L, shaderArraysPerEngineCount);
    	return this;
    }
    
    public int shaderArraysPerEngineCount() {
    	return (int) SHADER_ARRAYS_PER_ENGINE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #computeUnitsPerShaderArray()
    public VkPhysicalDeviceShaderCorePropertiesAMD computeUnitsPerShaderArray(int computeUnitsPerShaderArray) {
    	COMPUTE_UNITS_PER_SHADER_ARRAY_HANDLE.set(segment, 0L, computeUnitsPerShaderArray);
    	return this;
    }
    
    public int computeUnitsPerShaderArray() {
    	return (int) COMPUTE_UNITS_PER_SHADER_ARRAY_HANDLE.get(segment, 0L);
    }
    
    /// @see #simdPerComputeUnit()
    public VkPhysicalDeviceShaderCorePropertiesAMD simdPerComputeUnit(int simdPerComputeUnit) {
    	SIMD_PER_COMPUTE_UNIT_HANDLE.set(segment, 0L, simdPerComputeUnit);
    	return this;
    }
    
    public int simdPerComputeUnit() {
    	return (int) SIMD_PER_COMPUTE_UNIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #wavefrontsPerSimd()
    public VkPhysicalDeviceShaderCorePropertiesAMD wavefrontsPerSimd(int wavefrontsPerSimd) {
    	WAVEFRONTS_PER_SIMD_HANDLE.set(segment, 0L, wavefrontsPerSimd);
    	return this;
    }
    
    public int wavefrontsPerSimd() {
    	return (int) WAVEFRONTS_PER_SIMD_HANDLE.get(segment, 0L);
    }
    
    /// @see #wavefrontSize()
    public VkPhysicalDeviceShaderCorePropertiesAMD wavefrontSize(int wavefrontSize) {
    	WAVEFRONT_SIZE_HANDLE.set(segment, 0L, wavefrontSize);
    	return this;
    }
    
    public int wavefrontSize() {
    	return (int) WAVEFRONT_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sgprsPerSimd()
    public VkPhysicalDeviceShaderCorePropertiesAMD sgprsPerSimd(int sgprsPerSimd) {
    	SGPRS_PER_SIMD_HANDLE.set(segment, 0L, sgprsPerSimd);
    	return this;
    }
    
    public int sgprsPerSimd() {
    	return (int) SGPRS_PER_SIMD_HANDLE.get(segment, 0L);
    }
    
    /// @see #minSgprAllocation()
    public VkPhysicalDeviceShaderCorePropertiesAMD minSgprAllocation(int minSgprAllocation) {
    	MIN_SGPR_ALLOCATION_HANDLE.set(segment, 0L, minSgprAllocation);
    	return this;
    }
    
    public int minSgprAllocation() {
    	return (int) MIN_SGPR_ALLOCATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSgprAllocation()
    public VkPhysicalDeviceShaderCorePropertiesAMD maxSgprAllocation(int maxSgprAllocation) {
    	MAX_SGPR_ALLOCATION_HANDLE.set(segment, 0L, maxSgprAllocation);
    	return this;
    }
    
    public int maxSgprAllocation() {
    	return (int) MAX_SGPR_ALLOCATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #sgprAllocationGranularity()
    public VkPhysicalDeviceShaderCorePropertiesAMD sgprAllocationGranularity(int sgprAllocationGranularity) {
    	SGPR_ALLOCATION_GRANULARITY_HANDLE.set(segment, 0L, sgprAllocationGranularity);
    	return this;
    }
    
    public int sgprAllocationGranularity() {
    	return (int) SGPR_ALLOCATION_GRANULARITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #vgprsPerSimd()
    public VkPhysicalDeviceShaderCorePropertiesAMD vgprsPerSimd(int vgprsPerSimd) {
    	VGPRS_PER_SIMD_HANDLE.set(segment, 0L, vgprsPerSimd);
    	return this;
    }
    
    public int vgprsPerSimd() {
    	return (int) VGPRS_PER_SIMD_HANDLE.get(segment, 0L);
    }
    
    /// @see #minVgprAllocation()
    public VkPhysicalDeviceShaderCorePropertiesAMD minVgprAllocation(int minVgprAllocation) {
    	MIN_VGPR_ALLOCATION_HANDLE.set(segment, 0L, minVgprAllocation);
    	return this;
    }
    
    public int minVgprAllocation() {
    	return (int) MIN_VGPR_ALLOCATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxVgprAllocation()
    public VkPhysicalDeviceShaderCorePropertiesAMD maxVgprAllocation(int maxVgprAllocation) {
    	MAX_VGPR_ALLOCATION_HANDLE.set(segment, 0L, maxVgprAllocation);
    	return this;
    }
    
    public int maxVgprAllocation() {
    	return (int) MAX_VGPR_ALLOCATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #vgprAllocationGranularity()
    public VkPhysicalDeviceShaderCorePropertiesAMD vgprAllocationGranularity(int vgprAllocationGranularity) {
    	VGPR_ALLOCATION_GRANULARITY_HANDLE.set(segment, 0L, vgprAllocationGranularity);
    	return this;
    }
    
    public int vgprAllocationGranularity() {
    	return (int) VGPR_ALLOCATION_GRANULARITY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderCorePropertiesAMD set(VkPhysicalDeviceShaderCorePropertiesAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderCorePropertiesAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderCorePropertiesAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderCorePropertiesAMD> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderCorePropertiesAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderCorePropertiesAMD> array(Arena arena, VkPhysicalDeviceShaderCorePropertiesAMD... structs) {
        NativeStructArray<VkPhysicalDeviceShaderCorePropertiesAMD> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderCorePropertiesAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderCorePropertiesAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderCorePropertiesAMD(segment)
        );
    }
    
}