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

public final class VkPhysicalDevicePipelineRobustnessProperties
		implements Struct<VkPhysicalDevicePipelineRobustnessProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DEFAULT_ROBUSTNESS_STORAGE_BUFFERS_HANDLE;
	public static final VarHandle DEFAULT_ROBUSTNESS_UNIFORM_BUFFERS_HANDLE;
	public static final VarHandle DEFAULT_ROBUSTNESS_VERTEX_INPUTS_HANDLE;
	public static final VarHandle DEFAULT_ROBUSTNESS_IMAGES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DEFAULT_ROBUSTNESS_STORAGE_BUFFERS_BYTE_OFFSET;
	public static final long DEFAULT_ROBUSTNESS_UNIFORM_BUFFERS_BYTE_OFFSET;
	public static final long DEFAULT_ROBUSTNESS_VERTEX_INPUTS_BYTE_OFFSET;
	public static final long DEFAULT_ROBUSTNESS_IMAGES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("defaultRobustnessStorageBuffers"),
		    JAVA_INT.withName("defaultRobustnessUniformBuffers"),
		    JAVA_INT.withName("defaultRobustnessVertexInputs"),
		    JAVA_INT.withName("defaultRobustnessImages")
		).withName("VkPhysicalDevicePipelineRobustnessProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DEFAULT_ROBUSTNESS_STORAGE_BUFFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("defaultRobustnessStorageBuffers"));
		DEFAULT_ROBUSTNESS_UNIFORM_BUFFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("defaultRobustnessUniformBuffers"));
		DEFAULT_ROBUSTNESS_VERTEX_INPUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("defaultRobustnessVertexInputs"));
		DEFAULT_ROBUSTNESS_IMAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("defaultRobustnessImages"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DEFAULT_ROBUSTNESS_STORAGE_BUFFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessStorageBuffers"));
		DEFAULT_ROBUSTNESS_UNIFORM_BUFFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessUniformBuffers"));
		DEFAULT_ROBUSTNESS_VERTEX_INPUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessVertexInputs"));
		DEFAULT_ROBUSTNESS_IMAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessImages"));
		//@formatter:on
	}

	public VkPhysicalDevicePipelineRobustnessProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDevicePipelineRobustnessProperties(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDevicePipelineRobustnessProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDevicePipelineRobustnessProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevicePipelineRobustnessProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #defaultRobustnessStorageBuffers()
    public VkPhysicalDevicePipelineRobustnessProperties defaultRobustnessStorageBuffers(int defaultRobustnessStorageBuffers) {
    	DEFAULT_ROBUSTNESS_STORAGE_BUFFERS_HANDLE.set(segment, 0L, defaultRobustnessStorageBuffers);
    	return this;
    }
    
    public int defaultRobustnessStorageBuffers() {
    	return (int) DEFAULT_ROBUSTNESS_STORAGE_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #defaultRobustnessUniformBuffers()
    public VkPhysicalDevicePipelineRobustnessProperties defaultRobustnessUniformBuffers(int defaultRobustnessUniformBuffers) {
    	DEFAULT_ROBUSTNESS_UNIFORM_BUFFERS_HANDLE.set(segment, 0L, defaultRobustnessUniformBuffers);
    	return this;
    }
    
    public int defaultRobustnessUniformBuffers() {
    	return (int) DEFAULT_ROBUSTNESS_UNIFORM_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #defaultRobustnessVertexInputs()
    public VkPhysicalDevicePipelineRobustnessProperties defaultRobustnessVertexInputs(int defaultRobustnessVertexInputs) {
    	DEFAULT_ROBUSTNESS_VERTEX_INPUTS_HANDLE.set(segment, 0L, defaultRobustnessVertexInputs);
    	return this;
    }
    
    public int defaultRobustnessVertexInputs() {
    	return (int) DEFAULT_ROBUSTNESS_VERTEX_INPUTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #defaultRobustnessImages()
    public VkPhysicalDevicePipelineRobustnessProperties defaultRobustnessImages(int defaultRobustnessImages) {
    	DEFAULT_ROBUSTNESS_IMAGES_HANDLE.set(segment, 0L, defaultRobustnessImages);
    	return this;
    }
    
    public int defaultRobustnessImages() {
    	return (int) DEFAULT_ROBUSTNESS_IMAGES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevicePipelineRobustnessProperties set(VkPhysicalDevicePipelineRobustnessProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevicePipelineRobustnessProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevicePipelineRobustnessProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevicePipelineRobustnessProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePipelineRobustnessProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevicePipelineRobustnessProperties> array(Arena arena, VkPhysicalDevicePipelineRobustnessProperties... structs) {
        NativeStructArray<VkPhysicalDevicePipelineRobustnessProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePipelineRobustnessProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevicePipelineRobustnessProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevicePipelineRobustnessProperties(segment)
        );
    }

}