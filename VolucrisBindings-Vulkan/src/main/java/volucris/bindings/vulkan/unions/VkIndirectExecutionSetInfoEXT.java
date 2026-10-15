/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.unions;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.structs.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkIndirectExecutionSetInfoEXT
		implements Struct<VkIndirectExecutionSetInfoEXT> {

	public static final UnionLayout LAYOUT;

	public static final VarHandle P_PIPELINE_INFO_HANDLE;
	public static final VarHandle P_SHADER_INFO_HANDLE;

	public static final long P_PIPELINE_INFO_BYTE_OFFSET;
	public static final long P_SHADER_INFO_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.unionLayout(
		    UNBOUNDED_ADDRESS.withName("pPipelineInfo"),
		    UNBOUNDED_ADDRESS.withName("pShaderInfo")
		).withName("VkIndirectExecutionSetInfoEXT").withByteAlignment(8);
		
		P_PIPELINE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPipelineInfo"));
		P_SHADER_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pShaderInfo"));
		
		P_PIPELINE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPipelineInfo"));
		P_SHADER_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pShaderInfo"));
		//@formatter:on
	}

	public VkIndirectExecutionSetInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkIndirectExecutionSetInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkIndirectExecutionSetInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #pPipelineInfo()
    public VkIndirectExecutionSetInfoEXT pPipelineInfo(VkIndirectExecutionSetPipelineInfoEXT pPipelineInfo) {
    	P_PIPELINE_INFO_HANDLE.set(segment, 0L, pPipelineInfo.memorySegment());
    	return this;
    }
    
    public @Nullable VkIndirectExecutionSetPipelineInfoEXT pPipelineInfo() {
    	MemorySegment segment = (MemorySegment) P_PIPELINE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkIndirectExecutionSetPipelineInfoEXT(segment);
    }
    
    /// @see #pShaderInfo()
    public VkIndirectExecutionSetInfoEXT pShaderInfo(VkIndirectExecutionSetShaderInfoEXT pShaderInfo) {
    	P_SHADER_INFO_HANDLE.set(segment, 0L, pShaderInfo.memorySegment());
    	return this;
    }
    
    public @Nullable VkIndirectExecutionSetShaderInfoEXT pShaderInfo() {
    	MemorySegment segment = (MemorySegment) P_SHADER_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkIndirectExecutionSetShaderInfoEXT(segment);
    }
    
    @Override
    public VkIndirectExecutionSetInfoEXT set(VkIndirectExecutionSetInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkIndirectExecutionSetInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkIndirectExecutionSetInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkIndirectExecutionSetInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectExecutionSetInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkIndirectExecutionSetInfoEXT> array(Arena arena, VkIndirectExecutionSetInfoEXT... structs) {
        NativeStructArray<VkIndirectExecutionSetInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectExecutionSetInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkIndirectExecutionSetInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkIndirectExecutionSetInfoEXT(segment)
        );
    }

}