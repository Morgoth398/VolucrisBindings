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

public final class VkClusterAccelerationStructureMoveObjectsInputNV
		implements Struct<VkClusterAccelerationStructureMoveObjectsInputNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle TYPE_HANDLE;
    public static final VarHandle NO_MOVE_OVERLAP_HANDLE;
    public static final VarHandle MAX_MOVED_BYTES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long TYPE_BYTE_OFFSET;
    public static final long NO_MOVE_OVERLAP_BYTE_OFFSET;
    public static final long MAX_MOVED_BYTES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("type"),
            JAVA_INT.withName("noMoveOverlap"),
            JAVA_LONG.withName("maxMovedBytes")
        ).withName("VkClusterAccelerationStructureMoveObjectsInputNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
        NO_MOVE_OVERLAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noMoveOverlap"));
        MAX_MOVED_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMovedBytes"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
        NO_MOVE_OVERLAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noMoveOverlap"));
        MAX_MOVED_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMovedBytes"));
        //@formatter:on
    }

    public VkClusterAccelerationStructureMoveObjectsInputNV() {
        this(Arena.ofAuto());
    }
    
    public VkClusterAccelerationStructureMoveObjectsInputNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkClusterAccelerationStructureMoveObjectsInputNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkClusterAccelerationStructureMoveObjectsInputNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkClusterAccelerationStructureMoveObjectsInputNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #type()
    public VkClusterAccelerationStructureMoveObjectsInputNV type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #noMoveOverlap()
    public VkClusterAccelerationStructureMoveObjectsInputNV noMoveOverlap(int noMoveOverlap) {
    	NO_MOVE_OVERLAP_HANDLE.set(segment, 0L, noMoveOverlap);
    	return this;
    }
    
    public int noMoveOverlap() {
    	return (int) NO_MOVE_OVERLAP_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMovedBytes()
    public VkClusterAccelerationStructureMoveObjectsInputNV maxMovedBytes(long maxMovedBytes) {
    	MAX_MOVED_BYTES_HANDLE.set(segment, 0L, maxMovedBytes);
    	return this;
    }
    
    public long maxMovedBytes() {
    	return (long) MAX_MOVED_BYTES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkClusterAccelerationStructureMoveObjectsInputNV set(VkClusterAccelerationStructureMoveObjectsInputNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkClusterAccelerationStructureMoveObjectsInputNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkClusterAccelerationStructureMoveObjectsInputNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureMoveObjectsInputNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureMoveObjectsInputNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureMoveObjectsInputNV> array(Arena arena, VkClusterAccelerationStructureMoveObjectsInputNV... structs) {
        NativeStructArray<VkClusterAccelerationStructureMoveObjectsInputNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureMoveObjectsInputNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureMoveObjectsInputNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureMoveObjectsInputNV(segment)
        );
    }
    
}