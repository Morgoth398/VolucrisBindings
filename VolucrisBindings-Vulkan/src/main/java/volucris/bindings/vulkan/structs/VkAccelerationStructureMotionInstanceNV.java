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
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkAccelerationStructureMotionInstanceNV
		implements Struct<VkAccelerationStructureMotionInstanceNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle TYPE_HANDLE;
	public static final VarHandle FLAGS_HANDLE;

	public static final long TYPE_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkAccelerationStructureMotionInstanceDataNV data;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("type"),
		    JAVA_INT.withName("flags"),
		    VkAccelerationStructureMotionInstanceDataNV.LAYOUT.withName("data")
		).withName("VkAccelerationStructureMotionInstanceNV").withByteAlignment(8);
		
		TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		
		TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
		//@formatter:on
	}

	public VkAccelerationStructureMotionInstanceNV() {
	    this(Arena.ofAuto());
	}
	
	public VkAccelerationStructureMotionInstanceNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkAccelerationStructureMotionInstanceNV(MemorySegment segment) {
	    this.segment = segment;
	
	    data = new VkAccelerationStructureMotionInstanceDataNV(segment.asSlice(DATA_BYTE_OFFSET, VkAccelerationStructureMotionInstanceDataNV.LAYOUT));
	}

    /// @see #type()
    public VkAccelerationStructureMotionInstanceNV type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkAccelerationStructureMotionInstanceNV flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #data()
    public VkAccelerationStructureMotionInstanceNV data(Consumer<VkAccelerationStructureMotionInstanceDataNV> consumer) {
    	consumer.accept(data);
    	return this;
    }
    
    /// @see #data()
    public VkAccelerationStructureMotionInstanceNV data(VkAccelerationStructureMotionInstanceDataNV other) {
    	data.set(other);
    	return this;
    }
    
    public VkAccelerationStructureMotionInstanceDataNV data() {
    	return data;
    }
    
    @Override
    public VkAccelerationStructureMotionInstanceNV set(VkAccelerationStructureMotionInstanceNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureMotionInstanceNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureMotionInstanceNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureMotionInstanceNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAccelerationStructureMotionInstanceNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureMotionInstanceNV> array(SegmentAllocator allocator, VkAccelerationStructureMotionInstanceNV... structs) {
        NativeStructArray<VkAccelerationStructureMotionInstanceNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAccelerationStructureMotionInstanceNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureMotionInstanceNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureMotionInstanceNV(segment)
        );
    }

}