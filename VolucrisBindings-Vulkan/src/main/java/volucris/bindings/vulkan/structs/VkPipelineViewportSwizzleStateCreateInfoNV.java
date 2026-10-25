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

public final class VkPipelineViewportSwizzleStateCreateInfoNV
		implements Struct<VkPipelineViewportSwizzleStateCreateInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle VIEWPORT_COUNT_HANDLE;
	public static final VarHandle P_VIEWPORT_SWIZZLES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long VIEWPORT_COUNT_BYTE_OFFSET;
	public static final long P_VIEWPORT_SWIZZLES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("viewportCount"),
		    UNBOUNDED_ADDRESS.withName("pViewportSwizzles")
		).withName("VkPipelineViewportSwizzleStateCreateInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		VIEWPORT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewportCount"));
		P_VIEWPORT_SWIZZLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pViewportSwizzles"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		VIEWPORT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewportCount"));
		P_VIEWPORT_SWIZZLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pViewportSwizzles"));
		//@formatter:on
	}

	public VkPipelineViewportSwizzleStateCreateInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineViewportSwizzleStateCreateInfoNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPipelineViewportSwizzleStateCreateInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineViewportSwizzleStateCreateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineViewportSwizzleStateCreateInfoNV pNext(MemorySegment pNext) {
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
    public VkPipelineViewportSwizzleStateCreateInfoNV flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #viewportCount()
    public VkPipelineViewportSwizzleStateCreateInfoNV viewportCount(int viewportCount) {
    	VIEWPORT_COUNT_HANDLE.set(segment, 0L, viewportCount);
    	return this;
    }
    
    public int viewportCount() {
    	return (int) VIEWPORT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pViewportSwizzles()
    public VkPipelineViewportSwizzleStateCreateInfoNV pViewportSwizzles(NativeStructArray<VkViewportSwizzleNV> pViewportSwizzles) {
    	P_VIEWPORT_SWIZZLES_HANDLE.set(segment, 0L, pViewportSwizzles.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkViewportSwizzleNV> pViewportSwizzles() {
    	MemorySegment segment = (MemorySegment) P_VIEWPORT_SWIZZLES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkViewportSwizzleNV.array(segment);
    }
    
    @Override
    public VkPipelineViewportSwizzleStateCreateInfoNV set(VkPipelineViewportSwizzleStateCreateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineViewportSwizzleStateCreateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineViewportSwizzleStateCreateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineViewportSwizzleStateCreateInfoNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineViewportSwizzleStateCreateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineViewportSwizzleStateCreateInfoNV> array(SegmentAllocator allocator, VkPipelineViewportSwizzleStateCreateInfoNV... structs) {
        NativeStructArray<VkPipelineViewportSwizzleStateCreateInfoNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineViewportSwizzleStateCreateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineViewportSwizzleStateCreateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineViewportSwizzleStateCreateInfoNV(segment)
        );
    }

}