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

public final class VkPhysicalDeviceTensorPropertiesARM
		implements Struct<VkPhysicalDeviceTensorPropertiesARM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_TENSOR_DIMENSION_COUNT_HANDLE;
    public static final VarHandle MAX_TENSOR_ELEMENTS_HANDLE;
    public static final VarHandle MAX_PER_DIMENSION_TENSOR_ELEMENTS_HANDLE;
    public static final VarHandle MAX_TENSOR_STRIDE_HANDLE;
    public static final VarHandle MAX_TENSOR_SIZE_HANDLE;
    public static final VarHandle MAX_TENSOR_SHADER_ACCESS_ARRAY_LENGTH_HANDLE;
    public static final VarHandle MAX_TENSOR_SHADER_ACCESS_SIZE_HANDLE;
    public static final VarHandle MAX_DESCRIPTOR_SET_STORAGE_TENSORS_HANDLE;
    public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_SET_STORAGE_TENSORS_HANDLE;
    public static final VarHandle MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_TENSORS_HANDLE;
    public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_TENSORS_HANDLE;
    public static final VarHandle SHADER_STORAGE_TENSOR_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE;
    public static final VarHandle SHADER_TENSOR_SUPPORTED_STAGES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_TENSOR_DIMENSION_COUNT_BYTE_OFFSET;
    public static final long MAX_TENSOR_ELEMENTS_BYTE_OFFSET;
    public static final long MAX_PER_DIMENSION_TENSOR_ELEMENTS_BYTE_OFFSET;
    public static final long MAX_TENSOR_STRIDE_BYTE_OFFSET;
    public static final long MAX_TENSOR_SIZE_BYTE_OFFSET;
    public static final long MAX_TENSOR_SHADER_ACCESS_ARRAY_LENGTH_BYTE_OFFSET;
    public static final long MAX_TENSOR_SHADER_ACCESS_SIZE_BYTE_OFFSET;
    public static final long MAX_DESCRIPTOR_SET_STORAGE_TENSORS_BYTE_OFFSET;
    public static final long MAX_PER_STAGE_DESCRIPTOR_SET_STORAGE_TENSORS_BYTE_OFFSET;
    public static final long MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_TENSORS_BYTE_OFFSET;
    public static final long MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_TENSORS_BYTE_OFFSET;
    public static final long SHADER_STORAGE_TENSOR_ARRAY_NON_UNIFORM_INDEXING_NATIVE_BYTE_OFFSET;
    public static final long SHADER_TENSOR_SUPPORTED_STAGES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxTensorDimensionCount"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("maxTensorElements"),
            JAVA_LONG.withName("maxPerDimensionTensorElements"),
            JAVA_LONG.withName("maxTensorStride"),
            JAVA_LONG.withName("maxTensorSize"),
            JAVA_INT.withName("maxTensorShaderAccessArrayLength"),
            JAVA_INT.withName("maxTensorShaderAccessSize"),
            JAVA_INT.withName("maxDescriptorSetStorageTensors"),
            JAVA_INT.withName("maxPerStageDescriptorSetStorageTensors"),
            JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageTensors"),
            JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindStorageTensors"),
            JAVA_INT.withName("shaderStorageTensorArrayNonUniformIndexingNative"),
            JAVA_INT.withName("shaderTensorSupportedStages")
        ).withName("VkPhysicalDeviceTensorPropertiesARM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_TENSOR_DIMENSION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTensorDimensionCount"));
        MAX_TENSOR_ELEMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTensorElements"));
        MAX_PER_DIMENSION_TENSOR_ELEMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerDimensionTensorElements"));
        MAX_TENSOR_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTensorStride"));
        MAX_TENSOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTensorSize"));
        MAX_TENSOR_SHADER_ACCESS_ARRAY_LENGTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTensorShaderAccessArrayLength"));
        MAX_TENSOR_SHADER_ACCESS_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTensorShaderAccessSize"));
        MAX_DESCRIPTOR_SET_STORAGE_TENSORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetStorageTensors"));
        MAX_PER_STAGE_DESCRIPTOR_SET_STORAGE_TENSORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorSetStorageTensors"));
        MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_TENSORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageTensors"));
        MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_TENSORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageTensors"));
        SHADER_STORAGE_TENSOR_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageTensorArrayNonUniformIndexingNative"));
        SHADER_TENSOR_SUPPORTED_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderTensorSupportedStages"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_TENSOR_DIMENSION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTensorDimensionCount"));
        MAX_TENSOR_ELEMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTensorElements"));
        MAX_PER_DIMENSION_TENSOR_ELEMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerDimensionTensorElements"));
        MAX_TENSOR_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTensorStride"));
        MAX_TENSOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTensorSize"));
        MAX_TENSOR_SHADER_ACCESS_ARRAY_LENGTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTensorShaderAccessArrayLength"));
        MAX_TENSOR_SHADER_ACCESS_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTensorShaderAccessSize"));
        MAX_DESCRIPTOR_SET_STORAGE_TENSORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetStorageTensors"));
        MAX_PER_STAGE_DESCRIPTOR_SET_STORAGE_TENSORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorSetStorageTensors"));
        MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_TENSORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageTensors"));
        MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_TENSORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageTensors"));
        SHADER_STORAGE_TENSOR_ARRAY_NON_UNIFORM_INDEXING_NATIVE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTensorArrayNonUniformIndexingNative"));
        SHADER_TENSOR_SUPPORTED_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderTensorSupportedStages"));
        //@formatter:on
    }

    public VkPhysicalDeviceTensorPropertiesARM() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceTensorPropertiesARM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceTensorPropertiesARM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceTensorPropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceTensorPropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxTensorDimensionCount()
    public VkPhysicalDeviceTensorPropertiesARM maxTensorDimensionCount(int maxTensorDimensionCount) {
    	MAX_TENSOR_DIMENSION_COUNT_HANDLE.set(segment, 0L, maxTensorDimensionCount);
    	return this;
    }
    
    public int maxTensorDimensionCount() {
    	return (int) MAX_TENSOR_DIMENSION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTensorElements()
    public VkPhysicalDeviceTensorPropertiesARM maxTensorElements(long maxTensorElements) {
    	MAX_TENSOR_ELEMENTS_HANDLE.set(segment, 0L, maxTensorElements);
    	return this;
    }
    
    public long maxTensorElements() {
    	return (long) MAX_TENSOR_ELEMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerDimensionTensorElements()
    public VkPhysicalDeviceTensorPropertiesARM maxPerDimensionTensorElements(long maxPerDimensionTensorElements) {
    	MAX_PER_DIMENSION_TENSOR_ELEMENTS_HANDLE.set(segment, 0L, maxPerDimensionTensorElements);
    	return this;
    }
    
    public long maxPerDimensionTensorElements() {
    	return (long) MAX_PER_DIMENSION_TENSOR_ELEMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTensorStride()
    public VkPhysicalDeviceTensorPropertiesARM maxTensorStride(long maxTensorStride) {
    	MAX_TENSOR_STRIDE_HANDLE.set(segment, 0L, maxTensorStride);
    	return this;
    }
    
    public long maxTensorStride() {
    	return (long) MAX_TENSOR_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTensorSize()
    public VkPhysicalDeviceTensorPropertiesARM maxTensorSize(long maxTensorSize) {
    	MAX_TENSOR_SIZE_HANDLE.set(segment, 0L, maxTensorSize);
    	return this;
    }
    
    public long maxTensorSize() {
    	return (long) MAX_TENSOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTensorShaderAccessArrayLength()
    public VkPhysicalDeviceTensorPropertiesARM maxTensorShaderAccessArrayLength(int maxTensorShaderAccessArrayLength) {
    	MAX_TENSOR_SHADER_ACCESS_ARRAY_LENGTH_HANDLE.set(segment, 0L, maxTensorShaderAccessArrayLength);
    	return this;
    }
    
    public int maxTensorShaderAccessArrayLength() {
    	return (int) MAX_TENSOR_SHADER_ACCESS_ARRAY_LENGTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTensorShaderAccessSize()
    public VkPhysicalDeviceTensorPropertiesARM maxTensorShaderAccessSize(int maxTensorShaderAccessSize) {
    	MAX_TENSOR_SHADER_ACCESS_SIZE_HANDLE.set(segment, 0L, maxTensorShaderAccessSize);
    	return this;
    }
    
    public int maxTensorShaderAccessSize() {
    	return (int) MAX_TENSOR_SHADER_ACCESS_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetStorageTensors()
    public VkPhysicalDeviceTensorPropertiesARM maxDescriptorSetStorageTensors(int maxDescriptorSetStorageTensors) {
    	MAX_DESCRIPTOR_SET_STORAGE_TENSORS_HANDLE.set(segment, 0L, maxDescriptorSetStorageTensors);
    	return this;
    }
    
    public int maxDescriptorSetStorageTensors() {
    	return (int) MAX_DESCRIPTOR_SET_STORAGE_TENSORS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorSetStorageTensors()
    public VkPhysicalDeviceTensorPropertiesARM maxPerStageDescriptorSetStorageTensors(int maxPerStageDescriptorSetStorageTensors) {
    	MAX_PER_STAGE_DESCRIPTOR_SET_STORAGE_TENSORS_HANDLE.set(segment, 0L, maxPerStageDescriptorSetStorageTensors);
    	return this;
    }
    
    public int maxPerStageDescriptorSetStorageTensors() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_SET_STORAGE_TENSORS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindStorageTensors()
    public VkPhysicalDeviceTensorPropertiesARM maxDescriptorSetUpdateAfterBindStorageTensors(int maxDescriptorSetUpdateAfterBindStorageTensors) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_TENSORS_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindStorageTensors);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindStorageTensors() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_TENSORS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUpdateAfterBindStorageTensors()
    public VkPhysicalDeviceTensorPropertiesARM maxPerStageDescriptorUpdateAfterBindStorageTensors(int maxPerStageDescriptorUpdateAfterBindStorageTensors) {
    	MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_TENSORS_HANDLE.set(segment, 0L, maxPerStageDescriptorUpdateAfterBindStorageTensors);
    	return this;
    }
    
    public int maxPerStageDescriptorUpdateAfterBindStorageTensors() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_TENSORS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageTensorArrayNonUniformIndexingNative()
    public VkPhysicalDeviceTensorPropertiesARM shaderStorageTensorArrayNonUniformIndexingNative(int shaderStorageTensorArrayNonUniformIndexingNative) {
    	SHADER_STORAGE_TENSOR_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.set(segment, 0L, shaderStorageTensorArrayNonUniformIndexingNative);
    	return this;
    }
    
    public int shaderStorageTensorArrayNonUniformIndexingNative() {
    	return (int) SHADER_STORAGE_TENSOR_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderTensorSupportedStages()
    public VkPhysicalDeviceTensorPropertiesARM shaderTensorSupportedStages(int shaderTensorSupportedStages) {
    	SHADER_TENSOR_SUPPORTED_STAGES_HANDLE.set(segment, 0L, shaderTensorSupportedStages);
    	return this;
    }
    
    public int shaderTensorSupportedStages() {
    	return (int) SHADER_TENSOR_SUPPORTED_STAGES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceTensorPropertiesARM set(VkPhysicalDeviceTensorPropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceTensorPropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceTensorPropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceTensorPropertiesARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceTensorPropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceTensorPropertiesARM> array(Arena arena, VkPhysicalDeviceTensorPropertiesARM... structs) {
        NativeStructArray<VkPhysicalDeviceTensorPropertiesARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceTensorPropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceTensorPropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceTensorPropertiesARM(segment)
        );
    }
    
}