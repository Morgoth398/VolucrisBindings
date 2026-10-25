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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPipelineBinaryHandlesInfoKHR
		implements Struct<VkPipelineBinaryHandlesInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PIPELINE_BINARY_COUNT_HANDLE;
	public static final VarHandle P_PIPELINE_BINARIES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PIPELINE_BINARY_COUNT_BYTE_OFFSET;
	public static final long P_PIPELINE_BINARIES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("pipelineBinaryCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pPipelineBinaries")
		).withName("VkPipelineBinaryHandlesInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PIPELINE_BINARY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineBinaryCount"));
		P_PIPELINE_BINARIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPipelineBinaries"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PIPELINE_BINARY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryCount"));
		P_PIPELINE_BINARIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPipelineBinaries"));
		//@formatter:on
	}

	public VkPipelineBinaryHandlesInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineBinaryHandlesInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPipelineBinaryHandlesInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineBinaryHandlesInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineBinaryHandlesInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pipelineBinaryCount()
    public VkPipelineBinaryHandlesInfoKHR pipelineBinaryCount(int pipelineBinaryCount) {
    	PIPELINE_BINARY_COUNT_HANDLE.set(segment, 0L, pipelineBinaryCount);
    	return this;
    }
    
    public int pipelineBinaryCount() {
    	return (int) PIPELINE_BINARY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPipelineBinaries()
    public VkPipelineBinaryHandlesInfoKHR pPipelineBinaries(NativePointerArray pPipelineBinaries) {
    	P_PIPELINE_BINARIES_HANDLE.set(segment, 0L, pPipelineBinaries.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pPipelineBinaries() {
    	MemorySegment segment = (MemorySegment) P_PIPELINE_BINARIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public VkPipelineBinaryHandlesInfoKHR set(VkPipelineBinaryHandlesInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineBinaryHandlesInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineBinaryHandlesInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineBinaryHandlesInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineBinaryHandlesInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineBinaryHandlesInfoKHR> array(SegmentAllocator allocator, VkPipelineBinaryHandlesInfoKHR... structs) {
        NativeStructArray<VkPipelineBinaryHandlesInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineBinaryHandlesInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineBinaryHandlesInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineBinaryHandlesInfoKHR(segment)
        );
    }

}