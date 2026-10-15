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

public final class VkPhysicalDeviceShaderFloat8FeaturesEXT
		implements Struct<VkPhysicalDeviceShaderFloat8FeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_FLOAT8_HANDLE;
	public static final VarHandle SHADER_FLOAT8_COOPERATIVE_MATRIX_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_FLOAT8_BYTE_OFFSET;
	public static final long SHADER_FLOAT8_COOPERATIVE_MATRIX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderFloat8"),
		    JAVA_INT.withName("shaderFloat8CooperativeMatrix")
		).withName("VkPhysicalDeviceShaderFloat8FeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_FLOAT8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderFloat8"));
		SHADER_FLOAT8_COOPERATIVE_MATRIX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderFloat8CooperativeMatrix"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_FLOAT8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat8"));
		SHADER_FLOAT8_COOPERATIVE_MATRIX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat8CooperativeMatrix"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderFloat8FeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderFloat8FeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderFloat8FeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderFloat8FeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderFloat8FeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderFloat8()
    public VkPhysicalDeviceShaderFloat8FeaturesEXT shaderFloat8(int shaderFloat8) {
    	SHADER_FLOAT8_HANDLE.set(segment, 0L, shaderFloat8);
    	return this;
    }
    
    public int shaderFloat8() {
    	return (int) SHADER_FLOAT8_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderFloat8CooperativeMatrix()
    public VkPhysicalDeviceShaderFloat8FeaturesEXT shaderFloat8CooperativeMatrix(int shaderFloat8CooperativeMatrix) {
    	SHADER_FLOAT8_COOPERATIVE_MATRIX_HANDLE.set(segment, 0L, shaderFloat8CooperativeMatrix);
    	return this;
    }
    
    public int shaderFloat8CooperativeMatrix() {
    	return (int) SHADER_FLOAT8_COOPERATIVE_MATRIX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderFloat8FeaturesEXT set(VkPhysicalDeviceShaderFloat8FeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderFloat8FeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderFloat8FeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderFloat8FeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderFloat8FeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderFloat8FeaturesEXT> array(Arena arena, VkPhysicalDeviceShaderFloat8FeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceShaderFloat8FeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderFloat8FeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderFloat8FeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderFloat8FeaturesEXT(segment)
        );
    }

}