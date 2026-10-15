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

public final class VkIndirectCommandsLayoutCreateInfoEXT
		implements Struct<VkIndirectCommandsLayoutCreateInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle SHADER_STAGES_HANDLE;
	public static final VarHandle INDIRECT_STRIDE_HANDLE;
	public static final VarHandle PIPELINE_LAYOUT_HANDLE;
	public static final VarHandle TOKEN_COUNT_HANDLE;
	public static final VarHandle P_TOKENS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long SHADER_STAGES_BYTE_OFFSET;
	public static final long INDIRECT_STRIDE_BYTE_OFFSET;
	public static final long PIPELINE_LAYOUT_BYTE_OFFSET;
	public static final long TOKEN_COUNT_BYTE_OFFSET;
	public static final long P_TOKENS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("shaderStages"),
		    JAVA_INT.withName("indirectStride"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pipelineLayout"),
		    JAVA_INT.withName("tokenCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pTokens")
		).withName("VkIndirectCommandsLayoutCreateInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		SHADER_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStages"));
		INDIRECT_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indirectStride"));
		PIPELINE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineLayout"));
		TOKEN_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tokenCount"));
		P_TOKENS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTokens"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		SHADER_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStages"));
		INDIRECT_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indirectStride"));
		PIPELINE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineLayout"));
		TOKEN_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tokenCount"));
		P_TOKENS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTokens"));
		//@formatter:on
	}

	public VkIndirectCommandsLayoutCreateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkIndirectCommandsLayoutCreateInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkIndirectCommandsLayoutCreateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkIndirectCommandsLayoutCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkIndirectCommandsLayoutCreateInfoEXT pNext(MemorySegment pNext) {
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
    public VkIndirectCommandsLayoutCreateInfoEXT flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStages()
    public VkIndirectCommandsLayoutCreateInfoEXT shaderStages(int shaderStages) {
    	SHADER_STAGES_HANDLE.set(segment, 0L, shaderStages);
    	return this;
    }
    
    public int shaderStages() {
    	return (int) SHADER_STAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #indirectStride()
    public VkIndirectCommandsLayoutCreateInfoEXT indirectStride(int indirectStride) {
    	INDIRECT_STRIDE_HANDLE.set(segment, 0L, indirectStride);
    	return this;
    }
    
    public int indirectStride() {
    	return (int) INDIRECT_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipelineLayout()
    public VkIndirectCommandsLayoutCreateInfoEXT pipelineLayout(VkPipelineLayout pipelineLayout) {
    	PIPELINE_LAYOUT_HANDLE.set(segment, 0L, pipelineLayout.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineLayout pipelineLayout() {
    	MemorySegment segment = (MemorySegment) PIPELINE_LAYOUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineLayout(segment);
    }
    
    /// @see #tokenCount()
    public VkIndirectCommandsLayoutCreateInfoEXT tokenCount(int tokenCount) {
    	TOKEN_COUNT_HANDLE.set(segment, 0L, tokenCount);
    	return this;
    }
    
    public int tokenCount() {
    	return (int) TOKEN_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pTokens()
    public VkIndirectCommandsLayoutCreateInfoEXT pTokens(NativeStructArray<VkIndirectCommandsLayoutTokenEXT> pTokens) {
    	P_TOKENS_HANDLE.set(segment, 0L, pTokens.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkIndirectCommandsLayoutTokenEXT> pTokens() {
    	MemorySegment segment = (MemorySegment) P_TOKENS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkIndirectCommandsLayoutTokenEXT.array(segment);
    }
    
    @Override
    public VkIndirectCommandsLayoutCreateInfoEXT set(VkIndirectCommandsLayoutCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkIndirectCommandsLayoutCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkIndirectCommandsLayoutCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkIndirectCommandsLayoutCreateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectCommandsLayoutCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkIndirectCommandsLayoutCreateInfoEXT> array(Arena arena, VkIndirectCommandsLayoutCreateInfoEXT... structs) {
        NativeStructArray<VkIndirectCommandsLayoutCreateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectCommandsLayoutCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkIndirectCommandsLayoutCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkIndirectCommandsLayoutCreateInfoEXT(segment)
        );
    }

}