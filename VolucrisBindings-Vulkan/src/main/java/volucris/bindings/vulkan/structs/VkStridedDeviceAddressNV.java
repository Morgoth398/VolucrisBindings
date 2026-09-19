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

public final class VkStridedDeviceAddressNV
		implements Struct<VkStridedDeviceAddressNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle START_ADDRESS_HANDLE;
    public static final VarHandle STRIDE_IN_BYTES_HANDLE;

    public static final long START_ADDRESS_BYTE_OFFSET;
    public static final long STRIDE_IN_BYTES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("startAddress"),
            JAVA_LONG.withName("strideInBytes")
        ).withName("VkStridedDeviceAddressNV").withByteAlignment(8);
        
        START_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("startAddress"));
        STRIDE_IN_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("strideInBytes"));
        
        START_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("startAddress"));
        STRIDE_IN_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("strideInBytes"));
        //@formatter:on
    }

    public VkStridedDeviceAddressNV() {
        this(Arena.ofAuto());
    }
    
    public VkStridedDeviceAddressNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkStridedDeviceAddressNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #startAddress()
    public VkStridedDeviceAddressNV startAddress(long startAddress) {
    	START_ADDRESS_HANDLE.set(segment, 0L, startAddress);
    	return this;
    }
    
    public long startAddress() {
    	return (long) START_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #strideInBytes()
    public VkStridedDeviceAddressNV strideInBytes(long strideInBytes) {
    	STRIDE_IN_BYTES_HANDLE.set(segment, 0L, strideInBytes);
    	return this;
    }
    
    public long strideInBytes() {
    	return (long) STRIDE_IN_BYTES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkStridedDeviceAddressNV set(VkStridedDeviceAddressNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkStridedDeviceAddressNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkStridedDeviceAddressNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkStridedDeviceAddressNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkStridedDeviceAddressNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkStridedDeviceAddressNV> array(Arena arena, VkStridedDeviceAddressNV... structs) {
        NativeStructArray<VkStridedDeviceAddressNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkStridedDeviceAddressNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkStridedDeviceAddressNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkStridedDeviceAddressNV(segment)
        );
    }
    
}