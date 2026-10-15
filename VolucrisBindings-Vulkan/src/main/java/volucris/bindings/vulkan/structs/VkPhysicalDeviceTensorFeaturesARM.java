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

public final class VkPhysicalDeviceTensorFeaturesARM
		implements Struct<VkPhysicalDeviceTensorFeaturesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TENSOR_NON_PACKED_HANDLE;
	public static final VarHandle SHADER_TENSOR_ACCESS_HANDLE;
	public static final VarHandle SHADER_STORAGE_TENSOR_ARRAY_DYNAMIC_INDEXING_HANDLE;
	public static final VarHandle SHADER_STORAGE_TENSOR_ARRAY_NON_UNIFORM_INDEXING_HANDLE;
	public static final VarHandle DESCRIPTOR_BINDING_STORAGE_TENSOR_UPDATE_AFTER_BIND_HANDLE;
	public static final VarHandle TENSORS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TENSOR_NON_PACKED_BYTE_OFFSET;
	public static final long SHADER_TENSOR_ACCESS_BYTE_OFFSET;
	public static final long SHADER_STORAGE_TENSOR_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET;
	public static final long SHADER_STORAGE_TENSOR_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET;
	public static final long DESCRIPTOR_BINDING_STORAGE_TENSOR_UPDATE_AFTER_BIND_BYTE_OFFSET;
	public static final long TENSORS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("tensorNonPacked"),
		    JAVA_INT.withName("shaderTensorAccess"),
		    JAVA_INT.withName("shaderStorageTensorArrayDynamicIndexing"),
		    JAVA_INT.withName("shaderStorageTensorArrayNonUniformIndexing"),
		    JAVA_INT.withName("descriptorBindingStorageTensorUpdateAfterBind"),
		    JAVA_INT.withName("tensors")
		).withName("VkPhysicalDeviceTensorFeaturesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TENSOR_NON_PACKED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tensorNonPacked"));
		SHADER_TENSOR_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderTensorAccess"));
		SHADER_STORAGE_TENSOR_ARRAY_DYNAMIC_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageTensorArrayDynamicIndexing"));
		SHADER_STORAGE_TENSOR_ARRAY_NON_UNIFORM_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageTensorArrayNonUniformIndexing"));
		DESCRIPTOR_BINDING_STORAGE_TENSOR_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingStorageTensorUpdateAfterBind"));
		TENSORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tensors"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TENSOR_NON_PACKED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tensorNonPacked"));
		SHADER_TENSOR_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderTensorAccess"));
		SHADER_STORAGE_TENSOR_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTensorArrayDynamicIndexing"));
		SHADER_STORAGE_TENSOR_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTensorArrayNonUniformIndexing"));
		DESCRIPTOR_BINDING_STORAGE_TENSOR_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageTensorUpdateAfterBind"));
		TENSORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tensors"));
		//@formatter:on
	}

	public VkPhysicalDeviceTensorFeaturesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceTensorFeaturesARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceTensorFeaturesARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceTensorFeaturesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceTensorFeaturesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #tensorNonPacked()
    public VkPhysicalDeviceTensorFeaturesARM tensorNonPacked(int tensorNonPacked) {
    	TENSOR_NON_PACKED_HANDLE.set(segment, 0L, tensorNonPacked);
    	return this;
    }
    
    public int tensorNonPacked() {
    	return (int) TENSOR_NON_PACKED_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderTensorAccess()
    public VkPhysicalDeviceTensorFeaturesARM shaderTensorAccess(int shaderTensorAccess) {
    	SHADER_TENSOR_ACCESS_HANDLE.set(segment, 0L, shaderTensorAccess);
    	return this;
    }
    
    public int shaderTensorAccess() {
    	return (int) SHADER_TENSOR_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageTensorArrayDynamicIndexing()
    public VkPhysicalDeviceTensorFeaturesARM shaderStorageTensorArrayDynamicIndexing(int shaderStorageTensorArrayDynamicIndexing) {
    	SHADER_STORAGE_TENSOR_ARRAY_DYNAMIC_INDEXING_HANDLE.set(segment, 0L, shaderStorageTensorArrayDynamicIndexing);
    	return this;
    }
    
    public int shaderStorageTensorArrayDynamicIndexing() {
    	return (int) SHADER_STORAGE_TENSOR_ARRAY_DYNAMIC_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageTensorArrayNonUniformIndexing()
    public VkPhysicalDeviceTensorFeaturesARM shaderStorageTensorArrayNonUniformIndexing(int shaderStorageTensorArrayNonUniformIndexing) {
    	SHADER_STORAGE_TENSOR_ARRAY_NON_UNIFORM_INDEXING_HANDLE.set(segment, 0L, shaderStorageTensorArrayNonUniformIndexing);
    	return this;
    }
    
    public int shaderStorageTensorArrayNonUniformIndexing() {
    	return (int) SHADER_STORAGE_TENSOR_ARRAY_NON_UNIFORM_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingStorageTensorUpdateAfterBind()
    public VkPhysicalDeviceTensorFeaturesARM descriptorBindingStorageTensorUpdateAfterBind(int descriptorBindingStorageTensorUpdateAfterBind) {
    	DESCRIPTOR_BINDING_STORAGE_TENSOR_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, descriptorBindingStorageTensorUpdateAfterBind);
    	return this;
    }
    
    public int descriptorBindingStorageTensorUpdateAfterBind() {
    	return (int) DESCRIPTOR_BINDING_STORAGE_TENSOR_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #tensors()
    public VkPhysicalDeviceTensorFeaturesARM tensors(int tensors) {
    	TENSORS_HANDLE.set(segment, 0L, tensors);
    	return this;
    }
    
    public int tensors() {
    	return (int) TENSORS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceTensorFeaturesARM set(VkPhysicalDeviceTensorFeaturesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceTensorFeaturesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceTensorFeaturesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceTensorFeaturesARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceTensorFeaturesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceTensorFeaturesARM> array(Arena arena, VkPhysicalDeviceTensorFeaturesARM... structs) {
        NativeStructArray<VkPhysicalDeviceTensorFeaturesARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceTensorFeaturesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceTensorFeaturesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceTensorFeaturesARM(segment)
        );
    }

}