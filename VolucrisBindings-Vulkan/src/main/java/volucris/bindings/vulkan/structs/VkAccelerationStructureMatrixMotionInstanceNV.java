/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkAccelerationStructureMatrixMotionInstanceNV
		implements Struct<VkAccelerationStructureMatrixMotionInstanceNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BIT_FIELDS0_HANDLE;
	public static final VarHandle BIT_FIELDS1_HANDLE;
	public static final VarHandle ACCELERATION_STRUCTURE_REFERENCE_HANDLE;

	public static final long TRANSFORM_T0_BYTE_OFFSET;
	public static final long TRANSFORM_T1_BYTE_OFFSET;
	public static final long BIT_FIELDS0_BYTE_OFFSET;
	public static final long BIT_FIELDS1_BYTE_OFFSET;
	public static final long ACCELERATION_STRUCTURE_REFERENCE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkTransformMatrixKHR transformT0;
	private final VkTransformMatrixKHR transformT1;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    VkTransformMatrixKHR.LAYOUT.withName("transformT0"),
		    VkTransformMatrixKHR.LAYOUT.withName("transformT1"),
		    JAVA_INT.withName("bitFields0"),
		    JAVA_INT.withName("bitFields1"),
		    JAVA_LONG.withName("accelerationStructureReference")
		).withName("VkAccelerationStructureMatrixMotionInstanceNV").withByteAlignment(8);
		
		BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
		BIT_FIELDS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields1"));
		ACCELERATION_STRUCTURE_REFERENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructureReference"));
		
		TRANSFORM_T0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transformT0"));
		TRANSFORM_T1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transformT1"));
		BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
		BIT_FIELDS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields1"));
		ACCELERATION_STRUCTURE_REFERENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureReference"));
		//@formatter:on
	}

	public VkAccelerationStructureMatrixMotionInstanceNV() {
	    this(Arena.ofAuto());
	}
	
	public VkAccelerationStructureMatrixMotionInstanceNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkAccelerationStructureMatrixMotionInstanceNV(MemorySegment segment) {
	    this.segment = segment;
	
	    transformT0 = new VkTransformMatrixKHR(segment.asSlice(TRANSFORM_T0_BYTE_OFFSET, VkTransformMatrixKHR.LAYOUT));
	    transformT1 = new VkTransformMatrixKHR(segment.asSlice(TRANSFORM_T1_BYTE_OFFSET, VkTransformMatrixKHR.LAYOUT));
	}

    /// @see #transformT0()
    public VkAccelerationStructureMatrixMotionInstanceNV transformT0(Consumer<VkTransformMatrixKHR> consumer) {
    	consumer.accept(transformT0);
    	return this;
    }
    
    /// @see #transformT0()
    public VkAccelerationStructureMatrixMotionInstanceNV transformT0(VkTransformMatrixKHR other) {
    	transformT0.set(other);
    	return this;
    }
    
    public VkTransformMatrixKHR transformT0() {
    	return transformT0;
    }
    
    /// @see #transformT1()
    public VkAccelerationStructureMatrixMotionInstanceNV transformT1(Consumer<VkTransformMatrixKHR> consumer) {
    	consumer.accept(transformT1);
    	return this;
    }
    
    /// @see #transformT1()
    public VkAccelerationStructureMatrixMotionInstanceNV transformT1(VkTransformMatrixKHR other) {
    	transformT1.set(other);
    	return this;
    }
    
    public VkTransformMatrixKHR transformT1() {
    	return transformT1;
    }
    
    /// @see #bitFields0()
    public VkAccelerationStructureMatrixMotionInstanceNV bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// instanceCustomIndex : 24
    /// mask : 8
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    /// @see #bitFields1()
    public VkAccelerationStructureMatrixMotionInstanceNV bitFields1(int bitFields1) {
    	BIT_FIELDS1_HANDLE.set(segment, 0L, bitFields1);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// instanceShaderBindingTableRecordOffset : 24
    /// flags : 8
    /// ```
    public int bitFields1() {
    	return (int) BIT_FIELDS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #accelerationStructureReference()
    public VkAccelerationStructureMatrixMotionInstanceNV accelerationStructureReference(long accelerationStructureReference) {
    	ACCELERATION_STRUCTURE_REFERENCE_HANDLE.set(segment, 0L, accelerationStructureReference);
    	return this;
    }
    
    public long accelerationStructureReference() {
    	return (long) ACCELERATION_STRUCTURE_REFERENCE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAccelerationStructureMatrixMotionInstanceNV set(VkAccelerationStructureMatrixMotionInstanceNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureMatrixMotionInstanceNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureMatrixMotionInstanceNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureMatrixMotionInstanceNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureMatrixMotionInstanceNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureMatrixMotionInstanceNV> array(Arena arena, VkAccelerationStructureMatrixMotionInstanceNV... structs) {
        NativeStructArray<VkAccelerationStructureMatrixMotionInstanceNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureMatrixMotionInstanceNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureMatrixMotionInstanceNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureMatrixMotionInstanceNV(segment)
        );
    }

}