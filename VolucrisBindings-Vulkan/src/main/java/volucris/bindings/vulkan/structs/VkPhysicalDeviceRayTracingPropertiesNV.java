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

public final class VkPhysicalDeviceRayTracingPropertiesNV
		implements Struct<VkPhysicalDeviceRayTracingPropertiesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_GROUP_HANDLE_SIZE_HANDLE;
	public static final VarHandle MAX_RECURSION_DEPTH_HANDLE;
	public static final VarHandle MAX_SHADER_GROUP_STRIDE_HANDLE;
	public static final VarHandle SHADER_GROUP_BASE_ALIGNMENT_HANDLE;
	public static final VarHandle MAX_GEOMETRY_COUNT_HANDLE;
	public static final VarHandle MAX_INSTANCE_COUNT_HANDLE;
	public static final VarHandle MAX_TRIANGLE_COUNT_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_ACCELERATION_STRUCTURES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_GROUP_HANDLE_SIZE_BYTE_OFFSET;
	public static final long MAX_RECURSION_DEPTH_BYTE_OFFSET;
	public static final long MAX_SHADER_GROUP_STRIDE_BYTE_OFFSET;
	public static final long SHADER_GROUP_BASE_ALIGNMENT_BYTE_OFFSET;
	public static final long MAX_GEOMETRY_COUNT_BYTE_OFFSET;
	public static final long MAX_INSTANCE_COUNT_BYTE_OFFSET;
	public static final long MAX_TRIANGLE_COUNT_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_ACCELERATION_STRUCTURES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderGroupHandleSize"),
		    JAVA_INT.withName("maxRecursionDepth"),
		    JAVA_INT.withName("maxShaderGroupStride"),
		    JAVA_INT.withName("shaderGroupBaseAlignment"),
		    JAVA_LONG.withName("maxGeometryCount"),
		    JAVA_LONG.withName("maxInstanceCount"),
		    JAVA_LONG.withName("maxTriangleCount"),
		    JAVA_INT.withName("maxDescriptorSetAccelerationStructures"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceRayTracingPropertiesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_GROUP_HANDLE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderGroupHandleSize"));
		MAX_RECURSION_DEPTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxRecursionDepth"));
		MAX_SHADER_GROUP_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxShaderGroupStride"));
		SHADER_GROUP_BASE_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderGroupBaseAlignment"));
		MAX_GEOMETRY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxGeometryCount"));
		MAX_INSTANCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxInstanceCount"));
		MAX_TRIANGLE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTriangleCount"));
		MAX_DESCRIPTOR_SET_ACCELERATION_STRUCTURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_GROUP_HANDLE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupHandleSize"));
		MAX_RECURSION_DEPTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxRecursionDepth"));
		MAX_SHADER_GROUP_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxShaderGroupStride"));
		SHADER_GROUP_BASE_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupBaseAlignment"));
		MAX_GEOMETRY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryCount"));
		MAX_INSTANCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxInstanceCount"));
		MAX_TRIANGLE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTriangleCount"));
		MAX_DESCRIPTOR_SET_ACCELERATION_STRUCTURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));
		//@formatter:on
	}

	public VkPhysicalDeviceRayTracingPropertiesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceRayTracingPropertiesNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceRayTracingPropertiesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceRayTracingPropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceRayTracingPropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderGroupHandleSize()
    public VkPhysicalDeviceRayTracingPropertiesNV shaderGroupHandleSize(int shaderGroupHandleSize) {
    	SHADER_GROUP_HANDLE_SIZE_HANDLE.set(segment, 0L, shaderGroupHandleSize);
    	return this;
    }
    
    public int shaderGroupHandleSize() {
    	return (int) SHADER_GROUP_HANDLE_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxRecursionDepth()
    public VkPhysicalDeviceRayTracingPropertiesNV maxRecursionDepth(int maxRecursionDepth) {
    	MAX_RECURSION_DEPTH_HANDLE.set(segment, 0L, maxRecursionDepth);
    	return this;
    }
    
    public int maxRecursionDepth() {
    	return (int) MAX_RECURSION_DEPTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxShaderGroupStride()
    public VkPhysicalDeviceRayTracingPropertiesNV maxShaderGroupStride(int maxShaderGroupStride) {
    	MAX_SHADER_GROUP_STRIDE_HANDLE.set(segment, 0L, maxShaderGroupStride);
    	return this;
    }
    
    public int maxShaderGroupStride() {
    	return (int) MAX_SHADER_GROUP_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderGroupBaseAlignment()
    public VkPhysicalDeviceRayTracingPropertiesNV shaderGroupBaseAlignment(int shaderGroupBaseAlignment) {
    	SHADER_GROUP_BASE_ALIGNMENT_HANDLE.set(segment, 0L, shaderGroupBaseAlignment);
    	return this;
    }
    
    public int shaderGroupBaseAlignment() {
    	return (int) SHADER_GROUP_BASE_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxGeometryCount()
    public VkPhysicalDeviceRayTracingPropertiesNV maxGeometryCount(long maxGeometryCount) {
    	MAX_GEOMETRY_COUNT_HANDLE.set(segment, 0L, maxGeometryCount);
    	return this;
    }
    
    public long maxGeometryCount() {
    	return (long) MAX_GEOMETRY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxInstanceCount()
    public VkPhysicalDeviceRayTracingPropertiesNV maxInstanceCount(long maxInstanceCount) {
    	MAX_INSTANCE_COUNT_HANDLE.set(segment, 0L, maxInstanceCount);
    	return this;
    }
    
    public long maxInstanceCount() {
    	return (long) MAX_INSTANCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTriangleCount()
    public VkPhysicalDeviceRayTracingPropertiesNV maxTriangleCount(long maxTriangleCount) {
    	MAX_TRIANGLE_COUNT_HANDLE.set(segment, 0L, maxTriangleCount);
    	return this;
    }
    
    public long maxTriangleCount() {
    	return (long) MAX_TRIANGLE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetAccelerationStructures()
    public VkPhysicalDeviceRayTracingPropertiesNV maxDescriptorSetAccelerationStructures(int maxDescriptorSetAccelerationStructures) {
    	MAX_DESCRIPTOR_SET_ACCELERATION_STRUCTURES_HANDLE.set(segment, 0L, maxDescriptorSetAccelerationStructures);
    	return this;
    }
    
    public int maxDescriptorSetAccelerationStructures() {
    	return (int) MAX_DESCRIPTOR_SET_ACCELERATION_STRUCTURES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceRayTracingPropertiesNV set(VkPhysicalDeviceRayTracingPropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceRayTracingPropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceRayTracingPropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingPropertiesNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingPropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingPropertiesNV> array(SegmentAllocator allocator, VkPhysicalDeviceRayTracingPropertiesNV... structs) {
        NativeStructArray<VkPhysicalDeviceRayTracingPropertiesNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingPropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingPropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingPropertiesNV(segment)
        );
    }

}