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

public final class VkPipelineBinaryCreateInfoKHR
		implements Struct<VkPipelineBinaryCreateInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle P_KEYS_AND_DATA_INFO_HANDLE;
    public static final VarHandle PIPELINE_HANDLE;
    public static final VarHandle P_PIPELINE_CREATE_INFO_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long P_KEYS_AND_DATA_INFO_BYTE_OFFSET;
    public static final long PIPELINE_BYTE_OFFSET;
    public static final long P_PIPELINE_CREATE_INFO_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("pKeysAndDataInfo"),
            UNBOUNDED_ADDRESS.withName("pipeline"),
            UNBOUNDED_ADDRESS.withName("pPipelineCreateInfo")
        ).withName("VkPipelineBinaryCreateInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        P_KEYS_AND_DATA_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pKeysAndDataInfo"));
        PIPELINE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipeline"));
        P_PIPELINE_CREATE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPipelineCreateInfo"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        P_KEYS_AND_DATA_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pKeysAndDataInfo"));
        PIPELINE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipeline"));
        P_PIPELINE_CREATE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPipelineCreateInfo"));
        //@formatter:on
    }

    public VkPipelineBinaryCreateInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkPipelineBinaryCreateInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPipelineBinaryCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPipelineBinaryCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineBinaryCreateInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pKeysAndDataInfo()
    public VkPipelineBinaryCreateInfoKHR pKeysAndDataInfo(VkPipelineBinaryKeysAndDataKHR pKeysAndDataInfo) {
    	P_KEYS_AND_DATA_INFO_HANDLE.set(segment, 0L, pKeysAndDataInfo.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineBinaryKeysAndDataKHR pKeysAndDataInfo() {
    	MemorySegment segment = (MemorySegment) P_KEYS_AND_DATA_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineBinaryKeysAndDataKHR(segment);
    }
    
    /// @see #pipeline()
    public VkPipelineBinaryCreateInfoKHR pipeline(VkPipeline pipeline) {
    	PIPELINE_HANDLE.set(segment, 0L, pipeline.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipeline pipeline() {
    	MemorySegment segment = (MemorySegment) PIPELINE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipeline(segment);
    }
    
    /// @see #pPipelineCreateInfo()
    public VkPipelineBinaryCreateInfoKHR pPipelineCreateInfo(VkPipelineCreateInfoKHR pPipelineCreateInfo) {
    	P_PIPELINE_CREATE_INFO_HANDLE.set(segment, 0L, pPipelineCreateInfo.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineCreateInfoKHR pPipelineCreateInfo() {
    	MemorySegment segment = (MemorySegment) P_PIPELINE_CREATE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineCreateInfoKHR(segment);
    }
    
    @Override
    public VkPipelineBinaryCreateInfoKHR set(VkPipelineBinaryCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineBinaryCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineBinaryCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineBinaryCreateInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineBinaryCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineBinaryCreateInfoKHR> array(Arena arena, VkPipelineBinaryCreateInfoKHR... structs) {
        NativeStructArray<VkPipelineBinaryCreateInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineBinaryCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineBinaryCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineBinaryCreateInfoKHR(segment)
        );
    }
    
}