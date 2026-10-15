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

public final class VkAttachmentReference2
		implements Struct<VkAttachmentReference2> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ATTACHMENT_HANDLE;
	public static final VarHandle LAYOUT_HANDLE;
	public static final VarHandle ASPECT_MASK_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ATTACHMENT_BYTE_OFFSET;
	public static final long LAYOUT_BYTE_OFFSET;
	public static final long ASPECT_MASK_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("attachment"),
		    JAVA_INT.withName("layout"),
		    JAVA_INT.withName("aspectMask"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkAttachmentReference2").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ATTACHMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attachment"));
		LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layout"));
		ASPECT_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("aspectMask"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ATTACHMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attachment"));
		LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layout"));
		ASPECT_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
		//@formatter:on
	}

	public VkAttachmentReference2() {
	    this(Arena.ofAuto());
	}
	
	public VkAttachmentReference2(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkAttachmentReference2(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkAttachmentReference2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAttachmentReference2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #attachment()
    public VkAttachmentReference2 attachment(int attachment) {
    	ATTACHMENT_HANDLE.set(segment, 0L, attachment);
    	return this;
    }
    
    public int attachment() {
    	return (int) ATTACHMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #layout()
    public VkAttachmentReference2 layout(int layout) {
    	LAYOUT_HANDLE.set(segment, 0L, layout);
    	return this;
    }
    
    public int layout() {
    	return (int) LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #aspectMask()
    public VkAttachmentReference2 aspectMask(int aspectMask) {
    	ASPECT_MASK_HANDLE.set(segment, 0L, aspectMask);
    	return this;
    }
    
    public int aspectMask() {
    	return (int) ASPECT_MASK_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAttachmentReference2 set(VkAttachmentReference2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkAttachmentReference2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAttachmentReference2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAttachmentReference2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAttachmentReference2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAttachmentReference2> array(Arena arena, VkAttachmentReference2... structs) {
        NativeStructArray<VkAttachmentReference2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAttachmentReference2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAttachmentReference2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAttachmentReference2(segment)
        );
    }

}