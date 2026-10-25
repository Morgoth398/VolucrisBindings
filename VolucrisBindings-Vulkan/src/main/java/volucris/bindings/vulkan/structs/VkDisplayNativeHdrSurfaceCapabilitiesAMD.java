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

public final class VkDisplayNativeHdrSurfaceCapabilitiesAMD
		implements Struct<VkDisplayNativeHdrSurfaceCapabilitiesAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle LOCAL_DIMMING_SUPPORT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long LOCAL_DIMMING_SUPPORT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("localDimmingSupport"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDisplayNativeHdrSurfaceCapabilitiesAMD").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		LOCAL_DIMMING_SUPPORT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("localDimmingSupport"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		LOCAL_DIMMING_SUPPORT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("localDimmingSupport"));
		//@formatter:on
	}

	public VkDisplayNativeHdrSurfaceCapabilitiesAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkDisplayNativeHdrSurfaceCapabilitiesAMD(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDisplayNativeHdrSurfaceCapabilitiesAMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #localDimmingSupport()
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD localDimmingSupport(int localDimmingSupport) {
    	LOCAL_DIMMING_SUPPORT_HANDLE.set(segment, 0L, localDimmingSupport);
    	return this;
    }
    
    public int localDimmingSupport() {
    	return (int) LOCAL_DIMMING_SUPPORT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD set(VkDisplayNativeHdrSurfaceCapabilitiesAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDisplayNativeHdrSurfaceCapabilitiesAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDisplayNativeHdrSurfaceCapabilitiesAMD> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDisplayNativeHdrSurfaceCapabilitiesAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDisplayNativeHdrSurfaceCapabilitiesAMD> array(SegmentAllocator allocator, VkDisplayNativeHdrSurfaceCapabilitiesAMD... structs) {
        NativeStructArray<VkDisplayNativeHdrSurfaceCapabilitiesAMD> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDisplayNativeHdrSurfaceCapabilitiesAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDisplayNativeHdrSurfaceCapabilitiesAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDisplayNativeHdrSurfaceCapabilitiesAMD(segment)
        );
    }

}