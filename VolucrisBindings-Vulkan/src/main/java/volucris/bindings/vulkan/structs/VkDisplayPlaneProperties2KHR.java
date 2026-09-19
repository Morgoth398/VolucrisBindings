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

public final class VkDisplayPlaneProperties2KHR
		implements Struct<VkDisplayPlaneProperties2KHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long DISPLAY_PLANE_PROPERTIES_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkDisplayPlanePropertiesKHR displayPlaneProperties;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkDisplayPlanePropertiesKHR.LAYOUT.withName("displayPlaneProperties")
        ).withName("VkDisplayPlaneProperties2KHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        DISPLAY_PLANE_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("displayPlaneProperties"));
        //@formatter:on
    }

    public VkDisplayPlaneProperties2KHR() {
        this(Arena.ofAuto());
    }
    
    public VkDisplayPlaneProperties2KHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDisplayPlaneProperties2KHR(MemorySegment segment) {
        this.segment = segment;
    
        displayPlaneProperties = new VkDisplayPlanePropertiesKHR(segment.asSlice(DISPLAY_PLANE_PROPERTIES_BYTE_OFFSET, VkDisplayPlanePropertiesKHR.LAYOUT));
    }

    /// @see #sType()
    public VkDisplayPlaneProperties2KHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDisplayPlaneProperties2KHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #displayPlaneProperties()
    public VkDisplayPlaneProperties2KHR displayPlaneProperties(Consumer<VkDisplayPlanePropertiesKHR> consumer) {
    	consumer.accept(displayPlaneProperties);
    	return this;
    }
    
    /// @see #displayPlaneProperties()
    public VkDisplayPlaneProperties2KHR displayPlaneProperties(VkDisplayPlanePropertiesKHR other) {
    	displayPlaneProperties.set(other);
    	return this;
    }
    
    public VkDisplayPlanePropertiesKHR displayPlaneProperties() {
    	return displayPlaneProperties;
    }
    
    @Override
    public VkDisplayPlaneProperties2KHR set(VkDisplayPlaneProperties2KHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDisplayPlaneProperties2KHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDisplayPlaneProperties2KHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDisplayPlaneProperties2KHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayPlaneProperties2KHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDisplayPlaneProperties2KHR> array(Arena arena, VkDisplayPlaneProperties2KHR... structs) {
        NativeStructArray<VkDisplayPlaneProperties2KHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayPlaneProperties2KHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDisplayPlaneProperties2KHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDisplayPlaneProperties2KHR(segment)
        );
    }
    
}