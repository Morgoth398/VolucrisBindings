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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaFader
		implements Struct<MaFader> {

	public static final StructLayout LAYOUT;

	public static final VarHandle VOLUME_BEG_HANDLE;
	public static final VarHandle VOLUME_END_HANDLE;
	public static final VarHandle LENGTH_IN_FRAMES_HANDLE;
	public static final VarHandle CURSOR_IN_FRAMES_HANDLE;

	public static final long CONFIG_BYTE_OFFSET;
	public static final long VOLUME_BEG_BYTE_OFFSET;
	public static final long VOLUME_END_BYTE_OFFSET;
	public static final long LENGTH_IN_FRAMES_BYTE_OFFSET;
	public static final long CURSOR_IN_FRAMES_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaFaderConfig config;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaFaderConfig.LAYOUT.withName("config"),
		    JAVA_FLOAT.withName("volumeBeg"),
		    JAVA_FLOAT.withName("volumeEnd"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("lengthInFrames"),
		    JAVA_LONG.withName("cursorInFrames")
		).withName("ma_fader").withByteAlignment(8);
		
		VOLUME_BEG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("volumeBeg"));
		VOLUME_END_HANDLE = LAYOUT.varHandle(PathElement.groupElement("volumeEnd"));
		LENGTH_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lengthInFrames"));
		CURSOR_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cursorInFrames"));
		
		CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("config"));
		VOLUME_BEG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("volumeBeg"));
		VOLUME_END_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("volumeEnd"));
		LENGTH_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lengthInFrames"));
		CURSOR_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cursorInFrames"));
		//@formatter:on
	}

	public MaFader() {
	    this(Arena.ofAuto());
	}
	
	public MaFader(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaFader(MemorySegment segment) {
	    this.segment = segment;
	
	    config = new MaFaderConfig(segment.asSlice(CONFIG_BYTE_OFFSET, MaFaderConfig.LAYOUT));
	}

    /// @see #config()
    public MaFader config(Consumer<MaFaderConfig> consumer) {
    	consumer.accept(config);
    	return this;
    }
    
    /// @see #config()
    public MaFader config(MaFaderConfig other) {
    	config.set(other);
    	return this;
    }
    
    public MaFaderConfig config() {
    	return config;
    }
    
    /// @see #volumeBeg()
    public MaFader volumeBeg(float volumeBeg) {
    	VOLUME_BEG_HANDLE.set(segment, 0L, volumeBeg);
    	return this;
    }
    
    public float volumeBeg() {
    	return (float) VOLUME_BEG_HANDLE.get(segment, 0L);
    }
    
    /// @see #volumeEnd()
    public MaFader volumeEnd(float volumeEnd) {
    	VOLUME_END_HANDLE.set(segment, 0L, volumeEnd);
    	return this;
    }
    
    public float volumeEnd() {
    	return (float) VOLUME_END_HANDLE.get(segment, 0L);
    }
    
    /// @see #lengthInFrames()
    public MaFader lengthInFrames(long lengthInFrames) {
    	LENGTH_IN_FRAMES_HANDLE.set(segment, 0L, lengthInFrames);
    	return this;
    }
    
    public long lengthInFrames() {
    	return (long) LENGTH_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #cursorInFrames()
    public MaFader cursorInFrames(long cursorInFrames) {
    	CURSOR_IN_FRAMES_HANDLE.set(segment, 0L, cursorInFrames);
    	return this;
    }
    
    public long cursorInFrames() {
    	return (long) CURSOR_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaFader set(MaFader other) {
        return set(other.segment);
    }
    
    @Override
    public MaFader set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaFader> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaFader> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaFader(segment),
            count
        );
    }
    
    public static NativeStructArray<MaFader> array(SegmentAllocator allocator, MaFader... structs) {
        NativeStructArray<MaFader> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaFader(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaFader> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaFader(segment)
        );
    }

}