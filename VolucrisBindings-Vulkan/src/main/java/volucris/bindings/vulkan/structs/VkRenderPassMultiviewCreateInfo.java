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

public final class VkRenderPassMultiviewCreateInfo
		implements Struct<VkRenderPassMultiviewCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SUBPASS_COUNT_HANDLE;
	public static final VarHandle P_VIEW_MASKS_HANDLE;
	public static final VarHandle DEPENDENCY_COUNT_HANDLE;
	public static final VarHandle P_VIEW_OFFSETS_HANDLE;
	public static final VarHandle CORRELATION_MASK_COUNT_HANDLE;
	public static final VarHandle P_CORRELATION_MASKS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SUBPASS_COUNT_BYTE_OFFSET;
	public static final long P_VIEW_MASKS_BYTE_OFFSET;
	public static final long DEPENDENCY_COUNT_BYTE_OFFSET;
	public static final long P_VIEW_OFFSETS_BYTE_OFFSET;
	public static final long CORRELATION_MASK_COUNT_BYTE_OFFSET;
	public static final long P_CORRELATION_MASKS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("subpassCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pViewMasks"),
		    JAVA_INT.withName("dependencyCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pViewOffsets"),
		    JAVA_INT.withName("correlationMaskCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pCorrelationMasks")
		).withName("VkRenderPassMultiviewCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SUBPASS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subpassCount"));
		P_VIEW_MASKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pViewMasks"));
		DEPENDENCY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dependencyCount"));
		P_VIEW_OFFSETS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pViewOffsets"));
		CORRELATION_MASK_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("correlationMaskCount"));
		P_CORRELATION_MASKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCorrelationMasks"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SUBPASS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subpassCount"));
		P_VIEW_MASKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pViewMasks"));
		DEPENDENCY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dependencyCount"));
		P_VIEW_OFFSETS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pViewOffsets"));
		CORRELATION_MASK_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("correlationMaskCount"));
		P_CORRELATION_MASKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCorrelationMasks"));
		//@formatter:on
	}

	public VkRenderPassMultiviewCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkRenderPassMultiviewCreateInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkRenderPassMultiviewCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkRenderPassMultiviewCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderPassMultiviewCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #subpassCount()
    public VkRenderPassMultiviewCreateInfo subpassCount(int subpassCount) {
    	SUBPASS_COUNT_HANDLE.set(segment, 0L, subpassCount);
    	return this;
    }
    
    public int subpassCount() {
    	return (int) SUBPASS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pViewMasks()
    public VkRenderPassMultiviewCreateInfo pViewMasks(NativeIntArray pViewMasks) {
    	P_VIEW_MASKS_HANDLE.set(segment, 0L, pViewMasks.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pViewMasks() {
    	MemorySegment segment = (MemorySegment) P_VIEW_MASKS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #dependencyCount()
    public VkRenderPassMultiviewCreateInfo dependencyCount(int dependencyCount) {
    	DEPENDENCY_COUNT_HANDLE.set(segment, 0L, dependencyCount);
    	return this;
    }
    
    public int dependencyCount() {
    	return (int) DEPENDENCY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pViewOffsets()
    public VkRenderPassMultiviewCreateInfo pViewOffsets(NativeIntArray pViewOffsets) {
    	P_VIEW_OFFSETS_HANDLE.set(segment, 0L, pViewOffsets.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pViewOffsets() {
    	MemorySegment segment = (MemorySegment) P_VIEW_OFFSETS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #correlationMaskCount()
    public VkRenderPassMultiviewCreateInfo correlationMaskCount(int correlationMaskCount) {
    	CORRELATION_MASK_COUNT_HANDLE.set(segment, 0L, correlationMaskCount);
    	return this;
    }
    
    public int correlationMaskCount() {
    	return (int) CORRELATION_MASK_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCorrelationMasks()
    public VkRenderPassMultiviewCreateInfo pCorrelationMasks(NativeIntArray pCorrelationMasks) {
    	P_CORRELATION_MASKS_HANDLE.set(segment, 0L, pCorrelationMasks.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pCorrelationMasks() {
    	MemorySegment segment = (MemorySegment) P_CORRELATION_MASKS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkRenderPassMultiviewCreateInfo set(VkRenderPassMultiviewCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderPassMultiviewCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderPassMultiviewCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderPassMultiviewCreateInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRenderPassMultiviewCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderPassMultiviewCreateInfo> array(SegmentAllocator allocator, VkRenderPassMultiviewCreateInfo... structs) {
        NativeStructArray<VkRenderPassMultiviewCreateInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRenderPassMultiviewCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderPassMultiviewCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderPassMultiviewCreateInfo(segment)
        );
    }

}