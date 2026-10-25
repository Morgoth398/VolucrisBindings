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

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaEngineNodeConfig
		implements Struct<MaEngineNodeConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_ENGINE_HANDLE;
	public static final VarHandle TYPE_HANDLE;
	public static final VarHandle CHANNELS_IN_HANDLE;
	public static final VarHandle CHANNELS_OUT_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE;
	public static final VarHandle MONO_EXPANSION_MODE_HANDLE;
	public static final VarHandle IS_PITCH_DISABLED_HANDLE;
	public static final VarHandle IS_SPATIALIZATION_DISABLED_HANDLE;
	public static final VarHandle PINNED_LISTENER_INDEX_HANDLE;

	public static final long P_ENGINE_BYTE_OFFSET;
	public static final long TYPE_BYTE_OFFSET;
	public static final long CHANNELS_IN_BYTE_OFFSET;
	public static final long CHANNELS_OUT_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long VOLUME_SMOOTH_TIME_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long MONO_EXPANSION_MODE_BYTE_OFFSET;
	public static final long IS_PITCH_DISABLED_BYTE_OFFSET;
	public static final long IS_SPATIALIZATION_DISABLED_BYTE_OFFSET;
	public static final long PINNED_LISTENER_INDEX_BYTE_OFFSET;
	public static final long RESAMPLING_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaResamplerConfig resampling;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pEngine"),
		    JAVA_INT.withName("type"),
		    JAVA_INT.withName("channelsIn"),
		    JAVA_INT.withName("channelsOut"),
		    JAVA_INT.withName("sampleRate"),
		    JAVA_INT.withName("volumeSmoothTimeInPCMFrames"),
		    JAVA_INT.withName("monoExpansionMode"),
		    JAVA_BYTE.withName("isPitchDisabled"),
		    JAVA_BYTE.withName("isSpatializationDisabled"),
		    JAVA_BYTE.withName("pinnedListenerIndex"),
		    MemoryLayout.paddingLayout(5),
		    MaResamplerConfig.LAYOUT.withName("resampling")
		).withName("ma_engine_node_config").withByteAlignment(8);
		
		P_ENGINE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pEngine"));
		TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
		CHANNELS_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelsIn"));
		CHANNELS_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelsOut"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("volumeSmoothTimeInPCMFrames"));
		MONO_EXPANSION_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("monoExpansionMode"));
		IS_PITCH_DISABLED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isPitchDisabled"));
		IS_SPATIALIZATION_DISABLED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isSpatializationDisabled"));
		PINNED_LISTENER_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pinnedListenerIndex"));
		
		P_ENGINE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pEngine"));
		TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
		CHANNELS_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelsIn"));
		CHANNELS_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelsOut"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		VOLUME_SMOOTH_TIME_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("volumeSmoothTimeInPCMFrames"));
		MONO_EXPANSION_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("monoExpansionMode"));
		IS_PITCH_DISABLED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isPitchDisabled"));
		IS_SPATIALIZATION_DISABLED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isSpatializationDisabled"));
		PINNED_LISTENER_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pinnedListenerIndex"));
		RESAMPLING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resampling"));
		//@formatter:on
	}

	public MaEngineNodeConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaEngineNodeConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaEngineNodeConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    resampling = new MaResamplerConfig(segment.asSlice(RESAMPLING_BYTE_OFFSET, MaResamplerConfig.LAYOUT));
	}

    /// @see #pEngine()
    public MaEngineNodeConfig pEngine(MaEngine pEngine) {
    	P_ENGINE_HANDLE.set(segment, 0L, pEngine.memorySegment());
    	return this;
    }
    
    public @Nullable MaEngine pEngine() {
    	MemorySegment segment = (MemorySegment) P_ENGINE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaEngine(segment);
    }
    
    /// @see #type()
    public MaEngineNodeConfig type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #channelsIn()
    public MaEngineNodeConfig channelsIn(int channelsIn) {
    	CHANNELS_IN_HANDLE.set(segment, 0L, channelsIn);
    	return this;
    }
    
    public int channelsIn() {
    	return (int) CHANNELS_IN_HANDLE.get(segment, 0L);
    }
    
    /// @see #channelsOut()
    public MaEngineNodeConfig channelsOut(int channelsOut) {
    	CHANNELS_OUT_HANDLE.set(segment, 0L, channelsOut);
    	return this;
    }
    
    public int channelsOut() {
    	return (int) CHANNELS_OUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaEngineNodeConfig sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #volumeSmoothTimeInPCMFrames()
    public MaEngineNodeConfig volumeSmoothTimeInPCMFrames(int volumeSmoothTimeInPCMFrames) {
    	VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE.set(segment, 0L, volumeSmoothTimeInPCMFrames);
    	return this;
    }
    
    public int volumeSmoothTimeInPCMFrames() {
    	return (int) VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #monoExpansionMode()
    public MaEngineNodeConfig monoExpansionMode(int monoExpansionMode) {
    	MONO_EXPANSION_MODE_HANDLE.set(segment, 0L, monoExpansionMode);
    	return this;
    }
    
    public int monoExpansionMode() {
    	return (int) MONO_EXPANSION_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #isPitchDisabled()
    public MaEngineNodeConfig isPitchDisabled(byte isPitchDisabled) {
    	IS_PITCH_DISABLED_HANDLE.set(segment, 0L, isPitchDisabled);
    	return this;
    }
    
    public byte isPitchDisabled() {
    	return (byte) IS_PITCH_DISABLED_HANDLE.get(segment, 0L);
    }
    
    /// @see #isSpatializationDisabled()
    public MaEngineNodeConfig isSpatializationDisabled(byte isSpatializationDisabled) {
    	IS_SPATIALIZATION_DISABLED_HANDLE.set(segment, 0L, isSpatializationDisabled);
    	return this;
    }
    
    public byte isSpatializationDisabled() {
    	return (byte) IS_SPATIALIZATION_DISABLED_HANDLE.get(segment, 0L);
    }
    
    /// @see #pinnedListenerIndex()
    public MaEngineNodeConfig pinnedListenerIndex(byte pinnedListenerIndex) {
    	PINNED_LISTENER_INDEX_HANDLE.set(segment, 0L, pinnedListenerIndex);
    	return this;
    }
    
    public byte pinnedListenerIndex() {
    	return (byte) PINNED_LISTENER_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #resampling()
    public MaEngineNodeConfig resampling(Consumer<MaResamplerConfig> consumer) {
    	consumer.accept(resampling);
    	return this;
    }
    
    /// @see #resampling()
    public MaEngineNodeConfig resampling(MaResamplerConfig other) {
    	resampling.set(other);
    	return this;
    }
    
    public MaResamplerConfig resampling() {
    	return resampling;
    }
    
    @Override
    public MaEngineNodeConfig set(MaEngineNodeConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaEngineNodeConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaEngineNodeConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaEngineNodeConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaEngineNodeConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaEngineNodeConfig> array(SegmentAllocator allocator, MaEngineNodeConfig... structs) {
        NativeStructArray<MaEngineNodeConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaEngineNodeConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaEngineNodeConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaEngineNodeConfig(segment)
        );
    }

}