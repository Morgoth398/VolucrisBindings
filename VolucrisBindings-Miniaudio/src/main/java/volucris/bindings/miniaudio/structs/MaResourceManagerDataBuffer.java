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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaResourceManagerDataBuffer
		implements Struct<MaResourceManagerDataBuffer> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_RESOURCE_MANAGER_HANDLE;
	public static final VarHandle P_NODE_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle EXECUTION_COUNTER_HANDLE;
	public static final VarHandle EXECUTION_POINTER_HANDLE;
	public static final VarHandle SEEK_TARGET_IN_PCMFRAMES_HANDLE;
	public static final VarHandle SEEK_TO_CURSOR_ON_NEXT_READ_HANDLE;
	public static final VarHandle RESULT_HANDLE;
	public static final VarHandle IS_LOOPING_HANDLE;

	public static final long DS_BYTE_OFFSET;
	public static final long P_RESOURCE_MANAGER_BYTE_OFFSET;
	public static final long P_NODE_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long EXECUTION_COUNTER_BYTE_OFFSET;
	public static final long EXECUTION_POINTER_BYTE_OFFSET;
	public static final long SEEK_TARGET_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long SEEK_TO_CURSOR_ON_NEXT_READ_BYTE_OFFSET;
	public static final long RESULT_BYTE_OFFSET;
	public static final long IS_LOOPING_BYTE_OFFSET;
	public static final long IS_CONNECTOR_INITIALIZED_BYTE_OFFSET;
	public static final long CONNECTOR_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaDataSourceBase ds;
	private final MaAtomicBool32 isConnectorInitialized;
	private final Connector connector;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaDataSourceBase.LAYOUT.withName("ds"),
		    UNBOUNDED_ADDRESS.withName("pResourceManager"),
		    UNBOUNDED_ADDRESS.withName("pNode"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("executionCounter"),
		    JAVA_INT.withName("executionPointer"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("seekTargetInPCMFrames"),
		    JAVA_INT.withName("seekToCursorOnNextRead"),
		    JAVA_INT.withName("result"),
		    JAVA_INT.withName("isLooping"),
		    MaAtomicBool32.LAYOUT.withName("isConnectorInitialized"),
		    Connector.LAYOUT.withName("connector")
		).withName("ma_resource_manager_data_buffer").withByteAlignment(8);
		
		P_RESOURCE_MANAGER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pResourceManager"));
		P_NODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNode"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		EXECUTION_COUNTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("executionCounter"));
		EXECUTION_POINTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("executionPointer"));
		SEEK_TARGET_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("seekTargetInPCMFrames"));
		SEEK_TO_CURSOR_ON_NEXT_READ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("seekToCursorOnNextRead"));
		RESULT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("result"));
		IS_LOOPING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isLooping"));
		
		DS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ds"));
		P_RESOURCE_MANAGER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pResourceManager"));
		P_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNode"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		EXECUTION_COUNTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("executionCounter"));
		EXECUTION_POINTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("executionPointer"));
		SEEK_TARGET_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seekTargetInPCMFrames"));
		SEEK_TO_CURSOR_ON_NEXT_READ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seekToCursorOnNextRead"));
		RESULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("result"));
		IS_LOOPING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isLooping"));
		IS_CONNECTOR_INITIALIZED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isConnectorInitialized"));
		CONNECTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("connector"));
		//@formatter:on
	}

	public MaResourceManagerDataBuffer() {
	    this(Arena.ofAuto());
	}
	
	public MaResourceManagerDataBuffer(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaResourceManagerDataBuffer(MemorySegment segment) {
	    this.segment = segment;
	
	    ds = new MaDataSourceBase(segment.asSlice(DS_BYTE_OFFSET, MaDataSourceBase.LAYOUT));
	    isConnectorInitialized = new MaAtomicBool32(segment.asSlice(IS_CONNECTOR_INITIALIZED_BYTE_OFFSET, MaAtomicBool32.LAYOUT));
	    connector = new Connector(segment.asSlice(CONNECTOR_BYTE_OFFSET, Connector.LAYOUT));
	}

    /// @see #ds()
    public MaResourceManagerDataBuffer ds(Consumer<MaDataSourceBase> consumer) {
    	consumer.accept(ds);
    	return this;
    }
    
    /// @see #ds()
    public MaResourceManagerDataBuffer ds(MaDataSourceBase other) {
    	ds.set(other);
    	return this;
    }
    
    public MaDataSourceBase ds() {
    	return ds;
    }
    
    /// @see #pResourceManager()
    public MaResourceManagerDataBuffer pResourceManager(MaResourceManager pResourceManager) {
    	P_RESOURCE_MANAGER_HANDLE.set(segment, 0L, pResourceManager.memorySegment());
    	return this;
    }
    
    public @Nullable MaResourceManager pResourceManager() {
    	MemorySegment segment = (MemorySegment) P_RESOURCE_MANAGER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResourceManager(segment);
    }
    
    /// @see #pNode()
    public MaResourceManagerDataBuffer pNode(MaResourceManagerDataBufferNode pNode) {
    	P_NODE_HANDLE.set(segment, 0L, pNode.memorySegment());
    	return this;
    }
    
    public @Nullable MaResourceManagerDataBufferNode pNode() {
    	MemorySegment segment = (MemorySegment) P_NODE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResourceManagerDataBufferNode(segment);
    }
    
    /// @see #flags()
    public MaResourceManagerDataBuffer flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #executionCounter()
    public MaResourceManagerDataBuffer executionCounter(int executionCounter) {
    	EXECUTION_COUNTER_HANDLE.set(segment, 0L, executionCounter);
    	return this;
    }
    
    public int executionCounter() {
    	return (int) EXECUTION_COUNTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #executionPointer()
    public MaResourceManagerDataBuffer executionPointer(int executionPointer) {
    	EXECUTION_POINTER_HANDLE.set(segment, 0L, executionPointer);
    	return this;
    }
    
    public int executionPointer() {
    	return (int) EXECUTION_POINTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #seekTargetInPCMFrames()
    public MaResourceManagerDataBuffer seekTargetInPCMFrames(long seekTargetInPCMFrames) {
    	SEEK_TARGET_IN_PCMFRAMES_HANDLE.set(segment, 0L, seekTargetInPCMFrames);
    	return this;
    }
    
    public long seekTargetInPCMFrames() {
    	return (long) SEEK_TARGET_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #seekToCursorOnNextRead()
    public MaResourceManagerDataBuffer seekToCursorOnNextRead(int seekToCursorOnNextRead) {
    	SEEK_TO_CURSOR_ON_NEXT_READ_HANDLE.set(segment, 0L, seekToCursorOnNextRead);
    	return this;
    }
    
    public int seekToCursorOnNextRead() {
    	return (int) SEEK_TO_CURSOR_ON_NEXT_READ_HANDLE.get(segment, 0L);
    }
    
    /// @see #result()
    public MaResourceManagerDataBuffer result(int result) {
    	RESULT_HANDLE.set(segment, 0L, result);
    	return this;
    }
    
    public int result() {
    	return (int) RESULT_HANDLE.get(segment, 0L);
    }
    
    /// @see #isLooping()
    public MaResourceManagerDataBuffer isLooping(int isLooping) {
    	IS_LOOPING_HANDLE.set(segment, 0L, isLooping);
    	return this;
    }
    
    public int isLooping() {
    	return (int) IS_LOOPING_HANDLE.get(segment, 0L);
    }
    
    /// @see #isConnectorInitialized()
    public MaResourceManagerDataBuffer isConnectorInitialized(Consumer<MaAtomicBool32> consumer) {
    	consumer.accept(isConnectorInitialized);
    	return this;
    }
    
    /// @see #isConnectorInitialized()
    public MaResourceManagerDataBuffer isConnectorInitialized(MaAtomicBool32 other) {
    	isConnectorInitialized.set(other);
    	return this;
    }
    
    public MaAtomicBool32 isConnectorInitialized() {
    	return isConnectorInitialized;
    }
    
    /// @see #connector()
    public MaResourceManagerDataBuffer connector(Consumer<Connector> consumer) {
    	consumer.accept(connector);
    	return this;
    }
    
    /// @see #connector()
    public MaResourceManagerDataBuffer connector(Connector other) {
    	connector.set(other);
    	return this;
    }
    
    public Connector connector() {
    	return connector;
    }
    
    @Override
    public MaResourceManagerDataBuffer set(MaResourceManagerDataBuffer other) {
        return set(other.segment);
    }
    
    @Override
    public MaResourceManagerDataBuffer set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaResourceManagerDataBuffer> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaResourceManagerDataBuffer> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManagerDataBuffer(segment),
            count
        );
    }
    
    public static NativeStructArray<MaResourceManagerDataBuffer> array(Arena arena, MaResourceManagerDataBuffer... structs) {
        NativeStructArray<MaResourceManagerDataBuffer> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManagerDataBuffer(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaResourceManagerDataBuffer> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaResourceManagerDataBuffer(segment)
        );
    }

	public static class Connector implements Struct<Connector> {
	
		public static final UnionLayout LAYOUT;
	
		public static final long DECODER_BYTE_OFFSET;
		public static final long BUFFER_BYTE_OFFSET;
		public static final long PAGED_BUFFER_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final MaDecoder decoder;
		private final MaAudioBuffer buffer;
		private final MaPagedAudioBuffer pagedBuffer;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.unionLayout(
			    MaDecoder.LAYOUT.withName("decoder"),
			    MaAudioBuffer.LAYOUT.withName("buffer"),
			    MaPagedAudioBuffer.LAYOUT.withName("pagedBuffer")
			).withName("Connector").withByteAlignment(8);
			
			DECODER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("decoder"));
			BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
			PAGED_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pagedBuffer"));
			//@formatter:on
		}
	
		public Connector() {
		    this(Arena.ofAuto());
		}
		
		public Connector(Arena arena) {
		    this(arena.allocate(LAYOUT));
		}
		
		public Connector(MemorySegment segment) {
		    this.segment = segment;
		
		    decoder = new MaDecoder(segment.asSlice(DECODER_BYTE_OFFSET, MaDecoder.LAYOUT));
		    buffer = new MaAudioBuffer(segment.asSlice(BUFFER_BYTE_OFFSET, MaAudioBuffer.LAYOUT));
		    pagedBuffer = new MaPagedAudioBuffer(segment.asSlice(PAGED_BUFFER_BYTE_OFFSET, MaPagedAudioBuffer.LAYOUT));
		}
	
	    /// @see #decoder()
	    public Connector decoder(Consumer<MaDecoder> consumer) {
	    	consumer.accept(decoder);
	    	return this;
	    }
	    
	    /// @see #decoder()
	    public Connector decoder(MaDecoder other) {
	    	decoder.set(other);
	    	return this;
	    }
	    
	    public MaDecoder decoder() {
	    	return decoder;
	    }
	    
	    /// @see #buffer()
	    public Connector buffer(Consumer<MaAudioBuffer> consumer) {
	    	consumer.accept(buffer);
	    	return this;
	    }
	    
	    /// @see #buffer()
	    public Connector buffer(MaAudioBuffer other) {
	    	buffer.set(other);
	    	return this;
	    }
	    
	    public MaAudioBuffer buffer() {
	    	return buffer;
	    }
	    
	    /// @see #pagedBuffer()
	    public Connector pagedBuffer(Consumer<MaPagedAudioBuffer> consumer) {
	    	consumer.accept(pagedBuffer);
	    	return this;
	    }
	    
	    /// @see #pagedBuffer()
	    public Connector pagedBuffer(MaPagedAudioBuffer other) {
	    	pagedBuffer.set(other);
	    	return this;
	    }
	    
	    public MaPagedAudioBuffer pagedBuffer() {
	    	return pagedBuffer;
	    }
	    
	    @Override
	    public Connector set(Connector other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Connector set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Connector> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Connector> array(Arena arena, int count) {
	        return new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Connector(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Connector> array(Arena arena, Connector... structs) {
	        NativeStructArray<Connector> array = new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Connector(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Connector> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Connector(segment)
	        );
	    }
	
	}
}