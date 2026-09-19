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

public final class VkPipelineColorBlendStateCreateInfo
		implements Struct<VkPipelineColorBlendStateCreateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle LOGIC_OP_ENABLE_HANDLE;
    public static final VarHandle LOGIC_OP_HANDLE;
    public static final VarHandle ATTACHMENT_COUNT_HANDLE;
    public static final VarHandle P_ATTACHMENTS_HANDLE;
    public static final VarHandle BLEND_CONSTANTS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long LOGIC_OP_ENABLE_BYTE_OFFSET;
    public static final long LOGIC_OP_BYTE_OFFSET;
    public static final long ATTACHMENT_COUNT_BYTE_OFFSET;
    public static final long P_ATTACHMENTS_BYTE_OFFSET;
    public static final long BLEND_CONSTANTS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("logicOpEnable"),
            JAVA_INT.withName("logicOp"),
            JAVA_INT.withName("attachmentCount"),
            UNBOUNDED_ADDRESS.withName("pAttachments"),
            MemoryLayout.sequenceLayout(4, JAVA_FLOAT).withName("blendConstants")
        ).withName("VkPipelineColorBlendStateCreateInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        LOGIC_OP_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("logicOpEnable"));
        LOGIC_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("logicOp"));
        ATTACHMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attachmentCount"));
        P_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pAttachments"));
        BLEND_CONSTANTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blendConstants"), PathElement.sequenceElement());
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        LOGIC_OP_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("logicOpEnable"));
        LOGIC_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("logicOp"));
        ATTACHMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attachmentCount"));
        P_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pAttachments"));
        BLEND_CONSTANTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blendConstants"));
        //@formatter:on
    }

    public VkPipelineColorBlendStateCreateInfo() {
        this(Arena.ofAuto());
    }
    
    public VkPipelineColorBlendStateCreateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPipelineColorBlendStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPipelineColorBlendStateCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineColorBlendStateCreateInfo pNext(MemorySegment pNext) {
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
    public VkPipelineColorBlendStateCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #logicOpEnable()
    public VkPipelineColorBlendStateCreateInfo logicOpEnable(int logicOpEnable) {
    	LOGIC_OP_ENABLE_HANDLE.set(segment, 0L, logicOpEnable);
    	return this;
    }
    
    public int logicOpEnable() {
    	return (int) LOGIC_OP_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #logicOp()
    public VkPipelineColorBlendStateCreateInfo logicOp(int logicOp) {
    	LOGIC_OP_HANDLE.set(segment, 0L, logicOp);
    	return this;
    }
    
    public int logicOp() {
    	return (int) LOGIC_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #attachmentCount()
    public VkPipelineColorBlendStateCreateInfo attachmentCount(int attachmentCount) {
    	ATTACHMENT_COUNT_HANDLE.set(segment, 0L, attachmentCount);
    	return this;
    }
    
    public int attachmentCount() {
    	return (int) ATTACHMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pAttachments()
    public VkPipelineColorBlendStateCreateInfo pAttachments(NativeStructArray<VkPipelineColorBlendAttachmentState> pAttachments) {
    	P_ATTACHMENTS_HANDLE.set(segment, 0L, pAttachments.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkPipelineColorBlendAttachmentState> pAttachments() {
    	MemorySegment segment = (MemorySegment) P_ATTACHMENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkPipelineColorBlendAttachmentState.array(segment);
    }
    
    /// @see #blendConstants(int)
    public VkPipelineColorBlendStateCreateInfo blendConstants(float blendConstants, int index0) {
    	BLEND_CONSTANTS_HANDLE.set(segment, 0L, index0, blendConstants);
    	return this;
    }
    
    public float blendConstants(int index0) {
    	return (float) BLEND_CONSTANTS_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkPipelineColorBlendStateCreateInfo set(VkPipelineColorBlendStateCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineColorBlendStateCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineColorBlendStateCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineColorBlendStateCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineColorBlendStateCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineColorBlendStateCreateInfo> array(Arena arena, VkPipelineColorBlendStateCreateInfo... structs) {
        NativeStructArray<VkPipelineColorBlendStateCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineColorBlendStateCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineColorBlendStateCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineColorBlendStateCreateInfo(segment)
        );
    }
    
}