/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkAccelerationStructureBuildRangeInfoKHR
		implements Struct<VkAccelerationStructureBuildRangeInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PRIMITIVE_COUNT_HANDLE;
	public static final VarHandle PRIMITIVE_OFFSET_HANDLE;
	public static final VarHandle FIRST_VERTEX_HANDLE;
	public static final VarHandle TRANSFORM_OFFSET_HANDLE;

	public static final long PRIMITIVE_COUNT_BYTE_OFFSET;
	public static final long PRIMITIVE_OFFSET_BYTE_OFFSET;
	public static final long FIRST_VERTEX_BYTE_OFFSET;
	public static final long TRANSFORM_OFFSET_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("primitiveCount"),
		    JAVA_INT.withName("primitiveOffset"),
		    JAVA_INT.withName("firstVertex"),
		    JAVA_INT.withName("transformOffset")
		).withName("VkAccelerationStructureBuildRangeInfoKHR").withByteAlignment(4);
		
		PRIMITIVE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primitiveCount"));
		PRIMITIVE_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primitiveOffset"));
		FIRST_VERTEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("firstVertex"));
		TRANSFORM_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transformOffset"));
		
		PRIMITIVE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primitiveCount"));
		PRIMITIVE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primitiveOffset"));
		FIRST_VERTEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("firstVertex"));
		TRANSFORM_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transformOffset"));
		//@formatter:on
	}

	public VkAccelerationStructureBuildRangeInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkAccelerationStructureBuildRangeInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkAccelerationStructureBuildRangeInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #primitiveCount()
    public VkAccelerationStructureBuildRangeInfoKHR primitiveCount(int primitiveCount) {
    	PRIMITIVE_COUNT_HANDLE.set(segment, 0L, primitiveCount);
    	return this;
    }
    
    public int primitiveCount() {
    	return (int) PRIMITIVE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #primitiveOffset()
    public VkAccelerationStructureBuildRangeInfoKHR primitiveOffset(int primitiveOffset) {
    	PRIMITIVE_OFFSET_HANDLE.set(segment, 0L, primitiveOffset);
    	return this;
    }
    
    public int primitiveOffset() {
    	return (int) PRIMITIVE_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #firstVertex()
    public VkAccelerationStructureBuildRangeInfoKHR firstVertex(int firstVertex) {
    	FIRST_VERTEX_HANDLE.set(segment, 0L, firstVertex);
    	return this;
    }
    
    public int firstVertex() {
    	return (int) FIRST_VERTEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #transformOffset()
    public VkAccelerationStructureBuildRangeInfoKHR transformOffset(int transformOffset) {
    	TRANSFORM_OFFSET_HANDLE.set(segment, 0L, transformOffset);
    	return this;
    }
    
    public int transformOffset() {
    	return (int) TRANSFORM_OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAccelerationStructureBuildRangeInfoKHR set(VkAccelerationStructureBuildRangeInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureBuildRangeInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureBuildRangeInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureBuildRangeInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureBuildRangeInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureBuildRangeInfoKHR> array(Arena arena, VkAccelerationStructureBuildRangeInfoKHR... structs) {
        NativeStructArray<VkAccelerationStructureBuildRangeInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureBuildRangeInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureBuildRangeInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureBuildRangeInfoKHR(segment)
        );
    }

}