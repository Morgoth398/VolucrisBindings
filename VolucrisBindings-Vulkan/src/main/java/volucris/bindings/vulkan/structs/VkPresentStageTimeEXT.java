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

public final class VkPresentStageTimeEXT
		implements Struct<VkPresentStageTimeEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle STAGE_HANDLE;
    public static final VarHandle TIME_HANDLE;

    public static final long STAGE_BYTE_OFFSET;
    public static final long TIME_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("stage"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("time")
        ).withName("VkPresentStageTimeEXT").withByteAlignment(8);
        
        STAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stage"));
        TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("time"));
        
        STAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stage"));
        TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("time"));
        //@formatter:on
    }

    public VkPresentStageTimeEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPresentStageTimeEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPresentStageTimeEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #stage()
    public VkPresentStageTimeEXT stage(int stage) {
    	STAGE_HANDLE.set(segment, 0L, stage);
    	return this;
    }
    
    public int stage() {
    	return (int) STAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #time()
    public VkPresentStageTimeEXT time(long time) {
    	TIME_HANDLE.set(segment, 0L, time);
    	return this;
    }
    
    public long time() {
    	return (long) TIME_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPresentStageTimeEXT set(VkPresentStageTimeEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPresentStageTimeEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPresentStageTimeEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPresentStageTimeEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPresentStageTimeEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPresentStageTimeEXT> array(Arena arena, VkPresentStageTimeEXT... structs) {
        NativeStructArray<VkPresentStageTimeEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPresentStageTimeEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPresentStageTimeEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPresentStageTimeEXT(segment)
        );
    }
    
}