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

public final class VkDeviceFaultVendorBinaryHeaderVersionOneKHR
		implements Struct<VkDeviceFaultVendorBinaryHeaderVersionOneKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle HEADER_SIZE_HANDLE;
	public static final VarHandle HEADER_VERSION_HANDLE;
	public static final VarHandle VENDOR_ID_HANDLE;
	public static final VarHandle DEVICE_ID_HANDLE;
	public static final VarHandle DRIVER_VERSION_HANDLE;
	public static final VarHandle PIPELINE_CACHE_UUID_HANDLE;
	public static final VarHandle APPLICATION_NAME_OFFSET_HANDLE;
	public static final VarHandle APPLICATION_VERSION_HANDLE;
	public static final VarHandle ENGINE_NAME_OFFSET_HANDLE;
	public static final VarHandle ENGINE_VERSION_HANDLE;
	public static final VarHandle API_VERSION_HANDLE;

	public static final long HEADER_SIZE_BYTE_OFFSET;
	public static final long HEADER_VERSION_BYTE_OFFSET;
	public static final long VENDOR_ID_BYTE_OFFSET;
	public static final long DEVICE_ID_BYTE_OFFSET;
	public static final long DRIVER_VERSION_BYTE_OFFSET;
	public static final long PIPELINE_CACHE_UUID_BYTE_OFFSET;
	public static final long APPLICATION_NAME_OFFSET_BYTE_OFFSET;
	public static final long APPLICATION_VERSION_BYTE_OFFSET;
	public static final long ENGINE_NAME_OFFSET_BYTE_OFFSET;
	public static final long ENGINE_VERSION_BYTE_OFFSET;
	public static final long API_VERSION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("headerSize"),
		    JAVA_INT.withName("headerVersion"),
		    JAVA_INT.withName("vendorID"),
		    JAVA_INT.withName("deviceID"),
		    JAVA_INT.withName("driverVersion"),
		    MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("pipelineCacheUUID"),
		    JAVA_INT.withName("applicationNameOffset"),
		    JAVA_INT.withName("applicationVersion"),
		    JAVA_INT.withName("engineNameOffset"),
		    JAVA_INT.withName("engineVersion"),
		    JAVA_INT.withName("apiVersion")
		).withName("VkDeviceFaultVendorBinaryHeaderVersionOneKHR").withByteAlignment(4);
		
		HEADER_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("headerSize"));
		HEADER_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("headerVersion"));
		VENDOR_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vendorID"));
		DEVICE_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceID"));
		DRIVER_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("driverVersion"));
		PIPELINE_CACHE_UUID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineCacheUUID"), PathElement.sequenceElement());
		APPLICATION_NAME_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("applicationNameOffset"));
		APPLICATION_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("applicationVersion"));
		ENGINE_NAME_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("engineNameOffset"));
		ENGINE_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("engineVersion"));
		API_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("apiVersion"));
		
		HEADER_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("headerSize"));
		HEADER_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("headerVersion"));
		VENDOR_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vendorID"));
		DEVICE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceID"));
		DRIVER_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("driverVersion"));
		PIPELINE_CACHE_UUID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineCacheUUID"));
		APPLICATION_NAME_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("applicationNameOffset"));
		APPLICATION_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("applicationVersion"));
		ENGINE_NAME_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("engineNameOffset"));
		ENGINE_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("engineVersion"));
		API_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("apiVersion"));
		//@formatter:on
	}

	public VkDeviceFaultVendorBinaryHeaderVersionOneKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceFaultVendorBinaryHeaderVersionOneKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDeviceFaultVendorBinaryHeaderVersionOneKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #headerSize()
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR headerSize(int headerSize) {
    	HEADER_SIZE_HANDLE.set(segment, 0L, headerSize);
    	return this;
    }
    
    public int headerSize() {
    	return (int) HEADER_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #headerVersion()
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR headerVersion(int headerVersion) {
    	HEADER_VERSION_HANDLE.set(segment, 0L, headerVersion);
    	return this;
    }
    
    public int headerVersion() {
    	return (int) HEADER_VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #vendorID()
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR vendorID(int vendorID) {
    	VENDOR_ID_HANDLE.set(segment, 0L, vendorID);
    	return this;
    }
    
    public int vendorID() {
    	return (int) VENDOR_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceID()
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR deviceID(int deviceID) {
    	DEVICE_ID_HANDLE.set(segment, 0L, deviceID);
    	return this;
    }
    
    public int deviceID() {
    	return (int) DEVICE_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #driverVersion()
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR driverVersion(int driverVersion) {
    	DRIVER_VERSION_HANDLE.set(segment, 0L, driverVersion);
    	return this;
    }
    
    public int driverVersion() {
    	return (int) DRIVER_VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipelineCacheUUID(int)
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR pipelineCacheUUID(byte pipelineCacheUUID, int index0) {
    	PIPELINE_CACHE_UUID_HANDLE.set(segment, 0L, index0, pipelineCacheUUID);
    	return this;
    }
    
    public byte pipelineCacheUUID(int index0) {
    	return (byte) PIPELINE_CACHE_UUID_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #applicationNameOffset()
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR applicationNameOffset(int applicationNameOffset) {
    	APPLICATION_NAME_OFFSET_HANDLE.set(segment, 0L, applicationNameOffset);
    	return this;
    }
    
    public int applicationNameOffset() {
    	return (int) APPLICATION_NAME_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #applicationVersion()
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR applicationVersion(int applicationVersion) {
    	APPLICATION_VERSION_HANDLE.set(segment, 0L, applicationVersion);
    	return this;
    }
    
    public int applicationVersion() {
    	return (int) APPLICATION_VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #engineNameOffset()
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR engineNameOffset(int engineNameOffset) {
    	ENGINE_NAME_OFFSET_HANDLE.set(segment, 0L, engineNameOffset);
    	return this;
    }
    
    public int engineNameOffset() {
    	return (int) ENGINE_NAME_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #engineVersion()
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR engineVersion(int engineVersion) {
    	ENGINE_VERSION_HANDLE.set(segment, 0L, engineVersion);
    	return this;
    }
    
    public int engineVersion() {
    	return (int) ENGINE_VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #apiVersion()
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR apiVersion(int apiVersion) {
    	API_VERSION_HANDLE.set(segment, 0L, apiVersion);
    	return this;
    }
    
    public int apiVersion() {
    	return (int) API_VERSION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR set(VkDeviceFaultVendorBinaryHeaderVersionOneKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceFaultVendorBinaryHeaderVersionOneKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceFaultVendorBinaryHeaderVersionOneKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceFaultVendorBinaryHeaderVersionOneKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceFaultVendorBinaryHeaderVersionOneKHR> array(SegmentAllocator allocator, VkDeviceFaultVendorBinaryHeaderVersionOneKHR... structs) {
        NativeStructArray<VkDeviceFaultVendorBinaryHeaderVersionOneKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceFaultVendorBinaryHeaderVersionOneKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceFaultVendorBinaryHeaderVersionOneKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceFaultVendorBinaryHeaderVersionOneKHR(segment)
        );
    }

}