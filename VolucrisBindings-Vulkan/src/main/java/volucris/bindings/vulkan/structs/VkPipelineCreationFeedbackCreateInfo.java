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

public final class VkPipelineCreationFeedbackCreateInfo
		implements Struct<VkPipelineCreationFeedbackCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_PIPELINE_CREATION_FEEDBACK_HANDLE;
	public static final VarHandle PIPELINE_STAGE_CREATION_FEEDBACK_COUNT_HANDLE;
	public static final VarHandle P_PIPELINE_STAGE_CREATION_FEEDBACKS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_PIPELINE_CREATION_FEEDBACK_BYTE_OFFSET;
	public static final long PIPELINE_STAGE_CREATION_FEEDBACK_COUNT_BYTE_OFFSET;
	public static final long P_PIPELINE_STAGE_CREATION_FEEDBACKS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pPipelineCreationFeedback"),
		    JAVA_INT.withName("pipelineStageCreationFeedbackCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pPipelineStageCreationFeedbacks")
		).withName("VkPipelineCreationFeedbackCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_PIPELINE_CREATION_FEEDBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPipelineCreationFeedback"));
		PIPELINE_STAGE_CREATION_FEEDBACK_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineStageCreationFeedbackCount"));
		P_PIPELINE_STAGE_CREATION_FEEDBACKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPipelineStageCreationFeedbacks"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_PIPELINE_CREATION_FEEDBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPipelineCreationFeedback"));
		PIPELINE_STAGE_CREATION_FEEDBACK_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineStageCreationFeedbackCount"));
		P_PIPELINE_STAGE_CREATION_FEEDBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPipelineStageCreationFeedbacks"));
		//@formatter:on
	}

	public VkPipelineCreationFeedbackCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineCreationFeedbackCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineCreationFeedbackCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineCreationFeedbackCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineCreationFeedbackCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pPipelineCreationFeedback()
    public VkPipelineCreationFeedbackCreateInfo pPipelineCreationFeedback(VkPipelineCreationFeedback pPipelineCreationFeedback) {
    	P_PIPELINE_CREATION_FEEDBACK_HANDLE.set(segment, 0L, pPipelineCreationFeedback.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineCreationFeedback pPipelineCreationFeedback() {
    	MemorySegment segment = (MemorySegment) P_PIPELINE_CREATION_FEEDBACK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineCreationFeedback(segment);
    }
    
    /// @see #pipelineStageCreationFeedbackCount()
    public VkPipelineCreationFeedbackCreateInfo pipelineStageCreationFeedbackCount(int pipelineStageCreationFeedbackCount) {
    	PIPELINE_STAGE_CREATION_FEEDBACK_COUNT_HANDLE.set(segment, 0L, pipelineStageCreationFeedbackCount);
    	return this;
    }
    
    public int pipelineStageCreationFeedbackCount() {
    	return (int) PIPELINE_STAGE_CREATION_FEEDBACK_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPipelineStageCreationFeedbacks()
    public VkPipelineCreationFeedbackCreateInfo pPipelineStageCreationFeedbacks(NativeStructArray<VkPipelineCreationFeedback> pPipelineStageCreationFeedbacks) {
    	P_PIPELINE_STAGE_CREATION_FEEDBACKS_HANDLE.set(segment, 0L, pPipelineStageCreationFeedbacks.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkPipelineCreationFeedback> pPipelineStageCreationFeedbacks() {
    	MemorySegment segment = (MemorySegment) P_PIPELINE_STAGE_CREATION_FEEDBACKS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkPipelineCreationFeedback.array(segment);
    }
    
    @Override
    public VkPipelineCreationFeedbackCreateInfo set(VkPipelineCreationFeedbackCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineCreationFeedbackCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineCreationFeedbackCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineCreationFeedbackCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineCreationFeedbackCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineCreationFeedbackCreateInfo> array(Arena arena, VkPipelineCreationFeedbackCreateInfo... structs) {
        NativeStructArray<VkPipelineCreationFeedbackCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineCreationFeedbackCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineCreationFeedbackCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineCreationFeedbackCreateInfo(segment)
        );
    }

}