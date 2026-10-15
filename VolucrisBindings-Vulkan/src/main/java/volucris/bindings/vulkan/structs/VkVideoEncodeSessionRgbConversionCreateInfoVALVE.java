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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkVideoEncodeSessionRgbConversionCreateInfoVALVE
		implements Struct<VkVideoEncodeSessionRgbConversionCreateInfoVALVE> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle RGB_MODEL_HANDLE;
	public static final VarHandle RGB_RANGE_HANDLE;
	public static final VarHandle X_CHROMA_OFFSET_HANDLE;
	public static final VarHandle Y_CHROMA_OFFSET_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long RGB_MODEL_BYTE_OFFSET;
	public static final long RGB_RANGE_BYTE_OFFSET;
	public static final long X_CHROMA_OFFSET_BYTE_OFFSET;
	public static final long Y_CHROMA_OFFSET_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("rgbModel"),
		    JAVA_INT.withName("rgbRange"),
		    JAVA_INT.withName("xChromaOffset"),
		    JAVA_INT.withName("yChromaOffset")
		).withName("VkVideoEncodeSessionRgbConversionCreateInfoVALVE").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		RGB_MODEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rgbModel"));
		RGB_RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rgbRange"));
		X_CHROMA_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("xChromaOffset"));
		Y_CHROMA_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("yChromaOffset"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		RGB_MODEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rgbModel"));
		RGB_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rgbRange"));
		X_CHROMA_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("xChromaOffset"));
		Y_CHROMA_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("yChromaOffset"));
		//@formatter:on
	}

	public VkVideoEncodeSessionRgbConversionCreateInfoVALVE() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeSessionRgbConversionCreateInfoVALVE(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoEncodeSessionRgbConversionCreateInfoVALVE(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #rgbModel()
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE rgbModel(int rgbModel) {
    	RGB_MODEL_HANDLE.set(segment, 0L, rgbModel);
    	return this;
    }
    
    public int rgbModel() {
    	return (int) RGB_MODEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #rgbRange()
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE rgbRange(int rgbRange) {
    	RGB_RANGE_HANDLE.set(segment, 0L, rgbRange);
    	return this;
    }
    
    public int rgbRange() {
    	return (int) RGB_RANGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #xChromaOffset()
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE xChromaOffset(int xChromaOffset) {
    	X_CHROMA_OFFSET_HANDLE.set(segment, 0L, xChromaOffset);
    	return this;
    }
    
    public int xChromaOffset() {
    	return (int) X_CHROMA_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #yChromaOffset()
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE yChromaOffset(int yChromaOffset) {
    	Y_CHROMA_OFFSET_HANDLE.set(segment, 0L, yChromaOffset);
    	return this;
    }
    
    public int yChromaOffset() {
    	return (int) Y_CHROMA_OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE set(VkVideoEncodeSessionRgbConversionCreateInfoVALVE other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeSessionRgbConversionCreateInfoVALVE> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeSessionRgbConversionCreateInfoVALVE> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeSessionRgbConversionCreateInfoVALVE> array(Arena arena, VkVideoEncodeSessionRgbConversionCreateInfoVALVE... structs) {
        NativeStructArray<VkVideoEncodeSessionRgbConversionCreateInfoVALVE> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeSessionRgbConversionCreateInfoVALVE> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(segment)
        );
    }

}