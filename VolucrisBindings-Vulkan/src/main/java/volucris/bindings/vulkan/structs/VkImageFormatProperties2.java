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

public final class VkImageFormatProperties2
		implements Struct<VkImageFormatProperties2> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long IMAGE_FORMAT_PROPERTIES_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkImageFormatProperties imageFormatProperties;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkImageFormatProperties.LAYOUT.withName("imageFormatProperties")
        ).withName("VkImageFormatProperties2").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        IMAGE_FORMAT_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageFormatProperties"));
        //@formatter:on
    }

    public VkImageFormatProperties2() {
        this(Arena.ofAuto());
    }
    
    public VkImageFormatProperties2(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkImageFormatProperties2(MemorySegment segment) {
        this.segment = segment;
    
        imageFormatProperties = new VkImageFormatProperties(segment.asSlice(IMAGE_FORMAT_PROPERTIES_BYTE_OFFSET, VkImageFormatProperties.LAYOUT));
    }

    /// @see #sType()
    public VkImageFormatProperties2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageFormatProperties2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #imageFormatProperties()
    public VkImageFormatProperties2 imageFormatProperties(Consumer<VkImageFormatProperties> consumer) {
    	consumer.accept(imageFormatProperties);
    	return this;
    }
    
    /// @see #imageFormatProperties()
    public VkImageFormatProperties2 imageFormatProperties(VkImageFormatProperties other) {
    	imageFormatProperties.set(other);
    	return this;
    }
    
    public VkImageFormatProperties imageFormatProperties() {
    	return imageFormatProperties;
    }
    
    @Override
    public VkImageFormatProperties2 set(VkImageFormatProperties2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageFormatProperties2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageFormatProperties2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageFormatProperties2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageFormatProperties2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageFormatProperties2> array(Arena arena, VkImageFormatProperties2... structs) {
        NativeStructArray<VkImageFormatProperties2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageFormatProperties2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageFormatProperties2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageFormatProperties2(segment)
        );
    }
    
}