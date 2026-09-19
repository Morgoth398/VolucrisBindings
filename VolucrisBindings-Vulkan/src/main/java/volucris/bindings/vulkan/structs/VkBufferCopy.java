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

public final class VkBufferCopy
		implements Struct<VkBufferCopy> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SRC_OFFSET_HANDLE;
    public static final VarHandle DST_OFFSET_HANDLE;
    public static final VarHandle SIZE_HANDLE;

    public static final long SRC_OFFSET_BYTE_OFFSET;
    public static final long DST_OFFSET_BYTE_OFFSET;
    public static final long SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("srcOffset"),
            JAVA_LONG.withName("dstOffset"),
            JAVA_LONG.withName("size")
        ).withName("VkBufferCopy").withByteAlignment(8);
        
        SRC_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcOffset"));
        DST_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstOffset"));
        SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
        
        SRC_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcOffset"));
        DST_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstOffset"));
        SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
        //@formatter:on
    }

    public VkBufferCopy() {
        this(Arena.ofAuto());
    }
    
    public VkBufferCopy(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkBufferCopy(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #srcOffset()
    public VkBufferCopy srcOffset(long srcOffset) {
    	SRC_OFFSET_HANDLE.set(segment, 0L, srcOffset);
    	return this;
    }
    
    public long srcOffset() {
    	return (long) SRC_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstOffset()
    public VkBufferCopy dstOffset(long dstOffset) {
    	DST_OFFSET_HANDLE.set(segment, 0L, dstOffset);
    	return this;
    }
    
    public long dstOffset() {
    	return (long) DST_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkBufferCopy size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkBufferCopy set(VkBufferCopy other) {
        return set(other.segment);
    }
    
    @Override
    public VkBufferCopy set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBufferCopy> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBufferCopy> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBufferCopy(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBufferCopy> array(Arena arena, VkBufferCopy... structs) {
        NativeStructArray<VkBufferCopy> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBufferCopy(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBufferCopy> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBufferCopy(segment)
        );
    }
    
}