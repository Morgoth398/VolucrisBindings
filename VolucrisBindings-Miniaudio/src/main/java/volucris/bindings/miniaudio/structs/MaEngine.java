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
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaEngine
		implements Struct<MaEngine> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_RESOURCE_MANAGER_HANDLE;
	public static final VarHandle P_DEVICE_HANDLE;
	public static final VarHandle P_LOG_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle LISTENER_COUNT_HANDLE;
	public static final VarHandle OWNS_RESOURCE_MANAGER_HANDLE;
	public static final VarHandle OWNS_DEVICE_HANDLE;
	public static final VarHandle INLINED_SOUND_LOCK_HANDLE;
	public static final VarHandle P_INLINED_SOUND_HEAD_HANDLE;
	public static final VarHandle INLINED_SOUND_COUNT_HANDLE;
	public static final VarHandle GAIN_SMOOTH_TIME_IN_FRAMES_HANDLE;
	public static final VarHandle DEFAULT_VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE;
	public static final VarHandle MONO_EXPANSION_MODE_HANDLE;
	public static final VarHandle ON_PROCESS_HANDLE;
	public static final VarHandle P_PROCESS_USER_DATA_HANDLE;

	public static final long NODE_GRAPH_BYTE_OFFSET;
	public static final long P_RESOURCE_MANAGER_BYTE_OFFSET;
	public static final long P_DEVICE_BYTE_OFFSET;
	public static final long P_LOG_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long LISTENER_COUNT_BYTE_OFFSET;
	public static final long LISTENERS_BYTE_OFFSET;
	public static final long ALLOCATION_CALLBACKS_BYTE_OFFSET;
	public static final long OWNS_RESOURCE_MANAGER_BYTE_OFFSET;
	public static final long OWNS_DEVICE_BYTE_OFFSET;
	public static final long INLINED_SOUND_LOCK_BYTE_OFFSET;
	public static final long P_INLINED_SOUND_HEAD_BYTE_OFFSET;
	public static final long INLINED_SOUND_COUNT_BYTE_OFFSET;
	public static final long GAIN_SMOOTH_TIME_IN_FRAMES_BYTE_OFFSET;
	public static final long DEFAULT_VOLUME_SMOOTH_TIME_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long MONO_EXPANSION_MODE_BYTE_OFFSET;
	public static final long ON_PROCESS_BYTE_OFFSET;
	public static final long P_PROCESS_USER_DATA_BYTE_OFFSET;
	public static final long PITCH_RESAMPLING_CONFIG_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeGraph nodeGraph;
	private final MaSpatializerListener[] listeners;
	private final MaAllocationCallbacks allocationCallbacks;
	private final MaResamplerConfig pitchResamplingConfig;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeGraph.LAYOUT.withName("nodeGraph"),
		    UNBOUNDED_ADDRESS.withName("pResourceManager"),
		    UNBOUNDED_ADDRESS.withName("pDevice"),
		    UNBOUNDED_ADDRESS.withName("pLog"),
		    JAVA_INT.withName("sampleRate"),
		    JAVA_INT.withName("listenerCount"),
		    MemoryLayout.sequenceLayout(4, MaSpatializerListener.LAYOUT).withName("listeners"),
		    MaAllocationCallbacks.LAYOUT.withName("allocationCallbacks"),
		    JAVA_BYTE.withName("ownsResourceManager"),
		    JAVA_BYTE.withName("ownsDevice"),
		    MemoryLayout.paddingLayout(2),
		    JAVA_INT.withName("inlinedSoundLock"),
		    UNBOUNDED_ADDRESS.withName("pInlinedSoundHead"),
		    JAVA_INT.withName("inlinedSoundCount"),
		    JAVA_INT.withName("gainSmoothTimeInFrames"),
		    JAVA_INT.withName("defaultVolumeSmoothTimeInPCMFrames"),
		    JAVA_INT.withName("monoExpansionMode"),
		    UNBOUNDED_ADDRESS.withName("onProcess"),
		    UNBOUNDED_ADDRESS.withName("pProcessUserData"),
		    MaResamplerConfig.LAYOUT.withName("pitchResamplingConfig")
		).withName("ma_engine").withByteAlignment(8);
		
		P_RESOURCE_MANAGER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pResourceManager"));
		P_DEVICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDevice"));
		P_LOG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLog"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		LISTENER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("listenerCount"));
		OWNS_RESOURCE_MANAGER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ownsResourceManager"));
		OWNS_DEVICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ownsDevice"));
		INLINED_SOUND_LOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inlinedSoundLock"));
		P_INLINED_SOUND_HEAD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInlinedSoundHead"));
		INLINED_SOUND_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inlinedSoundCount"));
		GAIN_SMOOTH_TIME_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gainSmoothTimeInFrames"));
		DEFAULT_VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("defaultVolumeSmoothTimeInPCMFrames"));
		MONO_EXPANSION_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("monoExpansionMode"));
		ON_PROCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onProcess"));
		P_PROCESS_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pProcessUserData"));
		
		NODE_GRAPH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeGraph"));
		P_RESOURCE_MANAGER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pResourceManager"));
		P_DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDevice"));
		P_LOG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLog"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		LISTENER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("listenerCount"));
		LISTENERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("listeners"));
		ALLOCATION_CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationCallbacks"));
		OWNS_RESOURCE_MANAGER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ownsResourceManager"));
		OWNS_DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ownsDevice"));
		INLINED_SOUND_LOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inlinedSoundLock"));
		P_INLINED_SOUND_HEAD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInlinedSoundHead"));
		INLINED_SOUND_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inlinedSoundCount"));
		GAIN_SMOOTH_TIME_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gainSmoothTimeInFrames"));
		DEFAULT_VOLUME_SMOOTH_TIME_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("defaultVolumeSmoothTimeInPCMFrames"));
		MONO_EXPANSION_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("monoExpansionMode"));
		ON_PROCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onProcess"));
		P_PROCESS_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pProcessUserData"));
		PITCH_RESAMPLING_CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pitchResamplingConfig"));
		//@formatter:on
	}

	public MaEngine() {
	    this(Arena.ofAuto());
	}
	
	public MaEngine(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaEngine(MemorySegment segment) {
	    this.segment = segment;
	
	    nodeGraph = new MaNodeGraph(segment.asSlice(NODE_GRAPH_BYTE_OFFSET, MaNodeGraph.LAYOUT));
	    listeners = new MaSpatializerListener[4];
	    for (int i = 0; i < 4; i++) {
	        long offset = LISTENERS_BYTE_OFFSET + i * MaSpatializerListener.LAYOUT.byteSize();
	        listeners[i] = new MaSpatializerListener(segment.asSlice(offset, MaSpatializerListener.LAYOUT));
	    }
	    allocationCallbacks = new MaAllocationCallbacks(segment.asSlice(ALLOCATION_CALLBACKS_BYTE_OFFSET, MaAllocationCallbacks.LAYOUT));
	    pitchResamplingConfig = new MaResamplerConfig(segment.asSlice(PITCH_RESAMPLING_CONFIG_BYTE_OFFSET, MaResamplerConfig.LAYOUT));
	}

    /// @see #nodeGraph()
    public MaEngine nodeGraph(Consumer<MaNodeGraph> consumer) {
    	consumer.accept(nodeGraph);
    	return this;
    }
    
    /// @see #nodeGraph()
    public MaEngine nodeGraph(MaNodeGraph other) {
    	nodeGraph.set(other);
    	return this;
    }
    
    public MaNodeGraph nodeGraph() {
    	return nodeGraph;
    }
    
    /// @see #pResourceManager()
    public MaEngine pResourceManager(MaResourceManager pResourceManager) {
    	P_RESOURCE_MANAGER_HANDLE.set(segment, 0L, pResourceManager.memorySegment());
    	return this;
    }
    
    public @Nullable MaResourceManager pResourceManager() {
    	MemorySegment segment = (MemorySegment) P_RESOURCE_MANAGER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResourceManager(segment);
    }
    
    /// @see #pDevice()
    public MaEngine pDevice(MaDevice pDevice) {
    	P_DEVICE_HANDLE.set(segment, 0L, pDevice.memorySegment());
    	return this;
    }
    
    public @Nullable MaDevice pDevice() {
    	MemorySegment segment = (MemorySegment) P_DEVICE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDevice(segment);
    }
    
    /// @see #pLog()
    public MaEngine pLog(MaLog pLog) {
    	P_LOG_HANDLE.set(segment, 0L, pLog.memorySegment());
    	return this;
    }
    
    public @Nullable MaLog pLog() {
    	MemorySegment segment = (MemorySegment) P_LOG_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLog(segment);
    }
    
    /// @see #sampleRate()
    public MaEngine sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #listenerCount()
    public MaEngine listenerCount(int listenerCount) {
    	LISTENER_COUNT_HANDLE.set(segment, 0L, listenerCount);
    	return this;
    }
    
    public int listenerCount() {
    	return (int) LISTENER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #listeners(int)
    public MaEngine listeners(Consumer<MaSpatializerListener> consumer, int index) {
    	consumer.accept(listeners[index]);
    	return this;
    }
    
    /// @see #listeners(int)
    public MaEngine listeners(MaSpatializerListener other, int index) {
    	listeners[index].set(other);
    	return this;
    }
    
    public MaSpatializerListener listeners(int index) {
    	return listeners[index];
    }
    
    /// @see #allocationCallbacks()
    public MaEngine allocationCallbacks(Consumer<MaAllocationCallbacks> consumer) {
    	consumer.accept(allocationCallbacks);
    	return this;
    }
    
    /// @see #allocationCallbacks()
    public MaEngine allocationCallbacks(MaAllocationCallbacks other) {
    	allocationCallbacks.set(other);
    	return this;
    }
    
    public MaAllocationCallbacks allocationCallbacks() {
    	return allocationCallbacks;
    }
    
    /// @see #ownsResourceManager()
    public MaEngine ownsResourceManager(byte ownsResourceManager) {
    	OWNS_RESOURCE_MANAGER_HANDLE.set(segment, 0L, ownsResourceManager);
    	return this;
    }
    
    public byte ownsResourceManager() {
    	return (byte) OWNS_RESOURCE_MANAGER_HANDLE.get(segment, 0L);
    }
    
    /// @see #ownsDevice()
    public MaEngine ownsDevice(byte ownsDevice) {
    	OWNS_DEVICE_HANDLE.set(segment, 0L, ownsDevice);
    	return this;
    }
    
    public byte ownsDevice() {
    	return (byte) OWNS_DEVICE_HANDLE.get(segment, 0L);
    }
    
    /// @see #inlinedSoundLock()
    public MaEngine inlinedSoundLock(int inlinedSoundLock) {
    	INLINED_SOUND_LOCK_HANDLE.set(segment, 0L, inlinedSoundLock);
    	return this;
    }
    
    public int inlinedSoundLock() {
    	return (int) INLINED_SOUND_LOCK_HANDLE.get(segment, 0L);
    }
    
    /// @see #pInlinedSoundHead()
    public MaEngine pInlinedSoundHead(MaSoundInlined pInlinedSoundHead) {
    	P_INLINED_SOUND_HEAD_HANDLE.set(segment, 0L, pInlinedSoundHead.memorySegment());
    	return this;
    }
    
    public @Nullable MaSoundInlined pInlinedSoundHead() {
    	MemorySegment segment = (MemorySegment) P_INLINED_SOUND_HEAD_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaSoundInlined(segment);
    }
    
    /// @see #inlinedSoundCount()
    public MaEngine inlinedSoundCount(int inlinedSoundCount) {
    	INLINED_SOUND_COUNT_HANDLE.set(segment, 0L, inlinedSoundCount);
    	return this;
    }
    
    public int inlinedSoundCount() {
    	return (int) INLINED_SOUND_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #gainSmoothTimeInFrames()
    public MaEngine gainSmoothTimeInFrames(int gainSmoothTimeInFrames) {
    	GAIN_SMOOTH_TIME_IN_FRAMES_HANDLE.set(segment, 0L, gainSmoothTimeInFrames);
    	return this;
    }
    
    public int gainSmoothTimeInFrames() {
    	return (int) GAIN_SMOOTH_TIME_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #defaultVolumeSmoothTimeInPCMFrames()
    public MaEngine defaultVolumeSmoothTimeInPCMFrames(int defaultVolumeSmoothTimeInPCMFrames) {
    	DEFAULT_VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE.set(segment, 0L, defaultVolumeSmoothTimeInPCMFrames);
    	return this;
    }
    
    public int defaultVolumeSmoothTimeInPCMFrames() {
    	return (int) DEFAULT_VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #monoExpansionMode()
    public MaEngine monoExpansionMode(int monoExpansionMode) {
    	MONO_EXPANSION_MODE_HANDLE.set(segment, 0L, monoExpansionMode);
    	return this;
    }
    
    public int monoExpansionMode() {
    	return (int) MONO_EXPANSION_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #onProcess()
    public MaEngine onProcess(MaEngineProcessProc onProcess) {
    	ON_PROCESS_HANDLE.set(segment, 0L, onProcess.memorySegment());
    	return this;
    }
    
    public @Nullable MaEngineProcessProc onProcess() {
    	MemorySegment segment = (MemorySegment) ON_PROCESS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaEngineProcessProc.get(segment);
    }
    
    /// @see #pProcessUserData()
    public MaEngine pProcessUserData(MemorySegment pProcessUserData) {
    	P_PROCESS_USER_DATA_HANDLE.set(segment, 0L, pProcessUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pProcessUserData() {
    	MemorySegment segment = (MemorySegment) P_PROCESS_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pitchResamplingConfig()
    public MaEngine pitchResamplingConfig(Consumer<MaResamplerConfig> consumer) {
    	consumer.accept(pitchResamplingConfig);
    	return this;
    }
    
    /// @see #pitchResamplingConfig()
    public MaEngine pitchResamplingConfig(MaResamplerConfig other) {
    	pitchResamplingConfig.set(other);
    	return this;
    }
    
    public MaResamplerConfig pitchResamplingConfig() {
    	return pitchResamplingConfig;
    }
    
    @Override
    public MaEngine set(MaEngine other) {
        return set(other.segment);
    }
    
    @Override
    public MaEngine set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaEngine> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaEngine> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaEngine(segment),
            count
        );
    }
    
    public static NativeStructArray<MaEngine> array(SegmentAllocator allocator, MaEngine... structs) {
        NativeStructArray<MaEngine> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaEngine(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaEngine> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaEngine(segment)
        );
    }

}