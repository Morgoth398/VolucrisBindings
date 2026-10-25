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

public final class VkPipelineCoverageToColorStateCreateInfoNV
		implements Struct<VkPipelineCoverageToColorStateCreateInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle COVERAGE_TO_COLOR_ENABLE_HANDLE;
	public static final VarHandle COVERAGE_TO_COLOR_LOCATION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long COVERAGE_TO_COLOR_ENABLE_BYTE_OFFSET;
	public static final long COVERAGE_TO_COLOR_LOCATION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("coverageToColorEnable"),
		    JAVA_INT.withName("coverageToColorLocation"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPipelineCoverageToColorStateCreateInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		COVERAGE_TO_COLOR_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coverageToColorEnable"));
		COVERAGE_TO_COLOR_LOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coverageToColorLocation"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		COVERAGE_TO_COLOR_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coverageToColorEnable"));
		COVERAGE_TO_COLOR_LOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coverageToColorLocation"));
		//@formatter:on
	}

	public VkPipelineCoverageToColorStateCreateInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineCoverageToColorStateCreateInfoNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPipelineCoverageToColorStateCreateInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineCoverageToColorStateCreateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineCoverageToColorStateCreateInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkPipelineCoverageToColorStateCreateInfoNV flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #coverageToColorEnable()
    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorEnable(int coverageToColorEnable) {
    	COVERAGE_TO_COLOR_ENABLE_HANDLE.set(segment, 0L, coverageToColorEnable);
    	return this;
    }
    
    public int coverageToColorEnable() {
    	return (int) COVERAGE_TO_COLOR_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #coverageToColorLocation()
    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorLocation(int coverageToColorLocation) {
    	COVERAGE_TO_COLOR_LOCATION_HANDLE.set(segment, 0L, coverageToColorLocation);
    	return this;
    }
    
    public int coverageToColorLocation() {
    	return (int) COVERAGE_TO_COLOR_LOCATION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPipelineCoverageToColorStateCreateInfoNV set(VkPipelineCoverageToColorStateCreateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineCoverageToColorStateCreateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineCoverageToColorStateCreateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineCoverageToColorStateCreateInfoNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineCoverageToColorStateCreateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineCoverageToColorStateCreateInfoNV> array(SegmentAllocator allocator, VkPipelineCoverageToColorStateCreateInfoNV... structs) {
        NativeStructArray<VkPipelineCoverageToColorStateCreateInfoNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineCoverageToColorStateCreateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineCoverageToColorStateCreateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineCoverageToColorStateCreateInfoNV(segment)
        );
    }

}