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

public final class VkPhysicalDeviceImageProcessing3FeaturesQCOM
		implements Struct<VkPhysicalDeviceImageProcessing3FeaturesQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle IMAGE_GATHER_LINEAR_HANDLE;
	public static final VarHandle IMAGE_GATHER_EXTENDED_MODES_HANDLE;
	public static final VarHandle BLOCK_MATCH_EXTENDED_CLAMP_TO_EDGE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long IMAGE_GATHER_LINEAR_BYTE_OFFSET;
	public static final long IMAGE_GATHER_EXTENDED_MODES_BYTE_OFFSET;
	public static final long BLOCK_MATCH_EXTENDED_CLAMP_TO_EDGE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("imageGatherLinear"),
		    JAVA_INT.withName("imageGatherExtendedModes"),
		    JAVA_INT.withName("blockMatchExtendedClampToEdge"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceImageProcessing3FeaturesQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		IMAGE_GATHER_LINEAR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageGatherLinear"));
		IMAGE_GATHER_EXTENDED_MODES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageGatherExtendedModes"));
		BLOCK_MATCH_EXTENDED_CLAMP_TO_EDGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blockMatchExtendedClampToEdge"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		IMAGE_GATHER_LINEAR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageGatherLinear"));
		IMAGE_GATHER_EXTENDED_MODES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageGatherExtendedModes"));
		BLOCK_MATCH_EXTENDED_CLAMP_TO_EDGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blockMatchExtendedClampToEdge"));
		//@formatter:on
	}

	public VkPhysicalDeviceImageProcessing3FeaturesQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceImageProcessing3FeaturesQCOM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceImageProcessing3FeaturesQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceImageProcessing3FeaturesQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceImageProcessing3FeaturesQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #imageGatherLinear()
    public VkPhysicalDeviceImageProcessing3FeaturesQCOM imageGatherLinear(int imageGatherLinear) {
    	IMAGE_GATHER_LINEAR_HANDLE.set(segment, 0L, imageGatherLinear);
    	return this;
    }
    
    public int imageGatherLinear() {
    	return (int) IMAGE_GATHER_LINEAR_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageGatherExtendedModes()
    public VkPhysicalDeviceImageProcessing3FeaturesQCOM imageGatherExtendedModes(int imageGatherExtendedModes) {
    	IMAGE_GATHER_EXTENDED_MODES_HANDLE.set(segment, 0L, imageGatherExtendedModes);
    	return this;
    }
    
    public int imageGatherExtendedModes() {
    	return (int) IMAGE_GATHER_EXTENDED_MODES_HANDLE.get(segment, 0L);
    }
    
    /// @see #blockMatchExtendedClampToEdge()
    public VkPhysicalDeviceImageProcessing3FeaturesQCOM blockMatchExtendedClampToEdge(int blockMatchExtendedClampToEdge) {
    	BLOCK_MATCH_EXTENDED_CLAMP_TO_EDGE_HANDLE.set(segment, 0L, blockMatchExtendedClampToEdge);
    	return this;
    }
    
    public int blockMatchExtendedClampToEdge() {
    	return (int) BLOCK_MATCH_EXTENDED_CLAMP_TO_EDGE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceImageProcessing3FeaturesQCOM set(VkPhysicalDeviceImageProcessing3FeaturesQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceImageProcessing3FeaturesQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceImageProcessing3FeaturesQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageProcessing3FeaturesQCOM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageProcessing3FeaturesQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageProcessing3FeaturesQCOM> array(SegmentAllocator allocator, VkPhysicalDeviceImageProcessing3FeaturesQCOM... structs) {
        NativeStructArray<VkPhysicalDeviceImageProcessing3FeaturesQCOM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageProcessing3FeaturesQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageProcessing3FeaturesQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageProcessing3FeaturesQCOM(segment)
        );
    }

}