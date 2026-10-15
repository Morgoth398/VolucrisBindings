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

public final class VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
		implements Struct<VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle RASTERIZATION_ORDER_COLOR_ATTACHMENT_ACCESS_HANDLE;
	public static final VarHandle RASTERIZATION_ORDER_DEPTH_ATTACHMENT_ACCESS_HANDLE;
	public static final VarHandle RASTERIZATION_ORDER_STENCIL_ATTACHMENT_ACCESS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long RASTERIZATION_ORDER_COLOR_ATTACHMENT_ACCESS_BYTE_OFFSET;
	public static final long RASTERIZATION_ORDER_DEPTH_ATTACHMENT_ACCESS_BYTE_OFFSET;
	public static final long RASTERIZATION_ORDER_STENCIL_ATTACHMENT_ACCESS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("rasterizationOrderColorAttachmentAccess"),
		    JAVA_INT.withName("rasterizationOrderDepthAttachmentAccess"),
		    JAVA_INT.withName("rasterizationOrderStencilAttachmentAccess"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		RASTERIZATION_ORDER_COLOR_ATTACHMENT_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rasterizationOrderColorAttachmentAccess"));
		RASTERIZATION_ORDER_DEPTH_ATTACHMENT_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rasterizationOrderDepthAttachmentAccess"));
		RASTERIZATION_ORDER_STENCIL_ATTACHMENT_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rasterizationOrderStencilAttachmentAccess"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		RASTERIZATION_ORDER_COLOR_ATTACHMENT_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rasterizationOrderColorAttachmentAccess"));
		RASTERIZATION_ORDER_DEPTH_ATTACHMENT_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rasterizationOrderDepthAttachmentAccess"));
		RASTERIZATION_ORDER_STENCIL_ATTACHMENT_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rasterizationOrderStencilAttachmentAccess"));
		//@formatter:on
	}

	public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #rasterizationOrderColorAttachmentAccess()
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderColorAttachmentAccess(int rasterizationOrderColorAttachmentAccess) {
    	RASTERIZATION_ORDER_COLOR_ATTACHMENT_ACCESS_HANDLE.set(segment, 0L, rasterizationOrderColorAttachmentAccess);
    	return this;
    }
    
    public int rasterizationOrderColorAttachmentAccess() {
    	return (int) RASTERIZATION_ORDER_COLOR_ATTACHMENT_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #rasterizationOrderDepthAttachmentAccess()
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderDepthAttachmentAccess(int rasterizationOrderDepthAttachmentAccess) {
    	RASTERIZATION_ORDER_DEPTH_ATTACHMENT_ACCESS_HANDLE.set(segment, 0L, rasterizationOrderDepthAttachmentAccess);
    	return this;
    }
    
    public int rasterizationOrderDepthAttachmentAccess() {
    	return (int) RASTERIZATION_ORDER_DEPTH_ATTACHMENT_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #rasterizationOrderStencilAttachmentAccess()
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderStencilAttachmentAccess(int rasterizationOrderStencilAttachmentAccess) {
    	RASTERIZATION_ORDER_STENCIL_ATTACHMENT_ACCESS_HANDLE.set(segment, 0L, rasterizationOrderStencilAttachmentAccess);
    	return this;
    }
    
    public int rasterizationOrderStencilAttachmentAccess() {
    	return (int) RASTERIZATION_ORDER_STENCIL_ATTACHMENT_ACCESS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT set(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT> array(Arena arena, VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(segment)
        );
    }

}