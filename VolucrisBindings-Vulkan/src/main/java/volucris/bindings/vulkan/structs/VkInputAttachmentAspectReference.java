/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkInputAttachmentAspectReference
		implements Struct<VkInputAttachmentAspectReference> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SUBPASS_HANDLE;
	public static final VarHandle INPUT_ATTACHMENT_INDEX_HANDLE;
	public static final VarHandle ASPECT_MASK_HANDLE;

	public static final long SUBPASS_BYTE_OFFSET;
	public static final long INPUT_ATTACHMENT_INDEX_BYTE_OFFSET;
	public static final long ASPECT_MASK_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("subpass"),
		    JAVA_INT.withName("inputAttachmentIndex"),
		    JAVA_INT.withName("aspectMask")
		).withName("VkInputAttachmentAspectReference").withByteAlignment(4);
		
		SUBPASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subpass"));
		INPUT_ATTACHMENT_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputAttachmentIndex"));
		ASPECT_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("aspectMask"));
		
		SUBPASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subpass"));
		INPUT_ATTACHMENT_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputAttachmentIndex"));
		ASPECT_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
		//@formatter:on
	}

	public VkInputAttachmentAspectReference() {
	    this(Arena.ofAuto());
	}
	
	public VkInputAttachmentAspectReference(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkInputAttachmentAspectReference(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #subpass()
    public VkInputAttachmentAspectReference subpass(int subpass) {
    	SUBPASS_HANDLE.set(segment, 0L, subpass);
    	return this;
    }
    
    public int subpass() {
    	return (int) SUBPASS_HANDLE.get(segment, 0L);
    }
    
    /// @see #inputAttachmentIndex()
    public VkInputAttachmentAspectReference inputAttachmentIndex(int inputAttachmentIndex) {
    	INPUT_ATTACHMENT_INDEX_HANDLE.set(segment, 0L, inputAttachmentIndex);
    	return this;
    }
    
    public int inputAttachmentIndex() {
    	return (int) INPUT_ATTACHMENT_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #aspectMask()
    public VkInputAttachmentAspectReference aspectMask(int aspectMask) {
    	ASPECT_MASK_HANDLE.set(segment, 0L, aspectMask);
    	return this;
    }
    
    public int aspectMask() {
    	return (int) ASPECT_MASK_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkInputAttachmentAspectReference set(VkInputAttachmentAspectReference other) {
        return set(other.segment);
    }
    
    @Override
    public VkInputAttachmentAspectReference set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkInputAttachmentAspectReference> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkInputAttachmentAspectReference> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkInputAttachmentAspectReference(segment),
            count
        );
    }
    
    public static NativeStructArray<VkInputAttachmentAspectReference> array(Arena arena, VkInputAttachmentAspectReference... structs) {
        NativeStructArray<VkInputAttachmentAspectReference> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkInputAttachmentAspectReference(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkInputAttachmentAspectReference> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkInputAttachmentAspectReference(segment)
        );
    }

}