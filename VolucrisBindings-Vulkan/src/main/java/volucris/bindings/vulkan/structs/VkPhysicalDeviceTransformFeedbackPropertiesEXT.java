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

public final class VkPhysicalDeviceTransformFeedbackPropertiesEXT
		implements Struct<VkPhysicalDeviceTransformFeedbackPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_TRANSFORM_FEEDBACK_STREAMS_HANDLE;
	public static final VarHandle MAX_TRANSFORM_FEEDBACK_BUFFERS_HANDLE;
	public static final VarHandle MAX_TRANSFORM_FEEDBACK_BUFFER_SIZE_HANDLE;
	public static final VarHandle MAX_TRANSFORM_FEEDBACK_STREAM_DATA_SIZE_HANDLE;
	public static final VarHandle MAX_TRANSFORM_FEEDBACK_BUFFER_DATA_SIZE_HANDLE;
	public static final VarHandle MAX_TRANSFORM_FEEDBACK_BUFFER_DATA_STRIDE_HANDLE;
	public static final VarHandle TRANSFORM_FEEDBACK_QUERIES_HANDLE;
	public static final VarHandle TRANSFORM_FEEDBACK_STREAMS_LINES_TRIANGLES_HANDLE;
	public static final VarHandle TRANSFORM_FEEDBACK_RASTERIZATION_STREAM_SELECT_HANDLE;
	public static final VarHandle TRANSFORM_FEEDBACK_DRAW_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_TRANSFORM_FEEDBACK_STREAMS_BYTE_OFFSET;
	public static final long MAX_TRANSFORM_FEEDBACK_BUFFERS_BYTE_OFFSET;
	public static final long MAX_TRANSFORM_FEEDBACK_BUFFER_SIZE_BYTE_OFFSET;
	public static final long MAX_TRANSFORM_FEEDBACK_STREAM_DATA_SIZE_BYTE_OFFSET;
	public static final long MAX_TRANSFORM_FEEDBACK_BUFFER_DATA_SIZE_BYTE_OFFSET;
	public static final long MAX_TRANSFORM_FEEDBACK_BUFFER_DATA_STRIDE_BYTE_OFFSET;
	public static final long TRANSFORM_FEEDBACK_QUERIES_BYTE_OFFSET;
	public static final long TRANSFORM_FEEDBACK_STREAMS_LINES_TRIANGLES_BYTE_OFFSET;
	public static final long TRANSFORM_FEEDBACK_RASTERIZATION_STREAM_SELECT_BYTE_OFFSET;
	public static final long TRANSFORM_FEEDBACK_DRAW_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maxTransformFeedbackStreams"),
		    JAVA_INT.withName("maxTransformFeedbackBuffers"),
		    JAVA_LONG.withName("maxTransformFeedbackBufferSize"),
		    JAVA_INT.withName("maxTransformFeedbackStreamDataSize"),
		    JAVA_INT.withName("maxTransformFeedbackBufferDataSize"),
		    JAVA_INT.withName("maxTransformFeedbackBufferDataStride"),
		    JAVA_INT.withName("transformFeedbackQueries"),
		    JAVA_INT.withName("transformFeedbackStreamsLinesTriangles"),
		    JAVA_INT.withName("transformFeedbackRasterizationStreamSelect"),
		    JAVA_INT.withName("transformFeedbackDraw"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceTransformFeedbackPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_TRANSFORM_FEEDBACK_STREAMS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTransformFeedbackStreams"));
		MAX_TRANSFORM_FEEDBACK_BUFFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTransformFeedbackBuffers"));
		MAX_TRANSFORM_FEEDBACK_BUFFER_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTransformFeedbackBufferSize"));
		MAX_TRANSFORM_FEEDBACK_STREAM_DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTransformFeedbackStreamDataSize"));
		MAX_TRANSFORM_FEEDBACK_BUFFER_DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTransformFeedbackBufferDataSize"));
		MAX_TRANSFORM_FEEDBACK_BUFFER_DATA_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTransformFeedbackBufferDataStride"));
		TRANSFORM_FEEDBACK_QUERIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transformFeedbackQueries"));
		TRANSFORM_FEEDBACK_STREAMS_LINES_TRIANGLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transformFeedbackStreamsLinesTriangles"));
		TRANSFORM_FEEDBACK_RASTERIZATION_STREAM_SELECT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transformFeedbackRasterizationStreamSelect"));
		TRANSFORM_FEEDBACK_DRAW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transformFeedbackDraw"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_TRANSFORM_FEEDBACK_STREAMS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackStreams"));
		MAX_TRANSFORM_FEEDBACK_BUFFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackBuffers"));
		MAX_TRANSFORM_FEEDBACK_BUFFER_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackBufferSize"));
		MAX_TRANSFORM_FEEDBACK_STREAM_DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackStreamDataSize"));
		MAX_TRANSFORM_FEEDBACK_BUFFER_DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackBufferDataSize"));
		MAX_TRANSFORM_FEEDBACK_BUFFER_DATA_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackBufferDataStride"));
		TRANSFORM_FEEDBACK_QUERIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackQueries"));
		TRANSFORM_FEEDBACK_STREAMS_LINES_TRIANGLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackStreamsLinesTriangles"));
		TRANSFORM_FEEDBACK_RASTERIZATION_STREAM_SELECT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackRasterizationStreamSelect"));
		TRANSFORM_FEEDBACK_DRAW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackDraw"));
		//@formatter:on
	}

	public VkPhysicalDeviceTransformFeedbackPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceTransformFeedbackPropertiesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceTransformFeedbackPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxTransformFeedbackStreams()
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackStreams(int maxTransformFeedbackStreams) {
    	MAX_TRANSFORM_FEEDBACK_STREAMS_HANDLE.set(segment, 0L, maxTransformFeedbackStreams);
    	return this;
    }
    
    public int maxTransformFeedbackStreams() {
    	return (int) MAX_TRANSFORM_FEEDBACK_STREAMS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTransformFeedbackBuffers()
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBuffers(int maxTransformFeedbackBuffers) {
    	MAX_TRANSFORM_FEEDBACK_BUFFERS_HANDLE.set(segment, 0L, maxTransformFeedbackBuffers);
    	return this;
    }
    
    public int maxTransformFeedbackBuffers() {
    	return (int) MAX_TRANSFORM_FEEDBACK_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTransformFeedbackBufferSize()
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferSize(long maxTransformFeedbackBufferSize) {
    	MAX_TRANSFORM_FEEDBACK_BUFFER_SIZE_HANDLE.set(segment, 0L, maxTransformFeedbackBufferSize);
    	return this;
    }
    
    public long maxTransformFeedbackBufferSize() {
    	return (long) MAX_TRANSFORM_FEEDBACK_BUFFER_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTransformFeedbackStreamDataSize()
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackStreamDataSize(int maxTransformFeedbackStreamDataSize) {
    	MAX_TRANSFORM_FEEDBACK_STREAM_DATA_SIZE_HANDLE.set(segment, 0L, maxTransformFeedbackStreamDataSize);
    	return this;
    }
    
    public int maxTransformFeedbackStreamDataSize() {
    	return (int) MAX_TRANSFORM_FEEDBACK_STREAM_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTransformFeedbackBufferDataSize()
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferDataSize(int maxTransformFeedbackBufferDataSize) {
    	MAX_TRANSFORM_FEEDBACK_BUFFER_DATA_SIZE_HANDLE.set(segment, 0L, maxTransformFeedbackBufferDataSize);
    	return this;
    }
    
    public int maxTransformFeedbackBufferDataSize() {
    	return (int) MAX_TRANSFORM_FEEDBACK_BUFFER_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTransformFeedbackBufferDataStride()
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferDataStride(int maxTransformFeedbackBufferDataStride) {
    	MAX_TRANSFORM_FEEDBACK_BUFFER_DATA_STRIDE_HANDLE.set(segment, 0L, maxTransformFeedbackBufferDataStride);
    	return this;
    }
    
    public int maxTransformFeedbackBufferDataStride() {
    	return (int) MAX_TRANSFORM_FEEDBACK_BUFFER_DATA_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #transformFeedbackQueries()
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackQueries(int transformFeedbackQueries) {
    	TRANSFORM_FEEDBACK_QUERIES_HANDLE.set(segment, 0L, transformFeedbackQueries);
    	return this;
    }
    
    public int transformFeedbackQueries() {
    	return (int) TRANSFORM_FEEDBACK_QUERIES_HANDLE.get(segment, 0L);
    }
    
    /// @see #transformFeedbackStreamsLinesTriangles()
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackStreamsLinesTriangles(int transformFeedbackStreamsLinesTriangles) {
    	TRANSFORM_FEEDBACK_STREAMS_LINES_TRIANGLES_HANDLE.set(segment, 0L, transformFeedbackStreamsLinesTriangles);
    	return this;
    }
    
    public int transformFeedbackStreamsLinesTriangles() {
    	return (int) TRANSFORM_FEEDBACK_STREAMS_LINES_TRIANGLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #transformFeedbackRasterizationStreamSelect()
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackRasterizationStreamSelect(int transformFeedbackRasterizationStreamSelect) {
    	TRANSFORM_FEEDBACK_RASTERIZATION_STREAM_SELECT_HANDLE.set(segment, 0L, transformFeedbackRasterizationStreamSelect);
    	return this;
    }
    
    public int transformFeedbackRasterizationStreamSelect() {
    	return (int) TRANSFORM_FEEDBACK_RASTERIZATION_STREAM_SELECT_HANDLE.get(segment, 0L);
    }
    
    /// @see #transformFeedbackDraw()
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackDraw(int transformFeedbackDraw) {
    	TRANSFORM_FEEDBACK_DRAW_HANDLE.set(segment, 0L, transformFeedbackDraw);
    	return this;
    }
    
    public int transformFeedbackDraw() {
    	return (int) TRANSFORM_FEEDBACK_DRAW_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT set(VkPhysicalDeviceTransformFeedbackPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceTransformFeedbackPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceTransformFeedbackPropertiesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceTransformFeedbackPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceTransformFeedbackPropertiesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceTransformFeedbackPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceTransformFeedbackPropertiesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceTransformFeedbackPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceTransformFeedbackPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceTransformFeedbackPropertiesEXT(segment)
        );
    }

}