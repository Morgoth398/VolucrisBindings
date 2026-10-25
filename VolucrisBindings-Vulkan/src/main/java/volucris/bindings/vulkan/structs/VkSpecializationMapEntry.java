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

public final class VkSpecializationMapEntry
		implements Struct<VkSpecializationMapEntry> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CONSTANT_ID_HANDLE;
	public static final VarHandle OFFSET_HANDLE;
	public static final VarHandle SIZE_HANDLE;

	public static final long CONSTANT_ID_BYTE_OFFSET;
	public static final long OFFSET_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("constantID"),
		    JAVA_INT.withName("offset"),
		    JAVA_LONG.withName("size")
		).withName("VkSpecializationMapEntry").withByteAlignment(8);
		
		CONSTANT_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("constantID"));
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		
		CONSTANT_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("constantID"));
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		//@formatter:on
	}

	public VkSpecializationMapEntry() {
	    this(Arena.ofAuto());
	}
	
	public VkSpecializationMapEntry(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSpecializationMapEntry(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #constantID()
    public VkSpecializationMapEntry constantID(int constantID) {
    	CONSTANT_ID_HANDLE.set(segment, 0L, constantID);
    	return this;
    }
    
    public int constantID() {
    	return (int) CONSTANT_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #offset()
    public VkSpecializationMapEntry offset(int offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public int offset() {
    	return (int) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkSpecializationMapEntry size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSpecializationMapEntry set(VkSpecializationMapEntry other) {
        return set(other.segment);
    }
    
    @Override
    public VkSpecializationMapEntry set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSpecializationMapEntry> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSpecializationMapEntry> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSpecializationMapEntry(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSpecializationMapEntry> array(SegmentAllocator allocator, VkSpecializationMapEntry... structs) {
        NativeStructArray<VkSpecializationMapEntry> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSpecializationMapEntry(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSpecializationMapEntry> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSpecializationMapEntry(segment)
        );
    }

}