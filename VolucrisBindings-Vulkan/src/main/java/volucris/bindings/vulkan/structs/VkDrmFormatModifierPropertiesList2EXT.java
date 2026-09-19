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

public final class VkDrmFormatModifierPropertiesList2EXT
		implements Struct<VkDrmFormatModifierPropertiesList2EXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle DRM_FORMAT_MODIFIER_COUNT_HANDLE;
    public static final VarHandle P_DRM_FORMAT_MODIFIER_PROPERTIES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long DRM_FORMAT_MODIFIER_COUNT_BYTE_OFFSET;
    public static final long P_DRM_FORMAT_MODIFIER_PROPERTIES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("drmFormatModifierCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pDrmFormatModifierProperties")
        ).withName("VkDrmFormatModifierPropertiesList2EXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        DRM_FORMAT_MODIFIER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drmFormatModifierCount"));
        P_DRM_FORMAT_MODIFIER_PROPERTIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDrmFormatModifierProperties"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        DRM_FORMAT_MODIFIER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierCount"));
        P_DRM_FORMAT_MODIFIER_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDrmFormatModifierProperties"));
        //@formatter:on
    }

    public VkDrmFormatModifierPropertiesList2EXT() {
        this(Arena.ofAuto());
    }
    
    public VkDrmFormatModifierPropertiesList2EXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDrmFormatModifierPropertiesList2EXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDrmFormatModifierPropertiesList2EXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDrmFormatModifierPropertiesList2EXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #drmFormatModifierCount()
    public VkDrmFormatModifierPropertiesList2EXT drmFormatModifierCount(int drmFormatModifierCount) {
    	DRM_FORMAT_MODIFIER_COUNT_HANDLE.set(segment, 0L, drmFormatModifierCount);
    	return this;
    }
    
    public int drmFormatModifierCount() {
    	return (int) DRM_FORMAT_MODIFIER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDrmFormatModifierProperties()
    public VkDrmFormatModifierPropertiesList2EXT pDrmFormatModifierProperties(NativeStructArray<VkDrmFormatModifierProperties2EXT> pDrmFormatModifierProperties) {
    	P_DRM_FORMAT_MODIFIER_PROPERTIES_HANDLE.set(segment, 0L, pDrmFormatModifierProperties.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDrmFormatModifierProperties2EXT> pDrmFormatModifierProperties() {
    	MemorySegment segment = (MemorySegment) P_DRM_FORMAT_MODIFIER_PROPERTIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDrmFormatModifierProperties2EXT.array(segment);
    }
    
    @Override
    public VkDrmFormatModifierPropertiesList2EXT set(VkDrmFormatModifierPropertiesList2EXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDrmFormatModifierPropertiesList2EXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDrmFormatModifierPropertiesList2EXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDrmFormatModifierPropertiesList2EXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDrmFormatModifierPropertiesList2EXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDrmFormatModifierPropertiesList2EXT> array(Arena arena, VkDrmFormatModifierPropertiesList2EXT... structs) {
        NativeStructArray<VkDrmFormatModifierPropertiesList2EXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDrmFormatModifierPropertiesList2EXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDrmFormatModifierPropertiesList2EXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDrmFormatModifierPropertiesList2EXT(segment)
        );
    }
    
}