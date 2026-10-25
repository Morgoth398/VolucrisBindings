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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkGpaSampleBeginInfoAMD
		implements Struct<VkGpaSampleBeginInfoAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SAMPLE_TYPE_HANDLE;
	public static final VarHandle SAMPLE_INTERNAL_OPERATIONS_HANDLE;
	public static final VarHandle CACHE_FLUSH_ON_COUNTER_COLLECTION_HANDLE;
	public static final VarHandle SQ_SHADER_MASK_ENABLE_HANDLE;
	public static final VarHandle SQ_SHADER_MASK_HANDLE;
	public static final VarHandle PERF_COUNTER_COUNT_HANDLE;
	public static final VarHandle P_PERF_COUNTERS_HANDLE;
	public static final VarHandle STREAMING_PERF_TRACE_SAMPLE_INTERVAL_HANDLE;
	public static final VarHandle PERF_COUNTER_DEVICE_MEMORY_LIMIT_HANDLE;
	public static final VarHandle SQ_THREAD_TRACE_ENABLE_HANDLE;
	public static final VarHandle SQ_THREAD_TRACE_SUPPRESS_INSTRUCTION_TOKENS_HANDLE;
	public static final VarHandle SQ_THREAD_TRACE_DEVICE_MEMORY_LIMIT_HANDLE;
	public static final VarHandle TIMING_PRE_SAMPLE_HANDLE;
	public static final VarHandle TIMING_POST_SAMPLE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SAMPLE_TYPE_BYTE_OFFSET;
	public static final long SAMPLE_INTERNAL_OPERATIONS_BYTE_OFFSET;
	public static final long CACHE_FLUSH_ON_COUNTER_COLLECTION_BYTE_OFFSET;
	public static final long SQ_SHADER_MASK_ENABLE_BYTE_OFFSET;
	public static final long SQ_SHADER_MASK_BYTE_OFFSET;
	public static final long PERF_COUNTER_COUNT_BYTE_OFFSET;
	public static final long P_PERF_COUNTERS_BYTE_OFFSET;
	public static final long STREAMING_PERF_TRACE_SAMPLE_INTERVAL_BYTE_OFFSET;
	public static final long PERF_COUNTER_DEVICE_MEMORY_LIMIT_BYTE_OFFSET;
	public static final long SQ_THREAD_TRACE_ENABLE_BYTE_OFFSET;
	public static final long SQ_THREAD_TRACE_SUPPRESS_INSTRUCTION_TOKENS_BYTE_OFFSET;
	public static final long SQ_THREAD_TRACE_DEVICE_MEMORY_LIMIT_BYTE_OFFSET;
	public static final long TIMING_PRE_SAMPLE_BYTE_OFFSET;
	public static final long TIMING_POST_SAMPLE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("sampleType"),
		    JAVA_INT.withName("sampleInternalOperations"),
		    JAVA_INT.withName("cacheFlushOnCounterCollection"),
		    JAVA_INT.withName("sqShaderMaskEnable"),
		    JAVA_INT.withName("sqShaderMask"),
		    JAVA_INT.withName("perfCounterCount"),
		    UNBOUNDED_ADDRESS.withName("pPerfCounters"),
		    JAVA_INT.withName("streamingPerfTraceSampleInterval"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("perfCounterDeviceMemoryLimit"),
		    JAVA_INT.withName("sqThreadTraceEnable"),
		    JAVA_INT.withName("sqThreadTraceSuppressInstructionTokens"),
		    JAVA_LONG.withName("sqThreadTraceDeviceMemoryLimit"),
		    JAVA_INT.withName("timingPreSample"),
		    JAVA_INT.withName("timingPostSample")
		).withName("VkGpaSampleBeginInfoAMD").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SAMPLE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleType"));
		SAMPLE_INTERNAL_OPERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleInternalOperations"));
		CACHE_FLUSH_ON_COUNTER_COLLECTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cacheFlushOnCounterCollection"));
		SQ_SHADER_MASK_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sqShaderMaskEnable"));
		SQ_SHADER_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sqShaderMask"));
		PERF_COUNTER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("perfCounterCount"));
		P_PERF_COUNTERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPerfCounters"));
		STREAMING_PERF_TRACE_SAMPLE_INTERVAL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("streamingPerfTraceSampleInterval"));
		PERF_COUNTER_DEVICE_MEMORY_LIMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("perfCounterDeviceMemoryLimit"));
		SQ_THREAD_TRACE_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sqThreadTraceEnable"));
		SQ_THREAD_TRACE_SUPPRESS_INSTRUCTION_TOKENS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sqThreadTraceSuppressInstructionTokens"));
		SQ_THREAD_TRACE_DEVICE_MEMORY_LIMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sqThreadTraceDeviceMemoryLimit"));
		TIMING_PRE_SAMPLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("timingPreSample"));
		TIMING_POST_SAMPLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("timingPostSample"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SAMPLE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleType"));
		SAMPLE_INTERNAL_OPERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleInternalOperations"));
		CACHE_FLUSH_ON_COUNTER_COLLECTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cacheFlushOnCounterCollection"));
		SQ_SHADER_MASK_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sqShaderMaskEnable"));
		SQ_SHADER_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sqShaderMask"));
		PERF_COUNTER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("perfCounterCount"));
		P_PERF_COUNTERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPerfCounters"));
		STREAMING_PERF_TRACE_SAMPLE_INTERVAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("streamingPerfTraceSampleInterval"));
		PERF_COUNTER_DEVICE_MEMORY_LIMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("perfCounterDeviceMemoryLimit"));
		SQ_THREAD_TRACE_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sqThreadTraceEnable"));
		SQ_THREAD_TRACE_SUPPRESS_INSTRUCTION_TOKENS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sqThreadTraceSuppressInstructionTokens"));
		SQ_THREAD_TRACE_DEVICE_MEMORY_LIMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sqThreadTraceDeviceMemoryLimit"));
		TIMING_PRE_SAMPLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timingPreSample"));
		TIMING_POST_SAMPLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timingPostSample"));
		//@formatter:on
	}

	public VkGpaSampleBeginInfoAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkGpaSampleBeginInfoAMD(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkGpaSampleBeginInfoAMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkGpaSampleBeginInfoAMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkGpaSampleBeginInfoAMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #sampleType()
    public VkGpaSampleBeginInfoAMD sampleType(int sampleType) {
    	SAMPLE_TYPE_HANDLE.set(segment, 0L, sampleType);
    	return this;
    }
    
    public int sampleType() {
    	return (int) SAMPLE_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleInternalOperations()
    public VkGpaSampleBeginInfoAMD sampleInternalOperations(int sampleInternalOperations) {
    	SAMPLE_INTERNAL_OPERATIONS_HANDLE.set(segment, 0L, sampleInternalOperations);
    	return this;
    }
    
    public int sampleInternalOperations() {
    	return (int) SAMPLE_INTERNAL_OPERATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #cacheFlushOnCounterCollection()
    public VkGpaSampleBeginInfoAMD cacheFlushOnCounterCollection(int cacheFlushOnCounterCollection) {
    	CACHE_FLUSH_ON_COUNTER_COLLECTION_HANDLE.set(segment, 0L, cacheFlushOnCounterCollection);
    	return this;
    }
    
    public int cacheFlushOnCounterCollection() {
    	return (int) CACHE_FLUSH_ON_COUNTER_COLLECTION_HANDLE.get(segment, 0L);
    }
    
    /// @see #sqShaderMaskEnable()
    public VkGpaSampleBeginInfoAMD sqShaderMaskEnable(int sqShaderMaskEnable) {
    	SQ_SHADER_MASK_ENABLE_HANDLE.set(segment, 0L, sqShaderMaskEnable);
    	return this;
    }
    
    public int sqShaderMaskEnable() {
    	return (int) SQ_SHADER_MASK_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sqShaderMask()
    public VkGpaSampleBeginInfoAMD sqShaderMask(int sqShaderMask) {
    	SQ_SHADER_MASK_HANDLE.set(segment, 0L, sqShaderMask);
    	return this;
    }
    
    public int sqShaderMask() {
    	return (int) SQ_SHADER_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #perfCounterCount()
    public VkGpaSampleBeginInfoAMD perfCounterCount(int perfCounterCount) {
    	PERF_COUNTER_COUNT_HANDLE.set(segment, 0L, perfCounterCount);
    	return this;
    }
    
    public int perfCounterCount() {
    	return (int) PERF_COUNTER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPerfCounters()
    public VkGpaSampleBeginInfoAMD pPerfCounters(NativeStructArray<VkGpaPerfCounterAMD> pPerfCounters) {
    	P_PERF_COUNTERS_HANDLE.set(segment, 0L, pPerfCounters.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkGpaPerfCounterAMD> pPerfCounters() {
    	MemorySegment segment = (MemorySegment) P_PERF_COUNTERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkGpaPerfCounterAMD.array(segment);
    }
    
    /// @see #streamingPerfTraceSampleInterval()
    public VkGpaSampleBeginInfoAMD streamingPerfTraceSampleInterval(int streamingPerfTraceSampleInterval) {
    	STREAMING_PERF_TRACE_SAMPLE_INTERVAL_HANDLE.set(segment, 0L, streamingPerfTraceSampleInterval);
    	return this;
    }
    
    public int streamingPerfTraceSampleInterval() {
    	return (int) STREAMING_PERF_TRACE_SAMPLE_INTERVAL_HANDLE.get(segment, 0L);
    }
    
    /// @see #perfCounterDeviceMemoryLimit()
    public VkGpaSampleBeginInfoAMD perfCounterDeviceMemoryLimit(long perfCounterDeviceMemoryLimit) {
    	PERF_COUNTER_DEVICE_MEMORY_LIMIT_HANDLE.set(segment, 0L, perfCounterDeviceMemoryLimit);
    	return this;
    }
    
    public long perfCounterDeviceMemoryLimit() {
    	return (long) PERF_COUNTER_DEVICE_MEMORY_LIMIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #sqThreadTraceEnable()
    public VkGpaSampleBeginInfoAMD sqThreadTraceEnable(int sqThreadTraceEnable) {
    	SQ_THREAD_TRACE_ENABLE_HANDLE.set(segment, 0L, sqThreadTraceEnable);
    	return this;
    }
    
    public int sqThreadTraceEnable() {
    	return (int) SQ_THREAD_TRACE_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sqThreadTraceSuppressInstructionTokens()
    public VkGpaSampleBeginInfoAMD sqThreadTraceSuppressInstructionTokens(int sqThreadTraceSuppressInstructionTokens) {
    	SQ_THREAD_TRACE_SUPPRESS_INSTRUCTION_TOKENS_HANDLE.set(segment, 0L, sqThreadTraceSuppressInstructionTokens);
    	return this;
    }
    
    public int sqThreadTraceSuppressInstructionTokens() {
    	return (int) SQ_THREAD_TRACE_SUPPRESS_INSTRUCTION_TOKENS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sqThreadTraceDeviceMemoryLimit()
    public VkGpaSampleBeginInfoAMD sqThreadTraceDeviceMemoryLimit(long sqThreadTraceDeviceMemoryLimit) {
    	SQ_THREAD_TRACE_DEVICE_MEMORY_LIMIT_HANDLE.set(segment, 0L, sqThreadTraceDeviceMemoryLimit);
    	return this;
    }
    
    public long sqThreadTraceDeviceMemoryLimit() {
    	return (long) SQ_THREAD_TRACE_DEVICE_MEMORY_LIMIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #timingPreSample()
    public VkGpaSampleBeginInfoAMD timingPreSample(int timingPreSample) {
    	TIMING_PRE_SAMPLE_HANDLE.set(segment, 0L, timingPreSample);
    	return this;
    }
    
    public int timingPreSample() {
    	return (int) TIMING_PRE_SAMPLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #timingPostSample()
    public VkGpaSampleBeginInfoAMD timingPostSample(int timingPostSample) {
    	TIMING_POST_SAMPLE_HANDLE.set(segment, 0L, timingPostSample);
    	return this;
    }
    
    public int timingPostSample() {
    	return (int) TIMING_POST_SAMPLE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkGpaSampleBeginInfoAMD set(VkGpaSampleBeginInfoAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkGpaSampleBeginInfoAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGpaSampleBeginInfoAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGpaSampleBeginInfoAMD> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkGpaSampleBeginInfoAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGpaSampleBeginInfoAMD> array(SegmentAllocator allocator, VkGpaSampleBeginInfoAMD... structs) {
        NativeStructArray<VkGpaSampleBeginInfoAMD> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkGpaSampleBeginInfoAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGpaSampleBeginInfoAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGpaSampleBeginInfoAMD(segment)
        );
    }

}