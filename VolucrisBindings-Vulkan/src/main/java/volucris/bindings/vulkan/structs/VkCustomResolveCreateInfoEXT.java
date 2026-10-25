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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkCustomResolveCreateInfoEXT
		implements Struct<VkCustomResolveCreateInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle CUSTOM_RESOLVE_HANDLE;
	public static final VarHandle COLOR_ATTACHMENT_COUNT_HANDLE;
	public static final VarHandle P_COLOR_ATTACHMENT_FORMATS_HANDLE;
	public static final VarHandle DEPTH_ATTACHMENT_FORMAT_HANDLE;
	public static final VarHandle STENCIL_ATTACHMENT_FORMAT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long CUSTOM_RESOLVE_BYTE_OFFSET;
	public static final long COLOR_ATTACHMENT_COUNT_BYTE_OFFSET;
	public static final long P_COLOR_ATTACHMENT_FORMATS_BYTE_OFFSET;
	public static final long DEPTH_ATTACHMENT_FORMAT_BYTE_OFFSET;
	public static final long STENCIL_ATTACHMENT_FORMAT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("customResolve"),
		    JAVA_INT.withName("colorAttachmentCount"),
		    UNBOUNDED_ADDRESS.withName("pColorAttachmentFormats"),
		    JAVA_INT.withName("depthAttachmentFormat"),
		    JAVA_INT.withName("stencilAttachmentFormat")
		).withName("VkCustomResolveCreateInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		CUSTOM_RESOLVE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("customResolve"));
		COLOR_ATTACHMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("colorAttachmentCount"));
		P_COLOR_ATTACHMENT_FORMATS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pColorAttachmentFormats"));
		DEPTH_ATTACHMENT_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthAttachmentFormat"));
		STENCIL_ATTACHMENT_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stencilAttachmentFormat"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		CUSTOM_RESOLVE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("customResolve"));
		COLOR_ATTACHMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
		P_COLOR_ATTACHMENT_FORMATS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachmentFormats"));
		DEPTH_ATTACHMENT_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthAttachmentFormat"));
		STENCIL_ATTACHMENT_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stencilAttachmentFormat"));
		//@formatter:on
	}

	public VkCustomResolveCreateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkCustomResolveCreateInfoEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkCustomResolveCreateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkCustomResolveCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCustomResolveCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #customResolve()
    public VkCustomResolveCreateInfoEXT customResolve(int customResolve) {
    	CUSTOM_RESOLVE_HANDLE.set(segment, 0L, customResolve);
    	return this;
    }
    
    public int customResolve() {
    	return (int) CUSTOM_RESOLVE_HANDLE.get(segment, 0L);
    }
    
    /// @see #colorAttachmentCount()
    public VkCustomResolveCreateInfoEXT colorAttachmentCount(int colorAttachmentCount) {
    	COLOR_ATTACHMENT_COUNT_HANDLE.set(segment, 0L, colorAttachmentCount);
    	return this;
    }
    
    public int colorAttachmentCount() {
    	return (int) COLOR_ATTACHMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pColorAttachmentFormats()
    public VkCustomResolveCreateInfoEXT pColorAttachmentFormats(NativeIntArray pColorAttachmentFormats) {
    	P_COLOR_ATTACHMENT_FORMATS_HANDLE.set(segment, 0L, pColorAttachmentFormats.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pColorAttachmentFormats() {
    	MemorySegment segment = (MemorySegment) P_COLOR_ATTACHMENT_FORMATS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #depthAttachmentFormat()
    public VkCustomResolveCreateInfoEXT depthAttachmentFormat(int depthAttachmentFormat) {
    	DEPTH_ATTACHMENT_FORMAT_HANDLE.set(segment, 0L, depthAttachmentFormat);
    	return this;
    }
    
    public int depthAttachmentFormat() {
    	return (int) DEPTH_ATTACHMENT_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #stencilAttachmentFormat()
    public VkCustomResolveCreateInfoEXT stencilAttachmentFormat(int stencilAttachmentFormat) {
    	STENCIL_ATTACHMENT_FORMAT_HANDLE.set(segment, 0L, stencilAttachmentFormat);
    	return this;
    }
    
    public int stencilAttachmentFormat() {
    	return (int) STENCIL_ATTACHMENT_FORMAT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkCustomResolveCreateInfoEXT set(VkCustomResolveCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkCustomResolveCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCustomResolveCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCustomResolveCreateInfoEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCustomResolveCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCustomResolveCreateInfoEXT> array(SegmentAllocator allocator, VkCustomResolveCreateInfoEXT... structs) {
        NativeStructArray<VkCustomResolveCreateInfoEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCustomResolveCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCustomResolveCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCustomResolveCreateInfoEXT(segment)
        );
    }

}