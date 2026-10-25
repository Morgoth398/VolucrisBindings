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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPipelineViewportWScalingStateCreateInfoNV
		implements Struct<VkPipelineViewportWScalingStateCreateInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VIEWPORT_WSCALING_ENABLE_HANDLE;
	public static final VarHandle VIEWPORT_COUNT_HANDLE;
	public static final VarHandle P_VIEWPORT_WSCALINGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VIEWPORT_WSCALING_ENABLE_BYTE_OFFSET;
	public static final long VIEWPORT_COUNT_BYTE_OFFSET;
	public static final long P_VIEWPORT_WSCALINGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("viewportWScalingEnable"),
		    JAVA_INT.withName("viewportCount"),
		    UNBOUNDED_ADDRESS.withName("pViewportWScalings")
		).withName("VkPipelineViewportWScalingStateCreateInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VIEWPORT_WSCALING_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewportWScalingEnable"));
		VIEWPORT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewportCount"));
		P_VIEWPORT_WSCALINGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pViewportWScalings"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VIEWPORT_WSCALING_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewportWScalingEnable"));
		VIEWPORT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewportCount"));
		P_VIEWPORT_WSCALINGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pViewportWScalings"));
		//@formatter:on
	}

	public VkPipelineViewportWScalingStateCreateInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineViewportWScalingStateCreateInfoNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPipelineViewportWScalingStateCreateInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineViewportWScalingStateCreateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineViewportWScalingStateCreateInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #viewportWScalingEnable()
    public VkPipelineViewportWScalingStateCreateInfoNV viewportWScalingEnable(int viewportWScalingEnable) {
    	VIEWPORT_WSCALING_ENABLE_HANDLE.set(segment, 0L, viewportWScalingEnable);
    	return this;
    }
    
    public int viewportWScalingEnable() {
    	return (int) VIEWPORT_WSCALING_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #viewportCount()
    public VkPipelineViewportWScalingStateCreateInfoNV viewportCount(int viewportCount) {
    	VIEWPORT_COUNT_HANDLE.set(segment, 0L, viewportCount);
    	return this;
    }
    
    public int viewportCount() {
    	return (int) VIEWPORT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pViewportWScalings()
    public VkPipelineViewportWScalingStateCreateInfoNV pViewportWScalings(NativeStructArray<VkViewportWScalingNV> pViewportWScalings) {
    	P_VIEWPORT_WSCALINGS_HANDLE.set(segment, 0L, pViewportWScalings.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkViewportWScalingNV> pViewportWScalings() {
    	MemorySegment segment = (MemorySegment) P_VIEWPORT_WSCALINGS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkViewportWScalingNV.array(segment);
    }
    
    @Override
    public VkPipelineViewportWScalingStateCreateInfoNV set(VkPipelineViewportWScalingStateCreateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineViewportWScalingStateCreateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineViewportWScalingStateCreateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineViewportWScalingStateCreateInfoNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineViewportWScalingStateCreateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineViewportWScalingStateCreateInfoNV> array(SegmentAllocator allocator, VkPipelineViewportWScalingStateCreateInfoNV... structs) {
        NativeStructArray<VkPipelineViewportWScalingStateCreateInfoNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineViewportWScalingStateCreateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineViewportWScalingStateCreateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineViewportWScalingStateCreateInfoNV(segment)
        );
    }

}