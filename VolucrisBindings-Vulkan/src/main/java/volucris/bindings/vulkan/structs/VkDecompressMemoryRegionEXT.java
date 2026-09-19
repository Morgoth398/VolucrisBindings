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

public final class VkDecompressMemoryRegionEXT
		implements Struct<VkDecompressMemoryRegionEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SRC_ADDRESS_HANDLE;
    public static final VarHandle DST_ADDRESS_HANDLE;
    public static final VarHandle COMPRESSED_SIZE_HANDLE;
    public static final VarHandle DECOMPRESSED_SIZE_HANDLE;

    public static final long SRC_ADDRESS_BYTE_OFFSET;
    public static final long DST_ADDRESS_BYTE_OFFSET;
    public static final long COMPRESSED_SIZE_BYTE_OFFSET;
    public static final long DECOMPRESSED_SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("srcAddress"),
            JAVA_LONG.withName("dstAddress"),
            JAVA_LONG.withName("compressedSize"),
            JAVA_LONG.withName("decompressedSize")
        ).withName("VkDecompressMemoryRegionEXT").withByteAlignment(8);
        
        SRC_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcAddress"));
        DST_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstAddress"));
        COMPRESSED_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("compressedSize"));
        DECOMPRESSED_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("decompressedSize"));
        
        SRC_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcAddress"));
        DST_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstAddress"));
        COMPRESSED_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("compressedSize"));
        DECOMPRESSED_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("decompressedSize"));
        //@formatter:on
    }

    public VkDecompressMemoryRegionEXT() {
        this(Arena.ofAuto());
    }
    
    public VkDecompressMemoryRegionEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDecompressMemoryRegionEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #srcAddress()
    public VkDecompressMemoryRegionEXT srcAddress(long srcAddress) {
    	SRC_ADDRESS_HANDLE.set(segment, 0L, srcAddress);
    	return this;
    }
    
    public long srcAddress() {
    	return (long) SRC_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstAddress()
    public VkDecompressMemoryRegionEXT dstAddress(long dstAddress) {
    	DST_ADDRESS_HANDLE.set(segment, 0L, dstAddress);
    	return this;
    }
    
    public long dstAddress() {
    	return (long) DST_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #compressedSize()
    public VkDecompressMemoryRegionEXT compressedSize(long compressedSize) {
    	COMPRESSED_SIZE_HANDLE.set(segment, 0L, compressedSize);
    	return this;
    }
    
    public long compressedSize() {
    	return (long) COMPRESSED_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #decompressedSize()
    public VkDecompressMemoryRegionEXT decompressedSize(long decompressedSize) {
    	DECOMPRESSED_SIZE_HANDLE.set(segment, 0L, decompressedSize);
    	return this;
    }
    
    public long decompressedSize() {
    	return (long) DECOMPRESSED_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDecompressMemoryRegionEXT set(VkDecompressMemoryRegionEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDecompressMemoryRegionEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDecompressMemoryRegionEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDecompressMemoryRegionEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDecompressMemoryRegionEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDecompressMemoryRegionEXT> array(Arena arena, VkDecompressMemoryRegionEXT... structs) {
        NativeStructArray<VkDecompressMemoryRegionEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDecompressMemoryRegionEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDecompressMemoryRegionEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDecompressMemoryRegionEXT(segment)
        );
    }
    
}