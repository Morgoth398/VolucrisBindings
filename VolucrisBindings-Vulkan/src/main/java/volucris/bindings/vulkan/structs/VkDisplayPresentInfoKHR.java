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

public final class VkDisplayPresentInfoKHR
		implements Struct<VkDisplayPresentInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PERSISTENT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SRC_RECT_BYTE_OFFSET;
    public static final long DST_RECT_BYTE_OFFSET;
    public static final long PERSISTENT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkRect2D srcRect;
    private final VkRect2D dstRect;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkRect2D.LAYOUT.withName("srcRect"),
            VkRect2D.LAYOUT.withName("dstRect"),
            JAVA_INT.withName("persistent"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkDisplayPresentInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PERSISTENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("persistent"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SRC_RECT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcRect"));
        DST_RECT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstRect"));
        PERSISTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("persistent"));
        //@formatter:on
    }

    public VkDisplayPresentInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkDisplayPresentInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDisplayPresentInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
        srcRect = new VkRect2D(segment.asSlice(SRC_RECT_BYTE_OFFSET, VkRect2D.LAYOUT));
        dstRect = new VkRect2D(segment.asSlice(DST_RECT_BYTE_OFFSET, VkRect2D.LAYOUT));
    }

    /// @see #sType()
    public VkDisplayPresentInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDisplayPresentInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #persistent()
    public VkDisplayPresentInfoKHR persistent(int persistent) {
    	PERSISTENT_HANDLE.set(segment, 0L, persistent);
    	return this;
    }
    
    public int persistent() {
    	return (int) PERSISTENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcRect()
    public VkDisplayPresentInfoKHR srcRect(Consumer<VkRect2D> consumer) {
    	consumer.accept(srcRect);
    	return this;
    }
    
    /// @see #srcRect()
    public VkDisplayPresentInfoKHR srcRect(VkRect2D other) {
    	srcRect.set(other);
    	return this;
    }
    
    public VkRect2D srcRect() {
    	return srcRect;
    }
    
    /// @see #dstRect()
    public VkDisplayPresentInfoKHR dstRect(Consumer<VkRect2D> consumer) {
    	consumer.accept(dstRect);
    	return this;
    }
    
    /// @see #dstRect()
    public VkDisplayPresentInfoKHR dstRect(VkRect2D other) {
    	dstRect.set(other);
    	return this;
    }
    
    public VkRect2D dstRect() {
    	return dstRect;
    }
    
    @Override
    public VkDisplayPresentInfoKHR set(VkDisplayPresentInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDisplayPresentInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDisplayPresentInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDisplayPresentInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayPresentInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDisplayPresentInfoKHR> array(Arena arena, VkDisplayPresentInfoKHR... structs) {
        NativeStructArray<VkDisplayPresentInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayPresentInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDisplayPresentInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDisplayPresentInfoKHR(segment)
        );
    }
    
}