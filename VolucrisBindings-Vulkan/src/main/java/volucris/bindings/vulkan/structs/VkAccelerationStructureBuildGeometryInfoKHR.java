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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkAccelerationStructureBuildGeometryInfoKHR
		implements Struct<VkAccelerationStructureBuildGeometryInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TYPE_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle MODE_HANDLE;
	public static final VarHandle SRC_ACCELERATION_STRUCTURE_HANDLE;
	public static final VarHandle DST_ACCELERATION_STRUCTURE_HANDLE;
	public static final VarHandle GEOMETRY_COUNT_HANDLE;
	public static final VarHandle P_GEOMETRIES_HANDLE;
	public static final VarHandle PP_GEOMETRIES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TYPE_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long MODE_BYTE_OFFSET;
	public static final long SRC_ACCELERATION_STRUCTURE_BYTE_OFFSET;
	public static final long DST_ACCELERATION_STRUCTURE_BYTE_OFFSET;
	public static final long GEOMETRY_COUNT_BYTE_OFFSET;
	public static final long P_GEOMETRIES_BYTE_OFFSET;
	public static final long PP_GEOMETRIES_BYTE_OFFSET;
	public static final long SCRATCH_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDeviceOrHostAddressKHR scratchData;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("type"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("mode"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("srcAccelerationStructure"),
		    UNBOUNDED_ADDRESS.withName("dstAccelerationStructure"),
		    JAVA_INT.withName("geometryCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pGeometries"),
		    UNBOUNDED_ADDRESS.withName("ppGeometries"),
		    VkDeviceOrHostAddressKHR.LAYOUT.withName("scratchData")
		).withName("VkAccelerationStructureBuildGeometryInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mode"));
		SRC_ACCELERATION_STRUCTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcAccelerationStructure"));
		DST_ACCELERATION_STRUCTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstAccelerationStructure"));
		GEOMETRY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("geometryCount"));
		P_GEOMETRIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pGeometries"));
		PP_GEOMETRIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ppGeometries"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mode"));
		SRC_ACCELERATION_STRUCTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcAccelerationStructure"));
		DST_ACCELERATION_STRUCTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstAccelerationStructure"));
		GEOMETRY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("geometryCount"));
		P_GEOMETRIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pGeometries"));
		PP_GEOMETRIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ppGeometries"));
		SCRATCH_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scratchData"));
		//@formatter:on
	}

	public VkAccelerationStructureBuildGeometryInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkAccelerationStructureBuildGeometryInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkAccelerationStructureBuildGeometryInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    scratchData = new VkDeviceOrHostAddressKHR(segment.asSlice(SCRATCH_DATA_BYTE_OFFSET, VkDeviceOrHostAddressKHR.LAYOUT));
	}

    /// @see #sType()
    public VkAccelerationStructureBuildGeometryInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureBuildGeometryInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #type()
    public VkAccelerationStructureBuildGeometryInfoKHR type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkAccelerationStructureBuildGeometryInfoKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mode()
    public VkAccelerationStructureBuildGeometryInfoKHR mode(int mode) {
    	MODE_HANDLE.set(segment, 0L, mode);
    	return this;
    }
    
    public int mode() {
    	return (int) MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcAccelerationStructure()
    public VkAccelerationStructureBuildGeometryInfoKHR srcAccelerationStructure(VkAccelerationStructureKHR srcAccelerationStructure) {
    	SRC_ACCELERATION_STRUCTURE_HANDLE.set(segment, 0L, srcAccelerationStructure.memorySegment());
    	return this;
    }
    
    public @Nullable VkAccelerationStructureKHR srcAccelerationStructure() {
    	MemorySegment segment = (MemorySegment) SRC_ACCELERATION_STRUCTURE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkAccelerationStructureKHR(segment);
    }
    
    /// @see #dstAccelerationStructure()
    public VkAccelerationStructureBuildGeometryInfoKHR dstAccelerationStructure(VkAccelerationStructureKHR dstAccelerationStructure) {
    	DST_ACCELERATION_STRUCTURE_HANDLE.set(segment, 0L, dstAccelerationStructure.memorySegment());
    	return this;
    }
    
    public @Nullable VkAccelerationStructureKHR dstAccelerationStructure() {
    	MemorySegment segment = (MemorySegment) DST_ACCELERATION_STRUCTURE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkAccelerationStructureKHR(segment);
    }
    
    /// @see #geometryCount()
    public VkAccelerationStructureBuildGeometryInfoKHR geometryCount(int geometryCount) {
    	GEOMETRY_COUNT_HANDLE.set(segment, 0L, geometryCount);
    	return this;
    }
    
    public int geometryCount() {
    	return (int) GEOMETRY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pGeometries()
    public VkAccelerationStructureBuildGeometryInfoKHR pGeometries(NativeStructArray<VkAccelerationStructureGeometryKHR> pGeometries) {
    	P_GEOMETRIES_HANDLE.set(segment, 0L, pGeometries.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkAccelerationStructureGeometryKHR> pGeometries() {
    	MemorySegment segment = (MemorySegment) P_GEOMETRIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkAccelerationStructureGeometryKHR.array(segment);
    }
    
    /// @see #ppGeometries()
    public VkAccelerationStructureBuildGeometryInfoKHR ppGeometries(NativePointerArray ppGeometries) {
    	PP_GEOMETRIES_HANDLE.set(segment, 0L, ppGeometries.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray ppGeometries() {
    	MemorySegment segment = (MemorySegment) PP_GEOMETRIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #scratchData()
    public VkAccelerationStructureBuildGeometryInfoKHR scratchData(Consumer<VkDeviceOrHostAddressKHR> consumer) {
    	consumer.accept(scratchData);
    	return this;
    }
    
    /// @see #scratchData()
    public VkAccelerationStructureBuildGeometryInfoKHR scratchData(VkDeviceOrHostAddressKHR other) {
    	scratchData.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressKHR scratchData() {
    	return scratchData;
    }
    
    @Override
    public VkAccelerationStructureBuildGeometryInfoKHR set(VkAccelerationStructureBuildGeometryInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureBuildGeometryInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureBuildGeometryInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureBuildGeometryInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAccelerationStructureBuildGeometryInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureBuildGeometryInfoKHR> array(SegmentAllocator allocator, VkAccelerationStructureBuildGeometryInfoKHR... structs) {
        NativeStructArray<VkAccelerationStructureBuildGeometryInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAccelerationStructureBuildGeometryInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureBuildGeometryInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureBuildGeometryInfoKHR(segment)
        );
    }

}