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

public final class VkHostImageLayoutTransitionInfo
		implements Struct<VkHostImageLayoutTransitionInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle IMAGE_HANDLE;
    public static final VarHandle OLD_LAYOUT_HANDLE;
    public static final VarHandle NEW_LAYOUT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long IMAGE_BYTE_OFFSET;
    public static final long OLD_LAYOUT_BYTE_OFFSET;
    public static final long NEW_LAYOUT_BYTE_OFFSET;
    public static final long SUBRESOURCE_RANGE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkImageSubresourceRange subresourceRange;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("image"),
            JAVA_INT.withName("oldLayout"),
            JAVA_INT.withName("newLayout"),
            VkImageSubresourceRange.LAYOUT.withName("subresourceRange"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkHostImageLayoutTransitionInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("image"));
        OLD_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("oldLayout"));
        NEW_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("newLayout"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("image"));
        OLD_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("oldLayout"));
        NEW_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("newLayout"));
        SUBRESOURCE_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subresourceRange"));
        //@formatter:on
    }

    public VkHostImageLayoutTransitionInfo() {
        this(Arena.ofAuto());
    }
    
    public VkHostImageLayoutTransitionInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkHostImageLayoutTransitionInfo(MemorySegment segment) {
        this.segment = segment;
    
        subresourceRange = new VkImageSubresourceRange(segment.asSlice(SUBRESOURCE_RANGE_BYTE_OFFSET, VkImageSubresourceRange.LAYOUT));
    }

    /// @see #sType()
    public VkHostImageLayoutTransitionInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkHostImageLayoutTransitionInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #image()
    public VkHostImageLayoutTransitionInfo image(VkImage image) {
    	IMAGE_HANDLE.set(segment, 0L, image.memorySegment());
    	return this;
    }
    
    public @Nullable VkImage image() {
    	MemorySegment segment = (MemorySegment) IMAGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImage(segment);
    }
    
    /// @see #oldLayout()
    public VkHostImageLayoutTransitionInfo oldLayout(int oldLayout) {
    	OLD_LAYOUT_HANDLE.set(segment, 0L, oldLayout);
    	return this;
    }
    
    public int oldLayout() {
    	return (int) OLD_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #newLayout()
    public VkHostImageLayoutTransitionInfo newLayout(int newLayout) {
    	NEW_LAYOUT_HANDLE.set(segment, 0L, newLayout);
    	return this;
    }
    
    public int newLayout() {
    	return (int) NEW_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #subresourceRange()
    public VkHostImageLayoutTransitionInfo subresourceRange(Consumer<VkImageSubresourceRange> consumer) {
    	consumer.accept(subresourceRange);
    	return this;
    }
    
    /// @see #subresourceRange()
    public VkHostImageLayoutTransitionInfo subresourceRange(VkImageSubresourceRange other) {
    	subresourceRange.set(other);
    	return this;
    }
    
    public VkImageSubresourceRange subresourceRange() {
    	return subresourceRange;
    }
    
    @Override
    public VkHostImageLayoutTransitionInfo set(VkHostImageLayoutTransitionInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkHostImageLayoutTransitionInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkHostImageLayoutTransitionInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkHostImageLayoutTransitionInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkHostImageLayoutTransitionInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkHostImageLayoutTransitionInfo> array(Arena arena, VkHostImageLayoutTransitionInfo... structs) {
        NativeStructArray<VkHostImageLayoutTransitionInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkHostImageLayoutTransitionInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkHostImageLayoutTransitionInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkHostImageLayoutTransitionInfo(segment)
        );
    }
    
}