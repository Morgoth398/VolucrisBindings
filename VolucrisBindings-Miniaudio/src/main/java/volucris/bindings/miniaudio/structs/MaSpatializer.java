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
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaSpatializer
		implements Struct<MaSpatializer> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CHANNELS_IN_HANDLE;
	public static final VarHandle CHANNELS_OUT_HANDLE;
	public static final VarHandle P_CHANNEL_MAP_IN_HANDLE;
	public static final VarHandle ATTENUATION_MODEL_HANDLE;
	public static final VarHandle POSITIONING_HANDLE;
	public static final VarHandle HANDEDNESS_HANDLE;
	public static final VarHandle MIN_GAIN_HANDLE;
	public static final VarHandle MAX_GAIN_HANDLE;
	public static final VarHandle MIN_DISTANCE_HANDLE;
	public static final VarHandle MAX_DISTANCE_HANDLE;
	public static final VarHandle ROLLOFF_HANDLE;
	public static final VarHandle CONE_INNER_ANGLE_IN_RADIANS_HANDLE;
	public static final VarHandle CONE_OUTER_ANGLE_IN_RADIANS_HANDLE;
	public static final VarHandle CONE_OUTER_GAIN_HANDLE;
	public static final VarHandle DOPPLER_FACTOR_HANDLE;
	public static final VarHandle DIRECTIONAL_ATTENUATION_FACTOR_HANDLE;
	public static final VarHandle GAIN_SMOOTH_TIME_IN_FRAMES_HANDLE;
	public static final VarHandle DOPPLER_PITCH_HANDLE;
	public static final VarHandle MIN_SPATIALIZATION_CHANNEL_GAIN_HANDLE;
	public static final VarHandle P_NEW_CHANNEL_GAINS_OUT_HANDLE;
	public static final VarHandle _P_HEAP_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;

	public static final long CHANNELS_IN_BYTE_OFFSET;
	public static final long CHANNELS_OUT_BYTE_OFFSET;
	public static final long P_CHANNEL_MAP_IN_BYTE_OFFSET;
	public static final long ATTENUATION_MODEL_BYTE_OFFSET;
	public static final long POSITIONING_BYTE_OFFSET;
	public static final long HANDEDNESS_BYTE_OFFSET;
	public static final long MIN_GAIN_BYTE_OFFSET;
	public static final long MAX_GAIN_BYTE_OFFSET;
	public static final long MIN_DISTANCE_BYTE_OFFSET;
	public static final long MAX_DISTANCE_BYTE_OFFSET;
	public static final long ROLLOFF_BYTE_OFFSET;
	public static final long CONE_INNER_ANGLE_IN_RADIANS_BYTE_OFFSET;
	public static final long CONE_OUTER_ANGLE_IN_RADIANS_BYTE_OFFSET;
	public static final long CONE_OUTER_GAIN_BYTE_OFFSET;
	public static final long DOPPLER_FACTOR_BYTE_OFFSET;
	public static final long DIRECTIONAL_ATTENUATION_FACTOR_BYTE_OFFSET;
	public static final long GAIN_SMOOTH_TIME_IN_FRAMES_BYTE_OFFSET;
	public static final long POSITION_BYTE_OFFSET;
	public static final long DIRECTION_BYTE_OFFSET;
	public static final long VELOCITY_BYTE_OFFSET;
	public static final long DOPPLER_PITCH_BYTE_OFFSET;
	public static final long MIN_SPATIALIZATION_CHANNEL_GAIN_BYTE_OFFSET;
	public static final long GAINER_BYTE_OFFSET;
	public static final long P_NEW_CHANNEL_GAINS_OUT_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaAtomicVec3f position;
	private final MaAtomicVec3f direction;
	private final MaAtomicVec3f velocity;
	private final MaGainer gainer;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("channelsIn"),
		    JAVA_INT.withName("channelsOut"),
		    UNBOUNDED_ADDRESS.withName("pChannelMapIn"),
		    JAVA_INT.withName("attenuationModel"),
		    JAVA_INT.withName("positioning"),
		    JAVA_INT.withName("handedness"),
		    JAVA_FLOAT.withName("minGain"),
		    JAVA_FLOAT.withName("maxGain"),
		    JAVA_FLOAT.withName("minDistance"),
		    JAVA_FLOAT.withName("maxDistance"),
		    JAVA_FLOAT.withName("rolloff"),
		    JAVA_FLOAT.withName("coneInnerAngleInRadians"),
		    JAVA_FLOAT.withName("coneOuterAngleInRadians"),
		    JAVA_FLOAT.withName("coneOuterGain"),
		    JAVA_FLOAT.withName("dopplerFactor"),
		    JAVA_FLOAT.withName("directionalAttenuationFactor"),
		    JAVA_INT.withName("gainSmoothTimeInFrames"),
		    MaAtomicVec3f.LAYOUT.withName("position"),
		    MaAtomicVec3f.LAYOUT.withName("direction"),
		    MaAtomicVec3f.LAYOUT.withName("velocity"),
		    JAVA_FLOAT.withName("dopplerPitch"),
		    JAVA_FLOAT.withName("minSpatializationChannelGain"),
		    MaGainer.LAYOUT.withName("gainer"),
		    UNBOUNDED_ADDRESS.withName("pNewChannelGainsOut"),
		    UNBOUNDED_ADDRESS.withName("_pHeap"),
		    JAVA_INT.withName("_ownsHeap"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_spatializer").withByteAlignment(8);
		
		CHANNELS_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelsIn"));
		CHANNELS_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelsOut"));
		P_CHANNEL_MAP_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pChannelMapIn"));
		ATTENUATION_MODEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attenuationModel"));
		POSITIONING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("positioning"));
		HANDEDNESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("handedness"));
		MIN_GAIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minGain"));
		MAX_GAIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxGain"));
		MIN_DISTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minDistance"));
		MAX_DISTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDistance"));
		ROLLOFF_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rolloff"));
		CONE_INNER_ANGLE_IN_RADIANS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coneInnerAngleInRadians"));
		CONE_OUTER_ANGLE_IN_RADIANS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coneOuterAngleInRadians"));
		CONE_OUTER_GAIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coneOuterGain"));
		DOPPLER_FACTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dopplerFactor"));
		DIRECTIONAL_ATTENUATION_FACTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("directionalAttenuationFactor"));
		GAIN_SMOOTH_TIME_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gainSmoothTimeInFrames"));
		DOPPLER_PITCH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dopplerPitch"));
		MIN_SPATIALIZATION_CHANNEL_GAIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minSpatializationChannelGain"));
		P_NEW_CHANNEL_GAINS_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNewChannelGainsOut"));
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		
		CHANNELS_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelsIn"));
		CHANNELS_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelsOut"));
		P_CHANNEL_MAP_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pChannelMapIn"));
		ATTENUATION_MODEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attenuationModel"));
		POSITIONING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("positioning"));
		HANDEDNESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("handedness"));
		MIN_GAIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minGain"));
		MAX_GAIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxGain"));
		MIN_DISTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minDistance"));
		MAX_DISTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDistance"));
		ROLLOFF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rolloff"));
		CONE_INNER_ANGLE_IN_RADIANS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coneInnerAngleInRadians"));
		CONE_OUTER_ANGLE_IN_RADIANS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coneOuterAngleInRadians"));
		CONE_OUTER_GAIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coneOuterGain"));
		DOPPLER_FACTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dopplerFactor"));
		DIRECTIONAL_ATTENUATION_FACTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("directionalAttenuationFactor"));
		GAIN_SMOOTH_TIME_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gainSmoothTimeInFrames"));
		POSITION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position"));
		DIRECTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("direction"));
		VELOCITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("velocity"));
		DOPPLER_PITCH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dopplerPitch"));
		MIN_SPATIALIZATION_CHANNEL_GAIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minSpatializationChannelGain"));
		GAINER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gainer"));
		P_NEW_CHANNEL_GAINS_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNewChannelGainsOut"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		//@formatter:on
	}

	public MaSpatializer() {
	    this(Arena.ofAuto());
	}
	
	public MaSpatializer(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaSpatializer(MemorySegment segment) {
	    this.segment = segment;
	
	    position = new MaAtomicVec3f(segment.asSlice(POSITION_BYTE_OFFSET, MaAtomicVec3f.LAYOUT));
	    direction = new MaAtomicVec3f(segment.asSlice(DIRECTION_BYTE_OFFSET, MaAtomicVec3f.LAYOUT));
	    velocity = new MaAtomicVec3f(segment.asSlice(VELOCITY_BYTE_OFFSET, MaAtomicVec3f.LAYOUT));
	    gainer = new MaGainer(segment.asSlice(GAINER_BYTE_OFFSET, MaGainer.LAYOUT));
	}

    /// @see #channelsIn()
    public MaSpatializer channelsIn(int channelsIn) {
    	CHANNELS_IN_HANDLE.set(segment, 0L, channelsIn);
    	return this;
    }
    
    public int channelsIn() {
    	return (int) CHANNELS_IN_HANDLE.get(segment, 0L);
    }
    
    /// @see #channelsOut()
    public MaSpatializer channelsOut(int channelsOut) {
    	CHANNELS_OUT_HANDLE.set(segment, 0L, channelsOut);
    	return this;
    }
    
    public int channelsOut() {
    	return (int) CHANNELS_OUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pChannelMapIn()
    public MaSpatializer pChannelMapIn(NativeByteArray pChannelMapIn) {
    	P_CHANNEL_MAP_IN_HANDLE.set(segment, 0L, pChannelMapIn.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray pChannelMapIn() {
    	MemorySegment segment = (MemorySegment) P_CHANNEL_MAP_IN_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #attenuationModel()
    public MaSpatializer attenuationModel(int attenuationModel) {
    	ATTENUATION_MODEL_HANDLE.set(segment, 0L, attenuationModel);
    	return this;
    }
    
    public int attenuationModel() {
    	return (int) ATTENUATION_MODEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #positioning()
    public MaSpatializer positioning(int positioning) {
    	POSITIONING_HANDLE.set(segment, 0L, positioning);
    	return this;
    }
    
    public int positioning() {
    	return (int) POSITIONING_HANDLE.get(segment, 0L);
    }
    
    /// @see #handedness()
    public MaSpatializer handedness(int handedness) {
    	HANDEDNESS_HANDLE.set(segment, 0L, handedness);
    	return this;
    }
    
    public int handedness() {
    	return (int) HANDEDNESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #minGain()
    public MaSpatializer minGain(float minGain) {
    	MIN_GAIN_HANDLE.set(segment, 0L, minGain);
    	return this;
    }
    
    public float minGain() {
    	return (float) MIN_GAIN_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxGain()
    public MaSpatializer maxGain(float maxGain) {
    	MAX_GAIN_HANDLE.set(segment, 0L, maxGain);
    	return this;
    }
    
    public float maxGain() {
    	return (float) MAX_GAIN_HANDLE.get(segment, 0L);
    }
    
    /// @see #minDistance()
    public MaSpatializer minDistance(float minDistance) {
    	MIN_DISTANCE_HANDLE.set(segment, 0L, minDistance);
    	return this;
    }
    
    public float minDistance() {
    	return (float) MIN_DISTANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDistance()
    public MaSpatializer maxDistance(float maxDistance) {
    	MAX_DISTANCE_HANDLE.set(segment, 0L, maxDistance);
    	return this;
    }
    
    public float maxDistance() {
    	return (float) MAX_DISTANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #rolloff()
    public MaSpatializer rolloff(float rolloff) {
    	ROLLOFF_HANDLE.set(segment, 0L, rolloff);
    	return this;
    }
    
    public float rolloff() {
    	return (float) ROLLOFF_HANDLE.get(segment, 0L);
    }
    
    /// @see #coneInnerAngleInRadians()
    public MaSpatializer coneInnerAngleInRadians(float coneInnerAngleInRadians) {
    	CONE_INNER_ANGLE_IN_RADIANS_HANDLE.set(segment, 0L, coneInnerAngleInRadians);
    	return this;
    }
    
    public float coneInnerAngleInRadians() {
    	return (float) CONE_INNER_ANGLE_IN_RADIANS_HANDLE.get(segment, 0L);
    }
    
    /// @see #coneOuterAngleInRadians()
    public MaSpatializer coneOuterAngleInRadians(float coneOuterAngleInRadians) {
    	CONE_OUTER_ANGLE_IN_RADIANS_HANDLE.set(segment, 0L, coneOuterAngleInRadians);
    	return this;
    }
    
    public float coneOuterAngleInRadians() {
    	return (float) CONE_OUTER_ANGLE_IN_RADIANS_HANDLE.get(segment, 0L);
    }
    
    /// @see #coneOuterGain()
    public MaSpatializer coneOuterGain(float coneOuterGain) {
    	CONE_OUTER_GAIN_HANDLE.set(segment, 0L, coneOuterGain);
    	return this;
    }
    
    public float coneOuterGain() {
    	return (float) CONE_OUTER_GAIN_HANDLE.get(segment, 0L);
    }
    
    /// @see #dopplerFactor()
    public MaSpatializer dopplerFactor(float dopplerFactor) {
    	DOPPLER_FACTOR_HANDLE.set(segment, 0L, dopplerFactor);
    	return this;
    }
    
    public float dopplerFactor() {
    	return (float) DOPPLER_FACTOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #directionalAttenuationFactor()
    public MaSpatializer directionalAttenuationFactor(float directionalAttenuationFactor) {
    	DIRECTIONAL_ATTENUATION_FACTOR_HANDLE.set(segment, 0L, directionalAttenuationFactor);
    	return this;
    }
    
    public float directionalAttenuationFactor() {
    	return (float) DIRECTIONAL_ATTENUATION_FACTOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #gainSmoothTimeInFrames()
    public MaSpatializer gainSmoothTimeInFrames(int gainSmoothTimeInFrames) {
    	GAIN_SMOOTH_TIME_IN_FRAMES_HANDLE.set(segment, 0L, gainSmoothTimeInFrames);
    	return this;
    }
    
    public int gainSmoothTimeInFrames() {
    	return (int) GAIN_SMOOTH_TIME_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #position()
    public MaSpatializer position(Consumer<MaAtomicVec3f> consumer) {
    	consumer.accept(position);
    	return this;
    }
    
    /// @see #position()
    public MaSpatializer position(MaAtomicVec3f other) {
    	position.set(other);
    	return this;
    }
    
    public MaAtomicVec3f position() {
    	return position;
    }
    
    /// @see #direction()
    public MaSpatializer direction(Consumer<MaAtomicVec3f> consumer) {
    	consumer.accept(direction);
    	return this;
    }
    
    /// @see #direction()
    public MaSpatializer direction(MaAtomicVec3f other) {
    	direction.set(other);
    	return this;
    }
    
    public MaAtomicVec3f direction() {
    	return direction;
    }
    
    /// @see #velocity()
    public MaSpatializer velocity(Consumer<MaAtomicVec3f> consumer) {
    	consumer.accept(velocity);
    	return this;
    }
    
    /// @see #velocity()
    public MaSpatializer velocity(MaAtomicVec3f other) {
    	velocity.set(other);
    	return this;
    }
    
    public MaAtomicVec3f velocity() {
    	return velocity;
    }
    
    /// @see #dopplerPitch()
    public MaSpatializer dopplerPitch(float dopplerPitch) {
    	DOPPLER_PITCH_HANDLE.set(segment, 0L, dopplerPitch);
    	return this;
    }
    
    public float dopplerPitch() {
    	return (float) DOPPLER_PITCH_HANDLE.get(segment, 0L);
    }
    
    /// @see #minSpatializationChannelGain()
    public MaSpatializer minSpatializationChannelGain(float minSpatializationChannelGain) {
    	MIN_SPATIALIZATION_CHANNEL_GAIN_HANDLE.set(segment, 0L, minSpatializationChannelGain);
    	return this;
    }
    
    public float minSpatializationChannelGain() {
    	return (float) MIN_SPATIALIZATION_CHANNEL_GAIN_HANDLE.get(segment, 0L);
    }
    
    /// @see #gainer()
    public MaSpatializer gainer(Consumer<MaGainer> consumer) {
    	consumer.accept(gainer);
    	return this;
    }
    
    /// @see #gainer()
    public MaSpatializer gainer(MaGainer other) {
    	gainer.set(other);
    	return this;
    }
    
    public MaGainer gainer() {
    	return gainer;
    }
    
    /// @see #pNewChannelGainsOut()
    public MaSpatializer pNewChannelGainsOut(NativeFloatArray pNewChannelGainsOut) {
    	P_NEW_CHANNEL_GAINS_OUT_HANDLE.set(segment, 0L, pNewChannelGainsOut.memorySegment());
    	return this;
    }
    
    public @Nullable NativeFloatArray pNewChannelGainsOut() {
    	MemorySegment segment = (MemorySegment) P_NEW_CHANNEL_GAINS_OUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    /// @see #_pHeap()
    public MaSpatializer _pHeap(MemorySegment _pHeap) {
    	_P_HEAP_HANDLE.set(segment, 0L, _pHeap);
    	return this;
    }
    
    public @Nullable MemorySegment _pHeap() {
    	MemorySegment segment = (MemorySegment) _P_HEAP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #_ownsHeap()
    public MaSpatializer _ownsHeap(int _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public int _ownsHeap() {
    	return (int) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaSpatializer set(MaSpatializer other) {
        return set(other.segment);
    }
    
    @Override
    public MaSpatializer set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaSpatializer> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaSpatializer> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaSpatializer(segment),
            count
        );
    }
    
    public static NativeStructArray<MaSpatializer> array(SegmentAllocator allocator, MaSpatializer... structs) {
        NativeStructArray<MaSpatializer> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaSpatializer(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaSpatializer> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaSpatializer(segment)
        );
    }

}