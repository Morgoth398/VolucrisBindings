/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkIndirectCommandsPushConstantTokenEXT
		implements Struct<VkIndirectCommandsPushConstantTokenEXT> {

    public static final StructLayout LAYOUT;

    public static final long UPDATE_RANGE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkPushConstantRange updateRange;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            VkPushConstantRange.LAYOUT.withName("updateRange")
        ).withName("VkIndirectCommandsPushConstantTokenEXT").withByteAlignment(4);
        
        UPDATE_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("updateRange"));
        //@formatter:on
    }

    public VkIndirectCommandsPushConstantTokenEXT() {
        this(Arena.ofAuto());
    }
    
    public VkIndirectCommandsPushConstantTokenEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkIndirectCommandsPushConstantTokenEXT(MemorySegment segment) {
        this.segment = segment;
    
        updateRange = new VkPushConstantRange(segment.asSlice(UPDATE_RANGE_BYTE_OFFSET, VkPushConstantRange.LAYOUT));
    }

    /// @see #updateRange()
    public VkIndirectCommandsPushConstantTokenEXT updateRange(Consumer<VkPushConstantRange> consumer) {
    	consumer.accept(updateRange);
    	return this;
    }
    
    /// @see #updateRange()
    public VkIndirectCommandsPushConstantTokenEXT updateRange(VkPushConstantRange other) {
    	updateRange.set(other);
    	return this;
    }
    
    public VkPushConstantRange updateRange() {
    	return updateRange;
    }
    
    @Override
    public VkIndirectCommandsPushConstantTokenEXT set(VkIndirectCommandsPushConstantTokenEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkIndirectCommandsPushConstantTokenEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkIndirectCommandsPushConstantTokenEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkIndirectCommandsPushConstantTokenEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectCommandsPushConstantTokenEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkIndirectCommandsPushConstantTokenEXT> array(Arena arena, VkIndirectCommandsPushConstantTokenEXT... structs) {
        NativeStructArray<VkIndirectCommandsPushConstantTokenEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectCommandsPushConstantTokenEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkIndirectCommandsPushConstantTokenEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkIndirectCommandsPushConstantTokenEXT(segment)
        );
    }
    
}