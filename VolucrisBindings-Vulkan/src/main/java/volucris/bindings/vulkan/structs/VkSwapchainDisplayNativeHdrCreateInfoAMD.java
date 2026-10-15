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

public final class VkSwapchainDisplayNativeHdrCreateInfoAMD
		implements Struct<VkSwapchainDisplayNativeHdrCreateInfoAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle LOCAL_DIMMING_ENABLE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long LOCAL_DIMMING_ENABLE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("localDimmingEnable"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkSwapchainDisplayNativeHdrCreateInfoAMD").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		LOCAL_DIMMING_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("localDimmingEnable"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		LOCAL_DIMMING_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("localDimmingEnable"));
		//@formatter:on
	}

	public VkSwapchainDisplayNativeHdrCreateInfoAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkSwapchainDisplayNativeHdrCreateInfoAMD(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSwapchainDisplayNativeHdrCreateInfoAMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSwapchainDisplayNativeHdrCreateInfoAMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSwapchainDisplayNativeHdrCreateInfoAMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #localDimmingEnable()
    public VkSwapchainDisplayNativeHdrCreateInfoAMD localDimmingEnable(int localDimmingEnable) {
    	LOCAL_DIMMING_ENABLE_HANDLE.set(segment, 0L, localDimmingEnable);
    	return this;
    }
    
    public int localDimmingEnable() {
    	return (int) LOCAL_DIMMING_ENABLE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSwapchainDisplayNativeHdrCreateInfoAMD set(VkSwapchainDisplayNativeHdrCreateInfoAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkSwapchainDisplayNativeHdrCreateInfoAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSwapchainDisplayNativeHdrCreateInfoAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSwapchainDisplayNativeHdrCreateInfoAMD> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSwapchainDisplayNativeHdrCreateInfoAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSwapchainDisplayNativeHdrCreateInfoAMD> array(Arena arena, VkSwapchainDisplayNativeHdrCreateInfoAMD... structs) {
        NativeStructArray<VkSwapchainDisplayNativeHdrCreateInfoAMD> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSwapchainDisplayNativeHdrCreateInfoAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSwapchainDisplayNativeHdrCreateInfoAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSwapchainDisplayNativeHdrCreateInfoAMD(segment)
        );
    }

}