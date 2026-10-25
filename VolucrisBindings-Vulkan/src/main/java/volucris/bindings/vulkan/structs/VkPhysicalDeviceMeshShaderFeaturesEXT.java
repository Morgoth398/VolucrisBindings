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

public final class VkPhysicalDeviceMeshShaderFeaturesEXT
		implements Struct<VkPhysicalDeviceMeshShaderFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TASK_SHADER_HANDLE;
	public static final VarHandle MESH_SHADER_HANDLE;
	public static final VarHandle MULTIVIEW_MESH_SHADER_HANDLE;
	public static final VarHandle PRIMITIVE_FRAGMENT_SHADING_RATE_MESH_SHADER_HANDLE;
	public static final VarHandle MESH_SHADER_QUERIES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TASK_SHADER_BYTE_OFFSET;
	public static final long MESH_SHADER_BYTE_OFFSET;
	public static final long MULTIVIEW_MESH_SHADER_BYTE_OFFSET;
	public static final long PRIMITIVE_FRAGMENT_SHADING_RATE_MESH_SHADER_BYTE_OFFSET;
	public static final long MESH_SHADER_QUERIES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("taskShader"),
		    JAVA_INT.withName("meshShader"),
		    JAVA_INT.withName("multiviewMeshShader"),
		    JAVA_INT.withName("primitiveFragmentShadingRateMeshShader"),
		    JAVA_INT.withName("meshShaderQueries"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceMeshShaderFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TASK_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("taskShader"));
		MESH_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("meshShader"));
		MULTIVIEW_MESH_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("multiviewMeshShader"));
		PRIMITIVE_FRAGMENT_SHADING_RATE_MESH_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primitiveFragmentShadingRateMeshShader"));
		MESH_SHADER_QUERIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("meshShaderQueries"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TASK_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("taskShader"));
		MESH_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("meshShader"));
		MULTIVIEW_MESH_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("multiviewMeshShader"));
		PRIMITIVE_FRAGMENT_SHADING_RATE_MESH_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primitiveFragmentShadingRateMeshShader"));
		MESH_SHADER_QUERIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("meshShaderQueries"));
		//@formatter:on
	}

	public VkPhysicalDeviceMeshShaderFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceMeshShaderFeaturesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceMeshShaderFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceMeshShaderFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMeshShaderFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #taskShader()
    public VkPhysicalDeviceMeshShaderFeaturesEXT taskShader(int taskShader) {
    	TASK_SHADER_HANDLE.set(segment, 0L, taskShader);
    	return this;
    }
    
    public int taskShader() {
    	return (int) TASK_SHADER_HANDLE.get(segment, 0L);
    }
    
    /// @see #meshShader()
    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShader(int meshShader) {
    	MESH_SHADER_HANDLE.set(segment, 0L, meshShader);
    	return this;
    }
    
    public int meshShader() {
    	return (int) MESH_SHADER_HANDLE.get(segment, 0L);
    }
    
    /// @see #multiviewMeshShader()
    public VkPhysicalDeviceMeshShaderFeaturesEXT multiviewMeshShader(int multiviewMeshShader) {
    	MULTIVIEW_MESH_SHADER_HANDLE.set(segment, 0L, multiviewMeshShader);
    	return this;
    }
    
    public int multiviewMeshShader() {
    	return (int) MULTIVIEW_MESH_SHADER_HANDLE.get(segment, 0L);
    }
    
    /// @see #primitiveFragmentShadingRateMeshShader()
    public VkPhysicalDeviceMeshShaderFeaturesEXT primitiveFragmentShadingRateMeshShader(int primitiveFragmentShadingRateMeshShader) {
    	PRIMITIVE_FRAGMENT_SHADING_RATE_MESH_SHADER_HANDLE.set(segment, 0L, primitiveFragmentShadingRateMeshShader);
    	return this;
    }
    
    public int primitiveFragmentShadingRateMeshShader() {
    	return (int) PRIMITIVE_FRAGMENT_SHADING_RATE_MESH_SHADER_HANDLE.get(segment, 0L);
    }
    
    /// @see #meshShaderQueries()
    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShaderQueries(int meshShaderQueries) {
    	MESH_SHADER_QUERIES_HANDLE.set(segment, 0L, meshShaderQueries);
    	return this;
    }
    
    public int meshShaderQueries() {
    	return (int) MESH_SHADER_QUERIES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMeshShaderFeaturesEXT set(VkPhysicalDeviceMeshShaderFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMeshShaderFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMeshShaderFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMeshShaderFeaturesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceMeshShaderFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMeshShaderFeaturesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceMeshShaderFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceMeshShaderFeaturesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceMeshShaderFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMeshShaderFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMeshShaderFeaturesEXT(segment)
        );
    }

}