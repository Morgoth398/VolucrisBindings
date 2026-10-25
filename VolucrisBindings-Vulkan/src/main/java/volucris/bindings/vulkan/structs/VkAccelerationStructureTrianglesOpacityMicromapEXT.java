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

public final class VkAccelerationStructureTrianglesOpacityMicromapEXT
		implements Struct<VkAccelerationStructureTrianglesOpacityMicromapEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle INDEX_TYPE_HANDLE;
	public static final VarHandle INDEX_STRIDE_HANDLE;
	public static final VarHandle BASE_TRIANGLE_HANDLE;
	public static final VarHandle USAGE_COUNTS_COUNT_HANDLE;
	public static final VarHandle P_USAGE_COUNTS_HANDLE;
	public static final VarHandle PP_USAGE_COUNTS_HANDLE;
	public static final VarHandle MICROMAP_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long INDEX_TYPE_BYTE_OFFSET;
	public static final long INDEX_BUFFER_BYTE_OFFSET;
	public static final long INDEX_STRIDE_BYTE_OFFSET;
	public static final long BASE_TRIANGLE_BYTE_OFFSET;
	public static final long USAGE_COUNTS_COUNT_BYTE_OFFSET;
	public static final long P_USAGE_COUNTS_BYTE_OFFSET;
	public static final long PP_USAGE_COUNTS_BYTE_OFFSET;
	public static final long MICROMAP_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDeviceOrHostAddressConstKHR indexBuffer;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("indexType"),
		    MemoryLayout.paddingLayout(4),
		    VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexBuffer"),
		    JAVA_LONG.withName("indexStride"),
		    JAVA_INT.withName("baseTriangle"),
		    JAVA_INT.withName("usageCountsCount"),
		    UNBOUNDED_ADDRESS.withName("pUsageCounts"),
		    UNBOUNDED_ADDRESS.withName("ppUsageCounts"),
		    UNBOUNDED_ADDRESS.withName("micromap")
		).withName("VkAccelerationStructureTrianglesOpacityMicromapEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		INDEX_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexType"));
		INDEX_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexStride"));
		BASE_TRIANGLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("baseTriangle"));
		USAGE_COUNTS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usageCountsCount"));
		P_USAGE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUsageCounts"));
		PP_USAGE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ppUsageCounts"));
		MICROMAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("micromap"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		INDEX_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexType"));
		INDEX_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexBuffer"));
		INDEX_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexStride"));
		BASE_TRIANGLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseTriangle"));
		USAGE_COUNTS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usageCountsCount"));
		P_USAGE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUsageCounts"));
		PP_USAGE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ppUsageCounts"));
		MICROMAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("micromap"));
		//@formatter:on
	}

	public VkAccelerationStructureTrianglesOpacityMicromapEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkAccelerationStructureTrianglesOpacityMicromapEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkAccelerationStructureTrianglesOpacityMicromapEXT(MemorySegment segment) {
	    this.segment = segment;
	
	    indexBuffer = new VkDeviceOrHostAddressConstKHR(segment.asSlice(INDEX_BUFFER_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
	}

    /// @see #sType()
    public VkAccelerationStructureTrianglesOpacityMicromapEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureTrianglesOpacityMicromapEXT pNext(MemorySegment pNext) {
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
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexType(int indexType) {
    	INDEX_TYPE_HANDLE.set(segment, 0L, indexType);
    	return this;
    }
    
    public int indexType() {
    	return (int) INDEX_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexBuffer()
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexBuffer(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(indexBuffer);
    	return this;
    }
    
    /// @see #indexBuffer()
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexBuffer(VkDeviceOrHostAddressConstKHR other) {
    	indexBuffer.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR indexBuffer() {
    	return indexBuffer;
    }
    
    /// @see #indexStride()
    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexStride(long indexStride) {
    	INDEX_STRIDE_HANDLE.set(segment, 0L, indexStride);
    	return this;
    }
    
    public long indexStride() {
    	return (long) INDEX_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #baseTriangle()
    public VkAccelerationStructureTrianglesOpacityMicromapEXT baseTriangle(int baseTriangle) {
    	BASE_TRIANGLE_HANDLE.set(segment, 0L, baseTriangle);
    	return this;
    }
    
    public int baseTriangle() {
    	return (int) BASE_TRIANGLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #usageCountsCount()
    public VkAccelerationStructureTrianglesOpacityMicromapEXT usageCountsCount(int usageCountsCount) {
    	USAGE_COUNTS_COUNT_HANDLE.set(segment, 0L, usageCountsCount);
    	return this;
    }
    
    public int usageCountsCount() {
    	return (int) USAGE_COUNTS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pUsageCounts()
    public VkAccelerationStructureTrianglesOpacityMicromapEXT pUsageCounts(NativeStructArray<VkMicromapUsageEXT> pUsageCounts) {
    	P_USAGE_COUNTS_HANDLE.set(segment, 0L, pUsageCounts.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkMicromapUsageEXT> pUsageCounts() {
    	MemorySegment segment = (MemorySegment) P_USAGE_COUNTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkMicromapUsageEXT.array(segment);
    }
    
    /// @see #ppUsageCounts()
    public VkAccelerationStructureTrianglesOpacityMicromapEXT ppUsageCounts(NativePointerArray ppUsageCounts) {
    	PP_USAGE_COUNTS_HANDLE.set(segment, 0L, ppUsageCounts.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray ppUsageCounts() {
    	MemorySegment segment = (MemorySegment) PP_USAGE_COUNTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #micromap()
    public VkAccelerationStructureTrianglesOpacityMicromapEXT micromap(VkMicromapEXT micromap) {
    	MICROMAP_HANDLE.set(segment, 0L, micromap.memorySegment());
    	return this;
    }
    
    public @Nullable VkMicromapEXT micromap() {
    	MemorySegment segment = (MemorySegment) MICROMAP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkMicromapEXT(segment);
    }
    
    @Override
    public VkAccelerationStructureTrianglesOpacityMicromapEXT set(VkAccelerationStructureTrianglesOpacityMicromapEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureTrianglesOpacityMicromapEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureTrianglesOpacityMicromapEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureTrianglesOpacityMicromapEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAccelerationStructureTrianglesOpacityMicromapEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureTrianglesOpacityMicromapEXT> array(SegmentAllocator allocator, VkAccelerationStructureTrianglesOpacityMicromapEXT... structs) {
        NativeStructArray<VkAccelerationStructureTrianglesOpacityMicromapEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAccelerationStructureTrianglesOpacityMicromapEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureTrianglesOpacityMicromapEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureTrianglesOpacityMicromapEXT(segment)
        );
    }

}