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

public final class VkAccelerationStructureInstanceKHR
		implements Struct<VkAccelerationStructureInstanceKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BIT_FIELDS0_HANDLE;
    public static final VarHandle BIT_FIELDS1_HANDLE;
    public static final VarHandle ACCELERATION_STRUCTURE_REFERENCE_HANDLE;

    public static final long TRANSFORM_BYTE_OFFSET;
    public static final long BIT_FIELDS0_BYTE_OFFSET;
    public static final long BIT_FIELDS1_BYTE_OFFSET;
    public static final long ACCELERATION_STRUCTURE_REFERENCE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkTransformMatrixKHR transform;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            VkTransformMatrixKHR.LAYOUT.withName("transform"),
            JAVA_INT.withName("bitFields0"),
            JAVA_INT.withName("bitFields1"),
            JAVA_LONG.withName("accelerationStructureReference")
        ).withName("VkAccelerationStructureInstanceKHR").withByteAlignment(8);
        
        BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
        BIT_FIELDS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields1"));
        ACCELERATION_STRUCTURE_REFERENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructureReference"));
        
        TRANSFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transform"));
        BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
        BIT_FIELDS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields1"));
        ACCELERATION_STRUCTURE_REFERENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureReference"));
        //@formatter:on
    }

    public VkAccelerationStructureInstanceKHR() {
        this(Arena.ofAuto());
    }
    
    public VkAccelerationStructureInstanceKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkAccelerationStructureInstanceKHR(MemorySegment segment) {
        this.segment = segment;
    
        transform = new VkTransformMatrixKHR(segment.asSlice(TRANSFORM_BYTE_OFFSET, VkTransformMatrixKHR.LAYOUT));
    }

    /// @see #bitFields0()
    public VkAccelerationStructureInstanceKHR bitFields0(int bitFields0) {
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
    public VkAccelerationStructureInstanceKHR bitFields1(int bitFields1) {
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
    public VkAccelerationStructureInstanceKHR accelerationStructureReference(long accelerationStructureReference) {
    	ACCELERATION_STRUCTURE_REFERENCE_HANDLE.set(segment, 0L, accelerationStructureReference);
    	return this;
    }
    
    public long accelerationStructureReference() {
    	return (long) ACCELERATION_STRUCTURE_REFERENCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #transform()
    public VkAccelerationStructureInstanceKHR transform(Consumer<VkTransformMatrixKHR> consumer) {
    	consumer.accept(transform);
    	return this;
    }
    
    /// @see #transform()
    public VkAccelerationStructureInstanceKHR transform(VkTransformMatrixKHR other) {
    	transform.set(other);
    	return this;
    }
    
    public VkTransformMatrixKHR transform() {
    	return transform;
    }
    
    @Override
    public VkAccelerationStructureInstanceKHR set(VkAccelerationStructureInstanceKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureInstanceKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureInstanceKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureInstanceKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureInstanceKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureInstanceKHR> array(Arena arena, VkAccelerationStructureInstanceKHR... structs) {
        NativeStructArray<VkAccelerationStructureInstanceKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureInstanceKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureInstanceKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureInstanceKHR(segment)
        );
    }
    
}