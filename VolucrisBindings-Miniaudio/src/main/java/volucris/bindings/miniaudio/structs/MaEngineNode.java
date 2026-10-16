/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaEngineNode
		implements Struct<MaEngineNode> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_ENGINE_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE;
	public static final VarHandle MONO_EXPANSION_MODE_HANDLE;
	public static final VarHandle PITCH_HANDLE;
	public static final VarHandle OLD_PITCH_HANDLE;
	public static final VarHandle OLD_DOPPLER_PITCH_HANDLE;
	public static final VarHandle IS_PITCH_DISABLED_HANDLE;
	public static final VarHandle IS_SPATIALIZATION_DISABLED_HANDLE;
	public static final VarHandle PINNED_LISTENER_INDEX_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;
	public static final VarHandle _P_HEAP_HANDLE;

	public static final long BASE_NODE_BYTE_OFFSET;
	public static final long P_ENGINE_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long VOLUME_SMOOTH_TIME_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long MONO_EXPANSION_MODE_BYTE_OFFSET;
	public static final long FADER_BYTE_OFFSET;
	public static final long RESAMPLER_BYTE_OFFSET;
	public static final long SPATIALIZER_BYTE_OFFSET;
	public static final long PANNER_BYTE_OFFSET;
	public static final long VOLUME_GAINER_BYTE_OFFSET;
	public static final long VOLUME_BYTE_OFFSET;
	public static final long PITCH_BYTE_OFFSET;
	public static final long OLD_PITCH_BYTE_OFFSET;
	public static final long OLD_DOPPLER_PITCH_BYTE_OFFSET;
	public static final long IS_PITCH_DISABLED_BYTE_OFFSET;
	public static final long IS_SPATIALIZATION_DISABLED_BYTE_OFFSET;
	public static final long PINNED_LISTENER_INDEX_BYTE_OFFSET;
	public static final long FADE_SETTINGS_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeBase baseNode;
	private final MaFader fader;
	private final MaResampler resampler;
	private final MaSpatializer spatializer;
	private final MaPanner panner;
	private final MaGainer volumeGainer;
	private final MaAtomicFloat volume;
	private final FadeSettings fadeSettings;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeBase.LAYOUT.withName("baseNode"),
		    UNBOUNDED_ADDRESS.withName("pEngine"),
		    JAVA_INT.withName("sampleRate"),
		    JAVA_INT.withName("volumeSmoothTimeInPCMFrames"),
		    JAVA_INT.withName("monoExpansionMode"),
		    MemoryLayout.paddingLayout(4),
		    MaFader.LAYOUT.withName("fader"),
		    MaResampler.LAYOUT.withName("resampler"),
		    MaSpatializer.LAYOUT.withName("spatializer"),
		    MaPanner.LAYOUT.withName("panner"),
		    MaGainer.LAYOUT.withName("volumeGainer"),
		    MaAtomicFloat.LAYOUT.withName("volume"),
		    JAVA_FLOAT.withName("pitch"),
		    JAVA_FLOAT.withName("oldPitch"),
		    JAVA_FLOAT.withName("oldDopplerPitch"),
		    JAVA_INT.withName("isPitchDisabled"),
		    JAVA_INT.withName("isSpatializationDisabled"),
		    JAVA_INT.withName("pinnedListenerIndex"),
		    MemoryLayout.paddingLayout(4),
		    FadeSettings.LAYOUT.withName("fadeSettings"),
		    JAVA_BYTE.withName("_ownsHeap"),
		    MemoryLayout.paddingLayout(7),
		    UNBOUNDED_ADDRESS.withName("_pHeap")
		).withName("ma_engine_node").withByteAlignment(8);
		
		P_ENGINE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pEngine"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("volumeSmoothTimeInPCMFrames"));
		MONO_EXPANSION_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("monoExpansionMode"));
		PITCH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pitch"));
		OLD_PITCH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("oldPitch"));
		OLD_DOPPLER_PITCH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("oldDopplerPitch"));
		IS_PITCH_DISABLED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isPitchDisabled"));
		IS_SPATIALIZATION_DISABLED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isSpatializationDisabled"));
		PINNED_LISTENER_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pinnedListenerIndex"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		
		BASE_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseNode"));
		P_ENGINE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pEngine"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		VOLUME_SMOOTH_TIME_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("volumeSmoothTimeInPCMFrames"));
		MONO_EXPANSION_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("monoExpansionMode"));
		FADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fader"));
		RESAMPLER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resampler"));
		SPATIALIZER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("spatializer"));
		PANNER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("panner"));
		VOLUME_GAINER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("volumeGainer"));
		VOLUME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("volume"));
		PITCH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pitch"));
		OLD_PITCH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("oldPitch"));
		OLD_DOPPLER_PITCH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("oldDopplerPitch"));
		IS_PITCH_DISABLED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isPitchDisabled"));
		IS_SPATIALIZATION_DISABLED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isSpatializationDisabled"));
		PINNED_LISTENER_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pinnedListenerIndex"));
		FADE_SETTINGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fadeSettings"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		//@formatter:on
	}

	public MaEngineNode() {
	    this(Arena.ofAuto());
	}
	
	public MaEngineNode(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaEngineNode(MemorySegment segment) {
	    this.segment = segment;
	
	    baseNode = new MaNodeBase(segment.asSlice(BASE_NODE_BYTE_OFFSET, MaNodeBase.LAYOUT));
	    fader = new MaFader(segment.asSlice(FADER_BYTE_OFFSET, MaFader.LAYOUT));
	    resampler = new MaResampler(segment.asSlice(RESAMPLER_BYTE_OFFSET, MaResampler.LAYOUT));
	    spatializer = new MaSpatializer(segment.asSlice(SPATIALIZER_BYTE_OFFSET, MaSpatializer.LAYOUT));
	    panner = new MaPanner(segment.asSlice(PANNER_BYTE_OFFSET, MaPanner.LAYOUT));
	    volumeGainer = new MaGainer(segment.asSlice(VOLUME_GAINER_BYTE_OFFSET, MaGainer.LAYOUT));
	    volume = new MaAtomicFloat(segment.asSlice(VOLUME_BYTE_OFFSET, MaAtomicFloat.LAYOUT));
	    fadeSettings = new FadeSettings(segment.asSlice(FADE_SETTINGS_BYTE_OFFSET, FadeSettings.LAYOUT));
	}

    /// @see #baseNode()
    public MaEngineNode baseNode(Consumer<MaNodeBase> consumer) {
    	consumer.accept(baseNode);
    	return this;
    }
    
    /// @see #baseNode()
    public MaEngineNode baseNode(MaNodeBase other) {
    	baseNode.set(other);
    	return this;
    }
    
    public MaNodeBase baseNode() {
    	return baseNode;
    }
    
    /// @see #pEngine()
    public MaEngineNode pEngine(MaEngine pEngine) {
    	P_ENGINE_HANDLE.set(segment, 0L, pEngine.memorySegment());
    	return this;
    }
    
    public @Nullable MaEngine pEngine() {
    	MemorySegment segment = (MemorySegment) P_ENGINE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaEngine(segment);
    }
    
    /// @see #sampleRate()
    public MaEngineNode sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #volumeSmoothTimeInPCMFrames()
    public MaEngineNode volumeSmoothTimeInPCMFrames(int volumeSmoothTimeInPCMFrames) {
    	VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE.set(segment, 0L, volumeSmoothTimeInPCMFrames);
    	return this;
    }
    
    public int volumeSmoothTimeInPCMFrames() {
    	return (int) VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #monoExpansionMode()
    public MaEngineNode monoExpansionMode(int monoExpansionMode) {
    	MONO_EXPANSION_MODE_HANDLE.set(segment, 0L, monoExpansionMode);
    	return this;
    }
    
    public int monoExpansionMode() {
    	return (int) MONO_EXPANSION_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #fader()
    public MaEngineNode fader(Consumer<MaFader> consumer) {
    	consumer.accept(fader);
    	return this;
    }
    
    /// @see #fader()
    public MaEngineNode fader(MaFader other) {
    	fader.set(other);
    	return this;
    }
    
    public MaFader fader() {
    	return fader;
    }
    
    /// @see #resampler()
    public MaEngineNode resampler(Consumer<MaResampler> consumer) {
    	consumer.accept(resampler);
    	return this;
    }
    
    /// @see #resampler()
    public MaEngineNode resampler(MaResampler other) {
    	resampler.set(other);
    	return this;
    }
    
    public MaResampler resampler() {
    	return resampler;
    }
    
    /// @see #spatializer()
    public MaEngineNode spatializer(Consumer<MaSpatializer> consumer) {
    	consumer.accept(spatializer);
    	return this;
    }
    
    /// @see #spatializer()
    public MaEngineNode spatializer(MaSpatializer other) {
    	spatializer.set(other);
    	return this;
    }
    
    public MaSpatializer spatializer() {
    	return spatializer;
    }
    
    /// @see #panner()
    public MaEngineNode panner(Consumer<MaPanner> consumer) {
    	consumer.accept(panner);
    	return this;
    }
    
    /// @see #panner()
    public MaEngineNode panner(MaPanner other) {
    	panner.set(other);
    	return this;
    }
    
    public MaPanner panner() {
    	return panner;
    }
    
    /// @see #volumeGainer()
    public MaEngineNode volumeGainer(Consumer<MaGainer> consumer) {
    	consumer.accept(volumeGainer);
    	return this;
    }
    
    /// @see #volumeGainer()
    public MaEngineNode volumeGainer(MaGainer other) {
    	volumeGainer.set(other);
    	return this;
    }
    
    public MaGainer volumeGainer() {
    	return volumeGainer;
    }
    
    /// @see #volume()
    public MaEngineNode volume(Consumer<MaAtomicFloat> consumer) {
    	consumer.accept(volume);
    	return this;
    }
    
    /// @see #volume()
    public MaEngineNode volume(MaAtomicFloat other) {
    	volume.set(other);
    	return this;
    }
    
    public MaAtomicFloat volume() {
    	return volume;
    }
    
    /// @see #pitch()
    public MaEngineNode pitch(float pitch) {
    	PITCH_HANDLE.set(segment, 0L, pitch);
    	return this;
    }
    
    public float pitch() {
    	return (float) PITCH_HANDLE.get(segment, 0L);
    }
    
    /// @see #oldPitch()
    public MaEngineNode oldPitch(float oldPitch) {
    	OLD_PITCH_HANDLE.set(segment, 0L, oldPitch);
    	return this;
    }
    
    public float oldPitch() {
    	return (float) OLD_PITCH_HANDLE.get(segment, 0L);
    }
    
    /// @see #oldDopplerPitch()
    public MaEngineNode oldDopplerPitch(float oldDopplerPitch) {
    	OLD_DOPPLER_PITCH_HANDLE.set(segment, 0L, oldDopplerPitch);
    	return this;
    }
    
    public float oldDopplerPitch() {
    	return (float) OLD_DOPPLER_PITCH_HANDLE.get(segment, 0L);
    }
    
    /// @see #isPitchDisabled()
    public MaEngineNode isPitchDisabled(int isPitchDisabled) {
    	IS_PITCH_DISABLED_HANDLE.set(segment, 0L, isPitchDisabled);
    	return this;
    }
    
    public int isPitchDisabled() {
    	return (int) IS_PITCH_DISABLED_HANDLE.get(segment, 0L);
    }
    
    /// @see #isSpatializationDisabled()
    public MaEngineNode isSpatializationDisabled(int isSpatializationDisabled) {
    	IS_SPATIALIZATION_DISABLED_HANDLE.set(segment, 0L, isSpatializationDisabled);
    	return this;
    }
    
    public int isSpatializationDisabled() {
    	return (int) IS_SPATIALIZATION_DISABLED_HANDLE.get(segment, 0L);
    }
    
    /// @see #pinnedListenerIndex()
    public MaEngineNode pinnedListenerIndex(int pinnedListenerIndex) {
    	PINNED_LISTENER_INDEX_HANDLE.set(segment, 0L, pinnedListenerIndex);
    	return this;
    }
    
    public int pinnedListenerIndex() {
    	return (int) PINNED_LISTENER_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #fadeSettings()
    public MaEngineNode fadeSettings(Consumer<FadeSettings> consumer) {
    	consumer.accept(fadeSettings);
    	return this;
    }
    
    /// @see #fadeSettings()
    public MaEngineNode fadeSettings(FadeSettings other) {
    	fadeSettings.set(other);
    	return this;
    }
    
    public FadeSettings fadeSettings() {
    	return fadeSettings;
    }
    
    /// @see #_ownsHeap()
    public MaEngineNode _ownsHeap(byte _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public byte _ownsHeap() {
    	return (byte) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    /// @see #_pHeap()
    public MaEngineNode _pHeap(MemorySegment _pHeap) {
    	_P_HEAP_HANDLE.set(segment, 0L, _pHeap);
    	return this;
    }
    
    public @Nullable MemorySegment _pHeap() {
    	MemorySegment segment = (MemorySegment) _P_HEAP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public MaEngineNode set(MaEngineNode other) {
        return set(other.segment);
    }
    
    @Override
    public MaEngineNode set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaEngineNode> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaEngineNode> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaEngineNode(segment),
            count
        );
    }
    
    public static NativeStructArray<MaEngineNode> array(Arena arena, MaEngineNode... structs) {
        NativeStructArray<MaEngineNode> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaEngineNode(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaEngineNode> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaEngineNode(segment)
        );
    }

	public static class FadeSettings implements Struct<FadeSettings> {
	
		public static final StructLayout LAYOUT;
	
		public static final long VOLUME_BEG_BYTE_OFFSET;
		public static final long VOLUME_END_BYTE_OFFSET;
		public static final long FADE_LENGTH_IN_FRAMES_BYTE_OFFSET;
		public static final long ABSOLUTE_GLOBAL_TIME_IN_FRAMES_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final MaAtomicFloat volumeBeg;
		private final MaAtomicFloat volumeEnd;
		private final MaAtomicUint64 fadeLengthInFrames;
		private final MaAtomicUint64 absoluteGlobalTimeInFrames;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    MaAtomicFloat.LAYOUT.withName("volumeBeg"),
			    MaAtomicFloat.LAYOUT.withName("volumeEnd"),
			    MaAtomicUint64.LAYOUT.withName("fadeLengthInFrames"),
			    MaAtomicUint64.LAYOUT.withName("absoluteGlobalTimeInFrames")
			).withName("FadeSettings").withByteAlignment(8);
			
			VOLUME_BEG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("volumeBeg"));
			VOLUME_END_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("volumeEnd"));
			FADE_LENGTH_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fadeLengthInFrames"));
			ABSOLUTE_GLOBAL_TIME_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("absoluteGlobalTimeInFrames"));
			//@formatter:on
		}
	
		public FadeSettings() {
		    this(Arena.ofAuto());
		}
		
		public FadeSettings(Arena arena) {
		    this(arena.allocate(LAYOUT));
		}
		
		public FadeSettings(MemorySegment segment) {
		    this.segment = segment;
		
		    volumeBeg = new MaAtomicFloat(segment.asSlice(VOLUME_BEG_BYTE_OFFSET, MaAtomicFloat.LAYOUT));
		    volumeEnd = new MaAtomicFloat(segment.asSlice(VOLUME_END_BYTE_OFFSET, MaAtomicFloat.LAYOUT));
		    fadeLengthInFrames = new MaAtomicUint64(segment.asSlice(FADE_LENGTH_IN_FRAMES_BYTE_OFFSET, MaAtomicUint64.LAYOUT));
		    absoluteGlobalTimeInFrames = new MaAtomicUint64(segment.asSlice(ABSOLUTE_GLOBAL_TIME_IN_FRAMES_BYTE_OFFSET, MaAtomicUint64.LAYOUT));
		}
	
	    /// @see #volumeBeg()
	    public FadeSettings volumeBeg(Consumer<MaAtomicFloat> consumer) {
	    	consumer.accept(volumeBeg);
	    	return this;
	    }
	    
	    /// @see #volumeBeg()
	    public FadeSettings volumeBeg(MaAtomicFloat other) {
	    	volumeBeg.set(other);
	    	return this;
	    }
	    
	    public MaAtomicFloat volumeBeg() {
	    	return volumeBeg;
	    }
	    
	    /// @see #volumeEnd()
	    public FadeSettings volumeEnd(Consumer<MaAtomicFloat> consumer) {
	    	consumer.accept(volumeEnd);
	    	return this;
	    }
	    
	    /// @see #volumeEnd()
	    public FadeSettings volumeEnd(MaAtomicFloat other) {
	    	volumeEnd.set(other);
	    	return this;
	    }
	    
	    public MaAtomicFloat volumeEnd() {
	    	return volumeEnd;
	    }
	    
	    /// @see #fadeLengthInFrames()
	    public FadeSettings fadeLengthInFrames(Consumer<MaAtomicUint64> consumer) {
	    	consumer.accept(fadeLengthInFrames);
	    	return this;
	    }
	    
	    /// @see #fadeLengthInFrames()
	    public FadeSettings fadeLengthInFrames(MaAtomicUint64 other) {
	    	fadeLengthInFrames.set(other);
	    	return this;
	    }
	    
	    public MaAtomicUint64 fadeLengthInFrames() {
	    	return fadeLengthInFrames;
	    }
	    
	    /// @see #absoluteGlobalTimeInFrames()
	    public FadeSettings absoluteGlobalTimeInFrames(Consumer<MaAtomicUint64> consumer) {
	    	consumer.accept(absoluteGlobalTimeInFrames);
	    	return this;
	    }
	    
	    /// @see #absoluteGlobalTimeInFrames()
	    public FadeSettings absoluteGlobalTimeInFrames(MaAtomicUint64 other) {
	    	absoluteGlobalTimeInFrames.set(other);
	    	return this;
	    }
	    
	    public MaAtomicUint64 absoluteGlobalTimeInFrames() {
	    	return absoluteGlobalTimeInFrames;
	    }
	    
	    @Override
	    public FadeSettings set(FadeSettings other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public FadeSettings set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<FadeSettings> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<FadeSettings> array(Arena arena, int count) {
	        return new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new FadeSettings(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<FadeSettings> array(Arena arena, FadeSettings... structs) {
	        NativeStructArray<FadeSettings> array = new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new FadeSettings(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<FadeSettings> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new FadeSettings(segment)
	        );
	    }
	
	}
}