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

public final class VkAccelerationStructureGeometryLinearSweptSpheresDataNV
		implements Struct<VkAccelerationStructureGeometryLinearSweptSpheresDataNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle VERTEX_FORMAT_HANDLE;
    public static final VarHandle VERTEX_STRIDE_HANDLE;
    public static final VarHandle RADIUS_FORMAT_HANDLE;
    public static final VarHandle RADIUS_STRIDE_HANDLE;
    public static final VarHandle INDEX_TYPE_HANDLE;
    public static final VarHandle INDEX_STRIDE_HANDLE;
    public static final VarHandle INDEXING_MODE_HANDLE;
    public static final VarHandle END_CAPS_MODE_HANDLE;

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
    public static final long INDEXING_MODE_BYTE_OFFSET;
    public static final long END_CAPS_MODE_BYTE_OFFSET;

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
            JAVA_LONG.withName("indexStride"),
            JAVA_INT.withName("indexingMode"),
            JAVA_INT.withName("endCapsMode")
        ).withName("VkAccelerationStructureGeometryLinearSweptSpheresDataNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        VERTEX_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexFormat"));
        VERTEX_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexStride"));
        RADIUS_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("radiusFormat"));
        RADIUS_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("radiusStride"));
        INDEX_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexType"));
        INDEX_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexStride"));
        INDEXING_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexingMode"));
        END_CAPS_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("endCapsMode"));
        
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
        INDEXING_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexingMode"));
        END_CAPS_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("endCapsMode"));
        //@formatter:on
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV() {
        this(Arena.ofAuto());
    }
    
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV(MemorySegment segment) {
        this.segment = segment;
    
        vertexData = new VkDeviceOrHostAddressConstKHR(segment.asSlice(VERTEX_DATA_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
        radiusData = new VkDeviceOrHostAddressConstKHR(segment.asSlice(RADIUS_DATA_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
        indexData = new VkDeviceOrHostAddressConstKHR(segment.asSlice(INDEX_DATA_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
    }

    /// @see #sType()
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV pNext(MemorySegment pNext) {
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
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexFormat(int vertexFormat) {
    	VERTEX_FORMAT_HANDLE.set(segment, 0L, vertexFormat);
    	return this;
    }
    
    public int vertexFormat() {
    	return (int) VERTEX_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexStride()
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexStride(long vertexStride) {
    	VERTEX_STRIDE_HANDLE.set(segment, 0L, vertexStride);
    	return this;
    }
    
    public long vertexStride() {
    	return (long) VERTEX_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #radiusFormat()
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusFormat(int radiusFormat) {
    	RADIUS_FORMAT_HANDLE.set(segment, 0L, radiusFormat);
    	return this;
    }
    
    public int radiusFormat() {
    	return (int) RADIUS_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #radiusStride()
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusStride(long radiusStride) {
    	RADIUS_STRIDE_HANDLE.set(segment, 0L, radiusStride);
    	return this;
    }
    
    public long radiusStride() {
    	return (long) RADIUS_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexType()
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexType(int indexType) {
    	INDEX_TYPE_HANDLE.set(segment, 0L, indexType);
    	return this;
    }
    
    public int indexType() {
    	return (int) INDEX_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexStride()
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexStride(long indexStride) {
    	INDEX_STRIDE_HANDLE.set(segment, 0L, indexStride);
    	return this;
    }
    
    public long indexStride() {
    	return (long) INDEX_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexingMode()
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexingMode(int indexingMode) {
    	INDEXING_MODE_HANDLE.set(segment, 0L, indexingMode);
    	return this;
    }
    
    public int indexingMode() {
    	return (int) INDEXING_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #endCapsMode()
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV endCapsMode(int endCapsMode) {
    	END_CAPS_MODE_HANDLE.set(segment, 0L, endCapsMode);
    	return this;
    }
    
    public int endCapsMode() {
    	return (int) END_CAPS_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexData()
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(vertexData);
    	return this;
    }
    
    /// @see #vertexData()
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexData(VkDeviceOrHostAddressConstKHR other) {
    	vertexData.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR vertexData() {
    	return vertexData;
    }
    
    /// @see #radiusData()
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(radiusData);
    	return this;
    }
    
    /// @see #radiusData()
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusData(VkDeviceOrHostAddressConstKHR other) {
    	radiusData.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR radiusData() {
    	return radiusData;
    }
    
    /// @see #indexData()
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(indexData);
    	return this;
    }
    
    /// @see #indexData()
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexData(VkDeviceOrHostAddressConstKHR other) {
    	indexData.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR indexData() {
    	return indexData;
    }
    
    @Override
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV set(VkAccelerationStructureGeometryLinearSweptSpheresDataNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureGeometryLinearSweptSpheresDataNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryLinearSweptSpheresDataNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryLinearSweptSpheresDataNV> array(Arena arena, VkAccelerationStructureGeometryLinearSweptSpheresDataNV... structs) {
        NativeStructArray<VkAccelerationStructureGeometryLinearSweptSpheresDataNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryLinearSweptSpheresDataNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(segment)
        );
    }
    
}