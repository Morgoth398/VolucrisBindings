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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkIndirectCommandsLayoutCreateInfoNV
		implements Struct<VkIndirectCommandsLayoutCreateInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle PIPELINE_BIND_POINT_HANDLE;
	public static final VarHandle TOKEN_COUNT_HANDLE;
	public static final VarHandle P_TOKENS_HANDLE;
	public static final VarHandle STREAM_COUNT_HANDLE;
	public static final VarHandle P_STREAM_STRIDES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long PIPELINE_BIND_POINT_BYTE_OFFSET;
	public static final long TOKEN_COUNT_BYTE_OFFSET;
	public static final long P_TOKENS_BYTE_OFFSET;
	public static final long STREAM_COUNT_BYTE_OFFSET;
	public static final long P_STREAM_STRIDES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("pipelineBindPoint"),
		    JAVA_INT.withName("tokenCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pTokens"),
		    JAVA_INT.withName("streamCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pStreamStrides")
		).withName("VkIndirectCommandsLayoutCreateInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		PIPELINE_BIND_POINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineBindPoint"));
		TOKEN_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tokenCount"));
		P_TOKENS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTokens"));
		STREAM_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("streamCount"));
		P_STREAM_STRIDES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStreamStrides"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		PIPELINE_BIND_POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineBindPoint"));
		TOKEN_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tokenCount"));
		P_TOKENS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTokens"));
		STREAM_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("streamCount"));
		P_STREAM_STRIDES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStreamStrides"));
		//@formatter:on
	}

	public VkIndirectCommandsLayoutCreateInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkIndirectCommandsLayoutCreateInfoNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkIndirectCommandsLayoutCreateInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkIndirectCommandsLayoutCreateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkIndirectCommandsLayoutCreateInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkIndirectCommandsLayoutCreateInfoNV flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipelineBindPoint()
    public VkIndirectCommandsLayoutCreateInfoNV pipelineBindPoint(int pipelineBindPoint) {
    	PIPELINE_BIND_POINT_HANDLE.set(segment, 0L, pipelineBindPoint);
    	return this;
    }
    
    public int pipelineBindPoint() {
    	return (int) PIPELINE_BIND_POINT_HANDLE.get(segment, 0L);
    }
    
    /// @see #tokenCount()
    public VkIndirectCommandsLayoutCreateInfoNV tokenCount(int tokenCount) {
    	TOKEN_COUNT_HANDLE.set(segment, 0L, tokenCount);
    	return this;
    }
    
    public int tokenCount() {
    	return (int) TOKEN_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pTokens()
    public VkIndirectCommandsLayoutCreateInfoNV pTokens(NativeStructArray<VkIndirectCommandsLayoutTokenNV> pTokens) {
    	P_TOKENS_HANDLE.set(segment, 0L, pTokens.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkIndirectCommandsLayoutTokenNV> pTokens() {
    	MemorySegment segment = (MemorySegment) P_TOKENS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkIndirectCommandsLayoutTokenNV.array(segment);
    }
    
    /// @see #streamCount()
    public VkIndirectCommandsLayoutCreateInfoNV streamCount(int streamCount) {
    	STREAM_COUNT_HANDLE.set(segment, 0L, streamCount);
    	return this;
    }
    
    public int streamCount() {
    	return (int) STREAM_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pStreamStrides()
    public VkIndirectCommandsLayoutCreateInfoNV pStreamStrides(NativeIntArray pStreamStrides) {
    	P_STREAM_STRIDES_HANDLE.set(segment, 0L, pStreamStrides.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pStreamStrides() {
    	MemorySegment segment = (MemorySegment) P_STREAM_STRIDES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkIndirectCommandsLayoutCreateInfoNV set(VkIndirectCommandsLayoutCreateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkIndirectCommandsLayoutCreateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkIndirectCommandsLayoutCreateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkIndirectCommandsLayoutCreateInfoNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkIndirectCommandsLayoutCreateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkIndirectCommandsLayoutCreateInfoNV> array(SegmentAllocator allocator, VkIndirectCommandsLayoutCreateInfoNV... structs) {
        NativeStructArray<VkIndirectCommandsLayoutCreateInfoNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkIndirectCommandsLayoutCreateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkIndirectCommandsLayoutCreateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkIndirectCommandsLayoutCreateInfoNV(segment)
        );
    }

}