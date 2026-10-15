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

public final class VkPhysicalDeviceImageDrmFormatModifierInfoEXT
		implements Struct<VkPhysicalDeviceImageDrmFormatModifierInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DRM_FORMAT_MODIFIER_HANDLE;
	public static final VarHandle SHARING_MODE_HANDLE;
	public static final VarHandle QUEUE_FAMILY_INDEX_COUNT_HANDLE;
	public static final VarHandle P_QUEUE_FAMILY_INDICES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DRM_FORMAT_MODIFIER_BYTE_OFFSET;
	public static final long SHARING_MODE_BYTE_OFFSET;
	public static final long QUEUE_FAMILY_INDEX_COUNT_BYTE_OFFSET;
	public static final long P_QUEUE_FAMILY_INDICES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("drmFormatModifier"),
		    JAVA_INT.withName("sharingMode"),
		    JAVA_INT.withName("queueFamilyIndexCount"),
		    UNBOUNDED_ADDRESS.withName("pQueueFamilyIndices")
		).withName("VkPhysicalDeviceImageDrmFormatModifierInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DRM_FORMAT_MODIFIER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drmFormatModifier"));
		SHARING_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sharingMode"));
		QUEUE_FAMILY_INDEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueFamilyIndexCount"));
		P_QUEUE_FAMILY_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pQueueFamilyIndices"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DRM_FORMAT_MODIFIER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifier"));
		SHARING_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sharingMode"));
		QUEUE_FAMILY_INDEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndexCount"));
		P_QUEUE_FAMILY_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pQueueFamilyIndices"));
		//@formatter:on
	}

	public VkPhysicalDeviceImageDrmFormatModifierInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceImageDrmFormatModifierInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceImageDrmFormatModifierInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pNext(MemorySegment pNext) {
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
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT drmFormatModifier(long drmFormatModifier) {
    	DRM_FORMAT_MODIFIER_HANDLE.set(segment, 0L, drmFormatModifier);
    	return this;
    }
    
    public long drmFormatModifier() {
    	return (long) DRM_FORMAT_MODIFIER_HANDLE.get(segment, 0L);
    }
    
    /// @see #sharingMode()
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sharingMode(int sharingMode) {
    	SHARING_MODE_HANDLE.set(segment, 0L, sharingMode);
    	return this;
    }
    
    public int sharingMode() {
    	return (int) SHARING_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #queueFamilyIndexCount()
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT queueFamilyIndexCount(int queueFamilyIndexCount) {
    	QUEUE_FAMILY_INDEX_COUNT_HANDLE.set(segment, 0L, queueFamilyIndexCount);
    	return this;
    }
    
    public int queueFamilyIndexCount() {
    	return (int) QUEUE_FAMILY_INDEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pQueueFamilyIndices()
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pQueueFamilyIndices(NativeIntArray pQueueFamilyIndices) {
    	P_QUEUE_FAMILY_INDICES_HANDLE.set(segment, 0L, pQueueFamilyIndices.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pQueueFamilyIndices() {
    	MemorySegment segment = (MemorySegment) P_QUEUE_FAMILY_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT set(VkPhysicalDeviceImageDrmFormatModifierInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceImageDrmFormatModifierInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageDrmFormatModifierInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageDrmFormatModifierInfoEXT> array(Arena arena, VkPhysicalDeviceImageDrmFormatModifierInfoEXT... structs) {
        NativeStructArray<VkPhysicalDeviceImageDrmFormatModifierInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageDrmFormatModifierInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(segment)
        );
    }

}