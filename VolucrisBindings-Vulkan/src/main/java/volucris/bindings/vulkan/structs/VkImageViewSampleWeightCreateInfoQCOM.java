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
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkImageViewSampleWeightCreateInfoQCOM
		implements Struct<VkImageViewSampleWeightCreateInfoQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle NUM_PHASES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FILTER_CENTER_BYTE_OFFSET;
	public static final long FILTER_SIZE_BYTE_OFFSET;
	public static final long NUM_PHASES_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkOffset2D filterCenter;
	private final VkExtent2D filterSize;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkOffset2D.LAYOUT.withName("filterCenter"),
		    VkExtent2D.LAYOUT.withName("filterSize"),
		    JAVA_INT.withName("numPhases"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkImageViewSampleWeightCreateInfoQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		NUM_PHASES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numPhases"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FILTER_CENTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("filterCenter"));
		FILTER_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("filterSize"));
		NUM_PHASES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numPhases"));
		//@formatter:on
	}

	public VkImageViewSampleWeightCreateInfoQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkImageViewSampleWeightCreateInfoQCOM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkImageViewSampleWeightCreateInfoQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	    filterCenter = new VkOffset2D(segment.asSlice(FILTER_CENTER_BYTE_OFFSET, VkOffset2D.LAYOUT));
	    filterSize = new VkExtent2D(segment.asSlice(FILTER_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #sType()
    public VkImageViewSampleWeightCreateInfoQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageViewSampleWeightCreateInfoQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #filterCenter()
    public VkImageViewSampleWeightCreateInfoQCOM filterCenter(Consumer<VkOffset2D> consumer) {
    	consumer.accept(filterCenter);
    	return this;
    }
    
    /// @see #filterCenter()
    public VkImageViewSampleWeightCreateInfoQCOM filterCenter(VkOffset2D other) {
    	filterCenter.set(other);
    	return this;
    }
    
    public VkOffset2D filterCenter() {
    	return filterCenter;
    }
    
    /// @see #filterSize()
    public VkImageViewSampleWeightCreateInfoQCOM filterSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(filterSize);
    	return this;
    }
    
    /// @see #filterSize()
    public VkImageViewSampleWeightCreateInfoQCOM filterSize(VkExtent2D other) {
    	filterSize.set(other);
    	return this;
    }
    
    public VkExtent2D filterSize() {
    	return filterSize;
    }
    
    /// @see #numPhases()
    public VkImageViewSampleWeightCreateInfoQCOM numPhases(int numPhases) {
    	NUM_PHASES_HANDLE.set(segment, 0L, numPhases);
    	return this;
    }
    
    public int numPhases() {
    	return (int) NUM_PHASES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkImageViewSampleWeightCreateInfoQCOM set(VkImageViewSampleWeightCreateInfoQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageViewSampleWeightCreateInfoQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageViewSampleWeightCreateInfoQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageViewSampleWeightCreateInfoQCOM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageViewSampleWeightCreateInfoQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageViewSampleWeightCreateInfoQCOM> array(SegmentAllocator allocator, VkImageViewSampleWeightCreateInfoQCOM... structs) {
        NativeStructArray<VkImageViewSampleWeightCreateInfoQCOM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageViewSampleWeightCreateInfoQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageViewSampleWeightCreateInfoQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageViewSampleWeightCreateInfoQCOM(segment)
        );
    }

}