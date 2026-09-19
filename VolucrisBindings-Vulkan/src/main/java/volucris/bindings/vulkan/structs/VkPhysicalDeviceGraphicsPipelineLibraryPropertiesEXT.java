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

public final class VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT
		implements Struct<VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle GRAPHICS_PIPELINE_LIBRARY_FAST_LINKING_HANDLE;
    public static final VarHandle GRAPHICS_PIPELINE_LIBRARY_INDEPENDENT_INTERPOLATION_DECORATION_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long GRAPHICS_PIPELINE_LIBRARY_FAST_LINKING_BYTE_OFFSET;
    public static final long GRAPHICS_PIPELINE_LIBRARY_INDEPENDENT_INTERPOLATION_DECORATION_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("graphicsPipelineLibraryFastLinking"),
            JAVA_INT.withName("graphicsPipelineLibraryIndependentInterpolationDecoration")
        ).withName("VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        GRAPHICS_PIPELINE_LIBRARY_FAST_LINKING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("graphicsPipelineLibraryFastLinking"));
        GRAPHICS_PIPELINE_LIBRARY_INDEPENDENT_INTERPOLATION_DECORATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("graphicsPipelineLibraryIndependentInterpolationDecoration"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        GRAPHICS_PIPELINE_LIBRARY_FAST_LINKING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("graphicsPipelineLibraryFastLinking"));
        GRAPHICS_PIPELINE_LIBRARY_INDEPENDENT_INTERPOLATION_DECORATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("graphicsPipelineLibraryIndependentInterpolationDecoration"));
        //@formatter:on
    }

    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #graphicsPipelineLibraryFastLinking()
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT graphicsPipelineLibraryFastLinking(int graphicsPipelineLibraryFastLinking) {
    	GRAPHICS_PIPELINE_LIBRARY_FAST_LINKING_HANDLE.set(segment, 0L, graphicsPipelineLibraryFastLinking);
    	return this;
    }
    
    public int graphicsPipelineLibraryFastLinking() {
    	return (int) GRAPHICS_PIPELINE_LIBRARY_FAST_LINKING_HANDLE.get(segment, 0L);
    }
    
    /// @see #graphicsPipelineLibraryIndependentInterpolationDecoration()
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT graphicsPipelineLibraryIndependentInterpolationDecoration(int graphicsPipelineLibraryIndependentInterpolationDecoration) {
    	GRAPHICS_PIPELINE_LIBRARY_INDEPENDENT_INTERPOLATION_DECORATION_HANDLE.set(segment, 0L, graphicsPipelineLibraryIndependentInterpolationDecoration);
    	return this;
    }
    
    public int graphicsPipelineLibraryIndependentInterpolationDecoration() {
    	return (int) GRAPHICS_PIPELINE_LIBRARY_INDEPENDENT_INTERPOLATION_DECORATION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT set(VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT> array(Arena arena, VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(segment)
        );
    }
    
}