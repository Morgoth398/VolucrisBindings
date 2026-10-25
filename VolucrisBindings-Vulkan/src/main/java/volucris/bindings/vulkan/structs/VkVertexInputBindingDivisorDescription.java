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

public final class VkVertexInputBindingDivisorDescription
		implements Struct<VkVertexInputBindingDivisorDescription> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BINDING_HANDLE;
	public static final VarHandle DIVISOR_HANDLE;

	public static final long BINDING_BYTE_OFFSET;
	public static final long DIVISOR_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("binding"),
		    JAVA_INT.withName("divisor")
		).withName("VkVertexInputBindingDivisorDescription").withByteAlignment(4);
		
		BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("binding"));
		DIVISOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("divisor"));
		
		BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("binding"));
		DIVISOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("divisor"));
		//@formatter:on
	}

	public VkVertexInputBindingDivisorDescription() {
	    this(Arena.ofAuto());
	}
	
	public VkVertexInputBindingDivisorDescription(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVertexInputBindingDivisorDescription(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #binding()
    public VkVertexInputBindingDivisorDescription binding(int binding) {
    	BINDING_HANDLE.set(segment, 0L, binding);
    	return this;
    }
    
    public int binding() {
    	return (int) BINDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #divisor()
    public VkVertexInputBindingDivisorDescription divisor(int divisor) {
    	DIVISOR_HANDLE.set(segment, 0L, divisor);
    	return this;
    }
    
    public int divisor() {
    	return (int) DIVISOR_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVertexInputBindingDivisorDescription set(VkVertexInputBindingDivisorDescription other) {
        return set(other.segment);
    }
    
    @Override
    public VkVertexInputBindingDivisorDescription set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVertexInputBindingDivisorDescription> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVertexInputBindingDivisorDescription> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVertexInputBindingDivisorDescription(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVertexInputBindingDivisorDescription> array(SegmentAllocator allocator, VkVertexInputBindingDivisorDescription... structs) {
        NativeStructArray<VkVertexInputBindingDivisorDescription> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVertexInputBindingDivisorDescription(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVertexInputBindingDivisorDescription> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVertexInputBindingDivisorDescription(segment)
        );
    }

}