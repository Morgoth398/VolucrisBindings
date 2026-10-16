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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaResourceManager
		implements Struct<MaResourceManager> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_ROOT_DATA_BUFFER_NODE_HANDLE;
	public static final VarHandle DATA_BUFFER_BSTLOCK_HANDLE;
	public static final VarHandle JOB_THREADS_HANDLE;

	public static final long CONFIG_BYTE_OFFSET;
	public static final long P_ROOT_DATA_BUFFER_NODE_BYTE_OFFSET;
	public static final long DATA_BUFFER_BSTLOCK_BYTE_OFFSET;
	public static final long JOB_THREADS_BYTE_OFFSET;
	public static final long JOB_QUEUE_BYTE_OFFSET;
	public static final long DEFAULT_VFS_BYTE_OFFSET;
	public static final long LOG_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaResourceManagerConfig config;
	private final MaJobQueue jobQueue;
	private final MaDefaultVfs defaultVFS;
	private final MaLog log;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaResourceManagerConfig.LAYOUT.withName("config"),
		    UNBOUNDED_ADDRESS.withName("pRootDataBufferNode"),
		    UNBOUNDED_ADDRESS.withName("dataBufferBSTLock"),
		    MemoryLayout.sequenceLayout(64, UNBOUNDED_ADDRESS).withName("jobThreads"),
		    MaJobQueue.LAYOUT.withName("jobQueue"),
		    MaDefaultVfs.LAYOUT.withName("defaultVFS"),
		    MaLog.LAYOUT.withName("log")
		).withName("ma_resource_manager").withByteAlignment(8);
		
		P_ROOT_DATA_BUFFER_NODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pRootDataBufferNode"));
		DATA_BUFFER_BSTLOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dataBufferBSTLock"));
		JOB_THREADS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jobThreads"), PathElement.sequenceElement());
		
		CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("config"));
		P_ROOT_DATA_BUFFER_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pRootDataBufferNode"));
		DATA_BUFFER_BSTLOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dataBufferBSTLock"));
		JOB_THREADS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jobThreads"));
		JOB_QUEUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jobQueue"));
		DEFAULT_VFS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("defaultVFS"));
		LOG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log"));
		//@formatter:on
	}

	public MaResourceManager() {
	    this(Arena.ofAuto());
	}
	
	public MaResourceManager(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaResourceManager(MemorySegment segment) {
	    this.segment = segment;
	
	    config = new MaResourceManagerConfig(segment.asSlice(CONFIG_BYTE_OFFSET, MaResourceManagerConfig.LAYOUT));
	    jobQueue = new MaJobQueue(segment.asSlice(JOB_QUEUE_BYTE_OFFSET, MaJobQueue.LAYOUT));
	    defaultVFS = new MaDefaultVfs(segment.asSlice(DEFAULT_VFS_BYTE_OFFSET, MaDefaultVfs.LAYOUT));
	    log = new MaLog(segment.asSlice(LOG_BYTE_OFFSET, MaLog.LAYOUT));
	}

    /// @see #config()
    public MaResourceManager config(Consumer<MaResourceManagerConfig> consumer) {
    	consumer.accept(config);
    	return this;
    }
    
    /// @see #config()
    public MaResourceManager config(MaResourceManagerConfig other) {
    	config.set(other);
    	return this;
    }
    
    public MaResourceManagerConfig config() {
    	return config;
    }
    
    /// @see #pRootDataBufferNode()
    public MaResourceManager pRootDataBufferNode(MaResourceManagerDataBufferNode pRootDataBufferNode) {
    	P_ROOT_DATA_BUFFER_NODE_HANDLE.set(segment, 0L, pRootDataBufferNode.memorySegment());
    	return this;
    }
    
    public @Nullable MaResourceManagerDataBufferNode pRootDataBufferNode() {
    	MemorySegment segment = (MemorySegment) P_ROOT_DATA_BUFFER_NODE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResourceManagerDataBufferNode(segment);
    }
    
    /// @see #dataBufferBSTLock()
    public MaResourceManager dataBufferBSTLock(MemorySegment dataBufferBSTLock) {
    	DATA_BUFFER_BSTLOCK_HANDLE.set(segment, 0L, dataBufferBSTLock);
    	return this;
    }
    
    public @Nullable MemorySegment dataBufferBSTLock() {
    	MemorySegment segment = (MemorySegment) DATA_BUFFER_BSTLOCK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #jobThreads(int)
    public MaResourceManager jobThreads(MemorySegment jobThreads, int index0) {
    	JOB_THREADS_HANDLE.set(segment, 0L, index0, jobThreads);
    	return this;
    }
    
    public @Nullable MemorySegment jobThreads(int index0) {
    	MemorySegment segment = (MemorySegment) JOB_THREADS_HANDLE.get(this.segment, 0L, index0);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #jobQueue()
    public MaResourceManager jobQueue(Consumer<MaJobQueue> consumer) {
    	consumer.accept(jobQueue);
    	return this;
    }
    
    /// @see #jobQueue()
    public MaResourceManager jobQueue(MaJobQueue other) {
    	jobQueue.set(other);
    	return this;
    }
    
    public MaJobQueue jobQueue() {
    	return jobQueue;
    }
    
    /// @see #defaultVFS()
    public MaResourceManager defaultVFS(Consumer<MaDefaultVfs> consumer) {
    	consumer.accept(defaultVFS);
    	return this;
    }
    
    /// @see #defaultVFS()
    public MaResourceManager defaultVFS(MaDefaultVfs other) {
    	defaultVFS.set(other);
    	return this;
    }
    
    public MaDefaultVfs defaultVFS() {
    	return defaultVFS;
    }
    
    /// @see #log()
    public MaResourceManager log(Consumer<MaLog> consumer) {
    	consumer.accept(log);
    	return this;
    }
    
    /// @see #log()
    public MaResourceManager log(MaLog other) {
    	log.set(other);
    	return this;
    }
    
    public MaLog log() {
    	return log;
    }
    
    @Override
    public MaResourceManager set(MaResourceManager other) {
        return set(other.segment);
    }
    
    @Override
    public MaResourceManager set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaResourceManager> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaResourceManager> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManager(segment),
            count
        );
    }
    
    public static NativeStructArray<MaResourceManager> array(Arena arena, MaResourceManager... structs) {
        NativeStructArray<MaResourceManager> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManager(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaResourceManager> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaResourceManager(segment)
        );
    }

}