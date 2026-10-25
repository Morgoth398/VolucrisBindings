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

public final class MaGainerConfig
		implements Struct<MaGainerConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SMOOTH_TIME_IN_FRAMES_HANDLE;

	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SMOOTH_TIME_IN_FRAMES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("smoothTimeInFrames")
		).withName("ma_gainer_config").withByteAlignment(4);
		
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SMOOTH_TIME_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("smoothTimeInFrames"));
		
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SMOOTH_TIME_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("smoothTimeInFrames"));
		//@formatter:on
	}

	public MaGainerConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaGainerConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaGainerConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #channels()
    public MaGainerConfig channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #smoothTimeInFrames()
    public MaGainerConfig smoothTimeInFrames(int smoothTimeInFrames) {
    	SMOOTH_TIME_IN_FRAMES_HANDLE.set(segment, 0L, smoothTimeInFrames);
    	return this;
    }
    
    public int smoothTimeInFrames() {
    	return (int) SMOOTH_TIME_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaGainerConfig set(MaGainerConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaGainerConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaGainerConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaGainerConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaGainerConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaGainerConfig> array(SegmentAllocator allocator, MaGainerConfig... structs) {
        NativeStructArray<MaGainerConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaGainerConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaGainerConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaGainerConfig(segment)
        );
    }

}