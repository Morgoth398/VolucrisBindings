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

public final class VkIndirectCommandsIndexBufferTokenEXT
		implements Struct<VkIndirectCommandsIndexBufferTokenEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MODE_HANDLE;

    public static final long MODE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("mode")
        ).withName("VkIndirectCommandsIndexBufferTokenEXT").withByteAlignment(4);
        
        MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mode"));
        
        MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mode"));
        //@formatter:on
    }

    public VkIndirectCommandsIndexBufferTokenEXT() {
        this(Arena.ofAuto());
    }
    
    public VkIndirectCommandsIndexBufferTokenEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkIndirectCommandsIndexBufferTokenEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #mode()
    public VkIndirectCommandsIndexBufferTokenEXT mode(int mode) {
    	MODE_HANDLE.set(segment, 0L, mode);
    	return this;
    }
    
    public int mode() {
    	return (int) MODE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkIndirectCommandsIndexBufferTokenEXT set(VkIndirectCommandsIndexBufferTokenEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkIndirectCommandsIndexBufferTokenEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkIndirectCommandsIndexBufferTokenEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkIndirectCommandsIndexBufferTokenEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectCommandsIndexBufferTokenEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkIndirectCommandsIndexBufferTokenEXT> array(Arena arena, VkIndirectCommandsIndexBufferTokenEXT... structs) {
        NativeStructArray<VkIndirectCommandsIndexBufferTokenEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectCommandsIndexBufferTokenEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkIndirectCommandsIndexBufferTokenEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkIndirectCommandsIndexBufferTokenEXT(segment)
        );
    }
    
}