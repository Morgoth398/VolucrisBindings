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

public final class VkDrawMeshTasksIndirectCommandEXT
		implements Struct<VkDrawMeshTasksIndirectCommandEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle GROUP_COUNT_X_HANDLE;
	public static final VarHandle GROUP_COUNT_Y_HANDLE;
	public static final VarHandle GROUP_COUNT_Z_HANDLE;

	public static final long GROUP_COUNT_X_BYTE_OFFSET;
	public static final long GROUP_COUNT_Y_BYTE_OFFSET;
	public static final long GROUP_COUNT_Z_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("groupCountX"),
		    JAVA_INT.withName("groupCountY"),
		    JAVA_INT.withName("groupCountZ")
		).withName("VkDrawMeshTasksIndirectCommandEXT").withByteAlignment(4);
		
		GROUP_COUNT_X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("groupCountX"));
		GROUP_COUNT_Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("groupCountY"));
		GROUP_COUNT_Z_HANDLE = LAYOUT.varHandle(PathElement.groupElement("groupCountZ"));
		
		GROUP_COUNT_X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("groupCountX"));
		GROUP_COUNT_Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("groupCountY"));
		GROUP_COUNT_Z_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("groupCountZ"));
		//@formatter:on
	}

	public VkDrawMeshTasksIndirectCommandEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDrawMeshTasksIndirectCommandEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDrawMeshTasksIndirectCommandEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #groupCountX()
    public VkDrawMeshTasksIndirectCommandEXT groupCountX(int groupCountX) {
    	GROUP_COUNT_X_HANDLE.set(segment, 0L, groupCountX);
    	return this;
    }
    
    public int groupCountX() {
    	return (int) GROUP_COUNT_X_HANDLE.get(segment, 0L);
    }
    
    /// @see #groupCountY()
    public VkDrawMeshTasksIndirectCommandEXT groupCountY(int groupCountY) {
    	GROUP_COUNT_Y_HANDLE.set(segment, 0L, groupCountY);
    	return this;
    }
    
    public int groupCountY() {
    	return (int) GROUP_COUNT_Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #groupCountZ()
    public VkDrawMeshTasksIndirectCommandEXT groupCountZ(int groupCountZ) {
    	GROUP_COUNT_Z_HANDLE.set(segment, 0L, groupCountZ);
    	return this;
    }
    
    public int groupCountZ() {
    	return (int) GROUP_COUNT_Z_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDrawMeshTasksIndirectCommandEXT set(VkDrawMeshTasksIndirectCommandEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDrawMeshTasksIndirectCommandEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDrawMeshTasksIndirectCommandEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDrawMeshTasksIndirectCommandEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDrawMeshTasksIndirectCommandEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDrawMeshTasksIndirectCommandEXT> array(SegmentAllocator allocator, VkDrawMeshTasksIndirectCommandEXT... structs) {
        NativeStructArray<VkDrawMeshTasksIndirectCommandEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDrawMeshTasksIndirectCommandEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDrawMeshTasksIndirectCommandEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDrawMeshTasksIndirectCommandEXT(segment)
        );
    }

}