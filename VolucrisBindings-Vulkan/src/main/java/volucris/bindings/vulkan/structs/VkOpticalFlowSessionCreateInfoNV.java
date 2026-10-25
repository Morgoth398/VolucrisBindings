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

public final class VkOpticalFlowSessionCreateInfoNV
		implements Struct<VkOpticalFlowSessionCreateInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle WIDTH_HANDLE;
	public static final VarHandle HEIGHT_HANDLE;
	public static final VarHandle IMAGE_FORMAT_HANDLE;
	public static final VarHandle FLOW_VECTOR_FORMAT_HANDLE;
	public static final VarHandle COST_FORMAT_HANDLE;
	public static final VarHandle OUTPUT_GRID_SIZE_HANDLE;
	public static final VarHandle HINT_GRID_SIZE_HANDLE;
	public static final VarHandle PERFORMANCE_LEVEL_HANDLE;
	public static final VarHandle FLAGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long WIDTH_BYTE_OFFSET;
	public static final long HEIGHT_BYTE_OFFSET;
	public static final long IMAGE_FORMAT_BYTE_OFFSET;
	public static final long FLOW_VECTOR_FORMAT_BYTE_OFFSET;
	public static final long COST_FORMAT_BYTE_OFFSET;
	public static final long OUTPUT_GRID_SIZE_BYTE_OFFSET;
	public static final long HINT_GRID_SIZE_BYTE_OFFSET;
	public static final long PERFORMANCE_LEVEL_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("width"),
		    JAVA_INT.withName("height"),
		    JAVA_INT.withName("imageFormat"),
		    JAVA_INT.withName("flowVectorFormat"),
		    JAVA_INT.withName("costFormat"),
		    JAVA_INT.withName("outputGridSize"),
		    JAVA_INT.withName("hintGridSize"),
		    JAVA_INT.withName("performanceLevel"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkOpticalFlowSessionCreateInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("width"));
		HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("height"));
		IMAGE_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageFormat"));
		FLOW_VECTOR_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flowVectorFormat"));
		COST_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("costFormat"));
		OUTPUT_GRID_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("outputGridSize"));
		HINT_GRID_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hintGridSize"));
		PERFORMANCE_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("performanceLevel"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("width"));
		HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("height"));
		IMAGE_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageFormat"));
		FLOW_VECTOR_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flowVectorFormat"));
		COST_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("costFormat"));
		OUTPUT_GRID_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("outputGridSize"));
		HINT_GRID_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hintGridSize"));
		PERFORMANCE_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("performanceLevel"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		//@formatter:on
	}

	public VkOpticalFlowSessionCreateInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkOpticalFlowSessionCreateInfoNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkOpticalFlowSessionCreateInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkOpticalFlowSessionCreateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkOpticalFlowSessionCreateInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #width()
    public VkOpticalFlowSessionCreateInfoNV width(int width) {
    	WIDTH_HANDLE.set(segment, 0L, width);
    	return this;
    }
    
    public int width() {
    	return (int) WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #height()
    public VkOpticalFlowSessionCreateInfoNV height(int height) {
    	HEIGHT_HANDLE.set(segment, 0L, height);
    	return this;
    }
    
    public int height() {
    	return (int) HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageFormat()
    public VkOpticalFlowSessionCreateInfoNV imageFormat(int imageFormat) {
    	IMAGE_FORMAT_HANDLE.set(segment, 0L, imageFormat);
    	return this;
    }
    
    public int imageFormat() {
    	return (int) IMAGE_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #flowVectorFormat()
    public VkOpticalFlowSessionCreateInfoNV flowVectorFormat(int flowVectorFormat) {
    	FLOW_VECTOR_FORMAT_HANDLE.set(segment, 0L, flowVectorFormat);
    	return this;
    }
    
    public int flowVectorFormat() {
    	return (int) FLOW_VECTOR_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #costFormat()
    public VkOpticalFlowSessionCreateInfoNV costFormat(int costFormat) {
    	COST_FORMAT_HANDLE.set(segment, 0L, costFormat);
    	return this;
    }
    
    public int costFormat() {
    	return (int) COST_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #outputGridSize()
    public VkOpticalFlowSessionCreateInfoNV outputGridSize(int outputGridSize) {
    	OUTPUT_GRID_SIZE_HANDLE.set(segment, 0L, outputGridSize);
    	return this;
    }
    
    public int outputGridSize() {
    	return (int) OUTPUT_GRID_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #hintGridSize()
    public VkOpticalFlowSessionCreateInfoNV hintGridSize(int hintGridSize) {
    	HINT_GRID_SIZE_HANDLE.set(segment, 0L, hintGridSize);
    	return this;
    }
    
    public int hintGridSize() {
    	return (int) HINT_GRID_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #performanceLevel()
    public VkOpticalFlowSessionCreateInfoNV performanceLevel(int performanceLevel) {
    	PERFORMANCE_LEVEL_HANDLE.set(segment, 0L, performanceLevel);
    	return this;
    }
    
    public int performanceLevel() {
    	return (int) PERFORMANCE_LEVEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkOpticalFlowSessionCreateInfoNV flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkOpticalFlowSessionCreateInfoNV set(VkOpticalFlowSessionCreateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkOpticalFlowSessionCreateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkOpticalFlowSessionCreateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkOpticalFlowSessionCreateInfoNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkOpticalFlowSessionCreateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkOpticalFlowSessionCreateInfoNV> array(SegmentAllocator allocator, VkOpticalFlowSessionCreateInfoNV... structs) {
        NativeStructArray<VkOpticalFlowSessionCreateInfoNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkOpticalFlowSessionCreateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkOpticalFlowSessionCreateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkOpticalFlowSessionCreateInfoNV(segment)
        );
    }

}