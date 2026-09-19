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

public final class VkTensorDescriptionARM
		implements Struct<VkTensorDescriptionARM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle TILING_HANDLE;
    public static final VarHandle FORMAT_HANDLE;
    public static final VarHandle DIMENSION_COUNT_HANDLE;
    public static final VarHandle P_DIMENSIONS_HANDLE;
    public static final VarHandle P_STRIDES_HANDLE;
    public static final VarHandle USAGE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long TILING_BYTE_OFFSET;
    public static final long FORMAT_BYTE_OFFSET;
    public static final long DIMENSION_COUNT_BYTE_OFFSET;
    public static final long P_DIMENSIONS_BYTE_OFFSET;
    public static final long P_STRIDES_BYTE_OFFSET;
    public static final long USAGE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("tiling"),
            JAVA_INT.withName("format"),
            JAVA_INT.withName("dimensionCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pDimensions"),
            UNBOUNDED_ADDRESS.withName("pStrides"),
            JAVA_LONG.withName("usage")
        ).withName("VkTensorDescriptionARM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        TILING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tiling"));
        FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
        DIMENSION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dimensionCount"));
        P_DIMENSIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDimensions"));
        P_STRIDES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStrides"));
        USAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usage"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        TILING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tiling"));
        FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
        DIMENSION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dimensionCount"));
        P_DIMENSIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDimensions"));
        P_STRIDES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStrides"));
        USAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usage"));
        //@formatter:on
    }

    public VkTensorDescriptionARM() {
        this(Arena.ofAuto());
    }
    
    public VkTensorDescriptionARM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkTensorDescriptionARM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkTensorDescriptionARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkTensorDescriptionARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #tiling()
    public VkTensorDescriptionARM tiling(int tiling) {
    	TILING_HANDLE.set(segment, 0L, tiling);
    	return this;
    }
    
    public int tiling() {
    	return (int) TILING_HANDLE.get(segment, 0L);
    }
    
    /// @see #format()
    public VkTensorDescriptionARM format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #dimensionCount()
    public VkTensorDescriptionARM dimensionCount(int dimensionCount) {
    	DIMENSION_COUNT_HANDLE.set(segment, 0L, dimensionCount);
    	return this;
    }
    
    public int dimensionCount() {
    	return (int) DIMENSION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDimensions()
    public VkTensorDescriptionARM pDimensions(NativeLongArray pDimensions) {
    	P_DIMENSIONS_HANDLE.set(segment, 0L, pDimensions.memorySegment());
    	return this;
    }
    
    public @Nullable NativeLongArray pDimensions() {
    	MemorySegment segment = (MemorySegment) P_DIMENSIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeLongArray(segment);
    }
    
    /// @see #pStrides()
    public VkTensorDescriptionARM pStrides(NativeLongArray pStrides) {
    	P_STRIDES_HANDLE.set(segment, 0L, pStrides.memorySegment());
    	return this;
    }
    
    public @Nullable NativeLongArray pStrides() {
    	MemorySegment segment = (MemorySegment) P_STRIDES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeLongArray(segment);
    }
    
    /// @see #usage()
    public VkTensorDescriptionARM usage(long usage) {
    	USAGE_HANDLE.set(segment, 0L, usage);
    	return this;
    }
    
    public long usage() {
    	return (long) USAGE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkTensorDescriptionARM set(VkTensorDescriptionARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkTensorDescriptionARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkTensorDescriptionARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkTensorDescriptionARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTensorDescriptionARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkTensorDescriptionARM> array(Arena arena, VkTensorDescriptionARM... structs) {
        NativeStructArray<VkTensorDescriptionARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTensorDescriptionARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkTensorDescriptionARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkTensorDescriptionARM(segment)
        );
    }
    
}