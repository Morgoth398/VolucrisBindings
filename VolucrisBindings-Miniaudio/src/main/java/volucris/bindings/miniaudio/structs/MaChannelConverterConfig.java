/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaChannelConverterConfig
		implements Struct<MaChannelConverterConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_IN_HANDLE;
	public static final VarHandle CHANNELS_OUT_HANDLE;
	public static final VarHandle P_CHANNEL_MAP_IN_HANDLE;
	public static final VarHandle P_CHANNEL_MAP_OUT_HANDLE;
	public static final VarHandle MIXING_MODE_HANDLE;
	public static final VarHandle CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE;
	public static final VarHandle PP_WEIGHTS_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_IN_BYTE_OFFSET;
	public static final long CHANNELS_OUT_BYTE_OFFSET;
	public static final long P_CHANNEL_MAP_IN_BYTE_OFFSET;
	public static final long P_CHANNEL_MAP_OUT_BYTE_OFFSET;
	public static final long MIXING_MODE_BYTE_OFFSET;
	public static final long CALCULATE_LFEFROM_SPATIAL_CHANNELS_BYTE_OFFSET;
	public static final long PP_WEIGHTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channelsIn"),
		    JAVA_INT.withName("channelsOut"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pChannelMapIn"),
		    UNBOUNDED_ADDRESS.withName("pChannelMapOut"),
		    JAVA_INT.withName("mixingMode"),
		    JAVA_INT.withName("calculateLFEFromSpatialChannels"),
		    UNBOUNDED_ADDRESS.withName("ppWeights")
		).withName("ma_channel_converter_config").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelsIn"));
		CHANNELS_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelsOut"));
		P_CHANNEL_MAP_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pChannelMapIn"));
		P_CHANNEL_MAP_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pChannelMapOut"));
		MIXING_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mixingMode"));
		CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("calculateLFEFromSpatialChannels"));
		PP_WEIGHTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ppWeights"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelsIn"));
		CHANNELS_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelsOut"));
		P_CHANNEL_MAP_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pChannelMapIn"));
		P_CHANNEL_MAP_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pChannelMapOut"));
		MIXING_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mixingMode"));
		CALCULATE_LFEFROM_SPATIAL_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("calculateLFEFromSpatialChannels"));
		PP_WEIGHTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ppWeights"));
		//@formatter:on
	}

	public MaChannelConverterConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaChannelConverterConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaChannelConverterConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #format()
    public MaChannelConverterConfig format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channelsIn()
    public MaChannelConverterConfig channelsIn(int channelsIn) {
    	CHANNELS_IN_HANDLE.set(segment, 0L, channelsIn);
    	return this;
    }
    
    public int channelsIn() {
    	return (int) CHANNELS_IN_HANDLE.get(segment, 0L);
    }
    
    /// @see #channelsOut()
    public MaChannelConverterConfig channelsOut(int channelsOut) {
    	CHANNELS_OUT_HANDLE.set(segment, 0L, channelsOut);
    	return this;
    }
    
    public int channelsOut() {
    	return (int) CHANNELS_OUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pChannelMapIn()
    public MaChannelConverterConfig pChannelMapIn(NativeByteArray pChannelMapIn) {
    	P_CHANNEL_MAP_IN_HANDLE.set(segment, 0L, pChannelMapIn.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray pChannelMapIn() {
    	MemorySegment segment = (MemorySegment) P_CHANNEL_MAP_IN_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #pChannelMapOut()
    public MaChannelConverterConfig pChannelMapOut(NativeByteArray pChannelMapOut) {
    	P_CHANNEL_MAP_OUT_HANDLE.set(segment, 0L, pChannelMapOut.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray pChannelMapOut() {
    	MemorySegment segment = (MemorySegment) P_CHANNEL_MAP_OUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #mixingMode()
    public MaChannelConverterConfig mixingMode(int mixingMode) {
    	MIXING_MODE_HANDLE.set(segment, 0L, mixingMode);
    	return this;
    }
    
    public int mixingMode() {
    	return (int) MIXING_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #calculateLFEFromSpatialChannels()
    public MaChannelConverterConfig calculateLFEFromSpatialChannels(int calculateLFEFromSpatialChannels) {
    	CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE.set(segment, 0L, calculateLFEFromSpatialChannels);
    	return this;
    }
    
    public int calculateLFEFromSpatialChannels() {
    	return (int) CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #ppWeights()
    public MaChannelConverterConfig ppWeights(NativePointerArray ppWeights) {
    	PP_WEIGHTS_HANDLE.set(segment, 0L, ppWeights.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray ppWeights() {
    	MemorySegment segment = (MemorySegment) PP_WEIGHTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public MaChannelConverterConfig set(MaChannelConverterConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaChannelConverterConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaChannelConverterConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaChannelConverterConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaChannelConverterConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaChannelConverterConfig> array(Arena arena, MaChannelConverterConfig... structs) {
        NativeStructArray<MaChannelConverterConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaChannelConverterConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaChannelConverterConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaChannelConverterConfig(segment)
        );
    }

}