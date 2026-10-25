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

public final class VkPhysicalDeviceShaderCoreProperties2AMD
		implements Struct<VkPhysicalDeviceShaderCoreProperties2AMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_CORE_FEATURES_HANDLE;
	public static final VarHandle ACTIVE_COMPUTE_UNIT_COUNT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_CORE_FEATURES_BYTE_OFFSET;
	public static final long ACTIVE_COMPUTE_UNIT_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderCoreFeatures"),
		    JAVA_INT.withName("activeComputeUnitCount")
		).withName("VkPhysicalDeviceShaderCoreProperties2AMD").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_CORE_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderCoreFeatures"));
		ACTIVE_COMPUTE_UNIT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("activeComputeUnitCount"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_CORE_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderCoreFeatures"));
		ACTIVE_COMPUTE_UNIT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("activeComputeUnitCount"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderCoreProperties2AMD() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderCoreProperties2AMD(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderCoreProperties2AMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderCoreProperties2AMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderCoreProperties2AMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderCoreFeatures()
    public VkPhysicalDeviceShaderCoreProperties2AMD shaderCoreFeatures(int shaderCoreFeatures) {
    	SHADER_CORE_FEATURES_HANDLE.set(segment, 0L, shaderCoreFeatures);
    	return this;
    }
    
    public int shaderCoreFeatures() {
    	return (int) SHADER_CORE_FEATURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #activeComputeUnitCount()
    public VkPhysicalDeviceShaderCoreProperties2AMD activeComputeUnitCount(int activeComputeUnitCount) {
    	ACTIVE_COMPUTE_UNIT_COUNT_HANDLE.set(segment, 0L, activeComputeUnitCount);
    	return this;
    }
    
    public int activeComputeUnitCount() {
    	return (int) ACTIVE_COMPUTE_UNIT_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderCoreProperties2AMD set(VkPhysicalDeviceShaderCoreProperties2AMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderCoreProperties2AMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderCoreProperties2AMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderCoreProperties2AMD> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderCoreProperties2AMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderCoreProperties2AMD> array(SegmentAllocator allocator, VkPhysicalDeviceShaderCoreProperties2AMD... structs) {
        NativeStructArray<VkPhysicalDeviceShaderCoreProperties2AMD> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderCoreProperties2AMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderCoreProperties2AMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderCoreProperties2AMD(segment)
        );
    }

}