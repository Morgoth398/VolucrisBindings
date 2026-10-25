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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaSpatializerListenerConfig
		implements Struct<MaSpatializerListenerConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CHANNELS_OUT_HANDLE;
	public static final VarHandle P_CHANNEL_MAP_OUT_HANDLE;
	public static final VarHandle HANDEDNESS_HANDLE;
	public static final VarHandle CONE_INNER_ANGLE_IN_RADIANS_HANDLE;
	public static final VarHandle CONE_OUTER_ANGLE_IN_RADIANS_HANDLE;
	public static final VarHandle CONE_OUTER_GAIN_HANDLE;
	public static final VarHandle SPEED_OF_SOUND_HANDLE;

	public static final long CHANNELS_OUT_BYTE_OFFSET;
	public static final long P_CHANNEL_MAP_OUT_BYTE_OFFSET;
	public static final long HANDEDNESS_BYTE_OFFSET;
	public static final long CONE_INNER_ANGLE_IN_RADIANS_BYTE_OFFSET;
	public static final long CONE_OUTER_ANGLE_IN_RADIANS_BYTE_OFFSET;
	public static final long CONE_OUTER_GAIN_BYTE_OFFSET;
	public static final long SPEED_OF_SOUND_BYTE_OFFSET;
	public static final long WORLD_UP_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaVec3f worldUp;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("channelsOut"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pChannelMapOut"),
		    JAVA_INT.withName("handedness"),
		    JAVA_FLOAT.withName("coneInnerAngleInRadians"),
		    JAVA_FLOAT.withName("coneOuterAngleInRadians"),
		    JAVA_FLOAT.withName("coneOuterGain"),
		    JAVA_FLOAT.withName("speedOfSound"),
		    MaVec3f.LAYOUT.withName("worldUp")
		).withName("ma_spatializer_listener_config").withByteAlignment(8);
		
		CHANNELS_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelsOut"));
		P_CHANNEL_MAP_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pChannelMapOut"));
		HANDEDNESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("handedness"));
		CONE_INNER_ANGLE_IN_RADIANS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coneInnerAngleInRadians"));
		CONE_OUTER_ANGLE_IN_RADIANS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coneOuterAngleInRadians"));
		CONE_OUTER_GAIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coneOuterGain"));
		SPEED_OF_SOUND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("speedOfSound"));
		
		CHANNELS_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelsOut"));
		P_CHANNEL_MAP_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pChannelMapOut"));
		HANDEDNESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("handedness"));
		CONE_INNER_ANGLE_IN_RADIANS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coneInnerAngleInRadians"));
		CONE_OUTER_ANGLE_IN_RADIANS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coneOuterAngleInRadians"));
		CONE_OUTER_GAIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coneOuterGain"));
		SPEED_OF_SOUND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("speedOfSound"));
		WORLD_UP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("worldUp"));
		//@formatter:on
	}

	public MaSpatializerListenerConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaSpatializerListenerConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaSpatializerListenerConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    worldUp = new MaVec3f(segment.asSlice(WORLD_UP_BYTE_OFFSET, MaVec3f.LAYOUT));
	}

    /// @see #channelsOut()
    public MaSpatializerListenerConfig channelsOut(int channelsOut) {
    	CHANNELS_OUT_HANDLE.set(segment, 0L, channelsOut);
    	return this;
    }
    
    public int channelsOut() {
    	return (int) CHANNELS_OUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pChannelMapOut()
    public MaSpatializerListenerConfig pChannelMapOut(NativeByteArray pChannelMapOut) {
    	P_CHANNEL_MAP_OUT_HANDLE.set(segment, 0L, pChannelMapOut.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray pChannelMapOut() {
    	MemorySegment segment = (MemorySegment) P_CHANNEL_MAP_OUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #handedness()
    public MaSpatializerListenerConfig handedness(int handedness) {
    	HANDEDNESS_HANDLE.set(segment, 0L, handedness);
    	return this;
    }
    
    public int handedness() {
    	return (int) HANDEDNESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #coneInnerAngleInRadians()
    public MaSpatializerListenerConfig coneInnerAngleInRadians(float coneInnerAngleInRadians) {
    	CONE_INNER_ANGLE_IN_RADIANS_HANDLE.set(segment, 0L, coneInnerAngleInRadians);
    	return this;
    }
    
    public float coneInnerAngleInRadians() {
    	return (float) CONE_INNER_ANGLE_IN_RADIANS_HANDLE.get(segment, 0L);
    }
    
    /// @see #coneOuterAngleInRadians()
    public MaSpatializerListenerConfig coneOuterAngleInRadians(float coneOuterAngleInRadians) {
    	CONE_OUTER_ANGLE_IN_RADIANS_HANDLE.set(segment, 0L, coneOuterAngleInRadians);
    	return this;
    }
    
    public float coneOuterAngleInRadians() {
    	return (float) CONE_OUTER_ANGLE_IN_RADIANS_HANDLE.get(segment, 0L);
    }
    
    /// @see #coneOuterGain()
    public MaSpatializerListenerConfig coneOuterGain(float coneOuterGain) {
    	CONE_OUTER_GAIN_HANDLE.set(segment, 0L, coneOuterGain);
    	return this;
    }
    
    public float coneOuterGain() {
    	return (float) CONE_OUTER_GAIN_HANDLE.get(segment, 0L);
    }
    
    /// @see #speedOfSound()
    public MaSpatializerListenerConfig speedOfSound(float speedOfSound) {
    	SPEED_OF_SOUND_HANDLE.set(segment, 0L, speedOfSound);
    	return this;
    }
    
    public float speedOfSound() {
    	return (float) SPEED_OF_SOUND_HANDLE.get(segment, 0L);
    }
    
    /// @see #worldUp()
    public MaSpatializerListenerConfig worldUp(Consumer<MaVec3f> consumer) {
    	consumer.accept(worldUp);
    	return this;
    }
    
    /// @see #worldUp()
    public MaSpatializerListenerConfig worldUp(MaVec3f other) {
    	worldUp.set(other);
    	return this;
    }
    
    public MaVec3f worldUp() {
    	return worldUp;
    }
    
    @Override
    public MaSpatializerListenerConfig set(MaSpatializerListenerConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaSpatializerListenerConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaSpatializerListenerConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaSpatializerListenerConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaSpatializerListenerConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaSpatializerListenerConfig> array(SegmentAllocator allocator, MaSpatializerListenerConfig... structs) {
        NativeStructArray<MaSpatializerListenerConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaSpatializerListenerConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaSpatializerListenerConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaSpatializerListenerConfig(segment)
        );
    }

}