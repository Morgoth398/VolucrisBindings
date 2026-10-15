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

public final class VkFragmentShadingRateAttachmentInfoKHR
		implements Struct<VkFragmentShadingRateAttachmentInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_FRAGMENT_SHADING_RATE_ATTACHMENT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_FRAGMENT_SHADING_RATE_ATTACHMENT_BYTE_OFFSET;
	public static final long SHADING_RATE_ATTACHMENT_TEXEL_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D shadingRateAttachmentTexelSize;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pFragmentShadingRateAttachment"),
		    VkExtent2D.LAYOUT.withName("shadingRateAttachmentTexelSize")
		).withName("VkFragmentShadingRateAttachmentInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_FRAGMENT_SHADING_RATE_ATTACHMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pFragmentShadingRateAttachment"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_FRAGMENT_SHADING_RATE_ATTACHMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pFragmentShadingRateAttachment"));
		SHADING_RATE_ATTACHMENT_TEXEL_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shadingRateAttachmentTexelSize"));
		//@formatter:on
	}

	public VkFragmentShadingRateAttachmentInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkFragmentShadingRateAttachmentInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkFragmentShadingRateAttachmentInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    shadingRateAttachmentTexelSize = new VkExtent2D(segment.asSlice(SHADING_RATE_ATTACHMENT_TEXEL_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #sType()
    public VkFragmentShadingRateAttachmentInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkFragmentShadingRateAttachmentInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pFragmentShadingRateAttachment()
    public VkFragmentShadingRateAttachmentInfoKHR pFragmentShadingRateAttachment(VkAttachmentReference2 pFragmentShadingRateAttachment) {
    	P_FRAGMENT_SHADING_RATE_ATTACHMENT_HANDLE.set(segment, 0L, pFragmentShadingRateAttachment.memorySegment());
    	return this;
    }
    
    public @Nullable VkAttachmentReference2 pFragmentShadingRateAttachment() {
    	MemorySegment segment = (MemorySegment) P_FRAGMENT_SHADING_RATE_ATTACHMENT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkAttachmentReference2(segment);
    }
    
    /// @see #shadingRateAttachmentTexelSize()
    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(shadingRateAttachmentTexelSize);
    	return this;
    }
    
    /// @see #shadingRateAttachmentTexelSize()
    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(VkExtent2D other) {
    	shadingRateAttachmentTexelSize.set(other);
    	return this;
    }
    
    public VkExtent2D shadingRateAttachmentTexelSize() {
    	return shadingRateAttachmentTexelSize;
    }
    
    @Override
    public VkFragmentShadingRateAttachmentInfoKHR set(VkFragmentShadingRateAttachmentInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkFragmentShadingRateAttachmentInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkFragmentShadingRateAttachmentInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkFragmentShadingRateAttachmentInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFragmentShadingRateAttachmentInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkFragmentShadingRateAttachmentInfoKHR> array(Arena arena, VkFragmentShadingRateAttachmentInfoKHR... structs) {
        NativeStructArray<VkFragmentShadingRateAttachmentInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFragmentShadingRateAttachmentInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkFragmentShadingRateAttachmentInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkFragmentShadingRateAttachmentInfoKHR(segment)
        );
    }

}