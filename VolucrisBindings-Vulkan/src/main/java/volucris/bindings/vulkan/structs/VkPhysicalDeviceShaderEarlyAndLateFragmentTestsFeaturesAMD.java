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

public final class VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD
		implements Struct<VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderEarlyAndLateFragmentTests"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderEarlyAndLateFragmentTests"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderEarlyAndLateFragmentTests"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderEarlyAndLateFragmentTests()
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD shaderEarlyAndLateFragmentTests(int shaderEarlyAndLateFragmentTests) {
    	SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_HANDLE.set(segment, 0L, shaderEarlyAndLateFragmentTests);
    	return this;
    }
    
    public int shaderEarlyAndLateFragmentTests() {
    	return (int) SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD set(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD> array(Arena arena, VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD... structs) {
        NativeStructArray<VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(segment)
        );
    }

}