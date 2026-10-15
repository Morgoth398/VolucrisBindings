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

public final class VkSamplerYcbcrConversionCreateInfo
		implements Struct<VkSamplerYcbcrConversionCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle YCBCR_MODEL_HANDLE;
	public static final VarHandle YCBCR_RANGE_HANDLE;
	public static final VarHandle X_CHROMA_OFFSET_HANDLE;
	public static final VarHandle Y_CHROMA_OFFSET_HANDLE;
	public static final VarHandle CHROMA_FILTER_HANDLE;
	public static final VarHandle FORCE_EXPLICIT_RECONSTRUCTION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;
	public static final long YCBCR_MODEL_BYTE_OFFSET;
	public static final long YCBCR_RANGE_BYTE_OFFSET;
	public static final long COMPONENTS_BYTE_OFFSET;
	public static final long X_CHROMA_OFFSET_BYTE_OFFSET;
	public static final long Y_CHROMA_OFFSET_BYTE_OFFSET;
	public static final long CHROMA_FILTER_BYTE_OFFSET;
	public static final long FORCE_EXPLICIT_RECONSTRUCTION_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkComponentMapping components;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("ycbcrModel"),
		    JAVA_INT.withName("ycbcrRange"),
		    VkComponentMapping.LAYOUT.withName("components"),
		    JAVA_INT.withName("xChromaOffset"),
		    JAVA_INT.withName("yChromaOffset"),
		    JAVA_INT.withName("chromaFilter"),
		    JAVA_INT.withName("forceExplicitReconstruction"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkSamplerYcbcrConversionCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		YCBCR_MODEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ycbcrModel"));
		YCBCR_RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ycbcrRange"));
		X_CHROMA_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("xChromaOffset"));
		Y_CHROMA_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("yChromaOffset"));
		CHROMA_FILTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chromaFilter"));
		FORCE_EXPLICIT_RECONSTRUCTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("forceExplicitReconstruction"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		YCBCR_MODEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ycbcrModel"));
		YCBCR_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ycbcrRange"));
		COMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("components"));
		X_CHROMA_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("xChromaOffset"));
		Y_CHROMA_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("yChromaOffset"));
		CHROMA_FILTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chromaFilter"));
		FORCE_EXPLICIT_RECONSTRUCTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("forceExplicitReconstruction"));
		//@formatter:on
	}

	public VkSamplerYcbcrConversionCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkSamplerYcbcrConversionCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSamplerYcbcrConversionCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    components = new VkComponentMapping(segment.asSlice(COMPONENTS_BYTE_OFFSET, VkComponentMapping.LAYOUT));
	}

    /// @see #sType()
    public VkSamplerYcbcrConversionCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSamplerYcbcrConversionCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #format()
    public VkSamplerYcbcrConversionCreateInfo format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #ycbcrModel()
    public VkSamplerYcbcrConversionCreateInfo ycbcrModel(int ycbcrModel) {
    	YCBCR_MODEL_HANDLE.set(segment, 0L, ycbcrModel);
    	return this;
    }
    
    public int ycbcrModel() {
    	return (int) YCBCR_MODEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #ycbcrRange()
    public VkSamplerYcbcrConversionCreateInfo ycbcrRange(int ycbcrRange) {
    	YCBCR_RANGE_HANDLE.set(segment, 0L, ycbcrRange);
    	return this;
    }
    
    public int ycbcrRange() {
    	return (int) YCBCR_RANGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #components()
    public VkSamplerYcbcrConversionCreateInfo components(Consumer<VkComponentMapping> consumer) {
    	consumer.accept(components);
    	return this;
    }
    
    /// @see #components()
    public VkSamplerYcbcrConversionCreateInfo components(VkComponentMapping other) {
    	components.set(other);
    	return this;
    }
    
    public VkComponentMapping components() {
    	return components;
    }
    
    /// @see #xChromaOffset()
    public VkSamplerYcbcrConversionCreateInfo xChromaOffset(int xChromaOffset) {
    	X_CHROMA_OFFSET_HANDLE.set(segment, 0L, xChromaOffset);
    	return this;
    }
    
    public int xChromaOffset() {
    	return (int) X_CHROMA_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #yChromaOffset()
    public VkSamplerYcbcrConversionCreateInfo yChromaOffset(int yChromaOffset) {
    	Y_CHROMA_OFFSET_HANDLE.set(segment, 0L, yChromaOffset);
    	return this;
    }
    
    public int yChromaOffset() {
    	return (int) Y_CHROMA_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #chromaFilter()
    public VkSamplerYcbcrConversionCreateInfo chromaFilter(int chromaFilter) {
    	CHROMA_FILTER_HANDLE.set(segment, 0L, chromaFilter);
    	return this;
    }
    
    public int chromaFilter() {
    	return (int) CHROMA_FILTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #forceExplicitReconstruction()
    public VkSamplerYcbcrConversionCreateInfo forceExplicitReconstruction(int forceExplicitReconstruction) {
    	FORCE_EXPLICIT_RECONSTRUCTION_HANDLE.set(segment, 0L, forceExplicitReconstruction);
    	return this;
    }
    
    public int forceExplicitReconstruction() {
    	return (int) FORCE_EXPLICIT_RECONSTRUCTION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSamplerYcbcrConversionCreateInfo set(VkSamplerYcbcrConversionCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkSamplerYcbcrConversionCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSamplerYcbcrConversionCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSamplerYcbcrConversionCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSamplerYcbcrConversionCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSamplerYcbcrConversionCreateInfo> array(Arena arena, VkSamplerYcbcrConversionCreateInfo... structs) {
        NativeStructArray<VkSamplerYcbcrConversionCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSamplerYcbcrConversionCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSamplerYcbcrConversionCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSamplerYcbcrConversionCreateInfo(segment)
        );
    }

}