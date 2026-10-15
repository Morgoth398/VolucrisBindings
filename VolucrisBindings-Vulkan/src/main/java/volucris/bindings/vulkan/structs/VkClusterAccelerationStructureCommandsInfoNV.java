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

public final class VkClusterAccelerationStructureCommandsInfoNV
		implements Struct<VkClusterAccelerationStructureCommandsInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DST_IMPLICIT_DATA_HANDLE;
	public static final VarHandle SCRATCH_DATA_HANDLE;
	public static final VarHandle SRC_INFOS_COUNT_HANDLE;
	public static final VarHandle ADDRESS_RESOLUTION_FLAGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long INPUT_BYTE_OFFSET;
	public static final long DST_IMPLICIT_DATA_BYTE_OFFSET;
	public static final long SCRATCH_DATA_BYTE_OFFSET;
	public static final long DST_ADDRESSES_ARRAY_BYTE_OFFSET;
	public static final long DST_SIZES_ARRAY_BYTE_OFFSET;
	public static final long SRC_INFOS_ARRAY_BYTE_OFFSET;
	public static final long SRC_INFOS_COUNT_BYTE_OFFSET;
	public static final long ADDRESS_RESOLUTION_FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkClusterAccelerationStructureInputInfoNV input;
	private final VkStridedDeviceAddressRegionKHR dstAddressesArray;
	private final VkStridedDeviceAddressRegionKHR dstSizesArray;
	private final VkStridedDeviceAddressRegionKHR srcInfosArray;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkClusterAccelerationStructureInputInfoNV.LAYOUT.withName("input"),
		    JAVA_LONG.withName("dstImplicitData"),
		    JAVA_LONG.withName("scratchData"),
		    VkStridedDeviceAddressRegionKHR.LAYOUT.withName("dstAddressesArray"),
		    VkStridedDeviceAddressRegionKHR.LAYOUT.withName("dstSizesArray"),
		    VkStridedDeviceAddressRegionKHR.LAYOUT.withName("srcInfosArray"),
		    JAVA_LONG.withName("srcInfosCount"),
		    JAVA_INT.withName("addressResolutionFlags"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkClusterAccelerationStructureCommandsInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DST_IMPLICIT_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstImplicitData"));
		SCRATCH_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("scratchData"));
		SRC_INFOS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcInfosCount"));
		ADDRESS_RESOLUTION_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressResolutionFlags"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		INPUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("input"));
		DST_IMPLICIT_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstImplicitData"));
		SCRATCH_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scratchData"));
		DST_ADDRESSES_ARRAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstAddressesArray"));
		DST_SIZES_ARRAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstSizesArray"));
		SRC_INFOS_ARRAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcInfosArray"));
		SRC_INFOS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcInfosCount"));
		ADDRESS_RESOLUTION_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressResolutionFlags"));
		//@formatter:on
	}

	public VkClusterAccelerationStructureCommandsInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkClusterAccelerationStructureCommandsInfoNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkClusterAccelerationStructureCommandsInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	    input = new VkClusterAccelerationStructureInputInfoNV(segment.asSlice(INPUT_BYTE_OFFSET, VkClusterAccelerationStructureInputInfoNV.LAYOUT));
	    dstAddressesArray = new VkStridedDeviceAddressRegionKHR(segment.asSlice(DST_ADDRESSES_ARRAY_BYTE_OFFSET, VkStridedDeviceAddressRegionKHR.LAYOUT));
	    dstSizesArray = new VkStridedDeviceAddressRegionKHR(segment.asSlice(DST_SIZES_ARRAY_BYTE_OFFSET, VkStridedDeviceAddressRegionKHR.LAYOUT));
	    srcInfosArray = new VkStridedDeviceAddressRegionKHR(segment.asSlice(SRC_INFOS_ARRAY_BYTE_OFFSET, VkStridedDeviceAddressRegionKHR.LAYOUT));
	}

    /// @see #sType()
    public VkClusterAccelerationStructureCommandsInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkClusterAccelerationStructureCommandsInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #input()
    public VkClusterAccelerationStructureCommandsInfoNV input(Consumer<VkClusterAccelerationStructureInputInfoNV> consumer) {
    	consumer.accept(input);
    	return this;
    }
    
    /// @see #input()
    public VkClusterAccelerationStructureCommandsInfoNV input(VkClusterAccelerationStructureInputInfoNV other) {
    	input.set(other);
    	return this;
    }
    
    public VkClusterAccelerationStructureInputInfoNV input() {
    	return input;
    }
    
    /// @see #dstImplicitData()
    public VkClusterAccelerationStructureCommandsInfoNV dstImplicitData(long dstImplicitData) {
    	DST_IMPLICIT_DATA_HANDLE.set(segment, 0L, dstImplicitData);
    	return this;
    }
    
    public long dstImplicitData() {
    	return (long) DST_IMPLICIT_DATA_HANDLE.get(segment, 0L);
    }
    
    /// @see #scratchData()
    public VkClusterAccelerationStructureCommandsInfoNV scratchData(long scratchData) {
    	SCRATCH_DATA_HANDLE.set(segment, 0L, scratchData);
    	return this;
    }
    
    public long scratchData() {
    	return (long) SCRATCH_DATA_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstAddressesArray()
    public VkClusterAccelerationStructureCommandsInfoNV dstAddressesArray(Consumer<VkStridedDeviceAddressRegionKHR> consumer) {
    	consumer.accept(dstAddressesArray);
    	return this;
    }
    
    /// @see #dstAddressesArray()
    public VkClusterAccelerationStructureCommandsInfoNV dstAddressesArray(VkStridedDeviceAddressRegionKHR other) {
    	dstAddressesArray.set(other);
    	return this;
    }
    
    public VkStridedDeviceAddressRegionKHR dstAddressesArray() {
    	return dstAddressesArray;
    }
    
    /// @see #dstSizesArray()
    public VkClusterAccelerationStructureCommandsInfoNV dstSizesArray(Consumer<VkStridedDeviceAddressRegionKHR> consumer) {
    	consumer.accept(dstSizesArray);
    	return this;
    }
    
    /// @see #dstSizesArray()
    public VkClusterAccelerationStructureCommandsInfoNV dstSizesArray(VkStridedDeviceAddressRegionKHR other) {
    	dstSizesArray.set(other);
    	return this;
    }
    
    public VkStridedDeviceAddressRegionKHR dstSizesArray() {
    	return dstSizesArray;
    }
    
    /// @see #srcInfosArray()
    public VkClusterAccelerationStructureCommandsInfoNV srcInfosArray(Consumer<VkStridedDeviceAddressRegionKHR> consumer) {
    	consumer.accept(srcInfosArray);
    	return this;
    }
    
    /// @see #srcInfosArray()
    public VkClusterAccelerationStructureCommandsInfoNV srcInfosArray(VkStridedDeviceAddressRegionKHR other) {
    	srcInfosArray.set(other);
    	return this;
    }
    
    public VkStridedDeviceAddressRegionKHR srcInfosArray() {
    	return srcInfosArray;
    }
    
    /// @see #srcInfosCount()
    public VkClusterAccelerationStructureCommandsInfoNV srcInfosCount(long srcInfosCount) {
    	SRC_INFOS_COUNT_HANDLE.set(segment, 0L, srcInfosCount);
    	return this;
    }
    
    public long srcInfosCount() {
    	return (long) SRC_INFOS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #addressResolutionFlags()
    public VkClusterAccelerationStructureCommandsInfoNV addressResolutionFlags(int addressResolutionFlags) {
    	ADDRESS_RESOLUTION_FLAGS_HANDLE.set(segment, 0L, addressResolutionFlags);
    	return this;
    }
    
    public int addressResolutionFlags() {
    	return (int) ADDRESS_RESOLUTION_FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkClusterAccelerationStructureCommandsInfoNV set(VkClusterAccelerationStructureCommandsInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkClusterAccelerationStructureCommandsInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkClusterAccelerationStructureCommandsInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureCommandsInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureCommandsInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureCommandsInfoNV> array(Arena arena, VkClusterAccelerationStructureCommandsInfoNV... structs) {
        NativeStructArray<VkClusterAccelerationStructureCommandsInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureCommandsInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureCommandsInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureCommandsInfoNV(segment)
        );
    }

}