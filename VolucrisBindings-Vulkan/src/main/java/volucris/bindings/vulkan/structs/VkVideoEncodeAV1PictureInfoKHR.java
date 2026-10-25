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

public final class VkVideoEncodeAV1PictureInfoKHR
		implements Struct<VkVideoEncodeAV1PictureInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PREDICTION_MODE_HANDLE;
	public static final VarHandle RATE_CONTROL_GROUP_HANDLE;
	public static final VarHandle CONSTANT_QINDEX_HANDLE;
	public static final VarHandle P_STD_PICTURE_INFO_HANDLE;
	public static final VarHandle REFERENCE_NAME_SLOT_INDICES_HANDLE;
	public static final VarHandle PRIMARY_REFERENCE_CDF_ONLY_HANDLE;
	public static final VarHandle GENERATE_OBU_EXTENSION_HEADER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PREDICTION_MODE_BYTE_OFFSET;
	public static final long RATE_CONTROL_GROUP_BYTE_OFFSET;
	public static final long CONSTANT_QINDEX_BYTE_OFFSET;
	public static final long P_STD_PICTURE_INFO_BYTE_OFFSET;
	public static final long REFERENCE_NAME_SLOT_INDICES_BYTE_OFFSET;
	public static final long PRIMARY_REFERENCE_CDF_ONLY_BYTE_OFFSET;
	public static final long GENERATE_OBU_EXTENSION_HEADER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("predictionMode"),
		    JAVA_INT.withName("rateControlGroup"),
		    JAVA_INT.withName("constantQIndex"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pStdPictureInfo"),
		    MemoryLayout.sequenceLayout(7, JAVA_INT).withName("referenceNameSlotIndices"),
		    JAVA_INT.withName("primaryReferenceCdfOnly"),
		    JAVA_INT.withName("generateObuExtensionHeader"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkVideoEncodeAV1PictureInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PREDICTION_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("predictionMode"));
		RATE_CONTROL_GROUP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rateControlGroup"));
		CONSTANT_QINDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("constantQIndex"));
		P_STD_PICTURE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdPictureInfo"));
		REFERENCE_NAME_SLOT_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("referenceNameSlotIndices"), PathElement.sequenceElement());
		PRIMARY_REFERENCE_CDF_ONLY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primaryReferenceCdfOnly"));
		GENERATE_OBU_EXTENSION_HEADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("generateObuExtensionHeader"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PREDICTION_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("predictionMode"));
		RATE_CONTROL_GROUP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rateControlGroup"));
		CONSTANT_QINDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("constantQIndex"));
		P_STD_PICTURE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
		REFERENCE_NAME_SLOT_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("referenceNameSlotIndices"));
		PRIMARY_REFERENCE_CDF_ONLY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primaryReferenceCdfOnly"));
		GENERATE_OBU_EXTENSION_HEADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("generateObuExtensionHeader"));
		//@formatter:on
	}

	public VkVideoEncodeAV1PictureInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeAV1PictureInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoEncodeAV1PictureInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeAV1PictureInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeAV1PictureInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #predictionMode()
    public VkVideoEncodeAV1PictureInfoKHR predictionMode(int predictionMode) {
    	PREDICTION_MODE_HANDLE.set(segment, 0L, predictionMode);
    	return this;
    }
    
    public int predictionMode() {
    	return (int) PREDICTION_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #rateControlGroup()
    public VkVideoEncodeAV1PictureInfoKHR rateControlGroup(int rateControlGroup) {
    	RATE_CONTROL_GROUP_HANDLE.set(segment, 0L, rateControlGroup);
    	return this;
    }
    
    public int rateControlGroup() {
    	return (int) RATE_CONTROL_GROUP_HANDLE.get(segment, 0L);
    }
    
    /// @see #constantQIndex()
    public VkVideoEncodeAV1PictureInfoKHR constantQIndex(int constantQIndex) {
    	CONSTANT_QINDEX_HANDLE.set(segment, 0L, constantQIndex);
    	return this;
    }
    
    public int constantQIndex() {
    	return (int) CONSTANT_QINDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #pStdPictureInfo()
    public VkVideoEncodeAV1PictureInfoKHR pStdPictureInfo(StdVideoEncodeAV1PictureInfo pStdPictureInfo) {
    	P_STD_PICTURE_INFO_HANDLE.set(segment, 0L, pStdPictureInfo.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoEncodeAV1PictureInfo pStdPictureInfo() {
    	MemorySegment segment = (MemorySegment) P_STD_PICTURE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoEncodeAV1PictureInfo(segment);
    }
    
    /// @see #referenceNameSlotIndices(int)
    public VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndices(int referenceNameSlotIndices, int index0) {
    	REFERENCE_NAME_SLOT_INDICES_HANDLE.set(segment, 0L, index0, referenceNameSlotIndices);
    	return this;
    }
    
    public int referenceNameSlotIndices(int index0) {
    	return (int) REFERENCE_NAME_SLOT_INDICES_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #primaryReferenceCdfOnly()
    public VkVideoEncodeAV1PictureInfoKHR primaryReferenceCdfOnly(int primaryReferenceCdfOnly) {
    	PRIMARY_REFERENCE_CDF_ONLY_HANDLE.set(segment, 0L, primaryReferenceCdfOnly);
    	return this;
    }
    
    public int primaryReferenceCdfOnly() {
    	return (int) PRIMARY_REFERENCE_CDF_ONLY_HANDLE.get(segment, 0L);
    }
    
    /// @see #generateObuExtensionHeader()
    public VkVideoEncodeAV1PictureInfoKHR generateObuExtensionHeader(int generateObuExtensionHeader) {
    	GENERATE_OBU_EXTENSION_HEADER_HANDLE.set(segment, 0L, generateObuExtensionHeader);
    	return this;
    }
    
    public int generateObuExtensionHeader() {
    	return (int) GENERATE_OBU_EXTENSION_HEADER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeAV1PictureInfoKHR set(VkVideoEncodeAV1PictureInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeAV1PictureInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeAV1PictureInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeAV1PictureInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeAV1PictureInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeAV1PictureInfoKHR> array(SegmentAllocator allocator, VkVideoEncodeAV1PictureInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeAV1PictureInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeAV1PictureInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeAV1PictureInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeAV1PictureInfoKHR(segment)
        );
    }

}