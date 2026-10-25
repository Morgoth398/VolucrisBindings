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

public final class VkPhysicalDeviceInfoPropertiesINTEL
		implements Struct<VkPhysicalDeviceInfoPropertiesINTEL> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DEVICE_IP_VERSION_ARCH_HANDLE;
	public static final VarHandle DEVICE_IP_VERSION_RELEASE_HANDLE;
	public static final VarHandle DEVICE_IP_VERSION_REVISION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DEVICE_IP_VERSION_ARCH_BYTE_OFFSET;
	public static final long DEVICE_IP_VERSION_RELEASE_BYTE_OFFSET;
	public static final long DEVICE_IP_VERSION_REVISION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("deviceIpVersionArch"),
		    JAVA_INT.withName("deviceIpVersionRelease"),
		    JAVA_INT.withName("deviceIpVersionRevision"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceInfoPropertiesINTEL").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DEVICE_IP_VERSION_ARCH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceIpVersionArch"));
		DEVICE_IP_VERSION_RELEASE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceIpVersionRelease"));
		DEVICE_IP_VERSION_REVISION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceIpVersionRevision"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DEVICE_IP_VERSION_ARCH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceIpVersionArch"));
		DEVICE_IP_VERSION_RELEASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceIpVersionRelease"));
		DEVICE_IP_VERSION_REVISION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceIpVersionRevision"));
		//@formatter:on
	}

	public VkPhysicalDeviceInfoPropertiesINTEL() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceInfoPropertiesINTEL(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceInfoPropertiesINTEL(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceInfoPropertiesINTEL sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceInfoPropertiesINTEL pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #deviceIpVersionArch()
    public VkPhysicalDeviceInfoPropertiesINTEL deviceIpVersionArch(int deviceIpVersionArch) {
    	DEVICE_IP_VERSION_ARCH_HANDLE.set(segment, 0L, deviceIpVersionArch);
    	return this;
    }
    
    public int deviceIpVersionArch() {
    	return (int) DEVICE_IP_VERSION_ARCH_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceIpVersionRelease()
    public VkPhysicalDeviceInfoPropertiesINTEL deviceIpVersionRelease(int deviceIpVersionRelease) {
    	DEVICE_IP_VERSION_RELEASE_HANDLE.set(segment, 0L, deviceIpVersionRelease);
    	return this;
    }
    
    public int deviceIpVersionRelease() {
    	return (int) DEVICE_IP_VERSION_RELEASE_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceIpVersionRevision()
    public VkPhysicalDeviceInfoPropertiesINTEL deviceIpVersionRevision(int deviceIpVersionRevision) {
    	DEVICE_IP_VERSION_REVISION_HANDLE.set(segment, 0L, deviceIpVersionRevision);
    	return this;
    }
    
    public int deviceIpVersionRevision() {
    	return (int) DEVICE_IP_VERSION_REVISION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceInfoPropertiesINTEL set(VkPhysicalDeviceInfoPropertiesINTEL other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceInfoPropertiesINTEL set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceInfoPropertiesINTEL> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceInfoPropertiesINTEL> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceInfoPropertiesINTEL(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceInfoPropertiesINTEL> array(SegmentAllocator allocator, VkPhysicalDeviceInfoPropertiesINTEL... structs) {
        NativeStructArray<VkPhysicalDeviceInfoPropertiesINTEL> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceInfoPropertiesINTEL(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceInfoPropertiesINTEL> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceInfoPropertiesINTEL(segment)
        );
    }

}