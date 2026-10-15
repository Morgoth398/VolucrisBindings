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

public final class VkPipelineBinaryDataKHR
		implements Struct<VkPipelineBinaryDataKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DATA_SIZE_HANDLE;
	public static final VarHandle P_DATA_HANDLE;

	public static final long DATA_SIZE_BYTE_OFFSET;
	public static final long P_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("dataSize"),
		    UNBOUNDED_ADDRESS.withName("pData")
		).withName("VkPipelineBinaryDataKHR").withByteAlignment(8);
		
		DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dataSize"));
		P_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pData"));
		
		DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
		P_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pData"));
		//@formatter:on
	}

	public VkPipelineBinaryDataKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineBinaryDataKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineBinaryDataKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #dataSize()
    public VkPipelineBinaryDataKHR dataSize(long dataSize) {
    	DATA_SIZE_HANDLE.set(segment, 0L, dataSize);
    	return this;
    }
    
    public long dataSize() {
    	return (long) DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pData()
    public VkPipelineBinaryDataKHR pData(MemorySegment pData) {
    	P_DATA_HANDLE.set(segment, 0L, pData);
    	return this;
    }
    
    public @Nullable MemorySegment pData() {
    	MemorySegment segment = (MemorySegment) P_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkPipelineBinaryDataKHR set(VkPipelineBinaryDataKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineBinaryDataKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineBinaryDataKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineBinaryDataKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineBinaryDataKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineBinaryDataKHR> array(Arena arena, VkPipelineBinaryDataKHR... structs) {
        NativeStructArray<VkPipelineBinaryDataKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineBinaryDataKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineBinaryDataKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineBinaryDataKHR(segment)
        );
    }

}