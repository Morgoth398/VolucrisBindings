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

public final class VkFormatProperties
		implements Struct<VkFormatProperties> {

    public static final StructLayout LAYOUT;

    public static final VarHandle LINEAR_TILING_FEATURES_HANDLE;
    public static final VarHandle OPTIMAL_TILING_FEATURES_HANDLE;
    public static final VarHandle BUFFER_FEATURES_HANDLE;

    public static final long LINEAR_TILING_FEATURES_BYTE_OFFSET;
    public static final long OPTIMAL_TILING_FEATURES_BYTE_OFFSET;
    public static final long BUFFER_FEATURES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("linearTilingFeatures"),
            JAVA_INT.withName("optimalTilingFeatures"),
            JAVA_INT.withName("bufferFeatures")
        ).withName("VkFormatProperties").withByteAlignment(4);
        
        LINEAR_TILING_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("linearTilingFeatures"));
        OPTIMAL_TILING_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("optimalTilingFeatures"));
        BUFFER_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferFeatures"));
        
        LINEAR_TILING_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearTilingFeatures"));
        OPTIMAL_TILING_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("optimalTilingFeatures"));
        BUFFER_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferFeatures"));
        //@formatter:on
    }

    public VkFormatProperties() {
        this(Arena.ofAuto());
    }
    
    public VkFormatProperties(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkFormatProperties(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #linearTilingFeatures()
    public VkFormatProperties linearTilingFeatures(int linearTilingFeatures) {
    	LINEAR_TILING_FEATURES_HANDLE.set(segment, 0L, linearTilingFeatures);
    	return this;
    }
    
    public int linearTilingFeatures() {
    	return (int) LINEAR_TILING_FEATURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #optimalTilingFeatures()
    public VkFormatProperties optimalTilingFeatures(int optimalTilingFeatures) {
    	OPTIMAL_TILING_FEATURES_HANDLE.set(segment, 0L, optimalTilingFeatures);
    	return this;
    }
    
    public int optimalTilingFeatures() {
    	return (int) OPTIMAL_TILING_FEATURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferFeatures()
    public VkFormatProperties bufferFeatures(int bufferFeatures) {
    	BUFFER_FEATURES_HANDLE.set(segment, 0L, bufferFeatures);
    	return this;
    }
    
    public int bufferFeatures() {
    	return (int) BUFFER_FEATURES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkFormatProperties set(VkFormatProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkFormatProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkFormatProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkFormatProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFormatProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkFormatProperties> array(Arena arena, VkFormatProperties... structs) {
        NativeStructArray<VkFormatProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFormatProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkFormatProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkFormatProperties(segment)
        );
    }
    
}