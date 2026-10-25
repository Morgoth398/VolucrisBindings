/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaResamplingBackendVtable
		implements Struct<MaResamplingBackendVtable> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ON_GET_HEAP_SIZE_HANDLE;
	public static final VarHandle ON_INIT_HANDLE;
	public static final VarHandle ON_UNINIT_HANDLE;
	public static final VarHandle ON_PROCESS_HANDLE;
	public static final VarHandle ON_SET_RATE_HANDLE;
	public static final VarHandle ON_GET_INPUT_LATENCY_HANDLE;
	public static final VarHandle ON_GET_OUTPUT_LATENCY_HANDLE;
	public static final VarHandle ON_GET_REQUIRED_INPUT_FRAME_COUNT_HANDLE;
	public static final VarHandle ON_GET_EXPECTED_OUTPUT_FRAME_COUNT_HANDLE;
	public static final VarHandle ON_RESET_HANDLE;

	public static final long ON_GET_HEAP_SIZE_BYTE_OFFSET;
	public static final long ON_INIT_BYTE_OFFSET;
	public static final long ON_UNINIT_BYTE_OFFSET;
	public static final long ON_PROCESS_BYTE_OFFSET;
	public static final long ON_SET_RATE_BYTE_OFFSET;
	public static final long ON_GET_INPUT_LATENCY_BYTE_OFFSET;
	public static final long ON_GET_OUTPUT_LATENCY_BYTE_OFFSET;
	public static final long ON_GET_REQUIRED_INPUT_FRAME_COUNT_BYTE_OFFSET;
	public static final long ON_GET_EXPECTED_OUTPUT_FRAME_COUNT_BYTE_OFFSET;
	public static final long ON_RESET_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("onGetHeapSize"),
		    UNBOUNDED_ADDRESS.withName("onInit"),
		    UNBOUNDED_ADDRESS.withName("onUninit"),
		    UNBOUNDED_ADDRESS.withName("onProcess"),
		    UNBOUNDED_ADDRESS.withName("onSetRate"),
		    UNBOUNDED_ADDRESS.withName("onGetInputLatency"),
		    UNBOUNDED_ADDRESS.withName("onGetOutputLatency"),
		    UNBOUNDED_ADDRESS.withName("onGetRequiredInputFrameCount"),
		    UNBOUNDED_ADDRESS.withName("onGetExpectedOutputFrameCount"),
		    UNBOUNDED_ADDRESS.withName("onReset")
		).withName("ma_resampling_backend_vtable").withByteAlignment(8);
		
		ON_GET_HEAP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onGetHeapSize"));
		ON_INIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onInit"));
		ON_UNINIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onUninit"));
		ON_PROCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onProcess"));
		ON_SET_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onSetRate"));
		ON_GET_INPUT_LATENCY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onGetInputLatency"));
		ON_GET_OUTPUT_LATENCY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onGetOutputLatency"));
		ON_GET_REQUIRED_INPUT_FRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onGetRequiredInputFrameCount"));
		ON_GET_EXPECTED_OUTPUT_FRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onGetExpectedOutputFrameCount"));
		ON_RESET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onReset"));
		
		ON_GET_HEAP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onGetHeapSize"));
		ON_INIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onInit"));
		ON_UNINIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onUninit"));
		ON_PROCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onProcess"));
		ON_SET_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onSetRate"));
		ON_GET_INPUT_LATENCY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onGetInputLatency"));
		ON_GET_OUTPUT_LATENCY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onGetOutputLatency"));
		ON_GET_REQUIRED_INPUT_FRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onGetRequiredInputFrameCount"));
		ON_GET_EXPECTED_OUTPUT_FRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onGetExpectedOutputFrameCount"));
		ON_RESET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onReset"));
		//@formatter:on
	}

	public MaResamplingBackendVtable() {
	    this(Arena.ofAuto());
	}
	
	public MaResamplingBackendVtable(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaResamplingBackendVtable(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #onGetHeapSize()
    public MaResamplingBackendVtable onGetHeapSize(MaResamplingBackendOnGetHeapSize onGetHeapSize) {
    	ON_GET_HEAP_SIZE_HANDLE.set(segment, 0L, onGetHeapSize.memorySegment());
    	return this;
    }
    
    public @Nullable MaResamplingBackendOnGetHeapSize onGetHeapSize() {
    	MemorySegment segment = (MemorySegment) ON_GET_HEAP_SIZE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaResamplingBackendOnGetHeapSize.get(segment);
    }
    
    /// @see #onInit()
    public MaResamplingBackendVtable onInit(MaResamplingBackendOnInit onInit) {
    	ON_INIT_HANDLE.set(segment, 0L, onInit.memorySegment());
    	return this;
    }
    
    public @Nullable MaResamplingBackendOnInit onInit() {
    	MemorySegment segment = (MemorySegment) ON_INIT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaResamplingBackendOnInit.get(segment);
    }
    
    /// @see #onUninit()
    public MaResamplingBackendVtable onUninit(MaResamplingBackendOnUninit onUninit) {
    	ON_UNINIT_HANDLE.set(segment, 0L, onUninit.memorySegment());
    	return this;
    }
    
    public @Nullable MaResamplingBackendOnUninit onUninit() {
    	MemorySegment segment = (MemorySegment) ON_UNINIT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaResamplingBackendOnUninit.get(segment);
    }
    
    /// @see #onProcess()
    public MaResamplingBackendVtable onProcess(MaResamplingBackendOnProcess onProcess) {
    	ON_PROCESS_HANDLE.set(segment, 0L, onProcess.memorySegment());
    	return this;
    }
    
    public @Nullable MaResamplingBackendOnProcess onProcess() {
    	MemorySegment segment = (MemorySegment) ON_PROCESS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaResamplingBackendOnProcess.get(segment);
    }
    
    /// @see #onSetRate()
    public MaResamplingBackendVtable onSetRate(MaResamplingBackendOnSetRate onSetRate) {
    	ON_SET_RATE_HANDLE.set(segment, 0L, onSetRate.memorySegment());
    	return this;
    }
    
    public @Nullable MaResamplingBackendOnSetRate onSetRate() {
    	MemorySegment segment = (MemorySegment) ON_SET_RATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaResamplingBackendOnSetRate.get(segment);
    }
    
    /// @see #onGetInputLatency()
    public MaResamplingBackendVtable onGetInputLatency(MaResamplingBackendOnGetInputLatency onGetInputLatency) {
    	ON_GET_INPUT_LATENCY_HANDLE.set(segment, 0L, onGetInputLatency.memorySegment());
    	return this;
    }
    
    public @Nullable MaResamplingBackendOnGetInputLatency onGetInputLatency() {
    	MemorySegment segment = (MemorySegment) ON_GET_INPUT_LATENCY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaResamplingBackendOnGetInputLatency.get(segment);
    }
    
    /// @see #onGetOutputLatency()
    public MaResamplingBackendVtable onGetOutputLatency(MaResamplingBackendOnGetOutputLatency onGetOutputLatency) {
    	ON_GET_OUTPUT_LATENCY_HANDLE.set(segment, 0L, onGetOutputLatency.memorySegment());
    	return this;
    }
    
    public @Nullable MaResamplingBackendOnGetOutputLatency onGetOutputLatency() {
    	MemorySegment segment = (MemorySegment) ON_GET_OUTPUT_LATENCY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaResamplingBackendOnGetOutputLatency.get(segment);
    }
    
    /// @see #onGetRequiredInputFrameCount()
    public MaResamplingBackendVtable onGetRequiredInputFrameCount(MaResamplingBackendOnGetRequiredInputFrameCount onGetRequiredInputFrameCount) {
    	ON_GET_REQUIRED_INPUT_FRAME_COUNT_HANDLE.set(segment, 0L, onGetRequiredInputFrameCount.memorySegment());
    	return this;
    }
    
    public @Nullable MaResamplingBackendOnGetRequiredInputFrameCount onGetRequiredInputFrameCount() {
    	MemorySegment segment = (MemorySegment) ON_GET_REQUIRED_INPUT_FRAME_COUNT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaResamplingBackendOnGetRequiredInputFrameCount.get(segment);
    }
    
    /// @see #onGetExpectedOutputFrameCount()
    public MaResamplingBackendVtable onGetExpectedOutputFrameCount(MaResamplingBackendOnGetExpectedOutputFrameCount onGetExpectedOutputFrameCount) {
    	ON_GET_EXPECTED_OUTPUT_FRAME_COUNT_HANDLE.set(segment, 0L, onGetExpectedOutputFrameCount.memorySegment());
    	return this;
    }
    
    public @Nullable MaResamplingBackendOnGetExpectedOutputFrameCount onGetExpectedOutputFrameCount() {
    	MemorySegment segment = (MemorySegment) ON_GET_EXPECTED_OUTPUT_FRAME_COUNT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaResamplingBackendOnGetExpectedOutputFrameCount.get(segment);
    }
    
    /// @see #onReset()
    public MaResamplingBackendVtable onReset(MaResamplingBackendOnReset onReset) {
    	ON_RESET_HANDLE.set(segment, 0L, onReset.memorySegment());
    	return this;
    }
    
    public @Nullable MaResamplingBackendOnReset onReset() {
    	MemorySegment segment = (MemorySegment) ON_RESET_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaResamplingBackendOnReset.get(segment);
    }
    
    @Override
    public MaResamplingBackendVtable set(MaResamplingBackendVtable other) {
        return set(other.segment);
    }
    
    @Override
    public MaResamplingBackendVtable set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaResamplingBackendVtable> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaResamplingBackendVtable> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaResamplingBackendVtable(segment),
            count
        );
    }
    
    public static NativeStructArray<MaResamplingBackendVtable> array(SegmentAllocator allocator, MaResamplingBackendVtable... structs) {
        NativeStructArray<MaResamplingBackendVtable> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaResamplingBackendVtable(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaResamplingBackendVtable> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaResamplingBackendVtable(segment)
        );
    }

}