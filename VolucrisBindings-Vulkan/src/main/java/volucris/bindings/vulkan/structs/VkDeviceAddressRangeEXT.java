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
import static volucris.bindings.core.FFMUtils.UNBOUNDED_ADDRESS;

/**
 * 
 */
public final class VkDeviceAddressRangeEXT
		implements Struct<VkDeviceAddressRangeEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle ADDRESS_HANDLE;
    public static final VarHandle SIZE_HANDLE;

    public static final long ADDRESS_BYTE_OFFSET;
    public static final long SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("address"),
            JAVA_LONG.withName("size")
        ).withName("VkDeviceAddressRangeEXT").withByteAlignment(8);
        
        ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("address"));
        SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
        
        ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("address"));
        SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
        //@formatter:on
    }

    public VkDeviceAddressRangeEXT() {
        this(Arena.ofAuto());
    }
    
    public VkDeviceAddressRangeEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDeviceAddressRangeEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    public VkDeviceAddressRangeEXT address(long address) {
        ADDRESS_HANDLE.set(segment, 0L, address);
        return this;
    }
    
    public long address() {
        return (long) ADDRESS_HANDLE.get(segment, 0L);
    }
    
    public VkDeviceAddressRangeEXT size(long size) {
        SIZE_HANDLE.set(segment, 0L, size);
        return this;
    }
    
    public long size() {
        return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDeviceAddressRangeEXT set(VkDeviceAddressRangeEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceAddressRangeEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceAddressRangeEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceAddressRangeEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceAddressRangeEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceAddressRangeEXT> array(Arena arena, VkDeviceAddressRangeEXT... structs) {
        NativeStructArray<VkDeviceAddressRangeEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceAddressRangeEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceAddressRangeEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceAddressRangeEXT(segment)
        );
    }
    
}