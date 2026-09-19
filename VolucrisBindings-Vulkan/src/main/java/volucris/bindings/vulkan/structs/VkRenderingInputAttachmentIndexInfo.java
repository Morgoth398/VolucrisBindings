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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkRenderingInputAttachmentIndexInfo
		implements Struct<VkRenderingInputAttachmentIndexInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle COLOR_ATTACHMENT_COUNT_HANDLE;
    public static final VarHandle P_COLOR_ATTACHMENT_INPUT_INDICES_HANDLE;
    public static final VarHandle P_DEPTH_INPUT_ATTACHMENT_INDEX_HANDLE;
    public static final VarHandle P_STENCIL_INPUT_ATTACHMENT_INDEX_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long COLOR_ATTACHMENT_COUNT_BYTE_OFFSET;
    public static final long P_COLOR_ATTACHMENT_INPUT_INDICES_BYTE_OFFSET;
    public static final long P_DEPTH_INPUT_ATTACHMENT_INDEX_BYTE_OFFSET;
    public static final long P_STENCIL_INPUT_ATTACHMENT_INDEX_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("colorAttachmentCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pColorAttachmentInputIndices"),
            UNBOUNDED_ADDRESS.withName("pDepthInputAttachmentIndex"),
            UNBOUNDED_ADDRESS.withName("pStencilInputAttachmentIndex")
        ).withName("VkRenderingInputAttachmentIndexInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        COLOR_ATTACHMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("colorAttachmentCount"));
        P_COLOR_ATTACHMENT_INPUT_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pColorAttachmentInputIndices"));
        P_DEPTH_INPUT_ATTACHMENT_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDepthInputAttachmentIndex"));
        P_STENCIL_INPUT_ATTACHMENT_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStencilInputAttachmentIndex"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        COLOR_ATTACHMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
        P_COLOR_ATTACHMENT_INPUT_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachmentInputIndices"));
        P_DEPTH_INPUT_ATTACHMENT_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDepthInputAttachmentIndex"));
        P_STENCIL_INPUT_ATTACHMENT_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStencilInputAttachmentIndex"));
        //@formatter:on
    }

    public VkRenderingInputAttachmentIndexInfo() {
        this(Arena.ofAuto());
    }
    
    public VkRenderingInputAttachmentIndexInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkRenderingInputAttachmentIndexInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkRenderingInputAttachmentIndexInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderingInputAttachmentIndexInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #colorAttachmentCount()
    public VkRenderingInputAttachmentIndexInfo colorAttachmentCount(int colorAttachmentCount) {
    	COLOR_ATTACHMENT_COUNT_HANDLE.set(segment, 0L, colorAttachmentCount);
    	return this;
    }
    
    public int colorAttachmentCount() {
    	return (int) COLOR_ATTACHMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pColorAttachmentInputIndices()
    public VkRenderingInputAttachmentIndexInfo pColorAttachmentInputIndices(NativeIntArray pColorAttachmentInputIndices) {
    	P_COLOR_ATTACHMENT_INPUT_INDICES_HANDLE.set(segment, 0L, pColorAttachmentInputIndices.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pColorAttachmentInputIndices() {
    	MemorySegment segment = (MemorySegment) P_COLOR_ATTACHMENT_INPUT_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #pDepthInputAttachmentIndex()
    public VkRenderingInputAttachmentIndexInfo pDepthInputAttachmentIndex(NativeIntArray pDepthInputAttachmentIndex) {
    	P_DEPTH_INPUT_ATTACHMENT_INDEX_HANDLE.set(segment, 0L, pDepthInputAttachmentIndex.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pDepthInputAttachmentIndex() {
    	MemorySegment segment = (MemorySegment) P_DEPTH_INPUT_ATTACHMENT_INDEX_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #pStencilInputAttachmentIndex()
    public VkRenderingInputAttachmentIndexInfo pStencilInputAttachmentIndex(NativeIntArray pStencilInputAttachmentIndex) {
    	P_STENCIL_INPUT_ATTACHMENT_INDEX_HANDLE.set(segment, 0L, pStencilInputAttachmentIndex.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pStencilInputAttachmentIndex() {
    	MemorySegment segment = (MemorySegment) P_STENCIL_INPUT_ATTACHMENT_INDEX_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkRenderingInputAttachmentIndexInfo set(VkRenderingInputAttachmentIndexInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderingInputAttachmentIndexInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderingInputAttachmentIndexInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderingInputAttachmentIndexInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderingInputAttachmentIndexInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderingInputAttachmentIndexInfo> array(Arena arena, VkRenderingInputAttachmentIndexInfo... structs) {
        NativeStructArray<VkRenderingInputAttachmentIndexInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderingInputAttachmentIndexInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderingInputAttachmentIndexInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderingInputAttachmentIndexInfo(segment)
        );
    }
    
}