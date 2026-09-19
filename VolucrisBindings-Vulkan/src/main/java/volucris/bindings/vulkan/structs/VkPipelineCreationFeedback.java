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

public final class VkPipelineCreationFeedback
		implements Struct<VkPipelineCreationFeedback> {

    public static final StructLayout LAYOUT;

    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle DURATION_HANDLE;

    public static final long FLAGS_BYTE_OFFSET;
    public static final long DURATION_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("flags"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("duration")
        ).withName("VkPipelineCreationFeedback").withByteAlignment(8);
        
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        DURATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("duration"));
        
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        DURATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("duration"));
        //@formatter:on
    }

    public VkPipelineCreationFeedback() {
        this(Arena.ofAuto());
    }
    
    public VkPipelineCreationFeedback(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPipelineCreationFeedback(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #flags()
    public VkPipelineCreationFeedback flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #duration()
    public VkPipelineCreationFeedback duration(long duration) {
    	DURATION_HANDLE.set(segment, 0L, duration);
    	return this;
    }
    
    public long duration() {
    	return (long) DURATION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPipelineCreationFeedback set(VkPipelineCreationFeedback other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineCreationFeedback set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineCreationFeedback> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineCreationFeedback> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineCreationFeedback(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineCreationFeedback> array(Arena arena, VkPipelineCreationFeedback... structs) {
        NativeStructArray<VkPipelineCreationFeedback> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineCreationFeedback(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineCreationFeedback> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineCreationFeedback(segment)
        );
    }
    
}