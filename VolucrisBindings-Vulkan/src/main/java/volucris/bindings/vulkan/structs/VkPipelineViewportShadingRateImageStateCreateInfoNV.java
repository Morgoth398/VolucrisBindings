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

public final class VkPipelineViewportShadingRateImageStateCreateInfoNV
		implements Struct<VkPipelineViewportShadingRateImageStateCreateInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADING_RATE_IMAGE_ENABLE_HANDLE;
	public static final VarHandle VIEWPORT_COUNT_HANDLE;
	public static final VarHandle P_SHADING_RATE_PALETTES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADING_RATE_IMAGE_ENABLE_BYTE_OFFSET;
	public static final long VIEWPORT_COUNT_BYTE_OFFSET;
	public static final long P_SHADING_RATE_PALETTES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shadingRateImageEnable"),
		    JAVA_INT.withName("viewportCount"),
		    UNBOUNDED_ADDRESS.withName("pShadingRatePalettes")
		).withName("VkPipelineViewportShadingRateImageStateCreateInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADING_RATE_IMAGE_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shadingRateImageEnable"));
		VIEWPORT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewportCount"));
		P_SHADING_RATE_PALETTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pShadingRatePalettes"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADING_RATE_IMAGE_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shadingRateImageEnable"));
		VIEWPORT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewportCount"));
		P_SHADING_RATE_PALETTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pShadingRatePalettes"));
		//@formatter:on
	}

	public VkPipelineViewportShadingRateImageStateCreateInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineViewportShadingRateImageStateCreateInfoNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPipelineViewportShadingRateImageStateCreateInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineViewportShadingRateImageStateCreateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shadingRateImageEnable()
    public VkPipelineViewportShadingRateImageStateCreateInfoNV shadingRateImageEnable(int shadingRateImageEnable) {
    	SHADING_RATE_IMAGE_ENABLE_HANDLE.set(segment, 0L, shadingRateImageEnable);
    	return this;
    }
    
    public int shadingRateImageEnable() {
    	return (int) SHADING_RATE_IMAGE_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #viewportCount()
    public VkPipelineViewportShadingRateImageStateCreateInfoNV viewportCount(int viewportCount) {
    	VIEWPORT_COUNT_HANDLE.set(segment, 0L, viewportCount);
    	return this;
    }
    
    public int viewportCount() {
    	return (int) VIEWPORT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pShadingRatePalettes()
    public VkPipelineViewportShadingRateImageStateCreateInfoNV pShadingRatePalettes(NativeStructArray<VkShadingRatePaletteNV> pShadingRatePalettes) {
    	P_SHADING_RATE_PALETTES_HANDLE.set(segment, 0L, pShadingRatePalettes.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkShadingRatePaletteNV> pShadingRatePalettes() {
    	MemorySegment segment = (MemorySegment) P_SHADING_RATE_PALETTES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkShadingRatePaletteNV.array(segment);
    }
    
    @Override
    public VkPipelineViewportShadingRateImageStateCreateInfoNV set(VkPipelineViewportShadingRateImageStateCreateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineViewportShadingRateImageStateCreateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineViewportShadingRateImageStateCreateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineViewportShadingRateImageStateCreateInfoNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineViewportShadingRateImageStateCreateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineViewportShadingRateImageStateCreateInfoNV> array(SegmentAllocator allocator, VkPipelineViewportShadingRateImageStateCreateInfoNV... structs) {
        NativeStructArray<VkPipelineViewportShadingRateImageStateCreateInfoNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineViewportShadingRateImageStateCreateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineViewportShadingRateImageStateCreateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineViewportShadingRateImageStateCreateInfoNV(segment)
        );
    }

}