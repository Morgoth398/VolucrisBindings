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

public final class VkPhysicalDeviceFloatControlsProperties
		implements Struct<VkPhysicalDeviceFloatControlsProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DENORM_BEHAVIOR_INDEPENDENCE_HANDLE;
	public static final VarHandle ROUNDING_MODE_INDEPENDENCE_HANDLE;
	public static final VarHandle SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT16_HANDLE;
	public static final VarHandle SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT32_HANDLE;
	public static final VarHandle SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT64_HANDLE;
	public static final VarHandle SHADER_DENORM_PRESERVE_FLOAT16_HANDLE;
	public static final VarHandle SHADER_DENORM_PRESERVE_FLOAT32_HANDLE;
	public static final VarHandle SHADER_DENORM_PRESERVE_FLOAT64_HANDLE;
	public static final VarHandle SHADER_DENORM_FLUSH_TO_ZERO_FLOAT16_HANDLE;
	public static final VarHandle SHADER_DENORM_FLUSH_TO_ZERO_FLOAT32_HANDLE;
	public static final VarHandle SHADER_DENORM_FLUSH_TO_ZERO_FLOAT64_HANDLE;
	public static final VarHandle SHADER_ROUNDING_MODE_RTEFLOAT16_HANDLE;
	public static final VarHandle SHADER_ROUNDING_MODE_RTEFLOAT32_HANDLE;
	public static final VarHandle SHADER_ROUNDING_MODE_RTEFLOAT64_HANDLE;
	public static final VarHandle SHADER_ROUNDING_MODE_RTZFLOAT16_HANDLE;
	public static final VarHandle SHADER_ROUNDING_MODE_RTZFLOAT32_HANDLE;
	public static final VarHandle SHADER_ROUNDING_MODE_RTZFLOAT64_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DENORM_BEHAVIOR_INDEPENDENCE_BYTE_OFFSET;
	public static final long ROUNDING_MODE_INDEPENDENCE_BYTE_OFFSET;
	public static final long SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT16_BYTE_OFFSET;
	public static final long SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT32_BYTE_OFFSET;
	public static final long SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT64_BYTE_OFFSET;
	public static final long SHADER_DENORM_PRESERVE_FLOAT16_BYTE_OFFSET;
	public static final long SHADER_DENORM_PRESERVE_FLOAT32_BYTE_OFFSET;
	public static final long SHADER_DENORM_PRESERVE_FLOAT64_BYTE_OFFSET;
	public static final long SHADER_DENORM_FLUSH_TO_ZERO_FLOAT16_BYTE_OFFSET;
	public static final long SHADER_DENORM_FLUSH_TO_ZERO_FLOAT32_BYTE_OFFSET;
	public static final long SHADER_DENORM_FLUSH_TO_ZERO_FLOAT64_BYTE_OFFSET;
	public static final long SHADER_ROUNDING_MODE_RTEFLOAT16_BYTE_OFFSET;
	public static final long SHADER_ROUNDING_MODE_RTEFLOAT32_BYTE_OFFSET;
	public static final long SHADER_ROUNDING_MODE_RTEFLOAT64_BYTE_OFFSET;
	public static final long SHADER_ROUNDING_MODE_RTZFLOAT16_BYTE_OFFSET;
	public static final long SHADER_ROUNDING_MODE_RTZFLOAT32_BYTE_OFFSET;
	public static final long SHADER_ROUNDING_MODE_RTZFLOAT64_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("denormBehaviorIndependence"),
		    JAVA_INT.withName("roundingModeIndependence"),
		    JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat16"),
		    JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat32"),
		    JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat64"),
		    JAVA_INT.withName("shaderDenormPreserveFloat16"),
		    JAVA_INT.withName("shaderDenormPreserveFloat32"),
		    JAVA_INT.withName("shaderDenormPreserveFloat64"),
		    JAVA_INT.withName("shaderDenormFlushToZeroFloat16"),
		    JAVA_INT.withName("shaderDenormFlushToZeroFloat32"),
		    JAVA_INT.withName("shaderDenormFlushToZeroFloat64"),
		    JAVA_INT.withName("shaderRoundingModeRTEFloat16"),
		    JAVA_INT.withName("shaderRoundingModeRTEFloat32"),
		    JAVA_INT.withName("shaderRoundingModeRTEFloat64"),
		    JAVA_INT.withName("shaderRoundingModeRTZFloat16"),
		    JAVA_INT.withName("shaderRoundingModeRTZFloat32"),
		    JAVA_INT.withName("shaderRoundingModeRTZFloat64"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceFloatControlsProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DENORM_BEHAVIOR_INDEPENDENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("denormBehaviorIndependence"));
		ROUNDING_MODE_INDEPENDENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("roundingModeIndependence"));
		SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
		SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
		SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
		SHADER_DENORM_PRESERVE_FLOAT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderDenormPreserveFloat16"));
		SHADER_DENORM_PRESERVE_FLOAT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderDenormPreserveFloat32"));
		SHADER_DENORM_PRESERVE_FLOAT64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderDenormPreserveFloat64"));
		SHADER_DENORM_FLUSH_TO_ZERO_FLOAT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
		SHADER_DENORM_FLUSH_TO_ZERO_FLOAT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
		SHADER_DENORM_FLUSH_TO_ZERO_FLOAT64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
		SHADER_ROUNDING_MODE_RTEFLOAT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
		SHADER_ROUNDING_MODE_RTEFLOAT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
		SHADER_ROUNDING_MODE_RTEFLOAT64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
		SHADER_ROUNDING_MODE_RTZFLOAT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
		SHADER_ROUNDING_MODE_RTZFLOAT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
		SHADER_ROUNDING_MODE_RTZFLOAT64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderRoundingModeRTZFloat64"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DENORM_BEHAVIOR_INDEPENDENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("denormBehaviorIndependence"));
		ROUNDING_MODE_INDEPENDENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("roundingModeIndependence"));
		SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
		SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
		SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
		SHADER_DENORM_PRESERVE_FLOAT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat16"));
		SHADER_DENORM_PRESERVE_FLOAT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat32"));
		SHADER_DENORM_PRESERVE_FLOAT64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat64"));
		SHADER_DENORM_FLUSH_TO_ZERO_FLOAT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
		SHADER_DENORM_FLUSH_TO_ZERO_FLOAT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
		SHADER_DENORM_FLUSH_TO_ZERO_FLOAT64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
		SHADER_ROUNDING_MODE_RTEFLOAT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
		SHADER_ROUNDING_MODE_RTEFLOAT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
		SHADER_ROUNDING_MODE_RTEFLOAT64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
		SHADER_ROUNDING_MODE_RTZFLOAT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
		SHADER_ROUNDING_MODE_RTZFLOAT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
		SHADER_ROUNDING_MODE_RTZFLOAT64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat64"));
		//@formatter:on
	}

	public VkPhysicalDeviceFloatControlsProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceFloatControlsProperties(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceFloatControlsProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceFloatControlsProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceFloatControlsProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #denormBehaviorIndependence()
    public VkPhysicalDeviceFloatControlsProperties denormBehaviorIndependence(int denormBehaviorIndependence) {
    	DENORM_BEHAVIOR_INDEPENDENCE_HANDLE.set(segment, 0L, denormBehaviorIndependence);
    	return this;
    }
    
    public int denormBehaviorIndependence() {
    	return (int) DENORM_BEHAVIOR_INDEPENDENCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #roundingModeIndependence()
    public VkPhysicalDeviceFloatControlsProperties roundingModeIndependence(int roundingModeIndependence) {
    	ROUNDING_MODE_INDEPENDENCE_HANDLE.set(segment, 0L, roundingModeIndependence);
    	return this;
    }
    
    public int roundingModeIndependence() {
    	return (int) ROUNDING_MODE_INDEPENDENCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSignedZeroInfNanPreserveFloat16()
    public VkPhysicalDeviceFloatControlsProperties shaderSignedZeroInfNanPreserveFloat16(int shaderSignedZeroInfNanPreserveFloat16) {
    	SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT16_HANDLE.set(segment, 0L, shaderSignedZeroInfNanPreserveFloat16);
    	return this;
    }
    
    public int shaderSignedZeroInfNanPreserveFloat16() {
    	return (int) SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSignedZeroInfNanPreserveFloat32()
    public VkPhysicalDeviceFloatControlsProperties shaderSignedZeroInfNanPreserveFloat32(int shaderSignedZeroInfNanPreserveFloat32) {
    	SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT32_HANDLE.set(segment, 0L, shaderSignedZeroInfNanPreserveFloat32);
    	return this;
    }
    
    public int shaderSignedZeroInfNanPreserveFloat32() {
    	return (int) SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT32_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSignedZeroInfNanPreserveFloat64()
    public VkPhysicalDeviceFloatControlsProperties shaderSignedZeroInfNanPreserveFloat64(int shaderSignedZeroInfNanPreserveFloat64) {
    	SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT64_HANDLE.set(segment, 0L, shaderSignedZeroInfNanPreserveFloat64);
    	return this;
    }
    
    public int shaderSignedZeroInfNanPreserveFloat64() {
    	return (int) SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT64_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderDenormPreserveFloat16()
    public VkPhysicalDeviceFloatControlsProperties shaderDenormPreserveFloat16(int shaderDenormPreserveFloat16) {
    	SHADER_DENORM_PRESERVE_FLOAT16_HANDLE.set(segment, 0L, shaderDenormPreserveFloat16);
    	return this;
    }
    
    public int shaderDenormPreserveFloat16() {
    	return (int) SHADER_DENORM_PRESERVE_FLOAT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderDenormPreserveFloat32()
    public VkPhysicalDeviceFloatControlsProperties shaderDenormPreserveFloat32(int shaderDenormPreserveFloat32) {
    	SHADER_DENORM_PRESERVE_FLOAT32_HANDLE.set(segment, 0L, shaderDenormPreserveFloat32);
    	return this;
    }
    
    public int shaderDenormPreserveFloat32() {
    	return (int) SHADER_DENORM_PRESERVE_FLOAT32_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderDenormPreserveFloat64()
    public VkPhysicalDeviceFloatControlsProperties shaderDenormPreserveFloat64(int shaderDenormPreserveFloat64) {
    	SHADER_DENORM_PRESERVE_FLOAT64_HANDLE.set(segment, 0L, shaderDenormPreserveFloat64);
    	return this;
    }
    
    public int shaderDenormPreserveFloat64() {
    	return (int) SHADER_DENORM_PRESERVE_FLOAT64_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderDenormFlushToZeroFloat16()
    public VkPhysicalDeviceFloatControlsProperties shaderDenormFlushToZeroFloat16(int shaderDenormFlushToZeroFloat16) {
    	SHADER_DENORM_FLUSH_TO_ZERO_FLOAT16_HANDLE.set(segment, 0L, shaderDenormFlushToZeroFloat16);
    	return this;
    }
    
    public int shaderDenormFlushToZeroFloat16() {
    	return (int) SHADER_DENORM_FLUSH_TO_ZERO_FLOAT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderDenormFlushToZeroFloat32()
    public VkPhysicalDeviceFloatControlsProperties shaderDenormFlushToZeroFloat32(int shaderDenormFlushToZeroFloat32) {
    	SHADER_DENORM_FLUSH_TO_ZERO_FLOAT32_HANDLE.set(segment, 0L, shaderDenormFlushToZeroFloat32);
    	return this;
    }
    
    public int shaderDenormFlushToZeroFloat32() {
    	return (int) SHADER_DENORM_FLUSH_TO_ZERO_FLOAT32_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderDenormFlushToZeroFloat64()
    public VkPhysicalDeviceFloatControlsProperties shaderDenormFlushToZeroFloat64(int shaderDenormFlushToZeroFloat64) {
    	SHADER_DENORM_FLUSH_TO_ZERO_FLOAT64_HANDLE.set(segment, 0L, shaderDenormFlushToZeroFloat64);
    	return this;
    }
    
    public int shaderDenormFlushToZeroFloat64() {
    	return (int) SHADER_DENORM_FLUSH_TO_ZERO_FLOAT64_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderRoundingModeRTEFloat16()
    public VkPhysicalDeviceFloatControlsProperties shaderRoundingModeRTEFloat16(int shaderRoundingModeRTEFloat16) {
    	SHADER_ROUNDING_MODE_RTEFLOAT16_HANDLE.set(segment, 0L, shaderRoundingModeRTEFloat16);
    	return this;
    }
    
    public int shaderRoundingModeRTEFloat16() {
    	return (int) SHADER_ROUNDING_MODE_RTEFLOAT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderRoundingModeRTEFloat32()
    public VkPhysicalDeviceFloatControlsProperties shaderRoundingModeRTEFloat32(int shaderRoundingModeRTEFloat32) {
    	SHADER_ROUNDING_MODE_RTEFLOAT32_HANDLE.set(segment, 0L, shaderRoundingModeRTEFloat32);
    	return this;
    }
    
    public int shaderRoundingModeRTEFloat32() {
    	return (int) SHADER_ROUNDING_MODE_RTEFLOAT32_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderRoundingModeRTEFloat64()
    public VkPhysicalDeviceFloatControlsProperties shaderRoundingModeRTEFloat64(int shaderRoundingModeRTEFloat64) {
    	SHADER_ROUNDING_MODE_RTEFLOAT64_HANDLE.set(segment, 0L, shaderRoundingModeRTEFloat64);
    	return this;
    }
    
    public int shaderRoundingModeRTEFloat64() {
    	return (int) SHADER_ROUNDING_MODE_RTEFLOAT64_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderRoundingModeRTZFloat16()
    public VkPhysicalDeviceFloatControlsProperties shaderRoundingModeRTZFloat16(int shaderRoundingModeRTZFloat16) {
    	SHADER_ROUNDING_MODE_RTZFLOAT16_HANDLE.set(segment, 0L, shaderRoundingModeRTZFloat16);
    	return this;
    }
    
    public int shaderRoundingModeRTZFloat16() {
    	return (int) SHADER_ROUNDING_MODE_RTZFLOAT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderRoundingModeRTZFloat32()
    public VkPhysicalDeviceFloatControlsProperties shaderRoundingModeRTZFloat32(int shaderRoundingModeRTZFloat32) {
    	SHADER_ROUNDING_MODE_RTZFLOAT32_HANDLE.set(segment, 0L, shaderRoundingModeRTZFloat32);
    	return this;
    }
    
    public int shaderRoundingModeRTZFloat32() {
    	return (int) SHADER_ROUNDING_MODE_RTZFLOAT32_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderRoundingModeRTZFloat64()
    public VkPhysicalDeviceFloatControlsProperties shaderRoundingModeRTZFloat64(int shaderRoundingModeRTZFloat64) {
    	SHADER_ROUNDING_MODE_RTZFLOAT64_HANDLE.set(segment, 0L, shaderRoundingModeRTZFloat64);
    	return this;
    }
    
    public int shaderRoundingModeRTZFloat64() {
    	return (int) SHADER_ROUNDING_MODE_RTZFLOAT64_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceFloatControlsProperties set(VkPhysicalDeviceFloatControlsProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceFloatControlsProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceFloatControlsProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceFloatControlsProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFloatControlsProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceFloatControlsProperties> array(Arena arena, VkPhysicalDeviceFloatControlsProperties... structs) {
        NativeStructArray<VkPhysicalDeviceFloatControlsProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFloatControlsProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceFloatControlsProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceFloatControlsProperties(segment)
        );
    }

}