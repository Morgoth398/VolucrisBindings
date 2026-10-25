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

public final class VkVideoCapabilitiesKHR
		implements Struct<VkVideoCapabilitiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle MIN_BITSTREAM_BUFFER_OFFSET_ALIGNMENT_HANDLE;
	public static final VarHandle MIN_BITSTREAM_BUFFER_SIZE_ALIGNMENT_HANDLE;
	public static final VarHandle MAX_DPB_SLOTS_HANDLE;
	public static final VarHandle MAX_ACTIVE_REFERENCE_PICTURES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long MIN_BITSTREAM_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET;
	public static final long MIN_BITSTREAM_BUFFER_SIZE_ALIGNMENT_BYTE_OFFSET;
	public static final long PICTURE_ACCESS_GRANULARITY_BYTE_OFFSET;
	public static final long MIN_CODED_EXTENT_BYTE_OFFSET;
	public static final long MAX_CODED_EXTENT_BYTE_OFFSET;
	public static final long MAX_DPB_SLOTS_BYTE_OFFSET;
	public static final long MAX_ACTIVE_REFERENCE_PICTURES_BYTE_OFFSET;
	public static final long STD_HEADER_VERSION_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D pictureAccessGranularity;
	private final VkExtent2D minCodedExtent;
	private final VkExtent2D maxCodedExtent;
	private final VkExtensionProperties stdHeaderVersion;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("minBitstreamBufferOffsetAlignment"),
		    JAVA_LONG.withName("minBitstreamBufferSizeAlignment"),
		    VkExtent2D.LAYOUT.withName("pictureAccessGranularity"),
		    VkExtent2D.LAYOUT.withName("minCodedExtent"),
		    VkExtent2D.LAYOUT.withName("maxCodedExtent"),
		    JAVA_INT.withName("maxDpbSlots"),
		    JAVA_INT.withName("maxActiveReferencePictures"),
		    VkExtensionProperties.LAYOUT.withName("stdHeaderVersion"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkVideoCapabilitiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		MIN_BITSTREAM_BUFFER_OFFSET_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minBitstreamBufferOffsetAlignment"));
		MIN_BITSTREAM_BUFFER_SIZE_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minBitstreamBufferSizeAlignment"));
		MAX_DPB_SLOTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDpbSlots"));
		MAX_ACTIVE_REFERENCE_PICTURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxActiveReferencePictures"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		MIN_BITSTREAM_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minBitstreamBufferOffsetAlignment"));
		MIN_BITSTREAM_BUFFER_SIZE_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minBitstreamBufferSizeAlignment"));
		PICTURE_ACCESS_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pictureAccessGranularity"));
		MIN_CODED_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minCodedExtent"));
		MAX_CODED_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxCodedExtent"));
		MAX_DPB_SLOTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDpbSlots"));
		MAX_ACTIVE_REFERENCE_PICTURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxActiveReferencePictures"));
		STD_HEADER_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stdHeaderVersion"));
		//@formatter:on
	}

	public VkVideoCapabilitiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoCapabilitiesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoCapabilitiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    pictureAccessGranularity = new VkExtent2D(segment.asSlice(PICTURE_ACCESS_GRANULARITY_BYTE_OFFSET, VkExtent2D.LAYOUT));
	    minCodedExtent = new VkExtent2D(segment.asSlice(MIN_CODED_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
	    maxCodedExtent = new VkExtent2D(segment.asSlice(MAX_CODED_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
	    stdHeaderVersion = new VkExtensionProperties(segment.asSlice(STD_HEADER_VERSION_BYTE_OFFSET, VkExtensionProperties.LAYOUT));
	}

    /// @see #sType()
    public VkVideoCapabilitiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoCapabilitiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkVideoCapabilitiesKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #minBitstreamBufferOffsetAlignment()
    public VkVideoCapabilitiesKHR minBitstreamBufferOffsetAlignment(long minBitstreamBufferOffsetAlignment) {
    	MIN_BITSTREAM_BUFFER_OFFSET_ALIGNMENT_HANDLE.set(segment, 0L, minBitstreamBufferOffsetAlignment);
    	return this;
    }
    
    public long minBitstreamBufferOffsetAlignment() {
    	return (long) MIN_BITSTREAM_BUFFER_OFFSET_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #minBitstreamBufferSizeAlignment()
    public VkVideoCapabilitiesKHR minBitstreamBufferSizeAlignment(long minBitstreamBufferSizeAlignment) {
    	MIN_BITSTREAM_BUFFER_SIZE_ALIGNMENT_HANDLE.set(segment, 0L, minBitstreamBufferSizeAlignment);
    	return this;
    }
    
    public long minBitstreamBufferSizeAlignment() {
    	return (long) MIN_BITSTREAM_BUFFER_SIZE_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pictureAccessGranularity()
    public VkVideoCapabilitiesKHR pictureAccessGranularity(Consumer<VkExtent2D> consumer) {
    	consumer.accept(pictureAccessGranularity);
    	return this;
    }
    
    /// @see #pictureAccessGranularity()
    public VkVideoCapabilitiesKHR pictureAccessGranularity(VkExtent2D other) {
    	pictureAccessGranularity.set(other);
    	return this;
    }
    
    public VkExtent2D pictureAccessGranularity() {
    	return pictureAccessGranularity;
    }
    
    /// @see #minCodedExtent()
    public VkVideoCapabilitiesKHR minCodedExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(minCodedExtent);
    	return this;
    }
    
    /// @see #minCodedExtent()
    public VkVideoCapabilitiesKHR minCodedExtent(VkExtent2D other) {
    	minCodedExtent.set(other);
    	return this;
    }
    
    public VkExtent2D minCodedExtent() {
    	return minCodedExtent;
    }
    
    /// @see #maxCodedExtent()
    public VkVideoCapabilitiesKHR maxCodedExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxCodedExtent);
    	return this;
    }
    
    /// @see #maxCodedExtent()
    public VkVideoCapabilitiesKHR maxCodedExtent(VkExtent2D other) {
    	maxCodedExtent.set(other);
    	return this;
    }
    
    public VkExtent2D maxCodedExtent() {
    	return maxCodedExtent;
    }
    
    /// @see #maxDpbSlots()
    public VkVideoCapabilitiesKHR maxDpbSlots(int maxDpbSlots) {
    	MAX_DPB_SLOTS_HANDLE.set(segment, 0L, maxDpbSlots);
    	return this;
    }
    
    public int maxDpbSlots() {
    	return (int) MAX_DPB_SLOTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxActiveReferencePictures()
    public VkVideoCapabilitiesKHR maxActiveReferencePictures(int maxActiveReferencePictures) {
    	MAX_ACTIVE_REFERENCE_PICTURES_HANDLE.set(segment, 0L, maxActiveReferencePictures);
    	return this;
    }
    
    public int maxActiveReferencePictures() {
    	return (int) MAX_ACTIVE_REFERENCE_PICTURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #stdHeaderVersion()
    public VkVideoCapabilitiesKHR stdHeaderVersion(Consumer<VkExtensionProperties> consumer) {
    	consumer.accept(stdHeaderVersion);
    	return this;
    }
    
    /// @see #stdHeaderVersion()
    public VkVideoCapabilitiesKHR stdHeaderVersion(VkExtensionProperties other) {
    	stdHeaderVersion.set(other);
    	return this;
    }
    
    public VkExtensionProperties stdHeaderVersion() {
    	return stdHeaderVersion;
    }
    
    @Override
    public VkVideoCapabilitiesKHR set(VkVideoCapabilitiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoCapabilitiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoCapabilitiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoCapabilitiesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoCapabilitiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoCapabilitiesKHR> array(SegmentAllocator allocator, VkVideoCapabilitiesKHR... structs) {
        NativeStructArray<VkVideoCapabilitiesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoCapabilitiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoCapabilitiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoCapabilitiesKHR(segment)
        );
    }

}