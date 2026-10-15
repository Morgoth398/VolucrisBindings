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

public final class VkGeometryTrianglesNV
		implements Struct<VkGeometryTrianglesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VERTEX_DATA_HANDLE;
	public static final VarHandle VERTEX_OFFSET_HANDLE;
	public static final VarHandle VERTEX_COUNT_HANDLE;
	public static final VarHandle VERTEX_STRIDE_HANDLE;
	public static final VarHandle VERTEX_FORMAT_HANDLE;
	public static final VarHandle INDEX_DATA_HANDLE;
	public static final VarHandle INDEX_OFFSET_HANDLE;
	public static final VarHandle INDEX_COUNT_HANDLE;
	public static final VarHandle INDEX_TYPE_HANDLE;
	public static final VarHandle TRANSFORM_DATA_HANDLE;
	public static final VarHandle TRANSFORM_OFFSET_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VERTEX_DATA_BYTE_OFFSET;
	public static final long VERTEX_OFFSET_BYTE_OFFSET;
	public static final long VERTEX_COUNT_BYTE_OFFSET;
	public static final long VERTEX_STRIDE_BYTE_OFFSET;
	public static final long VERTEX_FORMAT_BYTE_OFFSET;
	public static final long INDEX_DATA_BYTE_OFFSET;
	public static final long INDEX_OFFSET_BYTE_OFFSET;
	public static final long INDEX_COUNT_BYTE_OFFSET;
	public static final long INDEX_TYPE_BYTE_OFFSET;
	public static final long TRANSFORM_DATA_BYTE_OFFSET;
	public static final long TRANSFORM_OFFSET_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("vertexData"),
		    JAVA_LONG.withName("vertexOffset"),
		    JAVA_INT.withName("vertexCount"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("vertexStride"),
		    JAVA_INT.withName("vertexFormat"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("indexData"),
		    JAVA_LONG.withName("indexOffset"),
		    JAVA_INT.withName("indexCount"),
		    JAVA_INT.withName("indexType"),
		    UNBOUNDED_ADDRESS.withName("transformData"),
		    JAVA_LONG.withName("transformOffset")
		).withName("VkGeometryTrianglesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VERTEX_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexData"));
		VERTEX_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexOffset"));
		VERTEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexCount"));
		VERTEX_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexStride"));
		VERTEX_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexFormat"));
		INDEX_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexData"));
		INDEX_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexOffset"));
		INDEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexCount"));
		INDEX_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexType"));
		TRANSFORM_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transformData"));
		TRANSFORM_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transformOffset"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VERTEX_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexData"));
		VERTEX_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexOffset"));
		VERTEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexCount"));
		VERTEX_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexStride"));
		VERTEX_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexFormat"));
		INDEX_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexData"));
		INDEX_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexOffset"));
		INDEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexCount"));
		INDEX_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
		TRANSFORM_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transformData"));
		TRANSFORM_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transformOffset"));
		//@formatter:on
	}

	public VkGeometryTrianglesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkGeometryTrianglesNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkGeometryTrianglesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkGeometryTrianglesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkGeometryTrianglesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #vertexData()
    public VkGeometryTrianglesNV vertexData(VkBuffer vertexData) {
    	VERTEX_DATA_HANDLE.set(segment, 0L, vertexData.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer vertexData() {
    	MemorySegment segment = (MemorySegment) VERTEX_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    /// @see #vertexOffset()
    public VkGeometryTrianglesNV vertexOffset(long vertexOffset) {
    	VERTEX_OFFSET_HANDLE.set(segment, 0L, vertexOffset);
    	return this;
    }
    
    public long vertexOffset() {
    	return (long) VERTEX_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexCount()
    public VkGeometryTrianglesNV vertexCount(int vertexCount) {
    	VERTEX_COUNT_HANDLE.set(segment, 0L, vertexCount);
    	return this;
    }
    
    public int vertexCount() {
    	return (int) VERTEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexStride()
    public VkGeometryTrianglesNV vertexStride(long vertexStride) {
    	VERTEX_STRIDE_HANDLE.set(segment, 0L, vertexStride);
    	return this;
    }
    
    public long vertexStride() {
    	return (long) VERTEX_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexFormat()
    public VkGeometryTrianglesNV vertexFormat(int vertexFormat) {
    	VERTEX_FORMAT_HANDLE.set(segment, 0L, vertexFormat);
    	return this;
    }
    
    public int vertexFormat() {
    	return (int) VERTEX_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexData()
    public VkGeometryTrianglesNV indexData(VkBuffer indexData) {
    	INDEX_DATA_HANDLE.set(segment, 0L, indexData.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer indexData() {
    	MemorySegment segment = (MemorySegment) INDEX_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    /// @see #indexOffset()
    public VkGeometryTrianglesNV indexOffset(long indexOffset) {
    	INDEX_OFFSET_HANDLE.set(segment, 0L, indexOffset);
    	return this;
    }
    
    public long indexOffset() {
    	return (long) INDEX_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexCount()
    public VkGeometryTrianglesNV indexCount(int indexCount) {
    	INDEX_COUNT_HANDLE.set(segment, 0L, indexCount);
    	return this;
    }
    
    public int indexCount() {
    	return (int) INDEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexType()
    public VkGeometryTrianglesNV indexType(int indexType) {
    	INDEX_TYPE_HANDLE.set(segment, 0L, indexType);
    	return this;
    }
    
    public int indexType() {
    	return (int) INDEX_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #transformData()
    public VkGeometryTrianglesNV transformData(VkBuffer transformData) {
    	TRANSFORM_DATA_HANDLE.set(segment, 0L, transformData.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer transformData() {
    	MemorySegment segment = (MemorySegment) TRANSFORM_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    /// @see #transformOffset()
    public VkGeometryTrianglesNV transformOffset(long transformOffset) {
    	TRANSFORM_OFFSET_HANDLE.set(segment, 0L, transformOffset);
    	return this;
    }
    
    public long transformOffset() {
    	return (long) TRANSFORM_OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkGeometryTrianglesNV set(VkGeometryTrianglesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkGeometryTrianglesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGeometryTrianglesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGeometryTrianglesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeometryTrianglesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGeometryTrianglesNV> array(Arena arena, VkGeometryTrianglesNV... structs) {
        NativeStructArray<VkGeometryTrianglesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeometryTrianglesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGeometryTrianglesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGeometryTrianglesNV(segment)
        );
    }

}