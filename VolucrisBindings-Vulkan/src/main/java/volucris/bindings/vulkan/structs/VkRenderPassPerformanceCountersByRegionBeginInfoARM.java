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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkRenderPassPerformanceCountersByRegionBeginInfoARM
		implements Struct<VkRenderPassPerformanceCountersByRegionBeginInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COUNTER_ADDRESS_COUNT_HANDLE;
	public static final VarHandle P_COUNTER_ADDRESSES_HANDLE;
	public static final VarHandle SERIALIZE_REGIONS_HANDLE;
	public static final VarHandle COUNTER_INDEX_COUNT_HANDLE;
	public static final VarHandle P_COUNTER_INDICES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COUNTER_ADDRESS_COUNT_BYTE_OFFSET;
	public static final long P_COUNTER_ADDRESSES_BYTE_OFFSET;
	public static final long SERIALIZE_REGIONS_BYTE_OFFSET;
	public static final long COUNTER_INDEX_COUNT_BYTE_OFFSET;
	public static final long P_COUNTER_INDICES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("counterAddressCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pCounterAddresses"),
		    JAVA_INT.withName("serializeRegions"),
		    JAVA_INT.withName("counterIndexCount"),
		    UNBOUNDED_ADDRESS.withName("pCounterIndices")
		).withName("VkRenderPassPerformanceCountersByRegionBeginInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COUNTER_ADDRESS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("counterAddressCount"));
		P_COUNTER_ADDRESSES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCounterAddresses"));
		SERIALIZE_REGIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("serializeRegions"));
		COUNTER_INDEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("counterIndexCount"));
		P_COUNTER_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCounterIndices"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COUNTER_ADDRESS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("counterAddressCount"));
		P_COUNTER_ADDRESSES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCounterAddresses"));
		SERIALIZE_REGIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("serializeRegions"));
		COUNTER_INDEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("counterIndexCount"));
		P_COUNTER_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCounterIndices"));
		//@formatter:on
	}

	public VkRenderPassPerformanceCountersByRegionBeginInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkRenderPassPerformanceCountersByRegionBeginInfoARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkRenderPassPerformanceCountersByRegionBeginInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #counterAddressCount()
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM counterAddressCount(int counterAddressCount) {
    	COUNTER_ADDRESS_COUNT_HANDLE.set(segment, 0L, counterAddressCount);
    	return this;
    }
    
    public int counterAddressCount() {
    	return (int) COUNTER_ADDRESS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCounterAddresses()
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM pCounterAddresses(NativeLongArray pCounterAddresses) {
    	P_COUNTER_ADDRESSES_HANDLE.set(segment, 0L, pCounterAddresses.memorySegment());
    	return this;
    }
    
    public @Nullable NativeLongArray pCounterAddresses() {
    	MemorySegment segment = (MemorySegment) P_COUNTER_ADDRESSES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeLongArray(segment);
    }
    
    /// @see #serializeRegions()
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM serializeRegions(int serializeRegions) {
    	SERIALIZE_REGIONS_HANDLE.set(segment, 0L, serializeRegions);
    	return this;
    }
    
    public int serializeRegions() {
    	return (int) SERIALIZE_REGIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #counterIndexCount()
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM counterIndexCount(int counterIndexCount) {
    	COUNTER_INDEX_COUNT_HANDLE.set(segment, 0L, counterIndexCount);
    	return this;
    }
    
    public int counterIndexCount() {
    	return (int) COUNTER_INDEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCounterIndices()
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM pCounterIndices(NativeIntArray pCounterIndices) {
    	P_COUNTER_INDICES_HANDLE.set(segment, 0L, pCounterIndices.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pCounterIndices() {
    	MemorySegment segment = (MemorySegment) P_COUNTER_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM set(VkRenderPassPerformanceCountersByRegionBeginInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderPassPerformanceCountersByRegionBeginInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderPassPerformanceCountersByRegionBeginInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderPassPerformanceCountersByRegionBeginInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderPassPerformanceCountersByRegionBeginInfoARM> array(Arena arena, VkRenderPassPerformanceCountersByRegionBeginInfoARM... structs) {
        NativeStructArray<VkRenderPassPerformanceCountersByRegionBeginInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderPassPerformanceCountersByRegionBeginInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderPassPerformanceCountersByRegionBeginInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderPassPerformanceCountersByRegionBeginInfoARM(segment)
        );
    }

}