/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkRenderingFragmentShadingRateAttachmentInfoKHR
		implements Struct<VkRenderingFragmentShadingRateAttachmentInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle IMAGE_VIEW_HANDLE;
	public static final VarHandle IMAGE_LAYOUT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long IMAGE_VIEW_BYTE_OFFSET;
	public static final long IMAGE_LAYOUT_BYTE_OFFSET;
	public static final long SHADING_RATE_ATTACHMENT_TEXEL_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D shadingRateAttachmentTexelSize;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("imageView"),
		    JAVA_INT.withName("imageLayout"),
		    VkExtent2D.LAYOUT.withName("shadingRateAttachmentTexelSize"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkRenderingFragmentShadingRateAttachmentInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		IMAGE_VIEW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageView"));
		IMAGE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageLayout"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		IMAGE_VIEW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
		IMAGE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageLayout"));
		SHADING_RATE_ATTACHMENT_TEXEL_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shadingRateAttachmentTexelSize"));
		//@formatter:on
	}

	public VkRenderingFragmentShadingRateAttachmentInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkRenderingFragmentShadingRateAttachmentInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkRenderingFragmentShadingRateAttachmentInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    shadingRateAttachmentTexelSize = new VkExtent2D(segment.asSlice(SHADING_RATE_ATTACHMENT_TEXEL_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #sType()
    public VkRenderingFragmentShadingRateAttachmentInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderingFragmentShadingRateAttachmentInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #imageView()
    public VkRenderingFragmentShadingRateAttachmentInfoKHR imageView(VkImageView imageView) {
    	IMAGE_VIEW_HANDLE.set(segment, 0L, imageView.memorySegment());
    	return this;
    }
    
    public @Nullable VkImageView imageView() {
    	MemorySegment segment = (MemorySegment) IMAGE_VIEW_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImageView(segment);
    }
    
    /// @see #imageLayout()
    public VkRenderingFragmentShadingRateAttachmentInfoKHR imageLayout(int imageLayout) {
    	IMAGE_LAYOUT_HANDLE.set(segment, 0L, imageLayout);
    	return this;
    }
    
    public int imageLayout() {
    	return (int) IMAGE_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #shadingRateAttachmentTexelSize()
    public VkRenderingFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(shadingRateAttachmentTexelSize);
    	return this;
    }
    
    /// @see #shadingRateAttachmentTexelSize()
    public VkRenderingFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(VkExtent2D other) {
    	shadingRateAttachmentTexelSize.set(other);
    	return this;
    }
    
    public VkExtent2D shadingRateAttachmentTexelSize() {
    	return shadingRateAttachmentTexelSize;
    }
    
    @Override
    public VkRenderingFragmentShadingRateAttachmentInfoKHR set(VkRenderingFragmentShadingRateAttachmentInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderingFragmentShadingRateAttachmentInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderingFragmentShadingRateAttachmentInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderingFragmentShadingRateAttachmentInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderingFragmentShadingRateAttachmentInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderingFragmentShadingRateAttachmentInfoKHR> array(Arena arena, VkRenderingFragmentShadingRateAttachmentInfoKHR... structs) {
        NativeStructArray<VkRenderingFragmentShadingRateAttachmentInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderingFragmentShadingRateAttachmentInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderingFragmentShadingRateAttachmentInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderingFragmentShadingRateAttachmentInfoKHR(segment)
        );
    }

}