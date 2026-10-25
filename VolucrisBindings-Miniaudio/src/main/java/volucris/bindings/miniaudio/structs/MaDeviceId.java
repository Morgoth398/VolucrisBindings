/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaDeviceId
		implements Struct<MaDeviceId> {

	public static final UnionLayout LAYOUT;

	public static final VarHandle WASAPI_HANDLE;
	public static final VarHandle DSOUND_HANDLE;
	public static final VarHandle WINMM_HANDLE;
	public static final VarHandle ALSA_HANDLE;
	public static final VarHandle PULSE_HANDLE;
	public static final VarHandle JACK_HANDLE;
	public static final VarHandle COREAUDIO_HANDLE;
	public static final VarHandle SNDIO_HANDLE;
	public static final VarHandle AUDIO4_HANDLE;
	public static final VarHandle OSS_HANDLE;
	public static final VarHandle AAUDIO_HANDLE;
	public static final VarHandle OPENSL_HANDLE;
	public static final VarHandle WEBAUDIO_HANDLE;
	public static final VarHandle NULLBACKEND_HANDLE;

	public static final long WASAPI_BYTE_OFFSET;
	public static final long DSOUND_BYTE_OFFSET;
	public static final long WINMM_BYTE_OFFSET;
	public static final long ALSA_BYTE_OFFSET;
	public static final long PULSE_BYTE_OFFSET;
	public static final long JACK_BYTE_OFFSET;
	public static final long COREAUDIO_BYTE_OFFSET;
	public static final long SNDIO_BYTE_OFFSET;
	public static final long AUDIO4_BYTE_OFFSET;
	public static final long OSS_BYTE_OFFSET;
	public static final long AAUDIO_BYTE_OFFSET;
	public static final long OPENSL_BYTE_OFFSET;
	public static final long WEBAUDIO_BYTE_OFFSET;
	public static final long CUSTOM_BYTE_OFFSET;
	public static final long NULLBACKEND_BYTE_OFFSET;

	private final MemorySegment segment;

	private final Custom custom;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.unionLayout(
		    MemoryLayout.sequenceLayout(64, JAVA_SHORT).withName("wasapi"),
		    MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("dsound"),
		    JAVA_INT.withName("winmm"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("alsa"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("pulse"),
		    JAVA_INT.withName("jack"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("coreaudio"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("sndio"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("audio4"),
		    MemoryLayout.sequenceLayout(64, JAVA_BYTE).withName("oss"),
		    JAVA_INT.withName("aaudio"),
		    JAVA_INT.withName("opensl"),
		    MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("webaudio"),
		    Custom.LAYOUT.withName("custom"),
		    JAVA_INT.withName("nullbackend")
		).withName("ma_device_id").withByteAlignment(8);
		
		WASAPI_HANDLE = LAYOUT.varHandle(PathElement.groupElement("wasapi"), PathElement.sequenceElement());
		DSOUND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dsound"), PathElement.sequenceElement());
		WINMM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("winmm"));
		ALSA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("alsa"), PathElement.sequenceElement());
		PULSE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pulse"), PathElement.sequenceElement());
		JACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack"));
		COREAUDIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coreaudio"), PathElement.sequenceElement());
		SNDIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sndio"), PathElement.sequenceElement());
		AUDIO4_HANDLE = LAYOUT.varHandle(PathElement.groupElement("audio4"), PathElement.sequenceElement());
		OSS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("oss"), PathElement.sequenceElement());
		AAUDIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("aaudio"));
		OPENSL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("opensl"));
		WEBAUDIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("webaudio"), PathElement.sequenceElement());
		NULLBACKEND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nullbackend"));
		
		WASAPI_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wasapi"));
		DSOUND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dsound"));
		WINMM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("winmm"));
		ALSA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("alsa"));
		PULSE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pulse"));
		JACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack"));
		COREAUDIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coreaudio"));
		SNDIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sndio"));
		AUDIO4_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("audio4"));
		OSS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("oss"));
		AAUDIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aaudio"));
		OPENSL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("opensl"));
		WEBAUDIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("webaudio"));
		CUSTOM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("custom"));
		NULLBACKEND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nullbackend"));
		//@formatter:on
	}

	public MaDeviceId() {
	    this(Arena.ofAuto());
	}
	
	public MaDeviceId(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaDeviceId(MemorySegment segment) {
	    this.segment = segment;
	
	    custom = new Custom(segment.asSlice(CUSTOM_BYTE_OFFSET, Custom.LAYOUT));
	}

    /// @see #wasapi(int)
    public MaDeviceId wasapi(short wasapi, int index0) {
    	WASAPI_HANDLE.set(segment, 0L, index0, wasapi);
    	return this;
    }
    
    public short wasapi(int index0) {
    	return (short) WASAPI_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #dsound(int)
    public MaDeviceId dsound(byte dsound, int index0) {
    	DSOUND_HANDLE.set(segment, 0L, index0, dsound);
    	return this;
    }
    
    public byte dsound(int index0) {
    	return (byte) DSOUND_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #winmm()
    public MaDeviceId winmm(int winmm) {
    	WINMM_HANDLE.set(segment, 0L, winmm);
    	return this;
    }
    
    public int winmm() {
    	return (int) WINMM_HANDLE.get(segment, 0L);
    }
    
    /// @see #alsa(int)
    public MaDeviceId alsa(byte alsa, int index0) {
    	ALSA_HANDLE.set(segment, 0L, index0, alsa);
    	return this;
    }
    
    public byte alsa(int index0) {
    	return (byte) ALSA_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #pulse(int)
    public MaDeviceId pulse(byte pulse, int index0) {
    	PULSE_HANDLE.set(segment, 0L, index0, pulse);
    	return this;
    }
    
    public byte pulse(int index0) {
    	return (byte) PULSE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #jack()
    public MaDeviceId jack(int jack) {
    	JACK_HANDLE.set(segment, 0L, jack);
    	return this;
    }
    
    public int jack() {
    	return (int) JACK_HANDLE.get(segment, 0L);
    }
    
    /// @see #coreaudio(int)
    public MaDeviceId coreaudio(byte coreaudio, int index0) {
    	COREAUDIO_HANDLE.set(segment, 0L, index0, coreaudio);
    	return this;
    }
    
    public byte coreaudio(int index0) {
    	return (byte) COREAUDIO_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #sndio(int)
    public MaDeviceId sndio(byte sndio, int index0) {
    	SNDIO_HANDLE.set(segment, 0L, index0, sndio);
    	return this;
    }
    
    public byte sndio(int index0) {
    	return (byte) SNDIO_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #audio4(int)
    public MaDeviceId audio4(byte audio4, int index0) {
    	AUDIO4_HANDLE.set(segment, 0L, index0, audio4);
    	return this;
    }
    
    public byte audio4(int index0) {
    	return (byte) AUDIO4_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #oss(int)
    public MaDeviceId oss(byte oss, int index0) {
    	OSS_HANDLE.set(segment, 0L, index0, oss);
    	return this;
    }
    
    public byte oss(int index0) {
    	return (byte) OSS_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #aaudio()
    public MaDeviceId aaudio(int aaudio) {
    	AAUDIO_HANDLE.set(segment, 0L, aaudio);
    	return this;
    }
    
    public int aaudio() {
    	return (int) AAUDIO_HANDLE.get(segment, 0L);
    }
    
    /// @see #opensl()
    public MaDeviceId opensl(int opensl) {
    	OPENSL_HANDLE.set(segment, 0L, opensl);
    	return this;
    }
    
    public int opensl() {
    	return (int) OPENSL_HANDLE.get(segment, 0L);
    }
    
    /// @see #webaudio(int)
    public MaDeviceId webaudio(byte webaudio, int index0) {
    	WEBAUDIO_HANDLE.set(segment, 0L, index0, webaudio);
    	return this;
    }
    
    public byte webaudio(int index0) {
    	return (byte) WEBAUDIO_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #custom()
    public MaDeviceId custom(Consumer<Custom> consumer) {
    	consumer.accept(custom);
    	return this;
    }
    
    /// @see #custom()
    public MaDeviceId custom(Custom other) {
    	custom.set(other);
    	return this;
    }
    
    public Custom custom() {
    	return custom;
    }
    
    /// @see #nullbackend()
    public MaDeviceId nullbackend(int nullbackend) {
    	NULLBACKEND_HANDLE.set(segment, 0L, nullbackend);
    	return this;
    }
    
    public int nullbackend() {
    	return (int) NULLBACKEND_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaDeviceId set(MaDeviceId other) {
        return set(other.segment);
    }
    
    @Override
    public MaDeviceId set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDeviceId> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDeviceId> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDeviceId(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDeviceId> array(SegmentAllocator allocator, MaDeviceId... structs) {
        NativeStructArray<MaDeviceId> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDeviceId(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDeviceId> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDeviceId(segment)
        );
    }

	public static class Custom implements Struct<Custom> {
	
		public static final UnionLayout LAYOUT;
	
		public static final VarHandle I_HANDLE;
		public static final VarHandle S_HANDLE;
		public static final VarHandle P_HANDLE;
	
		public static final long I_BYTE_OFFSET;
		public static final long S_BYTE_OFFSET;
		public static final long P_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.unionLayout(
			    JAVA_INT.withName("i"),
			    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("s"),
			    UNBOUNDED_ADDRESS.withName("p")
			).withName("Custom").withByteAlignment(8);
			
			I_HANDLE = LAYOUT.varHandle(PathElement.groupElement("i"));
			S_HANDLE = LAYOUT.varHandle(PathElement.groupElement("s"), PathElement.sequenceElement());
			P_HANDLE = LAYOUT.varHandle(PathElement.groupElement("p"));
			
			I_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("i"));
			S_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("s"));
			P_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("p"));
			//@formatter:on
		}
	
		public Custom() {
		    this(Arena.ofAuto());
		}
		
		public Custom(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Custom(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #i()
	    public Custom i(int i) {
	    	I_HANDLE.set(segment, 0L, i);
	    	return this;
	    }
	    
	    public int i() {
	    	return (int) I_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #s(int)
	    public Custom s(byte s, int index0) {
	    	S_HANDLE.set(segment, 0L, index0, s);
	    	return this;
	    }
	    
	    public byte s(int index0) {
	    	return (byte) S_HANDLE.get(segment, 0L, index0);
	    }
	    
	    /// @see #p()
	    public Custom p(MemorySegment p) {
	    	P_HANDLE.set(segment, 0L, p);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment p() {
	    	MemorySegment segment = (MemorySegment) P_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    @Override
	    public Custom set(Custom other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Custom set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Custom> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Custom> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Custom(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Custom> array(SegmentAllocator allocator, Custom... structs) {
	        NativeStructArray<Custom> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Custom(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Custom> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Custom(segment)
	        );
	    }
	
	}
}