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

public final class VkCoarseSampleOrderCustomNV
		implements Struct<VkCoarseSampleOrderCustomNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SHADING_RATE_HANDLE;
    public static final VarHandle SAMPLE_COUNT_HANDLE;
    public static final VarHandle SAMPLE_LOCATION_COUNT_HANDLE;
    public static final VarHandle P_SAMPLE_LOCATIONS_HANDLE;

    public static final long SHADING_RATE_BYTE_OFFSET;
    public static final long SAMPLE_COUNT_BYTE_OFFSET;
    public static final long SAMPLE_LOCATION_COUNT_BYTE_OFFSET;
    public static final long P_SAMPLE_LOCATIONS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("shadingRate"),
            JAVA_INT.withName("sampleCount"),
            JAVA_INT.withName("sampleLocationCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pSampleLocations")
        ).withName("VkCoarseSampleOrderCustomNV").withByteAlignment(8);
        
        SHADING_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shadingRate"));
        SAMPLE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleCount"));
        SAMPLE_LOCATION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleLocationCount"));
        P_SAMPLE_LOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSampleLocations"));
        
        SHADING_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shadingRate"));
        SAMPLE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleCount"));
        SAMPLE_LOCATION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationCount"));
        P_SAMPLE_LOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSampleLocations"));
        //@formatter:on
    }

    public VkCoarseSampleOrderCustomNV() {
        this(Arena.ofAuto());
    }
    
    public VkCoarseSampleOrderCustomNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkCoarseSampleOrderCustomNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #shadingRate()
    public VkCoarseSampleOrderCustomNV shadingRate(int shadingRate) {
    	SHADING_RATE_HANDLE.set(segment, 0L, shadingRate);
    	return this;
    }
    
    public int shadingRate() {
    	return (int) SHADING_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleCount()
    public VkCoarseSampleOrderCustomNV sampleCount(int sampleCount) {
    	SAMPLE_COUNT_HANDLE.set(segment, 0L, sampleCount);
    	return this;
    }
    
    public int sampleCount() {
    	return (int) SAMPLE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleLocationCount()
    public VkCoarseSampleOrderCustomNV sampleLocationCount(int sampleLocationCount) {
    	SAMPLE_LOCATION_COUNT_HANDLE.set(segment, 0L, sampleLocationCount);
    	return this;
    }
    
    public int sampleLocationCount() {
    	return (int) SAMPLE_LOCATION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSampleLocations()
    public VkCoarseSampleOrderCustomNV pSampleLocations(NativeStructArray<VkCoarseSampleLocationNV> pSampleLocations) {
    	P_SAMPLE_LOCATIONS_HANDLE.set(segment, 0L, pSampleLocations.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkCoarseSampleLocationNV> pSampleLocations() {
    	MemorySegment segment = (MemorySegment) P_SAMPLE_LOCATIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkCoarseSampleLocationNV.array(segment);
    }
    
    @Override
    public VkCoarseSampleOrderCustomNV set(VkCoarseSampleOrderCustomNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkCoarseSampleOrderCustomNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCoarseSampleOrderCustomNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCoarseSampleOrderCustomNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCoarseSampleOrderCustomNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCoarseSampleOrderCustomNV> array(Arena arena, VkCoarseSampleOrderCustomNV... structs) {
        NativeStructArray<VkCoarseSampleOrderCustomNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCoarseSampleOrderCustomNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCoarseSampleOrderCustomNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCoarseSampleOrderCustomNV(segment)
        );
    }
    
}