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

public final class VkIndirectCommandsTokenDataEXT
		implements Struct<VkIndirectCommandsTokenDataEXT> {

    public static final UnionLayout LAYOUT;

    public static final VarHandle P_PUSH_CONSTANT_HANDLE;
    public static final VarHandle P_VERTEX_BUFFER_HANDLE;
    public static final VarHandle P_INDEX_BUFFER_HANDLE;
    public static final VarHandle P_EXECUTION_SET_HANDLE;

    public static final long P_PUSH_CONSTANT_BYTE_OFFSET;
    public static final long P_VERTEX_BUFFER_BYTE_OFFSET;
    public static final long P_INDEX_BUFFER_BYTE_OFFSET;
    public static final long P_EXECUTION_SET_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.unionLayout(
            UNBOUNDED_ADDRESS.withName("pPushConstant"),
            UNBOUNDED_ADDRESS.withName("pVertexBuffer"),
            UNBOUNDED_ADDRESS.withName("pIndexBuffer"),
            UNBOUNDED_ADDRESS.withName("pExecutionSet")
        ).withName("VkIndirectCommandsTokenDataEXT").withByteAlignment(8);
        
        P_PUSH_CONSTANT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPushConstant"));
        P_VERTEX_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pVertexBuffer"));
        P_INDEX_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pIndexBuffer"));
        P_EXECUTION_SET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pExecutionSet"));
        
        P_PUSH_CONSTANT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPushConstant"));
        P_VERTEX_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pVertexBuffer"));
        P_INDEX_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pIndexBuffer"));
        P_EXECUTION_SET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pExecutionSet"));
        //@formatter:on
    }

    public VkIndirectCommandsTokenDataEXT() {
        this(Arena.ofAuto());
    }
    
    public VkIndirectCommandsTokenDataEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkIndirectCommandsTokenDataEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #pPushConstant()
    public VkIndirectCommandsTokenDataEXT pPushConstant(VkIndirectCommandsPushConstantTokenEXT pPushConstant) {
    	P_PUSH_CONSTANT_HANDLE.set(segment, 0L, pPushConstant.memorySegment());
    	return this;
    }
    
    public @Nullable VkIndirectCommandsPushConstantTokenEXT pPushConstant() {
    	MemorySegment segment = (MemorySegment) P_PUSH_CONSTANT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkIndirectCommandsPushConstantTokenEXT(segment);
    }
    
    /// @see #pVertexBuffer()
    public VkIndirectCommandsTokenDataEXT pVertexBuffer(VkIndirectCommandsVertexBufferTokenEXT pVertexBuffer) {
    	P_VERTEX_BUFFER_HANDLE.set(segment, 0L, pVertexBuffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkIndirectCommandsVertexBufferTokenEXT pVertexBuffer() {
    	MemorySegment segment = (MemorySegment) P_VERTEX_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkIndirectCommandsVertexBufferTokenEXT(segment);
    }
    
    /// @see #pIndexBuffer()
    public VkIndirectCommandsTokenDataEXT pIndexBuffer(VkIndirectCommandsIndexBufferTokenEXT pIndexBuffer) {
    	P_INDEX_BUFFER_HANDLE.set(segment, 0L, pIndexBuffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkIndirectCommandsIndexBufferTokenEXT pIndexBuffer() {
    	MemorySegment segment = (MemorySegment) P_INDEX_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkIndirectCommandsIndexBufferTokenEXT(segment);
    }
    
    /// @see #pExecutionSet()
    public VkIndirectCommandsTokenDataEXT pExecutionSet(VkIndirectCommandsExecutionSetTokenEXT pExecutionSet) {
    	P_EXECUTION_SET_HANDLE.set(segment, 0L, pExecutionSet.memorySegment());
    	return this;
    }
    
    public @Nullable VkIndirectCommandsExecutionSetTokenEXT pExecutionSet() {
    	MemorySegment segment = (MemorySegment) P_EXECUTION_SET_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkIndirectCommandsExecutionSetTokenEXT(segment);
    }
    
    @Override
    public VkIndirectCommandsTokenDataEXT set(VkIndirectCommandsTokenDataEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkIndirectCommandsTokenDataEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkIndirectCommandsTokenDataEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkIndirectCommandsTokenDataEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectCommandsTokenDataEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkIndirectCommandsTokenDataEXT> array(Arena arena, VkIndirectCommandsTokenDataEXT... structs) {
        NativeStructArray<VkIndirectCommandsTokenDataEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectCommandsTokenDataEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkIndirectCommandsTokenDataEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkIndirectCommandsTokenDataEXT(segment)
        );
    }
    
}