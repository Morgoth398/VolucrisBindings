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

public final class VkDependencyInfo
		implements Struct<VkDependencyInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DEPENDENCY_FLAGS_HANDLE;
	public static final VarHandle MEMORY_BARRIER_COUNT_HANDLE;
	public static final VarHandle P_MEMORY_BARRIERS_HANDLE;
	public static final VarHandle BUFFER_MEMORY_BARRIER_COUNT_HANDLE;
	public static final VarHandle P_BUFFER_MEMORY_BARRIERS_HANDLE;
	public static final VarHandle IMAGE_MEMORY_BARRIER_COUNT_HANDLE;
	public static final VarHandle P_IMAGE_MEMORY_BARRIERS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DEPENDENCY_FLAGS_BYTE_OFFSET;
	public static final long MEMORY_BARRIER_COUNT_BYTE_OFFSET;
	public static final long P_MEMORY_BARRIERS_BYTE_OFFSET;
	public static final long BUFFER_MEMORY_BARRIER_COUNT_BYTE_OFFSET;
	public static final long P_BUFFER_MEMORY_BARRIERS_BYTE_OFFSET;
	public static final long IMAGE_MEMORY_BARRIER_COUNT_BYTE_OFFSET;
	public static final long P_IMAGE_MEMORY_BARRIERS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("dependencyFlags"),
		    JAVA_INT.withName("memoryBarrierCount"),
		    UNBOUNDED_ADDRESS.withName("pMemoryBarriers"),
		    JAVA_INT.withName("bufferMemoryBarrierCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pBufferMemoryBarriers"),
		    JAVA_INT.withName("imageMemoryBarrierCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pImageMemoryBarriers")
		).withName("VkDependencyInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DEPENDENCY_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dependencyFlags"));
		MEMORY_BARRIER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryBarrierCount"));
		P_MEMORY_BARRIERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMemoryBarriers"));
		BUFFER_MEMORY_BARRIER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferMemoryBarrierCount"));
		P_BUFFER_MEMORY_BARRIERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBufferMemoryBarriers"));
		IMAGE_MEMORY_BARRIER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageMemoryBarrierCount"));
		P_IMAGE_MEMORY_BARRIERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pImageMemoryBarriers"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DEPENDENCY_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dependencyFlags"));
		MEMORY_BARRIER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryBarrierCount"));
		P_MEMORY_BARRIERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMemoryBarriers"));
		BUFFER_MEMORY_BARRIER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferMemoryBarrierCount"));
		P_BUFFER_MEMORY_BARRIERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBufferMemoryBarriers"));
		IMAGE_MEMORY_BARRIER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageMemoryBarrierCount"));
		P_IMAGE_MEMORY_BARRIERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pImageMemoryBarriers"));
		//@formatter:on
	}

	public VkDependencyInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkDependencyInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDependencyInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDependencyInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDependencyInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #dependencyFlags()
    public VkDependencyInfo dependencyFlags(int dependencyFlags) {
    	DEPENDENCY_FLAGS_HANDLE.set(segment, 0L, dependencyFlags);
    	return this;
    }
    
    public int dependencyFlags() {
    	return (int) DEPENDENCY_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #memoryBarrierCount()
    public VkDependencyInfo memoryBarrierCount(int memoryBarrierCount) {
    	MEMORY_BARRIER_COUNT_HANDLE.set(segment, 0L, memoryBarrierCount);
    	return this;
    }
    
    public int memoryBarrierCount() {
    	return (int) MEMORY_BARRIER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pMemoryBarriers()
    public VkDependencyInfo pMemoryBarriers(NativeStructArray<VkMemoryBarrier2> pMemoryBarriers) {
    	P_MEMORY_BARRIERS_HANDLE.set(segment, 0L, pMemoryBarriers.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkMemoryBarrier2> pMemoryBarriers() {
    	MemorySegment segment = (MemorySegment) P_MEMORY_BARRIERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkMemoryBarrier2.array(segment);
    }
    
    /// @see #bufferMemoryBarrierCount()
    public VkDependencyInfo bufferMemoryBarrierCount(int bufferMemoryBarrierCount) {
    	BUFFER_MEMORY_BARRIER_COUNT_HANDLE.set(segment, 0L, bufferMemoryBarrierCount);
    	return this;
    }
    
    public int bufferMemoryBarrierCount() {
    	return (int) BUFFER_MEMORY_BARRIER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pBufferMemoryBarriers()
    public VkDependencyInfo pBufferMemoryBarriers(NativeStructArray<VkBufferMemoryBarrier2> pBufferMemoryBarriers) {
    	P_BUFFER_MEMORY_BARRIERS_HANDLE.set(segment, 0L, pBufferMemoryBarriers.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkBufferMemoryBarrier2> pBufferMemoryBarriers() {
    	MemorySegment segment = (MemorySegment) P_BUFFER_MEMORY_BARRIERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkBufferMemoryBarrier2.array(segment);
    }
    
    /// @see #imageMemoryBarrierCount()
    public VkDependencyInfo imageMemoryBarrierCount(int imageMemoryBarrierCount) {
    	IMAGE_MEMORY_BARRIER_COUNT_HANDLE.set(segment, 0L, imageMemoryBarrierCount);
    	return this;
    }
    
    public int imageMemoryBarrierCount() {
    	return (int) IMAGE_MEMORY_BARRIER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pImageMemoryBarriers()
    public VkDependencyInfo pImageMemoryBarriers(NativeStructArray<VkImageMemoryBarrier2> pImageMemoryBarriers) {
    	P_IMAGE_MEMORY_BARRIERS_HANDLE.set(segment, 0L, pImageMemoryBarriers.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkImageMemoryBarrier2> pImageMemoryBarriers() {
    	MemorySegment segment = (MemorySegment) P_IMAGE_MEMORY_BARRIERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkImageMemoryBarrier2.array(segment);
    }
    
    @Override
    public VkDependencyInfo set(VkDependencyInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkDependencyInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDependencyInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDependencyInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDependencyInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDependencyInfo> array(Arena arena, VkDependencyInfo... structs) {
        NativeStructArray<VkDependencyInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDependencyInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDependencyInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDependencyInfo(segment)
        );
    }

}