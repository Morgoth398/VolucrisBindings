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

public final class VkMemoryHeap
		implements Struct<VkMemoryHeap> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SIZE_HANDLE;
	public static final VarHandle FLAGS_HANDLE;

	public static final long SIZE_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("size"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkMemoryHeap").withByteAlignment(8);
		
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		//@formatter:on
	}

	public VkMemoryHeap() {
	    this(Arena.ofAuto());
	}
	
	public VkMemoryHeap(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkMemoryHeap(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #size()
    public VkMemoryHeap size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkMemoryHeap flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMemoryHeap set(VkMemoryHeap other) {
        return set(other.segment);
    }
    
    @Override
    public VkMemoryHeap set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMemoryHeap> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMemoryHeap> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryHeap(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMemoryHeap> array(Arena arena, VkMemoryHeap... structs) {
        NativeStructArray<VkMemoryHeap> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryHeap(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMemoryHeap> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMemoryHeap(segment)
        );
    }

}