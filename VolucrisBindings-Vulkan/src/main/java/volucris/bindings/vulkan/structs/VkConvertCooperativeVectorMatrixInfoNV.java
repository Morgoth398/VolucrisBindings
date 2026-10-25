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
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkConvertCooperativeVectorMatrixInfoNV
		implements Struct<VkConvertCooperativeVectorMatrixInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SRC_SIZE_HANDLE;
	public static final VarHandle P_DST_SIZE_HANDLE;
	public static final VarHandle SRC_COMPONENT_TYPE_HANDLE;
	public static final VarHandle DST_COMPONENT_TYPE_HANDLE;
	public static final VarHandle NUM_ROWS_HANDLE;
	public static final VarHandle NUM_COLUMNS_HANDLE;
	public static final VarHandle SRC_LAYOUT_HANDLE;
	public static final VarHandle SRC_STRIDE_HANDLE;
	public static final VarHandle DST_LAYOUT_HANDLE;
	public static final VarHandle DST_STRIDE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SRC_SIZE_BYTE_OFFSET;
	public static final long SRC_DATA_BYTE_OFFSET;
	public static final long P_DST_SIZE_BYTE_OFFSET;
	public static final long DST_DATA_BYTE_OFFSET;
	public static final long SRC_COMPONENT_TYPE_BYTE_OFFSET;
	public static final long DST_COMPONENT_TYPE_BYTE_OFFSET;
	public static final long NUM_ROWS_BYTE_OFFSET;
	public static final long NUM_COLUMNS_BYTE_OFFSET;
	public static final long SRC_LAYOUT_BYTE_OFFSET;
	public static final long SRC_STRIDE_BYTE_OFFSET;
	public static final long DST_LAYOUT_BYTE_OFFSET;
	public static final long DST_STRIDE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDeviceOrHostAddressConstKHR srcData;
	private final VkDeviceOrHostAddressKHR dstData;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("srcSize"),
		    VkDeviceOrHostAddressConstKHR.LAYOUT.withName("srcData"),
		    UNBOUNDED_ADDRESS.withName("pDstSize"),
		    VkDeviceOrHostAddressKHR.LAYOUT.withName("dstData"),
		    JAVA_INT.withName("srcComponentType"),
		    JAVA_INT.withName("dstComponentType"),
		    JAVA_INT.withName("numRows"),
		    JAVA_INT.withName("numColumns"),
		    JAVA_INT.withName("srcLayout"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("srcStride"),
		    JAVA_INT.withName("dstLayout"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("dstStride")
		).withName("VkConvertCooperativeVectorMatrixInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SRC_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcSize"));
		P_DST_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDstSize"));
		SRC_COMPONENT_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcComponentType"));
		DST_COMPONENT_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstComponentType"));
		NUM_ROWS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numRows"));
		NUM_COLUMNS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numColumns"));
		SRC_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcLayout"));
		SRC_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcStride"));
		DST_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstLayout"));
		DST_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstStride"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SRC_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcSize"));
		SRC_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcData"));
		P_DST_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDstSize"));
		DST_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstData"));
		SRC_COMPONENT_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcComponentType"));
		DST_COMPONENT_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstComponentType"));
		NUM_ROWS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numRows"));
		NUM_COLUMNS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numColumns"));
		SRC_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcLayout"));
		SRC_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcStride"));
		DST_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstLayout"));
		DST_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstStride"));
		//@formatter:on
	}

	public VkConvertCooperativeVectorMatrixInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkConvertCooperativeVectorMatrixInfoNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkConvertCooperativeVectorMatrixInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	    srcData = new VkDeviceOrHostAddressConstKHR(segment.asSlice(SRC_DATA_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
	    dstData = new VkDeviceOrHostAddressKHR(segment.asSlice(DST_DATA_BYTE_OFFSET, VkDeviceOrHostAddressKHR.LAYOUT));
	}

    /// @see #sType()
    public VkConvertCooperativeVectorMatrixInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkConvertCooperativeVectorMatrixInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #srcSize()
    public VkConvertCooperativeVectorMatrixInfoNV srcSize(long srcSize) {
    	SRC_SIZE_HANDLE.set(segment, 0L, srcSize);
    	return this;
    }
    
    public long srcSize() {
    	return (long) SRC_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcData()
    public VkConvertCooperativeVectorMatrixInfoNV srcData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(srcData);
    	return this;
    }
    
    /// @see #srcData()
    public VkConvertCooperativeVectorMatrixInfoNV srcData(VkDeviceOrHostAddressConstKHR other) {
    	srcData.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR srcData() {
    	return srcData;
    }
    
    /// @see #pDstSize()
    public VkConvertCooperativeVectorMatrixInfoNV pDstSize(NativeLongArray pDstSize) {
    	P_DST_SIZE_HANDLE.set(segment, 0L, pDstSize.memorySegment());
    	return this;
    }
    
    public @Nullable NativeLongArray pDstSize() {
    	MemorySegment segment = (MemorySegment) P_DST_SIZE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeLongArray(segment);
    }
    
    /// @see #dstData()
    public VkConvertCooperativeVectorMatrixInfoNV dstData(Consumer<VkDeviceOrHostAddressKHR> consumer) {
    	consumer.accept(dstData);
    	return this;
    }
    
    /// @see #dstData()
    public VkConvertCooperativeVectorMatrixInfoNV dstData(VkDeviceOrHostAddressKHR other) {
    	dstData.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressKHR dstData() {
    	return dstData;
    }
    
    /// @see #srcComponentType()
    public VkConvertCooperativeVectorMatrixInfoNV srcComponentType(int srcComponentType) {
    	SRC_COMPONENT_TYPE_HANDLE.set(segment, 0L, srcComponentType);
    	return this;
    }
    
    public int srcComponentType() {
    	return (int) SRC_COMPONENT_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstComponentType()
    public VkConvertCooperativeVectorMatrixInfoNV dstComponentType(int dstComponentType) {
    	DST_COMPONENT_TYPE_HANDLE.set(segment, 0L, dstComponentType);
    	return this;
    }
    
    public int dstComponentType() {
    	return (int) DST_COMPONENT_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #numRows()
    public VkConvertCooperativeVectorMatrixInfoNV numRows(int numRows) {
    	NUM_ROWS_HANDLE.set(segment, 0L, numRows);
    	return this;
    }
    
    public int numRows() {
    	return (int) NUM_ROWS_HANDLE.get(segment, 0L);
    }
    
    /// @see #numColumns()
    public VkConvertCooperativeVectorMatrixInfoNV numColumns(int numColumns) {
    	NUM_COLUMNS_HANDLE.set(segment, 0L, numColumns);
    	return this;
    }
    
    public int numColumns() {
    	return (int) NUM_COLUMNS_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcLayout()
    public VkConvertCooperativeVectorMatrixInfoNV srcLayout(int srcLayout) {
    	SRC_LAYOUT_HANDLE.set(segment, 0L, srcLayout);
    	return this;
    }
    
    public int srcLayout() {
    	return (int) SRC_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcStride()
    public VkConvertCooperativeVectorMatrixInfoNV srcStride(long srcStride) {
    	SRC_STRIDE_HANDLE.set(segment, 0L, srcStride);
    	return this;
    }
    
    public long srcStride() {
    	return (long) SRC_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstLayout()
    public VkConvertCooperativeVectorMatrixInfoNV dstLayout(int dstLayout) {
    	DST_LAYOUT_HANDLE.set(segment, 0L, dstLayout);
    	return this;
    }
    
    public int dstLayout() {
    	return (int) DST_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstStride()
    public VkConvertCooperativeVectorMatrixInfoNV dstStride(long dstStride) {
    	DST_STRIDE_HANDLE.set(segment, 0L, dstStride);
    	return this;
    }
    
    public long dstStride() {
    	return (long) DST_STRIDE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkConvertCooperativeVectorMatrixInfoNV set(VkConvertCooperativeVectorMatrixInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkConvertCooperativeVectorMatrixInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkConvertCooperativeVectorMatrixInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkConvertCooperativeVectorMatrixInfoNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkConvertCooperativeVectorMatrixInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkConvertCooperativeVectorMatrixInfoNV> array(SegmentAllocator allocator, VkConvertCooperativeVectorMatrixInfoNV... structs) {
        NativeStructArray<VkConvertCooperativeVectorMatrixInfoNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkConvertCooperativeVectorMatrixInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkConvertCooperativeVectorMatrixInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkConvertCooperativeVectorMatrixInfoNV(segment)
        );
    }

}