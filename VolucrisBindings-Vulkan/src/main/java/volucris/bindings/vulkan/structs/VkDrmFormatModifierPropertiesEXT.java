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

public final class VkDrmFormatModifierPropertiesEXT
		implements Struct<VkDrmFormatModifierPropertiesEXT> {

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
		    JAVA_INT.withName("drmFormatModifierTilingFeatures")
		).withName("VkDrmFormatModifierPropertiesEXT").withByteAlignment(8);
		
		DRM_FORMAT_MODIFIER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drmFormatModifier"));
		DRM_FORMAT_MODIFIER_PLANE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drmFormatModifierPlaneCount"));
		DRM_FORMAT_MODIFIER_TILING_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drmFormatModifierTilingFeatures"));
		
		DRM_FORMAT_MODIFIER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifier"));
		DRM_FORMAT_MODIFIER_PLANE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierPlaneCount"));
		DRM_FORMAT_MODIFIER_TILING_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierTilingFeatures"));
		//@formatter:on
	}

	public VkDrmFormatModifierPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDrmFormatModifierPropertiesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDrmFormatModifierPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #drmFormatModifier()
    public VkDrmFormatModifierPropertiesEXT drmFormatModifier(long drmFormatModifier) {
    	DRM_FORMAT_MODIFIER_HANDLE.set(segment, 0L, drmFormatModifier);
    	return this;
    }
    
    public long drmFormatModifier() {
    	return (long) DRM_FORMAT_MODIFIER_HANDLE.get(segment, 0L);
    }
    
    /// @see #drmFormatModifierPlaneCount()
    public VkDrmFormatModifierPropertiesEXT drmFormatModifierPlaneCount(int drmFormatModifierPlaneCount) {
    	DRM_FORMAT_MODIFIER_PLANE_COUNT_HANDLE.set(segment, 0L, drmFormatModifierPlaneCount);
    	return this;
    }
    
    public int drmFormatModifierPlaneCount() {
    	return (int) DRM_FORMAT_MODIFIER_PLANE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #drmFormatModifierTilingFeatures()
    public VkDrmFormatModifierPropertiesEXT drmFormatModifierTilingFeatures(int drmFormatModifierTilingFeatures) {
    	DRM_FORMAT_MODIFIER_TILING_FEATURES_HANDLE.set(segment, 0L, drmFormatModifierTilingFeatures);
    	return this;
    }
    
    public int drmFormatModifierTilingFeatures() {
    	return (int) DRM_FORMAT_MODIFIER_TILING_FEATURES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDrmFormatModifierPropertiesEXT set(VkDrmFormatModifierPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDrmFormatModifierPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDrmFormatModifierPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDrmFormatModifierPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDrmFormatModifierPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDrmFormatModifierPropertiesEXT> array(Arena arena, VkDrmFormatModifierPropertiesEXT... structs) {
        NativeStructArray<VkDrmFormatModifierPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDrmFormatModifierPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDrmFormatModifierPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDrmFormatModifierPropertiesEXT(segment)
        );
    }

}