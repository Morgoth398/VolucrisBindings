/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.unions;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.UnionLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.structs.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkAccelerationStructureMotionInstanceDataNV
		implements Struct<VkAccelerationStructureMotionInstanceDataNV> {

	public static final UnionLayout LAYOUT;

	public static final long STATIC_INSTANCE_BYTE_OFFSET;
	public static final long MATRIX_MOTION_INSTANCE_BYTE_OFFSET;
	public static final long SRT_MOTION_INSTANCE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkAccelerationStructureInstanceKHR staticInstance;
	private final VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance;
	private final VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.unionLayout(
		    VkAccelerationStructureInstanceKHR.LAYOUT.withName("staticInstance"),
		    VkAccelerationStructureMatrixMotionInstanceNV.LAYOUT.withName("matrixMotionInstance"),
		    VkAccelerationStructureSRTMotionInstanceNV.LAYOUT.withName("srtMotionInstance")
		).withName("VkAccelerationStructureMotionInstanceDataNV").withByteAlignment(8);
		
		STATIC_INSTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("staticInstance"));
		MATRIX_MOTION_INSTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("matrixMotionInstance"));
		SRT_MOTION_INSTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srtMotionInstance"));
		//@formatter:on
	}

	public VkAccelerationStructureMotionInstanceDataNV() {
	    this(Arena.ofAuto());
	}
	
	public VkAccelerationStructureMotionInstanceDataNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkAccelerationStructureMotionInstanceDataNV(MemorySegment segment) {
	    this.segment = segment;
	
	    staticInstance = new VkAccelerationStructureInstanceKHR(segment.asSlice(STATIC_INSTANCE_BYTE_OFFSET, VkAccelerationStructureInstanceKHR.LAYOUT));
	    matrixMotionInstance = new VkAccelerationStructureMatrixMotionInstanceNV(segment.asSlice(MATRIX_MOTION_INSTANCE_BYTE_OFFSET, VkAccelerationStructureMatrixMotionInstanceNV.LAYOUT));
	    srtMotionInstance = new VkAccelerationStructureSRTMotionInstanceNV(segment.asSlice(SRT_MOTION_INSTANCE_BYTE_OFFSET, VkAccelerationStructureSRTMotionInstanceNV.LAYOUT));
	}

    /// @see #staticInstance()
    public VkAccelerationStructureMotionInstanceDataNV staticInstance(Consumer<VkAccelerationStructureInstanceKHR> consumer) {
    	consumer.accept(staticInstance);
    	return this;
    }
    
    /// @see #staticInstance()
    public VkAccelerationStructureMotionInstanceDataNV staticInstance(VkAccelerationStructureInstanceKHR other) {
    	staticInstance.set(other);
    	return this;
    }
    
    public VkAccelerationStructureInstanceKHR staticInstance() {
    	return staticInstance;
    }
    
    /// @see #matrixMotionInstance()
    public VkAccelerationStructureMotionInstanceDataNV matrixMotionInstance(Consumer<VkAccelerationStructureMatrixMotionInstanceNV> consumer) {
    	consumer.accept(matrixMotionInstance);
    	return this;
    }
    
    /// @see #matrixMotionInstance()
    public VkAccelerationStructureMotionInstanceDataNV matrixMotionInstance(VkAccelerationStructureMatrixMotionInstanceNV other) {
    	matrixMotionInstance.set(other);
    	return this;
    }
    
    public VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance() {
    	return matrixMotionInstance;
    }
    
    /// @see #srtMotionInstance()
    public VkAccelerationStructureMotionInstanceDataNV srtMotionInstance(Consumer<VkAccelerationStructureSRTMotionInstanceNV> consumer) {
    	consumer.accept(srtMotionInstance);
    	return this;
    }
    
    /// @see #srtMotionInstance()
    public VkAccelerationStructureMotionInstanceDataNV srtMotionInstance(VkAccelerationStructureSRTMotionInstanceNV other) {
    	srtMotionInstance.set(other);
    	return this;
    }
    
    public VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance() {
    	return srtMotionInstance;
    }
    
    @Override
    public VkAccelerationStructureMotionInstanceDataNV set(VkAccelerationStructureMotionInstanceDataNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureMotionInstanceDataNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureMotionInstanceDataNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureMotionInstanceDataNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureMotionInstanceDataNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureMotionInstanceDataNV> array(Arena arena, VkAccelerationStructureMotionInstanceDataNV... structs) {
        NativeStructArray<VkAccelerationStructureMotionInstanceDataNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureMotionInstanceDataNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureMotionInstanceDataNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureMotionInstanceDataNV(segment)
        );
    }

}