/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
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

public final class VkBufferUsageFlags2CreateInfo
		implements Struct<VkBufferUsageFlags2CreateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle USAGE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long USAGE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("usage")
        ).withName("VkBufferUsageFlags2CreateInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        USAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usage"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        USAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usage"));
        //@formatter:on
    }

    public VkBufferUsageFlags2CreateInfo() {
        this(Arena.ofAuto());
    }
    
    public VkBufferUsageFlags2CreateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkBufferUsageFlags2CreateInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkBufferUsageFlags2CreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBufferUsageFlags2CreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #usage()
    public VkBufferUsageFlags2CreateInfo usage(long usage) {
    	USAGE_HANDLE.set(segment, 0L, usage);
    	return this;
    }
    
    public long usage() {
    	return (long) USAGE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkBufferUsageFlags2CreateInfo set(VkBufferUsageFlags2CreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkBufferUsageFlags2CreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBufferUsageFlags2CreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBufferUsageFlags2CreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBufferUsageFlags2CreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBufferUsageFlags2CreateInfo> array(Arena arena, VkBufferUsageFlags2CreateInfo... structs) {
        NativeStructArray<VkBufferUsageFlags2CreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBufferUsageFlags2CreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBufferUsageFlags2CreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBufferUsageFlags2CreateInfo(segment)
        );
    }
    
}