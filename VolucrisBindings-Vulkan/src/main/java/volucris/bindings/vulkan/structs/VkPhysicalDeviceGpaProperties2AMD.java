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

public final class VkPhysicalDeviceGpaProperties2AMD
		implements Struct<VkPhysicalDeviceGpaProperties2AMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle REVISION_ID_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long REVISION_ID_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("revisionId"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceGpaProperties2AMD").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		REVISION_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("revisionId"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		REVISION_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("revisionId"));
		//@formatter:on
	}

	public VkPhysicalDeviceGpaProperties2AMD() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceGpaProperties2AMD(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceGpaProperties2AMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceGpaProperties2AMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceGpaProperties2AMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #revisionId()
    public VkPhysicalDeviceGpaProperties2AMD revisionId(int revisionId) {
    	REVISION_ID_HANDLE.set(segment, 0L, revisionId);
    	return this;
    }
    
    public int revisionId() {
    	return (int) REVISION_ID_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceGpaProperties2AMD set(VkPhysicalDeviceGpaProperties2AMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceGpaProperties2AMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceGpaProperties2AMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceGpaProperties2AMD> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceGpaProperties2AMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceGpaProperties2AMD> array(SegmentAllocator allocator, VkPhysicalDeviceGpaProperties2AMD... structs) {
        NativeStructArray<VkPhysicalDeviceGpaProperties2AMD> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceGpaProperties2AMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceGpaProperties2AMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceGpaProperties2AMD(segment)
        );
    }

}