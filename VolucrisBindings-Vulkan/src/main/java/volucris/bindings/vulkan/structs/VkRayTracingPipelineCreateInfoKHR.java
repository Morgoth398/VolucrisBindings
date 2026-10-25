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

public final class VkRayTracingPipelineCreateInfoKHR
		implements Struct<VkRayTracingPipelineCreateInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle STAGE_COUNT_HANDLE;
	public static final VarHandle P_STAGES_HANDLE;
	public static final VarHandle GROUP_COUNT_HANDLE;
	public static final VarHandle P_GROUPS_HANDLE;
	public static final VarHandle MAX_PIPELINE_RAY_RECURSION_DEPTH_HANDLE;
	public static final VarHandle P_LIBRARY_INFO_HANDLE;
	public static final VarHandle P_LIBRARY_INTERFACE_HANDLE;
	public static final VarHandle P_DYNAMIC_STATE_HANDLE;
	public static final VarHandle LAYOUT_HANDLE;
	public static final VarHandle BASE_PIPELINE_HANDLE_HANDLE;
	public static final VarHandle BASE_PIPELINE_INDEX_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long STAGE_COUNT_BYTE_OFFSET;
	public static final long P_STAGES_BYTE_OFFSET;
	public static final long GROUP_COUNT_BYTE_OFFSET;
	public static final long P_GROUPS_BYTE_OFFSET;
	public static final long MAX_PIPELINE_RAY_RECURSION_DEPTH_BYTE_OFFSET;
	public static final long P_LIBRARY_INFO_BYTE_OFFSET;
	public static final long P_LIBRARY_INTERFACE_BYTE_OFFSET;
	public static final long P_DYNAMIC_STATE_BYTE_OFFSET;
	public static final long LAYOUT_BYTE_OFFSET;
	public static final long BASE_PIPELINE_HANDLE_BYTE_OFFSET;
	public static final long BASE_PIPELINE_INDEX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("stageCount"),
		    UNBOUNDED_ADDRESS.withName("pStages"),
		    JAVA_INT.withName("groupCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pGroups"),
		    JAVA_INT.withName("maxPipelineRayRecursionDepth"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pLibraryInfo"),
		    UNBOUNDED_ADDRESS.withName("pLibraryInterface"),
		    UNBOUNDED_ADDRESS.withName("pDynamicState"),
		    UNBOUNDED_ADDRESS.withName("layout"),
		    UNBOUNDED_ADDRESS.withName("basePipelineHandle"),
		    JAVA_INT.withName("basePipelineIndex"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkRayTracingPipelineCreateInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		STAGE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stageCount"));
		P_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStages"));
		GROUP_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("groupCount"));
		P_GROUPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pGroups"));
		MAX_PIPELINE_RAY_RECURSION_DEPTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPipelineRayRecursionDepth"));
		P_LIBRARY_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLibraryInfo"));
		P_LIBRARY_INTERFACE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLibraryInterface"));
		P_DYNAMIC_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDynamicState"));
		LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layout"));
		BASE_PIPELINE_HANDLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("basePipelineHandle"));
		BASE_PIPELINE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("basePipelineIndex"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		STAGE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stageCount"));
		P_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStages"));
		GROUP_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("groupCount"));
		P_GROUPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pGroups"));
		MAX_PIPELINE_RAY_RECURSION_DEPTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPipelineRayRecursionDepth"));
		P_LIBRARY_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLibraryInfo"));
		P_LIBRARY_INTERFACE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLibraryInterface"));
		P_DYNAMIC_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDynamicState"));
		LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layout"));
		BASE_PIPELINE_HANDLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("basePipelineHandle"));
		BASE_PIPELINE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("basePipelineIndex"));
		//@formatter:on
	}

	public VkRayTracingPipelineCreateInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkRayTracingPipelineCreateInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkRayTracingPipelineCreateInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkRayTracingPipelineCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRayTracingPipelineCreateInfoKHR pNext(MemorySegment pNext) {
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
    public VkRayTracingPipelineCreateInfoKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #stageCount()
    public VkRayTracingPipelineCreateInfoKHR stageCount(int stageCount) {
    	STAGE_COUNT_HANDLE.set(segment, 0L, stageCount);
    	return this;
    }
    
    public int stageCount() {
    	return (int) STAGE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pStages()
    public VkRayTracingPipelineCreateInfoKHR pStages(NativeStructArray<VkPipelineShaderStageCreateInfo> pStages) {
    	P_STAGES_HANDLE.set(segment, 0L, pStages.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkPipelineShaderStageCreateInfo> pStages() {
    	MemorySegment segment = (MemorySegment) P_STAGES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkPipelineShaderStageCreateInfo.array(segment);
    }
    
    /// @see #groupCount()
    public VkRayTracingPipelineCreateInfoKHR groupCount(int groupCount) {
    	GROUP_COUNT_HANDLE.set(segment, 0L, groupCount);
    	return this;
    }
    
    public int groupCount() {
    	return (int) GROUP_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pGroups()
    public VkRayTracingPipelineCreateInfoKHR pGroups(NativeStructArray<VkRayTracingShaderGroupCreateInfoKHR> pGroups) {
    	P_GROUPS_HANDLE.set(segment, 0L, pGroups.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkRayTracingShaderGroupCreateInfoKHR> pGroups() {
    	MemorySegment segment = (MemorySegment) P_GROUPS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkRayTracingShaderGroupCreateInfoKHR.array(segment);
    }
    
    /// @see #maxPipelineRayRecursionDepth()
    public VkRayTracingPipelineCreateInfoKHR maxPipelineRayRecursionDepth(int maxPipelineRayRecursionDepth) {
    	MAX_PIPELINE_RAY_RECURSION_DEPTH_HANDLE.set(segment, 0L, maxPipelineRayRecursionDepth);
    	return this;
    }
    
    public int maxPipelineRayRecursionDepth() {
    	return (int) MAX_PIPELINE_RAY_RECURSION_DEPTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #pLibraryInfo()
    public VkRayTracingPipelineCreateInfoKHR pLibraryInfo(VkPipelineLibraryCreateInfoKHR pLibraryInfo) {
    	P_LIBRARY_INFO_HANDLE.set(segment, 0L, pLibraryInfo.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineLibraryCreateInfoKHR pLibraryInfo() {
    	MemorySegment segment = (MemorySegment) P_LIBRARY_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineLibraryCreateInfoKHR(segment);
    }
    
    /// @see #pLibraryInterface()
    public VkRayTracingPipelineCreateInfoKHR pLibraryInterface(VkRayTracingPipelineInterfaceCreateInfoKHR pLibraryInterface) {
    	P_LIBRARY_INTERFACE_HANDLE.set(segment, 0L, pLibraryInterface.memorySegment());
    	return this;
    }
    
    public @Nullable VkRayTracingPipelineInterfaceCreateInfoKHR pLibraryInterface() {
    	MemorySegment segment = (MemorySegment) P_LIBRARY_INTERFACE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkRayTracingPipelineInterfaceCreateInfoKHR(segment);
    }
    
    /// @see #pDynamicState()
    public VkRayTracingPipelineCreateInfoKHR pDynamicState(VkPipelineDynamicStateCreateInfo pDynamicState) {
    	P_DYNAMIC_STATE_HANDLE.set(segment, 0L, pDynamicState.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineDynamicStateCreateInfo pDynamicState() {
    	MemorySegment segment = (MemorySegment) P_DYNAMIC_STATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineDynamicStateCreateInfo(segment);
    }
    
    /// @see #layout()
    public VkRayTracingPipelineCreateInfoKHR layout(VkPipelineLayout layout) {
    	LAYOUT_HANDLE.set(segment, 0L, layout.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineLayout layout() {
    	MemorySegment segment = (MemorySegment) LAYOUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineLayout(segment);
    }
    
    /// @see #basePipelineHandle()
    public VkRayTracingPipelineCreateInfoKHR basePipelineHandle(VkPipeline basePipelineHandle) {
    	BASE_PIPELINE_HANDLE_HANDLE.set(segment, 0L, basePipelineHandle.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipeline basePipelineHandle() {
    	MemorySegment segment = (MemorySegment) BASE_PIPELINE_HANDLE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipeline(segment);
    }
    
    /// @see #basePipelineIndex()
    public VkRayTracingPipelineCreateInfoKHR basePipelineIndex(int basePipelineIndex) {
    	BASE_PIPELINE_INDEX_HANDLE.set(segment, 0L, basePipelineIndex);
    	return this;
    }
    
    public int basePipelineIndex() {
    	return (int) BASE_PIPELINE_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkRayTracingPipelineCreateInfoKHR set(VkRayTracingPipelineCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkRayTracingPipelineCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRayTracingPipelineCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRayTracingPipelineCreateInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRayTracingPipelineCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRayTracingPipelineCreateInfoKHR> array(SegmentAllocator allocator, VkRayTracingPipelineCreateInfoKHR... structs) {
        NativeStructArray<VkRayTracingPipelineCreateInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRayTracingPipelineCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRayTracingPipelineCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRayTracingPipelineCreateInfoKHR(segment)
        );
    }

}