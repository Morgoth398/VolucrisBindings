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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkSetDescriptorBufferOffsetsInfoEXT
		implements Struct<VkSetDescriptorBufferOffsetsInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STAGE_FLAGS_HANDLE;
	public static final VarHandle LAYOUT_HANDLE;
	public static final VarHandle FIRST_SET_HANDLE;
	public static final VarHandle SET_COUNT_HANDLE;
	public static final VarHandle P_BUFFER_INDICES_HANDLE;
	public static final VarHandle P_OFFSETS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STAGE_FLAGS_BYTE_OFFSET;
	public static final long LAYOUT_BYTE_OFFSET;
	public static final long FIRST_SET_BYTE_OFFSET;
	public static final long SET_COUNT_BYTE_OFFSET;
	public static final long P_BUFFER_INDICES_BYTE_OFFSET;
	public static final long P_OFFSETS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("stageFlags"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("layout"),
		    JAVA_INT.withName("firstSet"),
		    JAVA_INT.withName("setCount"),
		    UNBOUNDED_ADDRESS.withName("pBufferIndices"),
		    UNBOUNDED_ADDRESS.withName("pOffsets")
		).withName("VkSetDescriptorBufferOffsetsInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STAGE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stageFlags"));
		LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layout"));
		FIRST_SET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("firstSet"));
		SET_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("setCount"));
		P_BUFFER_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBufferIndices"));
		P_OFFSETS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pOffsets"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STAGE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
		LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layout"));
		FIRST_SET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("firstSet"));
		SET_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("setCount"));
		P_BUFFER_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBufferIndices"));
		P_OFFSETS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pOffsets"));
		//@formatter:on
	}

	public VkSetDescriptorBufferOffsetsInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkSetDescriptorBufferOffsetsInfoEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSetDescriptorBufferOffsetsInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSetDescriptorBufferOffsetsInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSetDescriptorBufferOffsetsInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #stageFlags()
    public VkSetDescriptorBufferOffsetsInfoEXT stageFlags(int stageFlags) {
    	STAGE_FLAGS_HANDLE.set(segment, 0L, stageFlags);
    	return this;
    }
    
    public int stageFlags() {
    	return (int) STAGE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #layout()
    public VkSetDescriptorBufferOffsetsInfoEXT layout(VkPipelineLayout layout) {
    	LAYOUT_HANDLE.set(segment, 0L, layout.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineLayout layout() {
    	MemorySegment segment = (MemorySegment) LAYOUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineLayout(segment);
    }
    
    /// @see #firstSet()
    public VkSetDescriptorBufferOffsetsInfoEXT firstSet(int firstSet) {
    	FIRST_SET_HANDLE.set(segment, 0L, firstSet);
    	return this;
    }
    
    public int firstSet() {
    	return (int) FIRST_SET_HANDLE.get(segment, 0L);
    }
    
    /// @see #setCount()
    public VkSetDescriptorBufferOffsetsInfoEXT setCount(int setCount) {
    	SET_COUNT_HANDLE.set(segment, 0L, setCount);
    	return this;
    }
    
    public int setCount() {
    	return (int) SET_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pBufferIndices()
    public VkSetDescriptorBufferOffsetsInfoEXT pBufferIndices(NativeIntArray pBufferIndices) {
    	P_BUFFER_INDICES_HANDLE.set(segment, 0L, pBufferIndices.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pBufferIndices() {
    	MemorySegment segment = (MemorySegment) P_BUFFER_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #pOffsets()
    public VkSetDescriptorBufferOffsetsInfoEXT pOffsets(NativeLongArray pOffsets) {
    	P_OFFSETS_HANDLE.set(segment, 0L, pOffsets.memorySegment());
    	return this;
    }
    
    public @Nullable NativeLongArray pOffsets() {
    	MemorySegment segment = (MemorySegment) P_OFFSETS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeLongArray(segment);
    }
    
    @Override
    public VkSetDescriptorBufferOffsetsInfoEXT set(VkSetDescriptorBufferOffsetsInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkSetDescriptorBufferOffsetsInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSetDescriptorBufferOffsetsInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSetDescriptorBufferOffsetsInfoEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSetDescriptorBufferOffsetsInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSetDescriptorBufferOffsetsInfoEXT> array(SegmentAllocator allocator, VkSetDescriptorBufferOffsetsInfoEXT... structs) {
        NativeStructArray<VkSetDescriptorBufferOffsetsInfoEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSetDescriptorBufferOffsetsInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSetDescriptorBufferOffsetsInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSetDescriptorBufferOffsetsInfoEXT(segment)
        );
    }

}