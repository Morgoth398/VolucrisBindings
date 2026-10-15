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

public final class VkPhysicalDeviceShaderBfloat16FeaturesKHR
		implements Struct<VkPhysicalDeviceShaderBfloat16FeaturesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_BFLOAT16_TYPE_HANDLE;
	public static final VarHandle SHADER_BFLOAT16_DOT_PRODUCT_HANDLE;
	public static final VarHandle SHADER_BFLOAT16_COOPERATIVE_MATRIX_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_BFLOAT16_TYPE_BYTE_OFFSET;
	public static final long SHADER_BFLOAT16_DOT_PRODUCT_BYTE_OFFSET;
	public static final long SHADER_BFLOAT16_COOPERATIVE_MATRIX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderBFloat16Type"),
		    JAVA_INT.withName("shaderBFloat16DotProduct"),
		    JAVA_INT.withName("shaderBFloat16CooperativeMatrix"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceShaderBfloat16FeaturesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_BFLOAT16_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderBFloat16Type"));
		SHADER_BFLOAT16_DOT_PRODUCT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderBFloat16DotProduct"));
		SHADER_BFLOAT16_COOPERATIVE_MATRIX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderBFloat16CooperativeMatrix"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_BFLOAT16_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderBFloat16Type"));
		SHADER_BFLOAT16_DOT_PRODUCT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderBFloat16DotProduct"));
		SHADER_BFLOAT16_COOPERATIVE_MATRIX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderBFloat16CooperativeMatrix"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderBfloat16FeaturesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderBfloat16FeaturesKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderBfloat16FeaturesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderBFloat16Type()
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16Type(int shaderBFloat16Type) {
    	SHADER_BFLOAT16_TYPE_HANDLE.set(segment, 0L, shaderBFloat16Type);
    	return this;
    }
    
    public int shaderBFloat16Type() {
    	return (int) SHADER_BFLOAT16_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderBFloat16DotProduct()
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16DotProduct(int shaderBFloat16DotProduct) {
    	SHADER_BFLOAT16_DOT_PRODUCT_HANDLE.set(segment, 0L, shaderBFloat16DotProduct);
    	return this;
    }
    
    public int shaderBFloat16DotProduct() {
    	return (int) SHADER_BFLOAT16_DOT_PRODUCT_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderBFloat16CooperativeMatrix()
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16CooperativeMatrix(int shaderBFloat16CooperativeMatrix) {
    	SHADER_BFLOAT16_COOPERATIVE_MATRIX_HANDLE.set(segment, 0L, shaderBFloat16CooperativeMatrix);
    	return this;
    }
    
    public int shaderBFloat16CooperativeMatrix() {
    	return (int) SHADER_BFLOAT16_COOPERATIVE_MATRIX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR set(VkPhysicalDeviceShaderBfloat16FeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderBfloat16FeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderBfloat16FeaturesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderBfloat16FeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderBfloat16FeaturesKHR> array(Arena arena, VkPhysicalDeviceShaderBfloat16FeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceShaderBfloat16FeaturesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderBfloat16FeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderBfloat16FeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderBfloat16FeaturesKHR(segment)
        );
    }

}