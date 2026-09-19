/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkSurfaceCapabilities2KHR
		implements Struct<VkSurfaceCapabilities2KHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SURFACE_CAPABILITIES_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkSurfaceCapabilitiesKHR surfaceCapabilities;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkSurfaceCapabilitiesKHR.LAYOUT.withName("surfaceCapabilities"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkSurfaceCapabilities2KHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SURFACE_CAPABILITIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("surfaceCapabilities"));
        //@formatter:on
    }

    public VkSurfaceCapabilities2KHR() {
        this(Arena.ofAuto());
    }
    
    public VkSurfaceCapabilities2KHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSurfaceCapabilities2KHR(MemorySegment segment) {
        this.segment = segment;
    
        surfaceCapabilities = new VkSurfaceCapabilitiesKHR(segment.asSlice(SURFACE_CAPABILITIES_BYTE_OFFSET, VkSurfaceCapabilitiesKHR.LAYOUT));
    }

    /// @see #sType()
    public VkSurfaceCapabilities2KHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSurfaceCapabilities2KHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #surfaceCapabilities()
    public VkSurfaceCapabilities2KHR surfaceCapabilities(Consumer<VkSurfaceCapabilitiesKHR> consumer) {
    	consumer.accept(surfaceCapabilities);
    	return this;
    }
    
    /// @see #surfaceCapabilities()
    public VkSurfaceCapabilities2KHR surfaceCapabilities(VkSurfaceCapabilitiesKHR other) {
    	surfaceCapabilities.set(other);
    	return this;
    }
    
    public VkSurfaceCapabilitiesKHR surfaceCapabilities() {
    	return surfaceCapabilities;
    }
    
    @Override
    public VkSurfaceCapabilities2KHR set(VkSurfaceCapabilities2KHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkSurfaceCapabilities2KHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSurfaceCapabilities2KHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSurfaceCapabilities2KHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSurfaceCapabilities2KHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSurfaceCapabilities2KHR> array(Arena arena, VkSurfaceCapabilities2KHR... structs) {
        NativeStructArray<VkSurfaceCapabilities2KHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSurfaceCapabilities2KHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSurfaceCapabilities2KHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSurfaceCapabilities2KHR(segment)
        );
    }
    
}