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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkDrawIndirectCount2InfoKHR
		implements Struct<VkDrawIndirectCount2InfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle ADDRESS_FLAGS_HANDLE;
    public static final VarHandle COUNT_ADDRESS_FLAGS_HANDLE;
    public static final VarHandle MAX_DRAW_COUNT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long ADDRESS_RANGE_BYTE_OFFSET;
    public static final long ADDRESS_FLAGS_BYTE_OFFSET;
    public static final long COUNT_ADDRESS_RANGE_BYTE_OFFSET;
    public static final long COUNT_ADDRESS_FLAGS_BYTE_OFFSET;
    public static final long MAX_DRAW_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkStridedDeviceAddressRangeKHR addressRange;
    private final VkDeviceAddressRangeKHR countAddressRange;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkStridedDeviceAddressRangeKHR.LAYOUT.withName("addressRange"),
            JAVA_INT.withName("addressFlags"),
            MemoryLayout.paddingLayout(4),
            VkDeviceAddressRangeKHR.LAYOUT.withName("countAddressRange"),
            JAVA_INT.withName("countAddressFlags"),
            JAVA_INT.withName("maxDrawCount")
        ).withName("VkDrawIndirectCount2InfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        ADDRESS_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressFlags"));
        COUNT_ADDRESS_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("countAddressFlags"));
        MAX_DRAW_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDrawCount"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        ADDRESS_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressRange"));
        ADDRESS_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressFlags"));
        COUNT_ADDRESS_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("countAddressRange"));
        COUNT_ADDRESS_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("countAddressFlags"));
        MAX_DRAW_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDrawCount"));
        //@formatter:on
    }

    public VkDrawIndirectCount2InfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkDrawIndirectCount2InfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDrawIndirectCount2InfoKHR(MemorySegment segment) {
        this.segment = segment;
    
        addressRange = new VkStridedDeviceAddressRangeKHR(segment.asSlice(ADDRESS_RANGE_BYTE_OFFSET, VkStridedDeviceAddressRangeKHR.LAYOUT));
        countAddressRange = new VkDeviceAddressRangeKHR(segment.asSlice(COUNT_ADDRESS_RANGE_BYTE_OFFSET, VkDeviceAddressRangeKHR.LAYOUT));
    }

    /// @see #sType()
    public VkDrawIndirectCount2InfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDrawIndirectCount2InfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #addressFlags()
    public VkDrawIndirectCount2InfoKHR addressFlags(int addressFlags) {
    	ADDRESS_FLAGS_HANDLE.set(segment, 0L, addressFlags);
    	return this;
    }
    
    public int addressFlags() {
    	return (int) ADDRESS_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #countAddressFlags()
    public VkDrawIndirectCount2InfoKHR countAddressFlags(int countAddressFlags) {
    	COUNT_ADDRESS_FLAGS_HANDLE.set(segment, 0L, countAddressFlags);
    	return this;
    }
    
    public int countAddressFlags() {
    	return (int) COUNT_ADDRESS_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDrawCount()
    public VkDrawIndirectCount2InfoKHR maxDrawCount(int maxDrawCount) {
    	MAX_DRAW_COUNT_HANDLE.set(segment, 0L, maxDrawCount);
    	return this;
    }
    
    public int maxDrawCount() {
    	return (int) MAX_DRAW_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #addressRange()
    public VkDrawIndirectCount2InfoKHR addressRange(Consumer<VkStridedDeviceAddressRangeKHR> consumer) {
    	consumer.accept(addressRange);
    	return this;
    }
    
    /// @see #addressRange()
    public VkDrawIndirectCount2InfoKHR addressRange(VkStridedDeviceAddressRangeKHR other) {
    	addressRange.set(other);
    	return this;
    }
    
    public VkStridedDeviceAddressRangeKHR addressRange() {
    	return addressRange;
    }
    
    /// @see #countAddressRange()
    public VkDrawIndirectCount2InfoKHR countAddressRange(Consumer<VkDeviceAddressRangeKHR> consumer) {
    	consumer.accept(countAddressRange);
    	return this;
    }
    
    /// @see #countAddressRange()
    public VkDrawIndirectCount2InfoKHR countAddressRange(VkDeviceAddressRangeKHR other) {
    	countAddressRange.set(other);
    	return this;
    }
    
    public VkDeviceAddressRangeKHR countAddressRange() {
    	return countAddressRange;
    }
    
    @Override
    public VkDrawIndirectCount2InfoKHR set(VkDrawIndirectCount2InfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDrawIndirectCount2InfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDrawIndirectCount2InfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDrawIndirectCount2InfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDrawIndirectCount2InfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDrawIndirectCount2InfoKHR> array(Arena arena, VkDrawIndirectCount2InfoKHR... structs) {
        NativeStructArray<VkDrawIndirectCount2InfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDrawIndirectCount2InfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDrawIndirectCount2InfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDrawIndirectCount2InfoKHR(segment)
        );
    }
    
}