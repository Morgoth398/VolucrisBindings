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

public final class VkImageDrmFormatModifierPropertiesEXT
		implements Struct<VkImageDrmFormatModifierPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DRM_FORMAT_MODIFIER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DRM_FORMAT_MODIFIER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("drmFormatModifier")
		).withName("VkImageDrmFormatModifierPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DRM_FORMAT_MODIFIER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drmFormatModifier"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DRM_FORMAT_MODIFIER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifier"));
		//@formatter:on
	}

	public VkImageDrmFormatModifierPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkImageDrmFormatModifierPropertiesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkImageDrmFormatModifierPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkImageDrmFormatModifierPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageDrmFormatModifierPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #drmFormatModifier()
    public VkImageDrmFormatModifierPropertiesEXT drmFormatModifier(long drmFormatModifier) {
    	DRM_FORMAT_MODIFIER_HANDLE.set(segment, 0L, drmFormatModifier);
    	return this;
    }
    
    public long drmFormatModifier() {
    	return (long) DRM_FORMAT_MODIFIER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkImageDrmFormatModifierPropertiesEXT set(VkImageDrmFormatModifierPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageDrmFormatModifierPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageDrmFormatModifierPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageDrmFormatModifierPropertiesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageDrmFormatModifierPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageDrmFormatModifierPropertiesEXT> array(SegmentAllocator allocator, VkImageDrmFormatModifierPropertiesEXT... structs) {
        NativeStructArray<VkImageDrmFormatModifierPropertiesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageDrmFormatModifierPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageDrmFormatModifierPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageDrmFormatModifierPropertiesEXT(segment)
        );
    }

}