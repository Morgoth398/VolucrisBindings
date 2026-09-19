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

public final class VkRenderPassInputAttachmentAspectCreateInfo
		implements Struct<VkRenderPassInputAttachmentAspectCreateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle ASPECT_REFERENCE_COUNT_HANDLE;
    public static final VarHandle P_ASPECT_REFERENCES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long ASPECT_REFERENCE_COUNT_BYTE_OFFSET;
    public static final long P_ASPECT_REFERENCES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("aspectReferenceCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pAspectReferences")
        ).withName("VkRenderPassInputAttachmentAspectCreateInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        ASPECT_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("aspectReferenceCount"));
        P_ASPECT_REFERENCES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pAspectReferences"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        ASPECT_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aspectReferenceCount"));
        P_ASPECT_REFERENCES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pAspectReferences"));
        //@formatter:on
    }

    public VkRenderPassInputAttachmentAspectCreateInfo() {
        this(Arena.ofAuto());
    }
    
    public VkRenderPassInputAttachmentAspectCreateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkRenderPassInputAttachmentAspectCreateInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkRenderPassInputAttachmentAspectCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderPassInputAttachmentAspectCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #aspectReferenceCount()
    public VkRenderPassInputAttachmentAspectCreateInfo aspectReferenceCount(int aspectReferenceCount) {
    	ASPECT_REFERENCE_COUNT_HANDLE.set(segment, 0L, aspectReferenceCount);
    	return this;
    }
    
    public int aspectReferenceCount() {
    	return (int) ASPECT_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pAspectReferences()
    public VkRenderPassInputAttachmentAspectCreateInfo pAspectReferences(NativeStructArray<VkInputAttachmentAspectReference> pAspectReferences) {
    	P_ASPECT_REFERENCES_HANDLE.set(segment, 0L, pAspectReferences.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkInputAttachmentAspectReference> pAspectReferences() {
    	MemorySegment segment = (MemorySegment) P_ASPECT_REFERENCES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkInputAttachmentAspectReference.array(segment);
    }
    
    @Override
    public VkRenderPassInputAttachmentAspectCreateInfo set(VkRenderPassInputAttachmentAspectCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderPassInputAttachmentAspectCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderPassInputAttachmentAspectCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderPassInputAttachmentAspectCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderPassInputAttachmentAspectCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderPassInputAttachmentAspectCreateInfo> array(Arena arena, VkRenderPassInputAttachmentAspectCreateInfo... structs) {
        NativeStructArray<VkRenderPassInputAttachmentAspectCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderPassInputAttachmentAspectCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderPassInputAttachmentAspectCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderPassInputAttachmentAspectCreateInfo(segment)
        );
    }
    
}