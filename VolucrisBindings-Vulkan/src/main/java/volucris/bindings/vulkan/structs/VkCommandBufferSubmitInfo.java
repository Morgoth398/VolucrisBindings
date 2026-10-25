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

public final class VkCommandBufferSubmitInfo
		implements Struct<VkCommandBufferSubmitInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COMMAND_BUFFER_HANDLE;
	public static final VarHandle DEVICE_MASK_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COMMAND_BUFFER_BYTE_OFFSET;
	public static final long DEVICE_MASK_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("commandBuffer"),
		    JAVA_INT.withName("deviceMask"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkCommandBufferSubmitInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COMMAND_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("commandBuffer"));
		DEVICE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceMask"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COMMAND_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("commandBuffer"));
		DEVICE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceMask"));
		//@formatter:on
	}

	public VkCommandBufferSubmitInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkCommandBufferSubmitInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkCommandBufferSubmitInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkCommandBufferSubmitInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCommandBufferSubmitInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #commandBuffer()
    public VkCommandBufferSubmitInfo commandBuffer(VkCommandBuffer commandBuffer) {
    	COMMAND_BUFFER_HANDLE.set(segment, 0L, commandBuffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkCommandBuffer commandBuffer() {
    	MemorySegment segment = (MemorySegment) COMMAND_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkCommandBuffer(segment);
    }
    
    /// @see #deviceMask()
    public VkCommandBufferSubmitInfo deviceMask(int deviceMask) {
    	DEVICE_MASK_HANDLE.set(segment, 0L, deviceMask);
    	return this;
    }
    
    public int deviceMask() {
    	return (int) DEVICE_MASK_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkCommandBufferSubmitInfo set(VkCommandBufferSubmitInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkCommandBufferSubmitInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCommandBufferSubmitInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCommandBufferSubmitInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCommandBufferSubmitInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCommandBufferSubmitInfo> array(SegmentAllocator allocator, VkCommandBufferSubmitInfo... structs) {
        NativeStructArray<VkCommandBufferSubmitInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCommandBufferSubmitInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCommandBufferSubmitInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCommandBufferSubmitInfo(segment)
        );
    }

}