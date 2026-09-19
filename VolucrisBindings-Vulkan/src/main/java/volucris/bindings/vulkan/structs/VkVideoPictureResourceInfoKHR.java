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

public final class VkVideoPictureResourceInfoKHR
		implements Struct<VkVideoPictureResourceInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle BASE_ARRAY_LAYER_HANDLE;
    public static final VarHandle IMAGE_VIEW_BINDING_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long CODED_OFFSET_BYTE_OFFSET;
    public static final long CODED_EXTENT_BYTE_OFFSET;
    public static final long BASE_ARRAY_LAYER_BYTE_OFFSET;
    public static final long IMAGE_VIEW_BINDING_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkOffset2D codedOffset;
    private final VkExtent2D codedExtent;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkOffset2D.LAYOUT.withName("codedOffset"),
            VkExtent2D.LAYOUT.withName("codedExtent"),
            JAVA_INT.withName("baseArrayLayer"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("imageViewBinding")
        ).withName("VkVideoPictureResourceInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        BASE_ARRAY_LAYER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("baseArrayLayer"));
        IMAGE_VIEW_BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageViewBinding"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        CODED_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("codedOffset"));
        CODED_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("codedExtent"));
        BASE_ARRAY_LAYER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseArrayLayer"));
        IMAGE_VIEW_BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageViewBinding"));
        //@formatter:on
    }

    public VkVideoPictureResourceInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoPictureResourceInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoPictureResourceInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
        codedOffset = new VkOffset2D(segment.asSlice(CODED_OFFSET_BYTE_OFFSET, VkOffset2D.LAYOUT));
        codedExtent = new VkExtent2D(segment.asSlice(CODED_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #sType()
    public VkVideoPictureResourceInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoPictureResourceInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #baseArrayLayer()
    public VkVideoPictureResourceInfoKHR baseArrayLayer(int baseArrayLayer) {
    	BASE_ARRAY_LAYER_HANDLE.set(segment, 0L, baseArrayLayer);
    	return this;
    }
    
    public int baseArrayLayer() {
    	return (int) BASE_ARRAY_LAYER_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageViewBinding()
    public VkVideoPictureResourceInfoKHR imageViewBinding(VkImageView imageViewBinding) {
    	IMAGE_VIEW_BINDING_HANDLE.set(segment, 0L, imageViewBinding.memorySegment());
    	return this;
    }
    
    public @Nullable VkImageView imageViewBinding() {
    	MemorySegment segment = (MemorySegment) IMAGE_VIEW_BINDING_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImageView(segment);
    }
    
    /// @see #codedOffset()
    public VkVideoPictureResourceInfoKHR codedOffset(Consumer<VkOffset2D> consumer) {
    	consumer.accept(codedOffset);
    	return this;
    }
    
    /// @see #codedOffset()
    public VkVideoPictureResourceInfoKHR codedOffset(VkOffset2D other) {
    	codedOffset.set(other);
    	return this;
    }
    
    public VkOffset2D codedOffset() {
    	return codedOffset;
    }
    
    /// @see #codedExtent()
    public VkVideoPictureResourceInfoKHR codedExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(codedExtent);
    	return this;
    }
    
    /// @see #codedExtent()
    public VkVideoPictureResourceInfoKHR codedExtent(VkExtent2D other) {
    	codedExtent.set(other);
    	return this;
    }
    
    public VkExtent2D codedExtent() {
    	return codedExtent;
    }
    
    @Override
    public VkVideoPictureResourceInfoKHR set(VkVideoPictureResourceInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoPictureResourceInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoPictureResourceInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoPictureResourceInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoPictureResourceInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoPictureResourceInfoKHR> array(Arena arena, VkVideoPictureResourceInfoKHR... structs) {
        NativeStructArray<VkVideoPictureResourceInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoPictureResourceInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoPictureResourceInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoPictureResourceInfoKHR(segment)
        );
    }
    
}