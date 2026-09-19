/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.unions;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.structs.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkPipelineExecutableStatisticValueKHR
		implements Struct<VkPipelineExecutableStatisticValueKHR> {

    public static final UnionLayout LAYOUT;

    public static final VarHandle B32_HANDLE;
    public static final VarHandle I64_HANDLE;
    public static final VarHandle U64_HANDLE;
    public static final VarHandle F64_HANDLE;

    public static final long B32_BYTE_OFFSET;
    public static final long I64_BYTE_OFFSET;
    public static final long U64_BYTE_OFFSET;
    public static final long F64_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.unionLayout(
            JAVA_INT.withName("b32"),
            JAVA_LONG.withName("i64"),
            JAVA_LONG.withName("u64"),
            JAVA_DOUBLE.withName("f64")
        ).withName("VkPipelineExecutableStatisticValueKHR").withByteAlignment(8);
        
        B32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b32"));
        I64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("i64"));
        U64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("u64"));
        F64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("f64"));
        
        B32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b32"));
        I64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("i64"));
        U64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("u64"));
        F64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("f64"));
        //@formatter:on
    }

    public VkPipelineExecutableStatisticValueKHR() {
        this(Arena.ofAuto());
    }
    
    public VkPipelineExecutableStatisticValueKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPipelineExecutableStatisticValueKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #b32()
    public VkPipelineExecutableStatisticValueKHR b32(int b32) {
    	B32_HANDLE.set(segment, 0L, b32);
    	return this;
    }
    
    public int b32() {
    	return (int) B32_HANDLE.get(segment, 0L);
    }
    
    /// @see #i64()
    public VkPipelineExecutableStatisticValueKHR i64(long i64) {
    	I64_HANDLE.set(segment, 0L, i64);
    	return this;
    }
    
    public long i64() {
    	return (long) I64_HANDLE.get(segment, 0L);
    }
    
    /// @see #u64()
    public VkPipelineExecutableStatisticValueKHR u64(long u64) {
    	U64_HANDLE.set(segment, 0L, u64);
    	return this;
    }
    
    public long u64() {
    	return (long) U64_HANDLE.get(segment, 0L);
    }
    
    /// @see #f64()
    public VkPipelineExecutableStatisticValueKHR f64(double f64) {
    	F64_HANDLE.set(segment, 0L, f64);
    	return this;
    }
    
    public double f64() {
    	return (double) F64_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPipelineExecutableStatisticValueKHR set(VkPipelineExecutableStatisticValueKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineExecutableStatisticValueKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineExecutableStatisticValueKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineExecutableStatisticValueKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineExecutableStatisticValueKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineExecutableStatisticValueKHR> array(Arena arena, VkPipelineExecutableStatisticValueKHR... structs) {
        NativeStructArray<VkPipelineExecutableStatisticValueKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineExecutableStatisticValueKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineExecutableStatisticValueKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineExecutableStatisticValueKHR(segment)
        );
    }
    
}