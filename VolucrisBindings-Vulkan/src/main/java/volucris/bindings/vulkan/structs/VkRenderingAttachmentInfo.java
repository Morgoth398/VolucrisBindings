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

public final class VkRenderingAttachmentInfo
		implements Struct<VkRenderingAttachmentInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle IMAGE_VIEW_HANDLE;
	public static final VarHandle IMAGE_LAYOUT_HANDLE;
	public static final VarHandle RESOLVE_MODE_HANDLE;
	public static final VarHandle RESOLVE_IMAGE_VIEW_HANDLE;
	public static final VarHandle RESOLVE_IMAGE_LAYOUT_HANDLE;
	public static final VarHandle LOAD_OP_HANDLE;
	public static final VarHandle STORE_OP_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long IMAGE_VIEW_BYTE_OFFSET;
	public static final long IMAGE_LAYOUT_BYTE_OFFSET;
	public static final long RESOLVE_MODE_BYTE_OFFSET;
	public static final long RESOLVE_IMAGE_VIEW_BYTE_OFFSET;
	public static final long RESOLVE_IMAGE_LAYOUT_BYTE_OFFSET;
	public static final long LOAD_OP_BYTE_OFFSET;
	public static final long STORE_OP_BYTE_OFFSET;
	public static final long CLEAR_VALUE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkClearValue clearValue;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("imageView"),
		    JAVA_INT.withName("imageLayout"),
		    JAVA_INT.withName("resolveMode"),
		    UNBOUNDED_ADDRESS.withName("resolveImageView"),
		    JAVA_INT.withName("resolveImageLayout"),
		    JAVA_INT.withName("loadOp"),
		    JAVA_INT.withName("storeOp"),
		    VkClearValue.LAYOUT.withName("clearValue"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkRenderingAttachmentInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		IMAGE_VIEW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageView"));
		IMAGE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageLayout"));
		RESOLVE_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("resolveMode"));
		RESOLVE_IMAGE_VIEW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("resolveImageView"));
		RESOLVE_IMAGE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("resolveImageLayout"));
		LOAD_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loadOp"));
		STORE_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storeOp"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		IMAGE_VIEW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
		IMAGE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageLayout"));
		RESOLVE_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resolveMode"));
		RESOLVE_IMAGE_VIEW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resolveImageView"));
		RESOLVE_IMAGE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resolveImageLayout"));
		LOAD_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loadOp"));
		STORE_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storeOp"));
		CLEAR_VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clearValue"));
		//@formatter:on
	}

	public VkRenderingAttachmentInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkRenderingAttachmentInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkRenderingAttachmentInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    clearValue = new VkClearValue(segment.asSlice(CLEAR_VALUE_BYTE_OFFSET, VkClearValue.LAYOUT));
	}

    /// @see #sType()
    public VkRenderingAttachmentInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderingAttachmentInfo pNext(MemorySegment pNext) {
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
    public VkRenderingAttachmentInfo imageView(VkImageView imageView) {
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
    public VkRenderingAttachmentInfo imageLayout(int imageLayout) {
    	IMAGE_LAYOUT_HANDLE.set(segment, 0L, imageLayout);
    	return this;
    }
    
    public int imageLayout() {
    	return (int) IMAGE_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #resolveMode()
    public VkRenderingAttachmentInfo resolveMode(int resolveMode) {
    	RESOLVE_MODE_HANDLE.set(segment, 0L, resolveMode);
    	return this;
    }
    
    public int resolveMode() {
    	return (int) RESOLVE_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #resolveImageView()
    public VkRenderingAttachmentInfo resolveImageView(VkImageView resolveImageView) {
    	RESOLVE_IMAGE_VIEW_HANDLE.set(segment, 0L, resolveImageView.memorySegment());
    	return this;
    }
    
    public @Nullable VkImageView resolveImageView() {
    	MemorySegment segment = (MemorySegment) RESOLVE_IMAGE_VIEW_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImageView(segment);
    }
    
    /// @see #resolveImageLayout()
    public VkRenderingAttachmentInfo resolveImageLayout(int resolveImageLayout) {
    	RESOLVE_IMAGE_LAYOUT_HANDLE.set(segment, 0L, resolveImageLayout);
    	return this;
    }
    
    public int resolveImageLayout() {
    	return (int) RESOLVE_IMAGE_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #loadOp()
    public VkRenderingAttachmentInfo loadOp(int loadOp) {
    	LOAD_OP_HANDLE.set(segment, 0L, loadOp);
    	return this;
    }
    
    public int loadOp() {
    	return (int) LOAD_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #storeOp()
    public VkRenderingAttachmentInfo storeOp(int storeOp) {
    	STORE_OP_HANDLE.set(segment, 0L, storeOp);
    	return this;
    }
    
    public int storeOp() {
    	return (int) STORE_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #clearValue()
    public VkRenderingAttachmentInfo clearValue(Consumer<VkClearValue> consumer) {
    	consumer.accept(clearValue);
    	return this;
    }
    
    /// @see #clearValue()
    public VkRenderingAttachmentInfo clearValue(VkClearValue other) {
    	clearValue.set(other);
    	return this;
    }
    
    public VkClearValue clearValue() {
    	return clearValue;
    }
    
    @Override
    public VkRenderingAttachmentInfo set(VkRenderingAttachmentInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderingAttachmentInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderingAttachmentInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderingAttachmentInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderingAttachmentInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderingAttachmentInfo> array(Arena arena, VkRenderingAttachmentInfo... structs) {
        NativeStructArray<VkRenderingAttachmentInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderingAttachmentInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderingAttachmentInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderingAttachmentInfo(segment)
        );
    }

}