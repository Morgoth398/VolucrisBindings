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

public final class VkPipelineColorBlendAttachmentState
		implements Struct<VkPipelineColorBlendAttachmentState> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BLEND_ENABLE_HANDLE;
    public static final VarHandle SRC_COLOR_BLEND_FACTOR_HANDLE;
    public static final VarHandle DST_COLOR_BLEND_FACTOR_HANDLE;
    public static final VarHandle COLOR_BLEND_OP_HANDLE;
    public static final VarHandle SRC_ALPHA_BLEND_FACTOR_HANDLE;
    public static final VarHandle DST_ALPHA_BLEND_FACTOR_HANDLE;
    public static final VarHandle ALPHA_BLEND_OP_HANDLE;
    public static final VarHandle COLOR_WRITE_MASK_HANDLE;

    public static final long BLEND_ENABLE_BYTE_OFFSET;
    public static final long SRC_COLOR_BLEND_FACTOR_BYTE_OFFSET;
    public static final long DST_COLOR_BLEND_FACTOR_BYTE_OFFSET;
    public static final long COLOR_BLEND_OP_BYTE_OFFSET;
    public static final long SRC_ALPHA_BLEND_FACTOR_BYTE_OFFSET;
    public static final long DST_ALPHA_BLEND_FACTOR_BYTE_OFFSET;
    public static final long ALPHA_BLEND_OP_BYTE_OFFSET;
    public static final long COLOR_WRITE_MASK_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("blendEnable"),
            JAVA_INT.withName("srcColorBlendFactor"),
            JAVA_INT.withName("dstColorBlendFactor"),
            JAVA_INT.withName("colorBlendOp"),
            JAVA_INT.withName("srcAlphaBlendFactor"),
            JAVA_INT.withName("dstAlphaBlendFactor"),
            JAVA_INT.withName("alphaBlendOp"),
            JAVA_INT.withName("colorWriteMask")
        ).withName("VkPipelineColorBlendAttachmentState").withByteAlignment(4);
        
        BLEND_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blendEnable"));
        SRC_COLOR_BLEND_FACTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcColorBlendFactor"));
        DST_COLOR_BLEND_FACTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstColorBlendFactor"));
        COLOR_BLEND_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("colorBlendOp"));
        SRC_ALPHA_BLEND_FACTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcAlphaBlendFactor"));
        DST_ALPHA_BLEND_FACTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstAlphaBlendFactor"));
        ALPHA_BLEND_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("alphaBlendOp"));
        COLOR_WRITE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("colorWriteMask"));
        
        BLEND_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blendEnable"));
        SRC_COLOR_BLEND_FACTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcColorBlendFactor"));
        DST_COLOR_BLEND_FACTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstColorBlendFactor"));
        COLOR_BLEND_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("colorBlendOp"));
        SRC_ALPHA_BLEND_FACTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcAlphaBlendFactor"));
        DST_ALPHA_BLEND_FACTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstAlphaBlendFactor"));
        ALPHA_BLEND_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("alphaBlendOp"));
        COLOR_WRITE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("colorWriteMask"));
        //@formatter:on
    }

    public VkPipelineColorBlendAttachmentState() {
        this(Arena.ofAuto());
    }
    
    public VkPipelineColorBlendAttachmentState(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPipelineColorBlendAttachmentState(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #blendEnable()
    public VkPipelineColorBlendAttachmentState blendEnable(int blendEnable) {
    	BLEND_ENABLE_HANDLE.set(segment, 0L, blendEnable);
    	return this;
    }
    
    public int blendEnable() {
    	return (int) BLEND_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcColorBlendFactor()
    public VkPipelineColorBlendAttachmentState srcColorBlendFactor(int srcColorBlendFactor) {
    	SRC_COLOR_BLEND_FACTOR_HANDLE.set(segment, 0L, srcColorBlendFactor);
    	return this;
    }
    
    public int srcColorBlendFactor() {
    	return (int) SRC_COLOR_BLEND_FACTOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstColorBlendFactor()
    public VkPipelineColorBlendAttachmentState dstColorBlendFactor(int dstColorBlendFactor) {
    	DST_COLOR_BLEND_FACTOR_HANDLE.set(segment, 0L, dstColorBlendFactor);
    	return this;
    }
    
    public int dstColorBlendFactor() {
    	return (int) DST_COLOR_BLEND_FACTOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #colorBlendOp()
    public VkPipelineColorBlendAttachmentState colorBlendOp(int colorBlendOp) {
    	COLOR_BLEND_OP_HANDLE.set(segment, 0L, colorBlendOp);
    	return this;
    }
    
    public int colorBlendOp() {
    	return (int) COLOR_BLEND_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcAlphaBlendFactor()
    public VkPipelineColorBlendAttachmentState srcAlphaBlendFactor(int srcAlphaBlendFactor) {
    	SRC_ALPHA_BLEND_FACTOR_HANDLE.set(segment, 0L, srcAlphaBlendFactor);
    	return this;
    }
    
    public int srcAlphaBlendFactor() {
    	return (int) SRC_ALPHA_BLEND_FACTOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstAlphaBlendFactor()
    public VkPipelineColorBlendAttachmentState dstAlphaBlendFactor(int dstAlphaBlendFactor) {
    	DST_ALPHA_BLEND_FACTOR_HANDLE.set(segment, 0L, dstAlphaBlendFactor);
    	return this;
    }
    
    public int dstAlphaBlendFactor() {
    	return (int) DST_ALPHA_BLEND_FACTOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #alphaBlendOp()
    public VkPipelineColorBlendAttachmentState alphaBlendOp(int alphaBlendOp) {
    	ALPHA_BLEND_OP_HANDLE.set(segment, 0L, alphaBlendOp);
    	return this;
    }
    
    public int alphaBlendOp() {
    	return (int) ALPHA_BLEND_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #colorWriteMask()
    public VkPipelineColorBlendAttachmentState colorWriteMask(int colorWriteMask) {
    	COLOR_WRITE_MASK_HANDLE.set(segment, 0L, colorWriteMask);
    	return this;
    }
    
    public int colorWriteMask() {
    	return (int) COLOR_WRITE_MASK_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPipelineColorBlendAttachmentState set(VkPipelineColorBlendAttachmentState other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineColorBlendAttachmentState set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineColorBlendAttachmentState> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineColorBlendAttachmentState> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineColorBlendAttachmentState(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineColorBlendAttachmentState> array(Arena arena, VkPipelineColorBlendAttachmentState... structs) {
        NativeStructArray<VkPipelineColorBlendAttachmentState> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineColorBlendAttachmentState(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineColorBlendAttachmentState> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineColorBlendAttachmentState(segment)
        );
    }
    
}