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

public final class VkVertexInputAttributeDescription2EXT
		implements Struct<VkVertexInputAttributeDescription2EXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle LOCATION_HANDLE;
	public static final VarHandle BINDING_HANDLE;
	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle OFFSET_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long LOCATION_BYTE_OFFSET;
	public static final long BINDING_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;
	public static final long OFFSET_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("location"),
		    JAVA_INT.withName("binding"),
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("offset")
		).withName("VkVertexInputAttributeDescription2EXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		LOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("location"));
		BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("binding"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		LOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("location"));
		BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("binding"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		//@formatter:on
	}

	public VkVertexInputAttributeDescription2EXT() {
	    this(Arena.ofAuto());
	}
	
	public VkVertexInputAttributeDescription2EXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVertexInputAttributeDescription2EXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVertexInputAttributeDescription2EXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVertexInputAttributeDescription2EXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #location()
    public VkVertexInputAttributeDescription2EXT location(int location) {
    	LOCATION_HANDLE.set(segment, 0L, location);
    	return this;
    }
    
    public int location() {
    	return (int) LOCATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #binding()
    public VkVertexInputAttributeDescription2EXT binding(int binding) {
    	BINDING_HANDLE.set(segment, 0L, binding);
    	return this;
    }
    
    public int binding() {
    	return (int) BINDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #format()
    public VkVertexInputAttributeDescription2EXT format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #offset()
    public VkVertexInputAttributeDescription2EXT offset(int offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public int offset() {
    	return (int) OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVertexInputAttributeDescription2EXT set(VkVertexInputAttributeDescription2EXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkVertexInputAttributeDescription2EXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVertexInputAttributeDescription2EXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVertexInputAttributeDescription2EXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVertexInputAttributeDescription2EXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVertexInputAttributeDescription2EXT> array(SegmentAllocator allocator, VkVertexInputAttributeDescription2EXT... structs) {
        NativeStructArray<VkVertexInputAttributeDescription2EXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVertexInputAttributeDescription2EXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVertexInputAttributeDescription2EXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVertexInputAttributeDescription2EXT(segment)
        );
    }

}