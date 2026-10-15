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

public final class VkPipelineBinaryDataInfoKHR
		implements Struct<VkPipelineBinaryDataInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PIPELINE_BINARY_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PIPELINE_BINARY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pipelineBinary")
		).withName("VkPipelineBinaryDataInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PIPELINE_BINARY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineBinary"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PIPELINE_BINARY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinary"));
		//@formatter:on
	}

	public VkPipelineBinaryDataInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineBinaryDataInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineBinaryDataInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineBinaryDataInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineBinaryDataInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pipelineBinary()
    public VkPipelineBinaryDataInfoKHR pipelineBinary(VkPipelineBinaryKHR pipelineBinary) {
    	PIPELINE_BINARY_HANDLE.set(segment, 0L, pipelineBinary.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineBinaryKHR pipelineBinary() {
    	MemorySegment segment = (MemorySegment) PIPELINE_BINARY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineBinaryKHR(segment);
    }
    
    @Override
    public VkPipelineBinaryDataInfoKHR set(VkPipelineBinaryDataInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineBinaryDataInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineBinaryDataInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineBinaryDataInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineBinaryDataInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineBinaryDataInfoKHR> array(Arena arena, VkPipelineBinaryDataInfoKHR... structs) {
        NativeStructArray<VkPipelineBinaryDataInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineBinaryDataInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineBinaryDataInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineBinaryDataInfoKHR(segment)
        );
    }

}