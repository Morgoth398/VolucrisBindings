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

public final class VkMemoryGetRemoteAddressInfoNV
		implements Struct<VkMemoryGetRemoteAddressInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MEMORY_HANDLE;
	public static final VarHandle HANDLE_TYPE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MEMORY_BYTE_OFFSET;
	public static final long HANDLE_TYPE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("memory"),
		    JAVA_INT.withName("handleType"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkMemoryGetRemoteAddressInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memory"));
		HANDLE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("handleType"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memory"));
		HANDLE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
		//@formatter:on
	}

	public VkMemoryGetRemoteAddressInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkMemoryGetRemoteAddressInfoNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkMemoryGetRemoteAddressInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkMemoryGetRemoteAddressInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMemoryGetRemoteAddressInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #memory()
    public VkMemoryGetRemoteAddressInfoNV memory(VkDeviceMemory memory) {
    	MEMORY_HANDLE.set(segment, 0L, memory.memorySegment());
    	return this;
    }
    
    public @Nullable VkDeviceMemory memory() {
    	MemorySegment segment = (MemorySegment) MEMORY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDeviceMemory(segment);
    }
    
    /// @see #handleType()
    public VkMemoryGetRemoteAddressInfoNV handleType(int handleType) {
    	HANDLE_TYPE_HANDLE.set(segment, 0L, handleType);
    	return this;
    }
    
    public int handleType() {
    	return (int) HANDLE_TYPE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMemoryGetRemoteAddressInfoNV set(VkMemoryGetRemoteAddressInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkMemoryGetRemoteAddressInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMemoryGetRemoteAddressInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMemoryGetRemoteAddressInfoNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkMemoryGetRemoteAddressInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMemoryGetRemoteAddressInfoNV> array(SegmentAllocator allocator, VkMemoryGetRemoteAddressInfoNV... structs) {
        NativeStructArray<VkMemoryGetRemoteAddressInfoNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkMemoryGetRemoteAddressInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMemoryGetRemoteAddressInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMemoryGetRemoteAddressInfoNV(segment)
        );
    }

}