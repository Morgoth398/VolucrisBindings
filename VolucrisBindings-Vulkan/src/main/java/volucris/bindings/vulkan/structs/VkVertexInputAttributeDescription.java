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

public final class VkVertexInputAttributeDescription
		implements Struct<VkVertexInputAttributeDescription> {

	public static final StructLayout LAYOUT;

	public static final VarHandle LOCATION_HANDLE;
	public static final VarHandle BINDING_HANDLE;
	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle OFFSET_HANDLE;

	public static final long LOCATION_BYTE_OFFSET;
	public static final long BINDING_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;
	public static final long OFFSET_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("location"),
		    JAVA_INT.withName("binding"),
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("offset")
		).withName("VkVertexInputAttributeDescription").withByteAlignment(4);
		
		LOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("location"));
		BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("binding"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		
		LOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("location"));
		BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("binding"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		//@formatter:on
	}

	public VkVertexInputAttributeDescription() {
	    this(Arena.ofAuto());
	}
	
	public VkVertexInputAttributeDescription(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVertexInputAttributeDescription(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #location()
    public VkVertexInputAttributeDescription location(int location) {
    	LOCATION_HANDLE.set(segment, 0L, location);
    	return this;
    }
    
    public int location() {
    	return (int) LOCATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #binding()
    public VkVertexInputAttributeDescription binding(int binding) {
    	BINDING_HANDLE.set(segment, 0L, binding);
    	return this;
    }
    
    public int binding() {
    	return (int) BINDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #format()
    public VkVertexInputAttributeDescription format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #offset()
    public VkVertexInputAttributeDescription offset(int offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public int offset() {
    	return (int) OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVertexInputAttributeDescription set(VkVertexInputAttributeDescription other) {
        return set(other.segment);
    }
    
    @Override
    public VkVertexInputAttributeDescription set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVertexInputAttributeDescription> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVertexInputAttributeDescription> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVertexInputAttributeDescription(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVertexInputAttributeDescription> array(SegmentAllocator allocator, VkVertexInputAttributeDescription... structs) {
        NativeStructArray<VkVertexInputAttributeDescription> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVertexInputAttributeDescription(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVertexInputAttributeDescription> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVertexInputAttributeDescription(segment)
        );
    }

}