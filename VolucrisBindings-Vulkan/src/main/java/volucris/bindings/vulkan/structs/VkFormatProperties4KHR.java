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

public final class VkFormatProperties4KHR
		implements Struct<VkFormatProperties4KHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle LINEAR_TILING_FEATURES_HANDLE;
    public static final VarHandle OPTIMAL_TILING_FEATURES_HANDLE;
    public static final VarHandle BUFFER_FEATURES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long LINEAR_TILING_FEATURES_BYTE_OFFSET;
    public static final long OPTIMAL_TILING_FEATURES_BYTE_OFFSET;
    public static final long BUFFER_FEATURES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("linearTilingFeatures"),
            JAVA_LONG.withName("optimalTilingFeatures"),
            JAVA_LONG.withName("bufferFeatures")
        ).withName("VkFormatProperties4KHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        LINEAR_TILING_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("linearTilingFeatures"));
        OPTIMAL_TILING_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("optimalTilingFeatures"));
        BUFFER_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferFeatures"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        LINEAR_TILING_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearTilingFeatures"));
        OPTIMAL_TILING_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("optimalTilingFeatures"));
        BUFFER_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferFeatures"));
        //@formatter:on
    }

    public VkFormatProperties4KHR() {
        this(Arena.ofAuto());
    }
    
    public VkFormatProperties4KHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkFormatProperties4KHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkFormatProperties4KHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkFormatProperties4KHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #linearTilingFeatures()
    public VkFormatProperties4KHR linearTilingFeatures(long linearTilingFeatures) {
    	LINEAR_TILING_FEATURES_HANDLE.set(segment, 0L, linearTilingFeatures);
    	return this;
    }
    
    public long linearTilingFeatures() {
    	return (long) LINEAR_TILING_FEATURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #optimalTilingFeatures()
    public VkFormatProperties4KHR optimalTilingFeatures(long optimalTilingFeatures) {
    	OPTIMAL_TILING_FEATURES_HANDLE.set(segment, 0L, optimalTilingFeatures);
    	return this;
    }
    
    public long optimalTilingFeatures() {
    	return (long) OPTIMAL_TILING_FEATURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferFeatures()
    public VkFormatProperties4KHR bufferFeatures(long bufferFeatures) {
    	BUFFER_FEATURES_HANDLE.set(segment, 0L, bufferFeatures);
    	return this;
    }
    
    public long bufferFeatures() {
    	return (long) BUFFER_FEATURES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkFormatProperties4KHR set(VkFormatProperties4KHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkFormatProperties4KHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkFormatProperties4KHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkFormatProperties4KHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFormatProperties4KHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkFormatProperties4KHR> array(Arena arena, VkFormatProperties4KHR... structs) {
        NativeStructArray<VkFormatProperties4KHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFormatProperties4KHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkFormatProperties4KHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkFormatProperties4KHR(segment)
        );
    }
    
}