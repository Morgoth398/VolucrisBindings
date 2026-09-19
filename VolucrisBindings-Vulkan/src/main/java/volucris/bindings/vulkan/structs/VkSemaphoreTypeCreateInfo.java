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

public final class VkSemaphoreTypeCreateInfo
		implements Struct<VkSemaphoreTypeCreateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SEMAPHORE_TYPE_HANDLE;
    public static final VarHandle INITIAL_VALUE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SEMAPHORE_TYPE_BYTE_OFFSET;
    public static final long INITIAL_VALUE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("semaphoreType"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("initialValue")
        ).withName("VkSemaphoreTypeCreateInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SEMAPHORE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("semaphoreType"));
        INITIAL_VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("initialValue"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SEMAPHORE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("semaphoreType"));
        INITIAL_VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("initialValue"));
        //@formatter:on
    }

    public VkSemaphoreTypeCreateInfo() {
        this(Arena.ofAuto());
    }
    
    public VkSemaphoreTypeCreateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSemaphoreTypeCreateInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkSemaphoreTypeCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSemaphoreTypeCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #semaphoreType()
    public VkSemaphoreTypeCreateInfo semaphoreType(int semaphoreType) {
    	SEMAPHORE_TYPE_HANDLE.set(segment, 0L, semaphoreType);
    	return this;
    }
    
    public int semaphoreType() {
    	return (int) SEMAPHORE_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #initialValue()
    public VkSemaphoreTypeCreateInfo initialValue(long initialValue) {
    	INITIAL_VALUE_HANDLE.set(segment, 0L, initialValue);
    	return this;
    }
    
    public long initialValue() {
    	return (long) INITIAL_VALUE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSemaphoreTypeCreateInfo set(VkSemaphoreTypeCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkSemaphoreTypeCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSemaphoreTypeCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSemaphoreTypeCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSemaphoreTypeCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSemaphoreTypeCreateInfo> array(Arena arena, VkSemaphoreTypeCreateInfo... structs) {
        NativeStructArray<VkSemaphoreTypeCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSemaphoreTypeCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSemaphoreTypeCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSemaphoreTypeCreateInfo(segment)
        );
    }
    
}