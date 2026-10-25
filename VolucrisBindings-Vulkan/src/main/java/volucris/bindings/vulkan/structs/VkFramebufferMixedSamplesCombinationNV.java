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

public final class VkFramebufferMixedSamplesCombinationNV
		implements Struct<VkFramebufferMixedSamplesCombinationNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COVERAGE_REDUCTION_MODE_HANDLE;
	public static final VarHandle RASTERIZATION_SAMPLES_HANDLE;
	public static final VarHandle DEPTH_STENCIL_SAMPLES_HANDLE;
	public static final VarHandle COLOR_SAMPLES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COVERAGE_REDUCTION_MODE_BYTE_OFFSET;
	public static final long RASTERIZATION_SAMPLES_BYTE_OFFSET;
	public static final long DEPTH_STENCIL_SAMPLES_BYTE_OFFSET;
	public static final long COLOR_SAMPLES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("coverageReductionMode"),
		    JAVA_INT.withName("rasterizationSamples"),
		    JAVA_INT.withName("depthStencilSamples"),
		    JAVA_INT.withName("colorSamples")
		).withName("VkFramebufferMixedSamplesCombinationNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COVERAGE_REDUCTION_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coverageReductionMode"));
		RASTERIZATION_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rasterizationSamples"));
		DEPTH_STENCIL_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthStencilSamples"));
		COLOR_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("colorSamples"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COVERAGE_REDUCTION_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coverageReductionMode"));
		RASTERIZATION_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rasterizationSamples"));
		DEPTH_STENCIL_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthStencilSamples"));
		COLOR_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("colorSamples"));
		//@formatter:on
	}

	public VkFramebufferMixedSamplesCombinationNV() {
	    this(Arena.ofAuto());
	}
	
	public VkFramebufferMixedSamplesCombinationNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkFramebufferMixedSamplesCombinationNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkFramebufferMixedSamplesCombinationNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkFramebufferMixedSamplesCombinationNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #coverageReductionMode()
    public VkFramebufferMixedSamplesCombinationNV coverageReductionMode(int coverageReductionMode) {
    	COVERAGE_REDUCTION_MODE_HANDLE.set(segment, 0L, coverageReductionMode);
    	return this;
    }
    
    public int coverageReductionMode() {
    	return (int) COVERAGE_REDUCTION_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #rasterizationSamples()
    public VkFramebufferMixedSamplesCombinationNV rasterizationSamples(int rasterizationSamples) {
    	RASTERIZATION_SAMPLES_HANDLE.set(segment, 0L, rasterizationSamples);
    	return this;
    }
    
    public int rasterizationSamples() {
    	return (int) RASTERIZATION_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthStencilSamples()
    public VkFramebufferMixedSamplesCombinationNV depthStencilSamples(int depthStencilSamples) {
    	DEPTH_STENCIL_SAMPLES_HANDLE.set(segment, 0L, depthStencilSamples);
    	return this;
    }
    
    public int depthStencilSamples() {
    	return (int) DEPTH_STENCIL_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #colorSamples()
    public VkFramebufferMixedSamplesCombinationNV colorSamples(int colorSamples) {
    	COLOR_SAMPLES_HANDLE.set(segment, 0L, colorSamples);
    	return this;
    }
    
    public int colorSamples() {
    	return (int) COLOR_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkFramebufferMixedSamplesCombinationNV set(VkFramebufferMixedSamplesCombinationNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkFramebufferMixedSamplesCombinationNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkFramebufferMixedSamplesCombinationNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkFramebufferMixedSamplesCombinationNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkFramebufferMixedSamplesCombinationNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkFramebufferMixedSamplesCombinationNV> array(SegmentAllocator allocator, VkFramebufferMixedSamplesCombinationNV... structs) {
        NativeStructArray<VkFramebufferMixedSamplesCombinationNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkFramebufferMixedSamplesCombinationNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkFramebufferMixedSamplesCombinationNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkFramebufferMixedSamplesCombinationNV(segment)
        );
    }

}