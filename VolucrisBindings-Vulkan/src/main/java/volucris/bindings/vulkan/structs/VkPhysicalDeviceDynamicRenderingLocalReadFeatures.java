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

public final class VkPhysicalDeviceDynamicRenderingLocalReadFeatures
		implements Struct<VkPhysicalDeviceDynamicRenderingLocalReadFeatures> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DYNAMIC_RENDERING_LOCAL_READ_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DYNAMIC_RENDERING_LOCAL_READ_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("dynamicRenderingLocalRead"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceDynamicRenderingLocalReadFeatures").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DYNAMIC_RENDERING_LOCAL_READ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dynamicRenderingLocalRead"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DYNAMIC_RENDERING_LOCAL_READ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dynamicRenderingLocalRead"));
		//@formatter:on
	}

	public VkPhysicalDeviceDynamicRenderingLocalReadFeatures() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDynamicRenderingLocalReadFeatures(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDynamicRenderingLocalReadFeatures(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #dynamicRenderingLocalRead()
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures dynamicRenderingLocalRead(int dynamicRenderingLocalRead) {
    	DYNAMIC_RENDERING_LOCAL_READ_HANDLE.set(segment, 0L, dynamicRenderingLocalRead);
    	return this;
    }
    
    public int dynamicRenderingLocalRead() {
    	return (int) DYNAMIC_RENDERING_LOCAL_READ_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures set(VkPhysicalDeviceDynamicRenderingLocalReadFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDynamicRenderingLocalReadFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDynamicRenderingLocalReadFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDynamicRenderingLocalReadFeatures> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDynamicRenderingLocalReadFeatures> array(SegmentAllocator allocator, VkPhysicalDeviceDynamicRenderingLocalReadFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceDynamicRenderingLocalReadFeatures> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDynamicRenderingLocalReadFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDynamicRenderingLocalReadFeatures(segment)
        );
    }

}