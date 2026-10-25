/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
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

public final class VkCommandBufferInheritanceRenderingInfo
		implements Struct<VkCommandBufferInheritanceRenderingInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle VIEW_MASK_HANDLE;
	public static final VarHandle COLOR_ATTACHMENT_COUNT_HANDLE;
	public static final VarHandle P_COLOR_ATTACHMENT_FORMATS_HANDLE;
	public static final VarHandle DEPTH_ATTACHMENT_FORMAT_HANDLE;
	public static final VarHandle STENCIL_ATTACHMENT_FORMAT_HANDLE;
	public static final VarHandle RASTERIZATION_SAMPLES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long VIEW_MASK_BYTE_OFFSET;
	public static final long COLOR_ATTACHMENT_COUNT_BYTE_OFFSET;
	public static final long P_COLOR_ATTACHMENT_FORMATS_BYTE_OFFSET;
	public static final long DEPTH_ATTACHMENT_FORMAT_BYTE_OFFSET;
	public static final long STENCIL_ATTACHMENT_FORMAT_BYTE_OFFSET;
	public static final long RASTERIZATION_SAMPLES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("viewMask"),
		    JAVA_INT.withName("colorAttachmentCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pColorAttachmentFormats"),
		    JAVA_INT.withName("depthAttachmentFormat"),
		    JAVA_INT.withName("stencilAttachmentFormat"),
		    JAVA_INT.withName("rasterizationSamples"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkCommandBufferInheritanceRenderingInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		VIEW_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewMask"));
		COLOR_ATTACHMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("colorAttachmentCount"));
		P_COLOR_ATTACHMENT_FORMATS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pColorAttachmentFormats"));
		DEPTH_ATTACHMENT_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthAttachmentFormat"));
		STENCIL_ATTACHMENT_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stencilAttachmentFormat"));
		RASTERIZATION_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rasterizationSamples"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		VIEW_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewMask"));
		COLOR_ATTACHMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
		P_COLOR_ATTACHMENT_FORMATS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachmentFormats"));
		DEPTH_ATTACHMENT_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthAttachmentFormat"));
		STENCIL_ATTACHMENT_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stencilAttachmentFormat"));
		RASTERIZATION_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rasterizationSamples"));
		//@formatter:on
	}

	public VkCommandBufferInheritanceRenderingInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkCommandBufferInheritanceRenderingInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkCommandBufferInheritanceRenderingInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkCommandBufferInheritanceRenderingInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCommandBufferInheritanceRenderingInfo pNext(MemorySegment pNext) {
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
    public VkCommandBufferInheritanceRenderingInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #viewMask()
    public VkCommandBufferInheritanceRenderingInfo viewMask(int viewMask) {
    	VIEW_MASK_HANDLE.set(segment, 0L, viewMask);
    	return this;
    }
    
    public int viewMask() {
    	return (int) VIEW_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #colorAttachmentCount()
    public VkCommandBufferInheritanceRenderingInfo colorAttachmentCount(int colorAttachmentCount) {
    	COLOR_ATTACHMENT_COUNT_HANDLE.set(segment, 0L, colorAttachmentCount);
    	return this;
    }
    
    public int colorAttachmentCount() {
    	return (int) COLOR_ATTACHMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pColorAttachmentFormats()
    public VkCommandBufferInheritanceRenderingInfo pColorAttachmentFormats(NativeIntArray pColorAttachmentFormats) {
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
    public VkCommandBufferInheritanceRenderingInfo depthAttachmentFormat(int depthAttachmentFormat) {
    	DEPTH_ATTACHMENT_FORMAT_HANDLE.set(segment, 0L, depthAttachmentFormat);
    	return this;
    }
    
    public int depthAttachmentFormat() {
    	return (int) DEPTH_ATTACHMENT_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #stencilAttachmentFormat()
    public VkCommandBufferInheritanceRenderingInfo stencilAttachmentFormat(int stencilAttachmentFormat) {
    	STENCIL_ATTACHMENT_FORMAT_HANDLE.set(segment, 0L, stencilAttachmentFormat);
    	return this;
    }
    
    public int stencilAttachmentFormat() {
    	return (int) STENCIL_ATTACHMENT_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #rasterizationSamples()
    public VkCommandBufferInheritanceRenderingInfo rasterizationSamples(int rasterizationSamples) {
    	RASTERIZATION_SAMPLES_HANDLE.set(segment, 0L, rasterizationSamples);
    	return this;
    }
    
    public int rasterizationSamples() {
    	return (int) RASTERIZATION_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkCommandBufferInheritanceRenderingInfo set(VkCommandBufferInheritanceRenderingInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkCommandBufferInheritanceRenderingInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCommandBufferInheritanceRenderingInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCommandBufferInheritanceRenderingInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCommandBufferInheritanceRenderingInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCommandBufferInheritanceRenderingInfo> array(SegmentAllocator allocator, VkCommandBufferInheritanceRenderingInfo... structs) {
        NativeStructArray<VkCommandBufferInheritanceRenderingInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCommandBufferInheritanceRenderingInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCommandBufferInheritanceRenderingInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCommandBufferInheritanceRenderingInfo(segment)
        );
    }

}