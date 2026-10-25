/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
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

public final class VkDataGraphPipelineSessionCreateInfoARM
		implements Struct<VkDataGraphPipelineSessionCreateInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle DATA_GRAPH_PIPELINE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long DATA_GRAPH_PIPELINE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("flags"),
		    UNBOUNDED_ADDRESS.withName("dataGraphPipeline")
		).withName("VkDataGraphPipelineSessionCreateInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		DATA_GRAPH_PIPELINE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dataGraphPipeline"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		DATA_GRAPH_PIPELINE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dataGraphPipeline"));
		//@formatter:on
	}

	public VkDataGraphPipelineSessionCreateInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkDataGraphPipelineSessionCreateInfoARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDataGraphPipelineSessionCreateInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDataGraphPipelineSessionCreateInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDataGraphPipelineSessionCreateInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkDataGraphPipelineSessionCreateInfoARM flags(long flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public long flags() {
    	return (long) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #dataGraphPipeline()
    public VkDataGraphPipelineSessionCreateInfoARM dataGraphPipeline(VkPipeline dataGraphPipeline) {
    	DATA_GRAPH_PIPELINE_HANDLE.set(segment, 0L, dataGraphPipeline.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipeline dataGraphPipeline() {
    	MemorySegment segment = (MemorySegment) DATA_GRAPH_PIPELINE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipeline(segment);
    }
    
    @Override
    public VkDataGraphPipelineSessionCreateInfoARM set(VkDataGraphPipelineSessionCreateInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphPipelineSessionCreateInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphPipelineSessionCreateInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphPipelineSessionCreateInfoARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDataGraphPipelineSessionCreateInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphPipelineSessionCreateInfoARM> array(SegmentAllocator allocator, VkDataGraphPipelineSessionCreateInfoARM... structs) {
        NativeStructArray<VkDataGraphPipelineSessionCreateInfoARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDataGraphPipelineSessionCreateInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphPipelineSessionCreateInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphPipelineSessionCreateInfoARM(segment)
        );
    }

}