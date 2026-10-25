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

public final class VkSurfaceCapabilitiesPresentBarrierNV
		implements Struct<VkSurfaceCapabilitiesPresentBarrierNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PRESENT_BARRIER_SUPPORTED_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PRESENT_BARRIER_SUPPORTED_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("presentBarrierSupported"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkSurfaceCapabilitiesPresentBarrierNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PRESENT_BARRIER_SUPPORTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentBarrierSupported"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PRESENT_BARRIER_SUPPORTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentBarrierSupported"));
		//@formatter:on
	}

	public VkSurfaceCapabilitiesPresentBarrierNV() {
	    this(Arena.ofAuto());
	}
	
	public VkSurfaceCapabilitiesPresentBarrierNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSurfaceCapabilitiesPresentBarrierNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSurfaceCapabilitiesPresentBarrierNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSurfaceCapabilitiesPresentBarrierNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #presentBarrierSupported()
    public VkSurfaceCapabilitiesPresentBarrierNV presentBarrierSupported(int presentBarrierSupported) {
    	PRESENT_BARRIER_SUPPORTED_HANDLE.set(segment, 0L, presentBarrierSupported);
    	return this;
    }
    
    public int presentBarrierSupported() {
    	return (int) PRESENT_BARRIER_SUPPORTED_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSurfaceCapabilitiesPresentBarrierNV set(VkSurfaceCapabilitiesPresentBarrierNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkSurfaceCapabilitiesPresentBarrierNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSurfaceCapabilitiesPresentBarrierNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSurfaceCapabilitiesPresentBarrierNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSurfaceCapabilitiesPresentBarrierNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSurfaceCapabilitiesPresentBarrierNV> array(SegmentAllocator allocator, VkSurfaceCapabilitiesPresentBarrierNV... structs) {
        NativeStructArray<VkSurfaceCapabilitiesPresentBarrierNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSurfaceCapabilitiesPresentBarrierNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSurfaceCapabilitiesPresentBarrierNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSurfaceCapabilitiesPresentBarrierNV(segment)
        );
    }

}