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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkIndirectCommandsLayoutTokenNV
		implements Struct<VkIndirectCommandsLayoutTokenNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TOKEN_TYPE_HANDLE;
	public static final VarHandle STREAM_HANDLE;
	public static final VarHandle OFFSET_HANDLE;
	public static final VarHandle VERTEX_BINDING_UNIT_HANDLE;
	public static final VarHandle VERTEX_DYNAMIC_STRIDE_HANDLE;
	public static final VarHandle PUSHCONSTANT_PIPELINE_LAYOUT_HANDLE;
	public static final VarHandle PUSHCONSTANT_SHADER_STAGE_FLAGS_HANDLE;
	public static final VarHandle PUSHCONSTANT_OFFSET_HANDLE;
	public static final VarHandle PUSHCONSTANT_SIZE_HANDLE;
	public static final VarHandle INDIRECT_STATE_FLAGS_HANDLE;
	public static final VarHandle INDEX_TYPE_COUNT_HANDLE;
	public static final VarHandle P_INDEX_TYPES_HANDLE;
	public static final VarHandle P_INDEX_TYPE_VALUES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TOKEN_TYPE_BYTE_OFFSET;
	public static final long STREAM_BYTE_OFFSET;
	public static final long OFFSET_BYTE_OFFSET;
	public static final long VERTEX_BINDING_UNIT_BYTE_OFFSET;
	public static final long VERTEX_DYNAMIC_STRIDE_BYTE_OFFSET;
	public static final long PUSHCONSTANT_PIPELINE_LAYOUT_BYTE_OFFSET;
	public static final long PUSHCONSTANT_SHADER_STAGE_FLAGS_BYTE_OFFSET;
	public static final long PUSHCONSTANT_OFFSET_BYTE_OFFSET;
	public static final long PUSHCONSTANT_SIZE_BYTE_OFFSET;
	public static final long INDIRECT_STATE_FLAGS_BYTE_OFFSET;
	public static final long INDEX_TYPE_COUNT_BYTE_OFFSET;
	public static final long P_INDEX_TYPES_BYTE_OFFSET;
	public static final long P_INDEX_TYPE_VALUES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("tokenType"),
		    JAVA_INT.withName("stream"),
		    JAVA_INT.withName("offset"),
		    JAVA_INT.withName("vertexBindingUnit"),
		    JAVA_INT.withName("vertexDynamicStride"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pushconstantPipelineLayout"),
		    JAVA_INT.withName("pushconstantShaderStageFlags"),
		    JAVA_INT.withName("pushconstantOffset"),
		    JAVA_INT.withName("pushconstantSize"),
		    JAVA_INT.withName("indirectStateFlags"),
		    JAVA_INT.withName("indexTypeCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pIndexTypes"),
		    UNBOUNDED_ADDRESS.withName("pIndexTypeValues")
		).withName("VkIndirectCommandsLayoutTokenNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TOKEN_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tokenType"));
		STREAM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stream"));
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		VERTEX_BINDING_UNIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexBindingUnit"));
		VERTEX_DYNAMIC_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexDynamicStride"));
		PUSHCONSTANT_PIPELINE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushconstantPipelineLayout"));
		PUSHCONSTANT_SHADER_STAGE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushconstantShaderStageFlags"));
		PUSHCONSTANT_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushconstantOffset"));
		PUSHCONSTANT_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushconstantSize"));
		INDIRECT_STATE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indirectStateFlags"));
		INDEX_TYPE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexTypeCount"));
		P_INDEX_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pIndexTypes"));
		P_INDEX_TYPE_VALUES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pIndexTypeValues"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TOKEN_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tokenType"));
		STREAM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stream"));
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		VERTEX_BINDING_UNIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexBindingUnit"));
		VERTEX_DYNAMIC_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexDynamicStride"));
		PUSHCONSTANT_PIPELINE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushconstantPipelineLayout"));
		PUSHCONSTANT_SHADER_STAGE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushconstantShaderStageFlags"));
		PUSHCONSTANT_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushconstantOffset"));
		PUSHCONSTANT_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushconstantSize"));
		INDIRECT_STATE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indirectStateFlags"));
		INDEX_TYPE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexTypeCount"));
		P_INDEX_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pIndexTypes"));
		P_INDEX_TYPE_VALUES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pIndexTypeValues"));
		//@formatter:on
	}

	public VkIndirectCommandsLayoutTokenNV() {
	    this(Arena.ofAuto());
	}
	
	public VkIndirectCommandsLayoutTokenNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkIndirectCommandsLayoutTokenNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkIndirectCommandsLayoutTokenNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkIndirectCommandsLayoutTokenNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #tokenType()
    public VkIndirectCommandsLayoutTokenNV tokenType(int tokenType) {
    	TOKEN_TYPE_HANDLE.set(segment, 0L, tokenType);
    	return this;
    }
    
    public int tokenType() {
    	return (int) TOKEN_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #stream()
    public VkIndirectCommandsLayoutTokenNV stream(int stream) {
    	STREAM_HANDLE.set(segment, 0L, stream);
    	return this;
    }
    
    public int stream() {
    	return (int) STREAM_HANDLE.get(segment, 0L);
    }
    
    /// @see #offset()
    public VkIndirectCommandsLayoutTokenNV offset(int offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public int offset() {
    	return (int) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexBindingUnit()
    public VkIndirectCommandsLayoutTokenNV vertexBindingUnit(int vertexBindingUnit) {
    	VERTEX_BINDING_UNIT_HANDLE.set(segment, 0L, vertexBindingUnit);
    	return this;
    }
    
    public int vertexBindingUnit() {
    	return (int) VERTEX_BINDING_UNIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexDynamicStride()
    public VkIndirectCommandsLayoutTokenNV vertexDynamicStride(int vertexDynamicStride) {
    	VERTEX_DYNAMIC_STRIDE_HANDLE.set(segment, 0L, vertexDynamicStride);
    	return this;
    }
    
    public int vertexDynamicStride() {
    	return (int) VERTEX_DYNAMIC_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pushconstantPipelineLayout()
    public VkIndirectCommandsLayoutTokenNV pushconstantPipelineLayout(VkPipelineLayout pushconstantPipelineLayout) {
    	PUSHCONSTANT_PIPELINE_LAYOUT_HANDLE.set(segment, 0L, pushconstantPipelineLayout.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineLayout pushconstantPipelineLayout() {
    	MemorySegment segment = (MemorySegment) PUSHCONSTANT_PIPELINE_LAYOUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineLayout(segment);
    }
    
    /// @see #pushconstantShaderStageFlags()
    public VkIndirectCommandsLayoutTokenNV pushconstantShaderStageFlags(int pushconstantShaderStageFlags) {
    	PUSHCONSTANT_SHADER_STAGE_FLAGS_HANDLE.set(segment, 0L, pushconstantShaderStageFlags);
    	return this;
    }
    
    public int pushconstantShaderStageFlags() {
    	return (int) PUSHCONSTANT_SHADER_STAGE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pushconstantOffset()
    public VkIndirectCommandsLayoutTokenNV pushconstantOffset(int pushconstantOffset) {
    	PUSHCONSTANT_OFFSET_HANDLE.set(segment, 0L, pushconstantOffset);
    	return this;
    }
    
    public int pushconstantOffset() {
    	return (int) PUSHCONSTANT_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #pushconstantSize()
    public VkIndirectCommandsLayoutTokenNV pushconstantSize(int pushconstantSize) {
    	PUSHCONSTANT_SIZE_HANDLE.set(segment, 0L, pushconstantSize);
    	return this;
    }
    
    public int pushconstantSize() {
    	return (int) PUSHCONSTANT_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #indirectStateFlags()
    public VkIndirectCommandsLayoutTokenNV indirectStateFlags(int indirectStateFlags) {
    	INDIRECT_STATE_FLAGS_HANDLE.set(segment, 0L, indirectStateFlags);
    	return this;
    }
    
    public int indirectStateFlags() {
    	return (int) INDIRECT_STATE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexTypeCount()
    public VkIndirectCommandsLayoutTokenNV indexTypeCount(int indexTypeCount) {
    	INDEX_TYPE_COUNT_HANDLE.set(segment, 0L, indexTypeCount);
    	return this;
    }
    
    public int indexTypeCount() {
    	return (int) INDEX_TYPE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pIndexTypes()
    public VkIndirectCommandsLayoutTokenNV pIndexTypes(NativeIntArray pIndexTypes) {
    	P_INDEX_TYPES_HANDLE.set(segment, 0L, pIndexTypes.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pIndexTypes() {
    	MemorySegment segment = (MemorySegment) P_INDEX_TYPES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #pIndexTypeValues()
    public VkIndirectCommandsLayoutTokenNV pIndexTypeValues(NativeIntArray pIndexTypeValues) {
    	P_INDEX_TYPE_VALUES_HANDLE.set(segment, 0L, pIndexTypeValues.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pIndexTypeValues() {
    	MemorySegment segment = (MemorySegment) P_INDEX_TYPE_VALUES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkIndirectCommandsLayoutTokenNV set(VkIndirectCommandsLayoutTokenNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkIndirectCommandsLayoutTokenNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkIndirectCommandsLayoutTokenNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkIndirectCommandsLayoutTokenNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectCommandsLayoutTokenNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkIndirectCommandsLayoutTokenNV> array(Arena arena, VkIndirectCommandsLayoutTokenNV... structs) {
        NativeStructArray<VkIndirectCommandsLayoutTokenNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectCommandsLayoutTokenNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkIndirectCommandsLayoutTokenNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkIndirectCommandsLayoutTokenNV(segment)
        );
    }

}