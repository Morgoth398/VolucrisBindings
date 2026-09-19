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

public final class VkStridedDeviceAddressRangeKHR
		implements Struct<VkStridedDeviceAddressRangeKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle ADDRESS_HANDLE;
    public static final VarHandle SIZE_HANDLE;
    public static final VarHandle STRIDE_HANDLE;

    public static final long ADDRESS_BYTE_OFFSET;
    public static final long SIZE_BYTE_OFFSET;
    public static final long STRIDE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("address"),
            JAVA_LONG.withName("size"),
            JAVA_LONG.withName("stride")
        ).withName("VkStridedDeviceAddressRangeKHR").withByteAlignment(8);
        
        ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("address"));
        SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
        STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stride"));
        
        ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("address"));
        SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
        STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stride"));
        //@formatter:on
    }

    public VkStridedDeviceAddressRangeKHR() {
        this(Arena.ofAuto());
    }
    
    public VkStridedDeviceAddressRangeKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkStridedDeviceAddressRangeKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #address()
    public VkStridedDeviceAddressRangeKHR address(long address) {
    	ADDRESS_HANDLE.set(segment, 0L, address);
    	return this;
    }
    
    public long address() {
    	return (long) ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkStridedDeviceAddressRangeKHR size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #stride()
    public VkStridedDeviceAddressRangeKHR stride(long stride) {
    	STRIDE_HANDLE.set(segment, 0L, stride);
    	return this;
    }
    
    public long stride() {
    	return (long) STRIDE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkStridedDeviceAddressRangeKHR set(VkStridedDeviceAddressRangeKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkStridedDeviceAddressRangeKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkStridedDeviceAddressRangeKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkStridedDeviceAddressRangeKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkStridedDeviceAddressRangeKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkStridedDeviceAddressRangeKHR> array(Arena arena, VkStridedDeviceAddressRangeKHR... structs) {
        NativeStructArray<VkStridedDeviceAddressRangeKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkStridedDeviceAddressRangeKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkStridedDeviceAddressRangeKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkStridedDeviceAddressRangeKHR(segment)
        );
    }
    
}