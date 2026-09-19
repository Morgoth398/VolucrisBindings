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

public final class VkSampleLocationsInfoEXT
		implements Struct<VkSampleLocationsInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SAMPLE_LOCATIONS_PER_PIXEL_HANDLE;
    public static final VarHandle SAMPLE_LOCATIONS_COUNT_HANDLE;
    public static final VarHandle P_SAMPLE_LOCATIONS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SAMPLE_LOCATIONS_PER_PIXEL_BYTE_OFFSET;
    public static final long SAMPLE_LOCATION_GRID_SIZE_BYTE_OFFSET;
    public static final long SAMPLE_LOCATIONS_COUNT_BYTE_OFFSET;
    public static final long P_SAMPLE_LOCATIONS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkExtent2D sampleLocationGridSize;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("sampleLocationsPerPixel"),
            VkExtent2D.LAYOUT.withName("sampleLocationGridSize"),
            JAVA_INT.withName("sampleLocationsCount"),
            UNBOUNDED_ADDRESS.withName("pSampleLocations")
        ).withName("VkSampleLocationsInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SAMPLE_LOCATIONS_PER_PIXEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleLocationsPerPixel"));
        SAMPLE_LOCATIONS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleLocationsCount"));
        P_SAMPLE_LOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSampleLocations"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SAMPLE_LOCATIONS_PER_PIXEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsPerPixel"));
        SAMPLE_LOCATION_GRID_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationGridSize"));
        SAMPLE_LOCATIONS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsCount"));
        P_SAMPLE_LOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSampleLocations"));
        //@formatter:on
    }

    public VkSampleLocationsInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkSampleLocationsInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSampleLocationsInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
        sampleLocationGridSize = new VkExtent2D(segment.asSlice(SAMPLE_LOCATION_GRID_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #sType()
    public VkSampleLocationsInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSampleLocationsInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #sampleLocationsPerPixel()
    public VkSampleLocationsInfoEXT sampleLocationsPerPixel(int sampleLocationsPerPixel) {
    	SAMPLE_LOCATIONS_PER_PIXEL_HANDLE.set(segment, 0L, sampleLocationsPerPixel);
    	return this;
    }
    
    public int sampleLocationsPerPixel() {
    	return (int) SAMPLE_LOCATIONS_PER_PIXEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleLocationsCount()
    public VkSampleLocationsInfoEXT sampleLocationsCount(int sampleLocationsCount) {
    	SAMPLE_LOCATIONS_COUNT_HANDLE.set(segment, 0L, sampleLocationsCount);
    	return this;
    }
    
    public int sampleLocationsCount() {
    	return (int) SAMPLE_LOCATIONS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSampleLocations()
    public VkSampleLocationsInfoEXT pSampleLocations(NativeStructArray<VkSampleLocationEXT> pSampleLocations) {
    	P_SAMPLE_LOCATIONS_HANDLE.set(segment, 0L, pSampleLocations.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkSampleLocationEXT> pSampleLocations() {
    	MemorySegment segment = (MemorySegment) P_SAMPLE_LOCATIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkSampleLocationEXT.array(segment);
    }
    
    /// @see #sampleLocationGridSize()
    public VkSampleLocationsInfoEXT sampleLocationGridSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(sampleLocationGridSize);
    	return this;
    }
    
    /// @see #sampleLocationGridSize()
    public VkSampleLocationsInfoEXT sampleLocationGridSize(VkExtent2D other) {
    	sampleLocationGridSize.set(other);
    	return this;
    }
    
    public VkExtent2D sampleLocationGridSize() {
    	return sampleLocationGridSize;
    }
    
    @Override
    public VkSampleLocationsInfoEXT set(VkSampleLocationsInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkSampleLocationsInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSampleLocationsInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSampleLocationsInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSampleLocationsInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSampleLocationsInfoEXT> array(Arena arena, VkSampleLocationsInfoEXT... structs) {
        NativeStructArray<VkSampleLocationsInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSampleLocationsInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSampleLocationsInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSampleLocationsInfoEXT(segment)
        );
    }
    
}