/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaResourceManagerDataSource
		implements Struct<MaResourceManagerDataSource> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle EXECUTION_COUNTER_HANDLE;
	public static final VarHandle EXECUTION_POINTER_HANDLE;

	public static final long BACKEND_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long EXECUTION_COUNTER_BYTE_OFFSET;
	public static final long EXECUTION_POINTER_BYTE_OFFSET;

	private final MemorySegment segment;

	private final Backend backend;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    Backend.LAYOUT.withName("backend"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("executionCounter"),
		    JAVA_INT.withName("executionPointer"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_resource_manager_data_source").withByteAlignment(8);
		
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		EXECUTION_COUNTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("executionCounter"));
		EXECUTION_POINTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("executionPointer"));
		
		BACKEND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("backend"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		EXECUTION_COUNTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("executionCounter"));
		EXECUTION_POINTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("executionPointer"));
		//@formatter:on
	}

	public MaResourceManagerDataSource() {
	    this(Arena.ofAuto());
	}
	
	public MaResourceManagerDataSource(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaResourceManagerDataSource(MemorySegment segment) {
	    this.segment = segment;
	
	    backend = new Backend(segment.asSlice(BACKEND_BYTE_OFFSET, Backend.LAYOUT));
	}

    /// @see #backend()
    public MaResourceManagerDataSource backend(Consumer<Backend> consumer) {
    	consumer.accept(backend);
    	return this;
    }
    
    /// @see #backend()
    public MaResourceManagerDataSource backend(Backend other) {
    	backend.set(other);
    	return this;
    }
    
    public Backend backend() {
    	return backend;
    }
    
    /// @see #flags()
    public MaResourceManagerDataSource flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #executionCounter()
    public MaResourceManagerDataSource executionCounter(int executionCounter) {
    	EXECUTION_COUNTER_HANDLE.set(segment, 0L, executionCounter);
    	return this;
    }
    
    public int executionCounter() {
    	return (int) EXECUTION_COUNTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #executionPointer()
    public MaResourceManagerDataSource executionPointer(int executionPointer) {
    	EXECUTION_POINTER_HANDLE.set(segment, 0L, executionPointer);
    	return this;
    }
    
    public int executionPointer() {
    	return (int) EXECUTION_POINTER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaResourceManagerDataSource set(MaResourceManagerDataSource other) {
        return set(other.segment);
    }
    
    @Override
    public MaResourceManagerDataSource set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaResourceManagerDataSource> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaResourceManagerDataSource> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManagerDataSource(segment),
            count
        );
    }
    
    public static NativeStructArray<MaResourceManagerDataSource> array(Arena arena, MaResourceManagerDataSource... structs) {
        NativeStructArray<MaResourceManagerDataSource> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManagerDataSource(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaResourceManagerDataSource> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaResourceManagerDataSource(segment)
        );
    }

	public static class Backend implements Struct<Backend> {
	
		public static final UnionLayout LAYOUT;
	
		public static final long BUFFER_BYTE_OFFSET;
		public static final long STREAM_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final MaResourceManagerDataBuffer buffer;
		private final MaResourceManagerDataStream stream;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.unionLayout(
			    MaResourceManagerDataBuffer.LAYOUT.withName("buffer"),
			    MaResourceManagerDataStream.LAYOUT.withName("stream")
			).withName("Backend").withByteAlignment(8);
			
			BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
			STREAM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stream"));
			//@formatter:on
		}
	
		public Backend() {
		    this(Arena.ofAuto());
		}
		
		public Backend(Arena arena) {
		    this(arena.allocate(LAYOUT));
		}
		
		public Backend(MemorySegment segment) {
		    this.segment = segment;
		
		    buffer = new MaResourceManagerDataBuffer(segment.asSlice(BUFFER_BYTE_OFFSET, MaResourceManagerDataBuffer.LAYOUT));
		    stream = new MaResourceManagerDataStream(segment.asSlice(STREAM_BYTE_OFFSET, MaResourceManagerDataStream.LAYOUT));
		}
	
	    /// @see #buffer()
	    public Backend buffer(Consumer<MaResourceManagerDataBuffer> consumer) {
	    	consumer.accept(buffer);
	    	return this;
	    }
	    
	    /// @see #buffer()
	    public Backend buffer(MaResourceManagerDataBuffer other) {
	    	buffer.set(other);
	    	return this;
	    }
	    
	    public MaResourceManagerDataBuffer buffer() {
	    	return buffer;
	    }
	    
	    /// @see #stream()
	    public Backend stream(Consumer<MaResourceManagerDataStream> consumer) {
	    	consumer.accept(stream);
	    	return this;
	    }
	    
	    /// @see #stream()
	    public Backend stream(MaResourceManagerDataStream other) {
	    	stream.set(other);
	    	return this;
	    }
	    
	    public MaResourceManagerDataStream stream() {
	    	return stream;
	    }
	    
	    @Override
	    public Backend set(Backend other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Backend set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Backend> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Backend> array(Arena arena, int count) {
	        return new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Backend(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Backend> array(Arena arena, Backend... structs) {
	        NativeStructArray<Backend> array = new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Backend(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Backend> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Backend(segment)
	        );
	    }
	
	}
}