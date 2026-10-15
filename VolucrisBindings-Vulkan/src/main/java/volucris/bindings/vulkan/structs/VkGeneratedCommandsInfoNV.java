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

public final class VkGeneratedCommandsInfoNV
		implements Struct<VkGeneratedCommandsInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PIPELINE_BIND_POINT_HANDLE;
	public static final VarHandle PIPELINE_HANDLE;
	public static final VarHandle INDIRECT_COMMANDS_LAYOUT_HANDLE;
	public static final VarHandle STREAM_COUNT_HANDLE;
	public static final VarHandle P_STREAMS_HANDLE;
	public static final VarHandle SEQUENCES_COUNT_HANDLE;
	public static final VarHandle PREPROCESS_BUFFER_HANDLE;
	public static final VarHandle PREPROCESS_OFFSET_HANDLE;
	public static final VarHandle PREPROCESS_SIZE_HANDLE;
	public static final VarHandle SEQUENCES_COUNT_BUFFER_HANDLE;
	public static final VarHandle SEQUENCES_COUNT_OFFSET_HANDLE;
	public static final VarHandle SEQUENCES_INDEX_BUFFER_HANDLE;
	public static final VarHandle SEQUENCES_INDEX_OFFSET_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PIPELINE_BIND_POINT_BYTE_OFFSET;
	public static final long PIPELINE_BYTE_OFFSET;
	public static final long INDIRECT_COMMANDS_LAYOUT_BYTE_OFFSET;
	public static final long STREAM_COUNT_BYTE_OFFSET;
	public static final long P_STREAMS_BYTE_OFFSET;
	public static final long SEQUENCES_COUNT_BYTE_OFFSET;
	public static final long PREPROCESS_BUFFER_BYTE_OFFSET;
	public static final long PREPROCESS_OFFSET_BYTE_OFFSET;
	public static final long PREPROCESS_SIZE_BYTE_OFFSET;
	public static final long SEQUENCES_COUNT_BUFFER_BYTE_OFFSET;
	public static final long SEQUENCES_COUNT_OFFSET_BYTE_OFFSET;
	public static final long SEQUENCES_INDEX_BUFFER_BYTE_OFFSET;
	public static final long SEQUENCES_INDEX_OFFSET_BYTE_OFFSET;

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
		    JAVA_INT.withName("streamCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pStreams"),
		    JAVA_INT.withName("sequencesCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("preprocessBuffer"),
		    JAVA_LONG.withName("preprocessOffset"),
		    JAVA_LONG.withName("preprocessSize"),
		    UNBOUNDED_ADDRESS.withName("sequencesCountBuffer"),
		    JAVA_LONG.withName("sequencesCountOffset"),
		    UNBOUNDED_ADDRESS.withName("sequencesIndexBuffer"),
		    JAVA_LONG.withName("sequencesIndexOffset")
		).withName("VkGeneratedCommandsInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PIPELINE_BIND_POINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineBindPoint"));
		PIPELINE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipeline"));
		INDIRECT_COMMANDS_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indirectCommandsLayout"));
		STREAM_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("streamCount"));
		P_STREAMS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStreams"));
		SEQUENCES_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sequencesCount"));
		PREPROCESS_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preprocessBuffer"));
		PREPROCESS_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preprocessOffset"));
		PREPROCESS_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preprocessSize"));
		SEQUENCES_COUNT_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sequencesCountBuffer"));
		SEQUENCES_COUNT_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sequencesCountOffset"));
		SEQUENCES_INDEX_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sequencesIndexBuffer"));
		SEQUENCES_INDEX_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sequencesIndexOffset"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PIPELINE_BIND_POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineBindPoint"));
		PIPELINE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipeline"));
		INDIRECT_COMMANDS_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indirectCommandsLayout"));
		STREAM_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("streamCount"));
		P_STREAMS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStreams"));
		SEQUENCES_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sequencesCount"));
		PREPROCESS_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preprocessBuffer"));
		PREPROCESS_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preprocessOffset"));
		PREPROCESS_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preprocessSize"));
		SEQUENCES_COUNT_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sequencesCountBuffer"));
		SEQUENCES_COUNT_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sequencesCountOffset"));
		SEQUENCES_INDEX_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sequencesIndexBuffer"));
		SEQUENCES_INDEX_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sequencesIndexOffset"));
		//@formatter:on
	}

	public VkGeneratedCommandsInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkGeneratedCommandsInfoNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkGeneratedCommandsInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkGeneratedCommandsInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkGeneratedCommandsInfoNV pNext(MemorySegment pNext) {
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
    public VkGeneratedCommandsInfoNV pipelineBindPoint(int pipelineBindPoint) {
    	PIPELINE_BIND_POINT_HANDLE.set(segment, 0L, pipelineBindPoint);
    	return this;
    }
    
    public int pipelineBindPoint() {
    	return (int) PIPELINE_BIND_POINT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipeline()
    public VkGeneratedCommandsInfoNV pipeline(VkPipeline pipeline) {
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
    public VkGeneratedCommandsInfoNV indirectCommandsLayout(VkIndirectCommandsLayoutNV indirectCommandsLayout) {
    	INDIRECT_COMMANDS_LAYOUT_HANDLE.set(segment, 0L, indirectCommandsLayout.memorySegment());
    	return this;
    }
    
    public @Nullable VkIndirectCommandsLayoutNV indirectCommandsLayout() {
    	MemorySegment segment = (MemorySegment) INDIRECT_COMMANDS_LAYOUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkIndirectCommandsLayoutNV(segment);
    }
    
    /// @see #streamCount()
    public VkGeneratedCommandsInfoNV streamCount(int streamCount) {
    	STREAM_COUNT_HANDLE.set(segment, 0L, streamCount);
    	return this;
    }
    
    public int streamCount() {
    	return (int) STREAM_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pStreams()
    public VkGeneratedCommandsInfoNV pStreams(NativeStructArray<VkIndirectCommandsStreamNV> pStreams) {
    	P_STREAMS_HANDLE.set(segment, 0L, pStreams.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkIndirectCommandsStreamNV> pStreams() {
    	MemorySegment segment = (MemorySegment) P_STREAMS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkIndirectCommandsStreamNV.array(segment);
    }
    
    /// @see #sequencesCount()
    public VkGeneratedCommandsInfoNV sequencesCount(int sequencesCount) {
    	SEQUENCES_COUNT_HANDLE.set(segment, 0L, sequencesCount);
    	return this;
    }
    
    public int sequencesCount() {
    	return (int) SEQUENCES_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preprocessBuffer()
    public VkGeneratedCommandsInfoNV preprocessBuffer(VkBuffer preprocessBuffer) {
    	PREPROCESS_BUFFER_HANDLE.set(segment, 0L, preprocessBuffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer preprocessBuffer() {
    	MemorySegment segment = (MemorySegment) PREPROCESS_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    /// @see #preprocessOffset()
    public VkGeneratedCommandsInfoNV preprocessOffset(long preprocessOffset) {
    	PREPROCESS_OFFSET_HANDLE.set(segment, 0L, preprocessOffset);
    	return this;
    }
    
    public long preprocessOffset() {
    	return (long) PREPROCESS_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #preprocessSize()
    public VkGeneratedCommandsInfoNV preprocessSize(long preprocessSize) {
    	PREPROCESS_SIZE_HANDLE.set(segment, 0L, preprocessSize);
    	return this;
    }
    
    public long preprocessSize() {
    	return (long) PREPROCESS_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sequencesCountBuffer()
    public VkGeneratedCommandsInfoNV sequencesCountBuffer(VkBuffer sequencesCountBuffer) {
    	SEQUENCES_COUNT_BUFFER_HANDLE.set(segment, 0L, sequencesCountBuffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer sequencesCountBuffer() {
    	MemorySegment segment = (MemorySegment) SEQUENCES_COUNT_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    /// @see #sequencesCountOffset()
    public VkGeneratedCommandsInfoNV sequencesCountOffset(long sequencesCountOffset) {
    	SEQUENCES_COUNT_OFFSET_HANDLE.set(segment, 0L, sequencesCountOffset);
    	return this;
    }
    
    public long sequencesCountOffset() {
    	return (long) SEQUENCES_COUNT_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #sequencesIndexBuffer()
    public VkGeneratedCommandsInfoNV sequencesIndexBuffer(VkBuffer sequencesIndexBuffer) {
    	SEQUENCES_INDEX_BUFFER_HANDLE.set(segment, 0L, sequencesIndexBuffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer sequencesIndexBuffer() {
    	MemorySegment segment = (MemorySegment) SEQUENCES_INDEX_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    /// @see #sequencesIndexOffset()
    public VkGeneratedCommandsInfoNV sequencesIndexOffset(long sequencesIndexOffset) {
    	SEQUENCES_INDEX_OFFSET_HANDLE.set(segment, 0L, sequencesIndexOffset);
    	return this;
    }
    
    public long sequencesIndexOffset() {
    	return (long) SEQUENCES_INDEX_OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkGeneratedCommandsInfoNV set(VkGeneratedCommandsInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkGeneratedCommandsInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGeneratedCommandsInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGeneratedCommandsInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeneratedCommandsInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGeneratedCommandsInfoNV> array(Arena arena, VkGeneratedCommandsInfoNV... structs) {
        NativeStructArray<VkGeneratedCommandsInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeneratedCommandsInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGeneratedCommandsInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGeneratedCommandsInfoNV(segment)
        );
    }

}