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

public final class VkPhysicalDevicePipelineBinaryPropertiesKHR
		implements Struct<VkPhysicalDevicePipelineBinaryPropertiesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PIPELINE_BINARY_INTERNAL_CACHE_HANDLE;
    public static final VarHandle PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_HANDLE;
    public static final VarHandle PIPELINE_BINARY_PREFERS_INTERNAL_CACHE_HANDLE;
    public static final VarHandle PIPELINE_BINARY_PRECOMPILED_INTERNAL_CACHE_HANDLE;
    public static final VarHandle PIPELINE_BINARY_COMPRESSED_DATA_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PIPELINE_BINARY_INTERNAL_CACHE_BYTE_OFFSET;
    public static final long PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_BYTE_OFFSET;
    public static final long PIPELINE_BINARY_PREFERS_INTERNAL_CACHE_BYTE_OFFSET;
    public static final long PIPELINE_BINARY_PRECOMPILED_INTERNAL_CACHE_BYTE_OFFSET;
    public static final long PIPELINE_BINARY_COMPRESSED_DATA_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("pipelineBinaryInternalCache"),
            JAVA_INT.withName("pipelineBinaryInternalCacheControl"),
            JAVA_INT.withName("pipelineBinaryPrefersInternalCache"),
            JAVA_INT.withName("pipelineBinaryPrecompiledInternalCache"),
            JAVA_INT.withName("pipelineBinaryCompressedData"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDevicePipelineBinaryPropertiesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PIPELINE_BINARY_INTERNAL_CACHE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineBinaryInternalCache"));
        PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineBinaryInternalCacheControl"));
        PIPELINE_BINARY_PREFERS_INTERNAL_CACHE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineBinaryPrefersInternalCache"));
        PIPELINE_BINARY_PRECOMPILED_INTERNAL_CACHE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineBinaryPrecompiledInternalCache"));
        PIPELINE_BINARY_COMPRESSED_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineBinaryCompressedData"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PIPELINE_BINARY_INTERNAL_CACHE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryInternalCache"));
        PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryInternalCacheControl"));
        PIPELINE_BINARY_PREFERS_INTERNAL_CACHE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryPrefersInternalCache"));
        PIPELINE_BINARY_PRECOMPILED_INTERNAL_CACHE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryPrecompiledInternalCache"));
        PIPELINE_BINARY_COMPRESSED_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryCompressedData"));
        //@formatter:on
    }

    public VkPhysicalDevicePipelineBinaryPropertiesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDevicePipelineBinaryPropertiesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDevicePipelineBinaryPropertiesKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDevicePipelineBinaryPropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pipelineBinaryInternalCache()
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryInternalCache(int pipelineBinaryInternalCache) {
    	PIPELINE_BINARY_INTERNAL_CACHE_HANDLE.set(segment, 0L, pipelineBinaryInternalCache);
    	return this;
    }
    
    public int pipelineBinaryInternalCache() {
    	return (int) PIPELINE_BINARY_INTERNAL_CACHE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipelineBinaryInternalCacheControl()
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryInternalCacheControl(int pipelineBinaryInternalCacheControl) {
    	PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_HANDLE.set(segment, 0L, pipelineBinaryInternalCacheControl);
    	return this;
    }
    
    public int pipelineBinaryInternalCacheControl() {
    	return (int) PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipelineBinaryPrefersInternalCache()
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryPrefersInternalCache(int pipelineBinaryPrefersInternalCache) {
    	PIPELINE_BINARY_PREFERS_INTERNAL_CACHE_HANDLE.set(segment, 0L, pipelineBinaryPrefersInternalCache);
    	return this;
    }
    
    public int pipelineBinaryPrefersInternalCache() {
    	return (int) PIPELINE_BINARY_PREFERS_INTERNAL_CACHE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipelineBinaryPrecompiledInternalCache()
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryPrecompiledInternalCache(int pipelineBinaryPrecompiledInternalCache) {
    	PIPELINE_BINARY_PRECOMPILED_INTERNAL_CACHE_HANDLE.set(segment, 0L, pipelineBinaryPrecompiledInternalCache);
    	return this;
    }
    
    public int pipelineBinaryPrecompiledInternalCache() {
    	return (int) PIPELINE_BINARY_PRECOMPILED_INTERNAL_CACHE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipelineBinaryCompressedData()
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryCompressedData(int pipelineBinaryCompressedData) {
    	PIPELINE_BINARY_COMPRESSED_DATA_HANDLE.set(segment, 0L, pipelineBinaryCompressedData);
    	return this;
    }
    
    public int pipelineBinaryCompressedData() {
    	return (int) PIPELINE_BINARY_COMPRESSED_DATA_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevicePipelineBinaryPropertiesKHR set(VkPhysicalDevicePipelineBinaryPropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevicePipelineBinaryPropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevicePipelineBinaryPropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevicePipelineBinaryPropertiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePipelineBinaryPropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevicePipelineBinaryPropertiesKHR> array(Arena arena, VkPhysicalDevicePipelineBinaryPropertiesKHR... structs) {
        NativeStructArray<VkPhysicalDevicePipelineBinaryPropertiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePipelineBinaryPropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevicePipelineBinaryPropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevicePipelineBinaryPropertiesKHR(segment)
        );
    }
    
}