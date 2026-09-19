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

public final class VkPhysicalDevicePerStageDescriptorSetFeaturesNV
		implements Struct<VkPhysicalDevicePerStageDescriptorSetFeaturesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PER_STAGE_DESCRIPTOR_SET_HANDLE;
    public static final VarHandle DYNAMIC_PIPELINE_LAYOUT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PER_STAGE_DESCRIPTOR_SET_BYTE_OFFSET;
    public static final long DYNAMIC_PIPELINE_LAYOUT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("perStageDescriptorSet"),
            JAVA_INT.withName("dynamicPipelineLayout")
        ).withName("VkPhysicalDevicePerStageDescriptorSetFeaturesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PER_STAGE_DESCRIPTOR_SET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("perStageDescriptorSet"));
        DYNAMIC_PIPELINE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dynamicPipelineLayout"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PER_STAGE_DESCRIPTOR_SET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("perStageDescriptorSet"));
        DYNAMIC_PIPELINE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dynamicPipelineLayout"));
        //@formatter:on
    }

    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #perStageDescriptorSet()
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV perStageDescriptorSet(int perStageDescriptorSet) {
    	PER_STAGE_DESCRIPTOR_SET_HANDLE.set(segment, 0L, perStageDescriptorSet);
    	return this;
    }
    
    public int perStageDescriptorSet() {
    	return (int) PER_STAGE_DESCRIPTOR_SET_HANDLE.get(segment, 0L);
    }
    
    /// @see #dynamicPipelineLayout()
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV dynamicPipelineLayout(int dynamicPipelineLayout) {
    	DYNAMIC_PIPELINE_LAYOUT_HANDLE.set(segment, 0L, dynamicPipelineLayout);
    	return this;
    }
    
    public int dynamicPipelineLayout() {
    	return (int) DYNAMIC_PIPELINE_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV set(VkPhysicalDevicePerStageDescriptorSetFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevicePerStageDescriptorSetFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevicePerStageDescriptorSetFeaturesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevicePerStageDescriptorSetFeaturesNV> array(Arena arena, VkPhysicalDevicePerStageDescriptorSetFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDevicePerStageDescriptorSetFeaturesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevicePerStageDescriptorSetFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(segment)
        );
    }
    
}