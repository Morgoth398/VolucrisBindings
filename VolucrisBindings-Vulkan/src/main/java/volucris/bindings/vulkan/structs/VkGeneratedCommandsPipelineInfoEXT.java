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

public final class VkGeneratedCommandsPipelineInfoEXT
		implements Struct<VkGeneratedCommandsPipelineInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PIPELINE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PIPELINE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pipeline")
		).withName("VkGeneratedCommandsPipelineInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PIPELINE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipeline"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PIPELINE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipeline"));
		//@formatter:on
	}

	public VkGeneratedCommandsPipelineInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkGeneratedCommandsPipelineInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkGeneratedCommandsPipelineInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkGeneratedCommandsPipelineInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkGeneratedCommandsPipelineInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pipeline()
    public VkGeneratedCommandsPipelineInfoEXT pipeline(VkPipeline pipeline) {
    	PIPELINE_HANDLE.set(segment, 0L, pipeline.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipeline pipeline() {
    	MemorySegment segment = (MemorySegment) PIPELINE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipeline(segment);
    }
    
    @Override
    public VkGeneratedCommandsPipelineInfoEXT set(VkGeneratedCommandsPipelineInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkGeneratedCommandsPipelineInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGeneratedCommandsPipelineInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGeneratedCommandsPipelineInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeneratedCommandsPipelineInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGeneratedCommandsPipelineInfoEXT> array(Arena arena, VkGeneratedCommandsPipelineInfoEXT... structs) {
        NativeStructArray<VkGeneratedCommandsPipelineInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeneratedCommandsPipelineInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGeneratedCommandsPipelineInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGeneratedCommandsPipelineInfoEXT(segment)
        );
    }

}