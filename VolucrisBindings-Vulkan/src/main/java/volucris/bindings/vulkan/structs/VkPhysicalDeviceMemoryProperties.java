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

public final class VkPhysicalDeviceMemoryProperties
		implements Struct<VkPhysicalDeviceMemoryProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle MEMORY_TYPE_COUNT_HANDLE;
	public static final VarHandle MEMORY_HEAP_COUNT_HANDLE;

	public static final long MEMORY_TYPE_COUNT_BYTE_OFFSET;
	public static final long MEMORY_TYPES_BYTE_OFFSET;
	public static final long MEMORY_HEAP_COUNT_BYTE_OFFSET;
	public static final long MEMORY_HEAPS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkMemoryType[] memoryTypes;
	private final VkMemoryHeap[] memoryHeaps;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("memoryTypeCount"),
		    MemoryLayout.sequenceLayout(32, VkMemoryType.LAYOUT).withName("memoryTypes"),
		    JAVA_INT.withName("memoryHeapCount"),
		    MemoryLayout.sequenceLayout(16, VkMemoryHeap.LAYOUT).withName("memoryHeaps")
		).withName("VkPhysicalDeviceMemoryProperties").withByteAlignment(8);
		
		MEMORY_TYPE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryTypeCount"));
		MEMORY_HEAP_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryHeapCount"));
		
		MEMORY_TYPE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeCount"));
		MEMORY_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryTypes"));
		MEMORY_HEAP_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryHeapCount"));
		MEMORY_HEAPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryHeaps"));
		//@formatter:on
	}

	public VkPhysicalDeviceMemoryProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceMemoryProperties(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceMemoryProperties(MemorySegment segment) {
	    this.segment = segment;
	
	    memoryTypes = new VkMemoryType[32];
	    for (int i = 0; i < 32; i++) {
	        long offset = MEMORY_TYPES_BYTE_OFFSET + i * VkMemoryType.LAYOUT.byteSize();
	        memoryTypes[i] = new VkMemoryType(segment.asSlice(offset, VkMemoryType.LAYOUT));
	    }
	    memoryHeaps = new VkMemoryHeap[16];
	    for (int i = 0; i < 16; i++) {
	        long offset = MEMORY_HEAPS_BYTE_OFFSET + i * VkMemoryHeap.LAYOUT.byteSize();
	        memoryHeaps[i] = new VkMemoryHeap(segment.asSlice(offset, VkMemoryHeap.LAYOUT));
	    }
	}

    /// @see #memoryTypeCount()
    public VkPhysicalDeviceMemoryProperties memoryTypeCount(int memoryTypeCount) {
    	MEMORY_TYPE_COUNT_HANDLE.set(segment, 0L, memoryTypeCount);
    	return this;
    }
    
    public int memoryTypeCount() {
    	return (int) MEMORY_TYPE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #memoryTypes(int)
    public VkPhysicalDeviceMemoryProperties memoryTypes(Consumer<VkMemoryType> consumer, int index) {
    	consumer.accept(memoryTypes[index]);
    	return this;
    }
    
    /// @see #memoryTypes(int)
    public VkPhysicalDeviceMemoryProperties memoryTypes(VkMemoryType other, int index) {
    	memoryTypes[index].set(other);
    	return this;
    }
    
    public VkMemoryType memoryTypes(int index) {
    	return memoryTypes[index];
    }
    
    /// @see #memoryHeapCount()
    public VkPhysicalDeviceMemoryProperties memoryHeapCount(int memoryHeapCount) {
    	MEMORY_HEAP_COUNT_HANDLE.set(segment, 0L, memoryHeapCount);
    	return this;
    }
    
    public int memoryHeapCount() {
    	return (int) MEMORY_HEAP_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #memoryHeaps(int)
    public VkPhysicalDeviceMemoryProperties memoryHeaps(Consumer<VkMemoryHeap> consumer, int index) {
    	consumer.accept(memoryHeaps[index]);
    	return this;
    }
    
    /// @see #memoryHeaps(int)
    public VkPhysicalDeviceMemoryProperties memoryHeaps(VkMemoryHeap other, int index) {
    	memoryHeaps[index].set(other);
    	return this;
    }
    
    public VkMemoryHeap memoryHeaps(int index) {
    	return memoryHeaps[index];
    }
    
    @Override
    public VkPhysicalDeviceMemoryProperties set(VkPhysicalDeviceMemoryProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMemoryProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMemoryProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMemoryProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMemoryProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMemoryProperties> array(Arena arena, VkPhysicalDeviceMemoryProperties... structs) {
        NativeStructArray<VkPhysicalDeviceMemoryProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMemoryProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMemoryProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMemoryProperties(segment)
        );
    }

}