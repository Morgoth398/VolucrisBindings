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

public final class VkAccelerationStructureGeometryInstancesDataKHR
		implements Struct<VkAccelerationStructureGeometryInstancesDataKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ARRAY_OF_POINTERS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ARRAY_OF_POINTERS_BYTE_OFFSET;
	public static final long DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDeviceOrHostAddressConstKHR data;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("arrayOfPointers"),
		    MemoryLayout.paddingLayout(4),
		    VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data")
		).withName("VkAccelerationStructureGeometryInstancesDataKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ARRAY_OF_POINTERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("arrayOfPointers"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ARRAY_OF_POINTERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("arrayOfPointers"));
		DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
		//@formatter:on
	}

	public VkAccelerationStructureGeometryInstancesDataKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkAccelerationStructureGeometryInstancesDataKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkAccelerationStructureGeometryInstancesDataKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    data = new VkDeviceOrHostAddressConstKHR(segment.asSlice(DATA_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
	}

    /// @see #sType()
    public VkAccelerationStructureGeometryInstancesDataKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureGeometryInstancesDataKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #arrayOfPointers()
    public VkAccelerationStructureGeometryInstancesDataKHR arrayOfPointers(int arrayOfPointers) {
    	ARRAY_OF_POINTERS_HANDLE.set(segment, 0L, arrayOfPointers);
    	return this;
    }
    
    public int arrayOfPointers() {
    	return (int) ARRAY_OF_POINTERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #data()
    public VkAccelerationStructureGeometryInstancesDataKHR data(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(data);
    	return this;
    }
    
    /// @see #data()
    public VkAccelerationStructureGeometryInstancesDataKHR data(VkDeviceOrHostAddressConstKHR other) {
    	data.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR data() {
    	return data;
    }
    
    @Override
    public VkAccelerationStructureGeometryInstancesDataKHR set(VkAccelerationStructureGeometryInstancesDataKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureGeometryInstancesDataKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureGeometryInstancesDataKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryInstancesDataKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryInstancesDataKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryInstancesDataKHR> array(Arena arena, VkAccelerationStructureGeometryInstancesDataKHR... structs) {
        NativeStructArray<VkAccelerationStructureGeometryInstancesDataKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryInstancesDataKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryInstancesDataKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryInstancesDataKHR(segment)
        );
    }

}