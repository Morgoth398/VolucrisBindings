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

public final class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT
		implements Struct<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_INDIRECT_PIPELINE_COUNT_HANDLE;
    public static final VarHandle MAX_INDIRECT_SHADER_OBJECT_COUNT_HANDLE;
    public static final VarHandle MAX_INDIRECT_SEQUENCE_COUNT_HANDLE;
    public static final VarHandle MAX_INDIRECT_COMMANDS_TOKEN_COUNT_HANDLE;
    public static final VarHandle MAX_INDIRECT_COMMANDS_TOKEN_OFFSET_HANDLE;
    public static final VarHandle MAX_INDIRECT_COMMANDS_INDIRECT_STRIDE_HANDLE;
    public static final VarHandle SUPPORTED_INDIRECT_COMMANDS_INPUT_MODES_HANDLE;
    public static final VarHandle SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_HANDLE;
    public static final VarHandle SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_PIPELINE_BINDING_HANDLE;
    public static final VarHandle SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_SHADER_BINDING_HANDLE;
    public static final VarHandle DEVICE_GENERATED_COMMANDS_TRANSFORM_FEEDBACK_HANDLE;
    public static final VarHandle DEVICE_GENERATED_COMMANDS_MULTI_DRAW_INDIRECT_COUNT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_INDIRECT_PIPELINE_COUNT_BYTE_OFFSET;
    public static final long MAX_INDIRECT_SHADER_OBJECT_COUNT_BYTE_OFFSET;
    public static final long MAX_INDIRECT_SEQUENCE_COUNT_BYTE_OFFSET;
    public static final long MAX_INDIRECT_COMMANDS_TOKEN_COUNT_BYTE_OFFSET;
    public static final long MAX_INDIRECT_COMMANDS_TOKEN_OFFSET_BYTE_OFFSET;
    public static final long MAX_INDIRECT_COMMANDS_INDIRECT_STRIDE_BYTE_OFFSET;
    public static final long SUPPORTED_INDIRECT_COMMANDS_INPUT_MODES_BYTE_OFFSET;
    public static final long SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_BYTE_OFFSET;
    public static final long SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_PIPELINE_BINDING_BYTE_OFFSET;
    public static final long SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_SHADER_BINDING_BYTE_OFFSET;
    public static final long DEVICE_GENERATED_COMMANDS_TRANSFORM_FEEDBACK_BYTE_OFFSET;
    public static final long DEVICE_GENERATED_COMMANDS_MULTI_DRAW_INDIRECT_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxIndirectPipelineCount"),
            JAVA_INT.withName("maxIndirectShaderObjectCount"),
            JAVA_INT.withName("maxIndirectSequenceCount"),
            JAVA_INT.withName("maxIndirectCommandsTokenCount"),
            JAVA_INT.withName("maxIndirectCommandsTokenOffset"),
            JAVA_INT.withName("maxIndirectCommandsIndirectStride"),
            JAVA_INT.withName("supportedIndirectCommandsInputModes"),
            JAVA_INT.withName("supportedIndirectCommandsShaderStages"),
            JAVA_INT.withName("supportedIndirectCommandsShaderStagesPipelineBinding"),
            JAVA_INT.withName("supportedIndirectCommandsShaderStagesShaderBinding"),
            JAVA_INT.withName("deviceGeneratedCommandsTransformFeedback"),
            JAVA_INT.withName("deviceGeneratedCommandsMultiDrawIndirectCount")
        ).withName("VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_INDIRECT_PIPELINE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxIndirectPipelineCount"));
        MAX_INDIRECT_SHADER_OBJECT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxIndirectShaderObjectCount"));
        MAX_INDIRECT_SEQUENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxIndirectSequenceCount"));
        MAX_INDIRECT_COMMANDS_TOKEN_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxIndirectCommandsTokenCount"));
        MAX_INDIRECT_COMMANDS_TOKEN_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
        MAX_INDIRECT_COMMANDS_INDIRECT_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxIndirectCommandsIndirectStride"));
        SUPPORTED_INDIRECT_COMMANDS_INPUT_MODES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedIndirectCommandsInputModes"));
        SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedIndirectCommandsShaderStages"));
        SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_PIPELINE_BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedIndirectCommandsShaderStagesPipelineBinding"));
        SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_SHADER_BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedIndirectCommandsShaderStagesShaderBinding"));
        DEVICE_GENERATED_COMMANDS_TRANSFORM_FEEDBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceGeneratedCommandsTransformFeedback"));
        DEVICE_GENERATED_COMMANDS_MULTI_DRAW_INDIRECT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceGeneratedCommandsMultiDrawIndirectCount"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_INDIRECT_PIPELINE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectPipelineCount"));
        MAX_INDIRECT_SHADER_OBJECT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectShaderObjectCount"));
        MAX_INDIRECT_SEQUENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectSequenceCount"));
        MAX_INDIRECT_COMMANDS_TOKEN_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsTokenCount"));
        MAX_INDIRECT_COMMANDS_TOKEN_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
        MAX_INDIRECT_COMMANDS_INDIRECT_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsIndirectStride"));
        SUPPORTED_INDIRECT_COMMANDS_INPUT_MODES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedIndirectCommandsInputModes"));
        SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedIndirectCommandsShaderStages"));
        SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_PIPELINE_BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedIndirectCommandsShaderStagesPipelineBinding"));
        SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_SHADER_BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedIndirectCommandsShaderStagesShaderBinding"));
        DEVICE_GENERATED_COMMANDS_TRANSFORM_FEEDBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedCommandsTransformFeedback"));
        DEVICE_GENERATED_COMMANDS_MULTI_DRAW_INDIRECT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedCommandsMultiDrawIndirectCount"));
        //@formatter:on
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxIndirectPipelineCount()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectPipelineCount(int maxIndirectPipelineCount) {
    	MAX_INDIRECT_PIPELINE_COUNT_HANDLE.set(segment, 0L, maxIndirectPipelineCount);
    	return this;
    }
    
    public int maxIndirectPipelineCount() {
    	return (int) MAX_INDIRECT_PIPELINE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxIndirectShaderObjectCount()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectShaderObjectCount(int maxIndirectShaderObjectCount) {
    	MAX_INDIRECT_SHADER_OBJECT_COUNT_HANDLE.set(segment, 0L, maxIndirectShaderObjectCount);
    	return this;
    }
    
    public int maxIndirectShaderObjectCount() {
    	return (int) MAX_INDIRECT_SHADER_OBJECT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxIndirectSequenceCount()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectSequenceCount(int maxIndirectSequenceCount) {
    	MAX_INDIRECT_SEQUENCE_COUNT_HANDLE.set(segment, 0L, maxIndirectSequenceCount);
    	return this;
    }
    
    public int maxIndirectSequenceCount() {
    	return (int) MAX_INDIRECT_SEQUENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxIndirectCommandsTokenCount()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsTokenCount(int maxIndirectCommandsTokenCount) {
    	MAX_INDIRECT_COMMANDS_TOKEN_COUNT_HANDLE.set(segment, 0L, maxIndirectCommandsTokenCount);
    	return this;
    }
    
    public int maxIndirectCommandsTokenCount() {
    	return (int) MAX_INDIRECT_COMMANDS_TOKEN_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxIndirectCommandsTokenOffset()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsTokenOffset(int maxIndirectCommandsTokenOffset) {
    	MAX_INDIRECT_COMMANDS_TOKEN_OFFSET_HANDLE.set(segment, 0L, maxIndirectCommandsTokenOffset);
    	return this;
    }
    
    public int maxIndirectCommandsTokenOffset() {
    	return (int) MAX_INDIRECT_COMMANDS_TOKEN_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxIndirectCommandsIndirectStride()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsIndirectStride(int maxIndirectCommandsIndirectStride) {
    	MAX_INDIRECT_COMMANDS_INDIRECT_STRIDE_HANDLE.set(segment, 0L, maxIndirectCommandsIndirectStride);
    	return this;
    }
    
    public int maxIndirectCommandsIndirectStride() {
    	return (int) MAX_INDIRECT_COMMANDS_INDIRECT_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedIndirectCommandsInputModes()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsInputModes(int supportedIndirectCommandsInputModes) {
    	SUPPORTED_INDIRECT_COMMANDS_INPUT_MODES_HANDLE.set(segment, 0L, supportedIndirectCommandsInputModes);
    	return this;
    }
    
    public int supportedIndirectCommandsInputModes() {
    	return (int) SUPPORTED_INDIRECT_COMMANDS_INPUT_MODES_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedIndirectCommandsShaderStages()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStages(int supportedIndirectCommandsShaderStages) {
    	SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_HANDLE.set(segment, 0L, supportedIndirectCommandsShaderStages);
    	return this;
    }
    
    public int supportedIndirectCommandsShaderStages() {
    	return (int) SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedIndirectCommandsShaderStagesPipelineBinding()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStagesPipelineBinding(int supportedIndirectCommandsShaderStagesPipelineBinding) {
    	SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_PIPELINE_BINDING_HANDLE.set(segment, 0L, supportedIndirectCommandsShaderStagesPipelineBinding);
    	return this;
    }
    
    public int supportedIndirectCommandsShaderStagesPipelineBinding() {
    	return (int) SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_PIPELINE_BINDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedIndirectCommandsShaderStagesShaderBinding()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStagesShaderBinding(int supportedIndirectCommandsShaderStagesShaderBinding) {
    	SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_SHADER_BINDING_HANDLE.set(segment, 0L, supportedIndirectCommandsShaderStagesShaderBinding);
    	return this;
    }
    
    public int supportedIndirectCommandsShaderStagesShaderBinding() {
    	return (int) SUPPORTED_INDIRECT_COMMANDS_SHADER_STAGES_SHADER_BINDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceGeneratedCommandsTransformFeedback()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT deviceGeneratedCommandsTransformFeedback(int deviceGeneratedCommandsTransformFeedback) {
    	DEVICE_GENERATED_COMMANDS_TRANSFORM_FEEDBACK_HANDLE.set(segment, 0L, deviceGeneratedCommandsTransformFeedback);
    	return this;
    }
    
    public int deviceGeneratedCommandsTransformFeedback() {
    	return (int) DEVICE_GENERATED_COMMANDS_TRANSFORM_FEEDBACK_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceGeneratedCommandsMultiDrawIndirectCount()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT deviceGeneratedCommandsMultiDrawIndirectCount(int deviceGeneratedCommandsMultiDrawIndirectCount) {
    	DEVICE_GENERATED_COMMANDS_MULTI_DRAW_INDIRECT_COUNT_HANDLE.set(segment, 0L, deviceGeneratedCommandsMultiDrawIndirectCount);
    	return this;
    }
    
    public int deviceGeneratedCommandsMultiDrawIndirectCount() {
    	return (int) DEVICE_GENERATED_COMMANDS_MULTI_DRAW_INDIRECT_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT set(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT> array(Arena arena, VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(segment)
        );
    }
    
}