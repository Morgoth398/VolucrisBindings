/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaDecoder
		implements Struct<MaDecoder> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_BACKEND_HANDLE;
	public static final VarHandle P_BACKEND_VTABLE_HANDLE;
	public static final VarHandle P_BACKEND_USER_DATA_HANDLE;
	public static final VarHandle ON_READ_HANDLE;
	public static final VarHandle ON_SEEK_HANDLE;
	public static final VarHandle ON_TELL_HANDLE;
	public static final VarHandle P_USER_DATA_HANDLE;
	public static final VarHandle READ_POINTER_IN_PCMFRAMES_HANDLE;
	public static final VarHandle OUTPUT_FORMAT_HANDLE;
	public static final VarHandle OUTPUT_CHANNELS_HANDLE;
	public static final VarHandle OUTPUT_SAMPLE_RATE_HANDLE;
	public static final VarHandle P_INPUT_CACHE_HANDLE;
	public static final VarHandle INPUT_CACHE_CAP_HANDLE;
	public static final VarHandle INPUT_CACHE_CONSUMED_HANDLE;
	public static final VarHandle INPUT_CACHE_REMAINING_HANDLE;

	public static final long DS_BYTE_OFFSET;
	public static final long P_BACKEND_BYTE_OFFSET;
	public static final long P_BACKEND_VTABLE_BYTE_OFFSET;
	public static final long P_BACKEND_USER_DATA_BYTE_OFFSET;
	public static final long ON_READ_BYTE_OFFSET;
	public static final long ON_SEEK_BYTE_OFFSET;
	public static final long ON_TELL_BYTE_OFFSET;
	public static final long P_USER_DATA_BYTE_OFFSET;
	public static final long READ_POINTER_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long OUTPUT_FORMAT_BYTE_OFFSET;
	public static final long OUTPUT_CHANNELS_BYTE_OFFSET;
	public static final long OUTPUT_SAMPLE_RATE_BYTE_OFFSET;
	public static final long CONVERTER_BYTE_OFFSET;
	public static final long P_INPUT_CACHE_BYTE_OFFSET;
	public static final long INPUT_CACHE_CAP_BYTE_OFFSET;
	public static final long INPUT_CACHE_CONSUMED_BYTE_OFFSET;
	public static final long INPUT_CACHE_REMAINING_BYTE_OFFSET;
	public static final long ALLOCATION_CALLBACKS_BYTE_OFFSET;
	public static final long DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaDataSourceBase ds;
	private final MaDataConverter converter;
	private final MaAllocationCallbacks allocationCallbacks;
	private final Data data;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaDataSourceBase.LAYOUT.withName("ds"),
		    UNBOUNDED_ADDRESS.withName("pBackend"),
		    UNBOUNDED_ADDRESS.withName("pBackendVTable"),
		    UNBOUNDED_ADDRESS.withName("pBackendUserData"),
		    UNBOUNDED_ADDRESS.withName("onRead"),
		    UNBOUNDED_ADDRESS.withName("onSeek"),
		    UNBOUNDED_ADDRESS.withName("onTell"),
		    UNBOUNDED_ADDRESS.withName("pUserData"),
		    JAVA_LONG.withName("readPointerInPCMFrames"),
		    JAVA_INT.withName("outputFormat"),
		    JAVA_INT.withName("outputChannels"),
		    JAVA_INT.withName("outputSampleRate"),
		    MemoryLayout.paddingLayout(4),
		    MaDataConverter.LAYOUT.withName("converter"),
		    UNBOUNDED_ADDRESS.withName("pInputCache"),
		    JAVA_LONG.withName("inputCacheCap"),
		    JAVA_LONG.withName("inputCacheConsumed"),
		    JAVA_LONG.withName("inputCacheRemaining"),
		    MaAllocationCallbacks.LAYOUT.withName("allocationCallbacks"),
		    Data.LAYOUT.withName("data")
		).withName("ma_decoder").withByteAlignment(8);
		
		P_BACKEND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBackend"));
		P_BACKEND_VTABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBackendVTable"));
		P_BACKEND_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBackendUserData"));
		ON_READ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onRead"));
		ON_SEEK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onSeek"));
		ON_TELL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onTell"));
		P_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUserData"));
		READ_POINTER_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("readPointerInPCMFrames"));
		OUTPUT_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("outputFormat"));
		OUTPUT_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("outputChannels"));
		OUTPUT_SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("outputSampleRate"));
		P_INPUT_CACHE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInputCache"));
		INPUT_CACHE_CAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputCacheCap"));
		INPUT_CACHE_CONSUMED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputCacheConsumed"));
		INPUT_CACHE_REMAINING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputCacheRemaining"));
		
		DS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ds"));
		P_BACKEND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBackend"));
		P_BACKEND_VTABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBackendVTable"));
		P_BACKEND_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBackendUserData"));
		ON_READ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onRead"));
		ON_SEEK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onSeek"));
		ON_TELL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onTell"));
		P_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
		READ_POINTER_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("readPointerInPCMFrames"));
		OUTPUT_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("outputFormat"));
		OUTPUT_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("outputChannels"));
		OUTPUT_SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("outputSampleRate"));
		CONVERTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("converter"));
		P_INPUT_CACHE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInputCache"));
		INPUT_CACHE_CAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputCacheCap"));
		INPUT_CACHE_CONSUMED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputCacheConsumed"));
		INPUT_CACHE_REMAINING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputCacheRemaining"));
		ALLOCATION_CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationCallbacks"));
		DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
		//@formatter:on
	}

	public MaDecoder() {
	    this(Arena.ofAuto());
	}
	
	public MaDecoder(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaDecoder(MemorySegment segment) {
	    this.segment = segment;
	
	    ds = new MaDataSourceBase(segment.asSlice(DS_BYTE_OFFSET, MaDataSourceBase.LAYOUT));
	    converter = new MaDataConverter(segment.asSlice(CONVERTER_BYTE_OFFSET, MaDataConverter.LAYOUT));
	    allocationCallbacks = new MaAllocationCallbacks(segment.asSlice(ALLOCATION_CALLBACKS_BYTE_OFFSET, MaAllocationCallbacks.LAYOUT));
	    data = new Data(segment.asSlice(DATA_BYTE_OFFSET, Data.LAYOUT));
	}

    /// @see #ds()
    public MaDecoder ds(Consumer<MaDataSourceBase> consumer) {
    	consumer.accept(ds);
    	return this;
    }
    
    /// @see #ds()
    public MaDecoder ds(MaDataSourceBase other) {
    	ds.set(other);
    	return this;
    }
    
    public MaDataSourceBase ds() {
    	return ds;
    }
    
    /// @see #pBackend()
    public MaDecoder pBackend(MemorySegment pBackend) {
    	P_BACKEND_HANDLE.set(segment, 0L, pBackend);
    	return this;
    }
    
    public @Nullable MemorySegment pBackend() {
    	MemorySegment segment = (MemorySegment) P_BACKEND_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pBackendVTable()
    public MaDecoder pBackendVTable(MaDecodingBackendVtable pBackendVTable) {
    	P_BACKEND_VTABLE_HANDLE.set(segment, 0L, pBackendVTable.memorySegment());
    	return this;
    }
    
    public @Nullable MaDecodingBackendVtable pBackendVTable() {
    	MemorySegment segment = (MemorySegment) P_BACKEND_VTABLE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDecodingBackendVtable(segment);
    }
    
    /// @see #pBackendUserData()
    public MaDecoder pBackendUserData(MemorySegment pBackendUserData) {
    	P_BACKEND_USER_DATA_HANDLE.set(segment, 0L, pBackendUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pBackendUserData() {
    	MemorySegment segment = (MemorySegment) P_BACKEND_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #onRead()
    public MaDecoder onRead(MaDecoderReadProc onRead) {
    	ON_READ_HANDLE.set(segment, 0L, onRead.memorySegment());
    	return this;
    }
    
    public @Nullable MaDecoderReadProc onRead() {
    	MemorySegment segment = (MemorySegment) ON_READ_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDecoderReadProc.get(segment);
    }
    
    /// @see #onSeek()
    public MaDecoder onSeek(MaDecoderSeekProc onSeek) {
    	ON_SEEK_HANDLE.set(segment, 0L, onSeek.memorySegment());
    	return this;
    }
    
    public @Nullable MaDecoderSeekProc onSeek() {
    	MemorySegment segment = (MemorySegment) ON_SEEK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDecoderSeekProc.get(segment);
    }
    
    /// @see #onTell()
    public MaDecoder onTell(MaDecoderTellProc onTell) {
    	ON_TELL_HANDLE.set(segment, 0L, onTell.memorySegment());
    	return this;
    }
    
    public @Nullable MaDecoderTellProc onTell() {
    	MemorySegment segment = (MemorySegment) ON_TELL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDecoderTellProc.get(segment);
    }
    
    /// @see #pUserData()
    public MaDecoder pUserData(MemorySegment pUserData) {
    	P_USER_DATA_HANDLE.set(segment, 0L, pUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pUserData() {
    	MemorySegment segment = (MemorySegment) P_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #readPointerInPCMFrames()
    public MaDecoder readPointerInPCMFrames(long readPointerInPCMFrames) {
    	READ_POINTER_IN_PCMFRAMES_HANDLE.set(segment, 0L, readPointerInPCMFrames);
    	return this;
    }
    
    public long readPointerInPCMFrames() {
    	return (long) READ_POINTER_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #outputFormat()
    public MaDecoder outputFormat(int outputFormat) {
    	OUTPUT_FORMAT_HANDLE.set(segment, 0L, outputFormat);
    	return this;
    }
    
    public int outputFormat() {
    	return (int) OUTPUT_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #outputChannels()
    public MaDecoder outputChannels(int outputChannels) {
    	OUTPUT_CHANNELS_HANDLE.set(segment, 0L, outputChannels);
    	return this;
    }
    
    public int outputChannels() {
    	return (int) OUTPUT_CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #outputSampleRate()
    public MaDecoder outputSampleRate(int outputSampleRate) {
    	OUTPUT_SAMPLE_RATE_HANDLE.set(segment, 0L, outputSampleRate);
    	return this;
    }
    
    public int outputSampleRate() {
    	return (int) OUTPUT_SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #converter()
    public MaDecoder converter(Consumer<MaDataConverter> consumer) {
    	consumer.accept(converter);
    	return this;
    }
    
    /// @see #converter()
    public MaDecoder converter(MaDataConverter other) {
    	converter.set(other);
    	return this;
    }
    
    public MaDataConverter converter() {
    	return converter;
    }
    
    /// @see #pInputCache()
    public MaDecoder pInputCache(MemorySegment pInputCache) {
    	P_INPUT_CACHE_HANDLE.set(segment, 0L, pInputCache);
    	return this;
    }
    
    public @Nullable MemorySegment pInputCache() {
    	MemorySegment segment = (MemorySegment) P_INPUT_CACHE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #inputCacheCap()
    public MaDecoder inputCacheCap(long inputCacheCap) {
    	INPUT_CACHE_CAP_HANDLE.set(segment, 0L, inputCacheCap);
    	return this;
    }
    
    public long inputCacheCap() {
    	return (long) INPUT_CACHE_CAP_HANDLE.get(segment, 0L);
    }
    
    /// @see #inputCacheConsumed()
    public MaDecoder inputCacheConsumed(long inputCacheConsumed) {
    	INPUT_CACHE_CONSUMED_HANDLE.set(segment, 0L, inputCacheConsumed);
    	return this;
    }
    
    public long inputCacheConsumed() {
    	return (long) INPUT_CACHE_CONSUMED_HANDLE.get(segment, 0L);
    }
    
    /// @see #inputCacheRemaining()
    public MaDecoder inputCacheRemaining(long inputCacheRemaining) {
    	INPUT_CACHE_REMAINING_HANDLE.set(segment, 0L, inputCacheRemaining);
    	return this;
    }
    
    public long inputCacheRemaining() {
    	return (long) INPUT_CACHE_REMAINING_HANDLE.get(segment, 0L);
    }
    
    /// @see #allocationCallbacks()
    public MaDecoder allocationCallbacks(Consumer<MaAllocationCallbacks> consumer) {
    	consumer.accept(allocationCallbacks);
    	return this;
    }
    
    /// @see #allocationCallbacks()
    public MaDecoder allocationCallbacks(MaAllocationCallbacks other) {
    	allocationCallbacks.set(other);
    	return this;
    }
    
    public MaAllocationCallbacks allocationCallbacks() {
    	return allocationCallbacks;
    }
    
    /// @see #data()
    public MaDecoder data(Consumer<Data> consumer) {
    	consumer.accept(data);
    	return this;
    }
    
    /// @see #data()
    public MaDecoder data(Data other) {
    	data.set(other);
    	return this;
    }
    
    public Data data() {
    	return data;
    }
    
    @Override
    public MaDecoder set(MaDecoder other) {
        return set(other.segment);
    }
    
    @Override
    public MaDecoder set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDecoder> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDecoder> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDecoder(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDecoder> array(SegmentAllocator allocator, MaDecoder... structs) {
        NativeStructArray<MaDecoder> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDecoder(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDecoder> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDecoder(segment)
        );
    }

	public static class Data implements Struct<Data> {
	
		public static final UnionLayout LAYOUT;
	
		public static final long VFS_BYTE_OFFSET;
		public static final long MEMORY_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final Vfs vfs;
		private final Memory memory;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.unionLayout(
			    Vfs.LAYOUT.withName("vfs"),
			    Memory.LAYOUT.withName("memory")
			).withName("Data").withByteAlignment(8);
			
			VFS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vfs"));
			MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memory"));
			//@formatter:on
		}
	
		public Data() {
		    this(Arena.ofAuto());
		}
		
		public Data(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Data(MemorySegment segment) {
		    this.segment = segment;
		
		    vfs = new Vfs(segment.asSlice(VFS_BYTE_OFFSET, Vfs.LAYOUT));
		    memory = new Memory(segment.asSlice(MEMORY_BYTE_OFFSET, Memory.LAYOUT));
		}
	
	    /// @see #vfs()
	    public Data vfs(Consumer<Vfs> consumer) {
	    	consumer.accept(vfs);
	    	return this;
	    }
	    
	    /// @see #vfs()
	    public Data vfs(Vfs other) {
	    	vfs.set(other);
	    	return this;
	    }
	    
	    public Vfs vfs() {
	    	return vfs;
	    }
	    
	    /// @see #memory()
	    public Data memory(Consumer<Memory> consumer) {
	    	consumer.accept(memory);
	    	return this;
	    }
	    
	    /// @see #memory()
	    public Data memory(Memory other) {
	    	memory.set(other);
	    	return this;
	    }
	    
	    public Memory memory() {
	    	return memory;
	    }
	    
	    @Override
	    public Data set(Data other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Data set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Data> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Data> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Data(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Data> array(SegmentAllocator allocator, Data... structs) {
	        NativeStructArray<Data> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Data(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Data> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Data(segment)
	        );
	    }
	
		public static class Vfs implements Struct<Vfs> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle P_VFS_HANDLE;
			public static final VarHandle FILE_HANDLE;
		
			public static final long P_VFS_BYTE_OFFSET;
			public static final long FILE_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    UNBOUNDED_ADDRESS.withName("pVFS"),
				    UNBOUNDED_ADDRESS.withName("file")
				).withName("Vfs").withByteAlignment(8);
				
				P_VFS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pVFS"));
				FILE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("file"));
				
				P_VFS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pVFS"));
				FILE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("file"));
				//@formatter:on
			}
		
			public Vfs() {
			    this(Arena.ofAuto());
			}
			
			public Vfs(SegmentAllocator allocator) {
			    this(allocator.allocate(LAYOUT));
			}
			
			public Vfs(MemorySegment segment) {
			    this.segment = segment;
			
			}
		
		    /// @see #pVFS()
		    public Vfs pVFS(MemorySegment pVFS) {
		    	P_VFS_HANDLE.set(segment, 0L, pVFS);
		    	return this;
		    }
		    
		    public @Nullable MemorySegment pVFS() {
		    	MemorySegment segment = (MemorySegment) P_VFS_HANDLE.get(this.segment, 0L);
		    
		    	if (segment.equals(MemorySegment.NULL))
		    		return null;
		    	
		    	return segment;
		    }
		    
		    /// @see #file()
		    public Vfs file(MemorySegment file) {
		    	FILE_HANDLE.set(segment, 0L, file);
		    	return this;
		    }
		    
		    public @Nullable MemorySegment file() {
		    	MemorySegment segment = (MemorySegment) FILE_HANDLE.get(this.segment, 0L);
		    
		    	if (segment.equals(MemorySegment.NULL))
		    		return null;
		    	
		    	return segment;
		    }
		    
		    @Override
		    public Vfs set(Vfs other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public Vfs set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<Vfs> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<Vfs> array(SegmentAllocator allocator, int count) {
		        return new NativeStructArray<>(
		            allocator,
		            LAYOUT,
		            segment -> new Vfs(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<Vfs> array(SegmentAllocator allocator, Vfs... structs) {
		        NativeStructArray<Vfs> array = new NativeStructArray<>(
		            allocator,
		            LAYOUT,
		            segment -> new Vfs(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<Vfs> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new Vfs(segment)
		        );
		    }
		
		}
	    
		public static class Memory implements Struct<Memory> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle P_DATA_HANDLE;
			public static final VarHandle DATA_SIZE_HANDLE;
			public static final VarHandle CURRENT_READ_POS_HANDLE;
		
			public static final long P_DATA_BYTE_OFFSET;
			public static final long DATA_SIZE_BYTE_OFFSET;
			public static final long CURRENT_READ_POS_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    UNBOUNDED_ADDRESS.withName("pData"),
				    JAVA_LONG.withName("dataSize"),
				    JAVA_LONG.withName("currentReadPos")
				).withName("Memory").withByteAlignment(8);
				
				P_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pData"));
				DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dataSize"));
				CURRENT_READ_POS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("currentReadPos"));
				
				P_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pData"));
				DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
				CURRENT_READ_POS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("currentReadPos"));
				//@formatter:on
			}
		
			public Memory() {
			    this(Arena.ofAuto());
			}
			
			public Memory(SegmentAllocator allocator) {
			    this(allocator.allocate(LAYOUT));
			}
			
			public Memory(MemorySegment segment) {
			    this.segment = segment;
			
			}
		
		    /// @see #pData()
		    public Memory pData(NativeByteArray pData) {
		    	P_DATA_HANDLE.set(segment, 0L, pData.memorySegment());
		    	return this;
		    }
		    
		    public @Nullable NativeByteArray pData() {
		    	MemorySegment segment = (MemorySegment) P_DATA_HANDLE.get(this.segment, 0L);
		    
		    	if (segment.equals(MemorySegment.NULL))
		    		return null;
		    	
		    	return new NativeByteArray(segment);
		    }
		    
		    /// @see #dataSize()
		    public Memory dataSize(long dataSize) {
		    	DATA_SIZE_HANDLE.set(segment, 0L, dataSize);
		    	return this;
		    }
		    
		    public long dataSize() {
		    	return (long) DATA_SIZE_HANDLE.get(segment, 0L);
		    }
		    
		    /// @see #currentReadPos()
		    public Memory currentReadPos(long currentReadPos) {
		    	CURRENT_READ_POS_HANDLE.set(segment, 0L, currentReadPos);
		    	return this;
		    }
		    
		    public long currentReadPos() {
		    	return (long) CURRENT_READ_POS_HANDLE.get(segment, 0L);
		    }
		    
		    @Override
		    public Memory set(Memory other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public Memory set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<Memory> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<Memory> array(SegmentAllocator allocator, int count) {
		        return new NativeStructArray<>(
		            allocator,
		            LAYOUT,
		            segment -> new Memory(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<Memory> array(SegmentAllocator allocator, Memory... structs) {
		        NativeStructArray<Memory> array = new NativeStructArray<>(
		            allocator,
		            LAYOUT,
		            segment -> new Memory(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<Memory> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new Memory(segment)
		        );
		    }
		
		}
	}
}