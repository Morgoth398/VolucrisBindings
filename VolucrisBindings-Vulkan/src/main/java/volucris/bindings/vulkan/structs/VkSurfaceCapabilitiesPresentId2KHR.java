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

public final class VkSurfaceCapabilitiesPresentId2KHR
		implements Struct<VkSurfaceCapabilitiesPresentId2KHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PRESENT_ID2_SUPPORTED_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PRESENT_ID2_SUPPORTED_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("presentId2Supported"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkSurfaceCapabilitiesPresentId2KHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PRESENT_ID2_SUPPORTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentId2Supported"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PRESENT_ID2_SUPPORTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentId2Supported"));
        //@formatter:on
    }

    public VkSurfaceCapabilitiesPresentId2KHR() {
        this(Arena.ofAuto());
    }
    
    public VkSurfaceCapabilitiesPresentId2KHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSurfaceCapabilitiesPresentId2KHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkSurfaceCapabilitiesPresentId2KHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSurfaceCapabilitiesPresentId2KHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #presentId2Supported()
    public VkSurfaceCapabilitiesPresentId2KHR presentId2Supported(int presentId2Supported) {
    	PRESENT_ID2_SUPPORTED_HANDLE.set(segment, 0L, presentId2Supported);
    	return this;
    }
    
    public int presentId2Supported() {
    	return (int) PRESENT_ID2_SUPPORTED_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSurfaceCapabilitiesPresentId2KHR set(VkSurfaceCapabilitiesPresentId2KHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkSurfaceCapabilitiesPresentId2KHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSurfaceCapabilitiesPresentId2KHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSurfaceCapabilitiesPresentId2KHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSurfaceCapabilitiesPresentId2KHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSurfaceCapabilitiesPresentId2KHR> array(Arena arena, VkSurfaceCapabilitiesPresentId2KHR... structs) {
        NativeStructArray<VkSurfaceCapabilitiesPresentId2KHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSurfaceCapabilitiesPresentId2KHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSurfaceCapabilitiesPresentId2KHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSurfaceCapabilitiesPresentId2KHR(segment)
        );
    }
    
}