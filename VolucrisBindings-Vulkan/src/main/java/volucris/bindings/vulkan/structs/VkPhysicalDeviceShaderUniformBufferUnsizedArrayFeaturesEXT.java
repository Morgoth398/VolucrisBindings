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

public final class VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT
		implements Struct<VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_UNIFORM_BUFFER_UNSIZED_ARRAY_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_UNIFORM_BUFFER_UNSIZED_ARRAY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderUniformBufferUnsizedArray"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_UNIFORM_BUFFER_UNSIZED_ARRAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderUniformBufferUnsizedArray"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_UNIFORM_BUFFER_UNSIZED_ARRAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformBufferUnsizedArray"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderUniformBufferUnsizedArray()
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT shaderUniformBufferUnsizedArray(int shaderUniformBufferUnsizedArray) {
    	SHADER_UNIFORM_BUFFER_UNSIZED_ARRAY_HANDLE.set(segment, 0L, shaderUniformBufferUnsizedArray);
    	return this;
    }
    
    public int shaderUniformBufferUnsizedArray() {
    	return (int) SHADER_UNIFORM_BUFFER_UNSIZED_ARRAY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT set(VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT> array(Arena arena, VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT(segment)
        );
    }

}