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

public final class VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR
		implements Struct<VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COMPUTE_DERIVATIVE_GROUP_QUADS_HANDLE;
	public static final VarHandle COMPUTE_DERIVATIVE_GROUP_LINEAR_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COMPUTE_DERIVATIVE_GROUP_QUADS_BYTE_OFFSET;
	public static final long COMPUTE_DERIVATIVE_GROUP_LINEAR_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("computeDerivativeGroupQuads"),
		    JAVA_INT.withName("computeDerivativeGroupLinear")
		).withName("VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COMPUTE_DERIVATIVE_GROUP_QUADS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("computeDerivativeGroupQuads"));
		COMPUTE_DERIVATIVE_GROUP_LINEAR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("computeDerivativeGroupLinear"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COMPUTE_DERIVATIVE_GROUP_QUADS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("computeDerivativeGroupQuads"));
		COMPUTE_DERIVATIVE_GROUP_LINEAR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("computeDerivativeGroupLinear"));
		//@formatter:on
	}

	public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #computeDerivativeGroupQuads()
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR computeDerivativeGroupQuads(int computeDerivativeGroupQuads) {
    	COMPUTE_DERIVATIVE_GROUP_QUADS_HANDLE.set(segment, 0L, computeDerivativeGroupQuads);
    	return this;
    }
    
    public int computeDerivativeGroupQuads() {
    	return (int) COMPUTE_DERIVATIVE_GROUP_QUADS_HANDLE.get(segment, 0L);
    }
    
    /// @see #computeDerivativeGroupLinear()
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR computeDerivativeGroupLinear(int computeDerivativeGroupLinear) {
    	COMPUTE_DERIVATIVE_GROUP_LINEAR_HANDLE.set(segment, 0L, computeDerivativeGroupLinear);
    	return this;
    }
    
    public int computeDerivativeGroupLinear() {
    	return (int) COMPUTE_DERIVATIVE_GROUP_LINEAR_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR set(VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR> array(SegmentAllocator allocator, VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(segment)
        );
    }

}