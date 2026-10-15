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

public final class VkPhysicalDeviceDescriptorBufferFeaturesEXT
		implements Struct<VkPhysicalDeviceDescriptorBufferFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DESCRIPTOR_BUFFER_HANDLE;
	public static final VarHandle DESCRIPTOR_BUFFER_CAPTURE_REPLAY_HANDLE;
	public static final VarHandle DESCRIPTOR_BUFFER_IMAGE_LAYOUT_IGNORED_HANDLE;
	public static final VarHandle DESCRIPTOR_BUFFER_PUSH_DESCRIPTORS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DESCRIPTOR_BUFFER_BYTE_OFFSET;
	public static final long DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BYTE_OFFSET;
	public static final long DESCRIPTOR_BUFFER_IMAGE_LAYOUT_IGNORED_BYTE_OFFSET;
	public static final long DESCRIPTOR_BUFFER_PUSH_DESCRIPTORS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("descriptorBuffer"),
		    JAVA_INT.withName("descriptorBufferCaptureReplay"),
		    JAVA_INT.withName("descriptorBufferImageLayoutIgnored"),
		    JAVA_INT.withName("descriptorBufferPushDescriptors")
		).withName("VkPhysicalDeviceDescriptorBufferFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DESCRIPTOR_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBuffer"));
		DESCRIPTOR_BUFFER_CAPTURE_REPLAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBufferCaptureReplay"));
		DESCRIPTOR_BUFFER_IMAGE_LAYOUT_IGNORED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBufferImageLayoutIgnored"));
		DESCRIPTOR_BUFFER_PUSH_DESCRIPTORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBufferPushDescriptors"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DESCRIPTOR_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBuffer"));
		DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBufferCaptureReplay"));
		DESCRIPTOR_BUFFER_IMAGE_LAYOUT_IGNORED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBufferImageLayoutIgnored"));
		DESCRIPTOR_BUFFER_PUSH_DESCRIPTORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBufferPushDescriptors"));
		//@formatter:on
	}

	public VkPhysicalDeviceDescriptorBufferFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDescriptorBufferFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDescriptorBufferFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #descriptorBuffer()
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBuffer(int descriptorBuffer) {
    	DESCRIPTOR_BUFFER_HANDLE.set(segment, 0L, descriptorBuffer);
    	return this;
    }
    
    public int descriptorBuffer() {
    	return (int) DESCRIPTOR_BUFFER_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBufferCaptureReplay()
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferCaptureReplay(int descriptorBufferCaptureReplay) {
    	DESCRIPTOR_BUFFER_CAPTURE_REPLAY_HANDLE.set(segment, 0L, descriptorBufferCaptureReplay);
    	return this;
    }
    
    public int descriptorBufferCaptureReplay() {
    	return (int) DESCRIPTOR_BUFFER_CAPTURE_REPLAY_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBufferImageLayoutIgnored()
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferImageLayoutIgnored(int descriptorBufferImageLayoutIgnored) {
    	DESCRIPTOR_BUFFER_IMAGE_LAYOUT_IGNORED_HANDLE.set(segment, 0L, descriptorBufferImageLayoutIgnored);
    	return this;
    }
    
    public int descriptorBufferImageLayoutIgnored() {
    	return (int) DESCRIPTOR_BUFFER_IMAGE_LAYOUT_IGNORED_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBufferPushDescriptors()
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferPushDescriptors(int descriptorBufferPushDescriptors) {
    	DESCRIPTOR_BUFFER_PUSH_DESCRIPTORS_HANDLE.set(segment, 0L, descriptorBufferPushDescriptors);
    	return this;
    }
    
    public int descriptorBufferPushDescriptors() {
    	return (int) DESCRIPTOR_BUFFER_PUSH_DESCRIPTORS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT set(VkPhysicalDeviceDescriptorBufferFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDescriptorBufferFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorBufferFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorBufferFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorBufferFeaturesEXT> array(Arena arena, VkPhysicalDeviceDescriptorBufferFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceDescriptorBufferFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorBufferFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorBufferFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorBufferFeaturesEXT(segment)
        );
    }

}