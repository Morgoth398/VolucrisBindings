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

public final class VkDeviceImageMemoryRequirements
		implements Struct<VkDeviceImageMemoryRequirements> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_CREATE_INFO_HANDLE;
	public static final VarHandle PLANE_ASPECT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_CREATE_INFO_BYTE_OFFSET;
	public static final long PLANE_ASPECT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pCreateInfo"),
		    JAVA_INT.withName("planeAspect"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDeviceImageMemoryRequirements").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_CREATE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCreateInfo"));
		PLANE_ASPECT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("planeAspect"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_CREATE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCreateInfo"));
		PLANE_ASPECT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("planeAspect"));
		//@formatter:on
	}

	public VkDeviceImageMemoryRequirements() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceImageMemoryRequirements(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDeviceImageMemoryRequirements(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDeviceImageMemoryRequirements sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceImageMemoryRequirements pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pCreateInfo()
    public VkDeviceImageMemoryRequirements pCreateInfo(VkImageCreateInfo pCreateInfo) {
    	P_CREATE_INFO_HANDLE.set(segment, 0L, pCreateInfo.memorySegment());
    	return this;
    }
    
    public @Nullable VkImageCreateInfo pCreateInfo() {
    	MemorySegment segment = (MemorySegment) P_CREATE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImageCreateInfo(segment);
    }
    
    /// @see #planeAspect()
    public VkDeviceImageMemoryRequirements planeAspect(int planeAspect) {
    	PLANE_ASPECT_HANDLE.set(segment, 0L, planeAspect);
    	return this;
    }
    
    public int planeAspect() {
    	return (int) PLANE_ASPECT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDeviceImageMemoryRequirements set(VkDeviceImageMemoryRequirements other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceImageMemoryRequirements set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceImageMemoryRequirements> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceImageMemoryRequirements> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceImageMemoryRequirements(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceImageMemoryRequirements> array(SegmentAllocator allocator, VkDeviceImageMemoryRequirements... structs) {
        NativeStructArray<VkDeviceImageMemoryRequirements> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceImageMemoryRequirements(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceImageMemoryRequirements> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceImageMemoryRequirements(segment)
        );
    }

}