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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkAccelerationStructureGeometryMicromapDataKHR
		implements Struct<VkAccelerationStructureGeometryMicromapDataKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle USAGE_COUNTS_COUNT_HANDLE;
    public static final VarHandle P_USAGE_COUNTS_HANDLE;
    public static final VarHandle PP_USAGE_COUNTS_HANDLE;
    public static final VarHandle DATA_HANDLE;
    public static final VarHandle TRIANGLE_ARRAY_HANDLE;
    public static final VarHandle TRIANGLE_ARRAY_STRIDE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long USAGE_COUNTS_COUNT_BYTE_OFFSET;
    public static final long P_USAGE_COUNTS_BYTE_OFFSET;
    public static final long PP_USAGE_COUNTS_BYTE_OFFSET;
    public static final long DATA_BYTE_OFFSET;
    public static final long TRIANGLE_ARRAY_BYTE_OFFSET;
    public static final long TRIANGLE_ARRAY_STRIDE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("usageCountsCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pUsageCounts"),
            UNBOUNDED_ADDRESS.withName("ppUsageCounts"),
            JAVA_LONG.withName("data"),
            JAVA_LONG.withName("triangleArray"),
            JAVA_LONG.withName("triangleArrayStride")
        ).withName("VkAccelerationStructureGeometryMicromapDataKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        USAGE_COUNTS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usageCountsCount"));
        P_USAGE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUsageCounts"));
        PP_USAGE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ppUsageCounts"));
        DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("data"));
        TRIANGLE_ARRAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("triangleArray"));
        TRIANGLE_ARRAY_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("triangleArrayStride"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        USAGE_COUNTS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usageCountsCount"));
        P_USAGE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUsageCounts"));
        PP_USAGE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ppUsageCounts"));
        DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
        TRIANGLE_ARRAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangleArray"));
        TRIANGLE_ARRAY_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangleArrayStride"));
        //@formatter:on
    }

    public VkAccelerationStructureGeometryMicromapDataKHR() {
        this(Arena.ofAuto());
    }
    
    public VkAccelerationStructureGeometryMicromapDataKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkAccelerationStructureGeometryMicromapDataKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkAccelerationStructureGeometryMicromapDataKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureGeometryMicromapDataKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #usageCountsCount()
    public VkAccelerationStructureGeometryMicromapDataKHR usageCountsCount(int usageCountsCount) {
    	USAGE_COUNTS_COUNT_HANDLE.set(segment, 0L, usageCountsCount);
    	return this;
    }
    
    public int usageCountsCount() {
    	return (int) USAGE_COUNTS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pUsageCounts()
    public VkAccelerationStructureGeometryMicromapDataKHR pUsageCounts(NativeStructArray<VkMicromapUsageKHR> pUsageCounts) {
    	P_USAGE_COUNTS_HANDLE.set(segment, 0L, pUsageCounts.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkMicromapUsageKHR> pUsageCounts() {
    	MemorySegment segment = (MemorySegment) P_USAGE_COUNTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkMicromapUsageKHR.array(segment);
    }
    
    /// @see #ppUsageCounts()
    public VkAccelerationStructureGeometryMicromapDataKHR ppUsageCounts(NativePointerArray ppUsageCounts) {
    	PP_USAGE_COUNTS_HANDLE.set(segment, 0L, ppUsageCounts.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray ppUsageCounts() {
    	MemorySegment segment = (MemorySegment) PP_USAGE_COUNTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #data()
    public VkAccelerationStructureGeometryMicromapDataKHR data(long data) {
    	DATA_HANDLE.set(segment, 0L, data);
    	return this;
    }
    
    public long data() {
    	return (long) DATA_HANDLE.get(segment, 0L);
    }
    
    /// @see #triangleArray()
    public VkAccelerationStructureGeometryMicromapDataKHR triangleArray(long triangleArray) {
    	TRIANGLE_ARRAY_HANDLE.set(segment, 0L, triangleArray);
    	return this;
    }
    
    public long triangleArray() {
    	return (long) TRIANGLE_ARRAY_HANDLE.get(segment, 0L);
    }
    
    /// @see #triangleArrayStride()
    public VkAccelerationStructureGeometryMicromapDataKHR triangleArrayStride(long triangleArrayStride) {
    	TRIANGLE_ARRAY_STRIDE_HANDLE.set(segment, 0L, triangleArrayStride);
    	return this;
    }
    
    public long triangleArrayStride() {
    	return (long) TRIANGLE_ARRAY_STRIDE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAccelerationStructureGeometryMicromapDataKHR set(VkAccelerationStructureGeometryMicromapDataKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureGeometryMicromapDataKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureGeometryMicromapDataKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryMicromapDataKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryMicromapDataKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryMicromapDataKHR> array(Arena arena, VkAccelerationStructureGeometryMicromapDataKHR... structs) {
        NativeStructArray<VkAccelerationStructureGeometryMicromapDataKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryMicromapDataKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryMicromapDataKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryMicromapDataKHR(segment)
        );
    }
    
}