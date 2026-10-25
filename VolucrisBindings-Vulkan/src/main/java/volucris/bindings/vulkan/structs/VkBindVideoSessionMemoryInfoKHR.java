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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkBindVideoSessionMemoryInfoKHR
		implements Struct<VkBindVideoSessionMemoryInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MEMORY_BIND_INDEX_HANDLE;
	public static final VarHandle MEMORY_HANDLE;
	public static final VarHandle MEMORY_OFFSET_HANDLE;
	public static final VarHandle MEMORY_SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MEMORY_BIND_INDEX_BYTE_OFFSET;
	public static final long MEMORY_BYTE_OFFSET;
	public static final long MEMORY_OFFSET_BYTE_OFFSET;
	public static final long MEMORY_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("memoryBindIndex"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("memory"),
		    JAVA_LONG.withName("memoryOffset"),
		    JAVA_LONG.withName("memorySize")
		).withName("VkBindVideoSessionMemoryInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MEMORY_BIND_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryBindIndex"));
		MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memory"));
		MEMORY_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryOffset"));
		MEMORY_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memorySize"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MEMORY_BIND_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryBindIndex"));
		MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memory"));
		MEMORY_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
		MEMORY_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memorySize"));
		//@formatter:on
	}

	public VkBindVideoSessionMemoryInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkBindVideoSessionMemoryInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkBindVideoSessionMemoryInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkBindVideoSessionMemoryInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBindVideoSessionMemoryInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #memoryBindIndex()
    public VkBindVideoSessionMemoryInfoKHR memoryBindIndex(int memoryBindIndex) {
    	MEMORY_BIND_INDEX_HANDLE.set(segment, 0L, memoryBindIndex);
    	return this;
    }
    
    public int memoryBindIndex() {
    	return (int) MEMORY_BIND_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #memory()
    public VkBindVideoSessionMemoryInfoKHR memory(VkDeviceMemory memory) {
    	MEMORY_HANDLE.set(segment, 0L, memory.memorySegment());
    	return this;
    }
    
    public @Nullable VkDeviceMemory memory() {
    	MemorySegment segment = (MemorySegment) MEMORY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDeviceMemory(segment);
    }
    
    /// @see #memoryOffset()
    public VkBindVideoSessionMemoryInfoKHR memoryOffset(long memoryOffset) {
    	MEMORY_OFFSET_HANDLE.set(segment, 0L, memoryOffset);
    	return this;
    }
    
    public long memoryOffset() {
    	return (long) MEMORY_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #memorySize()
    public VkBindVideoSessionMemoryInfoKHR memorySize(long memorySize) {
    	MEMORY_SIZE_HANDLE.set(segment, 0L, memorySize);
    	return this;
    }
    
    public long memorySize() {
    	return (long) MEMORY_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkBindVideoSessionMemoryInfoKHR set(VkBindVideoSessionMemoryInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindVideoSessionMemoryInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindVideoSessionMemoryInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindVideoSessionMemoryInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBindVideoSessionMemoryInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindVideoSessionMemoryInfoKHR> array(SegmentAllocator allocator, VkBindVideoSessionMemoryInfoKHR... structs) {
        NativeStructArray<VkBindVideoSessionMemoryInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBindVideoSessionMemoryInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindVideoSessionMemoryInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindVideoSessionMemoryInfoKHR(segment)
        );
    }

}