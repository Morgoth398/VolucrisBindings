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

public final class VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE
		implements Struct<VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT16_ACC_FLOAT32_HANDLE;
    public static final VarHandle SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT16_ACC_FLOAT16_HANDLE;
    public static final VarHandle SHADER_MIXED_FLOAT_DOT_PRODUCT_BFLOAT16_ACC_HANDLE;
    public static final VarHandle SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT8_ACC_FLOAT32_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT16_ACC_FLOAT32_BYTE_OFFSET;
    public static final long SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT16_ACC_FLOAT16_BYTE_OFFSET;
    public static final long SHADER_MIXED_FLOAT_DOT_PRODUCT_BFLOAT16_ACC_BYTE_OFFSET;
    public static final long SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT8_ACC_FLOAT32_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("shaderMixedFloatDotProductFloat16AccFloat32"),
            JAVA_INT.withName("shaderMixedFloatDotProductFloat16AccFloat16"),
            JAVA_INT.withName("shaderMixedFloatDotProductBFloat16Acc"),
            JAVA_INT.withName("shaderMixedFloatDotProductFloat8AccFloat32")
        ).withName("VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT16_ACC_FLOAT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderMixedFloatDotProductFloat16AccFloat32"));
        SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT16_ACC_FLOAT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderMixedFloatDotProductFloat16AccFloat16"));
        SHADER_MIXED_FLOAT_DOT_PRODUCT_BFLOAT16_ACC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderMixedFloatDotProductBFloat16Acc"));
        SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT8_ACC_FLOAT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderMixedFloatDotProductFloat8AccFloat32"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT16_ACC_FLOAT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderMixedFloatDotProductFloat16AccFloat32"));
        SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT16_ACC_FLOAT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderMixedFloatDotProductFloat16AccFloat16"));
        SHADER_MIXED_FLOAT_DOT_PRODUCT_BFLOAT16_ACC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderMixedFloatDotProductBFloat16Acc"));
        SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT8_ACC_FLOAT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderMixedFloatDotProductFloat8AccFloat32"));
        //@formatter:on
    }

    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderMixedFloatDotProductFloat16AccFloat32()
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE shaderMixedFloatDotProductFloat16AccFloat32(int shaderMixedFloatDotProductFloat16AccFloat32) {
    	SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT16_ACC_FLOAT32_HANDLE.set(segment, 0L, shaderMixedFloatDotProductFloat16AccFloat32);
    	return this;
    }
    
    public int shaderMixedFloatDotProductFloat16AccFloat32() {
    	return (int) SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT16_ACC_FLOAT32_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderMixedFloatDotProductFloat16AccFloat16()
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE shaderMixedFloatDotProductFloat16AccFloat16(int shaderMixedFloatDotProductFloat16AccFloat16) {
    	SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT16_ACC_FLOAT16_HANDLE.set(segment, 0L, shaderMixedFloatDotProductFloat16AccFloat16);
    	return this;
    }
    
    public int shaderMixedFloatDotProductFloat16AccFloat16() {
    	return (int) SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT16_ACC_FLOAT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderMixedFloatDotProductBFloat16Acc()
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE shaderMixedFloatDotProductBFloat16Acc(int shaderMixedFloatDotProductBFloat16Acc) {
    	SHADER_MIXED_FLOAT_DOT_PRODUCT_BFLOAT16_ACC_HANDLE.set(segment, 0L, shaderMixedFloatDotProductBFloat16Acc);
    	return this;
    }
    
    public int shaderMixedFloatDotProductBFloat16Acc() {
    	return (int) SHADER_MIXED_FLOAT_DOT_PRODUCT_BFLOAT16_ACC_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderMixedFloatDotProductFloat8AccFloat32()
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE shaderMixedFloatDotProductFloat8AccFloat32(int shaderMixedFloatDotProductFloat8AccFloat32) {
    	SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT8_ACC_FLOAT32_HANDLE.set(segment, 0L, shaderMixedFloatDotProductFloat8AccFloat32);
    	return this;
    }
    
    public int shaderMixedFloatDotProductFloat8AccFloat32() {
    	return (int) SHADER_MIXED_FLOAT_DOT_PRODUCT_FLOAT8_ACC_FLOAT32_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE set(VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE> array(Arena arena, VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE... structs) {
        NativeStructArray<VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderMixedFloatDotProductFeaturesVALVE(segment)
        );
    }
    
}