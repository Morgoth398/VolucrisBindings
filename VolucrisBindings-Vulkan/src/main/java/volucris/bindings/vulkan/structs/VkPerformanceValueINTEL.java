/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkPerformanceValueINTEL
		implements Struct<VkPerformanceValueINTEL> {

    public static final StructLayout LAYOUT;

    public static final VarHandle TYPE_HANDLE;

    public static final long TYPE_BYTE_OFFSET;
    public static final long DATA_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkPerformanceValueDataINTEL data;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            VkPerformanceValueDataINTEL.LAYOUT.withName("data")
        ).withName("VkPerformanceValueINTEL").withByteAlignment(8);
        
        TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
        
        TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
        DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
        //@formatter:on
    }

    public VkPerformanceValueINTEL() {
        this(Arena.ofAuto());
    }
    
    public VkPerformanceValueINTEL(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPerformanceValueINTEL(MemorySegment segment) {
        this.segment = segment;
    
        data = new VkPerformanceValueDataINTEL(segment.asSlice(DATA_BYTE_OFFSET, VkPerformanceValueDataINTEL.LAYOUT));
    }

    /// @see #type()
    public VkPerformanceValueINTEL type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #data()
    public VkPerformanceValueINTEL data(Consumer<VkPerformanceValueDataINTEL> consumer) {
    	consumer.accept(data);
    	return this;
    }
    
    /// @see #data()
    public VkPerformanceValueINTEL data(VkPerformanceValueDataINTEL other) {
    	data.set(other);
    	return this;
    }
    
    public VkPerformanceValueDataINTEL data() {
    	return data;
    }
    
    @Override
    public VkPerformanceValueINTEL set(VkPerformanceValueINTEL other) {
        return set(other.segment);
    }
    
    @Override
    public VkPerformanceValueINTEL set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPerformanceValueINTEL> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPerformanceValueINTEL> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPerformanceValueINTEL(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPerformanceValueINTEL> array(Arena arena, VkPerformanceValueINTEL... structs) {
        NativeStructArray<VkPerformanceValueINTEL> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPerformanceValueINTEL(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPerformanceValueINTEL> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPerformanceValueINTEL(segment)
        );
    }
    
}