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

public final class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV
		implements Struct<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_GRAPHICS_SHADER_GROUP_COUNT_HANDLE;
    public static final VarHandle MAX_INDIRECT_SEQUENCE_COUNT_HANDLE;
    public static final VarHandle MAX_INDIRECT_COMMANDS_TOKEN_COUNT_HANDLE;
    public static final VarHandle MAX_INDIRECT_COMMANDS_STREAM_COUNT_HANDLE;
    public static final VarHandle MAX_INDIRECT_COMMANDS_TOKEN_OFFSET_HANDLE;
    public static final VarHandle MAX_INDIRECT_COMMANDS_STREAM_STRIDE_HANDLE;
    public static final VarHandle MIN_SEQUENCES_COUNT_BUFFER_OFFSET_ALIGNMENT_HANDLE;
    public static final VarHandle MIN_SEQUENCES_INDEX_BUFFER_OFFSET_ALIGNMENT_HANDLE;
    public static final VarHandle MIN_INDIRECT_COMMANDS_BUFFER_OFFSET_ALIGNMENT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_GRAPHICS_SHADER_GROUP_COUNT_BYTE_OFFSET;
    public static final long MAX_INDIRECT_SEQUENCE_COUNT_BYTE_OFFSET;
    public static final long MAX_INDIRECT_COMMANDS_TOKEN_COUNT_BYTE_OFFSET;
    public static final long MAX_INDIRECT_COMMANDS_STREAM_COUNT_BYTE_OFFSET;
    public static final long MAX_INDIRECT_COMMANDS_TOKEN_OFFSET_BYTE_OFFSET;
    public static final long MAX_INDIRECT_COMMANDS_STREAM_STRIDE_BYTE_OFFSET;
    public static final long MIN_SEQUENCES_COUNT_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET;
    public static final long MIN_SEQUENCES_INDEX_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET;
    public static final long MIN_INDIRECT_COMMANDS_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxGraphicsShaderGroupCount"),
            JAVA_INT.withName("maxIndirectSequenceCount"),
            JAVA_INT.withName("maxIndirectCommandsTokenCount"),
            JAVA_INT.withName("maxIndirectCommandsStreamCount"),
            JAVA_INT.withName("maxIndirectCommandsTokenOffset"),
            JAVA_INT.withName("maxIndirectCommandsStreamStride"),
            JAVA_INT.withName("minSequencesCountBufferOffsetAlignment"),
            JAVA_INT.withName("minSequencesIndexBufferOffsetAlignment"),
            JAVA_INT.withName("minIndirectCommandsBufferOffsetAlignment"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_GRAPHICS_SHADER_GROUP_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxGraphicsShaderGroupCount"));
        MAX_INDIRECT_SEQUENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxIndirectSequenceCount"));
        MAX_INDIRECT_COMMANDS_TOKEN_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxIndirectCommandsTokenCount"));
        MAX_INDIRECT_COMMANDS_STREAM_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxIndirectCommandsStreamCount"));
        MAX_INDIRECT_COMMANDS_TOKEN_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
        MAX_INDIRECT_COMMANDS_STREAM_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxIndirectCommandsStreamStride"));
        MIN_SEQUENCES_COUNT_BUFFER_OFFSET_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minSequencesCountBufferOffsetAlignment"));
        MIN_SEQUENCES_INDEX_BUFFER_OFFSET_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minSequencesIndexBufferOffsetAlignment"));
        MIN_INDIRECT_COMMANDS_BUFFER_OFFSET_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minIndirectCommandsBufferOffsetAlignment"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_GRAPHICS_SHADER_GROUP_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxGraphicsShaderGroupCount"));
        MAX_INDIRECT_SEQUENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectSequenceCount"));
        MAX_INDIRECT_COMMANDS_TOKEN_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsTokenCount"));
        MAX_INDIRECT_COMMANDS_STREAM_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsStreamCount"));
        MAX_INDIRECT_COMMANDS_TOKEN_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
        MAX_INDIRECT_COMMANDS_STREAM_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsStreamStride"));
        MIN_SEQUENCES_COUNT_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minSequencesCountBufferOffsetAlignment"));
        MIN_SEQUENCES_INDEX_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minSequencesIndexBufferOffsetAlignment"));
        MIN_INDIRECT_COMMANDS_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minIndirectCommandsBufferOffsetAlignment"));
        //@formatter:on
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxGraphicsShaderGroupCount()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxGraphicsShaderGroupCount(int maxGraphicsShaderGroupCount) {
    	MAX_GRAPHICS_SHADER_GROUP_COUNT_HANDLE.set(segment, 0L, maxGraphicsShaderGroupCount);
    	return this;
    }
    
    public int maxGraphicsShaderGroupCount() {
    	return (int) MAX_GRAPHICS_SHADER_GROUP_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxIndirectSequenceCount()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectSequenceCount(int maxIndirectSequenceCount) {
    	MAX_INDIRECT_SEQUENCE_COUNT_HANDLE.set(segment, 0L, maxIndirectSequenceCount);
    	return this;
    }
    
    public int maxIndirectSequenceCount() {
    	return (int) MAX_INDIRECT_SEQUENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxIndirectCommandsTokenCount()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsTokenCount(int maxIndirectCommandsTokenCount) {
    	MAX_INDIRECT_COMMANDS_TOKEN_COUNT_HANDLE.set(segment, 0L, maxIndirectCommandsTokenCount);
    	return this;
    }
    
    public int maxIndirectCommandsTokenCount() {
    	return (int) MAX_INDIRECT_COMMANDS_TOKEN_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxIndirectCommandsStreamCount()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsStreamCount(int maxIndirectCommandsStreamCount) {
    	MAX_INDIRECT_COMMANDS_STREAM_COUNT_HANDLE.set(segment, 0L, maxIndirectCommandsStreamCount);
    	return this;
    }
    
    public int maxIndirectCommandsStreamCount() {
    	return (int) MAX_INDIRECT_COMMANDS_STREAM_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxIndirectCommandsTokenOffset()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsTokenOffset(int maxIndirectCommandsTokenOffset) {
    	MAX_INDIRECT_COMMANDS_TOKEN_OFFSET_HANDLE.set(segment, 0L, maxIndirectCommandsTokenOffset);
    	return this;
    }
    
    public int maxIndirectCommandsTokenOffset() {
    	return (int) MAX_INDIRECT_COMMANDS_TOKEN_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxIndirectCommandsStreamStride()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsStreamStride(int maxIndirectCommandsStreamStride) {
    	MAX_INDIRECT_COMMANDS_STREAM_STRIDE_HANDLE.set(segment, 0L, maxIndirectCommandsStreamStride);
    	return this;
    }
    
    public int maxIndirectCommandsStreamStride() {
    	return (int) MAX_INDIRECT_COMMANDS_STREAM_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #minSequencesCountBufferOffsetAlignment()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minSequencesCountBufferOffsetAlignment(int minSequencesCountBufferOffsetAlignment) {
    	MIN_SEQUENCES_COUNT_BUFFER_OFFSET_ALIGNMENT_HANDLE.set(segment, 0L, minSequencesCountBufferOffsetAlignment);
    	return this;
    }
    
    public int minSequencesCountBufferOffsetAlignment() {
    	return (int) MIN_SEQUENCES_COUNT_BUFFER_OFFSET_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #minSequencesIndexBufferOffsetAlignment()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minSequencesIndexBufferOffsetAlignment(int minSequencesIndexBufferOffsetAlignment) {
    	MIN_SEQUENCES_INDEX_BUFFER_OFFSET_ALIGNMENT_HANDLE.set(segment, 0L, minSequencesIndexBufferOffsetAlignment);
    	return this;
    }
    
    public int minSequencesIndexBufferOffsetAlignment() {
    	return (int) MIN_SEQUENCES_INDEX_BUFFER_OFFSET_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #minIndirectCommandsBufferOffsetAlignment()
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minIndirectCommandsBufferOffsetAlignment(int minIndirectCommandsBufferOffsetAlignment) {
    	MIN_INDIRECT_COMMANDS_BUFFER_OFFSET_ALIGNMENT_HANDLE.set(segment, 0L, minIndirectCommandsBufferOffsetAlignment);
    	return this;
    }
    
    public int minIndirectCommandsBufferOffsetAlignment() {
    	return (int) MIN_INDIRECT_COMMANDS_BUFFER_OFFSET_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV set(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV> array(Arena arena, VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV... structs) {
        NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(segment)
        );
    }
    
}