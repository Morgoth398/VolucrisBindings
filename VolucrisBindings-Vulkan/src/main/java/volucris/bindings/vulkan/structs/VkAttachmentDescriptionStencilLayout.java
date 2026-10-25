/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
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

public final class VkAttachmentDescriptionStencilLayout
		implements Struct<VkAttachmentDescriptionStencilLayout> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STENCIL_INITIAL_LAYOUT_HANDLE;
	public static final VarHandle STENCIL_FINAL_LAYOUT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STENCIL_INITIAL_LAYOUT_BYTE_OFFSET;
	public static final long STENCIL_FINAL_LAYOUT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("stencilInitialLayout"),
		    JAVA_INT.withName("stencilFinalLayout")
		).withName("VkAttachmentDescriptionStencilLayout").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STENCIL_INITIAL_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stencilInitialLayout"));
		STENCIL_FINAL_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stencilFinalLayout"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STENCIL_INITIAL_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stencilInitialLayout"));
		STENCIL_FINAL_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stencilFinalLayout"));
		//@formatter:on
	}

	public VkAttachmentDescriptionStencilLayout() {
	    this(Arena.ofAuto());
	}
	
	public VkAttachmentDescriptionStencilLayout(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkAttachmentDescriptionStencilLayout(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkAttachmentDescriptionStencilLayout sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAttachmentDescriptionStencilLayout pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #stencilInitialLayout()
    public VkAttachmentDescriptionStencilLayout stencilInitialLayout(int stencilInitialLayout) {
    	STENCIL_INITIAL_LAYOUT_HANDLE.set(segment, 0L, stencilInitialLayout);
    	return this;
    }
    
    public int stencilInitialLayout() {
    	return (int) STENCIL_INITIAL_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #stencilFinalLayout()
    public VkAttachmentDescriptionStencilLayout stencilFinalLayout(int stencilFinalLayout) {
    	STENCIL_FINAL_LAYOUT_HANDLE.set(segment, 0L, stencilFinalLayout);
    	return this;
    }
    
    public int stencilFinalLayout() {
    	return (int) STENCIL_FINAL_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAttachmentDescriptionStencilLayout set(VkAttachmentDescriptionStencilLayout other) {
        return set(other.segment);
    }
    
    @Override
    public VkAttachmentDescriptionStencilLayout set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAttachmentDescriptionStencilLayout> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAttachmentDescriptionStencilLayout> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAttachmentDescriptionStencilLayout(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAttachmentDescriptionStencilLayout> array(SegmentAllocator allocator, VkAttachmentDescriptionStencilLayout... structs) {
        NativeStructArray<VkAttachmentDescriptionStencilLayout> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAttachmentDescriptionStencilLayout(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAttachmentDescriptionStencilLayout> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAttachmentDescriptionStencilLayout(segment)
        );
    }

}