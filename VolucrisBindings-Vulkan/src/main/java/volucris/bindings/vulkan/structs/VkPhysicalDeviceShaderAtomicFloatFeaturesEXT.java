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

public final class VkPhysicalDeviceShaderAtomicFloatFeaturesEXT
		implements Struct<VkPhysicalDeviceShaderAtomicFloatFeaturesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SHADER_BUFFER_FLOAT32_ATOMICS_HANDLE;
    public static final VarHandle SHADER_BUFFER_FLOAT32_ATOMIC_ADD_HANDLE;
    public static final VarHandle SHADER_BUFFER_FLOAT64_ATOMICS_HANDLE;
    public static final VarHandle SHADER_BUFFER_FLOAT64_ATOMIC_ADD_HANDLE;
    public static final VarHandle SHADER_SHARED_FLOAT32_ATOMICS_HANDLE;
    public static final VarHandle SHADER_SHARED_FLOAT32_ATOMIC_ADD_HANDLE;
    public static final VarHandle SHADER_SHARED_FLOAT64_ATOMICS_HANDLE;
    public static final VarHandle SHADER_SHARED_FLOAT64_ATOMIC_ADD_HANDLE;
    public static final VarHandle SHADER_IMAGE_FLOAT32_ATOMICS_HANDLE;
    public static final VarHandle SHADER_IMAGE_FLOAT32_ATOMIC_ADD_HANDLE;
    public static final VarHandle SPARSE_IMAGE_FLOAT32_ATOMICS_HANDLE;
    public static final VarHandle SPARSE_IMAGE_FLOAT32_ATOMIC_ADD_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SHADER_BUFFER_FLOAT32_ATOMICS_BYTE_OFFSET;
    public static final long SHADER_BUFFER_FLOAT32_ATOMIC_ADD_BYTE_OFFSET;
    public static final long SHADER_BUFFER_FLOAT64_ATOMICS_BYTE_OFFSET;
    public static final long SHADER_BUFFER_FLOAT64_ATOMIC_ADD_BYTE_OFFSET;
    public static final long SHADER_SHARED_FLOAT32_ATOMICS_BYTE_OFFSET;
    public static final long SHADER_SHARED_FLOAT32_ATOMIC_ADD_BYTE_OFFSET;
    public static final long SHADER_SHARED_FLOAT64_ATOMICS_BYTE_OFFSET;
    public static final long SHADER_SHARED_FLOAT64_ATOMIC_ADD_BYTE_OFFSET;
    public static final long SHADER_IMAGE_FLOAT32_ATOMICS_BYTE_OFFSET;
    public static final long SHADER_IMAGE_FLOAT32_ATOMIC_ADD_BYTE_OFFSET;
    public static final long SPARSE_IMAGE_FLOAT32_ATOMICS_BYTE_OFFSET;
    public static final long SPARSE_IMAGE_FLOAT32_ATOMIC_ADD_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("shaderBufferFloat32Atomics"),
            JAVA_INT.withName("shaderBufferFloat32AtomicAdd"),
            JAVA_INT.withName("shaderBufferFloat64Atomics"),
            JAVA_INT.withName("shaderBufferFloat64AtomicAdd"),
            JAVA_INT.withName("shaderSharedFloat32Atomics"),
            JAVA_INT.withName("shaderSharedFloat32AtomicAdd"),
            JAVA_INT.withName("shaderSharedFloat64Atomics"),
            JAVA_INT.withName("shaderSharedFloat64AtomicAdd"),
            JAVA_INT.withName("shaderImageFloat32Atomics"),
            JAVA_INT.withName("shaderImageFloat32AtomicAdd"),
            JAVA_INT.withName("sparseImageFloat32Atomics"),
            JAVA_INT.withName("sparseImageFloat32AtomicAdd")
        ).withName("VkPhysicalDeviceShaderAtomicFloatFeaturesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SHADER_BUFFER_FLOAT32_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderBufferFloat32Atomics"));
        SHADER_BUFFER_FLOAT32_ATOMIC_ADD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderBufferFloat32AtomicAdd"));
        SHADER_BUFFER_FLOAT64_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderBufferFloat64Atomics"));
        SHADER_BUFFER_FLOAT64_ATOMIC_ADD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderBufferFloat64AtomicAdd"));
        SHADER_SHARED_FLOAT32_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSharedFloat32Atomics"));
        SHADER_SHARED_FLOAT32_ATOMIC_ADD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSharedFloat32AtomicAdd"));
        SHADER_SHARED_FLOAT64_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSharedFloat64Atomics"));
        SHADER_SHARED_FLOAT64_ATOMIC_ADD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSharedFloat64AtomicAdd"));
        SHADER_IMAGE_FLOAT32_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderImageFloat32Atomics"));
        SHADER_IMAGE_FLOAT32_ATOMIC_ADD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderImageFloat32AtomicAdd"));
        SPARSE_IMAGE_FLOAT32_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sparseImageFloat32Atomics"));
        SPARSE_IMAGE_FLOAT32_ATOMIC_ADD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sparseImageFloat32AtomicAdd"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SHADER_BUFFER_FLOAT32_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat32Atomics"));
        SHADER_BUFFER_FLOAT32_ATOMIC_ADD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat32AtomicAdd"));
        SHADER_BUFFER_FLOAT64_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat64Atomics"));
        SHADER_BUFFER_FLOAT64_ATOMIC_ADD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat64AtomicAdd"));
        SHADER_SHARED_FLOAT32_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat32Atomics"));
        SHADER_SHARED_FLOAT32_ATOMIC_ADD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat32AtomicAdd"));
        SHADER_SHARED_FLOAT64_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat64Atomics"));
        SHADER_SHARED_FLOAT64_ATOMIC_ADD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat64AtomicAdd"));
        SHADER_IMAGE_FLOAT32_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderImageFloat32Atomics"));
        SHADER_IMAGE_FLOAT32_ATOMIC_ADD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderImageFloat32AtomicAdd"));
        SPARSE_IMAGE_FLOAT32_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sparseImageFloat32Atomics"));
        SPARSE_IMAGE_FLOAT32_ATOMIC_ADD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sparseImageFloat32AtomicAdd"));
        //@formatter:on
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderBufferFloat32Atomics()
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat32Atomics(int shaderBufferFloat32Atomics) {
    	SHADER_BUFFER_FLOAT32_ATOMICS_HANDLE.set(segment, 0L, shaderBufferFloat32Atomics);
    	return this;
    }
    
    public int shaderBufferFloat32Atomics() {
    	return (int) SHADER_BUFFER_FLOAT32_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderBufferFloat32AtomicAdd()
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat32AtomicAdd(int shaderBufferFloat32AtomicAdd) {
    	SHADER_BUFFER_FLOAT32_ATOMIC_ADD_HANDLE.set(segment, 0L, shaderBufferFloat32AtomicAdd);
    	return this;
    }
    
    public int shaderBufferFloat32AtomicAdd() {
    	return (int) SHADER_BUFFER_FLOAT32_ATOMIC_ADD_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderBufferFloat64Atomics()
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat64Atomics(int shaderBufferFloat64Atomics) {
    	SHADER_BUFFER_FLOAT64_ATOMICS_HANDLE.set(segment, 0L, shaderBufferFloat64Atomics);
    	return this;
    }
    
    public int shaderBufferFloat64Atomics() {
    	return (int) SHADER_BUFFER_FLOAT64_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderBufferFloat64AtomicAdd()
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat64AtomicAdd(int shaderBufferFloat64AtomicAdd) {
    	SHADER_BUFFER_FLOAT64_ATOMIC_ADD_HANDLE.set(segment, 0L, shaderBufferFloat64AtomicAdd);
    	return this;
    }
    
    public int shaderBufferFloat64AtomicAdd() {
    	return (int) SHADER_BUFFER_FLOAT64_ATOMIC_ADD_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSharedFloat32Atomics()
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat32Atomics(int shaderSharedFloat32Atomics) {
    	SHADER_SHARED_FLOAT32_ATOMICS_HANDLE.set(segment, 0L, shaderSharedFloat32Atomics);
    	return this;
    }
    
    public int shaderSharedFloat32Atomics() {
    	return (int) SHADER_SHARED_FLOAT32_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSharedFloat32AtomicAdd()
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat32AtomicAdd(int shaderSharedFloat32AtomicAdd) {
    	SHADER_SHARED_FLOAT32_ATOMIC_ADD_HANDLE.set(segment, 0L, shaderSharedFloat32AtomicAdd);
    	return this;
    }
    
    public int shaderSharedFloat32AtomicAdd() {
    	return (int) SHADER_SHARED_FLOAT32_ATOMIC_ADD_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSharedFloat64Atomics()
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat64Atomics(int shaderSharedFloat64Atomics) {
    	SHADER_SHARED_FLOAT64_ATOMICS_HANDLE.set(segment, 0L, shaderSharedFloat64Atomics);
    	return this;
    }
    
    public int shaderSharedFloat64Atomics() {
    	return (int) SHADER_SHARED_FLOAT64_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSharedFloat64AtomicAdd()
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat64AtomicAdd(int shaderSharedFloat64AtomicAdd) {
    	SHADER_SHARED_FLOAT64_ATOMIC_ADD_HANDLE.set(segment, 0L, shaderSharedFloat64AtomicAdd);
    	return this;
    }
    
    public int shaderSharedFloat64AtomicAdd() {
    	return (int) SHADER_SHARED_FLOAT64_ATOMIC_ADD_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderImageFloat32Atomics()
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderImageFloat32Atomics(int shaderImageFloat32Atomics) {
    	SHADER_IMAGE_FLOAT32_ATOMICS_HANDLE.set(segment, 0L, shaderImageFloat32Atomics);
    	return this;
    }
    
    public int shaderImageFloat32Atomics() {
    	return (int) SHADER_IMAGE_FLOAT32_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderImageFloat32AtomicAdd()
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderImageFloat32AtomicAdd(int shaderImageFloat32AtomicAdd) {
    	SHADER_IMAGE_FLOAT32_ATOMIC_ADD_HANDLE.set(segment, 0L, shaderImageFloat32AtomicAdd);
    	return this;
    }
    
    public int shaderImageFloat32AtomicAdd() {
    	return (int) SHADER_IMAGE_FLOAT32_ATOMIC_ADD_HANDLE.get(segment, 0L);
    }
    
    /// @see #sparseImageFloat32Atomics()
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sparseImageFloat32Atomics(int sparseImageFloat32Atomics) {
    	SPARSE_IMAGE_FLOAT32_ATOMICS_HANDLE.set(segment, 0L, sparseImageFloat32Atomics);
    	return this;
    }
    
    public int sparseImageFloat32Atomics() {
    	return (int) SPARSE_IMAGE_FLOAT32_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sparseImageFloat32AtomicAdd()
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sparseImageFloat32AtomicAdd(int sparseImageFloat32AtomicAdd) {
    	SPARSE_IMAGE_FLOAT32_ATOMIC_ADD_HANDLE.set(segment, 0L, sparseImageFloat32AtomicAdd);
    	return this;
    }
    
    public int sparseImageFloat32AtomicAdd() {
    	return (int) SPARSE_IMAGE_FLOAT32_ATOMIC_ADD_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT set(VkPhysicalDeviceShaderAtomicFloatFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderAtomicFloatFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderAtomicFloatFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderAtomicFloatFeaturesEXT> array(Arena arena, VkPhysicalDeviceShaderAtomicFloatFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceShaderAtomicFloatFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderAtomicFloatFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(segment)
        );
    }
    
}