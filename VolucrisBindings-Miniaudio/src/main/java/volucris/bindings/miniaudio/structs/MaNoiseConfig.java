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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaNoiseConfig
		implements Struct<MaNoiseConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle TYPE_HANDLE;
	public static final VarHandle SEED_HANDLE;
	public static final VarHandle AMPLITUDE_HANDLE;
	public static final VarHandle DUPLICATE_CHANNELS_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long TYPE_BYTE_OFFSET;
	public static final long SEED_BYTE_OFFSET;
	public static final long AMPLITUDE_BYTE_OFFSET;
	public static final long DUPLICATE_CHANNELS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("type"),
		    JAVA_INT.withName("seed"),
		    JAVA_DOUBLE.withName("amplitude"),
		    JAVA_INT.withName("duplicateChannels"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_noise_config").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
		SEED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("seed"));
		AMPLITUDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("amplitude"));
		DUPLICATE_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("duplicateChannels"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
		SEED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seed"));
		AMPLITUDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("amplitude"));
		DUPLICATE_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("duplicateChannels"));
		//@formatter:on
	}

	public MaNoiseConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaNoiseConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaNoiseConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #format()
    public MaNoiseConfig format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaNoiseConfig channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #type()
    public MaNoiseConfig type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #seed()
    public MaNoiseConfig seed(int seed) {
    	SEED_HANDLE.set(segment, 0L, seed);
    	return this;
    }
    
    public int seed() {
    	return (int) SEED_HANDLE.get(segment, 0L);
    }
    
    /// @see #amplitude()
    public MaNoiseConfig amplitude(double amplitude) {
    	AMPLITUDE_HANDLE.set(segment, 0L, amplitude);
    	return this;
    }
    
    public double amplitude() {
    	return (double) AMPLITUDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #duplicateChannels()
    public MaNoiseConfig duplicateChannels(int duplicateChannels) {
    	DUPLICATE_CHANNELS_HANDLE.set(segment, 0L, duplicateChannels);
    	return this;
    }
    
    public int duplicateChannels() {
    	return (int) DUPLICATE_CHANNELS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaNoiseConfig set(MaNoiseConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaNoiseConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaNoiseConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaNoiseConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaNoiseConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaNoiseConfig> array(SegmentAllocator allocator, MaNoiseConfig... structs) {
        NativeStructArray<MaNoiseConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaNoiseConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaNoiseConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaNoiseConfig(segment)
        );
    }

}