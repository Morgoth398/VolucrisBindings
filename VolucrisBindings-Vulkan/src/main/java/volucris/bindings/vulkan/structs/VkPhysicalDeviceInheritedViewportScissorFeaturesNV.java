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

public final class VkPhysicalDeviceInheritedViewportScissorFeaturesNV
		implements Struct<VkPhysicalDeviceInheritedViewportScissorFeaturesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle INHERITED_VIEWPORT_SCISSOR2_D_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long INHERITED_VIEWPORT_SCISSOR2_D_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("inheritedViewportScissor2D"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceInheritedViewportScissorFeaturesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		INHERITED_VIEWPORT_SCISSOR2_D_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inheritedViewportScissor2D"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		INHERITED_VIEWPORT_SCISSOR2_D_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inheritedViewportScissor2D"));
		//@formatter:on
	}

	public VkPhysicalDeviceInheritedViewportScissorFeaturesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceInheritedViewportScissorFeaturesNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceInheritedViewportScissorFeaturesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #inheritedViewportScissor2D()
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV inheritedViewportScissor2D(int inheritedViewportScissor2D) {
    	INHERITED_VIEWPORT_SCISSOR2_D_HANDLE.set(segment, 0L, inheritedViewportScissor2D);
    	return this;
    }
    
    public int inheritedViewportScissor2D() {
    	return (int) INHERITED_VIEWPORT_SCISSOR2_D_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV set(VkPhysicalDeviceInheritedViewportScissorFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceInheritedViewportScissorFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceInheritedViewportScissorFeaturesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceInheritedViewportScissorFeaturesNV> array(Arena arena, VkPhysicalDeviceInheritedViewportScissorFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceInheritedViewportScissorFeaturesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceInheritedViewportScissorFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(segment)
        );
    }

}