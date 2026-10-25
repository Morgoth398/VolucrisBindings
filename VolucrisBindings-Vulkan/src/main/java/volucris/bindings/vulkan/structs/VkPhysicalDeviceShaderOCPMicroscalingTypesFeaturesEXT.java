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

public final class VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT
		implements Struct<VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_FLOAT4_HANDLE;
	public static final VarHandle SHADER_FLOAT6_HANDLE;
	public static final VarHandle SHADER_FLOAT8_UNSIGNED_E8_M0_HANDLE;
	public static final VarHandle SHADER_MXINT8_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_FLOAT4_BYTE_OFFSET;
	public static final long SHADER_FLOAT6_BYTE_OFFSET;
	public static final long SHADER_FLOAT8_UNSIGNED_E8_M0_BYTE_OFFSET;
	public static final long SHADER_MXINT8_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderFloat4"),
		    JAVA_INT.withName("shaderFloat6"),
		    JAVA_INT.withName("shaderFloat8UnsignedE8M0"),
		    JAVA_INT.withName("shaderMXInt8")
		).withName("VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_FLOAT4_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderFloat4"));
		SHADER_FLOAT6_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderFloat6"));
		SHADER_FLOAT8_UNSIGNED_E8_M0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderFloat8UnsignedE8M0"));
		SHADER_MXINT8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderMXInt8"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_FLOAT4_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat4"));
		SHADER_FLOAT6_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat6"));
		SHADER_FLOAT8_UNSIGNED_E8_M0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat8UnsignedE8M0"));
		SHADER_MXINT8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderMXInt8"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderFloat4()
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT shaderFloat4(int shaderFloat4) {
    	SHADER_FLOAT4_HANDLE.set(segment, 0L, shaderFloat4);
    	return this;
    }
    
    public int shaderFloat4() {
    	return (int) SHADER_FLOAT4_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderFloat6()
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT shaderFloat6(int shaderFloat6) {
    	SHADER_FLOAT6_HANDLE.set(segment, 0L, shaderFloat6);
    	return this;
    }
    
    public int shaderFloat6() {
    	return (int) SHADER_FLOAT6_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderFloat8UnsignedE8M0()
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT shaderFloat8UnsignedE8M0(int shaderFloat8UnsignedE8M0) {
    	SHADER_FLOAT8_UNSIGNED_E8_M0_HANDLE.set(segment, 0L, shaderFloat8UnsignedE8M0);
    	return this;
    }
    
    public int shaderFloat8UnsignedE8M0() {
    	return (int) SHADER_FLOAT8_UNSIGNED_E8_M0_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderMXInt8()
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT shaderMXInt8(int shaderMXInt8) {
    	SHADER_MXINT8_HANDLE.set(segment, 0L, shaderMXInt8);
    	return this;
    }
    
    public int shaderMXInt8() {
    	return (int) SHADER_MXINT8_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT set(VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderOCPMicroscalingTypesFeaturesEXT(segment)
        );
    }

}