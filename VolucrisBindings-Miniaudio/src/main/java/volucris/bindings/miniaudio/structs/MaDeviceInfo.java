/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaDeviceInfo
		implements Struct<MaDeviceInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle NAME_HANDLE;
	public static final VarHandle IS_DEFAULT_HANDLE;
	public static final VarHandle NATIVE_DATA_FORMAT_COUNT_HANDLE;

	public static final long ID_BYTE_OFFSET;
	public static final long NAME_BYTE_OFFSET;
	public static final long IS_DEFAULT_BYTE_OFFSET;
	public static final long NATIVE_DATA_FORMAT_COUNT_BYTE_OFFSET;
	public static final long NATIVE_DATA_FORMATS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaDeviceId id;
	private final NativeDataFormats[] nativeDataFormats;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaDeviceId.LAYOUT.withName("id"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("name"),
		    JAVA_INT.withName("isDefault"),
		    JAVA_INT.withName("nativeDataFormatCount"),
		    NativeDataFormats.LAYOUT.withName("nativeDataFormats")
		).withName("ma_device_info").withByteAlignment(8);
		
		NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
		IS_DEFAULT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isDefault"));
		NATIVE_DATA_FORMAT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nativeDataFormatCount"));
		
		ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("id"));
		NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("name"));
		IS_DEFAULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isDefault"));
		NATIVE_DATA_FORMAT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nativeDataFormatCount"));
		NATIVE_DATA_FORMATS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nativeDataFormats"));
		//@formatter:on
	}

	public MaDeviceInfo() {
	    this(Arena.ofAuto());
	}
	
	public MaDeviceInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaDeviceInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    id = new MaDeviceId(segment.asSlice(ID_BYTE_OFFSET, MaDeviceId.LAYOUT));
	    nativeDataFormats = new NativeDataFormats[64];
	    for (int i = 0; i < 64; i++) {
	        long offset = NATIVE_DATA_FORMATS_BYTE_OFFSET + i * NativeDataFormats.LAYOUT.byteSize();
	        nativeDataFormats[i] = new NativeDataFormats(segment.asSlice(offset, NativeDataFormats.LAYOUT));
	    }
	}

    /// @see #id()
    public MaDeviceInfo id(Consumer<MaDeviceId> consumer) {
    	consumer.accept(id);
    	return this;
    }
    
    /// @see #id()
    public MaDeviceInfo id(MaDeviceId other) {
    	id.set(other);
    	return this;
    }
    
    public MaDeviceId id() {
    	return id;
    }
    
    /// @see #name(int)
    public MaDeviceInfo name(byte name, int index0) {
    	NAME_HANDLE.set(segment, 0L, index0, name);
    	return this;
    }
    
    public byte name(int index0) {
    	return (byte) NAME_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #isDefault()
    public MaDeviceInfo isDefault(int isDefault) {
    	IS_DEFAULT_HANDLE.set(segment, 0L, isDefault);
    	return this;
    }
    
    public int isDefault() {
    	return (int) IS_DEFAULT_HANDLE.get(segment, 0L);
    }
    
    /// @see #nativeDataFormatCount()
    public MaDeviceInfo nativeDataFormatCount(int nativeDataFormatCount) {
    	NATIVE_DATA_FORMAT_COUNT_HANDLE.set(segment, 0L, nativeDataFormatCount);
    	return this;
    }
    
    public int nativeDataFormatCount() {
    	return (int) NATIVE_DATA_FORMAT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #nativeDataFormats(int)
    public MaDeviceInfo nativeDataFormats(Consumer<NativeDataFormats> consumer, int index) {
    	consumer.accept(nativeDataFormats[index]);
    	return this;
    }
    
    /// @see #nativeDataFormats(int)
    public MaDeviceInfo nativeDataFormats(NativeDataFormats other, int index) {
    	nativeDataFormats[index].set(other);
    	return this;
    }
    
    public NativeDataFormats nativeDataFormats(int index) {
    	return nativeDataFormats[index];
    }
    
    @Override
    public MaDeviceInfo set(MaDeviceInfo other) {
        return set(other.segment);
    }
    
    @Override
    public MaDeviceInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDeviceInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDeviceInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDeviceInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDeviceInfo> array(Arena arena, MaDeviceInfo... structs) {
        NativeStructArray<MaDeviceInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDeviceInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDeviceInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDeviceInfo(segment)
        );
    }

	public static class NativeDataFormats implements Struct<NativeDataFormats> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle FORMAT_HANDLE;
		public static final VarHandle CHANNELS_HANDLE;
		public static final VarHandle SAMPLE_RATE_HANDLE;
		public static final VarHandle FLAGS_HANDLE;
	
		public static final long FORMAT_BYTE_OFFSET;
		public static final long CHANNELS_BYTE_OFFSET;
		public static final long SAMPLE_RATE_BYTE_OFFSET;
		public static final long FLAGS_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    JAVA_INT.withName("format"),
			    JAVA_INT.withName("channels"),
			    JAVA_INT.withName("sampleRate"),
			    JAVA_INT.withName("flags")
			).withName("NativeDataFormats").withByteAlignment(4);
			
			FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
			CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
			SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
			FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
			
			FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
			CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
			SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
			FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
			//@formatter:on
		}
	
		public NativeDataFormats() {
		    this(Arena.ofAuto());
		}
		
		public NativeDataFormats(Arena arena) {
		    this(arena.allocate(LAYOUT));
		}
		
		public NativeDataFormats(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #format()
	    public NativeDataFormats format(int format) {
	    	FORMAT_HANDLE.set(segment, 0L, format);
	    	return this;
	    }
	    
	    public int format() {
	    	return (int) FORMAT_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #channels()
	    public NativeDataFormats channels(int channels) {
	    	CHANNELS_HANDLE.set(segment, 0L, channels);
	    	return this;
	    }
	    
	    public int channels() {
	    	return (int) CHANNELS_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #sampleRate()
	    public NativeDataFormats sampleRate(int sampleRate) {
	    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
	    	return this;
	    }
	    
	    public int sampleRate() {
	    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #flags()
	    public NativeDataFormats flags(int flags) {
	    	FLAGS_HANDLE.set(segment, 0L, flags);
	    	return this;
	    }
	    
	    public int flags() {
	    	return (int) FLAGS_HANDLE.get(segment, 0L);
	    }
	    
	    @Override
	    public NativeDataFormats set(NativeDataFormats other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public NativeDataFormats set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<NativeDataFormats> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<NativeDataFormats> array(Arena arena, int count) {
	        return new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new NativeDataFormats(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<NativeDataFormats> array(Arena arena, NativeDataFormats... structs) {
	        NativeStructArray<NativeDataFormats> array = new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new NativeDataFormats(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<NativeDataFormats> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new NativeDataFormats(segment)
	        );
	    }
	
	}
}