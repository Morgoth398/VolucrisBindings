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

public final class VkPresentTimingSurfaceCapabilitiesEXT
		implements Struct<VkPresentTimingSurfaceCapabilitiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PRESENT_TIMING_SUPPORTED_HANDLE;
	public static final VarHandle PRESENT_AT_ABSOLUTE_TIME_SUPPORTED_HANDLE;
	public static final VarHandle PRESENT_AT_RELATIVE_TIME_SUPPORTED_HANDLE;
	public static final VarHandle PRESENT_STAGE_QUERIES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PRESENT_TIMING_SUPPORTED_BYTE_OFFSET;
	public static final long PRESENT_AT_ABSOLUTE_TIME_SUPPORTED_BYTE_OFFSET;
	public static final long PRESENT_AT_RELATIVE_TIME_SUPPORTED_BYTE_OFFSET;
	public static final long PRESENT_STAGE_QUERIES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("presentTimingSupported"),
		    JAVA_INT.withName("presentAtAbsoluteTimeSupported"),
		    JAVA_INT.withName("presentAtRelativeTimeSupported"),
		    JAVA_INT.withName("presentStageQueries")
		).withName("VkPresentTimingSurfaceCapabilitiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PRESENT_TIMING_SUPPORTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentTimingSupported"));
		PRESENT_AT_ABSOLUTE_TIME_SUPPORTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentAtAbsoluteTimeSupported"));
		PRESENT_AT_RELATIVE_TIME_SUPPORTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentAtRelativeTimeSupported"));
		PRESENT_STAGE_QUERIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentStageQueries"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PRESENT_TIMING_SUPPORTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentTimingSupported"));
		PRESENT_AT_ABSOLUTE_TIME_SUPPORTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentAtAbsoluteTimeSupported"));
		PRESENT_AT_RELATIVE_TIME_SUPPORTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentAtRelativeTimeSupported"));
		PRESENT_STAGE_QUERIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentStageQueries"));
		//@formatter:on
	}

	public VkPresentTimingSurfaceCapabilitiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPresentTimingSurfaceCapabilitiesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPresentTimingSurfaceCapabilitiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPresentTimingSurfaceCapabilitiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPresentTimingSurfaceCapabilitiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #presentTimingSupported()
    public VkPresentTimingSurfaceCapabilitiesEXT presentTimingSupported(int presentTimingSupported) {
    	PRESENT_TIMING_SUPPORTED_HANDLE.set(segment, 0L, presentTimingSupported);
    	return this;
    }
    
    public int presentTimingSupported() {
    	return (int) PRESENT_TIMING_SUPPORTED_HANDLE.get(segment, 0L);
    }
    
    /// @see #presentAtAbsoluteTimeSupported()
    public VkPresentTimingSurfaceCapabilitiesEXT presentAtAbsoluteTimeSupported(int presentAtAbsoluteTimeSupported) {
    	PRESENT_AT_ABSOLUTE_TIME_SUPPORTED_HANDLE.set(segment, 0L, presentAtAbsoluteTimeSupported);
    	return this;
    }
    
    public int presentAtAbsoluteTimeSupported() {
    	return (int) PRESENT_AT_ABSOLUTE_TIME_SUPPORTED_HANDLE.get(segment, 0L);
    }
    
    /// @see #presentAtRelativeTimeSupported()
    public VkPresentTimingSurfaceCapabilitiesEXT presentAtRelativeTimeSupported(int presentAtRelativeTimeSupported) {
    	PRESENT_AT_RELATIVE_TIME_SUPPORTED_HANDLE.set(segment, 0L, presentAtRelativeTimeSupported);
    	return this;
    }
    
    public int presentAtRelativeTimeSupported() {
    	return (int) PRESENT_AT_RELATIVE_TIME_SUPPORTED_HANDLE.get(segment, 0L);
    }
    
    /// @see #presentStageQueries()
    public VkPresentTimingSurfaceCapabilitiesEXT presentStageQueries(int presentStageQueries) {
    	PRESENT_STAGE_QUERIES_HANDLE.set(segment, 0L, presentStageQueries);
    	return this;
    }
    
    public int presentStageQueries() {
    	return (int) PRESENT_STAGE_QUERIES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPresentTimingSurfaceCapabilitiesEXT set(VkPresentTimingSurfaceCapabilitiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPresentTimingSurfaceCapabilitiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPresentTimingSurfaceCapabilitiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPresentTimingSurfaceCapabilitiesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPresentTimingSurfaceCapabilitiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPresentTimingSurfaceCapabilitiesEXT> array(SegmentAllocator allocator, VkPresentTimingSurfaceCapabilitiesEXT... structs) {
        NativeStructArray<VkPresentTimingSurfaceCapabilitiesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPresentTimingSurfaceCapabilitiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPresentTimingSurfaceCapabilitiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPresentTimingSurfaceCapabilitiesEXT(segment)
        );
    }

}