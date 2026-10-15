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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkFramebufferAttachmentImageInfo
		implements Struct<VkFramebufferAttachmentImageInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle USAGE_HANDLE;
	public static final VarHandle WIDTH_HANDLE;
	public static final VarHandle HEIGHT_HANDLE;
	public static final VarHandle LAYER_COUNT_HANDLE;
	public static final VarHandle VIEW_FORMAT_COUNT_HANDLE;
	public static final VarHandle P_VIEW_FORMATS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long USAGE_BYTE_OFFSET;
	public static final long WIDTH_BYTE_OFFSET;
	public static final long HEIGHT_BYTE_OFFSET;
	public static final long LAYER_COUNT_BYTE_OFFSET;
	public static final long VIEW_FORMAT_COUNT_BYTE_OFFSET;
	public static final long P_VIEW_FORMATS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("usage"),
		    JAVA_INT.withName("width"),
		    JAVA_INT.withName("height"),
		    JAVA_INT.withName("layerCount"),
		    JAVA_INT.withName("viewFormatCount"),
		    UNBOUNDED_ADDRESS.withName("pViewFormats")
		).withName("VkFramebufferAttachmentImageInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		USAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usage"));
		WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("width"));
		HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("height"));
		LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layerCount"));
		VIEW_FORMAT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewFormatCount"));
		P_VIEW_FORMATS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pViewFormats"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		USAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usage"));
		WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("width"));
		HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("height"));
		LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
		VIEW_FORMAT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewFormatCount"));
		P_VIEW_FORMATS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pViewFormats"));
		//@formatter:on
	}

	public VkFramebufferAttachmentImageInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkFramebufferAttachmentImageInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkFramebufferAttachmentImageInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkFramebufferAttachmentImageInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkFramebufferAttachmentImageInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkFramebufferAttachmentImageInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #usage()
    public VkFramebufferAttachmentImageInfo usage(int usage) {
    	USAGE_HANDLE.set(segment, 0L, usage);
    	return this;
    }
    
    public int usage() {
    	return (int) USAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #width()
    public VkFramebufferAttachmentImageInfo width(int width) {
    	WIDTH_HANDLE.set(segment, 0L, width);
    	return this;
    }
    
    public int width() {
    	return (int) WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #height()
    public VkFramebufferAttachmentImageInfo height(int height) {
    	HEIGHT_HANDLE.set(segment, 0L, height);
    	return this;
    }
    
    public int height() {
    	return (int) HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #layerCount()
    public VkFramebufferAttachmentImageInfo layerCount(int layerCount) {
    	LAYER_COUNT_HANDLE.set(segment, 0L, layerCount);
    	return this;
    }
    
    public int layerCount() {
    	return (int) LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #viewFormatCount()
    public VkFramebufferAttachmentImageInfo viewFormatCount(int viewFormatCount) {
    	VIEW_FORMAT_COUNT_HANDLE.set(segment, 0L, viewFormatCount);
    	return this;
    }
    
    public int viewFormatCount() {
    	return (int) VIEW_FORMAT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pViewFormats()
    public VkFramebufferAttachmentImageInfo pViewFormats(NativeIntArray pViewFormats) {
    	P_VIEW_FORMATS_HANDLE.set(segment, 0L, pViewFormats.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pViewFormats() {
    	MemorySegment segment = (MemorySegment) P_VIEW_FORMATS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkFramebufferAttachmentImageInfo set(VkFramebufferAttachmentImageInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkFramebufferAttachmentImageInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkFramebufferAttachmentImageInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkFramebufferAttachmentImageInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFramebufferAttachmentImageInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkFramebufferAttachmentImageInfo> array(Arena arena, VkFramebufferAttachmentImageInfo... structs) {
        NativeStructArray<VkFramebufferAttachmentImageInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFramebufferAttachmentImageInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkFramebufferAttachmentImageInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkFramebufferAttachmentImageInfo(segment)
        );
    }

}