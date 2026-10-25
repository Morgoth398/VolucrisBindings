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
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkImageDrmFormatModifierListCreateInfoEXT
		implements Struct<VkImageDrmFormatModifierListCreateInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DRM_FORMAT_MODIFIER_COUNT_HANDLE;
	public static final VarHandle P_DRM_FORMAT_MODIFIERS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DRM_FORMAT_MODIFIER_COUNT_BYTE_OFFSET;
	public static final long P_DRM_FORMAT_MODIFIERS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("drmFormatModifierCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pDrmFormatModifiers")
		).withName("VkImageDrmFormatModifierListCreateInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DRM_FORMAT_MODIFIER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drmFormatModifierCount"));
		P_DRM_FORMAT_MODIFIERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDrmFormatModifiers"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DRM_FORMAT_MODIFIER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierCount"));
		P_DRM_FORMAT_MODIFIERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDrmFormatModifiers"));
		//@formatter:on
	}

	public VkImageDrmFormatModifierListCreateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkImageDrmFormatModifierListCreateInfoEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkImageDrmFormatModifierListCreateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkImageDrmFormatModifierListCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageDrmFormatModifierListCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #drmFormatModifierCount()
    public VkImageDrmFormatModifierListCreateInfoEXT drmFormatModifierCount(int drmFormatModifierCount) {
    	DRM_FORMAT_MODIFIER_COUNT_HANDLE.set(segment, 0L, drmFormatModifierCount);
    	return this;
    }
    
    public int drmFormatModifierCount() {
    	return (int) DRM_FORMAT_MODIFIER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDrmFormatModifiers()
    public VkImageDrmFormatModifierListCreateInfoEXT pDrmFormatModifiers(NativeLongArray pDrmFormatModifiers) {
    	P_DRM_FORMAT_MODIFIERS_HANDLE.set(segment, 0L, pDrmFormatModifiers.memorySegment());
    	return this;
    }
    
    public @Nullable NativeLongArray pDrmFormatModifiers() {
    	MemorySegment segment = (MemorySegment) P_DRM_FORMAT_MODIFIERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeLongArray(segment);
    }
    
    @Override
    public VkImageDrmFormatModifierListCreateInfoEXT set(VkImageDrmFormatModifierListCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageDrmFormatModifierListCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageDrmFormatModifierListCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageDrmFormatModifierListCreateInfoEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageDrmFormatModifierListCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageDrmFormatModifierListCreateInfoEXT> array(SegmentAllocator allocator, VkImageDrmFormatModifierListCreateInfoEXT... structs) {
        NativeStructArray<VkImageDrmFormatModifierListCreateInfoEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageDrmFormatModifierListCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageDrmFormatModifierListCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageDrmFormatModifierListCreateInfoEXT(segment)
        );
    }

}