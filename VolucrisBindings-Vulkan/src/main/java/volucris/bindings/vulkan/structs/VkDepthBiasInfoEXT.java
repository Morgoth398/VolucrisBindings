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

public final class VkDepthBiasInfoEXT
		implements Struct<VkDepthBiasInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DEPTH_BIAS_CONSTANT_FACTOR_HANDLE;
	public static final VarHandle DEPTH_BIAS_CLAMP_HANDLE;
	public static final VarHandle DEPTH_BIAS_SLOPE_FACTOR_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DEPTH_BIAS_CONSTANT_FACTOR_BYTE_OFFSET;
	public static final long DEPTH_BIAS_CLAMP_BYTE_OFFSET;
	public static final long DEPTH_BIAS_SLOPE_FACTOR_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_FLOAT.withName("depthBiasConstantFactor"),
		    JAVA_FLOAT.withName("depthBiasClamp"),
		    JAVA_FLOAT.withName("depthBiasSlopeFactor"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDepthBiasInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DEPTH_BIAS_CONSTANT_FACTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthBiasConstantFactor"));
		DEPTH_BIAS_CLAMP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthBiasClamp"));
		DEPTH_BIAS_SLOPE_FACTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthBiasSlopeFactor"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DEPTH_BIAS_CONSTANT_FACTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthBiasConstantFactor"));
		DEPTH_BIAS_CLAMP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthBiasClamp"));
		DEPTH_BIAS_SLOPE_FACTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthBiasSlopeFactor"));
		//@formatter:on
	}

	public VkDepthBiasInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDepthBiasInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDepthBiasInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDepthBiasInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDepthBiasInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #depthBiasConstantFactor()
    public VkDepthBiasInfoEXT depthBiasConstantFactor(float depthBiasConstantFactor) {
    	DEPTH_BIAS_CONSTANT_FACTOR_HANDLE.set(segment, 0L, depthBiasConstantFactor);
    	return this;
    }
    
    public float depthBiasConstantFactor() {
    	return (float) DEPTH_BIAS_CONSTANT_FACTOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthBiasClamp()
    public VkDepthBiasInfoEXT depthBiasClamp(float depthBiasClamp) {
    	DEPTH_BIAS_CLAMP_HANDLE.set(segment, 0L, depthBiasClamp);
    	return this;
    }
    
    public float depthBiasClamp() {
    	return (float) DEPTH_BIAS_CLAMP_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthBiasSlopeFactor()
    public VkDepthBiasInfoEXT depthBiasSlopeFactor(float depthBiasSlopeFactor) {
    	DEPTH_BIAS_SLOPE_FACTOR_HANDLE.set(segment, 0L, depthBiasSlopeFactor);
    	return this;
    }
    
    public float depthBiasSlopeFactor() {
    	return (float) DEPTH_BIAS_SLOPE_FACTOR_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDepthBiasInfoEXT set(VkDepthBiasInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDepthBiasInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDepthBiasInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDepthBiasInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDepthBiasInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDepthBiasInfoEXT> array(Arena arena, VkDepthBiasInfoEXT... structs) {
        NativeStructArray<VkDepthBiasInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDepthBiasInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDepthBiasInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDepthBiasInfoEXT(segment)
        );
    }

}