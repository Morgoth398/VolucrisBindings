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

public final class VkPhysicalDeviceCooperativeMatrix2FeaturesNV
		implements Struct<VkPhysicalDeviceCooperativeMatrix2FeaturesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COOPERATIVE_MATRIX_WORKGROUP_SCOPE_HANDLE;
	public static final VarHandle COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_HANDLE;
	public static final VarHandle COOPERATIVE_MATRIX_REDUCTIONS_HANDLE;
	public static final VarHandle COOPERATIVE_MATRIX_CONVERSIONS_HANDLE;
	public static final VarHandle COOPERATIVE_MATRIX_PER_ELEMENT_OPERATIONS_HANDLE;
	public static final VarHandle COOPERATIVE_MATRIX_TENSOR_ADDRESSING_HANDLE;
	public static final VarHandle COOPERATIVE_MATRIX_BLOCK_LOADS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COOPERATIVE_MATRIX_WORKGROUP_SCOPE_BYTE_OFFSET;
	public static final long COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_BYTE_OFFSET;
	public static final long COOPERATIVE_MATRIX_REDUCTIONS_BYTE_OFFSET;
	public static final long COOPERATIVE_MATRIX_CONVERSIONS_BYTE_OFFSET;
	public static final long COOPERATIVE_MATRIX_PER_ELEMENT_OPERATIONS_BYTE_OFFSET;
	public static final long COOPERATIVE_MATRIX_TENSOR_ADDRESSING_BYTE_OFFSET;
	public static final long COOPERATIVE_MATRIX_BLOCK_LOADS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("cooperativeMatrixWorkgroupScope"),
		    JAVA_INT.withName("cooperativeMatrixFlexibleDimensions"),
		    JAVA_INT.withName("cooperativeMatrixReductions"),
		    JAVA_INT.withName("cooperativeMatrixConversions"),
		    JAVA_INT.withName("cooperativeMatrixPerElementOperations"),
		    JAVA_INT.withName("cooperativeMatrixTensorAddressing"),
		    JAVA_INT.withName("cooperativeMatrixBlockLoads"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceCooperativeMatrix2FeaturesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COOPERATIVE_MATRIX_WORKGROUP_SCOPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeMatrixWorkgroupScope"));
		COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeMatrixFlexibleDimensions"));
		COOPERATIVE_MATRIX_REDUCTIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeMatrixReductions"));
		COOPERATIVE_MATRIX_CONVERSIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeMatrixConversions"));
		COOPERATIVE_MATRIX_PER_ELEMENT_OPERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeMatrixPerElementOperations"));
		COOPERATIVE_MATRIX_TENSOR_ADDRESSING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeMatrixTensorAddressing"));
		COOPERATIVE_MATRIX_BLOCK_LOADS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeMatrixBlockLoads"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COOPERATIVE_MATRIX_WORKGROUP_SCOPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixWorkgroupScope"));
		COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixFlexibleDimensions"));
		COOPERATIVE_MATRIX_REDUCTIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixReductions"));
		COOPERATIVE_MATRIX_CONVERSIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixConversions"));
		COOPERATIVE_MATRIX_PER_ELEMENT_OPERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixPerElementOperations"));
		COOPERATIVE_MATRIX_TENSOR_ADDRESSING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixTensorAddressing"));
		COOPERATIVE_MATRIX_BLOCK_LOADS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixBlockLoads"));
		//@formatter:on
	}

	public VkPhysicalDeviceCooperativeMatrix2FeaturesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceCooperativeMatrix2FeaturesNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceCooperativeMatrix2FeaturesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #cooperativeMatrixWorkgroupScope()
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixWorkgroupScope(int cooperativeMatrixWorkgroupScope) {
    	COOPERATIVE_MATRIX_WORKGROUP_SCOPE_HANDLE.set(segment, 0L, cooperativeMatrixWorkgroupScope);
    	return this;
    }
    
    public int cooperativeMatrixWorkgroupScope() {
    	return (int) COOPERATIVE_MATRIX_WORKGROUP_SCOPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #cooperativeMatrixFlexibleDimensions()
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixFlexibleDimensions(int cooperativeMatrixFlexibleDimensions) {
    	COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_HANDLE.set(segment, 0L, cooperativeMatrixFlexibleDimensions);
    	return this;
    }
    
    public int cooperativeMatrixFlexibleDimensions() {
    	return (int) COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #cooperativeMatrixReductions()
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixReductions(int cooperativeMatrixReductions) {
    	COOPERATIVE_MATRIX_REDUCTIONS_HANDLE.set(segment, 0L, cooperativeMatrixReductions);
    	return this;
    }
    
    public int cooperativeMatrixReductions() {
    	return (int) COOPERATIVE_MATRIX_REDUCTIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #cooperativeMatrixConversions()
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixConversions(int cooperativeMatrixConversions) {
    	COOPERATIVE_MATRIX_CONVERSIONS_HANDLE.set(segment, 0L, cooperativeMatrixConversions);
    	return this;
    }
    
    public int cooperativeMatrixConversions() {
    	return (int) COOPERATIVE_MATRIX_CONVERSIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #cooperativeMatrixPerElementOperations()
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixPerElementOperations(int cooperativeMatrixPerElementOperations) {
    	COOPERATIVE_MATRIX_PER_ELEMENT_OPERATIONS_HANDLE.set(segment, 0L, cooperativeMatrixPerElementOperations);
    	return this;
    }
    
    public int cooperativeMatrixPerElementOperations() {
    	return (int) COOPERATIVE_MATRIX_PER_ELEMENT_OPERATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #cooperativeMatrixTensorAddressing()
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixTensorAddressing(int cooperativeMatrixTensorAddressing) {
    	COOPERATIVE_MATRIX_TENSOR_ADDRESSING_HANDLE.set(segment, 0L, cooperativeMatrixTensorAddressing);
    	return this;
    }
    
    public int cooperativeMatrixTensorAddressing() {
    	return (int) COOPERATIVE_MATRIX_TENSOR_ADDRESSING_HANDLE.get(segment, 0L);
    }
    
    /// @see #cooperativeMatrixBlockLoads()
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixBlockLoads(int cooperativeMatrixBlockLoads) {
    	COOPERATIVE_MATRIX_BLOCK_LOADS_HANDLE.set(segment, 0L, cooperativeMatrixBlockLoads);
    	return this;
    }
    
    public int cooperativeMatrixBlockLoads() {
    	return (int) COOPERATIVE_MATRIX_BLOCK_LOADS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV set(VkPhysicalDeviceCooperativeMatrix2FeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceCooperativeMatrix2FeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrix2FeaturesNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrix2FeaturesNV> array(SegmentAllocator allocator, VkPhysicalDeviceCooperativeMatrix2FeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceCooperativeMatrix2FeaturesNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrix2FeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(segment)
        );
    }

}