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

public final class VkPhysicalDeviceRobustness2FeaturesKHR
		implements Struct<VkPhysicalDeviceRobustness2FeaturesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ROBUST_BUFFER_ACCESS2_HANDLE;
	public static final VarHandle ROBUST_IMAGE_ACCESS2_HANDLE;
	public static final VarHandle NULL_DESCRIPTOR_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ROBUST_BUFFER_ACCESS2_BYTE_OFFSET;
	public static final long ROBUST_IMAGE_ACCESS2_BYTE_OFFSET;
	public static final long NULL_DESCRIPTOR_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("robustBufferAccess2"),
		    JAVA_INT.withName("robustImageAccess2"),
		    JAVA_INT.withName("nullDescriptor"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceRobustness2FeaturesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ROBUST_BUFFER_ACCESS2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("robustBufferAccess2"));
		ROBUST_IMAGE_ACCESS2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("robustImageAccess2"));
		NULL_DESCRIPTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nullDescriptor"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ROBUST_BUFFER_ACCESS2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("robustBufferAccess2"));
		ROBUST_IMAGE_ACCESS2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("robustImageAccess2"));
		NULL_DESCRIPTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nullDescriptor"));
		//@formatter:on
	}

	public VkPhysicalDeviceRobustness2FeaturesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceRobustness2FeaturesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceRobustness2FeaturesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceRobustness2FeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceRobustness2FeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #robustBufferAccess2()
    public VkPhysicalDeviceRobustness2FeaturesKHR robustBufferAccess2(int robustBufferAccess2) {
    	ROBUST_BUFFER_ACCESS2_HANDLE.set(segment, 0L, robustBufferAccess2);
    	return this;
    }
    
    public int robustBufferAccess2() {
    	return (int) ROBUST_BUFFER_ACCESS2_HANDLE.get(segment, 0L);
    }
    
    /// @see #robustImageAccess2()
    public VkPhysicalDeviceRobustness2FeaturesKHR robustImageAccess2(int robustImageAccess2) {
    	ROBUST_IMAGE_ACCESS2_HANDLE.set(segment, 0L, robustImageAccess2);
    	return this;
    }
    
    public int robustImageAccess2() {
    	return (int) ROBUST_IMAGE_ACCESS2_HANDLE.get(segment, 0L);
    }
    
    /// @see #nullDescriptor()
    public VkPhysicalDeviceRobustness2FeaturesKHR nullDescriptor(int nullDescriptor) {
    	NULL_DESCRIPTOR_HANDLE.set(segment, 0L, nullDescriptor);
    	return this;
    }
    
    public int nullDescriptor() {
    	return (int) NULL_DESCRIPTOR_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceRobustness2FeaturesKHR set(VkPhysicalDeviceRobustness2FeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceRobustness2FeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceRobustness2FeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceRobustness2FeaturesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRobustness2FeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceRobustness2FeaturesKHR> array(SegmentAllocator allocator, VkPhysicalDeviceRobustness2FeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceRobustness2FeaturesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRobustness2FeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceRobustness2FeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceRobustness2FeaturesKHR(segment)
        );
    }

}