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

public final class VkTransformMatrixKHR
		implements Struct<VkTransformMatrixKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle MATRIX_HANDLE;

	public static final long MATRIX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MemoryLayout.sequenceLayout(3, MemoryLayout.sequenceLayout(4, JAVA_FLOAT)).withName("matrix")
		).withName("VkTransformMatrixKHR").withByteAlignment(4);
		
		MATRIX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("matrix"), PathElement.sequenceElement(), PathElement.sequenceElement());
		
		MATRIX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("matrix"));
		//@formatter:on
	}

	public VkTransformMatrixKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkTransformMatrixKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkTransformMatrixKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #matrix(int, int)
    public VkTransformMatrixKHR matrix(float matrix, int index0, int index1) {
    	MATRIX_HANDLE.set(segment, 0L, index0, index1, matrix);
    	return this;
    }
    
    public float matrix(int index0, int index1) {
    	return (float) MATRIX_HANDLE.get(segment, 0L, index0, index1);
    }
    
    @Override
    public VkTransformMatrixKHR set(VkTransformMatrixKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkTransformMatrixKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkTransformMatrixKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkTransformMatrixKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkTransformMatrixKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkTransformMatrixKHR> array(SegmentAllocator allocator, VkTransformMatrixKHR... structs) {
        NativeStructArray<VkTransformMatrixKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkTransformMatrixKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkTransformMatrixKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkTransformMatrixKHR(segment)
        );
    }

}