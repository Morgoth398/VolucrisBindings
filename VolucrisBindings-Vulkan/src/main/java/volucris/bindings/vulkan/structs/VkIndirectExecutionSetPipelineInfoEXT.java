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

public final class VkIndirectExecutionSetPipelineInfoEXT
		implements Struct<VkIndirectExecutionSetPipelineInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle INITIAL_PIPELINE_HANDLE;
    public static final VarHandle MAX_PIPELINE_COUNT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long INITIAL_PIPELINE_BYTE_OFFSET;
    public static final long MAX_PIPELINE_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("initialPipeline"),
            JAVA_INT.withName("maxPipelineCount"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkIndirectExecutionSetPipelineInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        INITIAL_PIPELINE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("initialPipeline"));
        MAX_PIPELINE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPipelineCount"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        INITIAL_PIPELINE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("initialPipeline"));
        MAX_PIPELINE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPipelineCount"));
        //@formatter:on
    }

    public VkIndirectExecutionSetPipelineInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkIndirectExecutionSetPipelineInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkIndirectExecutionSetPipelineInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkIndirectExecutionSetPipelineInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkIndirectExecutionSetPipelineInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #initialPipeline()
    public VkIndirectExecutionSetPipelineInfoEXT initialPipeline(VkPipeline initialPipeline) {
    	INITIAL_PIPELINE_HANDLE.set(segment, 0L, initialPipeline.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipeline initialPipeline() {
    	MemorySegment segment = (MemorySegment) INITIAL_PIPELINE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipeline(segment);
    }
    
    /// @see #maxPipelineCount()
    public VkIndirectExecutionSetPipelineInfoEXT maxPipelineCount(int maxPipelineCount) {
    	MAX_PIPELINE_COUNT_HANDLE.set(segment, 0L, maxPipelineCount);
    	return this;
    }
    
    public int maxPipelineCount() {
    	return (int) MAX_PIPELINE_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkIndirectExecutionSetPipelineInfoEXT set(VkIndirectExecutionSetPipelineInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkIndirectExecutionSetPipelineInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkIndirectExecutionSetPipelineInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkIndirectExecutionSetPipelineInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectExecutionSetPipelineInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkIndirectExecutionSetPipelineInfoEXT> array(Arena arena, VkIndirectExecutionSetPipelineInfoEXT... structs) {
        NativeStructArray<VkIndirectExecutionSetPipelineInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectExecutionSetPipelineInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkIndirectExecutionSetPipelineInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkIndirectExecutionSetPipelineInfoEXT(segment)
        );
    }
    
}