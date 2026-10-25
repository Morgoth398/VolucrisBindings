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

public final class VkGpaPerfCounterAMD
		implements Struct<VkGpaPerfCounterAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BLOCK_TYPE_HANDLE;
	public static final VarHandle BLOCK_INSTANCE_HANDLE;
	public static final VarHandle EVENT_ID_HANDLE;

	public static final long BLOCK_TYPE_BYTE_OFFSET;
	public static final long BLOCK_INSTANCE_BYTE_OFFSET;
	public static final long EVENT_ID_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("blockType"),
		    JAVA_INT.withName("blockInstance"),
		    JAVA_INT.withName("eventID")
		).withName("VkGpaPerfCounterAMD").withByteAlignment(4);
		
		BLOCK_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blockType"));
		BLOCK_INSTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blockInstance"));
		EVENT_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("eventID"));
		
		BLOCK_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blockType"));
		BLOCK_INSTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blockInstance"));
		EVENT_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("eventID"));
		//@formatter:on
	}

	public VkGpaPerfCounterAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkGpaPerfCounterAMD(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkGpaPerfCounterAMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #blockType()
    public VkGpaPerfCounterAMD blockType(int blockType) {
    	BLOCK_TYPE_HANDLE.set(segment, 0L, blockType);
    	return this;
    }
    
    public int blockType() {
    	return (int) BLOCK_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #blockInstance()
    public VkGpaPerfCounterAMD blockInstance(int blockInstance) {
    	BLOCK_INSTANCE_HANDLE.set(segment, 0L, blockInstance);
    	return this;
    }
    
    public int blockInstance() {
    	return (int) BLOCK_INSTANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #eventID()
    public VkGpaPerfCounterAMD eventID(int eventID) {
    	EVENT_ID_HANDLE.set(segment, 0L, eventID);
    	return this;
    }
    
    public int eventID() {
    	return (int) EVENT_ID_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkGpaPerfCounterAMD set(VkGpaPerfCounterAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkGpaPerfCounterAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGpaPerfCounterAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGpaPerfCounterAMD> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkGpaPerfCounterAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGpaPerfCounterAMD> array(SegmentAllocator allocator, VkGpaPerfCounterAMD... structs) {
        NativeStructArray<VkGpaPerfCounterAMD> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkGpaPerfCounterAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGpaPerfCounterAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGpaPerfCounterAMD(segment)
        );
    }

}