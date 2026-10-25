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

public final class VkPhysicalDeviceShaderFmaFeaturesKHR
		implements Struct<VkPhysicalDeviceShaderFmaFeaturesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_FMA_FLOAT16_HANDLE;
	public static final VarHandle SHADER_FMA_FLOAT32_HANDLE;
	public static final VarHandle SHADER_FMA_FLOAT64_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_FMA_FLOAT16_BYTE_OFFSET;
	public static final long SHADER_FMA_FLOAT32_BYTE_OFFSET;
	public static final long SHADER_FMA_FLOAT64_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderFmaFloat16"),
		    JAVA_INT.withName("shaderFmaFloat32"),
		    JAVA_INT.withName("shaderFmaFloat64"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceShaderFmaFeaturesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_FMA_FLOAT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderFmaFloat16"));
		SHADER_FMA_FLOAT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderFmaFloat32"));
		SHADER_FMA_FLOAT64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderFmaFloat64"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_FMA_FLOAT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderFmaFloat16"));
		SHADER_FMA_FLOAT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderFmaFloat32"));
		SHADER_FMA_FLOAT64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderFmaFloat64"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderFmaFeaturesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderFmaFeaturesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderFmaFeaturesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderFmaFeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderFmaFeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderFmaFloat16()
    public VkPhysicalDeviceShaderFmaFeaturesKHR shaderFmaFloat16(int shaderFmaFloat16) {
    	SHADER_FMA_FLOAT16_HANDLE.set(segment, 0L, shaderFmaFloat16);
    	return this;
    }
    
    public int shaderFmaFloat16() {
    	return (int) SHADER_FMA_FLOAT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderFmaFloat32()
    public VkPhysicalDeviceShaderFmaFeaturesKHR shaderFmaFloat32(int shaderFmaFloat32) {
    	SHADER_FMA_FLOAT32_HANDLE.set(segment, 0L, shaderFmaFloat32);
    	return this;
    }
    
    public int shaderFmaFloat32() {
    	return (int) SHADER_FMA_FLOAT32_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderFmaFloat64()
    public VkPhysicalDeviceShaderFmaFeaturesKHR shaderFmaFloat64(int shaderFmaFloat64) {
    	SHADER_FMA_FLOAT64_HANDLE.set(segment, 0L, shaderFmaFloat64);
    	return this;
    }
    
    public int shaderFmaFloat64() {
    	return (int) SHADER_FMA_FLOAT64_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderFmaFeaturesKHR set(VkPhysicalDeviceShaderFmaFeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderFmaFeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderFmaFeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderFmaFeaturesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderFmaFeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderFmaFeaturesKHR> array(SegmentAllocator allocator, VkPhysicalDeviceShaderFmaFeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceShaderFmaFeaturesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderFmaFeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderFmaFeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderFmaFeaturesKHR(segment)
        );
    }

}