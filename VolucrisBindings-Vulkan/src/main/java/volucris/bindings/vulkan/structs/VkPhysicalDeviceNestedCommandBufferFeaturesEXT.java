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

public final class VkPhysicalDeviceNestedCommandBufferFeaturesEXT
		implements Struct<VkPhysicalDeviceNestedCommandBufferFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle NESTED_COMMAND_BUFFER_HANDLE;
	public static final VarHandle NESTED_COMMAND_BUFFER_RENDERING_HANDLE;
	public static final VarHandle NESTED_COMMAND_BUFFER_SIMULTANEOUS_USE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long NESTED_COMMAND_BUFFER_BYTE_OFFSET;
	public static final long NESTED_COMMAND_BUFFER_RENDERING_BYTE_OFFSET;
	public static final long NESTED_COMMAND_BUFFER_SIMULTANEOUS_USE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("nestedCommandBuffer"),
		    JAVA_INT.withName("nestedCommandBufferRendering"),
		    JAVA_INT.withName("nestedCommandBufferSimultaneousUse"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceNestedCommandBufferFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		NESTED_COMMAND_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nestedCommandBuffer"));
		NESTED_COMMAND_BUFFER_RENDERING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nestedCommandBufferRendering"));
		NESTED_COMMAND_BUFFER_SIMULTANEOUS_USE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nestedCommandBufferSimultaneousUse"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		NESTED_COMMAND_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nestedCommandBuffer"));
		NESTED_COMMAND_BUFFER_RENDERING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nestedCommandBufferRendering"));
		NESTED_COMMAND_BUFFER_SIMULTANEOUS_USE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nestedCommandBufferSimultaneousUse"));
		//@formatter:on
	}

	public VkPhysicalDeviceNestedCommandBufferFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceNestedCommandBufferFeaturesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceNestedCommandBufferFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #nestedCommandBuffer()
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBuffer(int nestedCommandBuffer) {
    	NESTED_COMMAND_BUFFER_HANDLE.set(segment, 0L, nestedCommandBuffer);
    	return this;
    }
    
    public int nestedCommandBuffer() {
    	return (int) NESTED_COMMAND_BUFFER_HANDLE.get(segment, 0L);
    }
    
    /// @see #nestedCommandBufferRendering()
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBufferRendering(int nestedCommandBufferRendering) {
    	NESTED_COMMAND_BUFFER_RENDERING_HANDLE.set(segment, 0L, nestedCommandBufferRendering);
    	return this;
    }
    
    public int nestedCommandBufferRendering() {
    	return (int) NESTED_COMMAND_BUFFER_RENDERING_HANDLE.get(segment, 0L);
    }
    
    /// @see #nestedCommandBufferSimultaneousUse()
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBufferSimultaneousUse(int nestedCommandBufferSimultaneousUse) {
    	NESTED_COMMAND_BUFFER_SIMULTANEOUS_USE_HANDLE.set(segment, 0L, nestedCommandBufferSimultaneousUse);
    	return this;
    }
    
    public int nestedCommandBufferSimultaneousUse() {
    	return (int) NESTED_COMMAND_BUFFER_SIMULTANEOUS_USE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT set(VkPhysicalDeviceNestedCommandBufferFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceNestedCommandBufferFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceNestedCommandBufferFeaturesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceNestedCommandBufferFeaturesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceNestedCommandBufferFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceNestedCommandBufferFeaturesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceNestedCommandBufferFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(segment)
        );
    }

}