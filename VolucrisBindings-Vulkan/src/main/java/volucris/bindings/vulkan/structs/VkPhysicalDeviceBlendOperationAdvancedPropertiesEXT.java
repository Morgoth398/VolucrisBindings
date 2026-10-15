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

public final class VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT
		implements Struct<VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ADVANCED_BLEND_MAX_COLOR_ATTACHMENTS_HANDLE;
	public static final VarHandle ADVANCED_BLEND_INDEPENDENT_BLEND_HANDLE;
	public static final VarHandle ADVANCED_BLEND_NON_PREMULTIPLIED_SRC_COLOR_HANDLE;
	public static final VarHandle ADVANCED_BLEND_NON_PREMULTIPLIED_DST_COLOR_HANDLE;
	public static final VarHandle ADVANCED_BLEND_CORRELATED_OVERLAP_HANDLE;
	public static final VarHandle ADVANCED_BLEND_ALL_OPERATIONS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ADVANCED_BLEND_MAX_COLOR_ATTACHMENTS_BYTE_OFFSET;
	public static final long ADVANCED_BLEND_INDEPENDENT_BLEND_BYTE_OFFSET;
	public static final long ADVANCED_BLEND_NON_PREMULTIPLIED_SRC_COLOR_BYTE_OFFSET;
	public static final long ADVANCED_BLEND_NON_PREMULTIPLIED_DST_COLOR_BYTE_OFFSET;
	public static final long ADVANCED_BLEND_CORRELATED_OVERLAP_BYTE_OFFSET;
	public static final long ADVANCED_BLEND_ALL_OPERATIONS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("advancedBlendMaxColorAttachments"),
		    JAVA_INT.withName("advancedBlendIndependentBlend"),
		    JAVA_INT.withName("advancedBlendNonPremultipliedSrcColor"),
		    JAVA_INT.withName("advancedBlendNonPremultipliedDstColor"),
		    JAVA_INT.withName("advancedBlendCorrelatedOverlap"),
		    JAVA_INT.withName("advancedBlendAllOperations")
		).withName("VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ADVANCED_BLEND_MAX_COLOR_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("advancedBlendMaxColorAttachments"));
		ADVANCED_BLEND_INDEPENDENT_BLEND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("advancedBlendIndependentBlend"));
		ADVANCED_BLEND_NON_PREMULTIPLIED_SRC_COLOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("advancedBlendNonPremultipliedSrcColor"));
		ADVANCED_BLEND_NON_PREMULTIPLIED_DST_COLOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("advancedBlendNonPremultipliedDstColor"));
		ADVANCED_BLEND_CORRELATED_OVERLAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("advancedBlendCorrelatedOverlap"));
		ADVANCED_BLEND_ALL_OPERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("advancedBlendAllOperations"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ADVANCED_BLEND_MAX_COLOR_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendMaxColorAttachments"));
		ADVANCED_BLEND_INDEPENDENT_BLEND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendIndependentBlend"));
		ADVANCED_BLEND_NON_PREMULTIPLIED_SRC_COLOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendNonPremultipliedSrcColor"));
		ADVANCED_BLEND_NON_PREMULTIPLIED_DST_COLOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendNonPremultipliedDstColor"));
		ADVANCED_BLEND_CORRELATED_OVERLAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendCorrelatedOverlap"));
		ADVANCED_BLEND_ALL_OPERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendAllOperations"));
		//@formatter:on
	}

	public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #advancedBlendMaxColorAttachments()
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendMaxColorAttachments(int advancedBlendMaxColorAttachments) {
    	ADVANCED_BLEND_MAX_COLOR_ATTACHMENTS_HANDLE.set(segment, 0L, advancedBlendMaxColorAttachments);
    	return this;
    }
    
    public int advancedBlendMaxColorAttachments() {
    	return (int) ADVANCED_BLEND_MAX_COLOR_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #advancedBlendIndependentBlend()
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendIndependentBlend(int advancedBlendIndependentBlend) {
    	ADVANCED_BLEND_INDEPENDENT_BLEND_HANDLE.set(segment, 0L, advancedBlendIndependentBlend);
    	return this;
    }
    
    public int advancedBlendIndependentBlend() {
    	return (int) ADVANCED_BLEND_INDEPENDENT_BLEND_HANDLE.get(segment, 0L);
    }
    
    /// @see #advancedBlendNonPremultipliedSrcColor()
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendNonPremultipliedSrcColor(int advancedBlendNonPremultipliedSrcColor) {
    	ADVANCED_BLEND_NON_PREMULTIPLIED_SRC_COLOR_HANDLE.set(segment, 0L, advancedBlendNonPremultipliedSrcColor);
    	return this;
    }
    
    public int advancedBlendNonPremultipliedSrcColor() {
    	return (int) ADVANCED_BLEND_NON_PREMULTIPLIED_SRC_COLOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #advancedBlendNonPremultipliedDstColor()
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendNonPremultipliedDstColor(int advancedBlendNonPremultipliedDstColor) {
    	ADVANCED_BLEND_NON_PREMULTIPLIED_DST_COLOR_HANDLE.set(segment, 0L, advancedBlendNonPremultipliedDstColor);
    	return this;
    }
    
    public int advancedBlendNonPremultipliedDstColor() {
    	return (int) ADVANCED_BLEND_NON_PREMULTIPLIED_DST_COLOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #advancedBlendCorrelatedOverlap()
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendCorrelatedOverlap(int advancedBlendCorrelatedOverlap) {
    	ADVANCED_BLEND_CORRELATED_OVERLAP_HANDLE.set(segment, 0L, advancedBlendCorrelatedOverlap);
    	return this;
    }
    
    public int advancedBlendCorrelatedOverlap() {
    	return (int) ADVANCED_BLEND_CORRELATED_OVERLAP_HANDLE.get(segment, 0L);
    }
    
    /// @see #advancedBlendAllOperations()
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendAllOperations(int advancedBlendAllOperations) {
    	ADVANCED_BLEND_ALL_OPERATIONS_HANDLE.set(segment, 0L, advancedBlendAllOperations);
    	return this;
    }
    
    public int advancedBlendAllOperations() {
    	return (int) ADVANCED_BLEND_ALL_OPERATIONS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT set(VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT> array(Arena arena, VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(segment)
        );
    }

}