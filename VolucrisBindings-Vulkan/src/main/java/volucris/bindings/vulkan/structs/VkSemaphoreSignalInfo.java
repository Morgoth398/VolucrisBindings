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

public final class VkSemaphoreSignalInfo
		implements Struct<VkSemaphoreSignalInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SEMAPHORE_HANDLE;
	public static final VarHandle VALUE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SEMAPHORE_BYTE_OFFSET;
	public static final long VALUE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("semaphore"),
		    JAVA_LONG.withName("value")
		).withName("VkSemaphoreSignalInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SEMAPHORE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("semaphore"));
		VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("value"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SEMAPHORE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("semaphore"));
		VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("value"));
		//@formatter:on
	}

	public VkSemaphoreSignalInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkSemaphoreSignalInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSemaphoreSignalInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSemaphoreSignalInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSemaphoreSignalInfo pNext(MemorySegment pNext) {
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
    public VkSemaphoreSignalInfo semaphore(VkSemaphore semaphore) {
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
    public VkSemaphoreSignalInfo value(long value) {
    	VALUE_HANDLE.set(segment, 0L, value);
    	return this;
    }
    
    public long value() {
    	return (long) VALUE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSemaphoreSignalInfo set(VkSemaphoreSignalInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkSemaphoreSignalInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSemaphoreSignalInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSemaphoreSignalInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSemaphoreSignalInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSemaphoreSignalInfo> array(SegmentAllocator allocator, VkSemaphoreSignalInfo... structs) {
        NativeStructArray<VkSemaphoreSignalInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSemaphoreSignalInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSemaphoreSignalInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSemaphoreSignalInfo(segment)
        );
    }

}