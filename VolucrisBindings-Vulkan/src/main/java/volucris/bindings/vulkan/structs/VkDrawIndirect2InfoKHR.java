/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
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

public final class VkDrawIndirect2InfoKHR
		implements Struct<VkDrawIndirect2InfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ADDRESS_FLAGS_HANDLE;
	public static final VarHandle DRAW_COUNT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ADDRESS_RANGE_BYTE_OFFSET;
	public static final long ADDRESS_FLAGS_BYTE_OFFSET;
	public static final long DRAW_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkStridedDeviceAddressRangeKHR addressRange;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkStridedDeviceAddressRangeKHR.LAYOUT.withName("addressRange"),
		    JAVA_INT.withName("addressFlags"),
		    JAVA_INT.withName("drawCount")
		).withName("VkDrawIndirect2InfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ADDRESS_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressFlags"));
		DRAW_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawCount"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ADDRESS_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressRange"));
		ADDRESS_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressFlags"));
		DRAW_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawCount"));
		//@formatter:on
	}

	public VkDrawIndirect2InfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkDrawIndirect2InfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDrawIndirect2InfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    addressRange = new VkStridedDeviceAddressRangeKHR(segment.asSlice(ADDRESS_RANGE_BYTE_OFFSET, VkStridedDeviceAddressRangeKHR.LAYOUT));
	}

    /// @see #sType()
    public VkDrawIndirect2InfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDrawIndirect2InfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #addressRange()
    public VkDrawIndirect2InfoKHR addressRange(Consumer<VkStridedDeviceAddressRangeKHR> consumer) {
    	consumer.accept(addressRange);
    	return this;
    }
    
    /// @see #addressRange()
    public VkDrawIndirect2InfoKHR addressRange(VkStridedDeviceAddressRangeKHR other) {
    	addressRange.set(other);
    	return this;
    }
    
    public VkStridedDeviceAddressRangeKHR addressRange() {
    	return addressRange;
    }
    
    /// @see #addressFlags()
    public VkDrawIndirect2InfoKHR addressFlags(int addressFlags) {
    	ADDRESS_FLAGS_HANDLE.set(segment, 0L, addressFlags);
    	return this;
    }
    
    public int addressFlags() {
    	return (int) ADDRESS_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawCount()
    public VkDrawIndirect2InfoKHR drawCount(int drawCount) {
    	DRAW_COUNT_HANDLE.set(segment, 0L, drawCount);
    	return this;
    }
    
    public int drawCount() {
    	return (int) DRAW_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDrawIndirect2InfoKHR set(VkDrawIndirect2InfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDrawIndirect2InfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDrawIndirect2InfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDrawIndirect2InfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDrawIndirect2InfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDrawIndirect2InfoKHR> array(SegmentAllocator allocator, VkDrawIndirect2InfoKHR... structs) {
        NativeStructArray<VkDrawIndirect2InfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDrawIndirect2InfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDrawIndirect2InfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDrawIndirect2InfoKHR(segment)
        );
    }

}