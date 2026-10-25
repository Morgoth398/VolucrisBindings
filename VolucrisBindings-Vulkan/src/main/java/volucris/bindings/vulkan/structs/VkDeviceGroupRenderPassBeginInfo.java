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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkDeviceGroupRenderPassBeginInfo
		implements Struct<VkDeviceGroupRenderPassBeginInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DEVICE_MASK_HANDLE;
	public static final VarHandle DEVICE_RENDER_AREA_COUNT_HANDLE;
	public static final VarHandle P_DEVICE_RENDER_AREAS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DEVICE_MASK_BYTE_OFFSET;
	public static final long DEVICE_RENDER_AREA_COUNT_BYTE_OFFSET;
	public static final long P_DEVICE_RENDER_AREAS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("deviceMask"),
		    JAVA_INT.withName("deviceRenderAreaCount"),
		    UNBOUNDED_ADDRESS.withName("pDeviceRenderAreas")
		).withName("VkDeviceGroupRenderPassBeginInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DEVICE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceMask"));
		DEVICE_RENDER_AREA_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceRenderAreaCount"));
		P_DEVICE_RENDER_AREAS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDeviceRenderAreas"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DEVICE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceMask"));
		DEVICE_RENDER_AREA_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceRenderAreaCount"));
		P_DEVICE_RENDER_AREAS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDeviceRenderAreas"));
		//@formatter:on
	}

	public VkDeviceGroupRenderPassBeginInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceGroupRenderPassBeginInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDeviceGroupRenderPassBeginInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDeviceGroupRenderPassBeginInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceGroupRenderPassBeginInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #deviceMask()
    public VkDeviceGroupRenderPassBeginInfo deviceMask(int deviceMask) {
    	DEVICE_MASK_HANDLE.set(segment, 0L, deviceMask);
    	return this;
    }
    
    public int deviceMask() {
    	return (int) DEVICE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceRenderAreaCount()
    public VkDeviceGroupRenderPassBeginInfo deviceRenderAreaCount(int deviceRenderAreaCount) {
    	DEVICE_RENDER_AREA_COUNT_HANDLE.set(segment, 0L, deviceRenderAreaCount);
    	return this;
    }
    
    public int deviceRenderAreaCount() {
    	return (int) DEVICE_RENDER_AREA_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDeviceRenderAreas()
    public VkDeviceGroupRenderPassBeginInfo pDeviceRenderAreas(NativeStructArray<VkRect2D> pDeviceRenderAreas) {
    	P_DEVICE_RENDER_AREAS_HANDLE.set(segment, 0L, pDeviceRenderAreas.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkRect2D> pDeviceRenderAreas() {
    	MemorySegment segment = (MemorySegment) P_DEVICE_RENDER_AREAS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkRect2D.array(segment);
    }
    
    @Override
    public VkDeviceGroupRenderPassBeginInfo set(VkDeviceGroupRenderPassBeginInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceGroupRenderPassBeginInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceGroupRenderPassBeginInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceGroupRenderPassBeginInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceGroupRenderPassBeginInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceGroupRenderPassBeginInfo> array(SegmentAllocator allocator, VkDeviceGroupRenderPassBeginInfo... structs) {
        NativeStructArray<VkDeviceGroupRenderPassBeginInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceGroupRenderPassBeginInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceGroupRenderPassBeginInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceGroupRenderPassBeginInfo(segment)
        );
    }

}