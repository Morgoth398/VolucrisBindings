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

public final class VkPipelineMultisampleStateCreateInfo
		implements Struct<VkPipelineMultisampleStateCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle RASTERIZATION_SAMPLES_HANDLE;
	public static final VarHandle SAMPLE_SHADING_ENABLE_HANDLE;
	public static final VarHandle MIN_SAMPLE_SHADING_HANDLE;
	public static final VarHandle P_SAMPLE_MASK_HANDLE;
	public static final VarHandle ALPHA_TO_COVERAGE_ENABLE_HANDLE;
	public static final VarHandle ALPHA_TO_ONE_ENABLE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long RASTERIZATION_SAMPLES_BYTE_OFFSET;
	public static final long SAMPLE_SHADING_ENABLE_BYTE_OFFSET;
	public static final long MIN_SAMPLE_SHADING_BYTE_OFFSET;
	public static final long P_SAMPLE_MASK_BYTE_OFFSET;
	public static final long ALPHA_TO_COVERAGE_ENABLE_BYTE_OFFSET;
	public static final long ALPHA_TO_ONE_ENABLE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("rasterizationSamples"),
		    JAVA_INT.withName("sampleShadingEnable"),
		    JAVA_FLOAT.withName("minSampleShading"),
		    UNBOUNDED_ADDRESS.withName("pSampleMask"),
		    JAVA_INT.withName("alphaToCoverageEnable"),
		    JAVA_INT.withName("alphaToOneEnable")
		).withName("VkPipelineMultisampleStateCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		RASTERIZATION_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rasterizationSamples"));
		SAMPLE_SHADING_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleShadingEnable"));
		MIN_SAMPLE_SHADING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minSampleShading"));
		P_SAMPLE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSampleMask"));
		ALPHA_TO_COVERAGE_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("alphaToCoverageEnable"));
		ALPHA_TO_ONE_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("alphaToOneEnable"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		RASTERIZATION_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rasterizationSamples"));
		SAMPLE_SHADING_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleShadingEnable"));
		MIN_SAMPLE_SHADING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minSampleShading"));
		P_SAMPLE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSampleMask"));
		ALPHA_TO_COVERAGE_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("alphaToCoverageEnable"));
		ALPHA_TO_ONE_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("alphaToOneEnable"));
		//@formatter:on
	}

	public VkPipelineMultisampleStateCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineMultisampleStateCreateInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPipelineMultisampleStateCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineMultisampleStateCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineMultisampleStateCreateInfo pNext(MemorySegment pNext) {
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
    public VkPipelineMultisampleStateCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #rasterizationSamples()
    public VkPipelineMultisampleStateCreateInfo rasterizationSamples(int rasterizationSamples) {
    	RASTERIZATION_SAMPLES_HANDLE.set(segment, 0L, rasterizationSamples);
    	return this;
    }
    
    public int rasterizationSamples() {
    	return (int) RASTERIZATION_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleShadingEnable()
    public VkPipelineMultisampleStateCreateInfo sampleShadingEnable(int sampleShadingEnable) {
    	SAMPLE_SHADING_ENABLE_HANDLE.set(segment, 0L, sampleShadingEnable);
    	return this;
    }
    
    public int sampleShadingEnable() {
    	return (int) SAMPLE_SHADING_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #minSampleShading()
    public VkPipelineMultisampleStateCreateInfo minSampleShading(float minSampleShading) {
    	MIN_SAMPLE_SHADING_HANDLE.set(segment, 0L, minSampleShading);
    	return this;
    }
    
    public float minSampleShading() {
    	return (float) MIN_SAMPLE_SHADING_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSampleMask()
    public VkPipelineMultisampleStateCreateInfo pSampleMask(NativeIntArray pSampleMask) {
    	P_SAMPLE_MASK_HANDLE.set(segment, 0L, pSampleMask.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pSampleMask() {
    	MemorySegment segment = (MemorySegment) P_SAMPLE_MASK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #alphaToCoverageEnable()
    public VkPipelineMultisampleStateCreateInfo alphaToCoverageEnable(int alphaToCoverageEnable) {
    	ALPHA_TO_COVERAGE_ENABLE_HANDLE.set(segment, 0L, alphaToCoverageEnable);
    	return this;
    }
    
    public int alphaToCoverageEnable() {
    	return (int) ALPHA_TO_COVERAGE_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #alphaToOneEnable()
    public VkPipelineMultisampleStateCreateInfo alphaToOneEnable(int alphaToOneEnable) {
    	ALPHA_TO_ONE_ENABLE_HANDLE.set(segment, 0L, alphaToOneEnable);
    	return this;
    }
    
    public int alphaToOneEnable() {
    	return (int) ALPHA_TO_ONE_ENABLE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPipelineMultisampleStateCreateInfo set(VkPipelineMultisampleStateCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineMultisampleStateCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineMultisampleStateCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineMultisampleStateCreateInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineMultisampleStateCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineMultisampleStateCreateInfo> array(SegmentAllocator allocator, VkPipelineMultisampleStateCreateInfo... structs) {
        NativeStructArray<VkPipelineMultisampleStateCreateInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineMultisampleStateCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineMultisampleStateCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineMultisampleStateCreateInfo(segment)
        );
    }

}