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

public final class VkPhysicalDevicePrivateDataBaseHandleFeaturesNV
		implements Struct<VkPhysicalDevicePrivateDataBaseHandleFeaturesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PRIVATE_DATA_BASE_HANDLE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PRIVATE_DATA_BASE_HANDLE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("privateDataBaseHandle"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDevicePrivateDataBaseHandleFeaturesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PRIVATE_DATA_BASE_HANDLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("privateDataBaseHandle"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PRIVATE_DATA_BASE_HANDLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("privateDataBaseHandle"));
		//@formatter:on
	}

	public VkPhysicalDevicePrivateDataBaseHandleFeaturesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDevicePrivateDataBaseHandleFeaturesNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDevicePrivateDataBaseHandleFeaturesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDevicePrivateDataBaseHandleFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevicePrivateDataBaseHandleFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #privateDataBaseHandle()
    public VkPhysicalDevicePrivateDataBaseHandleFeaturesNV privateDataBaseHandle(int privateDataBaseHandle) {
    	PRIVATE_DATA_BASE_HANDLE_HANDLE.set(segment, 0L, privateDataBaseHandle);
    	return this;
    }
    
    public int privateDataBaseHandle() {
    	return (int) PRIVATE_DATA_BASE_HANDLE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevicePrivateDataBaseHandleFeaturesNV set(VkPhysicalDevicePrivateDataBaseHandleFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevicePrivateDataBaseHandleFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevicePrivateDataBaseHandleFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevicePrivateDataBaseHandleFeaturesNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDevicePrivateDataBaseHandleFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevicePrivateDataBaseHandleFeaturesNV> array(SegmentAllocator allocator, VkPhysicalDevicePrivateDataBaseHandleFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDevicePrivateDataBaseHandleFeaturesNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDevicePrivateDataBaseHandleFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevicePrivateDataBaseHandleFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevicePrivateDataBaseHandleFeaturesNV(segment)
        );
    }

}