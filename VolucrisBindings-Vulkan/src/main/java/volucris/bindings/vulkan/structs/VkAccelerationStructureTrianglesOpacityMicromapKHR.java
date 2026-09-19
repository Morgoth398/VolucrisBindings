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

public final class VkAccelerationStructureTrianglesOpacityMicromapKHR
		implements Struct<VkAccelerationStructureTrianglesOpacityMicromapKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle INDEX_TYPE_HANDLE;
    public static final VarHandle INDEX_BUFFER_HANDLE;
    public static final VarHandle INDEX_STRIDE_HANDLE;
    public static final VarHandle BASE_TRIANGLE_HANDLE;
    public static final VarHandle MICROMAP_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long INDEX_TYPE_BYTE_OFFSET;
    public static final long INDEX_BUFFER_BYTE_OFFSET;
    public static final long INDEX_STRIDE_BYTE_OFFSET;
    public static final long BASE_TRIANGLE_BYTE_OFFSET;
    public static final long MICROMAP_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("indexType"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("indexBuffer"),
            JAVA_LONG.withName("indexStride"),
            JAVA_INT.withName("baseTriangle"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("micromap")
        ).withName("VkAccelerationStructureTrianglesOpacityMicromapKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        INDEX_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexType"));
        INDEX_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexBuffer"));
        INDEX_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexStride"));
        BASE_TRIANGLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("baseTriangle"));
        MICROMAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("micromap"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        INDEX_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
        INDEX_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexBuffer"));
        INDEX_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexStride"));
        BASE_TRIANGLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseTriangle"));
        MICROMAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("micromap"));
        //@formatter:on
    }

    public VkAccelerationStructureTrianglesOpacityMicromapKHR() {
        this(Arena.ofAuto());
    }
    
    public VkAccelerationStructureTrianglesOpacityMicromapKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkAccelerationStructureTrianglesOpacityMicromapKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkAccelerationStructureTrianglesOpacityMicromapKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureTrianglesOpacityMicromapKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #indexType()
    public VkAccelerationStructureTrianglesOpacityMicromapKHR indexType(int indexType) {
    	INDEX_TYPE_HANDLE.set(segment, 0L, indexType);
    	return this;
    }
    
    public int indexType() {
    	return (int) INDEX_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexBuffer()
    public VkAccelerationStructureTrianglesOpacityMicromapKHR indexBuffer(long indexBuffer) {
    	INDEX_BUFFER_HANDLE.set(segment, 0L, indexBuffer);
    	return this;
    }
    
    public long indexBuffer() {
    	return (long) INDEX_BUFFER_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexStride()
    public VkAccelerationStructureTrianglesOpacityMicromapKHR indexStride(long indexStride) {
    	INDEX_STRIDE_HANDLE.set(segment, 0L, indexStride);
    	return this;
    }
    
    public long indexStride() {
    	return (long) INDEX_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #baseTriangle()
    public VkAccelerationStructureTrianglesOpacityMicromapKHR baseTriangle(int baseTriangle) {
    	BASE_TRIANGLE_HANDLE.set(segment, 0L, baseTriangle);
    	return this;
    }
    
    public int baseTriangle() {
    	return (int) BASE_TRIANGLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #micromap()
    public VkAccelerationStructureTrianglesOpacityMicromapKHR micromap(VkAccelerationStructureKHR micromap) {
    	MICROMAP_HANDLE.set(segment, 0L, micromap.memorySegment());
    	return this;
    }
    
    public @Nullable VkAccelerationStructureKHR micromap() {
    	MemorySegment segment = (MemorySegment) MICROMAP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkAccelerationStructureKHR(segment);
    }
    
    @Override
    public VkAccelerationStructureTrianglesOpacityMicromapKHR set(VkAccelerationStructureTrianglesOpacityMicromapKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureTrianglesOpacityMicromapKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureTrianglesOpacityMicromapKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureTrianglesOpacityMicromapKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureTrianglesOpacityMicromapKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureTrianglesOpacityMicromapKHR> array(Arena arena, VkAccelerationStructureTrianglesOpacityMicromapKHR... structs) {
        NativeStructArray<VkAccelerationStructureTrianglesOpacityMicromapKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureTrianglesOpacityMicromapKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureTrianglesOpacityMicromapKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureTrianglesOpacityMicromapKHR(segment)
        );
    }
    
}