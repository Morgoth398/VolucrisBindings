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

public final class VkPhysicalDeviceTransformFeedbackFeaturesEXT
		implements Struct<VkPhysicalDeviceTransformFeedbackFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TRANSFORM_FEEDBACK_HANDLE;
	public static final VarHandle GEOMETRY_STREAMS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TRANSFORM_FEEDBACK_BYTE_OFFSET;
	public static final long GEOMETRY_STREAMS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("transformFeedback"),
		    JAVA_INT.withName("geometryStreams")
		).withName("VkPhysicalDeviceTransformFeedbackFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TRANSFORM_FEEDBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transformFeedback"));
		GEOMETRY_STREAMS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("geometryStreams"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TRANSFORM_FEEDBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transformFeedback"));
		GEOMETRY_STREAMS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("geometryStreams"));
		//@formatter:on
	}

	public VkPhysicalDeviceTransformFeedbackFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceTransformFeedbackFeaturesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceTransformFeedbackFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #transformFeedback()
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT transformFeedback(int transformFeedback) {
    	TRANSFORM_FEEDBACK_HANDLE.set(segment, 0L, transformFeedback);
    	return this;
    }
    
    public int transformFeedback() {
    	return (int) TRANSFORM_FEEDBACK_HANDLE.get(segment, 0L);
    }
    
    /// @see #geometryStreams()
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT geometryStreams(int geometryStreams) {
    	GEOMETRY_STREAMS_HANDLE.set(segment, 0L, geometryStreams);
    	return this;
    }
    
    public int geometryStreams() {
    	return (int) GEOMETRY_STREAMS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT set(VkPhysicalDeviceTransformFeedbackFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceTransformFeedbackFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceTransformFeedbackFeaturesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceTransformFeedbackFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceTransformFeedbackFeaturesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceTransformFeedbackFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceTransformFeedbackFeaturesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceTransformFeedbackFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceTransformFeedbackFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceTransformFeedbackFeaturesEXT(segment)
        );
    }

}