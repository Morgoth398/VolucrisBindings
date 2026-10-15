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

public final class VkSubpassDescriptionDepthStencilResolve
		implements Struct<VkSubpassDescriptionDepthStencilResolve> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DEPTH_RESOLVE_MODE_HANDLE;
	public static final VarHandle STENCIL_RESOLVE_MODE_HANDLE;
	public static final VarHandle P_DEPTH_STENCIL_RESOLVE_ATTACHMENT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DEPTH_RESOLVE_MODE_BYTE_OFFSET;
	public static final long STENCIL_RESOLVE_MODE_BYTE_OFFSET;
	public static final long P_DEPTH_STENCIL_RESOLVE_ATTACHMENT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("depthResolveMode"),
		    JAVA_INT.withName("stencilResolveMode"),
		    UNBOUNDED_ADDRESS.withName("pDepthStencilResolveAttachment")
		).withName("VkSubpassDescriptionDepthStencilResolve").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DEPTH_RESOLVE_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthResolveMode"));
		STENCIL_RESOLVE_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stencilResolveMode"));
		P_DEPTH_STENCIL_RESOLVE_ATTACHMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDepthStencilResolveAttachment"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DEPTH_RESOLVE_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthResolveMode"));
		STENCIL_RESOLVE_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stencilResolveMode"));
		P_DEPTH_STENCIL_RESOLVE_ATTACHMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDepthStencilResolveAttachment"));
		//@formatter:on
	}

	public VkSubpassDescriptionDepthStencilResolve() {
	    this(Arena.ofAuto());
	}
	
	public VkSubpassDescriptionDepthStencilResolve(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSubpassDescriptionDepthStencilResolve(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSubpassDescriptionDepthStencilResolve sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSubpassDescriptionDepthStencilResolve pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #depthResolveMode()
    public VkSubpassDescriptionDepthStencilResolve depthResolveMode(int depthResolveMode) {
    	DEPTH_RESOLVE_MODE_HANDLE.set(segment, 0L, depthResolveMode);
    	return this;
    }
    
    public int depthResolveMode() {
    	return (int) DEPTH_RESOLVE_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #stencilResolveMode()
    public VkSubpassDescriptionDepthStencilResolve stencilResolveMode(int stencilResolveMode) {
    	STENCIL_RESOLVE_MODE_HANDLE.set(segment, 0L, stencilResolveMode);
    	return this;
    }
    
    public int stencilResolveMode() {
    	return (int) STENCIL_RESOLVE_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDepthStencilResolveAttachment()
    public VkSubpassDescriptionDepthStencilResolve pDepthStencilResolveAttachment(VkAttachmentReference2 pDepthStencilResolveAttachment) {
    	P_DEPTH_STENCIL_RESOLVE_ATTACHMENT_HANDLE.set(segment, 0L, pDepthStencilResolveAttachment.memorySegment());
    	return this;
    }
    
    public @Nullable VkAttachmentReference2 pDepthStencilResolveAttachment() {
    	MemorySegment segment = (MemorySegment) P_DEPTH_STENCIL_RESOLVE_ATTACHMENT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkAttachmentReference2(segment);
    }
    
    @Override
    public VkSubpassDescriptionDepthStencilResolve set(VkSubpassDescriptionDepthStencilResolve other) {
        return set(other.segment);
    }
    
    @Override
    public VkSubpassDescriptionDepthStencilResolve set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSubpassDescriptionDepthStencilResolve> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSubpassDescriptionDepthStencilResolve> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSubpassDescriptionDepthStencilResolve(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSubpassDescriptionDepthStencilResolve> array(Arena arena, VkSubpassDescriptionDepthStencilResolve... structs) {
        NativeStructArray<VkSubpassDescriptionDepthStencilResolve> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSubpassDescriptionDepthStencilResolve(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSubpassDescriptionDepthStencilResolve> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSubpassDescriptionDepthStencilResolve(segment)
        );
    }

}