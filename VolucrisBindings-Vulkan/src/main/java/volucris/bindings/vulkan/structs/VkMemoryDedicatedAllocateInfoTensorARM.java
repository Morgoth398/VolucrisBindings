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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkMemoryDedicatedAllocateInfoTensorARM
		implements Struct<VkMemoryDedicatedAllocateInfoTensorARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TENSOR_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TENSOR_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("tensor")
		).withName("VkMemoryDedicatedAllocateInfoTensorARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TENSOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tensor"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TENSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tensor"));
		//@formatter:on
	}

	public VkMemoryDedicatedAllocateInfoTensorARM() {
	    this(Arena.ofAuto());
	}
	
	public VkMemoryDedicatedAllocateInfoTensorARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkMemoryDedicatedAllocateInfoTensorARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkMemoryDedicatedAllocateInfoTensorARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMemoryDedicatedAllocateInfoTensorARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #tensor()
    public VkMemoryDedicatedAllocateInfoTensorARM tensor(VkTensorARM tensor) {
    	TENSOR_HANDLE.set(segment, 0L, tensor.memorySegment());
    	return this;
    }
    
    public @Nullable VkTensorARM tensor() {
    	MemorySegment segment = (MemorySegment) TENSOR_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkTensorARM(segment);
    }
    
    @Override
    public VkMemoryDedicatedAllocateInfoTensorARM set(VkMemoryDedicatedAllocateInfoTensorARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkMemoryDedicatedAllocateInfoTensorARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMemoryDedicatedAllocateInfoTensorARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMemoryDedicatedAllocateInfoTensorARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryDedicatedAllocateInfoTensorARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMemoryDedicatedAllocateInfoTensorARM> array(Arena arena, VkMemoryDedicatedAllocateInfoTensorARM... structs) {
        NativeStructArray<VkMemoryDedicatedAllocateInfoTensorARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryDedicatedAllocateInfoTensorARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMemoryDedicatedAllocateInfoTensorARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMemoryDedicatedAllocateInfoTensorARM(segment)
        );
    }

}