/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaPannerConfig
		implements Struct<MaPannerConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle MODE_HANDLE;
	public static final VarHandle PAN_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long MODE_BYTE_OFFSET;
	public static final long PAN_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("mode"),
		    JAVA_FLOAT.withName("pan")
		).withName("ma_panner_config").withByteAlignment(4);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mode"));
		PAN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pan"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mode"));
		PAN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pan"));
		//@formatter:on
	}

	public MaPannerConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaPannerConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaPannerConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #format()
    public MaPannerConfig format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaPannerConfig channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mode()
    public MaPannerConfig mode(int mode) {
    	MODE_HANDLE.set(segment, 0L, mode);
    	return this;
    }
    
    public int mode() {
    	return (int) MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pan()
    public MaPannerConfig pan(float pan) {
    	PAN_HANDLE.set(segment, 0L, pan);
    	return this;
    }
    
    public float pan() {
    	return (float) PAN_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaPannerConfig set(MaPannerConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaPannerConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaPannerConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaPannerConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaPannerConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaPannerConfig> array(Arena arena, MaPannerConfig... structs) {
        NativeStructArray<MaPannerConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaPannerConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaPannerConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaPannerConfig(segment)
        );
    }

}