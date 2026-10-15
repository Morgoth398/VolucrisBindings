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

public final class VkPhysicalDeviceSampleLocationsPropertiesEXT
		implements Struct<VkPhysicalDeviceSampleLocationsPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SAMPLE_LOCATION_SAMPLE_COUNTS_HANDLE;
	public static final VarHandle SAMPLE_LOCATION_COORDINATE_RANGE_HANDLE;
	public static final VarHandle SAMPLE_LOCATION_SUB_PIXEL_BITS_HANDLE;
	public static final VarHandle VARIABLE_SAMPLE_LOCATIONS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SAMPLE_LOCATION_SAMPLE_COUNTS_BYTE_OFFSET;
	public static final long MAX_SAMPLE_LOCATION_GRID_SIZE_BYTE_OFFSET;
	public static final long SAMPLE_LOCATION_COORDINATE_RANGE_BYTE_OFFSET;
	public static final long SAMPLE_LOCATION_SUB_PIXEL_BITS_BYTE_OFFSET;
	public static final long VARIABLE_SAMPLE_LOCATIONS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D maxSampleLocationGridSize;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("sampleLocationSampleCounts"),
		    VkExtent2D.LAYOUT.withName("maxSampleLocationGridSize"),
		    MemoryLayout.sequenceLayout(2, JAVA_FLOAT).withName("sampleLocationCoordinateRange"),
		    JAVA_INT.withName("sampleLocationSubPixelBits"),
		    JAVA_INT.withName("variableSampleLocations"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceSampleLocationsPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SAMPLE_LOCATION_SAMPLE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleLocationSampleCounts"));
		SAMPLE_LOCATION_COORDINATE_RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleLocationCoordinateRange"), PathElement.sequenceElement());
		SAMPLE_LOCATION_SUB_PIXEL_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleLocationSubPixelBits"));
		VARIABLE_SAMPLE_LOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("variableSampleLocations"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SAMPLE_LOCATION_SAMPLE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationSampleCounts"));
		MAX_SAMPLE_LOCATION_GRID_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSampleLocationGridSize"));
		SAMPLE_LOCATION_COORDINATE_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationCoordinateRange"));
		SAMPLE_LOCATION_SUB_PIXEL_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationSubPixelBits"));
		VARIABLE_SAMPLE_LOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("variableSampleLocations"));
		//@formatter:on
	}

	public VkPhysicalDeviceSampleLocationsPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceSampleLocationsPropertiesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceSampleLocationsPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	    maxSampleLocationGridSize = new VkExtent2D(segment.asSlice(MAX_SAMPLE_LOCATION_GRID_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #sType()
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceSampleLocationsPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #sampleLocationSampleCounts()
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationSampleCounts(int sampleLocationSampleCounts) {
    	SAMPLE_LOCATION_SAMPLE_COUNTS_HANDLE.set(segment, 0L, sampleLocationSampleCounts);
    	return this;
    }
    
    public int sampleLocationSampleCounts() {
    	return (int) SAMPLE_LOCATION_SAMPLE_COUNTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSampleLocationGridSize()
    public VkPhysicalDeviceSampleLocationsPropertiesEXT maxSampleLocationGridSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxSampleLocationGridSize);
    	return this;
    }
    
    /// @see #maxSampleLocationGridSize()
    public VkPhysicalDeviceSampleLocationsPropertiesEXT maxSampleLocationGridSize(VkExtent2D other) {
    	maxSampleLocationGridSize.set(other);
    	return this;
    }
    
    public VkExtent2D maxSampleLocationGridSize() {
    	return maxSampleLocationGridSize;
    }
    
    /// @see #sampleLocationCoordinateRange(int)
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationCoordinateRange(float sampleLocationCoordinateRange, int index0) {
    	SAMPLE_LOCATION_COORDINATE_RANGE_HANDLE.set(segment, 0L, index0, sampleLocationCoordinateRange);
    	return this;
    }
    
    public float sampleLocationCoordinateRange(int index0) {
    	return (float) SAMPLE_LOCATION_COORDINATE_RANGE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #sampleLocationSubPixelBits()
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sampleLocationSubPixelBits(int sampleLocationSubPixelBits) {
    	SAMPLE_LOCATION_SUB_PIXEL_BITS_HANDLE.set(segment, 0L, sampleLocationSubPixelBits);
    	return this;
    }
    
    public int sampleLocationSubPixelBits() {
    	return (int) SAMPLE_LOCATION_SUB_PIXEL_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #variableSampleLocations()
    public VkPhysicalDeviceSampleLocationsPropertiesEXT variableSampleLocations(int variableSampleLocations) {
    	VARIABLE_SAMPLE_LOCATIONS_HANDLE.set(segment, 0L, variableSampleLocations);
    	return this;
    }
    
    public int variableSampleLocations() {
    	return (int) VARIABLE_SAMPLE_LOCATIONS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceSampleLocationsPropertiesEXT set(VkPhysicalDeviceSampleLocationsPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceSampleLocationsPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceSampleLocationsPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceSampleLocationsPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceSampleLocationsPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceSampleLocationsPropertiesEXT> array(Arena arena, VkPhysicalDeviceSampleLocationsPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceSampleLocationsPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceSampleLocationsPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceSampleLocationsPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceSampleLocationsPropertiesEXT(segment)
        );
    }

}