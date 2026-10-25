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

public final class VkDirectDriverLoadingListLUNARG
		implements Struct<VkDirectDriverLoadingListLUNARG> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MODE_HANDLE;
	public static final VarHandle DRIVER_COUNT_HANDLE;
	public static final VarHandle P_DRIVERS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MODE_BYTE_OFFSET;
	public static final long DRIVER_COUNT_BYTE_OFFSET;
	public static final long P_DRIVERS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("mode"),
		    JAVA_INT.withName("driverCount"),
		    UNBOUNDED_ADDRESS.withName("pDrivers")
		).withName("VkDirectDriverLoadingListLUNARG").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mode"));
		DRIVER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("driverCount"));
		P_DRIVERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDrivers"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mode"));
		DRIVER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("driverCount"));
		P_DRIVERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDrivers"));
		//@formatter:on
	}

	public VkDirectDriverLoadingListLUNARG() {
	    this(Arena.ofAuto());
	}
	
	public VkDirectDriverLoadingListLUNARG(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDirectDriverLoadingListLUNARG(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDirectDriverLoadingListLUNARG sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDirectDriverLoadingListLUNARG pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #mode()
    public VkDirectDriverLoadingListLUNARG mode(int mode) {
    	MODE_HANDLE.set(segment, 0L, mode);
    	return this;
    }
    
    public int mode() {
    	return (int) MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #driverCount()
    public VkDirectDriverLoadingListLUNARG driverCount(int driverCount) {
    	DRIVER_COUNT_HANDLE.set(segment, 0L, driverCount);
    	return this;
    }
    
    public int driverCount() {
    	return (int) DRIVER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDrivers()
    public VkDirectDriverLoadingListLUNARG pDrivers(NativeStructArray<VkDirectDriverLoadingInfoLUNARG> pDrivers) {
    	P_DRIVERS_HANDLE.set(segment, 0L, pDrivers.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDirectDriverLoadingInfoLUNARG> pDrivers() {
    	MemorySegment segment = (MemorySegment) P_DRIVERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDirectDriverLoadingInfoLUNARG.array(segment);
    }
    
    @Override
    public VkDirectDriverLoadingListLUNARG set(VkDirectDriverLoadingListLUNARG other) {
        return set(other.segment);
    }
    
    @Override
    public VkDirectDriverLoadingListLUNARG set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDirectDriverLoadingListLUNARG> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDirectDriverLoadingListLUNARG> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDirectDriverLoadingListLUNARG(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDirectDriverLoadingListLUNARG> array(SegmentAllocator allocator, VkDirectDriverLoadingListLUNARG... structs) {
        NativeStructArray<VkDirectDriverLoadingListLUNARG> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDirectDriverLoadingListLUNARG(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDirectDriverLoadingListLUNARG> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDirectDriverLoadingListLUNARG(segment)
        );
    }

}