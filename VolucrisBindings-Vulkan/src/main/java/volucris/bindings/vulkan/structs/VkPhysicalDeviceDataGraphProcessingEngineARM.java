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

public final class VkPhysicalDeviceDataGraphProcessingEngineARM
		implements Struct<VkPhysicalDeviceDataGraphProcessingEngineARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle TYPE_HANDLE;
	public static final VarHandle IS_FOREIGN_HANDLE;

	public static final long TYPE_BYTE_OFFSET;
	public static final long IS_FOREIGN_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("type"),
		    JAVA_INT.withName("isForeign")
		).withName("VkPhysicalDeviceDataGraphProcessingEngineARM").withByteAlignment(4);
		
		TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
		IS_FOREIGN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isForeign"));
		
		TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
		IS_FOREIGN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isForeign"));
		//@formatter:on
	}

	public VkPhysicalDeviceDataGraphProcessingEngineARM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDataGraphProcessingEngineARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDataGraphProcessingEngineARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #type()
    public VkPhysicalDeviceDataGraphProcessingEngineARM type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #isForeign()
    public VkPhysicalDeviceDataGraphProcessingEngineARM isForeign(int isForeign) {
    	IS_FOREIGN_HANDLE.set(segment, 0L, isForeign);
    	return this;
    }
    
    public int isForeign() {
    	return (int) IS_FOREIGN_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDataGraphProcessingEngineARM set(VkPhysicalDeviceDataGraphProcessingEngineARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDataGraphProcessingEngineARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDataGraphProcessingEngineARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDataGraphProcessingEngineARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceDataGraphProcessingEngineARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDataGraphProcessingEngineARM> array(SegmentAllocator allocator, VkPhysicalDeviceDataGraphProcessingEngineARM... structs) {
        NativeStructArray<VkPhysicalDeviceDataGraphProcessingEngineARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceDataGraphProcessingEngineARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDataGraphProcessingEngineARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDataGraphProcessingEngineARM(segment)
        );
    }

}