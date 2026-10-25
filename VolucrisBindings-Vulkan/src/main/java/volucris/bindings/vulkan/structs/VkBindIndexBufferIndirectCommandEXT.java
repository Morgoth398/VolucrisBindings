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

public final class VkBindIndexBufferIndirectCommandEXT
		implements Struct<VkBindIndexBufferIndirectCommandEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BUFFER_ADDRESS_HANDLE;
	public static final VarHandle SIZE_HANDLE;
	public static final VarHandle INDEX_TYPE_HANDLE;

	public static final long BUFFER_ADDRESS_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;
	public static final long INDEX_TYPE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("bufferAddress"),
		    JAVA_INT.withName("size"),
		    JAVA_INT.withName("indexType")
		).withName("VkBindIndexBufferIndirectCommandEXT").withByteAlignment(8);
		
		BUFFER_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferAddress"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		INDEX_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexType"));
		
		BUFFER_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferAddress"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		INDEX_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
		//@formatter:on
	}

	public VkBindIndexBufferIndirectCommandEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkBindIndexBufferIndirectCommandEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkBindIndexBufferIndirectCommandEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #bufferAddress()
    public VkBindIndexBufferIndirectCommandEXT bufferAddress(long bufferAddress) {
    	BUFFER_ADDRESS_HANDLE.set(segment, 0L, bufferAddress);
    	return this;
    }
    
    public long bufferAddress() {
    	return (long) BUFFER_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkBindIndexBufferIndirectCommandEXT size(int size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public int size() {
    	return (int) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexType()
    public VkBindIndexBufferIndirectCommandEXT indexType(int indexType) {
    	INDEX_TYPE_HANDLE.set(segment, 0L, indexType);
    	return this;
    }
    
    public int indexType() {
    	return (int) INDEX_TYPE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkBindIndexBufferIndirectCommandEXT set(VkBindIndexBufferIndirectCommandEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindIndexBufferIndirectCommandEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindIndexBufferIndirectCommandEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindIndexBufferIndirectCommandEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBindIndexBufferIndirectCommandEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindIndexBufferIndirectCommandEXT> array(SegmentAllocator allocator, VkBindIndexBufferIndirectCommandEXT... structs) {
        NativeStructArray<VkBindIndexBufferIndirectCommandEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBindIndexBufferIndirectCommandEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindIndexBufferIndirectCommandEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindIndexBufferIndirectCommandEXT(segment)
        );
    }

}