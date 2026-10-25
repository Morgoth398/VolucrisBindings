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
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeShortArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaSoundConfig
		implements Struct<MaSoundConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_FILE_PATH_HANDLE;
	public static final VarHandle P_FILE_PATH_W_HANDLE;
	public static final VarHandle P_DATA_SOURCE_HANDLE;
	public static final VarHandle P_INITIAL_ATTACHMENT_HANDLE;
	public static final VarHandle INITIAL_ATTACHMENT_INPUT_BUS_INDEX_HANDLE;
	public static final VarHandle CHANNELS_IN_HANDLE;
	public static final VarHandle CHANNELS_OUT_HANDLE;
	public static final VarHandle MONO_EXPANSION_MODE_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE;
	public static final VarHandle INITIAL_SEEK_POINT_IN_PCMFRAMES_HANDLE;
	public static final VarHandle RANGE_BEG_IN_PCMFRAMES_HANDLE;
	public static final VarHandle RANGE_END_IN_PCMFRAMES_HANDLE;
	public static final VarHandle LOOP_POINT_BEG_IN_PCMFRAMES_HANDLE;
	public static final VarHandle LOOP_POINT_END_IN_PCMFRAMES_HANDLE;
	public static final VarHandle END_CALLBACK_HANDLE;
	public static final VarHandle P_END_CALLBACK_USER_DATA_HANDLE;
	public static final VarHandle P_DONE_FENCE_HANDLE;
	public static final VarHandle IS_LOOPING_HANDLE;

	public static final long P_FILE_PATH_BYTE_OFFSET;
	public static final long P_FILE_PATH_W_BYTE_OFFSET;
	public static final long P_DATA_SOURCE_BYTE_OFFSET;
	public static final long P_INITIAL_ATTACHMENT_BYTE_OFFSET;
	public static final long INITIAL_ATTACHMENT_INPUT_BUS_INDEX_BYTE_OFFSET;
	public static final long CHANNELS_IN_BYTE_OFFSET;
	public static final long CHANNELS_OUT_BYTE_OFFSET;
	public static final long MONO_EXPANSION_MODE_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long VOLUME_SMOOTH_TIME_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long INITIAL_SEEK_POINT_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long RANGE_BEG_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long RANGE_END_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long LOOP_POINT_BEG_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long LOOP_POINT_END_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long END_CALLBACK_BYTE_OFFSET;
	public static final long P_END_CALLBACK_USER_DATA_BYTE_OFFSET;
	public static final long PITCH_RESAMPLING_BYTE_OFFSET;
	public static final long INIT_NOTIFICATIONS_BYTE_OFFSET;
	public static final long P_DONE_FENCE_BYTE_OFFSET;
	public static final long IS_LOOPING_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaResamplerConfig pitchResampling;
	private final MaResourceManagerPipelineNotifications initNotifications;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pFilePath"),
		    UNBOUNDED_ADDRESS.withName("pFilePathW"),
		    UNBOUNDED_ADDRESS.withName("pDataSource"),
		    UNBOUNDED_ADDRESS.withName("pInitialAttachment"),
		    JAVA_INT.withName("initialAttachmentInputBusIndex"),
		    JAVA_INT.withName("channelsIn"),
		    JAVA_INT.withName("channelsOut"),
		    JAVA_INT.withName("monoExpansionMode"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("volumeSmoothTimeInPCMFrames"),
		    JAVA_LONG.withName("initialSeekPointInPCMFrames"),
		    JAVA_LONG.withName("rangeBegInPCMFrames"),
		    JAVA_LONG.withName("rangeEndInPCMFrames"),
		    JAVA_LONG.withName("loopPointBegInPCMFrames"),
		    JAVA_LONG.withName("loopPointEndInPCMFrames"),
		    UNBOUNDED_ADDRESS.withName("endCallback"),
		    UNBOUNDED_ADDRESS.withName("pEndCallbackUserData"),
		    MaResamplerConfig.LAYOUT.withName("pitchResampling"),
		    MaResourceManagerPipelineNotifications.LAYOUT.withName("initNotifications"),
		    UNBOUNDED_ADDRESS.withName("pDoneFence"),
		    JAVA_INT.withName("isLooping"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_sound_config").withByteAlignment(8);
		
		P_FILE_PATH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pFilePath"));
		P_FILE_PATH_W_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pFilePathW"));
		P_DATA_SOURCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDataSource"));
		P_INITIAL_ATTACHMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInitialAttachment"));
		INITIAL_ATTACHMENT_INPUT_BUS_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("initialAttachmentInputBusIndex"));
		CHANNELS_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelsIn"));
		CHANNELS_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelsOut"));
		MONO_EXPANSION_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("monoExpansionMode"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("volumeSmoothTimeInPCMFrames"));
		INITIAL_SEEK_POINT_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("initialSeekPointInPCMFrames"));
		RANGE_BEG_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rangeBegInPCMFrames"));
		RANGE_END_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rangeEndInPCMFrames"));
		LOOP_POINT_BEG_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loopPointBegInPCMFrames"));
		LOOP_POINT_END_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loopPointEndInPCMFrames"));
		END_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("endCallback"));
		P_END_CALLBACK_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pEndCallbackUserData"));
		P_DONE_FENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDoneFence"));
		IS_LOOPING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isLooping"));
		
		P_FILE_PATH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pFilePath"));
		P_FILE_PATH_W_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pFilePathW"));
		P_DATA_SOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDataSource"));
		P_INITIAL_ATTACHMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInitialAttachment"));
		INITIAL_ATTACHMENT_INPUT_BUS_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("initialAttachmentInputBusIndex"));
		CHANNELS_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelsIn"));
		CHANNELS_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelsOut"));
		MONO_EXPANSION_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("monoExpansionMode"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		VOLUME_SMOOTH_TIME_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("volumeSmoothTimeInPCMFrames"));
		INITIAL_SEEK_POINT_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("initialSeekPointInPCMFrames"));
		RANGE_BEG_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rangeBegInPCMFrames"));
		RANGE_END_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rangeEndInPCMFrames"));
		LOOP_POINT_BEG_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loopPointBegInPCMFrames"));
		LOOP_POINT_END_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loopPointEndInPCMFrames"));
		END_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("endCallback"));
		P_END_CALLBACK_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pEndCallbackUserData"));
		PITCH_RESAMPLING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pitchResampling"));
		INIT_NOTIFICATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("initNotifications"));
		P_DONE_FENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDoneFence"));
		IS_LOOPING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isLooping"));
		//@formatter:on
	}

	public MaSoundConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaSoundConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaSoundConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    pitchResampling = new MaResamplerConfig(segment.asSlice(PITCH_RESAMPLING_BYTE_OFFSET, MaResamplerConfig.LAYOUT));
	    initNotifications = new MaResourceManagerPipelineNotifications(segment.asSlice(INIT_NOTIFICATIONS_BYTE_OFFSET, MaResourceManagerPipelineNotifications.LAYOUT));
	}

    /// @see #pFilePath()
    public MaSoundConfig pFilePath(NativeByteArray pFilePath) {
    	P_FILE_PATH_HANDLE.set(segment, 0L, pFilePath.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray pFilePath() {
    	MemorySegment segment = (MemorySegment) P_FILE_PATH_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #pFilePathW()
    public MaSoundConfig pFilePathW(NativeShortArray pFilePathW) {
    	P_FILE_PATH_W_HANDLE.set(segment, 0L, pFilePathW.memorySegment());
    	return this;
    }
    
    public @Nullable NativeShortArray pFilePathW() {
    	MemorySegment segment = (MemorySegment) P_FILE_PATH_W_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeShortArray(segment);
    }
    
    /// @see #pDataSource()
    public MaSoundConfig pDataSource(MemorySegment pDataSource) {
    	P_DATA_SOURCE_HANDLE.set(segment, 0L, pDataSource);
    	return this;
    }
    
    public @Nullable MemorySegment pDataSource() {
    	MemorySegment segment = (MemorySegment) P_DATA_SOURCE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pInitialAttachment()
    public MaSoundConfig pInitialAttachment(MemorySegment pInitialAttachment) {
    	P_INITIAL_ATTACHMENT_HANDLE.set(segment, 0L, pInitialAttachment);
    	return this;
    }
    
    public @Nullable MemorySegment pInitialAttachment() {
    	MemorySegment segment = (MemorySegment) P_INITIAL_ATTACHMENT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #initialAttachmentInputBusIndex()
    public MaSoundConfig initialAttachmentInputBusIndex(int initialAttachmentInputBusIndex) {
    	INITIAL_ATTACHMENT_INPUT_BUS_INDEX_HANDLE.set(segment, 0L, initialAttachmentInputBusIndex);
    	return this;
    }
    
    public int initialAttachmentInputBusIndex() {
    	return (int) INITIAL_ATTACHMENT_INPUT_BUS_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #channelsIn()
    public MaSoundConfig channelsIn(int channelsIn) {
    	CHANNELS_IN_HANDLE.set(segment, 0L, channelsIn);
    	return this;
    }
    
    public int channelsIn() {
    	return (int) CHANNELS_IN_HANDLE.get(segment, 0L);
    }
    
    /// @see #channelsOut()
    public MaSoundConfig channelsOut(int channelsOut) {
    	CHANNELS_OUT_HANDLE.set(segment, 0L, channelsOut);
    	return this;
    }
    
    public int channelsOut() {
    	return (int) CHANNELS_OUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #monoExpansionMode()
    public MaSoundConfig monoExpansionMode(int monoExpansionMode) {
    	MONO_EXPANSION_MODE_HANDLE.set(segment, 0L, monoExpansionMode);
    	return this;
    }
    
    public int monoExpansionMode() {
    	return (int) MONO_EXPANSION_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public MaSoundConfig flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #volumeSmoothTimeInPCMFrames()
    public MaSoundConfig volumeSmoothTimeInPCMFrames(int volumeSmoothTimeInPCMFrames) {
    	VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE.set(segment, 0L, volumeSmoothTimeInPCMFrames);
    	return this;
    }
    
    public int volumeSmoothTimeInPCMFrames() {
    	return (int) VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #initialSeekPointInPCMFrames()
    public MaSoundConfig initialSeekPointInPCMFrames(long initialSeekPointInPCMFrames) {
    	INITIAL_SEEK_POINT_IN_PCMFRAMES_HANDLE.set(segment, 0L, initialSeekPointInPCMFrames);
    	return this;
    }
    
    public long initialSeekPointInPCMFrames() {
    	return (long) INITIAL_SEEK_POINT_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #rangeBegInPCMFrames()
    public MaSoundConfig rangeBegInPCMFrames(long rangeBegInPCMFrames) {
    	RANGE_BEG_IN_PCMFRAMES_HANDLE.set(segment, 0L, rangeBegInPCMFrames);
    	return this;
    }
    
    public long rangeBegInPCMFrames() {
    	return (long) RANGE_BEG_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #rangeEndInPCMFrames()
    public MaSoundConfig rangeEndInPCMFrames(long rangeEndInPCMFrames) {
    	RANGE_END_IN_PCMFRAMES_HANDLE.set(segment, 0L, rangeEndInPCMFrames);
    	return this;
    }
    
    public long rangeEndInPCMFrames() {
    	return (long) RANGE_END_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #loopPointBegInPCMFrames()
    public MaSoundConfig loopPointBegInPCMFrames(long loopPointBegInPCMFrames) {
    	LOOP_POINT_BEG_IN_PCMFRAMES_HANDLE.set(segment, 0L, loopPointBegInPCMFrames);
    	return this;
    }
    
    public long loopPointBegInPCMFrames() {
    	return (long) LOOP_POINT_BEG_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #loopPointEndInPCMFrames()
    public MaSoundConfig loopPointEndInPCMFrames(long loopPointEndInPCMFrames) {
    	LOOP_POINT_END_IN_PCMFRAMES_HANDLE.set(segment, 0L, loopPointEndInPCMFrames);
    	return this;
    }
    
    public long loopPointEndInPCMFrames() {
    	return (long) LOOP_POINT_END_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #endCallback()
    public MaSoundConfig endCallback(MaSoundEndProc endCallback) {
    	END_CALLBACK_HANDLE.set(segment, 0L, endCallback.memorySegment());
    	return this;
    }
    
    public @Nullable MaSoundEndProc endCallback() {
    	MemorySegment segment = (MemorySegment) END_CALLBACK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaSoundEndProc.get(segment);
    }
    
    /// @see #pEndCallbackUserData()
    public MaSoundConfig pEndCallbackUserData(MemorySegment pEndCallbackUserData) {
    	P_END_CALLBACK_USER_DATA_HANDLE.set(segment, 0L, pEndCallbackUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pEndCallbackUserData() {
    	MemorySegment segment = (MemorySegment) P_END_CALLBACK_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pitchResampling()
    public MaSoundConfig pitchResampling(Consumer<MaResamplerConfig> consumer) {
    	consumer.accept(pitchResampling);
    	return this;
    }
    
    /// @see #pitchResampling()
    public MaSoundConfig pitchResampling(MaResamplerConfig other) {
    	pitchResampling.set(other);
    	return this;
    }
    
    public MaResamplerConfig pitchResampling() {
    	return pitchResampling;
    }
    
    /// @see #initNotifications()
    public MaSoundConfig initNotifications(Consumer<MaResourceManagerPipelineNotifications> consumer) {
    	consumer.accept(initNotifications);
    	return this;
    }
    
    /// @see #initNotifications()
    public MaSoundConfig initNotifications(MaResourceManagerPipelineNotifications other) {
    	initNotifications.set(other);
    	return this;
    }
    
    public MaResourceManagerPipelineNotifications initNotifications() {
    	return initNotifications;
    }
    
    /// @see #pDoneFence()
    public MaSoundConfig pDoneFence(MaFence pDoneFence) {
    	P_DONE_FENCE_HANDLE.set(segment, 0L, pDoneFence.memorySegment());
    	return this;
    }
    
    public @Nullable MaFence pDoneFence() {
    	MemorySegment segment = (MemorySegment) P_DONE_FENCE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaFence(segment);
    }
    
    /// @see #isLooping()
    public MaSoundConfig isLooping(int isLooping) {
    	IS_LOOPING_HANDLE.set(segment, 0L, isLooping);
    	return this;
    }
    
    public int isLooping() {
    	return (int) IS_LOOPING_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaSoundConfig set(MaSoundConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaSoundConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaSoundConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaSoundConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaSoundConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaSoundConfig> array(SegmentAllocator allocator, MaSoundConfig... structs) {
        NativeStructArray<MaSoundConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaSoundConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaSoundConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaSoundConfig(segment)
        );
    }

}