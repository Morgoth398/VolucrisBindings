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

public final class VkRenderingFragmentDensityMapAttachmentInfoEXT
		implements Struct<VkRenderingFragmentDensityMapAttachmentInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle IMAGE_VIEW_HANDLE;
    public static final VarHandle IMAGE_LAYOUT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long IMAGE_VIEW_BYTE_OFFSET;
    public static final long IMAGE_LAYOUT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("imageView"),
            JAVA_INT.withName("imageLayout"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkRenderingFragmentDensityMapAttachmentInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        IMAGE_VIEW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageView"));
        IMAGE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageLayout"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        IMAGE_VIEW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
        IMAGE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageLayout"));
        //@formatter:on
    }

    public VkRenderingFragmentDensityMapAttachmentInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkRenderingFragmentDensityMapAttachmentInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkRenderingFragmentDensityMapAttachmentInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkRenderingFragmentDensityMapAttachmentInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderingFragmentDensityMapAttachmentInfoEXT pNext(MemorySegment pNext) {
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
    public VkRenderingFragmentDensityMapAttachmentInfoEXT imageView(VkImageView imageView) {
    	IMAGE_VIEW_HANDLE.set(segment, 0L, imageView.memorySegment());
    	return this;
    }
    
    public @Nullable VkImageView imageView() {
    	MemorySegment segment = (MemorySegment) IMAGE_VIEW_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImageView(segment);
    }
    
    /// @see #imageLayout()
    public VkRenderingFragmentDensityMapAttachmentInfoEXT imageLayout(int imageLayout) {
    	IMAGE_LAYOUT_HANDLE.set(segment, 0L, imageLayout);
    	return this;
    }
    
    public int imageLayout() {
    	return (int) IMAGE_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkRenderingFragmentDensityMapAttachmentInfoEXT set(VkRenderingFragmentDensityMapAttachmentInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderingFragmentDensityMapAttachmentInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderingFragmentDensityMapAttachmentInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderingFragmentDensityMapAttachmentInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderingFragmentDensityMapAttachmentInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderingFragmentDensityMapAttachmentInfoEXT> array(Arena arena, VkRenderingFragmentDensityMapAttachmentInfoEXT... structs) {
        NativeStructArray<VkRenderingFragmentDensityMapAttachmentInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderingFragmentDensityMapAttachmentInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderingFragmentDensityMapAttachmentInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderingFragmentDensityMapAttachmentInfoEXT(segment)
        );
    }
    
}