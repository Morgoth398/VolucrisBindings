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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaEncoder
		implements Struct<MaEncoder> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ON_WRITE_HANDLE;
	public static final VarHandle ON_SEEK_HANDLE;
	public static final VarHandle ON_INIT_HANDLE;
	public static final VarHandle ON_UNINIT_HANDLE;
	public static final VarHandle ON_WRITE_PCMFRAMES_HANDLE;
	public static final VarHandle P_USER_DATA_HANDLE;
	public static final VarHandle P_INTERNAL_ENCODER_HANDLE;

	public static final long CONFIG_BYTE_OFFSET;
	public static final long ON_WRITE_BYTE_OFFSET;
	public static final long ON_SEEK_BYTE_OFFSET;
	public static final long ON_INIT_BYTE_OFFSET;
	public static final long ON_UNINIT_BYTE_OFFSET;
	public static final long ON_WRITE_PCMFRAMES_BYTE_OFFSET;
	public static final long P_USER_DATA_BYTE_OFFSET;
	public static final long P_INTERNAL_ENCODER_BYTE_OFFSET;
	public static final long DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaEncoderConfig config;
	private final Data data;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaEncoderConfig.LAYOUT.withName("config"),
		    UNBOUNDED_ADDRESS.withName("onWrite"),
		    UNBOUNDED_ADDRESS.withName("onSeek"),
		    UNBOUNDED_ADDRESS.withName("onInit"),
		    UNBOUNDED_ADDRESS.withName("onUninit"),
		    UNBOUNDED_ADDRESS.withName("onWritePCMFrames"),
		    UNBOUNDED_ADDRESS.withName("pUserData"),
		    UNBOUNDED_ADDRESS.withName("pInternalEncoder"),
		    Data.LAYOUT.withName("data")
		).withName("ma_encoder").withByteAlignment(8);
		
		ON_WRITE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onWrite"));
		ON_SEEK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onSeek"));
		ON_INIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onInit"));
		ON_UNINIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onUninit"));
		ON_WRITE_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onWritePCMFrames"));
		P_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUserData"));
		P_INTERNAL_ENCODER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInternalEncoder"));
		
		CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("config"));
		ON_WRITE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onWrite"));
		ON_SEEK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onSeek"));
		ON_INIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onInit"));
		ON_UNINIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onUninit"));
		ON_WRITE_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onWritePCMFrames"));
		P_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
		P_INTERNAL_ENCODER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInternalEncoder"));
		DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
		//@formatter:on
	}

	public MaEncoder() {
	    this(Arena.ofAuto());
	}
	
	public MaEncoder(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaEncoder(MemorySegment segment) {
	    this.segment = segment;
	
	    config = new MaEncoderConfig(segment.asSlice(CONFIG_BYTE_OFFSET, MaEncoderConfig.LAYOUT));
	    data = new Data(segment.asSlice(DATA_BYTE_OFFSET, Data.LAYOUT));
	}

    /// @see #config()
    public MaEncoder config(Consumer<MaEncoderConfig> consumer) {
    	consumer.accept(config);
    	return this;
    }
    
    /// @see #config()
    public MaEncoder config(MaEncoderConfig other) {
    	config.set(other);
    	return this;
    }
    
    public MaEncoderConfig config() {
    	return config;
    }
    
    /// @see #onWrite()
    public MaEncoder onWrite(MaEncoderWriteProc onWrite) {
    	ON_WRITE_HANDLE.set(segment, 0L, onWrite.memorySegment());
    	return this;
    }
    
    public @Nullable MaEncoderWriteProc onWrite() {
    	MemorySegment segment = (MemorySegment) ON_WRITE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaEncoderWriteProc.get(segment);
    }
    
    /// @see #onSeek()
    public MaEncoder onSeek(MaEncoderSeekProc onSeek) {
    	ON_SEEK_HANDLE.set(segment, 0L, onSeek.memorySegment());
    	return this;
    }
    
    public @Nullable MaEncoderSeekProc onSeek() {
    	MemorySegment segment = (MemorySegment) ON_SEEK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaEncoderSeekProc.get(segment);
    }
    
    /// @see #onInit()
    public MaEncoder onInit(MaEncoderInitProc onInit) {
    	ON_INIT_HANDLE.set(segment, 0L, onInit.memorySegment());
    	return this;
    }
    
    public @Nullable MaEncoderInitProc onInit() {
    	MemorySegment segment = (MemorySegment) ON_INIT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaEncoderInitProc.get(segment);
    }
    
    /// @see #onUninit()
    public MaEncoder onUninit(MaEncoderUninitProc onUninit) {
    	ON_UNINIT_HANDLE.set(segment, 0L, onUninit.memorySegment());
    	return this;
    }
    
    public @Nullable MaEncoderUninitProc onUninit() {
    	MemorySegment segment = (MemorySegment) ON_UNINIT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaEncoderUninitProc.get(segment);
    }
    
    /// @see #onWritePCMFrames()
    public MaEncoder onWritePCMFrames(MaEncoderWritePcmFrameProc onWritePCMFrames) {
    	ON_WRITE_PCMFRAMES_HANDLE.set(segment, 0L, onWritePCMFrames.memorySegment());
    	return this;
    }
    
    public @Nullable MaEncoderWritePcmFrameProc onWritePCMFrames() {
    	MemorySegment segment = (MemorySegment) ON_WRITE_PCMFRAMES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaEncoderWritePcmFrameProc.get(segment);
    }
    
    /// @see #pUserData()
    public MaEncoder pUserData(MemorySegment pUserData) {
    	P_USER_DATA_HANDLE.set(segment, 0L, pUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pUserData() {
    	MemorySegment segment = (MemorySegment) P_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pInternalEncoder()
    public MaEncoder pInternalEncoder(MemorySegment pInternalEncoder) {
    	P_INTERNAL_ENCODER_HANDLE.set(segment, 0L, pInternalEncoder);
    	return this;
    }
    
    public @Nullable MemorySegment pInternalEncoder() {
    	MemorySegment segment = (MemorySegment) P_INTERNAL_ENCODER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #data()
    public MaEncoder data(Consumer<Data> consumer) {
    	consumer.accept(data);
    	return this;
    }
    
    /// @see #data()
    public MaEncoder data(Data other) {
    	data.set(other);
    	return this;
    }
    
    public Data data() {
    	return data;
    }
    
    @Override
    public MaEncoder set(MaEncoder other) {
        return set(other.segment);
    }
    
    @Override
    public MaEncoder set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaEncoder> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaEncoder> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaEncoder(segment),
            count
        );
    }
    
    public static NativeStructArray<MaEncoder> array(SegmentAllocator allocator, MaEncoder... structs) {
        NativeStructArray<MaEncoder> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaEncoder(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaEncoder> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaEncoder(segment)
        );
    }

	public static class Data implements Struct<Data> {
	
		public static final UnionLayout LAYOUT;
	
		public static final long VFS_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final Vfs vfs;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.unionLayout(
			    Vfs.LAYOUT.withName("vfs")
			).withName("Data").withByteAlignment(8);
			
			VFS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vfs"));
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
	}
}