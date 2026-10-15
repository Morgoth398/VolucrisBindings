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

public final class VkMultiDrawInfoEXT
		implements Struct<VkMultiDrawInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FIRST_VERTEX_HANDLE;
	public static final VarHandle VERTEX_COUNT_HANDLE;

	public static final long FIRST_VERTEX_BYTE_OFFSET;
	public static final long VERTEX_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("firstVertex"),
		    JAVA_INT.withName("vertexCount")
		).withName("VkMultiDrawInfoEXT").withByteAlignment(4);
		
		FIRST_VERTEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("firstVertex"));
		VERTEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexCount"));
		
		FIRST_VERTEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("firstVertex"));
		VERTEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexCount"));
		//@formatter:on
	}

	public VkMultiDrawInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkMultiDrawInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkMultiDrawInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #firstVertex()
    public VkMultiDrawInfoEXT firstVertex(int firstVertex) {
    	FIRST_VERTEX_HANDLE.set(segment, 0L, firstVertex);
    	return this;
    }
    
    public int firstVertex() {
    	return (int) FIRST_VERTEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexCount()
    public VkMultiDrawInfoEXT vertexCount(int vertexCount) {
    	VERTEX_COUNT_HANDLE.set(segment, 0L, vertexCount);
    	return this;
    }
    
    public int vertexCount() {
    	return (int) VERTEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMultiDrawInfoEXT set(VkMultiDrawInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkMultiDrawInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMultiDrawInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMultiDrawInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMultiDrawInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMultiDrawInfoEXT> array(Arena arena, VkMultiDrawInfoEXT... structs) {
        NativeStructArray<VkMultiDrawInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMultiDrawInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMultiDrawInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMultiDrawInfoEXT(segment)
        );
    }

}