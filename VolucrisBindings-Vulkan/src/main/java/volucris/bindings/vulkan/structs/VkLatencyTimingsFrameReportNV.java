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

public final class VkLatencyTimingsFrameReportNV
		implements Struct<VkLatencyTimingsFrameReportNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PRESENT_ID_HANDLE;
    public static final VarHandle INPUT_SAMPLE_TIME_US_HANDLE;
    public static final VarHandle SIM_START_TIME_US_HANDLE;
    public static final VarHandle SIM_END_TIME_US_HANDLE;
    public static final VarHandle RENDER_SUBMIT_START_TIME_US_HANDLE;
    public static final VarHandle RENDER_SUBMIT_END_TIME_US_HANDLE;
    public static final VarHandle PRESENT_START_TIME_US_HANDLE;
    public static final VarHandle PRESENT_END_TIME_US_HANDLE;
    public static final VarHandle DRIVER_START_TIME_US_HANDLE;
    public static final VarHandle DRIVER_END_TIME_US_HANDLE;
    public static final VarHandle OS_RENDER_QUEUE_START_TIME_US_HANDLE;
    public static final VarHandle OS_RENDER_QUEUE_END_TIME_US_HANDLE;
    public static final VarHandle GPU_RENDER_START_TIME_US_HANDLE;
    public static final VarHandle GPU_RENDER_END_TIME_US_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PRESENT_ID_BYTE_OFFSET;
    public static final long INPUT_SAMPLE_TIME_US_BYTE_OFFSET;
    public static final long SIM_START_TIME_US_BYTE_OFFSET;
    public static final long SIM_END_TIME_US_BYTE_OFFSET;
    public static final long RENDER_SUBMIT_START_TIME_US_BYTE_OFFSET;
    public static final long RENDER_SUBMIT_END_TIME_US_BYTE_OFFSET;
    public static final long PRESENT_START_TIME_US_BYTE_OFFSET;
    public static final long PRESENT_END_TIME_US_BYTE_OFFSET;
    public static final long DRIVER_START_TIME_US_BYTE_OFFSET;
    public static final long DRIVER_END_TIME_US_BYTE_OFFSET;
    public static final long OS_RENDER_QUEUE_START_TIME_US_BYTE_OFFSET;
    public static final long OS_RENDER_QUEUE_END_TIME_US_BYTE_OFFSET;
    public static final long GPU_RENDER_START_TIME_US_BYTE_OFFSET;
    public static final long GPU_RENDER_END_TIME_US_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("presentID"),
            JAVA_LONG.withName("inputSampleTimeUs"),
            JAVA_LONG.withName("simStartTimeUs"),
            JAVA_LONG.withName("simEndTimeUs"),
            JAVA_LONG.withName("renderSubmitStartTimeUs"),
            JAVA_LONG.withName("renderSubmitEndTimeUs"),
            JAVA_LONG.withName("presentStartTimeUs"),
            JAVA_LONG.withName("presentEndTimeUs"),
            JAVA_LONG.withName("driverStartTimeUs"),
            JAVA_LONG.withName("driverEndTimeUs"),
            JAVA_LONG.withName("osRenderQueueStartTimeUs"),
            JAVA_LONG.withName("osRenderQueueEndTimeUs"),
            JAVA_LONG.withName("gpuRenderStartTimeUs"),
            JAVA_LONG.withName("gpuRenderEndTimeUs")
        ).withName("VkLatencyTimingsFrameReportNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PRESENT_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentID"));
        INPUT_SAMPLE_TIME_US_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputSampleTimeUs"));
        SIM_START_TIME_US_HANDLE = LAYOUT.varHandle(PathElement.groupElement("simStartTimeUs"));
        SIM_END_TIME_US_HANDLE = LAYOUT.varHandle(PathElement.groupElement("simEndTimeUs"));
        RENDER_SUBMIT_START_TIME_US_HANDLE = LAYOUT.varHandle(PathElement.groupElement("renderSubmitStartTimeUs"));
        RENDER_SUBMIT_END_TIME_US_HANDLE = LAYOUT.varHandle(PathElement.groupElement("renderSubmitEndTimeUs"));
        PRESENT_START_TIME_US_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentStartTimeUs"));
        PRESENT_END_TIME_US_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentEndTimeUs"));
        DRIVER_START_TIME_US_HANDLE = LAYOUT.varHandle(PathElement.groupElement("driverStartTimeUs"));
        DRIVER_END_TIME_US_HANDLE = LAYOUT.varHandle(PathElement.groupElement("driverEndTimeUs"));
        OS_RENDER_QUEUE_START_TIME_US_HANDLE = LAYOUT.varHandle(PathElement.groupElement("osRenderQueueStartTimeUs"));
        OS_RENDER_QUEUE_END_TIME_US_HANDLE = LAYOUT.varHandle(PathElement.groupElement("osRenderQueueEndTimeUs"));
        GPU_RENDER_START_TIME_US_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gpuRenderStartTimeUs"));
        GPU_RENDER_END_TIME_US_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gpuRenderEndTimeUs"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PRESENT_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentID"));
        INPUT_SAMPLE_TIME_US_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputSampleTimeUs"));
        SIM_START_TIME_US_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("simStartTimeUs"));
        SIM_END_TIME_US_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("simEndTimeUs"));
        RENDER_SUBMIT_START_TIME_US_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("renderSubmitStartTimeUs"));
        RENDER_SUBMIT_END_TIME_US_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("renderSubmitEndTimeUs"));
        PRESENT_START_TIME_US_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentStartTimeUs"));
        PRESENT_END_TIME_US_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentEndTimeUs"));
        DRIVER_START_TIME_US_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("driverStartTimeUs"));
        DRIVER_END_TIME_US_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("driverEndTimeUs"));
        OS_RENDER_QUEUE_START_TIME_US_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("osRenderQueueStartTimeUs"));
        OS_RENDER_QUEUE_END_TIME_US_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("osRenderQueueEndTimeUs"));
        GPU_RENDER_START_TIME_US_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gpuRenderStartTimeUs"));
        GPU_RENDER_END_TIME_US_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gpuRenderEndTimeUs"));
        //@formatter:on
    }

    public VkLatencyTimingsFrameReportNV() {
        this(Arena.ofAuto());
    }
    
    public VkLatencyTimingsFrameReportNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkLatencyTimingsFrameReportNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkLatencyTimingsFrameReportNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkLatencyTimingsFrameReportNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #presentID()
    public VkLatencyTimingsFrameReportNV presentID(long presentID) {
    	PRESENT_ID_HANDLE.set(segment, 0L, presentID);
    	return this;
    }
    
    public long presentID() {
    	return (long) PRESENT_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #inputSampleTimeUs()
    public VkLatencyTimingsFrameReportNV inputSampleTimeUs(long inputSampleTimeUs) {
    	INPUT_SAMPLE_TIME_US_HANDLE.set(segment, 0L, inputSampleTimeUs);
    	return this;
    }
    
    public long inputSampleTimeUs() {
    	return (long) INPUT_SAMPLE_TIME_US_HANDLE.get(segment, 0L);
    }
    
    /// @see #simStartTimeUs()
    public VkLatencyTimingsFrameReportNV simStartTimeUs(long simStartTimeUs) {
    	SIM_START_TIME_US_HANDLE.set(segment, 0L, simStartTimeUs);
    	return this;
    }
    
    public long simStartTimeUs() {
    	return (long) SIM_START_TIME_US_HANDLE.get(segment, 0L);
    }
    
    /// @see #simEndTimeUs()
    public VkLatencyTimingsFrameReportNV simEndTimeUs(long simEndTimeUs) {
    	SIM_END_TIME_US_HANDLE.set(segment, 0L, simEndTimeUs);
    	return this;
    }
    
    public long simEndTimeUs() {
    	return (long) SIM_END_TIME_US_HANDLE.get(segment, 0L);
    }
    
    /// @see #renderSubmitStartTimeUs()
    public VkLatencyTimingsFrameReportNV renderSubmitStartTimeUs(long renderSubmitStartTimeUs) {
    	RENDER_SUBMIT_START_TIME_US_HANDLE.set(segment, 0L, renderSubmitStartTimeUs);
    	return this;
    }
    
    public long renderSubmitStartTimeUs() {
    	return (long) RENDER_SUBMIT_START_TIME_US_HANDLE.get(segment, 0L);
    }
    
    /// @see #renderSubmitEndTimeUs()
    public VkLatencyTimingsFrameReportNV renderSubmitEndTimeUs(long renderSubmitEndTimeUs) {
    	RENDER_SUBMIT_END_TIME_US_HANDLE.set(segment, 0L, renderSubmitEndTimeUs);
    	return this;
    }
    
    public long renderSubmitEndTimeUs() {
    	return (long) RENDER_SUBMIT_END_TIME_US_HANDLE.get(segment, 0L);
    }
    
    /// @see #presentStartTimeUs()
    public VkLatencyTimingsFrameReportNV presentStartTimeUs(long presentStartTimeUs) {
    	PRESENT_START_TIME_US_HANDLE.set(segment, 0L, presentStartTimeUs);
    	return this;
    }
    
    public long presentStartTimeUs() {
    	return (long) PRESENT_START_TIME_US_HANDLE.get(segment, 0L);
    }
    
    /// @see #presentEndTimeUs()
    public VkLatencyTimingsFrameReportNV presentEndTimeUs(long presentEndTimeUs) {
    	PRESENT_END_TIME_US_HANDLE.set(segment, 0L, presentEndTimeUs);
    	return this;
    }
    
    public long presentEndTimeUs() {
    	return (long) PRESENT_END_TIME_US_HANDLE.get(segment, 0L);
    }
    
    /// @see #driverStartTimeUs()
    public VkLatencyTimingsFrameReportNV driverStartTimeUs(long driverStartTimeUs) {
    	DRIVER_START_TIME_US_HANDLE.set(segment, 0L, driverStartTimeUs);
    	return this;
    }
    
    public long driverStartTimeUs() {
    	return (long) DRIVER_START_TIME_US_HANDLE.get(segment, 0L);
    }
    
    /// @see #driverEndTimeUs()
    public VkLatencyTimingsFrameReportNV driverEndTimeUs(long driverEndTimeUs) {
    	DRIVER_END_TIME_US_HANDLE.set(segment, 0L, driverEndTimeUs);
    	return this;
    }
    
    public long driverEndTimeUs() {
    	return (long) DRIVER_END_TIME_US_HANDLE.get(segment, 0L);
    }
    
    /// @see #osRenderQueueStartTimeUs()
    public VkLatencyTimingsFrameReportNV osRenderQueueStartTimeUs(long osRenderQueueStartTimeUs) {
    	OS_RENDER_QUEUE_START_TIME_US_HANDLE.set(segment, 0L, osRenderQueueStartTimeUs);
    	return this;
    }
    
    public long osRenderQueueStartTimeUs() {
    	return (long) OS_RENDER_QUEUE_START_TIME_US_HANDLE.get(segment, 0L);
    }
    
    /// @see #osRenderQueueEndTimeUs()
    public VkLatencyTimingsFrameReportNV osRenderQueueEndTimeUs(long osRenderQueueEndTimeUs) {
    	OS_RENDER_QUEUE_END_TIME_US_HANDLE.set(segment, 0L, osRenderQueueEndTimeUs);
    	return this;
    }
    
    public long osRenderQueueEndTimeUs() {
    	return (long) OS_RENDER_QUEUE_END_TIME_US_HANDLE.get(segment, 0L);
    }
    
    /// @see #gpuRenderStartTimeUs()
    public VkLatencyTimingsFrameReportNV gpuRenderStartTimeUs(long gpuRenderStartTimeUs) {
    	GPU_RENDER_START_TIME_US_HANDLE.set(segment, 0L, gpuRenderStartTimeUs);
    	return this;
    }
    
    public long gpuRenderStartTimeUs() {
    	return (long) GPU_RENDER_START_TIME_US_HANDLE.get(segment, 0L);
    }
    
    /// @see #gpuRenderEndTimeUs()
    public VkLatencyTimingsFrameReportNV gpuRenderEndTimeUs(long gpuRenderEndTimeUs) {
    	GPU_RENDER_END_TIME_US_HANDLE.set(segment, 0L, gpuRenderEndTimeUs);
    	return this;
    }
    
    public long gpuRenderEndTimeUs() {
    	return (long) GPU_RENDER_END_TIME_US_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkLatencyTimingsFrameReportNV set(VkLatencyTimingsFrameReportNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkLatencyTimingsFrameReportNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkLatencyTimingsFrameReportNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkLatencyTimingsFrameReportNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkLatencyTimingsFrameReportNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkLatencyTimingsFrameReportNV> array(Arena arena, VkLatencyTimingsFrameReportNV... structs) {
        NativeStructArray<VkLatencyTimingsFrameReportNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkLatencyTimingsFrameReportNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkLatencyTimingsFrameReportNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkLatencyTimingsFrameReportNV(segment)
        );
    }
    
}