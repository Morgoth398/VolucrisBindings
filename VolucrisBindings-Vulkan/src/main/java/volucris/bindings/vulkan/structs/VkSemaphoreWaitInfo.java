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
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkSemaphoreWaitInfo
		implements Struct<VkSemaphoreWaitInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle SEMAPHORE_COUNT_HANDLE;
	public static final VarHandle P_SEMAPHORES_HANDLE;
	public static final VarHandle P_VALUES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long SEMAPHORE_COUNT_BYTE_OFFSET;
	public static final long P_SEMAPHORES_BYTE_OFFSET;
	public static final long P_VALUES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("semaphoreCount"),
		    UNBOUNDED_ADDRESS.withName("pSemaphores"),
		    UNBOUNDED_ADDRESS.withName("pValues")
		).withName("VkSemaphoreWaitInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		SEMAPHORE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("semaphoreCount"));
		P_SEMAPHORES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSemaphores"));
		P_VALUES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pValues"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		SEMAPHORE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("semaphoreCount"));
		P_SEMAPHORES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSemaphores"));
		P_VALUES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pValues"));
		//@formatter:on
	}

	public VkSemaphoreWaitInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkSemaphoreWaitInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSemaphoreWaitInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSemaphoreWaitInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSemaphoreWaitInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkSemaphoreWaitInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #semaphoreCount()
    public VkSemaphoreWaitInfo semaphoreCount(int semaphoreCount) {
    	SEMAPHORE_COUNT_HANDLE.set(segment, 0L, semaphoreCount);
    	return this;
    }
    
    public int semaphoreCount() {
    	return (int) SEMAPHORE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSemaphores()
    public VkSemaphoreWaitInfo pSemaphores(NativePointerArray pSemaphores) {
    	P_SEMAPHORES_HANDLE.set(segment, 0L, pSemaphores.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pSemaphores() {
    	MemorySegment segment = (MemorySegment) P_SEMAPHORES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #pValues()
    public VkSemaphoreWaitInfo pValues(NativeLongArray pValues) {
    	P_VALUES_HANDLE.set(segment, 0L, pValues.memorySegment());
    	return this;
    }
    
    public @Nullable NativeLongArray pValues() {
    	MemorySegment segment = (MemorySegment) P_VALUES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeLongArray(segment);
    }
    
    @Override
    public VkSemaphoreWaitInfo set(VkSemaphoreWaitInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkSemaphoreWaitInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSemaphoreWaitInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSemaphoreWaitInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSemaphoreWaitInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSemaphoreWaitInfo> array(Arena arena, VkSemaphoreWaitInfo... structs) {
        NativeStructArray<VkSemaphoreWaitInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSemaphoreWaitInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSemaphoreWaitInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSemaphoreWaitInfo(segment)
        );
    }

}