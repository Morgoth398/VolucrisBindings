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

public final class VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT
		implements Struct<VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_IMAGE_INT64_ATOMICS_HANDLE;
	public static final VarHandle SPARSE_IMAGE_INT64_ATOMICS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_IMAGE_INT64_ATOMICS_BYTE_OFFSET;
	public static final long SPARSE_IMAGE_INT64_ATOMICS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderImageInt64Atomics"),
		    JAVA_INT.withName("sparseImageInt64Atomics")
		).withName("VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_IMAGE_INT64_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderImageInt64Atomics"));
		SPARSE_IMAGE_INT64_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sparseImageInt64Atomics"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_IMAGE_INT64_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderImageInt64Atomics"));
		SPARSE_IMAGE_INT64_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sparseImageInt64Atomics"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderImageInt64Atomics()
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT shaderImageInt64Atomics(int shaderImageInt64Atomics) {
    	SHADER_IMAGE_INT64_ATOMICS_HANDLE.set(segment, 0L, shaderImageInt64Atomics);
    	return this;
    }
    
    public int shaderImageInt64Atomics() {
    	return (int) SHADER_IMAGE_INT64_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sparseImageInt64Atomics()
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sparseImageInt64Atomics(int sparseImageInt64Atomics) {
    	SPARSE_IMAGE_INT64_ATOMICS_HANDLE.set(segment, 0L, sparseImageInt64Atomics);
    	return this;
    }
    
    public int sparseImageInt64Atomics() {
    	return (int) SPARSE_IMAGE_INT64_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT set(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT> array(Arena arena, VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(segment)
        );
    }

}