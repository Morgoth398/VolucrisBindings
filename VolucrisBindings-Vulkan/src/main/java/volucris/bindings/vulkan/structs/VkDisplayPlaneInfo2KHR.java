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

public final class VkDisplayPlaneInfo2KHR
		implements Struct<VkDisplayPlaneInfo2KHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MODE_HANDLE;
    public static final VarHandle PLANE_INDEX_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MODE_BYTE_OFFSET;
    public static final long PLANE_INDEX_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("mode"),
            JAVA_INT.withName("planeIndex"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkDisplayPlaneInfo2KHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mode"));
        PLANE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("planeIndex"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mode"));
        PLANE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("planeIndex"));
        //@formatter:on
    }

    public VkDisplayPlaneInfo2KHR() {
        this(Arena.ofAuto());
    }
    
    public VkDisplayPlaneInfo2KHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDisplayPlaneInfo2KHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDisplayPlaneInfo2KHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDisplayPlaneInfo2KHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #mode()
    public VkDisplayPlaneInfo2KHR mode(VkDisplayModeKHR mode) {
    	MODE_HANDLE.set(segment, 0L, mode.memorySegment());
    	return this;
    }
    
    public @Nullable VkDisplayModeKHR mode() {
    	MemorySegment segment = (MemorySegment) MODE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDisplayModeKHR(segment);
    }
    
    /// @see #planeIndex()
    public VkDisplayPlaneInfo2KHR planeIndex(int planeIndex) {
    	PLANE_INDEX_HANDLE.set(segment, 0L, planeIndex);
    	return this;
    }
    
    public int planeIndex() {
    	return (int) PLANE_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDisplayPlaneInfo2KHR set(VkDisplayPlaneInfo2KHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDisplayPlaneInfo2KHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDisplayPlaneInfo2KHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDisplayPlaneInfo2KHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayPlaneInfo2KHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDisplayPlaneInfo2KHR> array(Arena arena, VkDisplayPlaneInfo2KHR... structs) {
        NativeStructArray<VkDisplayPlaneInfo2KHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayPlaneInfo2KHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDisplayPlaneInfo2KHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDisplayPlaneInfo2KHR(segment)
        );
    }
    
}