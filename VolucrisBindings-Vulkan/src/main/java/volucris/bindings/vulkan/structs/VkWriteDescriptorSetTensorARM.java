/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkWriteDescriptorSetTensorARM
		implements Struct<VkWriteDescriptorSetTensorARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TENSOR_VIEW_COUNT_HANDLE;
	public static final VarHandle P_TENSOR_VIEWS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TENSOR_VIEW_COUNT_BYTE_OFFSET;
	public static final long P_TENSOR_VIEWS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("tensorViewCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pTensorViews")
		).withName("VkWriteDescriptorSetTensorARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TENSOR_VIEW_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tensorViewCount"));
		P_TENSOR_VIEWS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTensorViews"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TENSOR_VIEW_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tensorViewCount"));
		P_TENSOR_VIEWS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTensorViews"));
		//@formatter:on
	}

	public VkWriteDescriptorSetTensorARM() {
	    this(Arena.ofAuto());
	}
	
	public VkWriteDescriptorSetTensorARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkWriteDescriptorSetTensorARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkWriteDescriptorSetTensorARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkWriteDescriptorSetTensorARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #tensorViewCount()
    public VkWriteDescriptorSetTensorARM tensorViewCount(int tensorViewCount) {
    	TENSOR_VIEW_COUNT_HANDLE.set(segment, 0L, tensorViewCount);
    	return this;
    }
    
    public int tensorViewCount() {
    	return (int) TENSOR_VIEW_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pTensorViews()
    public VkWriteDescriptorSetTensorARM pTensorViews(NativePointerArray pTensorViews) {
    	P_TENSOR_VIEWS_HANDLE.set(segment, 0L, pTensorViews.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pTensorViews() {
    	MemorySegment segment = (MemorySegment) P_TENSOR_VIEWS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public VkWriteDescriptorSetTensorARM set(VkWriteDescriptorSetTensorARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkWriteDescriptorSetTensorARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkWriteDescriptorSetTensorARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkWriteDescriptorSetTensorARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkWriteDescriptorSetTensorARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkWriteDescriptorSetTensorARM> array(Arena arena, VkWriteDescriptorSetTensorARM... structs) {
        NativeStructArray<VkWriteDescriptorSetTensorARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkWriteDescriptorSetTensorARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkWriteDescriptorSetTensorARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkWriteDescriptorSetTensorARM(segment)
        );
    }

}