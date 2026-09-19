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

public final class VkViewportWScalingNV
		implements Struct<VkViewportWScalingNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle XCOEFF_HANDLE;
    public static final VarHandle YCOEFF_HANDLE;

    public static final long XCOEFF_BYTE_OFFSET;
    public static final long YCOEFF_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("xcoeff"),
            JAVA_FLOAT.withName("ycoeff")
        ).withName("VkViewportWScalingNV").withByteAlignment(4);
        
        XCOEFF_HANDLE = LAYOUT.varHandle(PathElement.groupElement("xcoeff"));
        YCOEFF_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ycoeff"));
        
        XCOEFF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("xcoeff"));
        YCOEFF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ycoeff"));
        //@formatter:on
    }

    public VkViewportWScalingNV() {
        this(Arena.ofAuto());
    }
    
    public VkViewportWScalingNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkViewportWScalingNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #xcoeff()
    public VkViewportWScalingNV xcoeff(float xcoeff) {
    	XCOEFF_HANDLE.set(segment, 0L, xcoeff);
    	return this;
    }
    
    public float xcoeff() {
    	return (float) XCOEFF_HANDLE.get(segment, 0L);
    }
    
    /// @see #ycoeff()
    public VkViewportWScalingNV ycoeff(float ycoeff) {
    	YCOEFF_HANDLE.set(segment, 0L, ycoeff);
    	return this;
    }
    
    public float ycoeff() {
    	return (float) YCOEFF_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkViewportWScalingNV set(VkViewportWScalingNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkViewportWScalingNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkViewportWScalingNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkViewportWScalingNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkViewportWScalingNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkViewportWScalingNV> array(Arena arena, VkViewportWScalingNV... structs) {
        NativeStructArray<VkViewportWScalingNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkViewportWScalingNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkViewportWScalingNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkViewportWScalingNV(segment)
        );
    }
    
}