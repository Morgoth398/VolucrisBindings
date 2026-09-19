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

public final class VkSparseImageFormatProperties2
		implements Struct<VkSparseImageFormatProperties2> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PROPERTIES_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkSparseImageFormatProperties properties;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkSparseImageFormatProperties.LAYOUT.withName("properties"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkSparseImageFormatProperties2").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("properties"));
        //@formatter:on
    }

    public VkSparseImageFormatProperties2() {
        this(Arena.ofAuto());
    }
    
    public VkSparseImageFormatProperties2(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSparseImageFormatProperties2(MemorySegment segment) {
        this.segment = segment;
    
        properties = new VkSparseImageFormatProperties(segment.asSlice(PROPERTIES_BYTE_OFFSET, VkSparseImageFormatProperties.LAYOUT));
    }

    /// @see #sType()
    public VkSparseImageFormatProperties2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSparseImageFormatProperties2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #properties()
    public VkSparseImageFormatProperties2 properties(Consumer<VkSparseImageFormatProperties> consumer) {
    	consumer.accept(properties);
    	return this;
    }
    
    /// @see #properties()
    public VkSparseImageFormatProperties2 properties(VkSparseImageFormatProperties other) {
    	properties.set(other);
    	return this;
    }
    
    public VkSparseImageFormatProperties properties() {
    	return properties;
    }
    
    @Override
    public VkSparseImageFormatProperties2 set(VkSparseImageFormatProperties2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkSparseImageFormatProperties2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSparseImageFormatProperties2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSparseImageFormatProperties2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSparseImageFormatProperties2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSparseImageFormatProperties2> array(Arena arena, VkSparseImageFormatProperties2... structs) {
        NativeStructArray<VkSparseImageFormatProperties2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSparseImageFormatProperties2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSparseImageFormatProperties2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSparseImageFormatProperties2(segment)
        );
    }
    
}