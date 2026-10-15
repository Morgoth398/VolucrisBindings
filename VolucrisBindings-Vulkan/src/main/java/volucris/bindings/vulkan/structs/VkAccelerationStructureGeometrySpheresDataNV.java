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

public final class VkAccelerationStructureGeometrySpheresDataNV
		implements Struct<VkAccelerationStructureGeometrySpheresDataNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VERTEX_FORMAT_HANDLE;
	public static final VarHandle VERTEX_STRIDE_HANDLE;
	public static final VarHandle RADIUS_FORMAT_HANDLE;
	public static final VarHandle RADIUS_STRIDE_HANDLE;
	public static final VarHandle INDEX_TYPE_HANDLE;
	public static final VarHandle INDEX_STRIDE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VERTEX_FORMAT_BYTE_OFFSET;
	public static final long VERTEX_DATA_BYTE_OFFSET;
	public static final long VERTEX_STRIDE_BYTE_OFFSET;
	public static final long RADIUS_FORMAT_BYTE_OFFSET;
	public static final long RADIUS_DATA_BYTE_OFFSET;
	public static final long RADIUS_STRIDE_BYTE_OFFSET;
	public static final long INDEX_TYPE_BYTE_OFFSET;
	public static final long INDEX_DATA_BYTE_OFFSET;
	public static final long INDEX_STRIDE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDeviceOrHostAddressConstKHR vertexData;
	private final VkDeviceOrHostAddressConstKHR radiusData;
	private final VkDeviceOrHostAddressConstKHR indexData;

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
		    JAVA_INT.withName("radiusFormat"),
		    MemoryLayout.paddingLayout(4),
		    VkDeviceOrHostAddressConstKHR.LAYOUT.withName("radiusData"),
		    JAVA_LONG.withName("radiusStride"),
		    JAVA_INT.withName("indexType"),
		    MemoryLayout.paddingLayout(4),
		    VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexData"),
		    JAVA_LONG.withName("indexStride")
		).withName("VkAccelerationStructureGeometrySpheresDataNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VERTEX_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexFormat"));
		VERTEX_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexStride"));
		RADIUS_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("radiusFormat"));
		RADIUS_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("radiusStride"));
		INDEX_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexType"));
		INDEX_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexStride"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VERTEX_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexFormat"));
		VERTEX_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexData"));
		VERTEX_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexStride"));
		RADIUS_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("radiusFormat"));
		RADIUS_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("radiusData"));
		RADIUS_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("radiusStride"));
		INDEX_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
		INDEX_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexData"));
		INDEX_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexStride"));
		//@formatter:on
	}

	public VkAccelerationStructureGeometrySpheresDataNV() {
	    this(Arena.ofAuto());
	}
	
	public VkAccelerationStructureGeometrySpheresDataNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkAccelerationStructureGeometrySpheresDataNV(MemorySegment segment) {
	    this.segment = segment;
	
	    vertexData = new VkDeviceOrHostAddressConstKHR(segment.asSlice(VERTEX_DATA_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
	    radiusData = new VkDeviceOrHostAddressConstKHR(segment.asSlice(RADIUS_DATA_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
	    indexData = new VkDeviceOrHostAddressConstKHR(segment.asSlice(INDEX_DATA_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
	}

    /// @see #sType()
    public VkAccelerationStructureGeometrySpheresDataNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureGeometrySpheresDataNV pNext(MemorySegment pNext) {
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
    public VkAccelerationStructureGeometrySpheresDataNV vertexFormat(int vertexFormat) {
    	VERTEX_FORMAT_HANDLE.set(segment, 0L, vertexFormat);
    	return this;
    }
    
    public int vertexFormat() {
    	return (int) VERTEX_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexData()
    public VkAccelerationStructureGeometrySpheresDataNV vertexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(vertexData);
    	return this;
    }
    
    /// @see #vertexData()
    public VkAccelerationStructureGeometrySpheresDataNV vertexData(VkDeviceOrHostAddressConstKHR other) {
    	vertexData.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR vertexData() {
    	return vertexData;
    }
    
    /// @see #vertexStride()
    public VkAccelerationStructureGeometrySpheresDataNV vertexStride(long vertexStride) {
    	VERTEX_STRIDE_HANDLE.set(segment, 0L, vertexStride);
    	return this;
    }
    
    public long vertexStride() {
    	return (long) VERTEX_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #radiusFormat()
    public VkAccelerationStructureGeometrySpheresDataNV radiusFormat(int radiusFormat) {
    	RADIUS_FORMAT_HANDLE.set(segment, 0L, radiusFormat);
    	return this;
    }
    
    public int radiusFormat() {
    	return (int) RADIUS_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #radiusData()
    public VkAccelerationStructureGeometrySpheresDataNV radiusData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(radiusData);
    	return this;
    }
    
    /// @see #radiusData()
    public VkAccelerationStructureGeometrySpheresDataNV radiusData(VkDeviceOrHostAddressConstKHR other) {
    	radiusData.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR radiusData() {
    	return radiusData;
    }
    
    /// @see #radiusStride()
    public VkAccelerationStructureGeometrySpheresDataNV radiusStride(long radiusStride) {
    	RADIUS_STRIDE_HANDLE.set(segment, 0L, radiusStride);
    	return this;
    }
    
    public long radiusStride() {
    	return (long) RADIUS_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexType()
    public VkAccelerationStructureGeometrySpheresDataNV indexType(int indexType) {
    	INDEX_TYPE_HANDLE.set(segment, 0L, indexType);
    	return this;
    }
    
    public int indexType() {
    	return (int) INDEX_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexData()
    public VkAccelerationStructureGeometrySpheresDataNV indexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(indexData);
    	return this;
    }
    
    /// @see #indexData()
    public VkAccelerationStructureGeometrySpheresDataNV indexData(VkDeviceOrHostAddressConstKHR other) {
    	indexData.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR indexData() {
    	return indexData;
    }
    
    /// @see #indexStride()
    public VkAccelerationStructureGeometrySpheresDataNV indexStride(long indexStride) {
    	INDEX_STRIDE_HANDLE.set(segment, 0L, indexStride);
    	return this;
    }
    
    public long indexStride() {
    	return (long) INDEX_STRIDE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAccelerationStructureGeometrySpheresDataNV set(VkAccelerationStructureGeometrySpheresDataNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureGeometrySpheresDataNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureGeometrySpheresDataNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometrySpheresDataNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometrySpheresDataNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometrySpheresDataNV> array(Arena arena, VkAccelerationStructureGeometrySpheresDataNV... structs) {
        NativeStructArray<VkAccelerationStructureGeometrySpheresDataNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometrySpheresDataNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometrySpheresDataNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometrySpheresDataNV(segment)
        );
    }

}