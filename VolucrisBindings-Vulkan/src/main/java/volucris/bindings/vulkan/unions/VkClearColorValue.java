/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.unions;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.structs.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkClearColorValue
		implements Struct<VkClearColorValue> {

	public static final UnionLayout LAYOUT;

	public static final VarHandle FLOAT32_HANDLE;
	public static final VarHandle INT32_HANDLE;
	public static final VarHandle UINT32_HANDLE;

	public static final long FLOAT32_BYTE_OFFSET;
	public static final long INT32_BYTE_OFFSET;
	public static final long UINT32_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.unionLayout(
		    MemoryLayout.sequenceLayout(4, JAVA_FLOAT).withName("float32"),
		    MemoryLayout.sequenceLayout(4, JAVA_INT).withName("int32"),
		    MemoryLayout.sequenceLayout(4, JAVA_INT).withName("uint32")
		).withName("VkClearColorValue").withByteAlignment(4);
		
		FLOAT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("float32"), PathElement.sequenceElement());
		INT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("int32"), PathElement.sequenceElement());
		UINT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uint32"), PathElement.sequenceElement());
		
		FLOAT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("float32"));
		INT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("int32"));
		UINT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uint32"));
		//@formatter:on
	}

	public VkClearColorValue() {
	    this(Arena.ofAuto());
	}
	
	public VkClearColorValue(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkClearColorValue(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #float32(int)
    public VkClearColorValue float32(float float32, int index0) {
    	FLOAT32_HANDLE.set(segment, 0L, index0, float32);
    	return this;
    }
    
    public float float32(int index0) {
    	return (float) FLOAT32_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #int32(int)
    public VkClearColorValue int32(int int32, int index0) {
    	INT32_HANDLE.set(segment, 0L, index0, int32);
    	return this;
    }
    
    public int int32(int index0) {
    	return (int) INT32_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #uint32(int)
    public VkClearColorValue uint32(int uint32, int index0) {
    	UINT32_HANDLE.set(segment, 0L, index0, uint32);
    	return this;
    }
    
    public int uint32(int index0) {
    	return (int) UINT32_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkClearColorValue set(VkClearColorValue other) {
        return set(other.segment);
    }
    
    @Override
    public VkClearColorValue set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkClearColorValue> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkClearColorValue> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkClearColorValue(segment),
            count
        );
    }
    
    public static NativeStructArray<VkClearColorValue> array(SegmentAllocator allocator, VkClearColorValue... structs) {
        NativeStructArray<VkClearColorValue> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkClearColorValue(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkClearColorValue> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkClearColorValue(segment)
        );
    }

}