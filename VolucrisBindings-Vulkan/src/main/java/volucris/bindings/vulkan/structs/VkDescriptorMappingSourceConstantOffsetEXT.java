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

public final class VkDescriptorMappingSourceConstantOffsetEXT
		implements Struct<VkDescriptorMappingSourceConstantOffsetEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle HEAP_OFFSET_HANDLE;
    public static final VarHandle HEAP_ARRAY_STRIDE_HANDLE;
    public static final VarHandle P_EMBEDDED_SAMPLER_HANDLE;
    public static final VarHandle SAMPLER_HEAP_OFFSET_HANDLE;
    public static final VarHandle SAMPLER_HEAP_ARRAY_STRIDE_HANDLE;

    public static final long HEAP_OFFSET_BYTE_OFFSET;
    public static final long HEAP_ARRAY_STRIDE_BYTE_OFFSET;
    public static final long P_EMBEDDED_SAMPLER_BYTE_OFFSET;
    public static final long SAMPLER_HEAP_OFFSET_BYTE_OFFSET;
    public static final long SAMPLER_HEAP_ARRAY_STRIDE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("heapOffset"),
            JAVA_INT.withName("heapArrayStride"),
            UNBOUNDED_ADDRESS.withName("pEmbeddedSampler"),
            JAVA_INT.withName("samplerHeapOffset"),
            JAVA_INT.withName("samplerHeapArrayStride")
        ).withName("VkDescriptorMappingSourceConstantOffsetEXT").withByteAlignment(8);
        
        HEAP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heapOffset"));
        HEAP_ARRAY_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heapArrayStride"));
        P_EMBEDDED_SAMPLER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pEmbeddedSampler"));
        SAMPLER_HEAP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerHeapOffset"));
        SAMPLER_HEAP_ARRAY_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerHeapArrayStride"));
        
        HEAP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapOffset"));
        HEAP_ARRAY_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapArrayStride"));
        P_EMBEDDED_SAMPLER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pEmbeddedSampler"));
        SAMPLER_HEAP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerHeapOffset"));
        SAMPLER_HEAP_ARRAY_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerHeapArrayStride"));
        //@formatter:on
    }

    public VkDescriptorMappingSourceConstantOffsetEXT() {
        this(Arena.ofAuto());
    }
    
    public VkDescriptorMappingSourceConstantOffsetEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDescriptorMappingSourceConstantOffsetEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #heapOffset()
    public VkDescriptorMappingSourceConstantOffsetEXT heapOffset(int heapOffset) {
    	HEAP_OFFSET_HANDLE.set(segment, 0L, heapOffset);
    	return this;
    }
    
    public int heapOffset() {
    	return (int) HEAP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #heapArrayStride()
    public VkDescriptorMappingSourceConstantOffsetEXT heapArrayStride(int heapArrayStride) {
    	HEAP_ARRAY_STRIDE_HANDLE.set(segment, 0L, heapArrayStride);
    	return this;
    }
    
    public int heapArrayStride() {
    	return (int) HEAP_ARRAY_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pEmbeddedSampler()
    public VkDescriptorMappingSourceConstantOffsetEXT pEmbeddedSampler(VkSamplerCreateInfo pEmbeddedSampler) {
    	P_EMBEDDED_SAMPLER_HANDLE.set(segment, 0L, pEmbeddedSampler.memorySegment());
    	return this;
    }
    
    public @Nullable VkSamplerCreateInfo pEmbeddedSampler() {
    	MemorySegment segment = (MemorySegment) P_EMBEDDED_SAMPLER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkSamplerCreateInfo(segment);
    }
    
    /// @see #samplerHeapOffset()
    public VkDescriptorMappingSourceConstantOffsetEXT samplerHeapOffset(int samplerHeapOffset) {
    	SAMPLER_HEAP_OFFSET_HANDLE.set(segment, 0L, samplerHeapOffset);
    	return this;
    }
    
    public int samplerHeapOffset() {
    	return (int) SAMPLER_HEAP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerHeapArrayStride()
    public VkDescriptorMappingSourceConstantOffsetEXT samplerHeapArrayStride(int samplerHeapArrayStride) {
    	SAMPLER_HEAP_ARRAY_STRIDE_HANDLE.set(segment, 0L, samplerHeapArrayStride);
    	return this;
    }
    
    public int samplerHeapArrayStride() {
    	return (int) SAMPLER_HEAP_ARRAY_STRIDE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorMappingSourceConstantOffsetEXT set(VkDescriptorMappingSourceConstantOffsetEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorMappingSourceConstantOffsetEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorMappingSourceConstantOffsetEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceConstantOffsetEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceConstantOffsetEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceConstantOffsetEXT> array(Arena arena, VkDescriptorMappingSourceConstantOffsetEXT... structs) {
        NativeStructArray<VkDescriptorMappingSourceConstantOffsetEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceConstantOffsetEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceConstantOffsetEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceConstantOffsetEXT(segment)
        );
    }
    
}