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

public final class VkSharedPresentSurfaceCapabilities2KHR
		implements Struct<VkSharedPresentSurfaceCapabilities2KHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHARED_PRESENT_SUPPORTED_USAGE_FLAGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHARED_PRESENT_SUPPORTED_USAGE_FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("sharedPresentSupportedUsageFlags")
		).withName("VkSharedPresentSurfaceCapabilities2KHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHARED_PRESENT_SUPPORTED_USAGE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sharedPresentSupportedUsageFlags"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHARED_PRESENT_SUPPORTED_USAGE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sharedPresentSupportedUsageFlags"));
		//@formatter:on
	}

	public VkSharedPresentSurfaceCapabilities2KHR() {
	    this(Arena.ofAuto());
	}
	
	public VkSharedPresentSurfaceCapabilities2KHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSharedPresentSurfaceCapabilities2KHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSharedPresentSurfaceCapabilities2KHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSharedPresentSurfaceCapabilities2KHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #sharedPresentSupportedUsageFlags()
    public VkSharedPresentSurfaceCapabilities2KHR sharedPresentSupportedUsageFlags(long sharedPresentSupportedUsageFlags) {
    	SHARED_PRESENT_SUPPORTED_USAGE_FLAGS_HANDLE.set(segment, 0L, sharedPresentSupportedUsageFlags);
    	return this;
    }
    
    public long sharedPresentSupportedUsageFlags() {
    	return (long) SHARED_PRESENT_SUPPORTED_USAGE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSharedPresentSurfaceCapabilities2KHR set(VkSharedPresentSurfaceCapabilities2KHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkSharedPresentSurfaceCapabilities2KHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSharedPresentSurfaceCapabilities2KHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSharedPresentSurfaceCapabilities2KHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSharedPresentSurfaceCapabilities2KHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSharedPresentSurfaceCapabilities2KHR> array(SegmentAllocator allocator, VkSharedPresentSurfaceCapabilities2KHR... structs) {
        NativeStructArray<VkSharedPresentSurfaceCapabilities2KHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSharedPresentSurfaceCapabilities2KHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSharedPresentSurfaceCapabilities2KHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSharedPresentSurfaceCapabilities2KHR(segment)
        );
    }

}