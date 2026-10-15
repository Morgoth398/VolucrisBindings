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

public final class VkGeneratedCommandsMemoryRequirementsInfoNV
		implements Struct<VkGeneratedCommandsMemoryRequirementsInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PIPELINE_BIND_POINT_HANDLE;
	public static final VarHandle PIPELINE_HANDLE;
	public static final VarHandle INDIRECT_COMMANDS_LAYOUT_HANDLE;
	public static final VarHandle MAX_SEQUENCES_COUNT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PIPELINE_BIND_POINT_BYTE_OFFSET;
	public static final long PIPELINE_BYTE_OFFSET;
	public static final long INDIRECT_COMMANDS_LAYOUT_BYTE_OFFSET;
	public static final long MAX_SEQUENCES_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("pipelineBindPoint"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pipeline"),
		    UNBOUNDED_ADDRESS.withName("indirectCommandsLayout"),
		    JAVA_INT.withName("maxSequencesCount"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkGeneratedCommandsMemoryRequirementsInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PIPELINE_BIND_POINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineBindPoint"));
		PIPELINE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipeline"));
		INDIRECT_COMMANDS_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indirectCommandsLayout"));
		MAX_SEQUENCES_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSequencesCount"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PIPELINE_BIND_POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineBindPoint"));
		PIPELINE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipeline"));
		INDIRECT_COMMANDS_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indirectCommandsLayout"));
		MAX_SEQUENCES_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSequencesCount"));
		//@formatter:on
	}

	public VkGeneratedCommandsMemoryRequirementsInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkGeneratedCommandsMemoryRequirementsInfoNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkGeneratedCommandsMemoryRequirementsInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkGeneratedCommandsMemoryRequirementsInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkGeneratedCommandsMemoryRequirementsInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pipelineBindPoint()
    public VkGeneratedCommandsMemoryRequirementsInfoNV pipelineBindPoint(int pipelineBindPoint) {
    	PIPELINE_BIND_POINT_HANDLE.set(segment, 0L, pipelineBindPoint);
    	return this;
    }
    
    public int pipelineBindPoint() {
    	return (int) PIPELINE_BIND_POINT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipeline()
    public VkGeneratedCommandsMemoryRequirementsInfoNV pipeline(VkPipeline pipeline) {
    	PIPELINE_HANDLE.set(segment, 0L, pipeline.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipeline pipeline() {
    	MemorySegment segment = (MemorySegment) PIPELINE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipeline(segment);
    }
    
    /// @see #indirectCommandsLayout()
    public VkGeneratedCommandsMemoryRequirementsInfoNV indirectCommandsLayout(VkIndirectCommandsLayoutNV indirectCommandsLayout) {
    	INDIRECT_COMMANDS_LAYOUT_HANDLE.set(segment, 0L, indirectCommandsLayout.memorySegment());
    	return this;
    }
    
    public @Nullable VkIndirectCommandsLayoutNV indirectCommandsLayout() {
    	MemorySegment segment = (MemorySegment) INDIRECT_COMMANDS_LAYOUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkIndirectCommandsLayoutNV(segment);
    }
    
    /// @see #maxSequencesCount()
    public VkGeneratedCommandsMemoryRequirementsInfoNV maxSequencesCount(int maxSequencesCount) {
    	MAX_SEQUENCES_COUNT_HANDLE.set(segment, 0L, maxSequencesCount);
    	return this;
    }
    
    public int maxSequencesCount() {
    	return (int) MAX_SEQUENCES_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkGeneratedCommandsMemoryRequirementsInfoNV set(VkGeneratedCommandsMemoryRequirementsInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkGeneratedCommandsMemoryRequirementsInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGeneratedCommandsMemoryRequirementsInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGeneratedCommandsMemoryRequirementsInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeneratedCommandsMemoryRequirementsInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGeneratedCommandsMemoryRequirementsInfoNV> array(Arena arena, VkGeneratedCommandsMemoryRequirementsInfoNV... structs) {
        NativeStructArray<VkGeneratedCommandsMemoryRequirementsInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeneratedCommandsMemoryRequirementsInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGeneratedCommandsMemoryRequirementsInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGeneratedCommandsMemoryRequirementsInfoNV(segment)
        );
    }

}