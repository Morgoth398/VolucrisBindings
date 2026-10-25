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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkClusterAccelerationStructureBuildTriangleClusterInfoNV
		implements Struct<VkClusterAccelerationStructureBuildTriangleClusterInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CLUSTER_ID_HANDLE;
	public static final VarHandle CLUSTER_FLAGS_HANDLE;
	public static final VarHandle BIT_FIELDS0_HANDLE;
	public static final VarHandle INDEX_BUFFER_STRIDE_HANDLE;
	public static final VarHandle VERTEX_BUFFER_STRIDE_HANDLE;
	public static final VarHandle GEOMETRY_INDEX_AND_FLAGS_BUFFER_STRIDE_HANDLE;
	public static final VarHandle OPACITY_MICROMAP_INDEX_BUFFER_STRIDE_HANDLE;
	public static final VarHandle INDEX_BUFFER_HANDLE;
	public static final VarHandle VERTEX_BUFFER_HANDLE;
	public static final VarHandle GEOMETRY_INDEX_AND_FLAGS_BUFFER_HANDLE;
	public static final VarHandle OPACITY_MICROMAP_ARRAY_HANDLE;
	public static final VarHandle OPACITY_MICROMAP_INDEX_BUFFER_HANDLE;

	public static final long CLUSTER_ID_BYTE_OFFSET;
	public static final long CLUSTER_FLAGS_BYTE_OFFSET;
	public static final long BIT_FIELDS0_BYTE_OFFSET;
	public static final long BASE_GEOMETRY_INDEX_AND_GEOMETRY_FLAGS_BYTE_OFFSET;
	public static final long INDEX_BUFFER_STRIDE_BYTE_OFFSET;
	public static final long VERTEX_BUFFER_STRIDE_BYTE_OFFSET;
	public static final long GEOMETRY_INDEX_AND_FLAGS_BUFFER_STRIDE_BYTE_OFFSET;
	public static final long OPACITY_MICROMAP_INDEX_BUFFER_STRIDE_BYTE_OFFSET;
	public static final long INDEX_BUFFER_BYTE_OFFSET;
	public static final long VERTEX_BUFFER_BYTE_OFFSET;
	public static final long GEOMETRY_INDEX_AND_FLAGS_BUFFER_BYTE_OFFSET;
	public static final long OPACITY_MICROMAP_ARRAY_BYTE_OFFSET;
	public static final long OPACITY_MICROMAP_INDEX_BUFFER_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV baseGeometryIndexAndGeometryFlags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("clusterID"),
		    JAVA_INT.withName("clusterFlags"),
		    JAVA_INT.withName("bitFields0"),
		    VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.LAYOUT.withName("baseGeometryIndexAndGeometryFlags"),
		    JAVA_SHORT.withName("indexBufferStride"),
		    JAVA_SHORT.withName("vertexBufferStride"),
		    JAVA_SHORT.withName("geometryIndexAndFlagsBufferStride"),
		    JAVA_SHORT.withName("opacityMicromapIndexBufferStride"),
		    JAVA_LONG.withName("indexBuffer"),
		    JAVA_LONG.withName("vertexBuffer"),
		    JAVA_LONG.withName("geometryIndexAndFlagsBuffer"),
		    JAVA_LONG.withName("opacityMicromapArray"),
		    JAVA_LONG.withName("opacityMicromapIndexBuffer")
		).withName("VkClusterAccelerationStructureBuildTriangleClusterInfoNV").withByteAlignment(8);
		
		CLUSTER_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clusterID"));
		CLUSTER_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clusterFlags"));
		BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
		INDEX_BUFFER_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexBufferStride"));
		VERTEX_BUFFER_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexBufferStride"));
		GEOMETRY_INDEX_AND_FLAGS_BUFFER_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("geometryIndexAndFlagsBufferStride"));
		OPACITY_MICROMAP_INDEX_BUFFER_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("opacityMicromapIndexBufferStride"));
		INDEX_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexBuffer"));
		VERTEX_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexBuffer"));
		GEOMETRY_INDEX_AND_FLAGS_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("geometryIndexAndFlagsBuffer"));
		OPACITY_MICROMAP_ARRAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("opacityMicromapArray"));
		OPACITY_MICROMAP_INDEX_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("opacityMicromapIndexBuffer"));
		
		CLUSTER_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clusterID"));
		CLUSTER_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clusterFlags"));
		BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
		BASE_GEOMETRY_INDEX_AND_GEOMETRY_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseGeometryIndexAndGeometryFlags"));
		INDEX_BUFFER_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexBufferStride"));
		VERTEX_BUFFER_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexBufferStride"));
		GEOMETRY_INDEX_AND_FLAGS_BUFFER_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("geometryIndexAndFlagsBufferStride"));
		OPACITY_MICROMAP_INDEX_BUFFER_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("opacityMicromapIndexBufferStride"));
		INDEX_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexBuffer"));
		VERTEX_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexBuffer"));
		GEOMETRY_INDEX_AND_FLAGS_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("geometryIndexAndFlagsBuffer"));
		OPACITY_MICROMAP_ARRAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("opacityMicromapArray"));
		OPACITY_MICROMAP_INDEX_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("opacityMicromapIndexBuffer"));
		//@formatter:on
	}

	public VkClusterAccelerationStructureBuildTriangleClusterInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkClusterAccelerationStructureBuildTriangleClusterInfoNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkClusterAccelerationStructureBuildTriangleClusterInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	    baseGeometryIndexAndGeometryFlags = new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(segment.asSlice(BASE_GEOMETRY_INDEX_AND_GEOMETRY_FLAGS_BYTE_OFFSET, VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.LAYOUT));
	}

    /// @see #clusterID()
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV clusterID(int clusterID) {
    	CLUSTER_ID_HANDLE.set(segment, 0L, clusterID);
    	return this;
    }
    
    public int clusterID() {
    	return (int) CLUSTER_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #clusterFlags()
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV clusterFlags(int clusterFlags) {
    	CLUSTER_FLAGS_HANDLE.set(segment, 0L, clusterFlags);
    	return this;
    }
    
    public int clusterFlags() {
    	return (int) CLUSTER_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #bitFields0()
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// triangleCount : 9
    /// vertexCount : 9
    /// positionTruncateBitCount : 6
    /// indexType : 4
    /// opacityMicromapIndexType : 4
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    /// @see #baseGeometryIndexAndGeometryFlags()
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV baseGeometryIndexAndGeometryFlags(Consumer<VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV> consumer) {
    	consumer.accept(baseGeometryIndexAndGeometryFlags);
    	return this;
    }
    
    /// @see #baseGeometryIndexAndGeometryFlags()
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV baseGeometryIndexAndGeometryFlags(VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV other) {
    	baseGeometryIndexAndGeometryFlags.set(other);
    	return this;
    }
    
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV baseGeometryIndexAndGeometryFlags() {
    	return baseGeometryIndexAndGeometryFlags;
    }
    
    /// @see #indexBufferStride()
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV indexBufferStride(short indexBufferStride) {
    	INDEX_BUFFER_STRIDE_HANDLE.set(segment, 0L, indexBufferStride);
    	return this;
    }
    
    public short indexBufferStride() {
    	return (short) INDEX_BUFFER_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexBufferStride()
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV vertexBufferStride(short vertexBufferStride) {
    	VERTEX_BUFFER_STRIDE_HANDLE.set(segment, 0L, vertexBufferStride);
    	return this;
    }
    
    public short vertexBufferStride() {
    	return (short) VERTEX_BUFFER_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #geometryIndexAndFlagsBufferStride()
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV geometryIndexAndFlagsBufferStride(short geometryIndexAndFlagsBufferStride) {
    	GEOMETRY_INDEX_AND_FLAGS_BUFFER_STRIDE_HANDLE.set(segment, 0L, geometryIndexAndFlagsBufferStride);
    	return this;
    }
    
    public short geometryIndexAndFlagsBufferStride() {
    	return (short) GEOMETRY_INDEX_AND_FLAGS_BUFFER_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #opacityMicromapIndexBufferStride()
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapIndexBufferStride(short opacityMicromapIndexBufferStride) {
    	OPACITY_MICROMAP_INDEX_BUFFER_STRIDE_HANDLE.set(segment, 0L, opacityMicromapIndexBufferStride);
    	return this;
    }
    
    public short opacityMicromapIndexBufferStride() {
    	return (short) OPACITY_MICROMAP_INDEX_BUFFER_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexBuffer()
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV indexBuffer(long indexBuffer) {
    	INDEX_BUFFER_HANDLE.set(segment, 0L, indexBuffer);
    	return this;
    }
    
    public long indexBuffer() {
    	return (long) INDEX_BUFFER_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexBuffer()
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV vertexBuffer(long vertexBuffer) {
    	VERTEX_BUFFER_HANDLE.set(segment, 0L, vertexBuffer);
    	return this;
    }
    
    public long vertexBuffer() {
    	return (long) VERTEX_BUFFER_HANDLE.get(segment, 0L);
    }
    
    /// @see #geometryIndexAndFlagsBuffer()
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV geometryIndexAndFlagsBuffer(long geometryIndexAndFlagsBuffer) {
    	GEOMETRY_INDEX_AND_FLAGS_BUFFER_HANDLE.set(segment, 0L, geometryIndexAndFlagsBuffer);
    	return this;
    }
    
    public long geometryIndexAndFlagsBuffer() {
    	return (long) GEOMETRY_INDEX_AND_FLAGS_BUFFER_HANDLE.get(segment, 0L);
    }
    
    /// @see #opacityMicromapArray()
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapArray(long opacityMicromapArray) {
    	OPACITY_MICROMAP_ARRAY_HANDLE.set(segment, 0L, opacityMicromapArray);
    	return this;
    }
    
    public long opacityMicromapArray() {
    	return (long) OPACITY_MICROMAP_ARRAY_HANDLE.get(segment, 0L);
    }
    
    /// @see #opacityMicromapIndexBuffer()
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapIndexBuffer(long opacityMicromapIndexBuffer) {
    	OPACITY_MICROMAP_INDEX_BUFFER_HANDLE.set(segment, 0L, opacityMicromapIndexBuffer);
    	return this;
    }
    
    public long opacityMicromapIndexBuffer() {
    	return (long) OPACITY_MICROMAP_INDEX_BUFFER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV set(VkClusterAccelerationStructureBuildTriangleClusterInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkClusterAccelerationStructureBuildTriangleClusterInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureBuildTriangleClusterInfoNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureBuildTriangleClusterInfoNV> array(SegmentAllocator allocator, VkClusterAccelerationStructureBuildTriangleClusterInfoNV... structs) {
        NativeStructArray<VkClusterAccelerationStructureBuildTriangleClusterInfoNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureBuildTriangleClusterInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(segment)
        );
    }

}