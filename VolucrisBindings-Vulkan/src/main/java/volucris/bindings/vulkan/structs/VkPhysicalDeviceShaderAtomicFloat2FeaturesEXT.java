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

public final class VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT
		implements Struct<VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_BUFFER_FLOAT16_ATOMICS_HANDLE;
	public static final VarHandle SHADER_BUFFER_FLOAT16_ATOMIC_ADD_HANDLE;
	public static final VarHandle SHADER_BUFFER_FLOAT16_ATOMIC_MIN_MAX_HANDLE;
	public static final VarHandle SHADER_BUFFER_FLOAT32_ATOMIC_MIN_MAX_HANDLE;
	public static final VarHandle SHADER_BUFFER_FLOAT64_ATOMIC_MIN_MAX_HANDLE;
	public static final VarHandle SHADER_SHARED_FLOAT16_ATOMICS_HANDLE;
	public static final VarHandle SHADER_SHARED_FLOAT16_ATOMIC_ADD_HANDLE;
	public static final VarHandle SHADER_SHARED_FLOAT16_ATOMIC_MIN_MAX_HANDLE;
	public static final VarHandle SHADER_SHARED_FLOAT32_ATOMIC_MIN_MAX_HANDLE;
	public static final VarHandle SHADER_SHARED_FLOAT64_ATOMIC_MIN_MAX_HANDLE;
	public static final VarHandle SHADER_IMAGE_FLOAT32_ATOMIC_MIN_MAX_HANDLE;
	public static final VarHandle SPARSE_IMAGE_FLOAT32_ATOMIC_MIN_MAX_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_BUFFER_FLOAT16_ATOMICS_BYTE_OFFSET;
	public static final long SHADER_BUFFER_FLOAT16_ATOMIC_ADD_BYTE_OFFSET;
	public static final long SHADER_BUFFER_FLOAT16_ATOMIC_MIN_MAX_BYTE_OFFSET;
	public static final long SHADER_BUFFER_FLOAT32_ATOMIC_MIN_MAX_BYTE_OFFSET;
	public static final long SHADER_BUFFER_FLOAT64_ATOMIC_MIN_MAX_BYTE_OFFSET;
	public static final long SHADER_SHARED_FLOAT16_ATOMICS_BYTE_OFFSET;
	public static final long SHADER_SHARED_FLOAT16_ATOMIC_ADD_BYTE_OFFSET;
	public static final long SHADER_SHARED_FLOAT16_ATOMIC_MIN_MAX_BYTE_OFFSET;
	public static final long SHADER_SHARED_FLOAT32_ATOMIC_MIN_MAX_BYTE_OFFSET;
	public static final long SHADER_SHARED_FLOAT64_ATOMIC_MIN_MAX_BYTE_OFFSET;
	public static final long SHADER_IMAGE_FLOAT32_ATOMIC_MIN_MAX_BYTE_OFFSET;
	public static final long SPARSE_IMAGE_FLOAT32_ATOMIC_MIN_MAX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderBufferFloat16Atomics"),
		    JAVA_INT.withName("shaderBufferFloat16AtomicAdd"),
		    JAVA_INT.withName("shaderBufferFloat16AtomicMinMax"),
		    JAVA_INT.withName("shaderBufferFloat32AtomicMinMax"),
		    JAVA_INT.withName("shaderBufferFloat64AtomicMinMax"),
		    JAVA_INT.withName("shaderSharedFloat16Atomics"),
		    JAVA_INT.withName("shaderSharedFloat16AtomicAdd"),
		    JAVA_INT.withName("shaderSharedFloat16AtomicMinMax"),
		    JAVA_INT.withName("shaderSharedFloat32AtomicMinMax"),
		    JAVA_INT.withName("shaderSharedFloat64AtomicMinMax"),
		    JAVA_INT.withName("shaderImageFloat32AtomicMinMax"),
		    JAVA_INT.withName("sparseImageFloat32AtomicMinMax")
		).withName("VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_BUFFER_FLOAT16_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderBufferFloat16Atomics"));
		SHADER_BUFFER_FLOAT16_ATOMIC_ADD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderBufferFloat16AtomicAdd"));
		SHADER_BUFFER_FLOAT16_ATOMIC_MIN_MAX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderBufferFloat16AtomicMinMax"));
		SHADER_BUFFER_FLOAT32_ATOMIC_MIN_MAX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderBufferFloat32AtomicMinMax"));
		SHADER_BUFFER_FLOAT64_ATOMIC_MIN_MAX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderBufferFloat64AtomicMinMax"));
		SHADER_SHARED_FLOAT16_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSharedFloat16Atomics"));
		SHADER_SHARED_FLOAT16_ATOMIC_ADD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSharedFloat16AtomicAdd"));
		SHADER_SHARED_FLOAT16_ATOMIC_MIN_MAX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSharedFloat16AtomicMinMax"));
		SHADER_SHARED_FLOAT32_ATOMIC_MIN_MAX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSharedFloat32AtomicMinMax"));
		SHADER_SHARED_FLOAT64_ATOMIC_MIN_MAX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSharedFloat64AtomicMinMax"));
		SHADER_IMAGE_FLOAT32_ATOMIC_MIN_MAX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderImageFloat32AtomicMinMax"));
		SPARSE_IMAGE_FLOAT32_ATOMIC_MIN_MAX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sparseImageFloat32AtomicMinMax"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_BUFFER_FLOAT16_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat16Atomics"));
		SHADER_BUFFER_FLOAT16_ATOMIC_ADD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat16AtomicAdd"));
		SHADER_BUFFER_FLOAT16_ATOMIC_MIN_MAX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat16AtomicMinMax"));
		SHADER_BUFFER_FLOAT32_ATOMIC_MIN_MAX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat32AtomicMinMax"));
		SHADER_BUFFER_FLOAT64_ATOMIC_MIN_MAX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat64AtomicMinMax"));
		SHADER_SHARED_FLOAT16_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat16Atomics"));
		SHADER_SHARED_FLOAT16_ATOMIC_ADD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat16AtomicAdd"));
		SHADER_SHARED_FLOAT16_ATOMIC_MIN_MAX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat16AtomicMinMax"));
		SHADER_SHARED_FLOAT32_ATOMIC_MIN_MAX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat32AtomicMinMax"));
		SHADER_SHARED_FLOAT64_ATOMIC_MIN_MAX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat64AtomicMinMax"));
		SHADER_IMAGE_FLOAT32_ATOMIC_MIN_MAX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderImageFloat32AtomicMinMax"));
		SPARSE_IMAGE_FLOAT32_ATOMIC_MIN_MAX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sparseImageFloat32AtomicMinMax"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderBufferFloat16Atomics()
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16Atomics(int shaderBufferFloat16Atomics) {
    	SHADER_BUFFER_FLOAT16_ATOMICS_HANDLE.set(segment, 0L, shaderBufferFloat16Atomics);
    	return this;
    }
    
    public int shaderBufferFloat16Atomics() {
    	return (int) SHADER_BUFFER_FLOAT16_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderBufferFloat16AtomicAdd()
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicAdd(int shaderBufferFloat16AtomicAdd) {
    	SHADER_BUFFER_FLOAT16_ATOMIC_ADD_HANDLE.set(segment, 0L, shaderBufferFloat16AtomicAdd);
    	return this;
    }
    
    public int shaderBufferFloat16AtomicAdd() {
    	return (int) SHADER_BUFFER_FLOAT16_ATOMIC_ADD_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderBufferFloat16AtomicMinMax()
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicMinMax(int shaderBufferFloat16AtomicMinMax) {
    	SHADER_BUFFER_FLOAT16_ATOMIC_MIN_MAX_HANDLE.set(segment, 0L, shaderBufferFloat16AtomicMinMax);
    	return this;
    }
    
    public int shaderBufferFloat16AtomicMinMax() {
    	return (int) SHADER_BUFFER_FLOAT16_ATOMIC_MIN_MAX_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderBufferFloat32AtomicMinMax()
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat32AtomicMinMax(int shaderBufferFloat32AtomicMinMax) {
    	SHADER_BUFFER_FLOAT32_ATOMIC_MIN_MAX_HANDLE.set(segment, 0L, shaderBufferFloat32AtomicMinMax);
    	return this;
    }
    
    public int shaderBufferFloat32AtomicMinMax() {
    	return (int) SHADER_BUFFER_FLOAT32_ATOMIC_MIN_MAX_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderBufferFloat64AtomicMinMax()
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat64AtomicMinMax(int shaderBufferFloat64AtomicMinMax) {
    	SHADER_BUFFER_FLOAT64_ATOMIC_MIN_MAX_HANDLE.set(segment, 0L, shaderBufferFloat64AtomicMinMax);
    	return this;
    }
    
    public int shaderBufferFloat64AtomicMinMax() {
    	return (int) SHADER_BUFFER_FLOAT64_ATOMIC_MIN_MAX_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSharedFloat16Atomics()
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16Atomics(int shaderSharedFloat16Atomics) {
    	SHADER_SHARED_FLOAT16_ATOMICS_HANDLE.set(segment, 0L, shaderSharedFloat16Atomics);
    	return this;
    }
    
    public int shaderSharedFloat16Atomics() {
    	return (int) SHADER_SHARED_FLOAT16_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSharedFloat16AtomicAdd()
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicAdd(int shaderSharedFloat16AtomicAdd) {
    	SHADER_SHARED_FLOAT16_ATOMIC_ADD_HANDLE.set(segment, 0L, shaderSharedFloat16AtomicAdd);
    	return this;
    }
    
    public int shaderSharedFloat16AtomicAdd() {
    	return (int) SHADER_SHARED_FLOAT16_ATOMIC_ADD_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSharedFloat16AtomicMinMax()
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicMinMax(int shaderSharedFloat16AtomicMinMax) {
    	SHADER_SHARED_FLOAT16_ATOMIC_MIN_MAX_HANDLE.set(segment, 0L, shaderSharedFloat16AtomicMinMax);
    	return this;
    }
    
    public int shaderSharedFloat16AtomicMinMax() {
    	return (int) SHADER_SHARED_FLOAT16_ATOMIC_MIN_MAX_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSharedFloat32AtomicMinMax()
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat32AtomicMinMax(int shaderSharedFloat32AtomicMinMax) {
    	SHADER_SHARED_FLOAT32_ATOMIC_MIN_MAX_HANDLE.set(segment, 0L, shaderSharedFloat32AtomicMinMax);
    	return this;
    }
    
    public int shaderSharedFloat32AtomicMinMax() {
    	return (int) SHADER_SHARED_FLOAT32_ATOMIC_MIN_MAX_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSharedFloat64AtomicMinMax()
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat64AtomicMinMax(int shaderSharedFloat64AtomicMinMax) {
    	SHADER_SHARED_FLOAT64_ATOMIC_MIN_MAX_HANDLE.set(segment, 0L, shaderSharedFloat64AtomicMinMax);
    	return this;
    }
    
    public int shaderSharedFloat64AtomicMinMax() {
    	return (int) SHADER_SHARED_FLOAT64_ATOMIC_MIN_MAX_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderImageFloat32AtomicMinMax()
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderImageFloat32AtomicMinMax(int shaderImageFloat32AtomicMinMax) {
    	SHADER_IMAGE_FLOAT32_ATOMIC_MIN_MAX_HANDLE.set(segment, 0L, shaderImageFloat32AtomicMinMax);
    	return this;
    }
    
    public int shaderImageFloat32AtomicMinMax() {
    	return (int) SHADER_IMAGE_FLOAT32_ATOMIC_MIN_MAX_HANDLE.get(segment, 0L);
    }
    
    /// @see #sparseImageFloat32AtomicMinMax()
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sparseImageFloat32AtomicMinMax(int sparseImageFloat32AtomicMinMax) {
    	SPARSE_IMAGE_FLOAT32_ATOMIC_MIN_MAX_HANDLE.set(segment, 0L, sparseImageFloat32AtomicMinMax);
    	return this;
    }
    
    public int sparseImageFloat32AtomicMinMax() {
    	return (int) SPARSE_IMAGE_FLOAT32_ATOMIC_MIN_MAX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT set(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(segment)
        );
    }

}