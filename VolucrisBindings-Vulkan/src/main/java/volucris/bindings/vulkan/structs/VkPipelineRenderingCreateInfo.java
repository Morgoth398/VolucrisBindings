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

public final class VkPipelineRenderingCreateInfo
		implements Struct<VkPipelineRenderingCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VIEW_MASK_HANDLE;
	public static final VarHandle COLOR_ATTACHMENT_COUNT_HANDLE;
	public static final VarHandle P_COLOR_ATTACHMENT_FORMATS_HANDLE;
	public static final VarHandle DEPTH_ATTACHMENT_FORMAT_HANDLE;
	public static final VarHandle STENCIL_ATTACHMENT_FORMAT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VIEW_MASK_BYTE_OFFSET;
	public static final long COLOR_ATTACHMENT_COUNT_BYTE_OFFSET;
	public static final long P_COLOR_ATTACHMENT_FORMATS_BYTE_OFFSET;
	public static final long DEPTH_ATTACHMENT_FORMAT_BYTE_OFFSET;
	public static final long STENCIL_ATTACHMENT_FORMAT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("viewMask"),
		    JAVA_INT.withName("colorAttachmentCount"),
		    UNBOUNDED_ADDRESS.withName("pColorAttachmentFormats"),
		    JAVA_INT.withName("depthAttachmentFormat"),
		    JAVA_INT.withName("stencilAttachmentFormat")
		).withName("VkPipelineRenderingCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VIEW_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewMask"));
		COLOR_ATTACHMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("colorAttachmentCount"));
		P_COLOR_ATTACHMENT_FORMATS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pColorAttachmentFormats"));
		DEPTH_ATTACHMENT_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthAttachmentFormat"));
		STENCIL_ATTACHMENT_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stencilAttachmentFormat"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VIEW_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewMask"));
		COLOR_ATTACHMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
		P_COLOR_ATTACHMENT_FORMATS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachmentFormats"));
		DEPTH_ATTACHMENT_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthAttachmentFormat"));
		STENCIL_ATTACHMENT_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stencilAttachmentFormat"));
		//@formatter:on
	}

	public VkPipelineRenderingCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineRenderingCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineRenderingCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineRenderingCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineRenderingCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #viewMask()
    public VkPipelineRenderingCreateInfo viewMask(int viewMask) {
    	VIEW_MASK_HANDLE.set(segment, 0L, viewMask);
    	return this;
    }
    
    public int viewMask() {
    	return (int) VIEW_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #colorAttachmentCount()
    public VkPipelineRenderingCreateInfo colorAttachmentCount(int colorAttachmentCount) {
    	COLOR_ATTACHMENT_COUNT_HANDLE.set(segment, 0L, colorAttachmentCount);
    	return this;
    }
    
    public int colorAttachmentCount() {
    	return (int) COLOR_ATTACHMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pColorAttachmentFormats()
    public VkPipelineRenderingCreateInfo pColorAttachmentFormats(NativeIntArray pColorAttachmentFormats) {
    	P_COLOR_ATTACHMENT_FORMATS_HANDLE.set(segment, 0L, pColorAttachmentFormats.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pColorAttachmentFormats() {
    	MemorySegment segment = (MemorySegment) P_COLOR_ATTACHMENT_FORMATS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #depthAttachmentFormat()
    public VkPipelineRenderingCreateInfo depthAttachmentFormat(int depthAttachmentFormat) {
    	DEPTH_ATTACHMENT_FORMAT_HANDLE.set(segment, 0L, depthAttachmentFormat);
    	return this;
    }
    
    public int depthAttachmentFormat() {
    	return (int) DEPTH_ATTACHMENT_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #stencilAttachmentFormat()
    public VkPipelineRenderingCreateInfo stencilAttachmentFormat(int stencilAttachmentFormat) {
    	STENCIL_ATTACHMENT_FORMAT_HANDLE.set(segment, 0L, stencilAttachmentFormat);
    	return this;
    }
    
    public int stencilAttachmentFormat() {
    	return (int) STENCIL_ATTACHMENT_FORMAT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPipelineRenderingCreateInfo set(VkPipelineRenderingCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineRenderingCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineRenderingCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineRenderingCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineRenderingCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineRenderingCreateInfo> array(Arena arena, VkPipelineRenderingCreateInfo... structs) {
        NativeStructArray<VkPipelineRenderingCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineRenderingCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineRenderingCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineRenderingCreateInfo(segment)
        );
    }

}