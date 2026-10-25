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

public final class VkPipelineRobustnessCreateInfo
		implements Struct<VkPipelineRobustnessCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STORAGE_BUFFERS_HANDLE;
	public static final VarHandle UNIFORM_BUFFERS_HANDLE;
	public static final VarHandle VERTEX_INPUTS_HANDLE;
	public static final VarHandle IMAGES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STORAGE_BUFFERS_BYTE_OFFSET;
	public static final long UNIFORM_BUFFERS_BYTE_OFFSET;
	public static final long VERTEX_INPUTS_BYTE_OFFSET;
	public static final long IMAGES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("storageBuffers"),
		    JAVA_INT.withName("uniformBuffers"),
		    JAVA_INT.withName("vertexInputs"),
		    JAVA_INT.withName("images")
		).withName("VkPipelineRobustnessCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STORAGE_BUFFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storageBuffers"));
		UNIFORM_BUFFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uniformBuffers"));
		VERTEX_INPUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexInputs"));
		IMAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("images"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STORAGE_BUFFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storageBuffers"));
		UNIFORM_BUFFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uniformBuffers"));
		VERTEX_INPUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexInputs"));
		IMAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("images"));
		//@formatter:on
	}

	public VkPipelineRobustnessCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineRobustnessCreateInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPipelineRobustnessCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineRobustnessCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineRobustnessCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #storageBuffers()
    public VkPipelineRobustnessCreateInfo storageBuffers(int storageBuffers) {
    	STORAGE_BUFFERS_HANDLE.set(segment, 0L, storageBuffers);
    	return this;
    }
    
    public int storageBuffers() {
    	return (int) STORAGE_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #uniformBuffers()
    public VkPipelineRobustnessCreateInfo uniformBuffers(int uniformBuffers) {
    	UNIFORM_BUFFERS_HANDLE.set(segment, 0L, uniformBuffers);
    	return this;
    }
    
    public int uniformBuffers() {
    	return (int) UNIFORM_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexInputs()
    public VkPipelineRobustnessCreateInfo vertexInputs(int vertexInputs) {
    	VERTEX_INPUTS_HANDLE.set(segment, 0L, vertexInputs);
    	return this;
    }
    
    public int vertexInputs() {
    	return (int) VERTEX_INPUTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #images()
    public VkPipelineRobustnessCreateInfo images(int images) {
    	IMAGES_HANDLE.set(segment, 0L, images);
    	return this;
    }
    
    public int images() {
    	return (int) IMAGES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPipelineRobustnessCreateInfo set(VkPipelineRobustnessCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineRobustnessCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineRobustnessCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineRobustnessCreateInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineRobustnessCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineRobustnessCreateInfo> array(SegmentAllocator allocator, VkPipelineRobustnessCreateInfo... structs) {
        NativeStructArray<VkPipelineRobustnessCreateInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineRobustnessCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineRobustnessCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineRobustnessCreateInfo(segment)
        );
    }

}