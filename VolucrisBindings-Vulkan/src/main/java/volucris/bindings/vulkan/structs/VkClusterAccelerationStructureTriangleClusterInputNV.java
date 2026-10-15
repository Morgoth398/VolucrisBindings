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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkClusterAccelerationStructureTriangleClusterInputNV
		implements Struct<VkClusterAccelerationStructureTriangleClusterInputNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VERTEX_FORMAT_HANDLE;
	public static final VarHandle MAX_GEOMETRY_INDEX_VALUE_HANDLE;
	public static final VarHandle MAX_CLUSTER_UNIQUE_GEOMETRY_COUNT_HANDLE;
	public static final VarHandle MAX_CLUSTER_TRIANGLE_COUNT_HANDLE;
	public static final VarHandle MAX_CLUSTER_VERTEX_COUNT_HANDLE;
	public static final VarHandle MAX_TOTAL_TRIANGLE_COUNT_HANDLE;
	public static final VarHandle MAX_TOTAL_VERTEX_COUNT_HANDLE;
	public static final VarHandle MIN_POSITION_TRUNCATE_BIT_COUNT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VERTEX_FORMAT_BYTE_OFFSET;
	public static final long MAX_GEOMETRY_INDEX_VALUE_BYTE_OFFSET;
	public static final long MAX_CLUSTER_UNIQUE_GEOMETRY_COUNT_BYTE_OFFSET;
	public static final long MAX_CLUSTER_TRIANGLE_COUNT_BYTE_OFFSET;
	public static final long MAX_CLUSTER_VERTEX_COUNT_BYTE_OFFSET;
	public static final long MAX_TOTAL_TRIANGLE_COUNT_BYTE_OFFSET;
	public static final long MAX_TOTAL_VERTEX_COUNT_BYTE_OFFSET;
	public static final long MIN_POSITION_TRUNCATE_BIT_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("vertexFormat"),
		    JAVA_INT.withName("maxGeometryIndexValue"),
		    JAVA_INT.withName("maxClusterUniqueGeometryCount"),
		    JAVA_INT.withName("maxClusterTriangleCount"),
		    JAVA_INT.withName("maxClusterVertexCount"),
		    JAVA_INT.withName("maxTotalTriangleCount"),
		    JAVA_INT.withName("maxTotalVertexCount"),
		    JAVA_INT.withName("minPositionTruncateBitCount")
		).withName("VkClusterAccelerationStructureTriangleClusterInputNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VERTEX_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexFormat"));
		MAX_GEOMETRY_INDEX_VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxGeometryIndexValue"));
		MAX_CLUSTER_UNIQUE_GEOMETRY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxClusterUniqueGeometryCount"));
		MAX_CLUSTER_TRIANGLE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxClusterTriangleCount"));
		MAX_CLUSTER_VERTEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxClusterVertexCount"));
		MAX_TOTAL_TRIANGLE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTotalTriangleCount"));
		MAX_TOTAL_VERTEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTotalVertexCount"));
		MIN_POSITION_TRUNCATE_BIT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minPositionTruncateBitCount"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VERTEX_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexFormat"));
		MAX_GEOMETRY_INDEX_VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryIndexValue"));
		MAX_CLUSTER_UNIQUE_GEOMETRY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxClusterUniqueGeometryCount"));
		MAX_CLUSTER_TRIANGLE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxClusterTriangleCount"));
		MAX_CLUSTER_VERTEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxClusterVertexCount"));
		MAX_TOTAL_TRIANGLE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTotalTriangleCount"));
		MAX_TOTAL_VERTEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTotalVertexCount"));
		MIN_POSITION_TRUNCATE_BIT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minPositionTruncateBitCount"));
		//@formatter:on
	}

	public VkClusterAccelerationStructureTriangleClusterInputNV() {
	    this(Arena.ofAuto());
	}
	
	public VkClusterAccelerationStructureTriangleClusterInputNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkClusterAccelerationStructureTriangleClusterInputNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkClusterAccelerationStructureTriangleClusterInputNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkClusterAccelerationStructureTriangleClusterInputNV pNext(MemorySegment pNext) {
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
    public VkClusterAccelerationStructureTriangleClusterInputNV vertexFormat(int vertexFormat) {
    	VERTEX_FORMAT_HANDLE.set(segment, 0L, vertexFormat);
    	return this;
    }
    
    public int vertexFormat() {
    	return (int) VERTEX_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxGeometryIndexValue()
    public VkClusterAccelerationStructureTriangleClusterInputNV maxGeometryIndexValue(int maxGeometryIndexValue) {
    	MAX_GEOMETRY_INDEX_VALUE_HANDLE.set(segment, 0L, maxGeometryIndexValue);
    	return this;
    }
    
    public int maxGeometryIndexValue() {
    	return (int) MAX_GEOMETRY_INDEX_VALUE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxClusterUniqueGeometryCount()
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterUniqueGeometryCount(int maxClusterUniqueGeometryCount) {
    	MAX_CLUSTER_UNIQUE_GEOMETRY_COUNT_HANDLE.set(segment, 0L, maxClusterUniqueGeometryCount);
    	return this;
    }
    
    public int maxClusterUniqueGeometryCount() {
    	return (int) MAX_CLUSTER_UNIQUE_GEOMETRY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxClusterTriangleCount()
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterTriangleCount(int maxClusterTriangleCount) {
    	MAX_CLUSTER_TRIANGLE_COUNT_HANDLE.set(segment, 0L, maxClusterTriangleCount);
    	return this;
    }
    
    public int maxClusterTriangleCount() {
    	return (int) MAX_CLUSTER_TRIANGLE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxClusterVertexCount()
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterVertexCount(int maxClusterVertexCount) {
    	MAX_CLUSTER_VERTEX_COUNT_HANDLE.set(segment, 0L, maxClusterVertexCount);
    	return this;
    }
    
    public int maxClusterVertexCount() {
    	return (int) MAX_CLUSTER_VERTEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTotalTriangleCount()
    public VkClusterAccelerationStructureTriangleClusterInputNV maxTotalTriangleCount(int maxTotalTriangleCount) {
    	MAX_TOTAL_TRIANGLE_COUNT_HANDLE.set(segment, 0L, maxTotalTriangleCount);
    	return this;
    }
    
    public int maxTotalTriangleCount() {
    	return (int) MAX_TOTAL_TRIANGLE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTotalVertexCount()
    public VkClusterAccelerationStructureTriangleClusterInputNV maxTotalVertexCount(int maxTotalVertexCount) {
    	MAX_TOTAL_VERTEX_COUNT_HANDLE.set(segment, 0L, maxTotalVertexCount);
    	return this;
    }
    
    public int maxTotalVertexCount() {
    	return (int) MAX_TOTAL_VERTEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #minPositionTruncateBitCount()
    public VkClusterAccelerationStructureTriangleClusterInputNV minPositionTruncateBitCount(int minPositionTruncateBitCount) {
    	MIN_POSITION_TRUNCATE_BIT_COUNT_HANDLE.set(segment, 0L, minPositionTruncateBitCount);
    	return this;
    }
    
    public int minPositionTruncateBitCount() {
    	return (int) MIN_POSITION_TRUNCATE_BIT_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkClusterAccelerationStructureTriangleClusterInputNV set(VkClusterAccelerationStructureTriangleClusterInputNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkClusterAccelerationStructureTriangleClusterInputNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkClusterAccelerationStructureTriangleClusterInputNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureTriangleClusterInputNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureTriangleClusterInputNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureTriangleClusterInputNV> array(Arena arena, VkClusterAccelerationStructureTriangleClusterInputNV... structs) {
        NativeStructArray<VkClusterAccelerationStructureTriangleClusterInputNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureTriangleClusterInputNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureTriangleClusterInputNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureTriangleClusterInputNV(segment)
        );
    }

}