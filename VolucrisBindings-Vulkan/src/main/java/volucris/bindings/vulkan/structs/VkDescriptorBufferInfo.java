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

public final class VkDescriptorBufferInfo
		implements Struct<VkDescriptorBufferInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BUFFER_HANDLE;
	public static final VarHandle OFFSET_HANDLE;
	public static final VarHandle RANGE_HANDLE;

	public static final long BUFFER_BYTE_OFFSET;
	public static final long OFFSET_BYTE_OFFSET;
	public static final long RANGE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("buffer"),
		    JAVA_LONG.withName("offset"),
		    JAVA_LONG.withName("range")
		).withName("VkDescriptorBufferInfo").withByteAlignment(8);
		
		BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("buffer"));
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("range"));
		
		BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("range"));
		//@formatter:on
	}

	public VkDescriptorBufferInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkDescriptorBufferInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDescriptorBufferInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #buffer()
    public VkDescriptorBufferInfo buffer(VkBuffer buffer) {
    	BUFFER_HANDLE.set(segment, 0L, buffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer buffer() {
    	MemorySegment segment = (MemorySegment) BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    /// @see #offset()
    public VkDescriptorBufferInfo offset(long offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public long offset() {
    	return (long) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #range()
    public VkDescriptorBufferInfo range(long range) {
    	RANGE_HANDLE.set(segment, 0L, range);
    	return this;
    }
    
    public long range() {
    	return (long) RANGE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorBufferInfo set(VkDescriptorBufferInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorBufferInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorBufferInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorBufferInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDescriptorBufferInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorBufferInfo> array(SegmentAllocator allocator, VkDescriptorBufferInfo... structs) {
        NativeStructArray<VkDescriptorBufferInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDescriptorBufferInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorBufferInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorBufferInfo(segment)
        );
    }

}