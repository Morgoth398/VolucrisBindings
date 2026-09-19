/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkRenderPassFragmentDensityMapOffsetEndInfoEXT
		implements Struct<VkRenderPassFragmentDensityMapOffsetEndInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FRAGMENT_DENSITY_OFFSET_COUNT_HANDLE;
    public static final VarHandle P_FRAGMENT_DENSITY_OFFSETS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FRAGMENT_DENSITY_OFFSET_COUNT_BYTE_OFFSET;
    public static final long P_FRAGMENT_DENSITY_OFFSETS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("fragmentDensityOffsetCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pFragmentDensityOffsets")
        ).withName("VkRenderPassFragmentDensityMapOffsetEndInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FRAGMENT_DENSITY_OFFSET_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentDensityOffsetCount"));
        P_FRAGMENT_DENSITY_OFFSETS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pFragmentDensityOffsets"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FRAGMENT_DENSITY_OFFSET_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityOffsetCount"));
        P_FRAGMENT_DENSITY_OFFSETS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pFragmentDensityOffsets"));
        //@formatter:on
    }

    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #fragmentDensityOffsetCount()
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT fragmentDensityOffsetCount(int fragmentDensityOffsetCount) {
    	FRAGMENT_DENSITY_OFFSET_COUNT_HANDLE.set(segment, 0L, fragmentDensityOffsetCount);
    	return this;
    }
    
    public int fragmentDensityOffsetCount() {
    	return (int) FRAGMENT_DENSITY_OFFSET_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pFragmentDensityOffsets()
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT pFragmentDensityOffsets(NativeStructArray<VkOffset2D> pFragmentDensityOffsets) {
    	P_FRAGMENT_DENSITY_OFFSETS_HANDLE.set(segment, 0L, pFragmentDensityOffsets.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkOffset2D> pFragmentDensityOffsets() {
    	MemorySegment segment = (MemorySegment) P_FRAGMENT_DENSITY_OFFSETS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkOffset2D.array(segment);
    }
    
    @Override
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT set(VkRenderPassFragmentDensityMapOffsetEndInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderPassFragmentDensityMapOffsetEndInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderPassFragmentDensityMapOffsetEndInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderPassFragmentDensityMapOffsetEndInfoEXT> array(Arena arena, VkRenderPassFragmentDensityMapOffsetEndInfoEXT... structs) {
        NativeStructArray<VkRenderPassFragmentDensityMapOffsetEndInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderPassFragmentDensityMapOffsetEndInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(segment)
        );
    }
    
}