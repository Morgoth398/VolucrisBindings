/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkDrmFormatModifierProperties2EXT
		implements Struct<VkDrmFormatModifierProperties2EXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DRM_FORMAT_MODIFIER_HANDLE;
	public static final VarHandle DRM_FORMAT_MODIFIER_PLANE_COUNT_HANDLE;
	public static final VarHandle DRM_FORMAT_MODIFIER_TILING_FEATURES_HANDLE;

	public static final long DRM_FORMAT_MODIFIER_BYTE_OFFSET;
	public static final long DRM_FORMAT_MODIFIER_PLANE_COUNT_BYTE_OFFSET;
	public static final long DRM_FORMAT_MODIFIER_TILING_FEATURES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("drmFormatModifier"),
		    JAVA_INT.withName("drmFormatModifierPlaneCount"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("drmFormatModifierTilingFeatures")
		).withName("VkDrmFormatModifierProperties2EXT").withByteAlignment(8);
		
		DRM_FORMAT_MODIFIER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drmFormatModifier"));
		DRM_FORMAT_MODIFIER_PLANE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drmFormatModifierPlaneCount"));
		DRM_FORMAT_MODIFIER_TILING_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drmFormatModifierTilingFeatures"));
		
		DRM_FORMAT_MODIFIER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifier"));
		DRM_FORMAT_MODIFIER_PLANE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierPlaneCount"));
		DRM_FORMAT_MODIFIER_TILING_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierTilingFeatures"));
		//@formatter:on
	}

	public VkDrmFormatModifierProperties2EXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDrmFormatModifierProperties2EXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDrmFormatModifierProperties2EXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #drmFormatModifier()
    public VkDrmFormatModifierProperties2EXT drmFormatModifier(long drmFormatModifier) {
    	DRM_FORMAT_MODIFIER_HANDLE.set(segment, 0L, drmFormatModifier);
    	return this;
    }
    
    public long drmFormatModifier() {
    	return (long) DRM_FORMAT_MODIFIER_HANDLE.get(segment, 0L);
    }
    
    /// @see #drmFormatModifierPlaneCount()
    public VkDrmFormatModifierProperties2EXT drmFormatModifierPlaneCount(int drmFormatModifierPlaneCount) {
    	DRM_FORMAT_MODIFIER_PLANE_COUNT_HANDLE.set(segment, 0L, drmFormatModifierPlaneCount);
    	return this;
    }
    
    public int drmFormatModifierPlaneCount() {
    	return (int) DRM_FORMAT_MODIFIER_PLANE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #drmFormatModifierTilingFeatures()
    public VkDrmFormatModifierProperties2EXT drmFormatModifierTilingFeatures(long drmFormatModifierTilingFeatures) {
    	DRM_FORMAT_MODIFIER_TILING_FEATURES_HANDLE.set(segment, 0L, drmFormatModifierTilingFeatures);
    	return this;
    }
    
    public long drmFormatModifierTilingFeatures() {
    	return (long) DRM_FORMAT_MODIFIER_TILING_FEATURES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDrmFormatModifierProperties2EXT set(VkDrmFormatModifierProperties2EXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDrmFormatModifierProperties2EXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDrmFormatModifierProperties2EXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDrmFormatModifierProperties2EXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDrmFormatModifierProperties2EXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDrmFormatModifierProperties2EXT> array(Arena arena, VkDrmFormatModifierProperties2EXT... structs) {
        NativeStructArray<VkDrmFormatModifierProperties2EXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDrmFormatModifierProperties2EXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDrmFormatModifierProperties2EXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDrmFormatModifierProperties2EXT(segment)
        );
    }

}