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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkAttachmentReference
		implements Struct<VkAttachmentReference> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ATTACHMENT_HANDLE;
	public static final VarHandle LAYOUT_HANDLE;

	public static final long ATTACHMENT_BYTE_OFFSET;
	public static final long LAYOUT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("attachment"),
		    JAVA_INT.withName("layout")
		).withName("VkAttachmentReference").withByteAlignment(4);
		
		ATTACHMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attachment"));
		LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layout"));
		
		ATTACHMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attachment"));
		LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layout"));
		//@formatter:on
	}

	public VkAttachmentReference() {
	    this(Arena.ofAuto());
	}
	
	public VkAttachmentReference(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkAttachmentReference(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #attachment()
    public VkAttachmentReference attachment(int attachment) {
    	ATTACHMENT_HANDLE.set(segment, 0L, attachment);
    	return this;
    }
    
    public int attachment() {
    	return (int) ATTACHMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #layout()
    public VkAttachmentReference layout(int layout) {
    	LAYOUT_HANDLE.set(segment, 0L, layout);
    	return this;
    }
    
    public int layout() {
    	return (int) LAYOUT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAttachmentReference set(VkAttachmentReference other) {
        return set(other.segment);
    }
    
    @Override
    public VkAttachmentReference set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAttachmentReference> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAttachmentReference> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAttachmentReference(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAttachmentReference> array(SegmentAllocator allocator, VkAttachmentReference... structs) {
        NativeStructArray<VkAttachmentReference> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAttachmentReference(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAttachmentReference> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAttachmentReference(segment)
        );
    }

}