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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaResourceManagerConfig
		implements Struct<MaResourceManagerConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_LOG_HANDLE;
	public static final VarHandle DECODED_FORMAT_HANDLE;
	public static final VarHandle DECODED_CHANNELS_HANDLE;
	public static final VarHandle DECODED_SAMPLE_RATE_HANDLE;
	public static final VarHandle JOB_THREAD_COUNT_HANDLE;
	public static final VarHandle JOB_THREAD_STACK_SIZE_HANDLE;
	public static final VarHandle JOB_QUEUE_CAPACITY_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle P_VFS_HANDLE;
	public static final VarHandle PP_CUSTOM_DECODING_BACKEND_VTABLES_HANDLE;
	public static final VarHandle CUSTOM_DECODING_BACKEND_COUNT_HANDLE;
	public static final VarHandle P_CUSTOM_DECODING_BACKEND_USER_DATA_HANDLE;

	public static final long ALLOCATION_CALLBACKS_BYTE_OFFSET;
	public static final long P_LOG_BYTE_OFFSET;
	public static final long DECODED_FORMAT_BYTE_OFFSET;
	public static final long DECODED_CHANNELS_BYTE_OFFSET;
	public static final long DECODED_SAMPLE_RATE_BYTE_OFFSET;
	public static final long JOB_THREAD_COUNT_BYTE_OFFSET;
	public static final long JOB_THREAD_STACK_SIZE_BYTE_OFFSET;
	public static final long JOB_QUEUE_CAPACITY_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long P_VFS_BYTE_OFFSET;
	public static final long PP_CUSTOM_DECODING_BACKEND_VTABLES_BYTE_OFFSET;
	public static final long CUSTOM_DECODING_BACKEND_COUNT_BYTE_OFFSET;
	public static final long P_CUSTOM_DECODING_BACKEND_USER_DATA_BYTE_OFFSET;
	public static final long RESAMPLING_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaAllocationCallbacks allocationCallbacks;
	private final MaResamplerConfig resampling;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaAllocationCallbacks.LAYOUT.withName("allocationCallbacks"),
		    UNBOUNDED_ADDRESS.withName("pLog"),
		    JAVA_INT.withName("decodedFormat"),
		    JAVA_INT.withName("decodedChannels"),
		    JAVA_INT.withName("decodedSampleRate"),
		    JAVA_INT.withName("jobThreadCount"),
		    JAVA_LONG.withName("jobThreadStackSize"),
		    JAVA_INT.withName("jobQueueCapacity"),
		    JAVA_INT.withName("flags"),
		    UNBOUNDED_ADDRESS.withName("pVFS"),
		    UNBOUNDED_ADDRESS.withName("ppCustomDecodingBackendVTables"),
		    JAVA_INT.withName("customDecodingBackendCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pCustomDecodingBackendUserData"),
		    MaResamplerConfig.LAYOUT.withName("resampling")
		).withName("ma_resource_manager_config").withByteAlignment(8);
		
		P_LOG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLog"));
		DECODED_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("decodedFormat"));
		DECODED_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("decodedChannels"));
		DECODED_SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("decodedSampleRate"));
		JOB_THREAD_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jobThreadCount"));
		JOB_THREAD_STACK_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jobThreadStackSize"));
		JOB_QUEUE_CAPACITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jobQueueCapacity"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		P_VFS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pVFS"));
		PP_CUSTOM_DECODING_BACKEND_VTABLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ppCustomDecodingBackendVTables"));
		CUSTOM_DECODING_BACKEND_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("customDecodingBackendCount"));
		P_CUSTOM_DECODING_BACKEND_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCustomDecodingBackendUserData"));
		
		ALLOCATION_CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationCallbacks"));
		P_LOG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLog"));
		DECODED_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("decodedFormat"));
		DECODED_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("decodedChannels"));
		DECODED_SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("decodedSampleRate"));
		JOB_THREAD_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jobThreadCount"));
		JOB_THREAD_STACK_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jobThreadStackSize"));
		JOB_QUEUE_CAPACITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jobQueueCapacity"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		P_VFS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pVFS"));
		PP_CUSTOM_DECODING_BACKEND_VTABLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ppCustomDecodingBackendVTables"));
		CUSTOM_DECODING_BACKEND_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("customDecodingBackendCount"));
		P_CUSTOM_DECODING_BACKEND_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCustomDecodingBackendUserData"));
		RESAMPLING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resampling"));
		//@formatter:on
	}

	public MaResourceManagerConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaResourceManagerConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaResourceManagerConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    allocationCallbacks = new MaAllocationCallbacks(segment.asSlice(ALLOCATION_CALLBACKS_BYTE_OFFSET, MaAllocationCallbacks.LAYOUT));
	    resampling = new MaResamplerConfig(segment.asSlice(RESAMPLING_BYTE_OFFSET, MaResamplerConfig.LAYOUT));
	}

    /// @see #allocationCallbacks()
    public MaResourceManagerConfig allocationCallbacks(Consumer<MaAllocationCallbacks> consumer) {
    	consumer.accept(allocationCallbacks);
    	return this;
    }
    
    /// @see #allocationCallbacks()
    public MaResourceManagerConfig allocationCallbacks(MaAllocationCallbacks other) {
    	allocationCallbacks.set(other);
    	return this;
    }
    
    public MaAllocationCallbacks allocationCallbacks() {
    	return allocationCallbacks;
    }
    
    /// @see #pLog()
    public MaResourceManagerConfig pLog(MaLog pLog) {
    	P_LOG_HANDLE.set(segment, 0L, pLog.memorySegment());
    	return this;
    }
    
    public @Nullable MaLog pLog() {
    	MemorySegment segment = (MemorySegment) P_LOG_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLog(segment);
    }
    
    /// @see #decodedFormat()
    public MaResourceManagerConfig decodedFormat(int decodedFormat) {
    	DECODED_FORMAT_HANDLE.set(segment, 0L, decodedFormat);
    	return this;
    }
    
    public int decodedFormat() {
    	return (int) DECODED_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #decodedChannels()
    public MaResourceManagerConfig decodedChannels(int decodedChannels) {
    	DECODED_CHANNELS_HANDLE.set(segment, 0L, decodedChannels);
    	return this;
    }
    
    public int decodedChannels() {
    	return (int) DECODED_CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #decodedSampleRate()
    public MaResourceManagerConfig decodedSampleRate(int decodedSampleRate) {
    	DECODED_SAMPLE_RATE_HANDLE.set(segment, 0L, decodedSampleRate);
    	return this;
    }
    
    public int decodedSampleRate() {
    	return (int) DECODED_SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #jobThreadCount()
    public MaResourceManagerConfig jobThreadCount(int jobThreadCount) {
    	JOB_THREAD_COUNT_HANDLE.set(segment, 0L, jobThreadCount);
    	return this;
    }
    
    public int jobThreadCount() {
    	return (int) JOB_THREAD_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #jobThreadStackSize()
    public MaResourceManagerConfig jobThreadStackSize(long jobThreadStackSize) {
    	JOB_THREAD_STACK_SIZE_HANDLE.set(segment, 0L, jobThreadStackSize);
    	return this;
    }
    
    public long jobThreadStackSize() {
    	return (long) JOB_THREAD_STACK_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #jobQueueCapacity()
    public MaResourceManagerConfig jobQueueCapacity(int jobQueueCapacity) {
    	JOB_QUEUE_CAPACITY_HANDLE.set(segment, 0L, jobQueueCapacity);
    	return this;
    }
    
    public int jobQueueCapacity() {
    	return (int) JOB_QUEUE_CAPACITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public MaResourceManagerConfig flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pVFS()
    public MaResourceManagerConfig pVFS(MemorySegment pVFS) {
    	P_VFS_HANDLE.set(segment, 0L, pVFS);
    	return this;
    }
    
    public @Nullable MemorySegment pVFS() {
    	MemorySegment segment = (MemorySegment) P_VFS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #ppCustomDecodingBackendVTables()
    public MaResourceManagerConfig ppCustomDecodingBackendVTables(NativePointerArray ppCustomDecodingBackendVTables) {
    	PP_CUSTOM_DECODING_BACKEND_VTABLES_HANDLE.set(segment, 0L, ppCustomDecodingBackendVTables.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray ppCustomDecodingBackendVTables() {
    	MemorySegment segment = (MemorySegment) PP_CUSTOM_DECODING_BACKEND_VTABLES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #customDecodingBackendCount()
    public MaResourceManagerConfig customDecodingBackendCount(int customDecodingBackendCount) {
    	CUSTOM_DECODING_BACKEND_COUNT_HANDLE.set(segment, 0L, customDecodingBackendCount);
    	return this;
    }
    
    public int customDecodingBackendCount() {
    	return (int) CUSTOM_DECODING_BACKEND_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCustomDecodingBackendUserData()
    public MaResourceManagerConfig pCustomDecodingBackendUserData(MemorySegment pCustomDecodingBackendUserData) {
    	P_CUSTOM_DECODING_BACKEND_USER_DATA_HANDLE.set(segment, 0L, pCustomDecodingBackendUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pCustomDecodingBackendUserData() {
    	MemorySegment segment = (MemorySegment) P_CUSTOM_DECODING_BACKEND_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #resampling()
    public MaResourceManagerConfig resampling(Consumer<MaResamplerConfig> consumer) {
    	consumer.accept(resampling);
    	return this;
    }
    
    /// @see #resampling()
    public MaResourceManagerConfig resampling(MaResamplerConfig other) {
    	resampling.set(other);
    	return this;
    }
    
    public MaResamplerConfig resampling() {
    	return resampling;
    }
    
    @Override
    public MaResourceManagerConfig set(MaResourceManagerConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaResourceManagerConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaResourceManagerConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaResourceManagerConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManagerConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaResourceManagerConfig> array(Arena arena, MaResourceManagerConfig... structs) {
        NativeStructArray<MaResourceManagerConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManagerConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaResourceManagerConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaResourceManagerConfig(segment)
        );
    }

}