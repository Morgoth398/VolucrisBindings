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

public final class VkTensorRollingBackingCreateInfoARM
		implements Struct<VkTensorRollingBackingCreateInfoARM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle WRAPS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long WRAPS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            MemoryLayout.sequenceLayout(4, JAVA_INT).withName("wraps")
        ).withName("VkTensorRollingBackingCreateInfoARM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        WRAPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("wraps"), PathElement.sequenceElement());
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        WRAPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wraps"));
        //@formatter:on
    }

    public VkTensorRollingBackingCreateInfoARM() {
        this(Arena.ofAuto());
    }
    
    public VkTensorRollingBackingCreateInfoARM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkTensorRollingBackingCreateInfoARM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkTensorRollingBackingCreateInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkTensorRollingBackingCreateInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #wraps(int)
    public VkTensorRollingBackingCreateInfoARM wraps(int wraps, int index0) {
    	WRAPS_HANDLE.set(segment, 0L, index0, wraps);
    	return this;
    }
    
    public int wraps(int index0) {
    	return (int) WRAPS_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkTensorRollingBackingCreateInfoARM set(VkTensorRollingBackingCreateInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkTensorRollingBackingCreateInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkTensorRollingBackingCreateInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkTensorRollingBackingCreateInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTensorRollingBackingCreateInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkTensorRollingBackingCreateInfoARM> array(Arena arena, VkTensorRollingBackingCreateInfoARM... structs) {
        NativeStructArray<VkTensorRollingBackingCreateInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTensorRollingBackingCreateInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkTensorRollingBackingCreateInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkTensorRollingBackingCreateInfoARM(segment)
        );
    }
    
}