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
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaSound
		implements Struct<MaSound> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_DATA_SOURCE_HANDLE;
	public static final VarHandle SEEK_TARGET_HANDLE;
	public static final VarHandle AT_END_HANDLE;
	public static final VarHandle END_CALLBACK_HANDLE;
	public static final VarHandle P_END_CALLBACK_USER_DATA_HANDLE;
	public static final VarHandle P_PROCESSING_CACHE_HANDLE;
	public static final VarHandle PROCESSING_CACHE_FRAMES_REMAINING_HANDLE;
	public static final VarHandle PROCESSING_CACHE_CAP_HANDLE;
	public static final VarHandle OWNS_DATA_SOURCE_HANDLE;
	public static final VarHandle P_RESOURCE_MANAGER_DATA_SOURCE_HANDLE;

	public static final long ENGINE_NODE_BYTE_OFFSET;
	public static final long P_DATA_SOURCE_BYTE_OFFSET;
	public static final long SEEK_TARGET_BYTE_OFFSET;
	public static final long AT_END_BYTE_OFFSET;
	public static final long END_CALLBACK_BYTE_OFFSET;
	public static final long P_END_CALLBACK_USER_DATA_BYTE_OFFSET;
	public static final long P_PROCESSING_CACHE_BYTE_OFFSET;
	public static final long PROCESSING_CACHE_FRAMES_REMAINING_BYTE_OFFSET;
	public static final long PROCESSING_CACHE_CAP_BYTE_OFFSET;
	public static final long OWNS_DATA_SOURCE_BYTE_OFFSET;
	public static final long P_RESOURCE_MANAGER_DATA_SOURCE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaEngineNode engineNode;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaEngineNode.LAYOUT.withName("engineNode"),
		    UNBOUNDED_ADDRESS.withName("pDataSource"),
		    JAVA_LONG.withName("seekTarget"),
		    JAVA_INT.withName("atEnd"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("endCallback"),
		    UNBOUNDED_ADDRESS.withName("pEndCallbackUserData"),
		    UNBOUNDED_ADDRESS.withName("pProcessingCache"),
		    JAVA_INT.withName("processingCacheFramesRemaining"),
		    JAVA_INT.withName("processingCacheCap"),
		    JAVA_BYTE.withName("ownsDataSource"),
		    MemoryLayout.paddingLayout(7),
		    UNBOUNDED_ADDRESS.withName("pResourceManagerDataSource")
		).withName("ma_sound").withByteAlignment(8);
		
		P_DATA_SOURCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDataSource"));
		SEEK_TARGET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("seekTarget"));
		AT_END_HANDLE = LAYOUT.varHandle(PathElement.groupElement("atEnd"));
		END_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("endCallback"));
		P_END_CALLBACK_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pEndCallbackUserData"));
		P_PROCESSING_CACHE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pProcessingCache"));
		PROCESSING_CACHE_FRAMES_REMAINING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("processingCacheFramesRemaining"));
		PROCESSING_CACHE_CAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("processingCacheCap"));
		OWNS_DATA_SOURCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ownsDataSource"));
		P_RESOURCE_MANAGER_DATA_SOURCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pResourceManagerDataSource"));
		
		ENGINE_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("engineNode"));
		P_DATA_SOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDataSource"));
		SEEK_TARGET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seekTarget"));
		AT_END_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("atEnd"));
		END_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("endCallback"));
		P_END_CALLBACK_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pEndCallbackUserData"));
		P_PROCESSING_CACHE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pProcessingCache"));
		PROCESSING_CACHE_FRAMES_REMAINING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("processingCacheFramesRemaining"));
		PROCESSING_CACHE_CAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("processingCacheCap"));
		OWNS_DATA_SOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ownsDataSource"));
		P_RESOURCE_MANAGER_DATA_SOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pResourceManagerDataSource"));
		//@formatter:on
	}

	public MaSound() {
	    this(Arena.ofAuto());
	}
	
	public MaSound(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaSound(MemorySegment segment) {
	    this.segment = segment;
	
	    engineNode = new MaEngineNode(segment.asSlice(ENGINE_NODE_BYTE_OFFSET, MaEngineNode.LAYOUT));
	}

    /// @see #engineNode()
    public MaSound engineNode(Consumer<MaEngineNode> consumer) {
    	consumer.accept(engineNode);
    	return this;
    }
    
    /// @see #engineNode()
    public MaSound engineNode(MaEngineNode other) {
    	engineNode.set(other);
    	return this;
    }
    
    public MaEngineNode engineNode() {
    	return engineNode;
    }
    
    /// @see #pDataSource()
    public MaSound pDataSource(MemorySegment pDataSource) {
    	P_DATA_SOURCE_HANDLE.set(segment, 0L, pDataSource);
    	return this;
    }
    
    public @Nullable MemorySegment pDataSource() {
    	MemorySegment segment = (MemorySegment) P_DATA_SOURCE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #seekTarget()
    public MaSound seekTarget(long seekTarget) {
    	SEEK_TARGET_HANDLE.set(segment, 0L, seekTarget);
    	return this;
    }
    
    public long seekTarget() {
    	return (long) SEEK_TARGET_HANDLE.get(segment, 0L);
    }
    
    /// @see #atEnd()
    public MaSound atEnd(int atEnd) {
    	AT_END_HANDLE.set(segment, 0L, atEnd);
    	return this;
    }
    
    public int atEnd() {
    	return (int) AT_END_HANDLE.get(segment, 0L);
    }
    
    /// @see #endCallback()
    public MaSound endCallback(MaSoundEndProc endCallback) {
    	END_CALLBACK_HANDLE.set(segment, 0L, endCallback.memorySegment());
    	return this;
    }
    
    public @Nullable MaSoundEndProc endCallback() {
    	MemorySegment segment = (MemorySegment) END_CALLBACK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaSoundEndProc.get(segment);
    }
    
    /// @see #pEndCallbackUserData()
    public MaSound pEndCallbackUserData(MemorySegment pEndCallbackUserData) {
    	P_END_CALLBACK_USER_DATA_HANDLE.set(segment, 0L, pEndCallbackUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pEndCallbackUserData() {
    	MemorySegment segment = (MemorySegment) P_END_CALLBACK_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pProcessingCache()
    public MaSound pProcessingCache(NativeFloatArray pProcessingCache) {
    	P_PROCESSING_CACHE_HANDLE.set(segment, 0L, pProcessingCache.memorySegment());
    	return this;
    }
    
    public @Nullable NativeFloatArray pProcessingCache() {
    	MemorySegment segment = (MemorySegment) P_PROCESSING_CACHE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    /// @see #processingCacheFramesRemaining()
    public MaSound processingCacheFramesRemaining(int processingCacheFramesRemaining) {
    	PROCESSING_CACHE_FRAMES_REMAINING_HANDLE.set(segment, 0L, processingCacheFramesRemaining);
    	return this;
    }
    
    public int processingCacheFramesRemaining() {
    	return (int) PROCESSING_CACHE_FRAMES_REMAINING_HANDLE.get(segment, 0L);
    }
    
    /// @see #processingCacheCap()
    public MaSound processingCacheCap(int processingCacheCap) {
    	PROCESSING_CACHE_CAP_HANDLE.set(segment, 0L, processingCacheCap);
    	return this;
    }
    
    public int processingCacheCap() {
    	return (int) PROCESSING_CACHE_CAP_HANDLE.get(segment, 0L);
    }
    
    /// @see #ownsDataSource()
    public MaSound ownsDataSource(byte ownsDataSource) {
    	OWNS_DATA_SOURCE_HANDLE.set(segment, 0L, ownsDataSource);
    	return this;
    }
    
    public byte ownsDataSource() {
    	return (byte) OWNS_DATA_SOURCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pResourceManagerDataSource()
    public MaSound pResourceManagerDataSource(MaResourceManagerDataSource pResourceManagerDataSource) {
    	P_RESOURCE_MANAGER_DATA_SOURCE_HANDLE.set(segment, 0L, pResourceManagerDataSource.memorySegment());
    	return this;
    }
    
    public @Nullable MaResourceManagerDataSource pResourceManagerDataSource() {
    	MemorySegment segment = (MemorySegment) P_RESOURCE_MANAGER_DATA_SOURCE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResourceManagerDataSource(segment);
    }
    
    @Override
    public MaSound set(MaSound other) {
        return set(other.segment);
    }
    
    @Override
    public MaSound set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaSound> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaSound> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaSound(segment),
            count
        );
    }
    
    public static NativeStructArray<MaSound> array(Arena arena, MaSound... structs) {
        NativeStructArray<MaSound> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaSound(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaSound> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaSound(segment)
        );
    }

}