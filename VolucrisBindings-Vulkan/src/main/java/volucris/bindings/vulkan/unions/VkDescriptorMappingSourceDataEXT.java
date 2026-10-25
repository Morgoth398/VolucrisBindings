/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.unions;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.structs.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkDescriptorMappingSourceDataEXT
		implements Struct<VkDescriptorMappingSourceDataEXT> {

	public static final UnionLayout LAYOUT;

	public static final VarHandle PUSH_DATA_OFFSET_HANDLE;
	public static final VarHandle PUSH_ADDRESS_OFFSET_HANDLE;
	public static final VarHandle SHADER_RECORD_DATA_OFFSET_HANDLE;
	public static final VarHandle SHADER_RECORD_ADDRESS_OFFSET_HANDLE;

	public static final long CONSTANT_OFFSET_BYTE_OFFSET;
	public static final long PUSH_INDEX_BYTE_OFFSET;
	public static final long INDIRECT_INDEX_BYTE_OFFSET;
	public static final long INDIRECT_INDEX_ARRAY_BYTE_OFFSET;
	public static final long HEAP_DATA_BYTE_OFFSET;
	public static final long PUSH_DATA_OFFSET_BYTE_OFFSET;
	public static final long PUSH_ADDRESS_OFFSET_BYTE_OFFSET;
	public static final long INDIRECT_ADDRESS_BYTE_OFFSET;
	public static final long SHADER_RECORD_INDEX_BYTE_OFFSET;
	public static final long SHADER_RECORD_DATA_OFFSET_BYTE_OFFSET;
	public static final long SHADER_RECORD_ADDRESS_OFFSET_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDescriptorMappingSourceConstantOffsetEXT constantOffset;
	private final VkDescriptorMappingSourcePushIndexEXT pushIndex;
	private final VkDescriptorMappingSourceIndirectIndexEXT indirectIndex;
	private final VkDescriptorMappingSourceIndirectIndexArrayEXT indirectIndexArray;
	private final VkDescriptorMappingSourceHeapDataEXT heapData;
	private final VkDescriptorMappingSourceIndirectAddressEXT indirectAddress;
	private final VkDescriptorMappingSourceShaderRecordIndexEXT shaderRecordIndex;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.unionLayout(
		    VkDescriptorMappingSourceConstantOffsetEXT.LAYOUT.withName("constantOffset"),
		    VkDescriptorMappingSourcePushIndexEXT.LAYOUT.withName("pushIndex"),
		    VkDescriptorMappingSourceIndirectIndexEXT.LAYOUT.withName("indirectIndex"),
		    VkDescriptorMappingSourceIndirectIndexArrayEXT.LAYOUT.withName("indirectIndexArray"),
		    VkDescriptorMappingSourceHeapDataEXT.LAYOUT.withName("heapData"),
		    JAVA_INT.withName("pushDataOffset"),
		    JAVA_INT.withName("pushAddressOffset"),
		    VkDescriptorMappingSourceIndirectAddressEXT.LAYOUT.withName("indirectAddress"),
		    VkDescriptorMappingSourceShaderRecordIndexEXT.LAYOUT.withName("shaderRecordIndex"),
		    JAVA_INT.withName("shaderRecordDataOffset"),
		    JAVA_INT.withName("shaderRecordAddressOffset")
		).withName("VkDescriptorMappingSourceDataEXT").withByteAlignment(8);
		
		PUSH_DATA_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushDataOffset"));
		PUSH_ADDRESS_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushAddressOffset"));
		SHADER_RECORD_DATA_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderRecordDataOffset"));
		SHADER_RECORD_ADDRESS_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderRecordAddressOffset"));
		
		CONSTANT_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("constantOffset"));
		PUSH_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushIndex"));
		INDIRECT_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indirectIndex"));
		INDIRECT_INDEX_ARRAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indirectIndexArray"));
		HEAP_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapData"));
		PUSH_DATA_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushDataOffset"));
		PUSH_ADDRESS_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushAddressOffset"));
		INDIRECT_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indirectAddress"));
		SHADER_RECORD_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderRecordIndex"));
		SHADER_RECORD_DATA_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderRecordDataOffset"));
		SHADER_RECORD_ADDRESS_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderRecordAddressOffset"));
		//@formatter:on
	}

	public VkDescriptorMappingSourceDataEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDescriptorMappingSourceDataEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDescriptorMappingSourceDataEXT(MemorySegment segment) {
	    this.segment = segment;
	
	    constantOffset = new VkDescriptorMappingSourceConstantOffsetEXT(segment.asSlice(CONSTANT_OFFSET_BYTE_OFFSET, VkDescriptorMappingSourceConstantOffsetEXT.LAYOUT));
	    pushIndex = new VkDescriptorMappingSourcePushIndexEXT(segment.asSlice(PUSH_INDEX_BYTE_OFFSET, VkDescriptorMappingSourcePushIndexEXT.LAYOUT));
	    indirectIndex = new VkDescriptorMappingSourceIndirectIndexEXT(segment.asSlice(INDIRECT_INDEX_BYTE_OFFSET, VkDescriptorMappingSourceIndirectIndexEXT.LAYOUT));
	    indirectIndexArray = new VkDescriptorMappingSourceIndirectIndexArrayEXT(segment.asSlice(INDIRECT_INDEX_ARRAY_BYTE_OFFSET, VkDescriptorMappingSourceIndirectIndexArrayEXT.LAYOUT));
	    heapData = new VkDescriptorMappingSourceHeapDataEXT(segment.asSlice(HEAP_DATA_BYTE_OFFSET, VkDescriptorMappingSourceHeapDataEXT.LAYOUT));
	    indirectAddress = new VkDescriptorMappingSourceIndirectAddressEXT(segment.asSlice(INDIRECT_ADDRESS_BYTE_OFFSET, VkDescriptorMappingSourceIndirectAddressEXT.LAYOUT));
	    shaderRecordIndex = new VkDescriptorMappingSourceShaderRecordIndexEXT(segment.asSlice(SHADER_RECORD_INDEX_BYTE_OFFSET, VkDescriptorMappingSourceShaderRecordIndexEXT.LAYOUT));
	}

    /// @see #constantOffset()
    public VkDescriptorMappingSourceDataEXT constantOffset(Consumer<VkDescriptorMappingSourceConstantOffsetEXT> consumer) {
    	consumer.accept(constantOffset);
    	return this;
    }
    
    /// @see #constantOffset()
    public VkDescriptorMappingSourceDataEXT constantOffset(VkDescriptorMappingSourceConstantOffsetEXT other) {
    	constantOffset.set(other);
    	return this;
    }
    
    public VkDescriptorMappingSourceConstantOffsetEXT constantOffset() {
    	return constantOffset;
    }
    
    /// @see #pushIndex()
    public VkDescriptorMappingSourceDataEXT pushIndex(Consumer<VkDescriptorMappingSourcePushIndexEXT> consumer) {
    	consumer.accept(pushIndex);
    	return this;
    }
    
    /// @see #pushIndex()
    public VkDescriptorMappingSourceDataEXT pushIndex(VkDescriptorMappingSourcePushIndexEXT other) {
    	pushIndex.set(other);
    	return this;
    }
    
    public VkDescriptorMappingSourcePushIndexEXT pushIndex() {
    	return pushIndex;
    }
    
    /// @see #indirectIndex()
    public VkDescriptorMappingSourceDataEXT indirectIndex(Consumer<VkDescriptorMappingSourceIndirectIndexEXT> consumer) {
    	consumer.accept(indirectIndex);
    	return this;
    }
    
    /// @see #indirectIndex()
    public VkDescriptorMappingSourceDataEXT indirectIndex(VkDescriptorMappingSourceIndirectIndexEXT other) {
    	indirectIndex.set(other);
    	return this;
    }
    
    public VkDescriptorMappingSourceIndirectIndexEXT indirectIndex() {
    	return indirectIndex;
    }
    
    /// @see #indirectIndexArray()
    public VkDescriptorMappingSourceDataEXT indirectIndexArray(Consumer<VkDescriptorMappingSourceIndirectIndexArrayEXT> consumer) {
    	consumer.accept(indirectIndexArray);
    	return this;
    }
    
    /// @see #indirectIndexArray()
    public VkDescriptorMappingSourceDataEXT indirectIndexArray(VkDescriptorMappingSourceIndirectIndexArrayEXT other) {
    	indirectIndexArray.set(other);
    	return this;
    }
    
    public VkDescriptorMappingSourceIndirectIndexArrayEXT indirectIndexArray() {
    	return indirectIndexArray;
    }
    
    /// @see #heapData()
    public VkDescriptorMappingSourceDataEXT heapData(Consumer<VkDescriptorMappingSourceHeapDataEXT> consumer) {
    	consumer.accept(heapData);
    	return this;
    }
    
    /// @see #heapData()
    public VkDescriptorMappingSourceDataEXT heapData(VkDescriptorMappingSourceHeapDataEXT other) {
    	heapData.set(other);
    	return this;
    }
    
    public VkDescriptorMappingSourceHeapDataEXT heapData() {
    	return heapData;
    }
    
    /// @see #pushDataOffset()
    public VkDescriptorMappingSourceDataEXT pushDataOffset(int pushDataOffset) {
    	PUSH_DATA_OFFSET_HANDLE.set(segment, 0L, pushDataOffset);
    	return this;
    }
    
    public int pushDataOffset() {
    	return (int) PUSH_DATA_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #pushAddressOffset()
    public VkDescriptorMappingSourceDataEXT pushAddressOffset(int pushAddressOffset) {
    	PUSH_ADDRESS_OFFSET_HANDLE.set(segment, 0L, pushAddressOffset);
    	return this;
    }
    
    public int pushAddressOffset() {
    	return (int) PUSH_ADDRESS_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #indirectAddress()
    public VkDescriptorMappingSourceDataEXT indirectAddress(Consumer<VkDescriptorMappingSourceIndirectAddressEXT> consumer) {
    	consumer.accept(indirectAddress);
    	return this;
    }
    
    /// @see #indirectAddress()
    public VkDescriptorMappingSourceDataEXT indirectAddress(VkDescriptorMappingSourceIndirectAddressEXT other) {
    	indirectAddress.set(other);
    	return this;
    }
    
    public VkDescriptorMappingSourceIndirectAddressEXT indirectAddress() {
    	return indirectAddress;
    }
    
    /// @see #shaderRecordIndex()
    public VkDescriptorMappingSourceDataEXT shaderRecordIndex(Consumer<VkDescriptorMappingSourceShaderRecordIndexEXT> consumer) {
    	consumer.accept(shaderRecordIndex);
    	return this;
    }
    
    /// @see #shaderRecordIndex()
    public VkDescriptorMappingSourceDataEXT shaderRecordIndex(VkDescriptorMappingSourceShaderRecordIndexEXT other) {
    	shaderRecordIndex.set(other);
    	return this;
    }
    
    public VkDescriptorMappingSourceShaderRecordIndexEXT shaderRecordIndex() {
    	return shaderRecordIndex;
    }
    
    /// @see #shaderRecordDataOffset()
    public VkDescriptorMappingSourceDataEXT shaderRecordDataOffset(int shaderRecordDataOffset) {
    	SHADER_RECORD_DATA_OFFSET_HANDLE.set(segment, 0L, shaderRecordDataOffset);
    	return this;
    }
    
    public int shaderRecordDataOffset() {
    	return (int) SHADER_RECORD_DATA_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderRecordAddressOffset()
    public VkDescriptorMappingSourceDataEXT shaderRecordAddressOffset(int shaderRecordAddressOffset) {
    	SHADER_RECORD_ADDRESS_OFFSET_HANDLE.set(segment, 0L, shaderRecordAddressOffset);
    	return this;
    }
    
    public int shaderRecordAddressOffset() {
    	return (int) SHADER_RECORD_ADDRESS_OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorMappingSourceDataEXT set(VkDescriptorMappingSourceDataEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorMappingSourceDataEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorMappingSourceDataEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceDataEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceDataEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceDataEXT> array(SegmentAllocator allocator, VkDescriptorMappingSourceDataEXT... structs) {
        NativeStructArray<VkDescriptorMappingSourceDataEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceDataEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceDataEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceDataEXT(segment)
        );
    }

}