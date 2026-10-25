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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkSubresourceLayout
		implements Struct<VkSubresourceLayout> {

	public static final StructLayout LAYOUT;

	public static final VarHandle OFFSET_HANDLE;
	public static final VarHandle SIZE_HANDLE;
	public static final VarHandle ROW_PITCH_HANDLE;
	public static final VarHandle ARRAY_PITCH_HANDLE;
	public static final VarHandle DEPTH_PITCH_HANDLE;

	public static final long OFFSET_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;
	public static final long ROW_PITCH_BYTE_OFFSET;
	public static final long ARRAY_PITCH_BYTE_OFFSET;
	public static final long DEPTH_PITCH_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("offset"),
		    JAVA_LONG.withName("size"),
		    JAVA_LONG.withName("rowPitch"),
		    JAVA_LONG.withName("arrayPitch"),
		    JAVA_LONG.withName("depthPitch")
		).withName("VkSubresourceLayout").withByteAlignment(8);
		
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		ROW_PITCH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rowPitch"));
		ARRAY_PITCH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("arrayPitch"));
		DEPTH_PITCH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthPitch"));
		
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		ROW_PITCH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rowPitch"));
		ARRAY_PITCH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("arrayPitch"));
		DEPTH_PITCH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthPitch"));
		//@formatter:on
	}

	public VkSubresourceLayout() {
	    this(Arena.ofAuto());
	}
	
	public VkSubresourceLayout(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSubresourceLayout(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #offset()
    public VkSubresourceLayout offset(long offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public long offset() {
    	return (long) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkSubresourceLayout size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #rowPitch()
    public VkSubresourceLayout rowPitch(long rowPitch) {
    	ROW_PITCH_HANDLE.set(segment, 0L, rowPitch);
    	return this;
    }
    
    public long rowPitch() {
    	return (long) ROW_PITCH_HANDLE.get(segment, 0L);
    }
    
    /// @see #arrayPitch()
    public VkSubresourceLayout arrayPitch(long arrayPitch) {
    	ARRAY_PITCH_HANDLE.set(segment, 0L, arrayPitch);
    	return this;
    }
    
    public long arrayPitch() {
    	return (long) ARRAY_PITCH_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthPitch()
    public VkSubresourceLayout depthPitch(long depthPitch) {
    	DEPTH_PITCH_HANDLE.set(segment, 0L, depthPitch);
    	return this;
    }
    
    public long depthPitch() {
    	return (long) DEPTH_PITCH_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSubresourceLayout set(VkSubresourceLayout other) {
        return set(other.segment);
    }
    
    @Override
    public VkSubresourceLayout set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSubresourceLayout> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSubresourceLayout> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSubresourceLayout(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSubresourceLayout> array(SegmentAllocator allocator, VkSubresourceLayout... structs) {
        NativeStructArray<VkSubresourceLayout> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSubresourceLayout(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSubresourceLayout> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSubresourceLayout(segment)
        );
    }

}