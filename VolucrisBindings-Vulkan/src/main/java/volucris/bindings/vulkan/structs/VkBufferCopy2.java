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

public final class VkBufferCopy2
		implements Struct<VkBufferCopy2> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SRC_OFFSET_HANDLE;
	public static final VarHandle DST_OFFSET_HANDLE;
	public static final VarHandle SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SRC_OFFSET_BYTE_OFFSET;
	public static final long DST_OFFSET_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("srcOffset"),
		    JAVA_LONG.withName("dstOffset"),
		    JAVA_LONG.withName("size")
		).withName("VkBufferCopy2").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SRC_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcOffset"));
		DST_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstOffset"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SRC_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcOffset"));
		DST_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstOffset"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		//@formatter:on
	}

	public VkBufferCopy2() {
	    this(Arena.ofAuto());
	}
	
	public VkBufferCopy2(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkBufferCopy2(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkBufferCopy2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBufferCopy2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #srcOffset()
    public VkBufferCopy2 srcOffset(long srcOffset) {
    	SRC_OFFSET_HANDLE.set(segment, 0L, srcOffset);
    	return this;
    }
    
    public long srcOffset() {
    	return (long) SRC_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstOffset()
    public VkBufferCopy2 dstOffset(long dstOffset) {
    	DST_OFFSET_HANDLE.set(segment, 0L, dstOffset);
    	return this;
    }
    
    public long dstOffset() {
    	return (long) DST_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkBufferCopy2 size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkBufferCopy2 set(VkBufferCopy2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkBufferCopy2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBufferCopy2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBufferCopy2> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBufferCopy2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBufferCopy2> array(SegmentAllocator allocator, VkBufferCopy2... structs) {
        NativeStructArray<VkBufferCopy2> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBufferCopy2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBufferCopy2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBufferCopy2(segment)
        );
    }

}