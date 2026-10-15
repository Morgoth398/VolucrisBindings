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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkBindSparseInfo
		implements Struct<VkBindSparseInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle WAIT_SEMAPHORE_COUNT_HANDLE;
	public static final VarHandle P_WAIT_SEMAPHORES_HANDLE;
	public static final VarHandle BUFFER_BIND_COUNT_HANDLE;
	public static final VarHandle P_BUFFER_BINDS_HANDLE;
	public static final VarHandle IMAGE_OPAQUE_BIND_COUNT_HANDLE;
	public static final VarHandle P_IMAGE_OPAQUE_BINDS_HANDLE;
	public static final VarHandle IMAGE_BIND_COUNT_HANDLE;
	public static final VarHandle P_IMAGE_BINDS_HANDLE;
	public static final VarHandle SIGNAL_SEMAPHORE_COUNT_HANDLE;
	public static final VarHandle P_SIGNAL_SEMAPHORES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long WAIT_SEMAPHORE_COUNT_BYTE_OFFSET;
	public static final long P_WAIT_SEMAPHORES_BYTE_OFFSET;
	public static final long BUFFER_BIND_COUNT_BYTE_OFFSET;
	public static final long P_BUFFER_BINDS_BYTE_OFFSET;
	public static final long IMAGE_OPAQUE_BIND_COUNT_BYTE_OFFSET;
	public static final long P_IMAGE_OPAQUE_BINDS_BYTE_OFFSET;
	public static final long IMAGE_BIND_COUNT_BYTE_OFFSET;
	public static final long P_IMAGE_BINDS_BYTE_OFFSET;
	public static final long SIGNAL_SEMAPHORE_COUNT_BYTE_OFFSET;
	public static final long P_SIGNAL_SEMAPHORES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("waitSemaphoreCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pWaitSemaphores"),
		    JAVA_INT.withName("bufferBindCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pBufferBinds"),
		    JAVA_INT.withName("imageOpaqueBindCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pImageOpaqueBinds"),
		    JAVA_INT.withName("imageBindCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pImageBinds"),
		    JAVA_INT.withName("signalSemaphoreCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pSignalSemaphores")
		).withName("VkBindSparseInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		WAIT_SEMAPHORE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waitSemaphoreCount"));
		P_WAIT_SEMAPHORES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pWaitSemaphores"));
		BUFFER_BIND_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferBindCount"));
		P_BUFFER_BINDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBufferBinds"));
		IMAGE_OPAQUE_BIND_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageOpaqueBindCount"));
		P_IMAGE_OPAQUE_BINDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pImageOpaqueBinds"));
		IMAGE_BIND_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageBindCount"));
		P_IMAGE_BINDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pImageBinds"));
		SIGNAL_SEMAPHORE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("signalSemaphoreCount"));
		P_SIGNAL_SEMAPHORES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSignalSemaphores"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		WAIT_SEMAPHORE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreCount"));
		P_WAIT_SEMAPHORES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphores"));
		BUFFER_BIND_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferBindCount"));
		P_BUFFER_BINDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBufferBinds"));
		IMAGE_OPAQUE_BIND_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageOpaqueBindCount"));
		P_IMAGE_OPAQUE_BINDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pImageOpaqueBinds"));
		IMAGE_BIND_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageBindCount"));
		P_IMAGE_BINDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pImageBinds"));
		SIGNAL_SEMAPHORE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphoreCount"));
		P_SIGNAL_SEMAPHORES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSignalSemaphores"));
		//@formatter:on
	}

	public VkBindSparseInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkBindSparseInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkBindSparseInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkBindSparseInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBindSparseInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #waitSemaphoreCount()
    public VkBindSparseInfo waitSemaphoreCount(int waitSemaphoreCount) {
    	WAIT_SEMAPHORE_COUNT_HANDLE.set(segment, 0L, waitSemaphoreCount);
    	return this;
    }
    
    public int waitSemaphoreCount() {
    	return (int) WAIT_SEMAPHORE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pWaitSemaphores()
    public VkBindSparseInfo pWaitSemaphores(NativePointerArray pWaitSemaphores) {
    	P_WAIT_SEMAPHORES_HANDLE.set(segment, 0L, pWaitSemaphores.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pWaitSemaphores() {
    	MemorySegment segment = (MemorySegment) P_WAIT_SEMAPHORES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #bufferBindCount()
    public VkBindSparseInfo bufferBindCount(int bufferBindCount) {
    	BUFFER_BIND_COUNT_HANDLE.set(segment, 0L, bufferBindCount);
    	return this;
    }
    
    public int bufferBindCount() {
    	return (int) BUFFER_BIND_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pBufferBinds()
    public VkBindSparseInfo pBufferBinds(NativeStructArray<VkSparseBufferMemoryBindInfo> pBufferBinds) {
    	P_BUFFER_BINDS_HANDLE.set(segment, 0L, pBufferBinds.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkSparseBufferMemoryBindInfo> pBufferBinds() {
    	MemorySegment segment = (MemorySegment) P_BUFFER_BINDS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkSparseBufferMemoryBindInfo.array(segment);
    }
    
    /// @see #imageOpaqueBindCount()
    public VkBindSparseInfo imageOpaqueBindCount(int imageOpaqueBindCount) {
    	IMAGE_OPAQUE_BIND_COUNT_HANDLE.set(segment, 0L, imageOpaqueBindCount);
    	return this;
    }
    
    public int imageOpaqueBindCount() {
    	return (int) IMAGE_OPAQUE_BIND_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pImageOpaqueBinds()
    public VkBindSparseInfo pImageOpaqueBinds(NativeStructArray<VkSparseImageOpaqueMemoryBindInfo> pImageOpaqueBinds) {
    	P_IMAGE_OPAQUE_BINDS_HANDLE.set(segment, 0L, pImageOpaqueBinds.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkSparseImageOpaqueMemoryBindInfo> pImageOpaqueBinds() {
    	MemorySegment segment = (MemorySegment) P_IMAGE_OPAQUE_BINDS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkSparseImageOpaqueMemoryBindInfo.array(segment);
    }
    
    /// @see #imageBindCount()
    public VkBindSparseInfo imageBindCount(int imageBindCount) {
    	IMAGE_BIND_COUNT_HANDLE.set(segment, 0L, imageBindCount);
    	return this;
    }
    
    public int imageBindCount() {
    	return (int) IMAGE_BIND_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pImageBinds()
    public VkBindSparseInfo pImageBinds(NativeStructArray<VkSparseImageMemoryBindInfo> pImageBinds) {
    	P_IMAGE_BINDS_HANDLE.set(segment, 0L, pImageBinds.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkSparseImageMemoryBindInfo> pImageBinds() {
    	MemorySegment segment = (MemorySegment) P_IMAGE_BINDS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkSparseImageMemoryBindInfo.array(segment);
    }
    
    /// @see #signalSemaphoreCount()
    public VkBindSparseInfo signalSemaphoreCount(int signalSemaphoreCount) {
    	SIGNAL_SEMAPHORE_COUNT_HANDLE.set(segment, 0L, signalSemaphoreCount);
    	return this;
    }
    
    public int signalSemaphoreCount() {
    	return (int) SIGNAL_SEMAPHORE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSignalSemaphores()
    public VkBindSparseInfo pSignalSemaphores(NativePointerArray pSignalSemaphores) {
    	P_SIGNAL_SEMAPHORES_HANDLE.set(segment, 0L, pSignalSemaphores.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pSignalSemaphores() {
    	MemorySegment segment = (MemorySegment) P_SIGNAL_SEMAPHORES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public VkBindSparseInfo set(VkBindSparseInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindSparseInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindSparseInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindSparseInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindSparseInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindSparseInfo> array(Arena arena, VkBindSparseInfo... structs) {
        NativeStructArray<VkBindSparseInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindSparseInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindSparseInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindSparseInfo(segment)
        );
    }

}