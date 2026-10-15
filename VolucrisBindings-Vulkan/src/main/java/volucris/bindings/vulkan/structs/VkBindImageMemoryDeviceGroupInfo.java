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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkBindImageMemoryDeviceGroupInfo
		implements Struct<VkBindImageMemoryDeviceGroupInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DEVICE_INDEX_COUNT_HANDLE;
	public static final VarHandle P_DEVICE_INDICES_HANDLE;
	public static final VarHandle SPLIT_INSTANCE_BIND_REGION_COUNT_HANDLE;
	public static final VarHandle P_SPLIT_INSTANCE_BIND_REGIONS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DEVICE_INDEX_COUNT_BYTE_OFFSET;
	public static final long P_DEVICE_INDICES_BYTE_OFFSET;
	public static final long SPLIT_INSTANCE_BIND_REGION_COUNT_BYTE_OFFSET;
	public static final long P_SPLIT_INSTANCE_BIND_REGIONS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("deviceIndexCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pDeviceIndices"),
		    JAVA_INT.withName("splitInstanceBindRegionCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pSplitInstanceBindRegions")
		).withName("VkBindImageMemoryDeviceGroupInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DEVICE_INDEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceIndexCount"));
		P_DEVICE_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDeviceIndices"));
		SPLIT_INSTANCE_BIND_REGION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("splitInstanceBindRegionCount"));
		P_SPLIT_INSTANCE_BIND_REGIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSplitInstanceBindRegions"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DEVICE_INDEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceIndexCount"));
		P_DEVICE_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDeviceIndices"));
		SPLIT_INSTANCE_BIND_REGION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("splitInstanceBindRegionCount"));
		P_SPLIT_INSTANCE_BIND_REGIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSplitInstanceBindRegions"));
		//@formatter:on
	}

	public VkBindImageMemoryDeviceGroupInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkBindImageMemoryDeviceGroupInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkBindImageMemoryDeviceGroupInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkBindImageMemoryDeviceGroupInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBindImageMemoryDeviceGroupInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #deviceIndexCount()
    public VkBindImageMemoryDeviceGroupInfo deviceIndexCount(int deviceIndexCount) {
    	DEVICE_INDEX_COUNT_HANDLE.set(segment, 0L, deviceIndexCount);
    	return this;
    }
    
    public int deviceIndexCount() {
    	return (int) DEVICE_INDEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDeviceIndices()
    public VkBindImageMemoryDeviceGroupInfo pDeviceIndices(NativeIntArray pDeviceIndices) {
    	P_DEVICE_INDICES_HANDLE.set(segment, 0L, pDeviceIndices.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pDeviceIndices() {
    	MemorySegment segment = (MemorySegment) P_DEVICE_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #splitInstanceBindRegionCount()
    public VkBindImageMemoryDeviceGroupInfo splitInstanceBindRegionCount(int splitInstanceBindRegionCount) {
    	SPLIT_INSTANCE_BIND_REGION_COUNT_HANDLE.set(segment, 0L, splitInstanceBindRegionCount);
    	return this;
    }
    
    public int splitInstanceBindRegionCount() {
    	return (int) SPLIT_INSTANCE_BIND_REGION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSplitInstanceBindRegions()
    public VkBindImageMemoryDeviceGroupInfo pSplitInstanceBindRegions(NativeStructArray<VkRect2D> pSplitInstanceBindRegions) {
    	P_SPLIT_INSTANCE_BIND_REGIONS_HANDLE.set(segment, 0L, pSplitInstanceBindRegions.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkRect2D> pSplitInstanceBindRegions() {
    	MemorySegment segment = (MemorySegment) P_SPLIT_INSTANCE_BIND_REGIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkRect2D.array(segment);
    }
    
    @Override
    public VkBindImageMemoryDeviceGroupInfo set(VkBindImageMemoryDeviceGroupInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindImageMemoryDeviceGroupInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindImageMemoryDeviceGroupInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindImageMemoryDeviceGroupInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindImageMemoryDeviceGroupInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindImageMemoryDeviceGroupInfo> array(Arena arena, VkBindImageMemoryDeviceGroupInfo... structs) {
        NativeStructArray<VkBindImageMemoryDeviceGroupInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindImageMemoryDeviceGroupInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindImageMemoryDeviceGroupInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindImageMemoryDeviceGroupInfo(segment)
        );
    }

}