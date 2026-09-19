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

public final class VkDepthClampRangeEXT
		implements Struct<VkDepthClampRangeEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MIN_DEPTH_CLAMP_HANDLE;
    public static final VarHandle MAX_DEPTH_CLAMP_HANDLE;

    public static final long MIN_DEPTH_CLAMP_BYTE_OFFSET;
    public static final long MAX_DEPTH_CLAMP_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("minDepthClamp"),
            JAVA_FLOAT.withName("maxDepthClamp")
        ).withName("VkDepthClampRangeEXT").withByteAlignment(4);
        
        MIN_DEPTH_CLAMP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minDepthClamp"));
        MAX_DEPTH_CLAMP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDepthClamp"));
        
        MIN_DEPTH_CLAMP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minDepthClamp"));
        MAX_DEPTH_CLAMP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDepthClamp"));
        //@formatter:on
    }

    public VkDepthClampRangeEXT() {
        this(Arena.ofAuto());
    }
    
    public VkDepthClampRangeEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDepthClampRangeEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #minDepthClamp()
    public VkDepthClampRangeEXT minDepthClamp(float minDepthClamp) {
    	MIN_DEPTH_CLAMP_HANDLE.set(segment, 0L, minDepthClamp);
    	return this;
    }
    
    public float minDepthClamp() {
    	return (float) MIN_DEPTH_CLAMP_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDepthClamp()
    public VkDepthClampRangeEXT maxDepthClamp(float maxDepthClamp) {
    	MAX_DEPTH_CLAMP_HANDLE.set(segment, 0L, maxDepthClamp);
    	return this;
    }
    
    public float maxDepthClamp() {
    	return (float) MAX_DEPTH_CLAMP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDepthClampRangeEXT set(VkDepthClampRangeEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDepthClampRangeEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDepthClampRangeEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDepthClampRangeEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDepthClampRangeEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDepthClampRangeEXT> array(Arena arena, VkDepthClampRangeEXT... structs) {
        NativeStructArray<VkDepthClampRangeEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDepthClampRangeEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDepthClampRangeEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDepthClampRangeEXT(segment)
        );
    }
    
}