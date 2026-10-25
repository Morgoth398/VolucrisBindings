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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkPhysicalDeviceSparseProperties
		implements Struct<VkPhysicalDeviceSparseProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle RESIDENCY_STANDARD2_DBLOCK_SHAPE_HANDLE;
	public static final VarHandle RESIDENCY_STANDARD2_DMULTISAMPLE_BLOCK_SHAPE_HANDLE;
	public static final VarHandle RESIDENCY_STANDARD3_DBLOCK_SHAPE_HANDLE;
	public static final VarHandle RESIDENCY_ALIGNED_MIP_SIZE_HANDLE;
	public static final VarHandle RESIDENCY_NON_RESIDENT_STRICT_HANDLE;

	public static final long RESIDENCY_STANDARD2_DBLOCK_SHAPE_BYTE_OFFSET;
	public static final long RESIDENCY_STANDARD2_DMULTISAMPLE_BLOCK_SHAPE_BYTE_OFFSET;
	public static final long RESIDENCY_STANDARD3_DBLOCK_SHAPE_BYTE_OFFSET;
	public static final long RESIDENCY_ALIGNED_MIP_SIZE_BYTE_OFFSET;
	public static final long RESIDENCY_NON_RESIDENT_STRICT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("residencyStandard2DBlockShape"),
		    JAVA_INT.withName("residencyStandard2DMultisampleBlockShape"),
		    JAVA_INT.withName("residencyStandard3DBlockShape"),
		    JAVA_INT.withName("residencyAlignedMipSize"),
		    JAVA_INT.withName("residencyNonResidentStrict")
		).withName("VkPhysicalDeviceSparseProperties").withByteAlignment(4);
		
		RESIDENCY_STANDARD2_DBLOCK_SHAPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("residencyStandard2DBlockShape"));
		RESIDENCY_STANDARD2_DMULTISAMPLE_BLOCK_SHAPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("residencyStandard2DMultisampleBlockShape"));
		RESIDENCY_STANDARD3_DBLOCK_SHAPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("residencyStandard3DBlockShape"));
		RESIDENCY_ALIGNED_MIP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("residencyAlignedMipSize"));
		RESIDENCY_NON_RESIDENT_STRICT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("residencyNonResidentStrict"));
		
		RESIDENCY_STANDARD2_DBLOCK_SHAPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("residencyStandard2DBlockShape"));
		RESIDENCY_STANDARD2_DMULTISAMPLE_BLOCK_SHAPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("residencyStandard2DMultisampleBlockShape"));
		RESIDENCY_STANDARD3_DBLOCK_SHAPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("residencyStandard3DBlockShape"));
		RESIDENCY_ALIGNED_MIP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("residencyAlignedMipSize"));
		RESIDENCY_NON_RESIDENT_STRICT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("residencyNonResidentStrict"));
		//@formatter:on
	}

	public VkPhysicalDeviceSparseProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceSparseProperties(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceSparseProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #residencyStandard2DBlockShape()
    public VkPhysicalDeviceSparseProperties residencyStandard2DBlockShape(int residencyStandard2DBlockShape) {
    	RESIDENCY_STANDARD2_DBLOCK_SHAPE_HANDLE.set(segment, 0L, residencyStandard2DBlockShape);
    	return this;
    }
    
    public int residencyStandard2DBlockShape() {
    	return (int) RESIDENCY_STANDARD2_DBLOCK_SHAPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #residencyStandard2DMultisampleBlockShape()
    public VkPhysicalDeviceSparseProperties residencyStandard2DMultisampleBlockShape(int residencyStandard2DMultisampleBlockShape) {
    	RESIDENCY_STANDARD2_DMULTISAMPLE_BLOCK_SHAPE_HANDLE.set(segment, 0L, residencyStandard2DMultisampleBlockShape);
    	return this;
    }
    
    public int residencyStandard2DMultisampleBlockShape() {
    	return (int) RESIDENCY_STANDARD2_DMULTISAMPLE_BLOCK_SHAPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #residencyStandard3DBlockShape()
    public VkPhysicalDeviceSparseProperties residencyStandard3DBlockShape(int residencyStandard3DBlockShape) {
    	RESIDENCY_STANDARD3_DBLOCK_SHAPE_HANDLE.set(segment, 0L, residencyStandard3DBlockShape);
    	return this;
    }
    
    public int residencyStandard3DBlockShape() {
    	return (int) RESIDENCY_STANDARD3_DBLOCK_SHAPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #residencyAlignedMipSize()
    public VkPhysicalDeviceSparseProperties residencyAlignedMipSize(int residencyAlignedMipSize) {
    	RESIDENCY_ALIGNED_MIP_SIZE_HANDLE.set(segment, 0L, residencyAlignedMipSize);
    	return this;
    }
    
    public int residencyAlignedMipSize() {
    	return (int) RESIDENCY_ALIGNED_MIP_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #residencyNonResidentStrict()
    public VkPhysicalDeviceSparseProperties residencyNonResidentStrict(int residencyNonResidentStrict) {
    	RESIDENCY_NON_RESIDENT_STRICT_HANDLE.set(segment, 0L, residencyNonResidentStrict);
    	return this;
    }
    
    public int residencyNonResidentStrict() {
    	return (int) RESIDENCY_NON_RESIDENT_STRICT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceSparseProperties set(VkPhysicalDeviceSparseProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceSparseProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceSparseProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceSparseProperties> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceSparseProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceSparseProperties> array(SegmentAllocator allocator, VkPhysicalDeviceSparseProperties... structs) {
        NativeStructArray<VkPhysicalDeviceSparseProperties> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceSparseProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceSparseProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceSparseProperties(segment)
        );
    }

}