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

public final class MaPanner
		implements Struct<MaPanner> {

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
		).withName("ma_panner").withByteAlignment(4);
		
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

	public MaPanner() {
	    this(Arena.ofAuto());
	}
	
	public MaPanner(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaPanner(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #format()
    public MaPanner format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaPanner channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mode()
    public MaPanner mode(int mode) {
    	MODE_HANDLE.set(segment, 0L, mode);
    	return this;
    }
    
    public int mode() {
    	return (int) MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pan()
    public MaPanner pan(float pan) {
    	PAN_HANDLE.set(segment, 0L, pan);
    	return this;
    }
    
    public float pan() {
    	return (float) PAN_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaPanner set(MaPanner other) {
        return set(other.segment);
    }
    
    @Override
    public MaPanner set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaPanner> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaPanner> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaPanner(segment),
            count
        );
    }
    
    public static NativeStructArray<MaPanner> array(SegmentAllocator allocator, MaPanner... structs) {
        NativeStructArray<MaPanner> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaPanner(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaPanner> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaPanner(segment)
        );
    }

}