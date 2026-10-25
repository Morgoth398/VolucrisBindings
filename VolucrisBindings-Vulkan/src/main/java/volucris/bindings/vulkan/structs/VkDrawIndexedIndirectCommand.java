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

public final class VkDrawIndexedIndirectCommand
		implements Struct<VkDrawIndexedIndirectCommand> {

	public static final StructLayout LAYOUT;

	public static final VarHandle INDEX_COUNT_HANDLE;
	public static final VarHandle INSTANCE_COUNT_HANDLE;
	public static final VarHandle FIRST_INDEX_HANDLE;
	public static final VarHandle VERTEX_OFFSET_HANDLE;
	public static final VarHandle FIRST_INSTANCE_HANDLE;

	public static final long INDEX_COUNT_BYTE_OFFSET;
	public static final long INSTANCE_COUNT_BYTE_OFFSET;
	public static final long FIRST_INDEX_BYTE_OFFSET;
	public static final long VERTEX_OFFSET_BYTE_OFFSET;
	public static final long FIRST_INSTANCE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("indexCount"),
		    JAVA_INT.withName("instanceCount"),
		    JAVA_INT.withName("firstIndex"),
		    JAVA_INT.withName("vertexOffset"),
		    JAVA_INT.withName("firstInstance")
		).withName("VkDrawIndexedIndirectCommand").withByteAlignment(4);
		
		INDEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexCount"));
		INSTANCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("instanceCount"));
		FIRST_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("firstIndex"));
		VERTEX_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexOffset"));
		FIRST_INSTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("firstInstance"));
		
		INDEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexCount"));
		INSTANCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("instanceCount"));
		FIRST_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("firstIndex"));
		VERTEX_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexOffset"));
		FIRST_INSTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("firstInstance"));
		//@formatter:on
	}

	public VkDrawIndexedIndirectCommand() {
	    this(Arena.ofAuto());
	}
	
	public VkDrawIndexedIndirectCommand(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDrawIndexedIndirectCommand(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #indexCount()
    public VkDrawIndexedIndirectCommand indexCount(int indexCount) {
    	INDEX_COUNT_HANDLE.set(segment, 0L, indexCount);
    	return this;
    }
    
    public int indexCount() {
    	return (int) INDEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #instanceCount()
    public VkDrawIndexedIndirectCommand instanceCount(int instanceCount) {
    	INSTANCE_COUNT_HANDLE.set(segment, 0L, instanceCount);
    	return this;
    }
    
    public int instanceCount() {
    	return (int) INSTANCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #firstIndex()
    public VkDrawIndexedIndirectCommand firstIndex(int firstIndex) {
    	FIRST_INDEX_HANDLE.set(segment, 0L, firstIndex);
    	return this;
    }
    
    public int firstIndex() {
    	return (int) FIRST_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexOffset()
    public VkDrawIndexedIndirectCommand vertexOffset(int vertexOffset) {
    	VERTEX_OFFSET_HANDLE.set(segment, 0L, vertexOffset);
    	return this;
    }
    
    public int vertexOffset() {
    	return (int) VERTEX_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #firstInstance()
    public VkDrawIndexedIndirectCommand firstInstance(int firstInstance) {
    	FIRST_INSTANCE_HANDLE.set(segment, 0L, firstInstance);
    	return this;
    }
    
    public int firstInstance() {
    	return (int) FIRST_INSTANCE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDrawIndexedIndirectCommand set(VkDrawIndexedIndirectCommand other) {
        return set(other.segment);
    }
    
    @Override
    public VkDrawIndexedIndirectCommand set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDrawIndexedIndirectCommand> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDrawIndexedIndirectCommand> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDrawIndexedIndirectCommand(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDrawIndexedIndirectCommand> array(SegmentAllocator allocator, VkDrawIndexedIndirectCommand... structs) {
        NativeStructArray<VkDrawIndexedIndirectCommand> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDrawIndexedIndirectCommand(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDrawIndexedIndirectCommand> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDrawIndexedIndirectCommand(segment)
        );
    }

}