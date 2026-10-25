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

public final class VkSwapchainCalibratedTimestampInfoEXT
		implements Struct<VkSwapchainCalibratedTimestampInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SWAPCHAIN_HANDLE;
	public static final VarHandle PRESENT_STAGE_HANDLE;
	public static final VarHandle TIME_DOMAIN_ID_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SWAPCHAIN_BYTE_OFFSET;
	public static final long PRESENT_STAGE_BYTE_OFFSET;
	public static final long TIME_DOMAIN_ID_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("swapchain"),
		    JAVA_INT.withName("presentStage"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("timeDomainId")
		).withName("VkSwapchainCalibratedTimestampInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SWAPCHAIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("swapchain"));
		PRESENT_STAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentStage"));
		TIME_DOMAIN_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("timeDomainId"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SWAPCHAIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("swapchain"));
		PRESENT_STAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentStage"));
		TIME_DOMAIN_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timeDomainId"));
		//@formatter:on
	}

	public VkSwapchainCalibratedTimestampInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkSwapchainCalibratedTimestampInfoEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSwapchainCalibratedTimestampInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSwapchainCalibratedTimestampInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSwapchainCalibratedTimestampInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #swapchain()
    public VkSwapchainCalibratedTimestampInfoEXT swapchain(VkSwapchainKHR swapchain) {
    	SWAPCHAIN_HANDLE.set(segment, 0L, swapchain.memorySegment());
    	return this;
    }
    
    public @Nullable VkSwapchainKHR swapchain() {
    	MemorySegment segment = (MemorySegment) SWAPCHAIN_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkSwapchainKHR(segment);
    }
    
    /// @see #presentStage()
    public VkSwapchainCalibratedTimestampInfoEXT presentStage(int presentStage) {
    	PRESENT_STAGE_HANDLE.set(segment, 0L, presentStage);
    	return this;
    }
    
    public int presentStage() {
    	return (int) PRESENT_STAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #timeDomainId()
    public VkSwapchainCalibratedTimestampInfoEXT timeDomainId(long timeDomainId) {
    	TIME_DOMAIN_ID_HANDLE.set(segment, 0L, timeDomainId);
    	return this;
    }
    
    public long timeDomainId() {
    	return (long) TIME_DOMAIN_ID_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSwapchainCalibratedTimestampInfoEXT set(VkSwapchainCalibratedTimestampInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkSwapchainCalibratedTimestampInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSwapchainCalibratedTimestampInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSwapchainCalibratedTimestampInfoEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSwapchainCalibratedTimestampInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSwapchainCalibratedTimestampInfoEXT> array(SegmentAllocator allocator, VkSwapchainCalibratedTimestampInfoEXT... structs) {
        NativeStructArray<VkSwapchainCalibratedTimestampInfoEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSwapchainCalibratedTimestampInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSwapchainCalibratedTimestampInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSwapchainCalibratedTimestampInfoEXT(segment)
        );
    }

}