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

public final class VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV
		implements Struct<VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle RAY_TRACING_INVOCATION_REORDER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long RAY_TRACING_INVOCATION_REORDER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("rayTracingInvocationReorder"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		RAY_TRACING_INVOCATION_REORDER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rayTracingInvocationReorder"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		RAY_TRACING_INVOCATION_REORDER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rayTracingInvocationReorder"));
		//@formatter:on
	}

	public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #rayTracingInvocationReorder()
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV rayTracingInvocationReorder(int rayTracingInvocationReorder) {
    	RAY_TRACING_INVOCATION_REORDER_HANDLE.set(segment, 0L, rayTracingInvocationReorder);
    	return this;
    }
    
    public int rayTracingInvocationReorder() {
    	return (int) RAY_TRACING_INVOCATION_REORDER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV set(VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV> array(SegmentAllocator allocator, VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV(segment)
        );
    }

}