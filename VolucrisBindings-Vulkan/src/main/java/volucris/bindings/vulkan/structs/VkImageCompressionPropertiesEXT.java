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

public final class VkImageCompressionPropertiesEXT
		implements Struct<VkImageCompressionPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle IMAGE_COMPRESSION_FLAGS_HANDLE;
	public static final VarHandle IMAGE_COMPRESSION_FIXED_RATE_FLAGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long IMAGE_COMPRESSION_FLAGS_BYTE_OFFSET;
	public static final long IMAGE_COMPRESSION_FIXED_RATE_FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("imageCompressionFlags"),
		    JAVA_INT.withName("imageCompressionFixedRateFlags")
		).withName("VkImageCompressionPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		IMAGE_COMPRESSION_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageCompressionFlags"));
		IMAGE_COMPRESSION_FIXED_RATE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageCompressionFixedRateFlags"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		IMAGE_COMPRESSION_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageCompressionFlags"));
		IMAGE_COMPRESSION_FIXED_RATE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageCompressionFixedRateFlags"));
		//@formatter:on
	}

	public VkImageCompressionPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkImageCompressionPropertiesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkImageCompressionPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkImageCompressionPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageCompressionPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #imageCompressionFlags()
    public VkImageCompressionPropertiesEXT imageCompressionFlags(int imageCompressionFlags) {
    	IMAGE_COMPRESSION_FLAGS_HANDLE.set(segment, 0L, imageCompressionFlags);
    	return this;
    }
    
    public int imageCompressionFlags() {
    	return (int) IMAGE_COMPRESSION_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageCompressionFixedRateFlags()
    public VkImageCompressionPropertiesEXT imageCompressionFixedRateFlags(int imageCompressionFixedRateFlags) {
    	IMAGE_COMPRESSION_FIXED_RATE_FLAGS_HANDLE.set(segment, 0L, imageCompressionFixedRateFlags);
    	return this;
    }
    
    public int imageCompressionFixedRateFlags() {
    	return (int) IMAGE_COMPRESSION_FIXED_RATE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkImageCompressionPropertiesEXT set(VkImageCompressionPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageCompressionPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageCompressionPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageCompressionPropertiesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageCompressionPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageCompressionPropertiesEXT> array(SegmentAllocator allocator, VkImageCompressionPropertiesEXT... structs) {
        NativeStructArray<VkImageCompressionPropertiesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageCompressionPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageCompressionPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageCompressionPropertiesEXT(segment)
        );
    }

}