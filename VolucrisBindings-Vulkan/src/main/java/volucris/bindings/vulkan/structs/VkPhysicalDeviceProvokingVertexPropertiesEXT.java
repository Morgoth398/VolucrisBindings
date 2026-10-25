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

public final class VkPhysicalDeviceProvokingVertexPropertiesEXT
		implements Struct<VkPhysicalDeviceProvokingVertexPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PROVOKING_VERTEX_MODE_PER_PIPELINE_HANDLE;
	public static final VarHandle TRANSFORM_FEEDBACK_PRESERVES_TRIANGLE_FAN_PROVOKING_VERTEX_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PROVOKING_VERTEX_MODE_PER_PIPELINE_BYTE_OFFSET;
	public static final long TRANSFORM_FEEDBACK_PRESERVES_TRIANGLE_FAN_PROVOKING_VERTEX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("provokingVertexModePerPipeline"),
		    JAVA_INT.withName("transformFeedbackPreservesTriangleFanProvokingVertex")
		).withName("VkPhysicalDeviceProvokingVertexPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PROVOKING_VERTEX_MODE_PER_PIPELINE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("provokingVertexModePerPipeline"));
		TRANSFORM_FEEDBACK_PRESERVES_TRIANGLE_FAN_PROVOKING_VERTEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transformFeedbackPreservesTriangleFanProvokingVertex"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PROVOKING_VERTEX_MODE_PER_PIPELINE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("provokingVertexModePerPipeline"));
		TRANSFORM_FEEDBACK_PRESERVES_TRIANGLE_FAN_PROVOKING_VERTEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackPreservesTriangleFanProvokingVertex"));
		//@formatter:on
	}

	public VkPhysicalDeviceProvokingVertexPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceProvokingVertexPropertiesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceProvokingVertexPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceProvokingVertexPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceProvokingVertexPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #provokingVertexModePerPipeline()
    public VkPhysicalDeviceProvokingVertexPropertiesEXT provokingVertexModePerPipeline(int provokingVertexModePerPipeline) {
    	PROVOKING_VERTEX_MODE_PER_PIPELINE_HANDLE.set(segment, 0L, provokingVertexModePerPipeline);
    	return this;
    }
    
    public int provokingVertexModePerPipeline() {
    	return (int) PROVOKING_VERTEX_MODE_PER_PIPELINE_HANDLE.get(segment, 0L);
    }
    
    /// @see #transformFeedbackPreservesTriangleFanProvokingVertex()
    public VkPhysicalDeviceProvokingVertexPropertiesEXT transformFeedbackPreservesTriangleFanProvokingVertex(int transformFeedbackPreservesTriangleFanProvokingVertex) {
    	TRANSFORM_FEEDBACK_PRESERVES_TRIANGLE_FAN_PROVOKING_VERTEX_HANDLE.set(segment, 0L, transformFeedbackPreservesTriangleFanProvokingVertex);
    	return this;
    }
    
    public int transformFeedbackPreservesTriangleFanProvokingVertex() {
    	return (int) TRANSFORM_FEEDBACK_PRESERVES_TRIANGLE_FAN_PROVOKING_VERTEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceProvokingVertexPropertiesEXT set(VkPhysicalDeviceProvokingVertexPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceProvokingVertexPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceProvokingVertexPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceProvokingVertexPropertiesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceProvokingVertexPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceProvokingVertexPropertiesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceProvokingVertexPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceProvokingVertexPropertiesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceProvokingVertexPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceProvokingVertexPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceProvokingVertexPropertiesEXT(segment)
        );
    }

}