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

public final class VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures
		implements Struct<VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SEPARATE_DEPTH_STENCIL_LAYOUTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SEPARATE_DEPTH_STENCIL_LAYOUTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("separateDepthStencilLayouts"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SEPARATE_DEPTH_STENCIL_LAYOUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("separateDepthStencilLayouts"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SEPARATE_DEPTH_STENCIL_LAYOUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("separateDepthStencilLayouts"));
		//@formatter:on
	}

	public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #separateDepthStencilLayouts()
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures separateDepthStencilLayouts(int separateDepthStencilLayouts) {
    	SEPARATE_DEPTH_STENCIL_LAYOUTS_HANDLE.set(segment, 0L, separateDepthStencilLayouts);
    	return this;
    }
    
    public int separateDepthStencilLayouts() {
    	return (int) SEPARATE_DEPTH_STENCIL_LAYOUTS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures set(VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures> array(SegmentAllocator allocator, VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures(segment)
        );
    }

}