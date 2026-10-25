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

public final class MaDelayConfig
		implements Struct<MaDelayConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle DELAY_IN_FRAMES_HANDLE;
	public static final VarHandle DELAY_START_HANDLE;
	public static final VarHandle WET_HANDLE;
	public static final VarHandle DRY_HANDLE;
	public static final VarHandle DECAY_HANDLE;

	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long DELAY_IN_FRAMES_BYTE_OFFSET;
	public static final long DELAY_START_BYTE_OFFSET;
	public static final long WET_BYTE_OFFSET;
	public static final long DRY_BYTE_OFFSET;
	public static final long DECAY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("sampleRate"),
		    JAVA_INT.withName("delayInFrames"),
		    JAVA_INT.withName("delayStart"),
		    JAVA_FLOAT.withName("wet"),
		    JAVA_FLOAT.withName("dry"),
		    JAVA_FLOAT.withName("decay")
		).withName("ma_delay_config").withByteAlignment(4);
		
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		DELAY_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delayInFrames"));
		DELAY_START_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delayStart"));
		WET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("wet"));
		DRY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dry"));
		DECAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("decay"));
		
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		DELAY_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delayInFrames"));
		DELAY_START_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delayStart"));
		WET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wet"));
		DRY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dry"));
		DECAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("decay"));
		//@formatter:on
	}

	public MaDelayConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaDelayConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaDelayConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #channels()
    public MaDelayConfig channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaDelayConfig sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #delayInFrames()
    public MaDelayConfig delayInFrames(int delayInFrames) {
    	DELAY_IN_FRAMES_HANDLE.set(segment, 0L, delayInFrames);
    	return this;
    }
    
    public int delayInFrames() {
    	return (int) DELAY_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #delayStart()
    public MaDelayConfig delayStart(int delayStart) {
    	DELAY_START_HANDLE.set(segment, 0L, delayStart);
    	return this;
    }
    
    public int delayStart() {
    	return (int) DELAY_START_HANDLE.get(segment, 0L);
    }
    
    /// @see #wet()
    public MaDelayConfig wet(float wet) {
    	WET_HANDLE.set(segment, 0L, wet);
    	return this;
    }
    
    public float wet() {
    	return (float) WET_HANDLE.get(segment, 0L);
    }
    
    /// @see #dry()
    public MaDelayConfig dry(float dry) {
    	DRY_HANDLE.set(segment, 0L, dry);
    	return this;
    }
    
    public float dry() {
    	return (float) DRY_HANDLE.get(segment, 0L);
    }
    
    /// @see #decay()
    public MaDelayConfig decay(float decay) {
    	DECAY_HANDLE.set(segment, 0L, decay);
    	return this;
    }
    
    public float decay() {
    	return (float) DECAY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaDelayConfig set(MaDelayConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaDelayConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDelayConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDelayConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDelayConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDelayConfig> array(SegmentAllocator allocator, MaDelayConfig... structs) {
        NativeStructArray<MaDelayConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDelayConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDelayConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDelayConfig(segment)
        );
    }

}