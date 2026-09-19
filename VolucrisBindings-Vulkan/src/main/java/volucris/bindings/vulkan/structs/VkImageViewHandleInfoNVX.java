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

public final class VkImageViewHandleInfoNVX
		implements Struct<VkImageViewHandleInfoNVX> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle IMAGE_VIEW_HANDLE;
    public static final VarHandle DESCRIPTOR_TYPE_HANDLE;
    public static final VarHandle SAMPLER_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long IMAGE_VIEW_BYTE_OFFSET;
    public static final long DESCRIPTOR_TYPE_BYTE_OFFSET;
    public static final long SAMPLER_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("imageView"),
            JAVA_INT.withName("descriptorType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("sampler")
        ).withName("VkImageViewHandleInfoNVX").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        IMAGE_VIEW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageView"));
        DESCRIPTOR_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorType"));
        SAMPLER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampler"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        IMAGE_VIEW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
        DESCRIPTOR_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorType"));
        SAMPLER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampler"));
        //@formatter:on
    }

    public VkImageViewHandleInfoNVX() {
        this(Arena.ofAuto());
    }
    
    public VkImageViewHandleInfoNVX(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkImageViewHandleInfoNVX(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkImageViewHandleInfoNVX sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageViewHandleInfoNVX pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #imageView()
    public VkImageViewHandleInfoNVX imageView(VkImageView imageView) {
    	IMAGE_VIEW_HANDLE.set(segment, 0L, imageView.memorySegment());
    	return this;
    }
    
    public @Nullable VkImageView imageView() {
    	MemorySegment segment = (MemorySegment) IMAGE_VIEW_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImageView(segment);
    }
    
    /// @see #descriptorType()
    public VkImageViewHandleInfoNVX descriptorType(int descriptorType) {
    	DESCRIPTOR_TYPE_HANDLE.set(segment, 0L, descriptorType);
    	return this;
    }
    
    public int descriptorType() {
    	return (int) DESCRIPTOR_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampler()
    public VkImageViewHandleInfoNVX sampler(VkSampler sampler) {
    	SAMPLER_HANDLE.set(segment, 0L, sampler.memorySegment());
    	return this;
    }
    
    public @Nullable VkSampler sampler() {
    	MemorySegment segment = (MemorySegment) SAMPLER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkSampler(segment);
    }
    
    @Override
    public VkImageViewHandleInfoNVX set(VkImageViewHandleInfoNVX other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageViewHandleInfoNVX set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageViewHandleInfoNVX> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageViewHandleInfoNVX> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageViewHandleInfoNVX(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageViewHandleInfoNVX> array(Arena arena, VkImageViewHandleInfoNVX... structs) {
        NativeStructArray<VkImageViewHandleInfoNVX> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageViewHandleInfoNVX(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageViewHandleInfoNVX> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageViewHandleInfoNVX(segment)
        );
    }
    
}