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

public final class VkVideoEncodeIntraRefreshCapabilitiesKHR
		implements Struct<VkVideoEncodeIntraRefreshCapabilitiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle INTRA_REFRESH_MODES_HANDLE;
	public static final VarHandle MAX_INTRA_REFRESH_CYCLE_DURATION_HANDLE;
	public static final VarHandle MAX_INTRA_REFRESH_ACTIVE_REFERENCE_PICTURES_HANDLE;
	public static final VarHandle PARTITION_INDEPENDENT_INTRA_REFRESH_REGIONS_HANDLE;
	public static final VarHandle NON_RECTANGULAR_INTRA_REFRESH_REGIONS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long INTRA_REFRESH_MODES_BYTE_OFFSET;
	public static final long MAX_INTRA_REFRESH_CYCLE_DURATION_BYTE_OFFSET;
	public static final long MAX_INTRA_REFRESH_ACTIVE_REFERENCE_PICTURES_BYTE_OFFSET;
	public static final long PARTITION_INDEPENDENT_INTRA_REFRESH_REGIONS_BYTE_OFFSET;
	public static final long NON_RECTANGULAR_INTRA_REFRESH_REGIONS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("intraRefreshModes"),
		    JAVA_INT.withName("maxIntraRefreshCycleDuration"),
		    JAVA_INT.withName("maxIntraRefreshActiveReferencePictures"),
		    JAVA_INT.withName("partitionIndependentIntraRefreshRegions"),
		    JAVA_INT.withName("nonRectangularIntraRefreshRegions"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkVideoEncodeIntraRefreshCapabilitiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		INTRA_REFRESH_MODES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("intraRefreshModes"));
		MAX_INTRA_REFRESH_CYCLE_DURATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxIntraRefreshCycleDuration"));
		MAX_INTRA_REFRESH_ACTIVE_REFERENCE_PICTURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxIntraRefreshActiveReferencePictures"));
		PARTITION_INDEPENDENT_INTRA_REFRESH_REGIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("partitionIndependentIntraRefreshRegions"));
		NON_RECTANGULAR_INTRA_REFRESH_REGIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nonRectangularIntraRefreshRegions"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		INTRA_REFRESH_MODES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("intraRefreshModes"));
		MAX_INTRA_REFRESH_CYCLE_DURATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxIntraRefreshCycleDuration"));
		MAX_INTRA_REFRESH_ACTIVE_REFERENCE_PICTURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxIntraRefreshActiveReferencePictures"));
		PARTITION_INDEPENDENT_INTRA_REFRESH_REGIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("partitionIndependentIntraRefreshRegions"));
		NON_RECTANGULAR_INTRA_REFRESH_REGIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nonRectangularIntraRefreshRegions"));
		//@formatter:on
	}

	public VkVideoEncodeIntraRefreshCapabilitiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeIntraRefreshCapabilitiesKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoEncodeIntraRefreshCapabilitiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeIntraRefreshCapabilitiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeIntraRefreshCapabilitiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #intraRefreshModes()
    public VkVideoEncodeIntraRefreshCapabilitiesKHR intraRefreshModes(int intraRefreshModes) {
    	INTRA_REFRESH_MODES_HANDLE.set(segment, 0L, intraRefreshModes);
    	return this;
    }
    
    public int intraRefreshModes() {
    	return (int) INTRA_REFRESH_MODES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxIntraRefreshCycleDuration()
    public VkVideoEncodeIntraRefreshCapabilitiesKHR maxIntraRefreshCycleDuration(int maxIntraRefreshCycleDuration) {
    	MAX_INTRA_REFRESH_CYCLE_DURATION_HANDLE.set(segment, 0L, maxIntraRefreshCycleDuration);
    	return this;
    }
    
    public int maxIntraRefreshCycleDuration() {
    	return (int) MAX_INTRA_REFRESH_CYCLE_DURATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxIntraRefreshActiveReferencePictures()
    public VkVideoEncodeIntraRefreshCapabilitiesKHR maxIntraRefreshActiveReferencePictures(int maxIntraRefreshActiveReferencePictures) {
    	MAX_INTRA_REFRESH_ACTIVE_REFERENCE_PICTURES_HANDLE.set(segment, 0L, maxIntraRefreshActiveReferencePictures);
    	return this;
    }
    
    public int maxIntraRefreshActiveReferencePictures() {
    	return (int) MAX_INTRA_REFRESH_ACTIVE_REFERENCE_PICTURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #partitionIndependentIntraRefreshRegions()
    public VkVideoEncodeIntraRefreshCapabilitiesKHR partitionIndependentIntraRefreshRegions(int partitionIndependentIntraRefreshRegions) {
    	PARTITION_INDEPENDENT_INTRA_REFRESH_REGIONS_HANDLE.set(segment, 0L, partitionIndependentIntraRefreshRegions);
    	return this;
    }
    
    public int partitionIndependentIntraRefreshRegions() {
    	return (int) PARTITION_INDEPENDENT_INTRA_REFRESH_REGIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #nonRectangularIntraRefreshRegions()
    public VkVideoEncodeIntraRefreshCapabilitiesKHR nonRectangularIntraRefreshRegions(int nonRectangularIntraRefreshRegions) {
    	NON_RECTANGULAR_INTRA_REFRESH_REGIONS_HANDLE.set(segment, 0L, nonRectangularIntraRefreshRegions);
    	return this;
    }
    
    public int nonRectangularIntraRefreshRegions() {
    	return (int) NON_RECTANGULAR_INTRA_REFRESH_REGIONS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeIntraRefreshCapabilitiesKHR set(VkVideoEncodeIntraRefreshCapabilitiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeIntraRefreshCapabilitiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeIntraRefreshCapabilitiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeIntraRefreshCapabilitiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeIntraRefreshCapabilitiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeIntraRefreshCapabilitiesKHR> array(Arena arena, VkVideoEncodeIntraRefreshCapabilitiesKHR... structs) {
        NativeStructArray<VkVideoEncodeIntraRefreshCapabilitiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeIntraRefreshCapabilitiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeIntraRefreshCapabilitiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeIntraRefreshCapabilitiesKHR(segment)
        );
    }

}