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

public final class VkPhysicalDevicePerformanceCountersByRegionPropertiesARM
		implements Struct<VkPhysicalDevicePerformanceCountersByRegionPropertiesARM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_PER_REGION_PERFORMANCE_COUNTERS_HANDLE;
    public static final VarHandle ROW_STRIDE_ALIGNMENT_HANDLE;
    public static final VarHandle REGION_ALIGNMENT_HANDLE;
    public static final VarHandle IDENTITY_TRANSFORM_ORDER_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_PER_REGION_PERFORMANCE_COUNTERS_BYTE_OFFSET;
    public static final long PERFORMANCE_COUNTER_REGION_SIZE_BYTE_OFFSET;
    public static final long ROW_STRIDE_ALIGNMENT_BYTE_OFFSET;
    public static final long REGION_ALIGNMENT_BYTE_OFFSET;
    public static final long IDENTITY_TRANSFORM_ORDER_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkExtent2D performanceCounterRegionSize;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxPerRegionPerformanceCounters"),
            VkExtent2D.LAYOUT.withName("performanceCounterRegionSize"),
            JAVA_INT.withName("rowStrideAlignment"),
            JAVA_INT.withName("regionAlignment"),
            JAVA_INT.withName("identityTransformOrder")
        ).withName("VkPhysicalDevicePerformanceCountersByRegionPropertiesARM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_PER_REGION_PERFORMANCE_COUNTERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerRegionPerformanceCounters"));
        ROW_STRIDE_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rowStrideAlignment"));
        REGION_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("regionAlignment"));
        IDENTITY_TRANSFORM_ORDER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("identityTransformOrder"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_PER_REGION_PERFORMANCE_COUNTERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerRegionPerformanceCounters"));
        PERFORMANCE_COUNTER_REGION_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("performanceCounterRegionSize"));
        ROW_STRIDE_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rowStrideAlignment"));
        REGION_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("regionAlignment"));
        IDENTITY_TRANSFORM_ORDER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("identityTransformOrder"));
        //@formatter:on
    }

    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(MemorySegment segment) {
        this.segment = segment;
    
        performanceCounterRegionSize = new VkExtent2D(segment.asSlice(PERFORMANCE_COUNTER_REGION_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #sType()
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxPerRegionPerformanceCounters()
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM maxPerRegionPerformanceCounters(int maxPerRegionPerformanceCounters) {
    	MAX_PER_REGION_PERFORMANCE_COUNTERS_HANDLE.set(segment, 0L, maxPerRegionPerformanceCounters);
    	return this;
    }
    
    public int maxPerRegionPerformanceCounters() {
    	return (int) MAX_PER_REGION_PERFORMANCE_COUNTERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #rowStrideAlignment()
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM rowStrideAlignment(int rowStrideAlignment) {
    	ROW_STRIDE_ALIGNMENT_HANDLE.set(segment, 0L, rowStrideAlignment);
    	return this;
    }
    
    public int rowStrideAlignment() {
    	return (int) ROW_STRIDE_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #regionAlignment()
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM regionAlignment(int regionAlignment) {
    	REGION_ALIGNMENT_HANDLE.set(segment, 0L, regionAlignment);
    	return this;
    }
    
    public int regionAlignment() {
    	return (int) REGION_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #identityTransformOrder()
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM identityTransformOrder(int identityTransformOrder) {
    	IDENTITY_TRANSFORM_ORDER_HANDLE.set(segment, 0L, identityTransformOrder);
    	return this;
    }
    
    public int identityTransformOrder() {
    	return (int) IDENTITY_TRANSFORM_ORDER_HANDLE.get(segment, 0L);
    }
    
    /// @see #performanceCounterRegionSize()
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM performanceCounterRegionSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(performanceCounterRegionSize);
    	return this;
    }
    
    /// @see #performanceCounterRegionSize()
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM performanceCounterRegionSize(VkExtent2D other) {
    	performanceCounterRegionSize.set(other);
    	return this;
    }
    
    public VkExtent2D performanceCounterRegionSize() {
    	return performanceCounterRegionSize;
    }
    
    @Override
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM set(VkPhysicalDevicePerformanceCountersByRegionPropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevicePerformanceCountersByRegionPropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevicePerformanceCountersByRegionPropertiesARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevicePerformanceCountersByRegionPropertiesARM> array(Arena arena, VkPhysicalDevicePerformanceCountersByRegionPropertiesARM... structs) {
        NativeStructArray<VkPhysicalDevicePerformanceCountersByRegionPropertiesARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevicePerformanceCountersByRegionPropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(segment)
        );
    }
    
}