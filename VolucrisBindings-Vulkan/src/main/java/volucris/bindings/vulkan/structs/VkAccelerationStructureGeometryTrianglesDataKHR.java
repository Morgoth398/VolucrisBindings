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

public final class VkAccelerationStructureGeometryTrianglesDataKHR
		implements Struct<VkAccelerationStructureGeometryTrianglesDataKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VERTEX_FORMAT_HANDLE;
	public static final VarHandle VERTEX_STRIDE_HANDLE;
	public static final VarHandle MAX_VERTEX_HANDLE;
	public static final VarHandle INDEX_TYPE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VERTEX_FORMAT_BYTE_OFFSET;
	public static final long VERTEX_DATA_BYTE_OFFSET;
	public static final long VERTEX_STRIDE_BYTE_OFFSET;
	public static final long MAX_VERTEX_BYTE_OFFSET;
	public static final long INDEX_TYPE_BYTE_OFFSET;
	public static final long INDEX_DATA_BYTE_OFFSET;
	public static final long TRANSFORM_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDeviceOrHostAddressConstKHR vertexData;
	private final VkDeviceOrHostAddressConstKHR indexData;
	private final VkDeviceOrHostAddressConstKHR transformData;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("vertexFormat"),
		    MemoryLayout.paddingLayout(4),
		    VkDeviceOrHostAddressConstKHR.LAYOUT.withName("vertexData"),
		    JAVA_LONG.withName("vertexStride"),
		    JAVA_INT.withName("maxVertex"),
		    JAVA_INT.withName("indexType"),
		    VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexData"),
		    VkDeviceOrHostAddressConstKHR.LAYOUT.withName("transformData")
		).withName("VkAccelerationStructureGeometryTrianglesDataKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VERTEX_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexFormat"));
		VERTEX_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexStride"));
		MAX_VERTEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxVertex"));
		INDEX_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexType"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VERTEX_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexFormat"));
		VERTEX_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexData"));
		VERTEX_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexStride"));
		MAX_VERTEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxVertex"));
		INDEX_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
		INDEX_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexData"));
		TRANSFORM_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transformData"));
		//@formatter:on
	}

	public VkAccelerationStructureGeometryTrianglesDataKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkAccelerationStructureGeometryTrianglesDataKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkAccelerationStructureGeometryTrianglesDataKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    vertexData = new VkDeviceOrHostAddressConstKHR(segment.asSlice(VERTEX_DATA_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
	    indexData = new VkDeviceOrHostAddressConstKHR(segment.asSlice(INDEX_DATA_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
	    transformData = new VkDeviceOrHostAddressConstKHR(segment.asSlice(TRANSFORM_DATA_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
	}

    /// @see #sType()
    public VkAccelerationStructureGeometryTrianglesDataKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureGeometryTrianglesDataKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #vertexFormat()
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexFormat(int vertexFormat) {
    	VERTEX_FORMAT_HANDLE.set(segment, 0L, vertexFormat);
    	return this;
    }
    
    public int vertexFormat() {
    	return (int) VERTEX_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexData()
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(vertexData);
    	return this;
    }
    
    /// @see #vertexData()
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexData(VkDeviceOrHostAddressConstKHR other) {
    	vertexData.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR vertexData() {
    	return vertexData;
    }
    
    /// @see #vertexStride()
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexStride(long vertexStride) {
    	VERTEX_STRIDE_HANDLE.set(segment, 0L, vertexStride);
    	return this;
    }
    
    public long vertexStride() {
    	return (long) VERTEX_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxVertex()
    public VkAccelerationStructureGeometryTrianglesDataKHR maxVertex(int maxVertex) {
    	MAX_VERTEX_HANDLE.set(segment, 0L, maxVertex);
    	return this;
    }
    
    public int maxVertex() {
    	return (int) MAX_VERTEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexType()
    public VkAccelerationStructureGeometryTrianglesDataKHR indexType(int indexType) {
    	INDEX_TYPE_HANDLE.set(segment, 0L, indexType);
    	return this;
    }
    
    public int indexType() {
    	return (int) INDEX_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexData()
    public VkAccelerationStructureGeometryTrianglesDataKHR indexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(indexData);
    	return this;
    }
    
    /// @see #indexData()
    public VkAccelerationStructureGeometryTrianglesDataKHR indexData(VkDeviceOrHostAddressConstKHR other) {
    	indexData.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR indexData() {
    	return indexData;
    }
    
    /// @see #transformData()
    public VkAccelerationStructureGeometryTrianglesDataKHR transformData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(transformData);
    	return this;
    }
    
    /// @see #transformData()
    public VkAccelerationStructureGeometryTrianglesDataKHR transformData(VkDeviceOrHostAddressConstKHR other) {
    	transformData.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR transformData() {
    	return transformData;
    }
    
    @Override
    public VkAccelerationStructureGeometryTrianglesDataKHR set(VkAccelerationStructureGeometryTrianglesDataKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureGeometryTrianglesDataKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureGeometryTrianglesDataKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryTrianglesDataKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryTrianglesDataKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryTrianglesDataKHR> array(SegmentAllocator allocator, VkAccelerationStructureGeometryTrianglesDataKHR... structs) {
        NativeStructArray<VkAccelerationStructureGeometryTrianglesDataKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryTrianglesDataKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryTrianglesDataKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryTrianglesDataKHR(segment)
        );
    }

}