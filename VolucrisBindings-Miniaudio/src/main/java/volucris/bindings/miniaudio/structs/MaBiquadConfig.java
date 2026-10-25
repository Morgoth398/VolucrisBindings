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

public final class MaBiquadConfig
		implements Struct<MaBiquadConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle B0_HANDLE;
	public static final VarHandle B1_HANDLE;
	public static final VarHandle B2_HANDLE;
	public static final VarHandle A0_HANDLE;
	public static final VarHandle A1_HANDLE;
	public static final VarHandle A2_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long B0_BYTE_OFFSET;
	public static final long B1_BYTE_OFFSET;
	public static final long B2_BYTE_OFFSET;
	public static final long A0_BYTE_OFFSET;
	public static final long A1_BYTE_OFFSET;
	public static final long A2_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_DOUBLE.withName("b0"),
		    JAVA_DOUBLE.withName("b1"),
		    JAVA_DOUBLE.withName("b2"),
		    JAVA_DOUBLE.withName("a0"),
		    JAVA_DOUBLE.withName("a1"),
		    JAVA_DOUBLE.withName("a2")
		).withName("ma_biquad_config").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		B0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b0"));
		B1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b1"));
		B2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b2"));
		A0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("a0"));
		A1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("a1"));
		A2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("a2"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		B0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b0"));
		B1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b1"));
		B2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b2"));
		A0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a0"));
		A1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a1"));
		A2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a2"));
		//@formatter:on
	}

	public MaBiquadConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaBiquadConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaBiquadConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #format()
    public MaBiquadConfig format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaBiquadConfig channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #b0()
    public MaBiquadConfig b0(double b0) {
    	B0_HANDLE.set(segment, 0L, b0);
    	return this;
    }
    
    public double b0() {
    	return (double) B0_HANDLE.get(segment, 0L);
    }
    
    /// @see #b1()
    public MaBiquadConfig b1(double b1) {
    	B1_HANDLE.set(segment, 0L, b1);
    	return this;
    }
    
    public double b1() {
    	return (double) B1_HANDLE.get(segment, 0L);
    }
    
    /// @see #b2()
    public MaBiquadConfig b2(double b2) {
    	B2_HANDLE.set(segment, 0L, b2);
    	return this;
    }
    
    public double b2() {
    	return (double) B2_HANDLE.get(segment, 0L);
    }
    
    /// @see #a0()
    public MaBiquadConfig a0(double a0) {
    	A0_HANDLE.set(segment, 0L, a0);
    	return this;
    }
    
    public double a0() {
    	return (double) A0_HANDLE.get(segment, 0L);
    }
    
    /// @see #a1()
    public MaBiquadConfig a1(double a1) {
    	A1_HANDLE.set(segment, 0L, a1);
    	return this;
    }
    
    public double a1() {
    	return (double) A1_HANDLE.get(segment, 0L);
    }
    
    /// @see #a2()
    public MaBiquadConfig a2(double a2) {
    	A2_HANDLE.set(segment, 0L, a2);
    	return this;
    }
    
    public double a2() {
    	return (double) A2_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaBiquadConfig set(MaBiquadConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaBiquadConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaBiquadConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaBiquadConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaBiquadConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaBiquadConfig> array(SegmentAllocator allocator, MaBiquadConfig... structs) {
        NativeStructArray<MaBiquadConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaBiquadConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaBiquadConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaBiquadConfig(segment)
        );
    }

}