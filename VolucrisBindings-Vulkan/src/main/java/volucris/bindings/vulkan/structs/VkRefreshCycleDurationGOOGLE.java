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

public final class VkRefreshCycleDurationGOOGLE
		implements Struct<VkRefreshCycleDurationGOOGLE> {

    public static final StructLayout LAYOUT;

    public static final VarHandle REFRESH_DURATION_HANDLE;

    public static final long REFRESH_DURATION_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("refreshDuration")
        ).withName("VkRefreshCycleDurationGOOGLE").withByteAlignment(8);
        
        REFRESH_DURATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("refreshDuration"));
        
        REFRESH_DURATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("refreshDuration"));
        //@formatter:on
    }

    public VkRefreshCycleDurationGOOGLE() {
        this(Arena.ofAuto());
    }
    
    public VkRefreshCycleDurationGOOGLE(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkRefreshCycleDurationGOOGLE(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #refreshDuration()
    public VkRefreshCycleDurationGOOGLE refreshDuration(long refreshDuration) {
    	REFRESH_DURATION_HANDLE.set(segment, 0L, refreshDuration);
    	return this;
    }
    
    public long refreshDuration() {
    	return (long) REFRESH_DURATION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkRefreshCycleDurationGOOGLE set(VkRefreshCycleDurationGOOGLE other) {
        return set(other.segment);
    }
    
    @Override
    public VkRefreshCycleDurationGOOGLE set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRefreshCycleDurationGOOGLE> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRefreshCycleDurationGOOGLE> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRefreshCycleDurationGOOGLE(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRefreshCycleDurationGOOGLE> array(Arena arena, VkRefreshCycleDurationGOOGLE... structs) {
        NativeStructArray<VkRefreshCycleDurationGOOGLE> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRefreshCycleDurationGOOGLE(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRefreshCycleDurationGOOGLE> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRefreshCycleDurationGOOGLE(segment)
        );
    }
    
}