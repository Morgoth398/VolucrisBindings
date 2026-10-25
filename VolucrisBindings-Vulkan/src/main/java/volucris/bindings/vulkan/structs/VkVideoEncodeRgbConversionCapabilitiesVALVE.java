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

public final class VkVideoEncodeRgbConversionCapabilitiesVALVE
		implements Struct<VkVideoEncodeRgbConversionCapabilitiesVALVE> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle RGB_MODELS_HANDLE;
	public static final VarHandle RGB_RANGES_HANDLE;
	public static final VarHandle X_CHROMA_OFFSETS_HANDLE;
	public static final VarHandle Y_CHROMA_OFFSETS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long RGB_MODELS_BYTE_OFFSET;
	public static final long RGB_RANGES_BYTE_OFFSET;
	public static final long X_CHROMA_OFFSETS_BYTE_OFFSET;
	public static final long Y_CHROMA_OFFSETS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("rgbModels"),
		    JAVA_INT.withName("rgbRanges"),
		    JAVA_INT.withName("xChromaOffsets"),
		    JAVA_INT.withName("yChromaOffsets")
		).withName("VkVideoEncodeRgbConversionCapabilitiesVALVE").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		RGB_MODELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rgbModels"));
		RGB_RANGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rgbRanges"));
		X_CHROMA_OFFSETS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("xChromaOffsets"));
		Y_CHROMA_OFFSETS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("yChromaOffsets"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		RGB_MODELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rgbModels"));
		RGB_RANGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rgbRanges"));
		X_CHROMA_OFFSETS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("xChromaOffsets"));
		Y_CHROMA_OFFSETS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("yChromaOffsets"));
		//@formatter:on
	}

	public VkVideoEncodeRgbConversionCapabilitiesVALVE() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeRgbConversionCapabilitiesVALVE(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoEncodeRgbConversionCapabilitiesVALVE(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeRgbConversionCapabilitiesVALVE sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeRgbConversionCapabilitiesVALVE pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #rgbModels()
    public VkVideoEncodeRgbConversionCapabilitiesVALVE rgbModels(int rgbModels) {
    	RGB_MODELS_HANDLE.set(segment, 0L, rgbModels);
    	return this;
    }
    
    public int rgbModels() {
    	return (int) RGB_MODELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #rgbRanges()
    public VkVideoEncodeRgbConversionCapabilitiesVALVE rgbRanges(int rgbRanges) {
    	RGB_RANGES_HANDLE.set(segment, 0L, rgbRanges);
    	return this;
    }
    
    public int rgbRanges() {
    	return (int) RGB_RANGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #xChromaOffsets()
    public VkVideoEncodeRgbConversionCapabilitiesVALVE xChromaOffsets(int xChromaOffsets) {
    	X_CHROMA_OFFSETS_HANDLE.set(segment, 0L, xChromaOffsets);
    	return this;
    }
    
    public int xChromaOffsets() {
    	return (int) X_CHROMA_OFFSETS_HANDLE.get(segment, 0L);
    }
    
    /// @see #yChromaOffsets()
    public VkVideoEncodeRgbConversionCapabilitiesVALVE yChromaOffsets(int yChromaOffsets) {
    	Y_CHROMA_OFFSETS_HANDLE.set(segment, 0L, yChromaOffsets);
    	return this;
    }
    
    public int yChromaOffsets() {
    	return (int) Y_CHROMA_OFFSETS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeRgbConversionCapabilitiesVALVE set(VkVideoEncodeRgbConversionCapabilitiesVALVE other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeRgbConversionCapabilitiesVALVE set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeRgbConversionCapabilitiesVALVE> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeRgbConversionCapabilitiesVALVE> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeRgbConversionCapabilitiesVALVE(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeRgbConversionCapabilitiesVALVE> array(SegmentAllocator allocator, VkVideoEncodeRgbConversionCapabilitiesVALVE... structs) {
        NativeStructArray<VkVideoEncodeRgbConversionCapabilitiesVALVE> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeRgbConversionCapabilitiesVALVE(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeRgbConversionCapabilitiesVALVE> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeRgbConversionCapabilitiesVALVE(segment)
        );
    }

}