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

public final class VkPhysicalDeviceTileShadingPropertiesQCOM
		implements Struct<VkPhysicalDeviceTileShadingPropertiesQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_APRON_SIZE_HANDLE;
	public static final VarHandle PREFER_NON_COHERENT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_APRON_SIZE_BYTE_OFFSET;
	public static final long PREFER_NON_COHERENT_BYTE_OFFSET;
	public static final long TILE_GRANULARITY_BYTE_OFFSET;
	public static final long MAX_TILE_SHADING_RATE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D tileGranularity;
	private final VkExtent2D maxTileShadingRate;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maxApronSize"),
		    JAVA_INT.withName("preferNonCoherent"),
		    VkExtent2D.LAYOUT.withName("tileGranularity"),
		    VkExtent2D.LAYOUT.withName("maxTileShadingRate")
		).withName("VkPhysicalDeviceTileShadingPropertiesQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_APRON_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxApronSize"));
		PREFER_NON_COHERENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferNonCoherent"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_APRON_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxApronSize"));
		PREFER_NON_COHERENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferNonCoherent"));
		TILE_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileGranularity"));
		MAX_TILE_SHADING_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTileShadingRate"));
		//@formatter:on
	}

	public VkPhysicalDeviceTileShadingPropertiesQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceTileShadingPropertiesQCOM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceTileShadingPropertiesQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	    tileGranularity = new VkExtent2D(segment.asSlice(TILE_GRANULARITY_BYTE_OFFSET, VkExtent2D.LAYOUT));
	    maxTileShadingRate = new VkExtent2D(segment.asSlice(MAX_TILE_SHADING_RATE_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #sType()
    public VkPhysicalDeviceTileShadingPropertiesQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceTileShadingPropertiesQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxApronSize()
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxApronSize(int maxApronSize) {
    	MAX_APRON_SIZE_HANDLE.set(segment, 0L, maxApronSize);
    	return this;
    }
    
    public int maxApronSize() {
    	return (int) MAX_APRON_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferNonCoherent()
    public VkPhysicalDeviceTileShadingPropertiesQCOM preferNonCoherent(int preferNonCoherent) {
    	PREFER_NON_COHERENT_HANDLE.set(segment, 0L, preferNonCoherent);
    	return this;
    }
    
    public int preferNonCoherent() {
    	return (int) PREFER_NON_COHERENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileGranularity()
    public VkPhysicalDeviceTileShadingPropertiesQCOM tileGranularity(Consumer<VkExtent2D> consumer) {
    	consumer.accept(tileGranularity);
    	return this;
    }
    
    /// @see #tileGranularity()
    public VkPhysicalDeviceTileShadingPropertiesQCOM tileGranularity(VkExtent2D other) {
    	tileGranularity.set(other);
    	return this;
    }
    
    public VkExtent2D tileGranularity() {
    	return tileGranularity;
    }
    
    /// @see #maxTileShadingRate()
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxTileShadingRate(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxTileShadingRate);
    	return this;
    }
    
    /// @see #maxTileShadingRate()
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxTileShadingRate(VkExtent2D other) {
    	maxTileShadingRate.set(other);
    	return this;
    }
    
    public VkExtent2D maxTileShadingRate() {
    	return maxTileShadingRate;
    }
    
    @Override
    public VkPhysicalDeviceTileShadingPropertiesQCOM set(VkPhysicalDeviceTileShadingPropertiesQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceTileShadingPropertiesQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceTileShadingPropertiesQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceTileShadingPropertiesQCOM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceTileShadingPropertiesQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceTileShadingPropertiesQCOM> array(Arena arena, VkPhysicalDeviceTileShadingPropertiesQCOM... structs) {
        NativeStructArray<VkPhysicalDeviceTileShadingPropertiesQCOM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceTileShadingPropertiesQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceTileShadingPropertiesQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceTileShadingPropertiesQCOM(segment)
        );
    }

}