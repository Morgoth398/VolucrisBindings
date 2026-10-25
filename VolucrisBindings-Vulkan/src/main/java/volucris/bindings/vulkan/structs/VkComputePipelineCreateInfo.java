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
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkComputePipelineCreateInfo
		implements Struct<VkComputePipelineCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle LAYOUT_HANDLE;
	public static final VarHandle BASE_PIPELINE_HANDLE_HANDLE;
	public static final VarHandle BASE_PIPELINE_INDEX_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long STAGE_BYTE_OFFSET;
	public static final long LAYOUT_BYTE_OFFSET;
	public static final long BASE_PIPELINE_HANDLE_BYTE_OFFSET;
	public static final long BASE_PIPELINE_INDEX_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkPipelineShaderStageCreateInfo stage;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    VkPipelineShaderStageCreateInfo.LAYOUT.withName("stage"),
		    UNBOUNDED_ADDRESS.withName("layout"),
		    UNBOUNDED_ADDRESS.withName("basePipelineHandle"),
		    JAVA_INT.withName("basePipelineIndex"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkComputePipelineCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layout"));
		BASE_PIPELINE_HANDLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("basePipelineHandle"));
		BASE_PIPELINE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("basePipelineIndex"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		STAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stage"));
		LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layout"));
		BASE_PIPELINE_HANDLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("basePipelineHandle"));
		BASE_PIPELINE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("basePipelineIndex"));
		//@formatter:on
	}

	public VkComputePipelineCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkComputePipelineCreateInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkComputePipelineCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    stage = new VkPipelineShaderStageCreateInfo(segment.asSlice(STAGE_BYTE_OFFSET, VkPipelineShaderStageCreateInfo.LAYOUT));
	}

    /// @see #sType()
    public VkComputePipelineCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkComputePipelineCreateInfo pNext(MemorySegment pNext) {
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
    public VkComputePipelineCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #stage()
    public VkComputePipelineCreateInfo stage(Consumer<VkPipelineShaderStageCreateInfo> consumer) {
    	consumer.accept(stage);
    	return this;
    }
    
    /// @see #stage()
    public VkComputePipelineCreateInfo stage(VkPipelineShaderStageCreateInfo other) {
    	stage.set(other);
    	return this;
    }
    
    public VkPipelineShaderStageCreateInfo stage() {
    	return stage;
    }
    
    /// @see #layout()
    public VkComputePipelineCreateInfo layout(VkPipelineLayout layout) {
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
    public VkComputePipelineCreateInfo basePipelineHandle(VkPipeline basePipelineHandle) {
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
    public VkComputePipelineCreateInfo basePipelineIndex(int basePipelineIndex) {
    	BASE_PIPELINE_INDEX_HANDLE.set(segment, 0L, basePipelineIndex);
    	return this;
    }
    
    public int basePipelineIndex() {
    	return (int) BASE_PIPELINE_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkComputePipelineCreateInfo set(VkComputePipelineCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkComputePipelineCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkComputePipelineCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkComputePipelineCreateInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkComputePipelineCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkComputePipelineCreateInfo> array(SegmentAllocator allocator, VkComputePipelineCreateInfo... structs) {
        NativeStructArray<VkComputePipelineCreateInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkComputePipelineCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkComputePipelineCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkComputePipelineCreateInfo(segment)
        );
    }

}