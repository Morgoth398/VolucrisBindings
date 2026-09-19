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

public final class VkTraceRaysIndirectCommand2KHR
		implements Struct<VkTraceRaysIndirectCommand2KHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle RAYGEN_SHADER_RECORD_ADDRESS_HANDLE;
    public static final VarHandle RAYGEN_SHADER_RECORD_SIZE_HANDLE;
    public static final VarHandle MISS_SHADER_BINDING_TABLE_ADDRESS_HANDLE;
    public static final VarHandle MISS_SHADER_BINDING_TABLE_SIZE_HANDLE;
    public static final VarHandle MISS_SHADER_BINDING_TABLE_STRIDE_HANDLE;
    public static final VarHandle HIT_SHADER_BINDING_TABLE_ADDRESS_HANDLE;
    public static final VarHandle HIT_SHADER_BINDING_TABLE_SIZE_HANDLE;
    public static final VarHandle HIT_SHADER_BINDING_TABLE_STRIDE_HANDLE;
    public static final VarHandle CALLABLE_SHADER_BINDING_TABLE_ADDRESS_HANDLE;
    public static final VarHandle CALLABLE_SHADER_BINDING_TABLE_SIZE_HANDLE;
    public static final VarHandle CALLABLE_SHADER_BINDING_TABLE_STRIDE_HANDLE;
    public static final VarHandle WIDTH_HANDLE;
    public static final VarHandle HEIGHT_HANDLE;
    public static final VarHandle DEPTH_HANDLE;

    public static final long RAYGEN_SHADER_RECORD_ADDRESS_BYTE_OFFSET;
    public static final long RAYGEN_SHADER_RECORD_SIZE_BYTE_OFFSET;
    public static final long MISS_SHADER_BINDING_TABLE_ADDRESS_BYTE_OFFSET;
    public static final long MISS_SHADER_BINDING_TABLE_SIZE_BYTE_OFFSET;
    public static final long MISS_SHADER_BINDING_TABLE_STRIDE_BYTE_OFFSET;
    public static final long HIT_SHADER_BINDING_TABLE_ADDRESS_BYTE_OFFSET;
    public static final long HIT_SHADER_BINDING_TABLE_SIZE_BYTE_OFFSET;
    public static final long HIT_SHADER_BINDING_TABLE_STRIDE_BYTE_OFFSET;
    public static final long CALLABLE_SHADER_BINDING_TABLE_ADDRESS_BYTE_OFFSET;
    public static final long CALLABLE_SHADER_BINDING_TABLE_SIZE_BYTE_OFFSET;
    public static final long CALLABLE_SHADER_BINDING_TABLE_STRIDE_BYTE_OFFSET;
    public static final long WIDTH_BYTE_OFFSET;
    public static final long HEIGHT_BYTE_OFFSET;
    public static final long DEPTH_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("raygenShaderRecordAddress"),
            JAVA_LONG.withName("raygenShaderRecordSize"),
            JAVA_LONG.withName("missShaderBindingTableAddress"),
            JAVA_LONG.withName("missShaderBindingTableSize"),
            JAVA_LONG.withName("missShaderBindingTableStride"),
            JAVA_LONG.withName("hitShaderBindingTableAddress"),
            JAVA_LONG.withName("hitShaderBindingTableSize"),
            JAVA_LONG.withName("hitShaderBindingTableStride"),
            JAVA_LONG.withName("callableShaderBindingTableAddress"),
            JAVA_LONG.withName("callableShaderBindingTableSize"),
            JAVA_LONG.withName("callableShaderBindingTableStride"),
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height"),
            JAVA_INT.withName("depth"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkTraceRaysIndirectCommand2KHR").withByteAlignment(8);
        
        RAYGEN_SHADER_RECORD_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("raygenShaderRecordAddress"));
        RAYGEN_SHADER_RECORD_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("raygenShaderRecordSize"));
        MISS_SHADER_BINDING_TABLE_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("missShaderBindingTableAddress"));
        MISS_SHADER_BINDING_TABLE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("missShaderBindingTableSize"));
        MISS_SHADER_BINDING_TABLE_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("missShaderBindingTableStride"));
        HIT_SHADER_BINDING_TABLE_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hitShaderBindingTableAddress"));
        HIT_SHADER_BINDING_TABLE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hitShaderBindingTableSize"));
        HIT_SHADER_BINDING_TABLE_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hitShaderBindingTableStride"));
        CALLABLE_SHADER_BINDING_TABLE_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("callableShaderBindingTableAddress"));
        CALLABLE_SHADER_BINDING_TABLE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("callableShaderBindingTableSize"));
        CALLABLE_SHADER_BINDING_TABLE_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("callableShaderBindingTableStride"));
        WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("width"));
        HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("height"));
        DEPTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depth"));
        
        RAYGEN_SHADER_RECORD_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("raygenShaderRecordAddress"));
        RAYGEN_SHADER_RECORD_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("raygenShaderRecordSize"));
        MISS_SHADER_BINDING_TABLE_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("missShaderBindingTableAddress"));
        MISS_SHADER_BINDING_TABLE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("missShaderBindingTableSize"));
        MISS_SHADER_BINDING_TABLE_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("missShaderBindingTableStride"));
        HIT_SHADER_BINDING_TABLE_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hitShaderBindingTableAddress"));
        HIT_SHADER_BINDING_TABLE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hitShaderBindingTableSize"));
        HIT_SHADER_BINDING_TABLE_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hitShaderBindingTableStride"));
        CALLABLE_SHADER_BINDING_TABLE_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("callableShaderBindingTableAddress"));
        CALLABLE_SHADER_BINDING_TABLE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("callableShaderBindingTableSize"));
        CALLABLE_SHADER_BINDING_TABLE_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("callableShaderBindingTableStride"));
        WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("width"));
        HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("height"));
        DEPTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depth"));
        //@formatter:on
    }

    public VkTraceRaysIndirectCommand2KHR() {
        this(Arena.ofAuto());
    }
    
    public VkTraceRaysIndirectCommand2KHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkTraceRaysIndirectCommand2KHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #raygenShaderRecordAddress()
    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordAddress(long raygenShaderRecordAddress) {
    	RAYGEN_SHADER_RECORD_ADDRESS_HANDLE.set(segment, 0L, raygenShaderRecordAddress);
    	return this;
    }
    
    public long raygenShaderRecordAddress() {
    	return (long) RAYGEN_SHADER_RECORD_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #raygenShaderRecordSize()
    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordSize(long raygenShaderRecordSize) {
    	RAYGEN_SHADER_RECORD_SIZE_HANDLE.set(segment, 0L, raygenShaderRecordSize);
    	return this;
    }
    
    public long raygenShaderRecordSize() {
    	return (long) RAYGEN_SHADER_RECORD_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #missShaderBindingTableAddress()
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableAddress(long missShaderBindingTableAddress) {
    	MISS_SHADER_BINDING_TABLE_ADDRESS_HANDLE.set(segment, 0L, missShaderBindingTableAddress);
    	return this;
    }
    
    public long missShaderBindingTableAddress() {
    	return (long) MISS_SHADER_BINDING_TABLE_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #missShaderBindingTableSize()
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableSize(long missShaderBindingTableSize) {
    	MISS_SHADER_BINDING_TABLE_SIZE_HANDLE.set(segment, 0L, missShaderBindingTableSize);
    	return this;
    }
    
    public long missShaderBindingTableSize() {
    	return (long) MISS_SHADER_BINDING_TABLE_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #missShaderBindingTableStride()
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableStride(long missShaderBindingTableStride) {
    	MISS_SHADER_BINDING_TABLE_STRIDE_HANDLE.set(segment, 0L, missShaderBindingTableStride);
    	return this;
    }
    
    public long missShaderBindingTableStride() {
    	return (long) MISS_SHADER_BINDING_TABLE_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #hitShaderBindingTableAddress()
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableAddress(long hitShaderBindingTableAddress) {
    	HIT_SHADER_BINDING_TABLE_ADDRESS_HANDLE.set(segment, 0L, hitShaderBindingTableAddress);
    	return this;
    }
    
    public long hitShaderBindingTableAddress() {
    	return (long) HIT_SHADER_BINDING_TABLE_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #hitShaderBindingTableSize()
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableSize(long hitShaderBindingTableSize) {
    	HIT_SHADER_BINDING_TABLE_SIZE_HANDLE.set(segment, 0L, hitShaderBindingTableSize);
    	return this;
    }
    
    public long hitShaderBindingTableSize() {
    	return (long) HIT_SHADER_BINDING_TABLE_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #hitShaderBindingTableStride()
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableStride(long hitShaderBindingTableStride) {
    	HIT_SHADER_BINDING_TABLE_STRIDE_HANDLE.set(segment, 0L, hitShaderBindingTableStride);
    	return this;
    }
    
    public long hitShaderBindingTableStride() {
    	return (long) HIT_SHADER_BINDING_TABLE_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #callableShaderBindingTableAddress()
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableAddress(long callableShaderBindingTableAddress) {
    	CALLABLE_SHADER_BINDING_TABLE_ADDRESS_HANDLE.set(segment, 0L, callableShaderBindingTableAddress);
    	return this;
    }
    
    public long callableShaderBindingTableAddress() {
    	return (long) CALLABLE_SHADER_BINDING_TABLE_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #callableShaderBindingTableSize()
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableSize(long callableShaderBindingTableSize) {
    	CALLABLE_SHADER_BINDING_TABLE_SIZE_HANDLE.set(segment, 0L, callableShaderBindingTableSize);
    	return this;
    }
    
    public long callableShaderBindingTableSize() {
    	return (long) CALLABLE_SHADER_BINDING_TABLE_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #callableShaderBindingTableStride()
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableStride(long callableShaderBindingTableStride) {
    	CALLABLE_SHADER_BINDING_TABLE_STRIDE_HANDLE.set(segment, 0L, callableShaderBindingTableStride);
    	return this;
    }
    
    public long callableShaderBindingTableStride() {
    	return (long) CALLABLE_SHADER_BINDING_TABLE_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #width()
    public VkTraceRaysIndirectCommand2KHR width(int width) {
    	WIDTH_HANDLE.set(segment, 0L, width);
    	return this;
    }
    
    public int width() {
    	return (int) WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #height()
    public VkTraceRaysIndirectCommand2KHR height(int height) {
    	HEIGHT_HANDLE.set(segment, 0L, height);
    	return this;
    }
    
    public int height() {
    	return (int) HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #depth()
    public VkTraceRaysIndirectCommand2KHR depth(int depth) {
    	DEPTH_HANDLE.set(segment, 0L, depth);
    	return this;
    }
    
    public int depth() {
    	return (int) DEPTH_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkTraceRaysIndirectCommand2KHR set(VkTraceRaysIndirectCommand2KHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkTraceRaysIndirectCommand2KHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkTraceRaysIndirectCommand2KHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkTraceRaysIndirectCommand2KHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTraceRaysIndirectCommand2KHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkTraceRaysIndirectCommand2KHR> array(Arena arena, VkTraceRaysIndirectCommand2KHR... structs) {
        NativeStructArray<VkTraceRaysIndirectCommand2KHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTraceRaysIndirectCommand2KHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkTraceRaysIndirectCommand2KHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkTraceRaysIndirectCommand2KHR(segment)
        );
    }
    
}