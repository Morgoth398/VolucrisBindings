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

public final class VkSubresourceLayout2
		implements Struct<VkSubresourceLayout2> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SUBRESOURCE_LAYOUT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkSubresourceLayout subresourceLayout;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkSubresourceLayout.LAYOUT.withName("subresourceLayout")
        ).withName("VkSubresourceLayout2").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SUBRESOURCE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subresourceLayout"));
        //@formatter:on
    }

    public VkSubresourceLayout2() {
        this(Arena.ofAuto());
    }
    
    public VkSubresourceLayout2(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSubresourceLayout2(MemorySegment segment) {
        this.segment = segment;
    
        subresourceLayout = new VkSubresourceLayout(segment.asSlice(SUBRESOURCE_LAYOUT_BYTE_OFFSET, VkSubresourceLayout.LAYOUT));
    }

    /// @see #sType()
    public VkSubresourceLayout2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSubresourceLayout2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #subresourceLayout()
    public VkSubresourceLayout2 subresourceLayout(Consumer<VkSubresourceLayout> consumer) {
    	consumer.accept(subresourceLayout);
    	return this;
    }
    
    /// @see #subresourceLayout()
    public VkSubresourceLayout2 subresourceLayout(VkSubresourceLayout other) {
    	subresourceLayout.set(other);
    	return this;
    }
    
    public VkSubresourceLayout subresourceLayout() {
    	return subresourceLayout;
    }
    
    @Override
    public VkSubresourceLayout2 set(VkSubresourceLayout2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkSubresourceLayout2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSubresourceLayout2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSubresourceLayout2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSubresourceLayout2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSubresourceLayout2> array(Arena arena, VkSubresourceLayout2... structs) {
        NativeStructArray<VkSubresourceLayout2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSubresourceLayout2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSubresourceLayout2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSubresourceLayout2(segment)
        );
    }
    
}