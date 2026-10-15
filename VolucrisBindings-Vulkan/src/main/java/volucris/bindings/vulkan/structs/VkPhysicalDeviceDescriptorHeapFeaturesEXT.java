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

public final class VkPhysicalDeviceDescriptorHeapFeaturesEXT
		implements Struct<VkPhysicalDeviceDescriptorHeapFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DESCRIPTOR_HEAP_HANDLE;
	public static final VarHandle DESCRIPTOR_HEAP_CAPTURE_REPLAY_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DESCRIPTOR_HEAP_BYTE_OFFSET;
	public static final long DESCRIPTOR_HEAP_CAPTURE_REPLAY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("descriptorHeap"),
		    JAVA_INT.withName("descriptorHeapCaptureReplay")
		).withName("VkPhysicalDeviceDescriptorHeapFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DESCRIPTOR_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorHeap"));
		DESCRIPTOR_HEAP_CAPTURE_REPLAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorHeapCaptureReplay"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DESCRIPTOR_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorHeap"));
		DESCRIPTOR_HEAP_CAPTURE_REPLAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorHeapCaptureReplay"));
		//@formatter:on
	}

	public VkPhysicalDeviceDescriptorHeapFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDescriptorHeapFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDescriptorHeapFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceDescriptorHeapFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDescriptorHeapFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #descriptorHeap()
    public VkPhysicalDeviceDescriptorHeapFeaturesEXT descriptorHeap(int descriptorHeap) {
    	DESCRIPTOR_HEAP_HANDLE.set(segment, 0L, descriptorHeap);
    	return this;
    }
    
    public int descriptorHeap() {
    	return (int) DESCRIPTOR_HEAP_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorHeapCaptureReplay()
    public VkPhysicalDeviceDescriptorHeapFeaturesEXT descriptorHeapCaptureReplay(int descriptorHeapCaptureReplay) {
    	DESCRIPTOR_HEAP_CAPTURE_REPLAY_HANDLE.set(segment, 0L, descriptorHeapCaptureReplay);
    	return this;
    }
    
    public int descriptorHeapCaptureReplay() {
    	return (int) DESCRIPTOR_HEAP_CAPTURE_REPLAY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorHeapFeaturesEXT set(VkPhysicalDeviceDescriptorHeapFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorHeapFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDescriptorHeapFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorHeapFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorHeapFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorHeapFeaturesEXT> array(Arena arena, VkPhysicalDeviceDescriptorHeapFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceDescriptorHeapFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorHeapFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorHeapFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorHeapFeaturesEXT(segment)
        );
    }

}