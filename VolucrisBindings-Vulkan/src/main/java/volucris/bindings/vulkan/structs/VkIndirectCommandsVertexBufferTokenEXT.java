/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkIndirectCommandsVertexBufferTokenEXT
		implements Struct<VkIndirectCommandsVertexBufferTokenEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle VERTEX_BINDING_UNIT_HANDLE;

    public static final long VERTEX_BINDING_UNIT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("vertexBindingUnit")
        ).withName("VkIndirectCommandsVertexBufferTokenEXT").withByteAlignment(4);
        
        VERTEX_BINDING_UNIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexBindingUnit"));
        
        VERTEX_BINDING_UNIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexBindingUnit"));
        //@formatter:on
    }

    public VkIndirectCommandsVertexBufferTokenEXT() {
        this(Arena.ofAuto());
    }
    
    public VkIndirectCommandsVertexBufferTokenEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkIndirectCommandsVertexBufferTokenEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #vertexBindingUnit()
    public VkIndirectCommandsVertexBufferTokenEXT vertexBindingUnit(int vertexBindingUnit) {
    	VERTEX_BINDING_UNIT_HANDLE.set(segment, 0L, vertexBindingUnit);
    	return this;
    }
    
    public int vertexBindingUnit() {
    	return (int) VERTEX_BINDING_UNIT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkIndirectCommandsVertexBufferTokenEXT set(VkIndirectCommandsVertexBufferTokenEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkIndirectCommandsVertexBufferTokenEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkIndirectCommandsVertexBufferTokenEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkIndirectCommandsVertexBufferTokenEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectCommandsVertexBufferTokenEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkIndirectCommandsVertexBufferTokenEXT> array(Arena arena, VkIndirectCommandsVertexBufferTokenEXT... structs) {
        NativeStructArray<VkIndirectCommandsVertexBufferTokenEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectCommandsVertexBufferTokenEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkIndirectCommandsVertexBufferTokenEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkIndirectCommandsVertexBufferTokenEXT(segment)
        );
    }
    
}