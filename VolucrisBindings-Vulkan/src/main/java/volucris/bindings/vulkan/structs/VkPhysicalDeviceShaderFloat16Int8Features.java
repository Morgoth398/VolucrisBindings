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

public final class VkPhysicalDeviceShaderFloat16Int8Features
		implements Struct<VkPhysicalDeviceShaderFloat16Int8Features> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_FLOAT16_HANDLE;
	public static final VarHandle SHADER_INT8_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_FLOAT16_BYTE_OFFSET;
	public static final long SHADER_INT8_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderFloat16"),
		    JAVA_INT.withName("shaderInt8")
		).withName("VkPhysicalDeviceShaderFloat16Int8Features").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_FLOAT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderFloat16"));
		SHADER_INT8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderInt8"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_FLOAT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat16"));
		SHADER_INT8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderInt8"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderFloat16Int8Features() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderFloat16Int8Features(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderFloat16Int8Features(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderFloat16Int8Features sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderFloat16Int8Features pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderFloat16()
    public VkPhysicalDeviceShaderFloat16Int8Features shaderFloat16(int shaderFloat16) {
    	SHADER_FLOAT16_HANDLE.set(segment, 0L, shaderFloat16);
    	return this;
    }
    
    public int shaderFloat16() {
    	return (int) SHADER_FLOAT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderInt8()
    public VkPhysicalDeviceShaderFloat16Int8Features shaderInt8(int shaderInt8) {
    	SHADER_INT8_HANDLE.set(segment, 0L, shaderInt8);
    	return this;
    }
    
    public int shaderInt8() {
    	return (int) SHADER_INT8_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderFloat16Int8Features set(VkPhysicalDeviceShaderFloat16Int8Features other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderFloat16Int8Features set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderFloat16Int8Features> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderFloat16Int8Features> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderFloat16Int8Features(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderFloat16Int8Features> array(SegmentAllocator allocator, VkPhysicalDeviceShaderFloat16Int8Features... structs) {
        NativeStructArray<VkPhysicalDeviceShaderFloat16Int8Features> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderFloat16Int8Features(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderFloat16Int8Features> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderFloat16Int8Features(segment)
        );
    }

}