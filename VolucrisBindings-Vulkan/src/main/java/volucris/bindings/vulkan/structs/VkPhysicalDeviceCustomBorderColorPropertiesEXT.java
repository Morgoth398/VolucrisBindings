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

public final class VkPhysicalDeviceCustomBorderColorPropertiesEXT
		implements Struct<VkPhysicalDeviceCustomBorderColorPropertiesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_CUSTOM_BORDER_COLOR_SAMPLERS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_CUSTOM_BORDER_COLOR_SAMPLERS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxCustomBorderColorSamplers"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceCustomBorderColorPropertiesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_CUSTOM_BORDER_COLOR_SAMPLERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxCustomBorderColorSamplers"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_CUSTOM_BORDER_COLOR_SAMPLERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxCustomBorderColorSamplers"));
        //@formatter:on
    }

    public VkPhysicalDeviceCustomBorderColorPropertiesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxCustomBorderColorSamplers()
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT maxCustomBorderColorSamplers(int maxCustomBorderColorSamplers) {
    	MAX_CUSTOM_BORDER_COLOR_SAMPLERS_HANDLE.set(segment, 0L, maxCustomBorderColorSamplers);
    	return this;
    }
    
    public int maxCustomBorderColorSamplers() {
    	return (int) MAX_CUSTOM_BORDER_COLOR_SAMPLERS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT set(VkPhysicalDeviceCustomBorderColorPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceCustomBorderColorPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceCustomBorderColorPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceCustomBorderColorPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceCustomBorderColorPropertiesEXT> array(Arena arena, VkPhysicalDeviceCustomBorderColorPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceCustomBorderColorPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceCustomBorderColorPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceCustomBorderColorPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceCustomBorderColorPropertiesEXT(segment)
        );
    }
    
}