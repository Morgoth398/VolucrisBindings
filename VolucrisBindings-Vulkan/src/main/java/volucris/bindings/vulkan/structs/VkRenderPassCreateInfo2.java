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

public final class VkRenderPassCreateInfo2
		implements Struct<VkRenderPassCreateInfo2> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle ATTACHMENT_COUNT_HANDLE;
	public static final VarHandle P_ATTACHMENTS_HANDLE;
	public static final VarHandle SUBPASS_COUNT_HANDLE;
	public static final VarHandle P_SUBPASSES_HANDLE;
	public static final VarHandle DEPENDENCY_COUNT_HANDLE;
	public static final VarHandle P_DEPENDENCIES_HANDLE;
	public static final VarHandle CORRELATED_VIEW_MASK_COUNT_HANDLE;
	public static final VarHandle P_CORRELATED_VIEW_MASKS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long ATTACHMENT_COUNT_BYTE_OFFSET;
	public static final long P_ATTACHMENTS_BYTE_OFFSET;
	public static final long SUBPASS_COUNT_BYTE_OFFSET;
	public static final long P_SUBPASSES_BYTE_OFFSET;
	public static final long DEPENDENCY_COUNT_BYTE_OFFSET;
	public static final long P_DEPENDENCIES_BYTE_OFFSET;
	public static final long CORRELATED_VIEW_MASK_COUNT_BYTE_OFFSET;
	public static final long P_CORRELATED_VIEW_MASKS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("attachmentCount"),
		    UNBOUNDED_ADDRESS.withName("pAttachments"),
		    JAVA_INT.withName("subpassCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pSubpasses"),
		    JAVA_INT.withName("dependencyCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pDependencies"),
		    JAVA_INT.withName("correlatedViewMaskCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pCorrelatedViewMasks")
		).withName("VkRenderPassCreateInfo2").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		ATTACHMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attachmentCount"));
		P_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pAttachments"));
		SUBPASS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subpassCount"));
		P_SUBPASSES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSubpasses"));
		DEPENDENCY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dependencyCount"));
		P_DEPENDENCIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDependencies"));
		CORRELATED_VIEW_MASK_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("correlatedViewMaskCount"));
		P_CORRELATED_VIEW_MASKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCorrelatedViewMasks"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		ATTACHMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attachmentCount"));
		P_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pAttachments"));
		SUBPASS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subpassCount"));
		P_SUBPASSES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSubpasses"));
		DEPENDENCY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dependencyCount"));
		P_DEPENDENCIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDependencies"));
		CORRELATED_VIEW_MASK_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("correlatedViewMaskCount"));
		P_CORRELATED_VIEW_MASKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCorrelatedViewMasks"));
		//@formatter:on
	}

	public VkRenderPassCreateInfo2() {
	    this(Arena.ofAuto());
	}
	
	public VkRenderPassCreateInfo2(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkRenderPassCreateInfo2(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkRenderPassCreateInfo2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderPassCreateInfo2 pNext(MemorySegment pNext) {
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
    public VkRenderPassCreateInfo2 flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #attachmentCount()
    public VkRenderPassCreateInfo2 attachmentCount(int attachmentCount) {
    	ATTACHMENT_COUNT_HANDLE.set(segment, 0L, attachmentCount);
    	return this;
    }
    
    public int attachmentCount() {
    	return (int) ATTACHMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pAttachments()
    public VkRenderPassCreateInfo2 pAttachments(NativeStructArray<VkAttachmentDescription2> pAttachments) {
    	P_ATTACHMENTS_HANDLE.set(segment, 0L, pAttachments.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkAttachmentDescription2> pAttachments() {
    	MemorySegment segment = (MemorySegment) P_ATTACHMENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkAttachmentDescription2.array(segment);
    }
    
    /// @see #subpassCount()
    public VkRenderPassCreateInfo2 subpassCount(int subpassCount) {
    	SUBPASS_COUNT_HANDLE.set(segment, 0L, subpassCount);
    	return this;
    }
    
    public int subpassCount() {
    	return (int) SUBPASS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSubpasses()
    public VkRenderPassCreateInfo2 pSubpasses(NativeStructArray<VkSubpassDescription2> pSubpasses) {
    	P_SUBPASSES_HANDLE.set(segment, 0L, pSubpasses.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkSubpassDescription2> pSubpasses() {
    	MemorySegment segment = (MemorySegment) P_SUBPASSES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkSubpassDescription2.array(segment);
    }
    
    /// @see #dependencyCount()
    public VkRenderPassCreateInfo2 dependencyCount(int dependencyCount) {
    	DEPENDENCY_COUNT_HANDLE.set(segment, 0L, dependencyCount);
    	return this;
    }
    
    public int dependencyCount() {
    	return (int) DEPENDENCY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDependencies()
    public VkRenderPassCreateInfo2 pDependencies(NativeStructArray<VkSubpassDependency2> pDependencies) {
    	P_DEPENDENCIES_HANDLE.set(segment, 0L, pDependencies.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkSubpassDependency2> pDependencies() {
    	MemorySegment segment = (MemorySegment) P_DEPENDENCIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkSubpassDependency2.array(segment);
    }
    
    /// @see #correlatedViewMaskCount()
    public VkRenderPassCreateInfo2 correlatedViewMaskCount(int correlatedViewMaskCount) {
    	CORRELATED_VIEW_MASK_COUNT_HANDLE.set(segment, 0L, correlatedViewMaskCount);
    	return this;
    }
    
    public int correlatedViewMaskCount() {
    	return (int) CORRELATED_VIEW_MASK_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCorrelatedViewMasks()
    public VkRenderPassCreateInfo2 pCorrelatedViewMasks(NativeIntArray pCorrelatedViewMasks) {
    	P_CORRELATED_VIEW_MASKS_HANDLE.set(segment, 0L, pCorrelatedViewMasks.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pCorrelatedViewMasks() {
    	MemorySegment segment = (MemorySegment) P_CORRELATED_VIEW_MASKS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkRenderPassCreateInfo2 set(VkRenderPassCreateInfo2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderPassCreateInfo2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderPassCreateInfo2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderPassCreateInfo2> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRenderPassCreateInfo2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderPassCreateInfo2> array(SegmentAllocator allocator, VkRenderPassCreateInfo2... structs) {
        NativeStructArray<VkRenderPassCreateInfo2> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRenderPassCreateInfo2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderPassCreateInfo2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderPassCreateInfo2(segment)
        );
    }

}