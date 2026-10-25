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

public final class VkMemoryMarkerInfoAMD
		implements Struct<VkMemoryMarkerInfoAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STAGE_HANDLE;
	public static final VarHandle DST_FLAGS_HANDLE;
	public static final VarHandle MARKER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STAGE_BYTE_OFFSET;
	public static final long DST_RANGE_BYTE_OFFSET;
	public static final long DST_FLAGS_BYTE_OFFSET;
	public static final long MARKER_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDeviceAddressRangeKHR dstRange;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("stage"),
		    VkDeviceAddressRangeKHR.LAYOUT.withName("dstRange"),
		    JAVA_INT.withName("dstFlags"),
		    JAVA_INT.withName("marker")
		).withName("VkMemoryMarkerInfoAMD").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stage"));
		DST_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstFlags"));
		MARKER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("marker"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stage"));
		DST_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstRange"));
		DST_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstFlags"));
		MARKER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("marker"));
		//@formatter:on
	}

	public VkMemoryMarkerInfoAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkMemoryMarkerInfoAMD(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkMemoryMarkerInfoAMD(MemorySegment segment) {
	    this.segment = segment;
	
	    dstRange = new VkDeviceAddressRangeKHR(segment.asSlice(DST_RANGE_BYTE_OFFSET, VkDeviceAddressRangeKHR.LAYOUT));
	}

    /// @see #sType()
    public VkMemoryMarkerInfoAMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMemoryMarkerInfoAMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #stage()
    public VkMemoryMarkerInfoAMD stage(long stage) {
    	STAGE_HANDLE.set(segment, 0L, stage);
    	return this;
    }
    
    public long stage() {
    	return (long) STAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstRange()
    public VkMemoryMarkerInfoAMD dstRange(Consumer<VkDeviceAddressRangeKHR> consumer) {
    	consumer.accept(dstRange);
    	return this;
    }
    
    /// @see #dstRange()
    public VkMemoryMarkerInfoAMD dstRange(VkDeviceAddressRangeKHR other) {
    	dstRange.set(other);
    	return this;
    }
    
    public VkDeviceAddressRangeKHR dstRange() {
    	return dstRange;
    }
    
    /// @see #dstFlags()
    public VkMemoryMarkerInfoAMD dstFlags(int dstFlags) {
    	DST_FLAGS_HANDLE.set(segment, 0L, dstFlags);
    	return this;
    }
    
    public int dstFlags() {
    	return (int) DST_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #marker()
    public VkMemoryMarkerInfoAMD marker(int marker) {
    	MARKER_HANDLE.set(segment, 0L, marker);
    	return this;
    }
    
    public int marker() {
    	return (int) MARKER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMemoryMarkerInfoAMD set(VkMemoryMarkerInfoAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkMemoryMarkerInfoAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMemoryMarkerInfoAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMemoryMarkerInfoAMD> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkMemoryMarkerInfoAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMemoryMarkerInfoAMD> array(SegmentAllocator allocator, VkMemoryMarkerInfoAMD... structs) {
        NativeStructArray<VkMemoryMarkerInfoAMD> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkMemoryMarkerInfoAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMemoryMarkerInfoAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMemoryMarkerInfoAMD(segment)
        );
    }

}