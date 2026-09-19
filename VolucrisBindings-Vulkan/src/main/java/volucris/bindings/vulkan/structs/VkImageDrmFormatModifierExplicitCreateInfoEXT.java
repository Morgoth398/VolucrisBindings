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

public final class VkImageDrmFormatModifierExplicitCreateInfoEXT
		implements Struct<VkImageDrmFormatModifierExplicitCreateInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle DRM_FORMAT_MODIFIER_HANDLE;
    public static final VarHandle DRM_FORMAT_MODIFIER_PLANE_COUNT_HANDLE;
    public static final VarHandle P_PLANE_LAYOUTS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long DRM_FORMAT_MODIFIER_BYTE_OFFSET;
    public static final long DRM_FORMAT_MODIFIER_PLANE_COUNT_BYTE_OFFSET;
    public static final long P_PLANE_LAYOUTS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("drmFormatModifier"),
            JAVA_INT.withName("drmFormatModifierPlaneCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pPlaneLayouts")
        ).withName("VkImageDrmFormatModifierExplicitCreateInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        DRM_FORMAT_MODIFIER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drmFormatModifier"));
        DRM_FORMAT_MODIFIER_PLANE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drmFormatModifierPlaneCount"));
        P_PLANE_LAYOUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPlaneLayouts"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        DRM_FORMAT_MODIFIER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifier"));
        DRM_FORMAT_MODIFIER_PLANE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierPlaneCount"));
        P_PLANE_LAYOUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPlaneLayouts"));
        //@formatter:on
    }

    public VkImageDrmFormatModifierExplicitCreateInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkImageDrmFormatModifierExplicitCreateInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkImageDrmFormatModifierExplicitCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkImageDrmFormatModifierExplicitCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageDrmFormatModifierExplicitCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #drmFormatModifier()
    public VkImageDrmFormatModifierExplicitCreateInfoEXT drmFormatModifier(long drmFormatModifier) {
    	DRM_FORMAT_MODIFIER_HANDLE.set(segment, 0L, drmFormatModifier);
    	return this;
    }
    
    public long drmFormatModifier() {
    	return (long) DRM_FORMAT_MODIFIER_HANDLE.get(segment, 0L);
    }
    
    /// @see #drmFormatModifierPlaneCount()
    public VkImageDrmFormatModifierExplicitCreateInfoEXT drmFormatModifierPlaneCount(int drmFormatModifierPlaneCount) {
    	DRM_FORMAT_MODIFIER_PLANE_COUNT_HANDLE.set(segment, 0L, drmFormatModifierPlaneCount);
    	return this;
    }
    
    public int drmFormatModifierPlaneCount() {
    	return (int) DRM_FORMAT_MODIFIER_PLANE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPlaneLayouts()
    public VkImageDrmFormatModifierExplicitCreateInfoEXT pPlaneLayouts(NativeStructArray<VkSubresourceLayout> pPlaneLayouts) {
    	P_PLANE_LAYOUTS_HANDLE.set(segment, 0L, pPlaneLayouts.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkSubresourceLayout> pPlaneLayouts() {
    	MemorySegment segment = (MemorySegment) P_PLANE_LAYOUTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkSubresourceLayout.array(segment);
    }
    
    @Override
    public VkImageDrmFormatModifierExplicitCreateInfoEXT set(VkImageDrmFormatModifierExplicitCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageDrmFormatModifierExplicitCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageDrmFormatModifierExplicitCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageDrmFormatModifierExplicitCreateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageDrmFormatModifierExplicitCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageDrmFormatModifierExplicitCreateInfoEXT> array(Arena arena, VkImageDrmFormatModifierExplicitCreateInfoEXT... structs) {
        NativeStructArray<VkImageDrmFormatModifierExplicitCreateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageDrmFormatModifierExplicitCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageDrmFormatModifierExplicitCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageDrmFormatModifierExplicitCreateInfoEXT(segment)
        );
    }
    
}