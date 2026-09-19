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

public final class VkImageViewSlicedCreateInfoEXT
		implements Struct<VkImageViewSlicedCreateInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SLICE_OFFSET_HANDLE;
    public static final VarHandle SLICE_COUNT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SLICE_OFFSET_BYTE_OFFSET;
    public static final long SLICE_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("sliceOffset"),
            JAVA_INT.withName("sliceCount")
        ).withName("VkImageViewSlicedCreateInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SLICE_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sliceOffset"));
        SLICE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sliceCount"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SLICE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sliceOffset"));
        SLICE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sliceCount"));
        //@formatter:on
    }

    public VkImageViewSlicedCreateInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkImageViewSlicedCreateInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkImageViewSlicedCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkImageViewSlicedCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageViewSlicedCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #sliceOffset()
    public VkImageViewSlicedCreateInfoEXT sliceOffset(int sliceOffset) {
    	SLICE_OFFSET_HANDLE.set(segment, 0L, sliceOffset);
    	return this;
    }
    
    public int sliceOffset() {
    	return (int) SLICE_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #sliceCount()
    public VkImageViewSlicedCreateInfoEXT sliceCount(int sliceCount) {
    	SLICE_COUNT_HANDLE.set(segment, 0L, sliceCount);
    	return this;
    }
    
    public int sliceCount() {
    	return (int) SLICE_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkImageViewSlicedCreateInfoEXT set(VkImageViewSlicedCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageViewSlicedCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageViewSlicedCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageViewSlicedCreateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageViewSlicedCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageViewSlicedCreateInfoEXT> array(Arena arena, VkImageViewSlicedCreateInfoEXT... structs) {
        NativeStructArray<VkImageViewSlicedCreateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageViewSlicedCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageViewSlicedCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageViewSlicedCreateInfoEXT(segment)
        );
    }
    
}