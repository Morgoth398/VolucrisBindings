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

public final class VkQueryLowLatencySupportNV
		implements Struct<VkQueryLowLatencySupportNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle P_QUERIED_LOW_LATENCY_DATA_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long P_QUERIED_LOW_LATENCY_DATA_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("pQueriedLowLatencyData")
        ).withName("VkQueryLowLatencySupportNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        P_QUERIED_LOW_LATENCY_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pQueriedLowLatencyData"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        P_QUERIED_LOW_LATENCY_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pQueriedLowLatencyData"));
        //@formatter:on
    }

    public VkQueryLowLatencySupportNV() {
        this(Arena.ofAuto());
    }
    
    public VkQueryLowLatencySupportNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkQueryLowLatencySupportNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkQueryLowLatencySupportNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkQueryLowLatencySupportNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pQueriedLowLatencyData()
    public VkQueryLowLatencySupportNV pQueriedLowLatencyData(MemorySegment pQueriedLowLatencyData) {
    	P_QUERIED_LOW_LATENCY_DATA_HANDLE.set(segment, 0L, pQueriedLowLatencyData);
    	return this;
    }
    
    public @Nullable MemorySegment pQueriedLowLatencyData() {
    	MemorySegment segment = (MemorySegment) P_QUERIED_LOW_LATENCY_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkQueryLowLatencySupportNV set(VkQueryLowLatencySupportNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkQueryLowLatencySupportNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkQueryLowLatencySupportNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkQueryLowLatencySupportNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkQueryLowLatencySupportNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkQueryLowLatencySupportNV> array(Arena arena, VkQueryLowLatencySupportNV... structs) {
        NativeStructArray<VkQueryLowLatencySupportNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkQueryLowLatencySupportNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkQueryLowLatencySupportNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkQueryLowLatencySupportNV(segment)
        );
    }
    
}