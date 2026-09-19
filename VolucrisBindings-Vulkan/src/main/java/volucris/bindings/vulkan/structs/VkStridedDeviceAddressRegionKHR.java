/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkStridedDeviceAddressRegionKHR
		implements Struct<VkStridedDeviceAddressRegionKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle DEVICE_ADDRESS_HANDLE;
    public static final VarHandle STRIDE_HANDLE;
    public static final VarHandle SIZE_HANDLE;

    public static final long DEVICE_ADDRESS_BYTE_OFFSET;
    public static final long STRIDE_BYTE_OFFSET;
    public static final long SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("deviceAddress"),
            JAVA_LONG.withName("stride"),
            JAVA_LONG.withName("size")
        ).withName("VkStridedDeviceAddressRegionKHR").withByteAlignment(8);
        
        DEVICE_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceAddress"));
        STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stride"));
        SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
        
        DEVICE_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceAddress"));
        STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stride"));
        SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
        //@formatter:on
    }

    public VkStridedDeviceAddressRegionKHR() {
        this(Arena.ofAuto());
    }
    
    public VkStridedDeviceAddressRegionKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkStridedDeviceAddressRegionKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #deviceAddress()
    public VkStridedDeviceAddressRegionKHR deviceAddress(long deviceAddress) {
    	DEVICE_ADDRESS_HANDLE.set(segment, 0L, deviceAddress);
    	return this;
    }
    
    public long deviceAddress() {
    	return (long) DEVICE_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #stride()
    public VkStridedDeviceAddressRegionKHR stride(long stride) {
    	STRIDE_HANDLE.set(segment, 0L, stride);
    	return this;
    }
    
    public long stride() {
    	return (long) STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkStridedDeviceAddressRegionKHR size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkStridedDeviceAddressRegionKHR set(VkStridedDeviceAddressRegionKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkStridedDeviceAddressRegionKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkStridedDeviceAddressRegionKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkStridedDeviceAddressRegionKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkStridedDeviceAddressRegionKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkStridedDeviceAddressRegionKHR> array(Arena arena, VkStridedDeviceAddressRegionKHR... structs) {
        NativeStructArray<VkStridedDeviceAddressRegionKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkStridedDeviceAddressRegionKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkStridedDeviceAddressRegionKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkStridedDeviceAddressRegionKHR(segment)
        );
    }
    
}