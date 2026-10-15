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

public final class VkSemaphoreSubmitInfo
		implements Struct<VkSemaphoreSubmitInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SEMAPHORE_HANDLE;
	public static final VarHandle VALUE_HANDLE;
	public static final VarHandle STAGE_MASK_HANDLE;
	public static final VarHandle DEVICE_INDEX_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SEMAPHORE_BYTE_OFFSET;
	public static final long VALUE_BYTE_OFFSET;
	public static final long STAGE_MASK_BYTE_OFFSET;
	public static final long DEVICE_INDEX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("semaphore"),
		    JAVA_LONG.withName("value"),
		    JAVA_LONG.withName("stageMask"),
		    JAVA_INT.withName("deviceIndex"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkSemaphoreSubmitInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SEMAPHORE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("semaphore"));
		VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("value"));
		STAGE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stageMask"));
		DEVICE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceIndex"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SEMAPHORE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("semaphore"));
		VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("value"));
		STAGE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stageMask"));
		DEVICE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceIndex"));
		//@formatter:on
	}

	public VkSemaphoreSubmitInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkSemaphoreSubmitInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSemaphoreSubmitInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSemaphoreSubmitInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSemaphoreSubmitInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #semaphore()
    public VkSemaphoreSubmitInfo semaphore(VkSemaphore semaphore) {
    	SEMAPHORE_HANDLE.set(segment, 0L, semaphore.memorySegment());
    	return this;
    }
    
    public @Nullable VkSemaphore semaphore() {
    	MemorySegment segment = (MemorySegment) SEMAPHORE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkSemaphore(segment);
    }
    
    /// @see #value()
    public VkSemaphoreSubmitInfo value(long value) {
    	VALUE_HANDLE.set(segment, 0L, value);
    	return this;
    }
    
    public long value() {
    	return (long) VALUE_HANDLE.get(segment, 0L);
    }
    
    /// @see #stageMask()
    public VkSemaphoreSubmitInfo stageMask(long stageMask) {
    	STAGE_MASK_HANDLE.set(segment, 0L, stageMask);
    	return this;
    }
    
    public long stageMask() {
    	return (long) STAGE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceIndex()
    public VkSemaphoreSubmitInfo deviceIndex(int deviceIndex) {
    	DEVICE_INDEX_HANDLE.set(segment, 0L, deviceIndex);
    	return this;
    }
    
    public int deviceIndex() {
    	return (int) DEVICE_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSemaphoreSubmitInfo set(VkSemaphoreSubmitInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkSemaphoreSubmitInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSemaphoreSubmitInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSemaphoreSubmitInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSemaphoreSubmitInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSemaphoreSubmitInfo> array(Arena arena, VkSemaphoreSubmitInfo... structs) {
        NativeStructArray<VkSemaphoreSubmitInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSemaphoreSubmitInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSemaphoreSubmitInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSemaphoreSubmitInfo(segment)
        );
    }

}