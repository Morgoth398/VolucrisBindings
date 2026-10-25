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

public final class VkLatencySleepInfoNV
		implements Struct<VkLatencySleepInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SIGNAL_SEMAPHORE_HANDLE;
	public static final VarHandle VALUE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SIGNAL_SEMAPHORE_BYTE_OFFSET;
	public static final long VALUE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("signalSemaphore"),
		    JAVA_LONG.withName("value")
		).withName("VkLatencySleepInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SIGNAL_SEMAPHORE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("signalSemaphore"));
		VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("value"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SIGNAL_SEMAPHORE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphore"));
		VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("value"));
		//@formatter:on
	}

	public VkLatencySleepInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkLatencySleepInfoNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkLatencySleepInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkLatencySleepInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkLatencySleepInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #signalSemaphore()
    public VkLatencySleepInfoNV signalSemaphore(VkSemaphore signalSemaphore) {
    	SIGNAL_SEMAPHORE_HANDLE.set(segment, 0L, signalSemaphore.memorySegment());
    	return this;
    }
    
    public @Nullable VkSemaphore signalSemaphore() {
    	MemorySegment segment = (MemorySegment) SIGNAL_SEMAPHORE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkSemaphore(segment);
    }
    
    /// @see #value()
    public VkLatencySleepInfoNV value(long value) {
    	VALUE_HANDLE.set(segment, 0L, value);
    	return this;
    }
    
    public long value() {
    	return (long) VALUE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkLatencySleepInfoNV set(VkLatencySleepInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkLatencySleepInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkLatencySleepInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkLatencySleepInfoNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkLatencySleepInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkLatencySleepInfoNV> array(SegmentAllocator allocator, VkLatencySleepInfoNV... structs) {
        NativeStructArray<VkLatencySleepInfoNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkLatencySleepInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkLatencySleepInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkLatencySleepInfoNV(segment)
        );
    }

}