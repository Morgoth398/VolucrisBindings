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

public final class VkPhysicalDeviceCubicWeightsFeaturesQCOM
		implements Struct<VkPhysicalDeviceCubicWeightsFeaturesQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SELECTABLE_CUBIC_WEIGHTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SELECTABLE_CUBIC_WEIGHTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("selectableCubicWeights"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceCubicWeightsFeaturesQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SELECTABLE_CUBIC_WEIGHTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("selectableCubicWeights"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SELECTABLE_CUBIC_WEIGHTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("selectableCubicWeights"));
		//@formatter:on
	}

	public VkPhysicalDeviceCubicWeightsFeaturesQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceCubicWeightsFeaturesQCOM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceCubicWeightsFeaturesQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #selectableCubicWeights()
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM selectableCubicWeights(int selectableCubicWeights) {
    	SELECTABLE_CUBIC_WEIGHTS_HANDLE.set(segment, 0L, selectableCubicWeights);
    	return this;
    }
    
    public int selectableCubicWeights() {
    	return (int) SELECTABLE_CUBIC_WEIGHTS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM set(VkPhysicalDeviceCubicWeightsFeaturesQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceCubicWeightsFeaturesQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceCubicWeightsFeaturesQCOM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceCubicWeightsFeaturesQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceCubicWeightsFeaturesQCOM> array(SegmentAllocator allocator, VkPhysicalDeviceCubicWeightsFeaturesQCOM... structs) {
        NativeStructArray<VkPhysicalDeviceCubicWeightsFeaturesQCOM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceCubicWeightsFeaturesQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceCubicWeightsFeaturesQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceCubicWeightsFeaturesQCOM(segment)
        );
    }

}