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

public final class VkPhysicalDeviceImageProcessingFeaturesQCOM
		implements Struct<VkPhysicalDeviceImageProcessingFeaturesQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TEXTURE_SAMPLE_WEIGHTED_HANDLE;
	public static final VarHandle TEXTURE_BOX_FILTER_HANDLE;
	public static final VarHandle TEXTURE_BLOCK_MATCH_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TEXTURE_SAMPLE_WEIGHTED_BYTE_OFFSET;
	public static final long TEXTURE_BOX_FILTER_BYTE_OFFSET;
	public static final long TEXTURE_BLOCK_MATCH_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("textureSampleWeighted"),
		    JAVA_INT.withName("textureBoxFilter"),
		    JAVA_INT.withName("textureBlockMatch"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceImageProcessingFeaturesQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TEXTURE_SAMPLE_WEIGHTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("textureSampleWeighted"));
		TEXTURE_BOX_FILTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("textureBoxFilter"));
		TEXTURE_BLOCK_MATCH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("textureBlockMatch"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TEXTURE_SAMPLE_WEIGHTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("textureSampleWeighted"));
		TEXTURE_BOX_FILTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("textureBoxFilter"));
		TEXTURE_BLOCK_MATCH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("textureBlockMatch"));
		//@formatter:on
	}

	public VkPhysicalDeviceImageProcessingFeaturesQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceImageProcessingFeaturesQCOM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceImageProcessingFeaturesQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceImageProcessingFeaturesQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceImageProcessingFeaturesQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #textureSampleWeighted()
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureSampleWeighted(int textureSampleWeighted) {
    	TEXTURE_SAMPLE_WEIGHTED_HANDLE.set(segment, 0L, textureSampleWeighted);
    	return this;
    }
    
    public int textureSampleWeighted() {
    	return (int) TEXTURE_SAMPLE_WEIGHTED_HANDLE.get(segment, 0L);
    }
    
    /// @see #textureBoxFilter()
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureBoxFilter(int textureBoxFilter) {
    	TEXTURE_BOX_FILTER_HANDLE.set(segment, 0L, textureBoxFilter);
    	return this;
    }
    
    public int textureBoxFilter() {
    	return (int) TEXTURE_BOX_FILTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #textureBlockMatch()
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureBlockMatch(int textureBlockMatch) {
    	TEXTURE_BLOCK_MATCH_HANDLE.set(segment, 0L, textureBlockMatch);
    	return this;
    }
    
    public int textureBlockMatch() {
    	return (int) TEXTURE_BLOCK_MATCH_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceImageProcessingFeaturesQCOM set(VkPhysicalDeviceImageProcessingFeaturesQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceImageProcessingFeaturesQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceImageProcessingFeaturesQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageProcessingFeaturesQCOM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageProcessingFeaturesQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageProcessingFeaturesQCOM> array(SegmentAllocator allocator, VkPhysicalDeviceImageProcessingFeaturesQCOM... structs) {
        NativeStructArray<VkPhysicalDeviceImageProcessingFeaturesQCOM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageProcessingFeaturesQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageProcessingFeaturesQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageProcessingFeaturesQCOM(segment)
        );
    }

}