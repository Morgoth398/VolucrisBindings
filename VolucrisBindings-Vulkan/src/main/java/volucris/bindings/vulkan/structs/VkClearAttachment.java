/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkClearAttachment
		implements Struct<VkClearAttachment> {

    public static final StructLayout LAYOUT;

    public static final VarHandle ASPECT_MASK_HANDLE;
    public static final VarHandle COLOR_ATTACHMENT_HANDLE;

    public static final long ASPECT_MASK_BYTE_OFFSET;
    public static final long COLOR_ATTACHMENT_BYTE_OFFSET;
    public static final long CLEAR_VALUE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkClearValue clearValue;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("aspectMask"),
            JAVA_INT.withName("colorAttachment"),
            VkClearValue.LAYOUT.withName("clearValue")
        ).withName("VkClearAttachment").withByteAlignment(4);
        
        ASPECT_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("aspectMask"));
        COLOR_ATTACHMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("colorAttachment"));
        
        ASPECT_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
        COLOR_ATTACHMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("colorAttachment"));
        CLEAR_VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clearValue"));
        //@formatter:on
    }

    public VkClearAttachment() {
        this(Arena.ofAuto());
    }
    
    public VkClearAttachment(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkClearAttachment(MemorySegment segment) {
        this.segment = segment;
    
        clearValue = new VkClearValue(segment.asSlice(CLEAR_VALUE_BYTE_OFFSET, VkClearValue.LAYOUT));
    }

    /// @see #aspectMask()
    public VkClearAttachment aspectMask(int aspectMask) {
    	ASPECT_MASK_HANDLE.set(segment, 0L, aspectMask);
    	return this;
    }
    
    public int aspectMask() {
    	return (int) ASPECT_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #colorAttachment()
    public VkClearAttachment colorAttachment(int colorAttachment) {
    	COLOR_ATTACHMENT_HANDLE.set(segment, 0L, colorAttachment);
    	return this;
    }
    
    public int colorAttachment() {
    	return (int) COLOR_ATTACHMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #clearValue()
    public VkClearAttachment clearValue(Consumer<VkClearValue> consumer) {
    	consumer.accept(clearValue);
    	return this;
    }
    
    /// @see #clearValue()
    public VkClearAttachment clearValue(VkClearValue other) {
    	clearValue.set(other);
    	return this;
    }
    
    public VkClearValue clearValue() {
    	return clearValue;
    }
    
    @Override
    public VkClearAttachment set(VkClearAttachment other) {
        return set(other.segment);
    }
    
    @Override
    public VkClearAttachment set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkClearAttachment> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkClearAttachment> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClearAttachment(segment),
            count
        );
    }
    
    public static NativeStructArray<VkClearAttachment> array(Arena arena, VkClearAttachment... structs) {
        NativeStructArray<VkClearAttachment> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClearAttachment(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkClearAttachment> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkClearAttachment(segment)
        );
    }
    
}