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

public final class VkPhysicalDevicePresentTimingFeaturesEXT
		implements Struct<VkPhysicalDevicePresentTimingFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PRESENT_TIMING_HANDLE;
	public static final VarHandle PRESENT_AT_ABSOLUTE_TIME_HANDLE;
	public static final VarHandle PRESENT_AT_RELATIVE_TIME_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PRESENT_TIMING_BYTE_OFFSET;
	public static final long PRESENT_AT_ABSOLUTE_TIME_BYTE_OFFSET;
	public static final long PRESENT_AT_RELATIVE_TIME_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("presentTiming"),
		    JAVA_INT.withName("presentAtAbsoluteTime"),
		    JAVA_INT.withName("presentAtRelativeTime"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDevicePresentTimingFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PRESENT_TIMING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentTiming"));
		PRESENT_AT_ABSOLUTE_TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentAtAbsoluteTime"));
		PRESENT_AT_RELATIVE_TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentAtRelativeTime"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PRESENT_TIMING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentTiming"));
		PRESENT_AT_ABSOLUTE_TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentAtAbsoluteTime"));
		PRESENT_AT_RELATIVE_TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentAtRelativeTime"));
		//@formatter:on
	}

	public VkPhysicalDevicePresentTimingFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDevicePresentTimingFeaturesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDevicePresentTimingFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDevicePresentTimingFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevicePresentTimingFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #presentTiming()
    public VkPhysicalDevicePresentTimingFeaturesEXT presentTiming(int presentTiming) {
    	PRESENT_TIMING_HANDLE.set(segment, 0L, presentTiming);
    	return this;
    }
    
    public int presentTiming() {
    	return (int) PRESENT_TIMING_HANDLE.get(segment, 0L);
    }
    
    /// @see #presentAtAbsoluteTime()
    public VkPhysicalDevicePresentTimingFeaturesEXT presentAtAbsoluteTime(int presentAtAbsoluteTime) {
    	PRESENT_AT_ABSOLUTE_TIME_HANDLE.set(segment, 0L, presentAtAbsoluteTime);
    	return this;
    }
    
    public int presentAtAbsoluteTime() {
    	return (int) PRESENT_AT_ABSOLUTE_TIME_HANDLE.get(segment, 0L);
    }
    
    /// @see #presentAtRelativeTime()
    public VkPhysicalDevicePresentTimingFeaturesEXT presentAtRelativeTime(int presentAtRelativeTime) {
    	PRESENT_AT_RELATIVE_TIME_HANDLE.set(segment, 0L, presentAtRelativeTime);
    	return this;
    }
    
    public int presentAtRelativeTime() {
    	return (int) PRESENT_AT_RELATIVE_TIME_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevicePresentTimingFeaturesEXT set(VkPhysicalDevicePresentTimingFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevicePresentTimingFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevicePresentTimingFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevicePresentTimingFeaturesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDevicePresentTimingFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevicePresentTimingFeaturesEXT> array(SegmentAllocator allocator, VkPhysicalDevicePresentTimingFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDevicePresentTimingFeaturesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDevicePresentTimingFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevicePresentTimingFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevicePresentTimingFeaturesEXT(segment)
        );
    }

}