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
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkTensorCopyARM
		implements Struct<VkTensorCopyARM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle DIMENSION_COUNT_HANDLE;
    public static final VarHandle P_SRC_OFFSET_HANDLE;
    public static final VarHandle P_DST_OFFSET_HANDLE;
    public static final VarHandle P_EXTENT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long DIMENSION_COUNT_BYTE_OFFSET;
    public static final long P_SRC_OFFSET_BYTE_OFFSET;
    public static final long P_DST_OFFSET_BYTE_OFFSET;
    public static final long P_EXTENT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("dimensionCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pSrcOffset"),
            UNBOUNDED_ADDRESS.withName("pDstOffset"),
            UNBOUNDED_ADDRESS.withName("pExtent")
        ).withName("VkTensorCopyARM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        DIMENSION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dimensionCount"));
        P_SRC_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSrcOffset"));
        P_DST_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDstOffset"));
        P_EXTENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pExtent"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        DIMENSION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dimensionCount"));
        P_SRC_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSrcOffset"));
        P_DST_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDstOffset"));
        P_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pExtent"));
        //@formatter:on
    }

    public VkTensorCopyARM() {
        this(Arena.ofAuto());
    }
    
    public VkTensorCopyARM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkTensorCopyARM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkTensorCopyARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkTensorCopyARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #dimensionCount()
    public VkTensorCopyARM dimensionCount(int dimensionCount) {
    	DIMENSION_COUNT_HANDLE.set(segment, 0L, dimensionCount);
    	return this;
    }
    
    public int dimensionCount() {
    	return (int) DIMENSION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSrcOffset()
    public VkTensorCopyARM pSrcOffset(NativeLongArray pSrcOffset) {
    	P_SRC_OFFSET_HANDLE.set(segment, 0L, pSrcOffset.memorySegment());
    	return this;
    }
    
    public @Nullable NativeLongArray pSrcOffset() {
    	MemorySegment segment = (MemorySegment) P_SRC_OFFSET_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeLongArray(segment);
    }
    
    /// @see #pDstOffset()
    public VkTensorCopyARM pDstOffset(NativeLongArray pDstOffset) {
    	P_DST_OFFSET_HANDLE.set(segment, 0L, pDstOffset.memorySegment());
    	return this;
    }
    
    public @Nullable NativeLongArray pDstOffset() {
    	MemorySegment segment = (MemorySegment) P_DST_OFFSET_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeLongArray(segment);
    }
    
    /// @see #pExtent()
    public VkTensorCopyARM pExtent(NativeLongArray pExtent) {
    	P_EXTENT_HANDLE.set(segment, 0L, pExtent.memorySegment());
    	return this;
    }
    
    public @Nullable NativeLongArray pExtent() {
    	MemorySegment segment = (MemorySegment) P_EXTENT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeLongArray(segment);
    }
    
    @Override
    public VkTensorCopyARM set(VkTensorCopyARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkTensorCopyARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkTensorCopyARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkTensorCopyARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTensorCopyARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkTensorCopyARM> array(Arena arena, VkTensorCopyARM... structs) {
        NativeStructArray<VkTensorCopyARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTensorCopyARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkTensorCopyARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkTensorCopyARM(segment)
        );
    }
    
}