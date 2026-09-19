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

public final class VkPipelineCacheHeaderVersionDataGraphQCOM
		implements Struct<VkPipelineCacheHeaderVersionDataGraphQCOM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle HEADER_SIZE_HANDLE;
    public static final VarHandle HEADER_VERSION_HANDLE;
    public static final VarHandle CACHE_TYPE_HANDLE;
    public static final VarHandle CACHE_VERSION_HANDLE;
    public static final VarHandle TOOLCHAIN_VERSION_HANDLE;

    public static final long HEADER_SIZE_BYTE_OFFSET;
    public static final long HEADER_VERSION_BYTE_OFFSET;
    public static final long CACHE_TYPE_BYTE_OFFSET;
    public static final long CACHE_VERSION_BYTE_OFFSET;
    public static final long TOOLCHAIN_VERSION_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("headerSize"),
            JAVA_INT.withName("headerVersion"),
            JAVA_INT.withName("cacheType"),
            JAVA_INT.withName("cacheVersion"),
            MemoryLayout.sequenceLayout(3, JAVA_INT).withName("toolchainVersion")
        ).withName("VkPipelineCacheHeaderVersionDataGraphQCOM").withByteAlignment(4);
        
        HEADER_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("headerSize"));
        HEADER_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("headerVersion"));
        CACHE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cacheType"));
        CACHE_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cacheVersion"));
        TOOLCHAIN_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("toolchainVersion"), PathElement.sequenceElement());
        
        HEADER_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("headerSize"));
        HEADER_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("headerVersion"));
        CACHE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cacheType"));
        CACHE_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cacheVersion"));
        TOOLCHAIN_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("toolchainVersion"));
        //@formatter:on
    }

    public VkPipelineCacheHeaderVersionDataGraphQCOM() {
        this(Arena.ofAuto());
    }
    
    public VkPipelineCacheHeaderVersionDataGraphQCOM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPipelineCacheHeaderVersionDataGraphQCOM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #headerSize()
    public VkPipelineCacheHeaderVersionDataGraphQCOM headerSize(int headerSize) {
    	HEADER_SIZE_HANDLE.set(segment, 0L, headerSize);
    	return this;
    }
    
    public int headerSize() {
    	return (int) HEADER_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #headerVersion()
    public VkPipelineCacheHeaderVersionDataGraphQCOM headerVersion(int headerVersion) {
    	HEADER_VERSION_HANDLE.set(segment, 0L, headerVersion);
    	return this;
    }
    
    public int headerVersion() {
    	return (int) HEADER_VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #cacheType()
    public VkPipelineCacheHeaderVersionDataGraphQCOM cacheType(int cacheType) {
    	CACHE_TYPE_HANDLE.set(segment, 0L, cacheType);
    	return this;
    }
    
    public int cacheType() {
    	return (int) CACHE_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #cacheVersion()
    public VkPipelineCacheHeaderVersionDataGraphQCOM cacheVersion(int cacheVersion) {
    	CACHE_VERSION_HANDLE.set(segment, 0L, cacheVersion);
    	return this;
    }
    
    public int cacheVersion() {
    	return (int) CACHE_VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #toolchainVersion(int)
    public VkPipelineCacheHeaderVersionDataGraphQCOM toolchainVersion(int toolchainVersion, int index0) {
    	TOOLCHAIN_VERSION_HANDLE.set(segment, 0L, index0, toolchainVersion);
    	return this;
    }
    
    public int toolchainVersion(int index0) {
    	return (int) TOOLCHAIN_VERSION_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkPipelineCacheHeaderVersionDataGraphQCOM set(VkPipelineCacheHeaderVersionDataGraphQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineCacheHeaderVersionDataGraphQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineCacheHeaderVersionDataGraphQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineCacheHeaderVersionDataGraphQCOM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineCacheHeaderVersionDataGraphQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineCacheHeaderVersionDataGraphQCOM> array(Arena arena, VkPipelineCacheHeaderVersionDataGraphQCOM... structs) {
        NativeStructArray<VkPipelineCacheHeaderVersionDataGraphQCOM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineCacheHeaderVersionDataGraphQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineCacheHeaderVersionDataGraphQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineCacheHeaderVersionDataGraphQCOM(segment)
        );
    }
    
}