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

public final class VkPhysicalDevicePipelineOpacityMicromapFeaturesARM
		implements Struct<VkPhysicalDevicePipelineOpacityMicromapFeaturesARM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PIPELINE_OPACITY_MICROMAP_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PIPELINE_OPACITY_MICROMAP_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("pipelineOpacityMicromap"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDevicePipelineOpacityMicromapFeaturesARM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PIPELINE_OPACITY_MICROMAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineOpacityMicromap"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PIPELINE_OPACITY_MICROMAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineOpacityMicromap"));
        //@formatter:on
    }

    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pipelineOpacityMicromap()
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM pipelineOpacityMicromap(int pipelineOpacityMicromap) {
    	PIPELINE_OPACITY_MICROMAP_HANDLE.set(segment, 0L, pipelineOpacityMicromap);
    	return this;
    }
    
    public int pipelineOpacityMicromap() {
    	return (int) PIPELINE_OPACITY_MICROMAP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM set(VkPhysicalDevicePipelineOpacityMicromapFeaturesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevicePipelineOpacityMicromapFeaturesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevicePipelineOpacityMicromapFeaturesARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevicePipelineOpacityMicromapFeaturesARM> array(Arena arena, VkPhysicalDevicePipelineOpacityMicromapFeaturesARM... structs) {
        NativeStructArray<VkPhysicalDevicePipelineOpacityMicromapFeaturesARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevicePipelineOpacityMicromapFeaturesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(segment)
        );
    }
    
}