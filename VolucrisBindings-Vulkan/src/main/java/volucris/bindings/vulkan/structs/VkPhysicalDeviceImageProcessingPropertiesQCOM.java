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

public final class VkPhysicalDeviceImageProcessingPropertiesQCOM
		implements Struct<VkPhysicalDeviceImageProcessingPropertiesQCOM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_WEIGHT_FILTER_PHASES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_WEIGHT_FILTER_PHASES_BYTE_OFFSET;
    public static final long MAX_WEIGHT_FILTER_DIMENSION_BYTE_OFFSET;
    public static final long MAX_BLOCK_MATCH_REGION_BYTE_OFFSET;
    public static final long MAX_BOX_FILTER_BLOCK_SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkExtent2D maxWeightFilterDimension;
    private final VkExtent2D maxBlockMatchRegion;
    private final VkExtent2D maxBoxFilterBlockSize;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxWeightFilterPhases"),
            VkExtent2D.LAYOUT.withName("maxWeightFilterDimension"),
            VkExtent2D.LAYOUT.withName("maxBlockMatchRegion"),
            VkExtent2D.LAYOUT.withName("maxBoxFilterBlockSize"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceImageProcessingPropertiesQCOM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_WEIGHT_FILTER_PHASES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxWeightFilterPhases"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_WEIGHT_FILTER_PHASES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxWeightFilterPhases"));
        MAX_WEIGHT_FILTER_DIMENSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxWeightFilterDimension"));
        MAX_BLOCK_MATCH_REGION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBlockMatchRegion"));
        MAX_BOX_FILTER_BLOCK_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBoxFilterBlockSize"));
        //@formatter:on
    }

    public VkPhysicalDeviceImageProcessingPropertiesQCOM() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceImageProcessingPropertiesQCOM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceImageProcessingPropertiesQCOM(MemorySegment segment) {
        this.segment = segment;
    
        maxWeightFilterDimension = new VkExtent2D(segment.asSlice(MAX_WEIGHT_FILTER_DIMENSION_BYTE_OFFSET, VkExtent2D.LAYOUT));
        maxBlockMatchRegion = new VkExtent2D(segment.asSlice(MAX_BLOCK_MATCH_REGION_BYTE_OFFSET, VkExtent2D.LAYOUT));
        maxBoxFilterBlockSize = new VkExtent2D(segment.asSlice(MAX_BOX_FILTER_BLOCK_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #sType()
    public VkPhysicalDeviceImageProcessingPropertiesQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceImageProcessingPropertiesQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxWeightFilterPhases()
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterPhases(int maxWeightFilterPhases) {
    	MAX_WEIGHT_FILTER_PHASES_HANDLE.set(segment, 0L, maxWeightFilterPhases);
    	return this;
    }
    
    public int maxWeightFilterPhases() {
    	return (int) MAX_WEIGHT_FILTER_PHASES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxWeightFilterDimension()
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterDimension(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxWeightFilterDimension);
    	return this;
    }
    
    /// @see #maxWeightFilterDimension()
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterDimension(VkExtent2D other) {
    	maxWeightFilterDimension.set(other);
    	return this;
    }
    
    public VkExtent2D maxWeightFilterDimension() {
    	return maxWeightFilterDimension;
    }
    
    /// @see #maxBlockMatchRegion()
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBlockMatchRegion(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxBlockMatchRegion);
    	return this;
    }
    
    /// @see #maxBlockMatchRegion()
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBlockMatchRegion(VkExtent2D other) {
    	maxBlockMatchRegion.set(other);
    	return this;
    }
    
    public VkExtent2D maxBlockMatchRegion() {
    	return maxBlockMatchRegion;
    }
    
    /// @see #maxBoxFilterBlockSize()
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBoxFilterBlockSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxBoxFilterBlockSize);
    	return this;
    }
    
    /// @see #maxBoxFilterBlockSize()
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBoxFilterBlockSize(VkExtent2D other) {
    	maxBoxFilterBlockSize.set(other);
    	return this;
    }
    
    public VkExtent2D maxBoxFilterBlockSize() {
    	return maxBoxFilterBlockSize;
    }
    
    @Override
    public VkPhysicalDeviceImageProcessingPropertiesQCOM set(VkPhysicalDeviceImageProcessingPropertiesQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceImageProcessingPropertiesQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceImageProcessingPropertiesQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageProcessingPropertiesQCOM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageProcessingPropertiesQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageProcessingPropertiesQCOM> array(Arena arena, VkPhysicalDeviceImageProcessingPropertiesQCOM... structs) {
        NativeStructArray<VkPhysicalDeviceImageProcessingPropertiesQCOM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageProcessingPropertiesQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageProcessingPropertiesQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageProcessingPropertiesQCOM(segment)
        );
    }
    
}