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

public final class VkMemoryType
		implements Struct<VkMemoryType> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PROPERTY_FLAGS_HANDLE;
	public static final VarHandle HEAP_INDEX_HANDLE;

	public static final long PROPERTY_FLAGS_BYTE_OFFSET;
	public static final long HEAP_INDEX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("propertyFlags"),
		    JAVA_INT.withName("heapIndex")
		).withName("VkMemoryType").withByteAlignment(4);
		
		PROPERTY_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("propertyFlags"));
		HEAP_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heapIndex"));
		
		PROPERTY_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("propertyFlags"));
		HEAP_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapIndex"));
		//@formatter:on
	}

	public VkMemoryType() {
	    this(Arena.ofAuto());
	}
	
	public VkMemoryType(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkMemoryType(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #propertyFlags()
    public VkMemoryType propertyFlags(int propertyFlags) {
    	PROPERTY_FLAGS_HANDLE.set(segment, 0L, propertyFlags);
    	return this;
    }
    
    public int propertyFlags() {
    	return (int) PROPERTY_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #heapIndex()
    public VkMemoryType heapIndex(int heapIndex) {
    	HEAP_INDEX_HANDLE.set(segment, 0L, heapIndex);
    	return this;
    }
    
    public int heapIndex() {
    	return (int) HEAP_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMemoryType set(VkMemoryType other) {
        return set(other.segment);
    }
    
    @Override
    public VkMemoryType set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMemoryType> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMemoryType> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryType(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMemoryType> array(Arena arena, VkMemoryType... structs) {
        NativeStructArray<VkMemoryType> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryType(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMemoryType> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMemoryType(segment)
        );
    }

}