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

public final class VkPhysicalDeviceLineRasterizationFeatures
		implements Struct<VkPhysicalDeviceLineRasterizationFeatures> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle RECTANGULAR_LINES_HANDLE;
	public static final VarHandle BRESENHAM_LINES_HANDLE;
	public static final VarHandle SMOOTH_LINES_HANDLE;
	public static final VarHandle STIPPLED_RECTANGULAR_LINES_HANDLE;
	public static final VarHandle STIPPLED_BRESENHAM_LINES_HANDLE;
	public static final VarHandle STIPPLED_SMOOTH_LINES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long RECTANGULAR_LINES_BYTE_OFFSET;
	public static final long BRESENHAM_LINES_BYTE_OFFSET;
	public static final long SMOOTH_LINES_BYTE_OFFSET;
	public static final long STIPPLED_RECTANGULAR_LINES_BYTE_OFFSET;
	public static final long STIPPLED_BRESENHAM_LINES_BYTE_OFFSET;
	public static final long STIPPLED_SMOOTH_LINES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("rectangularLines"),
		    JAVA_INT.withName("bresenhamLines"),
		    JAVA_INT.withName("smoothLines"),
		    JAVA_INT.withName("stippledRectangularLines"),
		    JAVA_INT.withName("stippledBresenhamLines"),
		    JAVA_INT.withName("stippledSmoothLines")
		).withName("VkPhysicalDeviceLineRasterizationFeatures").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		RECTANGULAR_LINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rectangularLines"));
		BRESENHAM_LINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bresenhamLines"));
		SMOOTH_LINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("smoothLines"));
		STIPPLED_RECTANGULAR_LINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stippledRectangularLines"));
		STIPPLED_BRESENHAM_LINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stippledBresenhamLines"));
		STIPPLED_SMOOTH_LINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stippledSmoothLines"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		RECTANGULAR_LINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rectangularLines"));
		BRESENHAM_LINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bresenhamLines"));
		SMOOTH_LINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("smoothLines"));
		STIPPLED_RECTANGULAR_LINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stippledRectangularLines"));
		STIPPLED_BRESENHAM_LINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stippledBresenhamLines"));
		STIPPLED_SMOOTH_LINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stippledSmoothLines"));
		//@formatter:on
	}

	public VkPhysicalDeviceLineRasterizationFeatures() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceLineRasterizationFeatures(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceLineRasterizationFeatures(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceLineRasterizationFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceLineRasterizationFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #rectangularLines()
    public VkPhysicalDeviceLineRasterizationFeatures rectangularLines(int rectangularLines) {
    	RECTANGULAR_LINES_HANDLE.set(segment, 0L, rectangularLines);
    	return this;
    }
    
    public int rectangularLines() {
    	return (int) RECTANGULAR_LINES_HANDLE.get(segment, 0L);
    }
    
    /// @see #bresenhamLines()
    public VkPhysicalDeviceLineRasterizationFeatures bresenhamLines(int bresenhamLines) {
    	BRESENHAM_LINES_HANDLE.set(segment, 0L, bresenhamLines);
    	return this;
    }
    
    public int bresenhamLines() {
    	return (int) BRESENHAM_LINES_HANDLE.get(segment, 0L);
    }
    
    /// @see #smoothLines()
    public VkPhysicalDeviceLineRasterizationFeatures smoothLines(int smoothLines) {
    	SMOOTH_LINES_HANDLE.set(segment, 0L, smoothLines);
    	return this;
    }
    
    public int smoothLines() {
    	return (int) SMOOTH_LINES_HANDLE.get(segment, 0L);
    }
    
    /// @see #stippledRectangularLines()
    public VkPhysicalDeviceLineRasterizationFeatures stippledRectangularLines(int stippledRectangularLines) {
    	STIPPLED_RECTANGULAR_LINES_HANDLE.set(segment, 0L, stippledRectangularLines);
    	return this;
    }
    
    public int stippledRectangularLines() {
    	return (int) STIPPLED_RECTANGULAR_LINES_HANDLE.get(segment, 0L);
    }
    
    /// @see #stippledBresenhamLines()
    public VkPhysicalDeviceLineRasterizationFeatures stippledBresenhamLines(int stippledBresenhamLines) {
    	STIPPLED_BRESENHAM_LINES_HANDLE.set(segment, 0L, stippledBresenhamLines);
    	return this;
    }
    
    public int stippledBresenhamLines() {
    	return (int) STIPPLED_BRESENHAM_LINES_HANDLE.get(segment, 0L);
    }
    
    /// @see #stippledSmoothLines()
    public VkPhysicalDeviceLineRasterizationFeatures stippledSmoothLines(int stippledSmoothLines) {
    	STIPPLED_SMOOTH_LINES_HANDLE.set(segment, 0L, stippledSmoothLines);
    	return this;
    }
    
    public int stippledSmoothLines() {
    	return (int) STIPPLED_SMOOTH_LINES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceLineRasterizationFeatures set(VkPhysicalDeviceLineRasterizationFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceLineRasterizationFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceLineRasterizationFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceLineRasterizationFeatures> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceLineRasterizationFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceLineRasterizationFeatures> array(SegmentAllocator allocator, VkPhysicalDeviceLineRasterizationFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceLineRasterizationFeatures> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceLineRasterizationFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceLineRasterizationFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceLineRasterizationFeatures(segment)
        );
    }

}