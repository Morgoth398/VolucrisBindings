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

public final class VkSetStateFlagsIndirectCommandNV
		implements Struct<VkSetStateFlagsIndirectCommandNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle DATA_HANDLE;

    public static final long DATA_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("data")
        ).withName("VkSetStateFlagsIndirectCommandNV").withByteAlignment(4);
        
        DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("data"));
        
        DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
        //@formatter:on
    }

    public VkSetStateFlagsIndirectCommandNV() {
        this(Arena.ofAuto());
    }
    
    public VkSetStateFlagsIndirectCommandNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSetStateFlagsIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #data()
    public VkSetStateFlagsIndirectCommandNV data(int data) {
    	DATA_HANDLE.set(segment, 0L, data);
    	return this;
    }
    
    public int data() {
    	return (int) DATA_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSetStateFlagsIndirectCommandNV set(VkSetStateFlagsIndirectCommandNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkSetStateFlagsIndirectCommandNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSetStateFlagsIndirectCommandNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSetStateFlagsIndirectCommandNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSetStateFlagsIndirectCommandNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSetStateFlagsIndirectCommandNV> array(Arena arena, VkSetStateFlagsIndirectCommandNV... structs) {
        NativeStructArray<VkSetStateFlagsIndirectCommandNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSetStateFlagsIndirectCommandNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSetStateFlagsIndirectCommandNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSetStateFlagsIndirectCommandNV(segment)
        );
    }
    
}