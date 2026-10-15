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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkShadingRatePaletteNV
		implements Struct<VkShadingRatePaletteNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SHADING_RATE_PALETTE_ENTRY_COUNT_HANDLE;
	public static final VarHandle P_SHADING_RATE_PALETTE_ENTRIES_HANDLE;

	public static final long SHADING_RATE_PALETTE_ENTRY_COUNT_BYTE_OFFSET;
	public static final long P_SHADING_RATE_PALETTE_ENTRIES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("shadingRatePaletteEntryCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pShadingRatePaletteEntries")
		).withName("VkShadingRatePaletteNV").withByteAlignment(8);
		
		SHADING_RATE_PALETTE_ENTRY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shadingRatePaletteEntryCount"));
		P_SHADING_RATE_PALETTE_ENTRIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pShadingRatePaletteEntries"));
		
		SHADING_RATE_PALETTE_ENTRY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shadingRatePaletteEntryCount"));
		P_SHADING_RATE_PALETTE_ENTRIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pShadingRatePaletteEntries"));
		//@formatter:on
	}

	public VkShadingRatePaletteNV() {
	    this(Arena.ofAuto());
	}
	
	public VkShadingRatePaletteNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkShadingRatePaletteNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #shadingRatePaletteEntryCount()
    public VkShadingRatePaletteNV shadingRatePaletteEntryCount(int shadingRatePaletteEntryCount) {
    	SHADING_RATE_PALETTE_ENTRY_COUNT_HANDLE.set(segment, 0L, shadingRatePaletteEntryCount);
    	return this;
    }
    
    public int shadingRatePaletteEntryCount() {
    	return (int) SHADING_RATE_PALETTE_ENTRY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pShadingRatePaletteEntries()
    public VkShadingRatePaletteNV pShadingRatePaletteEntries(NativeIntArray pShadingRatePaletteEntries) {
    	P_SHADING_RATE_PALETTE_ENTRIES_HANDLE.set(segment, 0L, pShadingRatePaletteEntries.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pShadingRatePaletteEntries() {
    	MemorySegment segment = (MemorySegment) P_SHADING_RATE_PALETTE_ENTRIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkShadingRatePaletteNV set(VkShadingRatePaletteNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkShadingRatePaletteNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkShadingRatePaletteNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkShadingRatePaletteNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkShadingRatePaletteNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkShadingRatePaletteNV> array(Arena arena, VkShadingRatePaletteNV... structs) {
        NativeStructArray<VkShadingRatePaletteNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkShadingRatePaletteNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkShadingRatePaletteNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkShadingRatePaletteNV(segment)
        );
    }

}