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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkGraphicsPipelineShaderGroupsCreateInfoNV
		implements Struct<VkGraphicsPipelineShaderGroupsCreateInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle GROUP_COUNT_HANDLE;
	public static final VarHandle P_GROUPS_HANDLE;
	public static final VarHandle PIPELINE_COUNT_HANDLE;
	public static final VarHandle P_PIPELINES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long GROUP_COUNT_BYTE_OFFSET;
	public static final long P_GROUPS_BYTE_OFFSET;
	public static final long PIPELINE_COUNT_BYTE_OFFSET;
	public static final long P_PIPELINES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("groupCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pGroups"),
		    JAVA_INT.withName("pipelineCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pPipelines")
		).withName("VkGraphicsPipelineShaderGroupsCreateInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		GROUP_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("groupCount"));
		P_GROUPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pGroups"));
		PIPELINE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineCount"));
		P_PIPELINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPipelines"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		GROUP_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("groupCount"));
		P_GROUPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pGroups"));
		PIPELINE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineCount"));
		P_PIPELINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPipelines"));
		//@formatter:on
	}

	public VkGraphicsPipelineShaderGroupsCreateInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkGraphicsPipelineShaderGroupsCreateInfoNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkGraphicsPipelineShaderGroupsCreateInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkGraphicsPipelineShaderGroupsCreateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #groupCount()
    public VkGraphicsPipelineShaderGroupsCreateInfoNV groupCount(int groupCount) {
    	GROUP_COUNT_HANDLE.set(segment, 0L, groupCount);
    	return this;
    }
    
    public int groupCount() {
    	return (int) GROUP_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pGroups()
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pGroups(NativeStructArray<VkGraphicsShaderGroupCreateInfoNV> pGroups) {
    	P_GROUPS_HANDLE.set(segment, 0L, pGroups.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkGraphicsShaderGroupCreateInfoNV> pGroups() {
    	MemorySegment segment = (MemorySegment) P_GROUPS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkGraphicsShaderGroupCreateInfoNV.array(segment);
    }
    
    /// @see #pipelineCount()
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pipelineCount(int pipelineCount) {
    	PIPELINE_COUNT_HANDLE.set(segment, 0L, pipelineCount);
    	return this;
    }
    
    public int pipelineCount() {
    	return (int) PIPELINE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPipelines()
    public VkGraphicsPipelineShaderGroupsCreateInfoNV pPipelines(NativePointerArray pPipelines) {
    	P_PIPELINES_HANDLE.set(segment, 0L, pPipelines.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pPipelines() {
    	MemorySegment segment = (MemorySegment) P_PIPELINES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public VkGraphicsPipelineShaderGroupsCreateInfoNV set(VkGraphicsPipelineShaderGroupsCreateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkGraphicsPipelineShaderGroupsCreateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGraphicsPipelineShaderGroupsCreateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGraphicsPipelineShaderGroupsCreateInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGraphicsPipelineShaderGroupsCreateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGraphicsPipelineShaderGroupsCreateInfoNV> array(Arena arena, VkGraphicsPipelineShaderGroupsCreateInfoNV... structs) {
        NativeStructArray<VkGraphicsPipelineShaderGroupsCreateInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGraphicsPipelineShaderGroupsCreateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGraphicsPipelineShaderGroupsCreateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGraphicsPipelineShaderGroupsCreateInfoNV(segment)
        );
    }

}