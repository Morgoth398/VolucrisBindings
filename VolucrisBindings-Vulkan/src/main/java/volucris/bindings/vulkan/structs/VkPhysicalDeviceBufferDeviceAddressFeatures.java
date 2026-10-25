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

public final class VkPhysicalDeviceBufferDeviceAddressFeatures
		implements Struct<VkPhysicalDeviceBufferDeviceAddressFeatures> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle BUFFER_DEVICE_ADDRESS_HANDLE;
	public static final VarHandle BUFFER_DEVICE_ADDRESS_CAPTURE_REPLAY_HANDLE;
	public static final VarHandle BUFFER_DEVICE_ADDRESS_MULTI_DEVICE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long BUFFER_DEVICE_ADDRESS_BYTE_OFFSET;
	public static final long BUFFER_DEVICE_ADDRESS_CAPTURE_REPLAY_BYTE_OFFSET;
	public static final long BUFFER_DEVICE_ADDRESS_MULTI_DEVICE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("bufferDeviceAddress"),
		    JAVA_INT.withName("bufferDeviceAddressCaptureReplay"),
		    JAVA_INT.withName("bufferDeviceAddressMultiDevice"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceBufferDeviceAddressFeatures").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		BUFFER_DEVICE_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferDeviceAddress"));
		BUFFER_DEVICE_ADDRESS_CAPTURE_REPLAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
		BUFFER_DEVICE_ADDRESS_MULTI_DEVICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferDeviceAddressMultiDevice"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		BUFFER_DEVICE_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddress"));
		BUFFER_DEVICE_ADDRESS_CAPTURE_REPLAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
		BUFFER_DEVICE_ADDRESS_MULTI_DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddressMultiDevice"));
		//@formatter:on
	}

	public VkPhysicalDeviceBufferDeviceAddressFeatures() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceBufferDeviceAddressFeatures(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceBufferDeviceAddressFeatures(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceBufferDeviceAddressFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceBufferDeviceAddressFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #bufferDeviceAddress()
    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddress(int bufferDeviceAddress) {
    	BUFFER_DEVICE_ADDRESS_HANDLE.set(segment, 0L, bufferDeviceAddress);
    	return this;
    }
    
    public int bufferDeviceAddress() {
    	return (int) BUFFER_DEVICE_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferDeviceAddressCaptureReplay()
    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddressCaptureReplay(int bufferDeviceAddressCaptureReplay) {
    	BUFFER_DEVICE_ADDRESS_CAPTURE_REPLAY_HANDLE.set(segment, 0L, bufferDeviceAddressCaptureReplay);
    	return this;
    }
    
    public int bufferDeviceAddressCaptureReplay() {
    	return (int) BUFFER_DEVICE_ADDRESS_CAPTURE_REPLAY_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferDeviceAddressMultiDevice()
    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddressMultiDevice(int bufferDeviceAddressMultiDevice) {
    	BUFFER_DEVICE_ADDRESS_MULTI_DEVICE_HANDLE.set(segment, 0L, bufferDeviceAddressMultiDevice);
    	return this;
    }
    
    public int bufferDeviceAddressMultiDevice() {
    	return (int) BUFFER_DEVICE_ADDRESS_MULTI_DEVICE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceBufferDeviceAddressFeatures set(VkPhysicalDeviceBufferDeviceAddressFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceBufferDeviceAddressFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceBufferDeviceAddressFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceBufferDeviceAddressFeatures> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceBufferDeviceAddressFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceBufferDeviceAddressFeatures> array(SegmentAllocator allocator, VkPhysicalDeviceBufferDeviceAddressFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceBufferDeviceAddressFeatures> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceBufferDeviceAddressFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceBufferDeviceAddressFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceBufferDeviceAddressFeatures(segment)
        );
    }

}