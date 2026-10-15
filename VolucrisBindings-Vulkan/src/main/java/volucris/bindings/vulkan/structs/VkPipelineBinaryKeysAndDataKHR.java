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

public final class VkPipelineBinaryKeysAndDataKHR
		implements Struct<VkPipelineBinaryKeysAndDataKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BINARY_COUNT_HANDLE;
	public static final VarHandle P_PIPELINE_BINARY_KEYS_HANDLE;
	public static final VarHandle P_PIPELINE_BINARY_DATA_HANDLE;

	public static final long BINARY_COUNT_BYTE_OFFSET;
	public static final long P_PIPELINE_BINARY_KEYS_BYTE_OFFSET;
	public static final long P_PIPELINE_BINARY_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("binaryCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pPipelineBinaryKeys"),
		    UNBOUNDED_ADDRESS.withName("pPipelineBinaryData")
		).withName("VkPipelineBinaryKeysAndDataKHR").withByteAlignment(8);
		
		BINARY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("binaryCount"));
		P_PIPELINE_BINARY_KEYS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPipelineBinaryKeys"));
		P_PIPELINE_BINARY_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPipelineBinaryData"));
		
		BINARY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("binaryCount"));
		P_PIPELINE_BINARY_KEYS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPipelineBinaryKeys"));
		P_PIPELINE_BINARY_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPipelineBinaryData"));
		//@formatter:on
	}

	public VkPipelineBinaryKeysAndDataKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineBinaryKeysAndDataKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineBinaryKeysAndDataKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #binaryCount()
    public VkPipelineBinaryKeysAndDataKHR binaryCount(int binaryCount) {
    	BINARY_COUNT_HANDLE.set(segment, 0L, binaryCount);
    	return this;
    }
    
    public int binaryCount() {
    	return (int) BINARY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPipelineBinaryKeys()
    public VkPipelineBinaryKeysAndDataKHR pPipelineBinaryKeys(NativeStructArray<VkPipelineBinaryKeyKHR> pPipelineBinaryKeys) {
    	P_PIPELINE_BINARY_KEYS_HANDLE.set(segment, 0L, pPipelineBinaryKeys.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkPipelineBinaryKeyKHR> pPipelineBinaryKeys() {
    	MemorySegment segment = (MemorySegment) P_PIPELINE_BINARY_KEYS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkPipelineBinaryKeyKHR.array(segment);
    }
    
    /// @see #pPipelineBinaryData()
    public VkPipelineBinaryKeysAndDataKHR pPipelineBinaryData(NativeStructArray<VkPipelineBinaryDataKHR> pPipelineBinaryData) {
    	P_PIPELINE_BINARY_DATA_HANDLE.set(segment, 0L, pPipelineBinaryData.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkPipelineBinaryDataKHR> pPipelineBinaryData() {
    	MemorySegment segment = (MemorySegment) P_PIPELINE_BINARY_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkPipelineBinaryDataKHR.array(segment);
    }
    
    @Override
    public VkPipelineBinaryKeysAndDataKHR set(VkPipelineBinaryKeysAndDataKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineBinaryKeysAndDataKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineBinaryKeysAndDataKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineBinaryKeysAndDataKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineBinaryKeysAndDataKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineBinaryKeysAndDataKHR> array(Arena arena, VkPipelineBinaryKeysAndDataKHR... structs) {
        NativeStructArray<VkPipelineBinaryKeysAndDataKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineBinaryKeysAndDataKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineBinaryKeysAndDataKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineBinaryKeysAndDataKHR(segment)
        );
    }

}