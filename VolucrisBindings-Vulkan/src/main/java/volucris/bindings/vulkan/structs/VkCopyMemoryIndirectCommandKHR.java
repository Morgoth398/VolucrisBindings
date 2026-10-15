/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkCopyMemoryIndirectCommandKHR
		implements Struct<VkCopyMemoryIndirectCommandKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SRC_ADDRESS_HANDLE;
	public static final VarHandle DST_ADDRESS_HANDLE;
	public static final VarHandle SIZE_HANDLE;

	public static final long SRC_ADDRESS_BYTE_OFFSET;
	public static final long DST_ADDRESS_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("srcAddress"),
		    JAVA_LONG.withName("dstAddress"),
		    JAVA_LONG.withName("size")
		).withName("VkCopyMemoryIndirectCommandKHR").withByteAlignment(8);
		
		SRC_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcAddress"));
		DST_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstAddress"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		
		SRC_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcAddress"));
		DST_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstAddress"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		//@formatter:on
	}

	public VkCopyMemoryIndirectCommandKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkCopyMemoryIndirectCommandKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkCopyMemoryIndirectCommandKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #srcAddress()
    public VkCopyMemoryIndirectCommandKHR srcAddress(long srcAddress) {
    	SRC_ADDRESS_HANDLE.set(segment, 0L, srcAddress);
    	return this;
    }
    
    public long srcAddress() {
    	return (long) SRC_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstAddress()
    public VkCopyMemoryIndirectCommandKHR dstAddress(long dstAddress) {
    	DST_ADDRESS_HANDLE.set(segment, 0L, dstAddress);
    	return this;
    }
    
    public long dstAddress() {
    	return (long) DST_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkCopyMemoryIndirectCommandKHR size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkCopyMemoryIndirectCommandKHR set(VkCopyMemoryIndirectCommandKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkCopyMemoryIndirectCommandKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCopyMemoryIndirectCommandKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCopyMemoryIndirectCommandKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCopyMemoryIndirectCommandKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCopyMemoryIndirectCommandKHR> array(Arena arena, VkCopyMemoryIndirectCommandKHR... structs) {
        NativeStructArray<VkCopyMemoryIndirectCommandKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCopyMemoryIndirectCommandKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCopyMemoryIndirectCommandKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCopyMemoryIndirectCommandKHR(segment)
        );
    }

}