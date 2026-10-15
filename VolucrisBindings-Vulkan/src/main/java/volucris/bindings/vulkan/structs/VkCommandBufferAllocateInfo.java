/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
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

public final class VkCommandBufferAllocateInfo
		implements Struct<VkCommandBufferAllocateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COMMAND_POOL_HANDLE;
	public static final VarHandle LEVEL_HANDLE;
	public static final VarHandle COMMAND_BUFFER_COUNT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COMMAND_POOL_BYTE_OFFSET;
	public static final long LEVEL_BYTE_OFFSET;
	public static final long COMMAND_BUFFER_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("commandPool"),
		    JAVA_INT.withName("level"),
		    JAVA_INT.withName("commandBufferCount")
		).withName("VkCommandBufferAllocateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COMMAND_POOL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("commandPool"));
		LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("level"));
		COMMAND_BUFFER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("commandBufferCount"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COMMAND_POOL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("commandPool"));
		LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("level"));
		COMMAND_BUFFER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("commandBufferCount"));
		//@formatter:on
	}

	public VkCommandBufferAllocateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkCommandBufferAllocateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkCommandBufferAllocateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkCommandBufferAllocateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCommandBufferAllocateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #commandPool()
    public VkCommandBufferAllocateInfo commandPool(VkCommandPool commandPool) {
    	COMMAND_POOL_HANDLE.set(segment, 0L, commandPool.memorySegment());
    	return this;
    }
    
    public @Nullable VkCommandPool commandPool() {
    	MemorySegment segment = (MemorySegment) COMMAND_POOL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkCommandPool(segment);
    }
    
    /// @see #level()
    public VkCommandBufferAllocateInfo level(int level) {
    	LEVEL_HANDLE.set(segment, 0L, level);
    	return this;
    }
    
    public int level() {
    	return (int) LEVEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #commandBufferCount()
    public VkCommandBufferAllocateInfo commandBufferCount(int commandBufferCount) {
    	COMMAND_BUFFER_COUNT_HANDLE.set(segment, 0L, commandBufferCount);
    	return this;
    }
    
    public int commandBufferCount() {
    	return (int) COMMAND_BUFFER_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkCommandBufferAllocateInfo set(VkCommandBufferAllocateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkCommandBufferAllocateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCommandBufferAllocateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCommandBufferAllocateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCommandBufferAllocateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCommandBufferAllocateInfo> array(Arena arena, VkCommandBufferAllocateInfo... structs) {
        NativeStructArray<VkCommandBufferAllocateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCommandBufferAllocateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCommandBufferAllocateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCommandBufferAllocateInfo(segment)
        );
    }

}