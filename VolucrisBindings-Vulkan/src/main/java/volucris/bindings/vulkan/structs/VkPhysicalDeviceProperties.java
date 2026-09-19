/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkPhysicalDeviceProperties
		implements Struct<VkPhysicalDeviceProperties> {

    public static final StructLayout LAYOUT;

    public static final VarHandle API_VERSION_HANDLE;
    public static final VarHandle DRIVER_VERSION_HANDLE;
    public static final VarHandle VENDOR_ID_HANDLE;
    public static final VarHandle DEVICE_ID_HANDLE;
    public static final VarHandle DEVICE_TYPE_HANDLE;
    public static final VarHandle DEVICE_NAME_HANDLE;
    public static final VarHandle PIPELINE_CACHE_UUID_HANDLE;

    public static final long API_VERSION_BYTE_OFFSET;
    public static final long DRIVER_VERSION_BYTE_OFFSET;
    public static final long VENDOR_ID_BYTE_OFFSET;
    public static final long DEVICE_ID_BYTE_OFFSET;
    public static final long DEVICE_TYPE_BYTE_OFFSET;
    public static final long DEVICE_NAME_BYTE_OFFSET;
    public static final long PIPELINE_CACHE_UUID_BYTE_OFFSET;
    public static final long LIMITS_BYTE_OFFSET;
    public static final long SPARSE_PROPERTIES_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkPhysicalDeviceLimits limits;
    private final VkPhysicalDeviceSparseProperties sparseProperties;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("apiVersion"),
            JAVA_INT.withName("driverVersion"),
            JAVA_INT.withName("vendorID"),
            JAVA_INT.withName("deviceID"),
            JAVA_INT.withName("deviceType"),
            MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("deviceName"),
            MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("pipelineCacheUUID"),
            MemoryLayout.paddingLayout(4),
            VkPhysicalDeviceLimits.LAYOUT.withName("limits"),
            VkPhysicalDeviceSparseProperties.LAYOUT.withName("sparseProperties"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceProperties").withByteAlignment(8);
        
        API_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("apiVersion"));
        DRIVER_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("driverVersion"));
        VENDOR_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vendorID"));
        DEVICE_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceID"));
        DEVICE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceType"));
        DEVICE_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceName"), PathElement.sequenceElement());
        PIPELINE_CACHE_UUID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineCacheUUID"), PathElement.sequenceElement());
        
        API_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("apiVersion"));
        DRIVER_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("driverVersion"));
        VENDOR_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vendorID"));
        DEVICE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceID"));
        DEVICE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceType"));
        DEVICE_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceName"));
        PIPELINE_CACHE_UUID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineCacheUUID"));
        LIMITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limits"));
        SPARSE_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sparseProperties"));
        //@formatter:on
    }

    public VkPhysicalDeviceProperties() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceProperties(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceProperties(MemorySegment segment) {
        this.segment = segment;
    
        limits = new VkPhysicalDeviceLimits(segment.asSlice(LIMITS_BYTE_OFFSET, VkPhysicalDeviceLimits.LAYOUT));
        sparseProperties = new VkPhysicalDeviceSparseProperties(segment.asSlice(SPARSE_PROPERTIES_BYTE_OFFSET, VkPhysicalDeviceSparseProperties.LAYOUT));
    }

    /// @see #apiVersion()
    public VkPhysicalDeviceProperties apiVersion(int apiVersion) {
    	API_VERSION_HANDLE.set(segment, 0L, apiVersion);
    	return this;
    }
    
    public int apiVersion() {
    	return (int) API_VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #driverVersion()
    public VkPhysicalDeviceProperties driverVersion(int driverVersion) {
    	DRIVER_VERSION_HANDLE.set(segment, 0L, driverVersion);
    	return this;
    }
    
    public int driverVersion() {
    	return (int) DRIVER_VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #vendorID()
    public VkPhysicalDeviceProperties vendorID(int vendorID) {
    	VENDOR_ID_HANDLE.set(segment, 0L, vendorID);
    	return this;
    }
    
    public int vendorID() {
    	return (int) VENDOR_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceID()
    public VkPhysicalDeviceProperties deviceID(int deviceID) {
    	DEVICE_ID_HANDLE.set(segment, 0L, deviceID);
    	return this;
    }
    
    public int deviceID() {
    	return (int) DEVICE_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceType()
    public VkPhysicalDeviceProperties deviceType(int deviceType) {
    	DEVICE_TYPE_HANDLE.set(segment, 0L, deviceType);
    	return this;
    }
    
    public int deviceType() {
    	return (int) DEVICE_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceName(int)
    public VkPhysicalDeviceProperties deviceName(byte deviceName, int index0) {
    	DEVICE_NAME_HANDLE.set(segment, 0L, index0, deviceName);
    	return this;
    }
    
    public byte deviceName(int index0) {
    	return (byte) DEVICE_NAME_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #pipelineCacheUUID(int)
    public VkPhysicalDeviceProperties pipelineCacheUUID(byte pipelineCacheUUID, int index0) {
    	PIPELINE_CACHE_UUID_HANDLE.set(segment, 0L, index0, pipelineCacheUUID);
    	return this;
    }
    
    public byte pipelineCacheUUID(int index0) {
    	return (byte) PIPELINE_CACHE_UUID_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #limits()
    public VkPhysicalDeviceProperties limits(Consumer<VkPhysicalDeviceLimits> consumer) {
    	consumer.accept(limits);
    	return this;
    }
    
    /// @see #limits()
    public VkPhysicalDeviceProperties limits(VkPhysicalDeviceLimits other) {
    	limits.set(other);
    	return this;
    }
    
    public VkPhysicalDeviceLimits limits() {
    	return limits;
    }
    
    /// @see #sparseProperties()
    public VkPhysicalDeviceProperties sparseProperties(Consumer<VkPhysicalDeviceSparseProperties> consumer) {
    	consumer.accept(sparseProperties);
    	return this;
    }
    
    /// @see #sparseProperties()
    public VkPhysicalDeviceProperties sparseProperties(VkPhysicalDeviceSparseProperties other) {
    	sparseProperties.set(other);
    	return this;
    }
    
    public VkPhysicalDeviceSparseProperties sparseProperties() {
    	return sparseProperties;
    }
    
    public String deviceName() {
        return segment.getString(DEVICE_NAME_BYTE_OFFSET);
    }
    
    @Override
    public VkPhysicalDeviceProperties set(VkPhysicalDeviceProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceProperties> array(Arena arena, VkPhysicalDeviceProperties... structs) {
        NativeStructArray<VkPhysicalDeviceProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceProperties(segment)
        );
    }
    
}