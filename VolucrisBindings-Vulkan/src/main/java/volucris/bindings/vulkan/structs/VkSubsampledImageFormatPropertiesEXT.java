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

public final class VkSubsampledImageFormatPropertiesEXT
		implements Struct<VkSubsampledImageFormatPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SUBSAMPLED_IMAGE_DESCRIPTOR_COUNT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SUBSAMPLED_IMAGE_DESCRIPTOR_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("subsampledImageDescriptorCount"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkSubsampledImageFormatPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SUBSAMPLED_IMAGE_DESCRIPTOR_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subsampledImageDescriptorCount"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SUBSAMPLED_IMAGE_DESCRIPTOR_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subsampledImageDescriptorCount"));
		//@formatter:on
	}

	public VkSubsampledImageFormatPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkSubsampledImageFormatPropertiesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSubsampledImageFormatPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSubsampledImageFormatPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSubsampledImageFormatPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #subsampledImageDescriptorCount()
    public VkSubsampledImageFormatPropertiesEXT subsampledImageDescriptorCount(int subsampledImageDescriptorCount) {
    	SUBSAMPLED_IMAGE_DESCRIPTOR_COUNT_HANDLE.set(segment, 0L, subsampledImageDescriptorCount);
    	return this;
    }
    
    public int subsampledImageDescriptorCount() {
    	return (int) SUBSAMPLED_IMAGE_DESCRIPTOR_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSubsampledImageFormatPropertiesEXT set(VkSubsampledImageFormatPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkSubsampledImageFormatPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSubsampledImageFormatPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSubsampledImageFormatPropertiesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSubsampledImageFormatPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSubsampledImageFormatPropertiesEXT> array(SegmentAllocator allocator, VkSubsampledImageFormatPropertiesEXT... structs) {
        NativeStructArray<VkSubsampledImageFormatPropertiesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSubsampledImageFormatPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSubsampledImageFormatPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSubsampledImageFormatPropertiesEXT(segment)
        );
    }

}