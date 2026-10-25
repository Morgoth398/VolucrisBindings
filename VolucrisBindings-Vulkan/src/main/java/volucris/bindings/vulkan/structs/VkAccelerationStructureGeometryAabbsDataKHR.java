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

public final class VkAccelerationStructureGeometryAabbsDataKHR
		implements Struct<VkAccelerationStructureGeometryAabbsDataKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STRIDE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DATA_BYTE_OFFSET;
	public static final long STRIDE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDeviceOrHostAddressConstKHR data;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data"),
		    JAVA_LONG.withName("stride")
		).withName("VkAccelerationStructureGeometryAabbsDataKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stride"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
		STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stride"));
		//@formatter:on
	}

	public VkAccelerationStructureGeometryAabbsDataKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkAccelerationStructureGeometryAabbsDataKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkAccelerationStructureGeometryAabbsDataKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    data = new VkDeviceOrHostAddressConstKHR(segment.asSlice(DATA_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
	}

    /// @see #sType()
    public VkAccelerationStructureGeometryAabbsDataKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureGeometryAabbsDataKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #data()
    public VkAccelerationStructureGeometryAabbsDataKHR data(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(data);
    	return this;
    }
    
    /// @see #data()
    public VkAccelerationStructureGeometryAabbsDataKHR data(VkDeviceOrHostAddressConstKHR other) {
    	data.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR data() {
    	return data;
    }
    
    /// @see #stride()
    public VkAccelerationStructureGeometryAabbsDataKHR stride(long stride) {
    	STRIDE_HANDLE.set(segment, 0L, stride);
    	return this;
    }
    
    public long stride() {
    	return (long) STRIDE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAccelerationStructureGeometryAabbsDataKHR set(VkAccelerationStructureGeometryAabbsDataKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureGeometryAabbsDataKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureGeometryAabbsDataKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryAabbsDataKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryAabbsDataKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryAabbsDataKHR> array(SegmentAllocator allocator, VkAccelerationStructureGeometryAabbsDataKHR... structs) {
        NativeStructArray<VkAccelerationStructureGeometryAabbsDataKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryAabbsDataKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryAabbsDataKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryAabbsDataKHR(segment)
        );
    }

}