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

public final class VkPipelineRasterizationStateCreateInfo
		implements Struct<VkPipelineRasterizationStateCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle DEPTH_CLAMP_ENABLE_HANDLE;
	public static final VarHandle RASTERIZER_DISCARD_ENABLE_HANDLE;
	public static final VarHandle POLYGON_MODE_HANDLE;
	public static final VarHandle CULL_MODE_HANDLE;
	public static final VarHandle FRONT_FACE_HANDLE;
	public static final VarHandle DEPTH_BIAS_ENABLE_HANDLE;
	public static final VarHandle DEPTH_BIAS_CONSTANT_FACTOR_HANDLE;
	public static final VarHandle DEPTH_BIAS_CLAMP_HANDLE;
	public static final VarHandle DEPTH_BIAS_SLOPE_FACTOR_HANDLE;
	public static final VarHandle LINE_WIDTH_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long DEPTH_CLAMP_ENABLE_BYTE_OFFSET;
	public static final long RASTERIZER_DISCARD_ENABLE_BYTE_OFFSET;
	public static final long POLYGON_MODE_BYTE_OFFSET;
	public static final long CULL_MODE_BYTE_OFFSET;
	public static final long FRONT_FACE_BYTE_OFFSET;
	public static final long DEPTH_BIAS_ENABLE_BYTE_OFFSET;
	public static final long DEPTH_BIAS_CONSTANT_FACTOR_BYTE_OFFSET;
	public static final long DEPTH_BIAS_CLAMP_BYTE_OFFSET;
	public static final long DEPTH_BIAS_SLOPE_FACTOR_BYTE_OFFSET;
	public static final long LINE_WIDTH_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("depthClampEnable"),
		    JAVA_INT.withName("rasterizerDiscardEnable"),
		    JAVA_INT.withName("polygonMode"),
		    JAVA_INT.withName("cullMode"),
		    JAVA_INT.withName("frontFace"),
		    JAVA_INT.withName("depthBiasEnable"),
		    JAVA_FLOAT.withName("depthBiasConstantFactor"),
		    JAVA_FLOAT.withName("depthBiasClamp"),
		    JAVA_FLOAT.withName("depthBiasSlopeFactor"),
		    JAVA_FLOAT.withName("lineWidth"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPipelineRasterizationStateCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		DEPTH_CLAMP_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthClampEnable"));
		RASTERIZER_DISCARD_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rasterizerDiscardEnable"));
		POLYGON_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("polygonMode"));
		CULL_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cullMode"));
		FRONT_FACE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frontFace"));
		DEPTH_BIAS_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthBiasEnable"));
		DEPTH_BIAS_CONSTANT_FACTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthBiasConstantFactor"));
		DEPTH_BIAS_CLAMP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthBiasClamp"));
		DEPTH_BIAS_SLOPE_FACTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthBiasSlopeFactor"));
		LINE_WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lineWidth"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		DEPTH_CLAMP_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthClampEnable"));
		RASTERIZER_DISCARD_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rasterizerDiscardEnable"));
		POLYGON_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("polygonMode"));
		CULL_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cullMode"));
		FRONT_FACE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frontFace"));
		DEPTH_BIAS_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthBiasEnable"));
		DEPTH_BIAS_CONSTANT_FACTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthBiasConstantFactor"));
		DEPTH_BIAS_CLAMP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthBiasClamp"));
		DEPTH_BIAS_SLOPE_FACTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthBiasSlopeFactor"));
		LINE_WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lineWidth"));
		//@formatter:on
	}

	public VkPipelineRasterizationStateCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineRasterizationStateCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineRasterizationStateCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineRasterizationStateCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineRasterizationStateCreateInfo pNext(MemorySegment pNext) {
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
    public VkPipelineRasterizationStateCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthClampEnable()
    public VkPipelineRasterizationStateCreateInfo depthClampEnable(int depthClampEnable) {
    	DEPTH_CLAMP_ENABLE_HANDLE.set(segment, 0L, depthClampEnable);
    	return this;
    }
    
    public int depthClampEnable() {
    	return (int) DEPTH_CLAMP_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #rasterizerDiscardEnable()
    public VkPipelineRasterizationStateCreateInfo rasterizerDiscardEnable(int rasterizerDiscardEnable) {
    	RASTERIZER_DISCARD_ENABLE_HANDLE.set(segment, 0L, rasterizerDiscardEnable);
    	return this;
    }
    
    public int rasterizerDiscardEnable() {
    	return (int) RASTERIZER_DISCARD_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #polygonMode()
    public VkPipelineRasterizationStateCreateInfo polygonMode(int polygonMode) {
    	POLYGON_MODE_HANDLE.set(segment, 0L, polygonMode);
    	return this;
    }
    
    public int polygonMode() {
    	return (int) POLYGON_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #cullMode()
    public VkPipelineRasterizationStateCreateInfo cullMode(int cullMode) {
    	CULL_MODE_HANDLE.set(segment, 0L, cullMode);
    	return this;
    }
    
    public int cullMode() {
    	return (int) CULL_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #frontFace()
    public VkPipelineRasterizationStateCreateInfo frontFace(int frontFace) {
    	FRONT_FACE_HANDLE.set(segment, 0L, frontFace);
    	return this;
    }
    
    public int frontFace() {
    	return (int) FRONT_FACE_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthBiasEnable()
    public VkPipelineRasterizationStateCreateInfo depthBiasEnable(int depthBiasEnable) {
    	DEPTH_BIAS_ENABLE_HANDLE.set(segment, 0L, depthBiasEnable);
    	return this;
    }
    
    public int depthBiasEnable() {
    	return (int) DEPTH_BIAS_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthBiasConstantFactor()
    public VkPipelineRasterizationStateCreateInfo depthBiasConstantFactor(float depthBiasConstantFactor) {
    	DEPTH_BIAS_CONSTANT_FACTOR_HANDLE.set(segment, 0L, depthBiasConstantFactor);
    	return this;
    }
    
    public float depthBiasConstantFactor() {
    	return (float) DEPTH_BIAS_CONSTANT_FACTOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthBiasClamp()
    public VkPipelineRasterizationStateCreateInfo depthBiasClamp(float depthBiasClamp) {
    	DEPTH_BIAS_CLAMP_HANDLE.set(segment, 0L, depthBiasClamp);
    	return this;
    }
    
    public float depthBiasClamp() {
    	return (float) DEPTH_BIAS_CLAMP_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthBiasSlopeFactor()
    public VkPipelineRasterizationStateCreateInfo depthBiasSlopeFactor(float depthBiasSlopeFactor) {
    	DEPTH_BIAS_SLOPE_FACTOR_HANDLE.set(segment, 0L, depthBiasSlopeFactor);
    	return this;
    }
    
    public float depthBiasSlopeFactor() {
    	return (float) DEPTH_BIAS_SLOPE_FACTOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #lineWidth()
    public VkPipelineRasterizationStateCreateInfo lineWidth(float lineWidth) {
    	LINE_WIDTH_HANDLE.set(segment, 0L, lineWidth);
    	return this;
    }
    
    public float lineWidth() {
    	return (float) LINE_WIDTH_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPipelineRasterizationStateCreateInfo set(VkPipelineRasterizationStateCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineRasterizationStateCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineRasterizationStateCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineRasterizationStateCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineRasterizationStateCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineRasterizationStateCreateInfo> array(Arena arena, VkPipelineRasterizationStateCreateInfo... structs) {
        NativeStructArray<VkPipelineRasterizationStateCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineRasterizationStateCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineRasterizationStateCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineRasterizationStateCreateInfo(segment)
        );
    }

}