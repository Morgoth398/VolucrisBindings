/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeShortArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaResourceManagerDataSourceConfig
		implements Struct<MaResourceManagerDataSourceConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_FILE_PATH_HANDLE;
	public static final VarHandle P_FILE_PATH_W_HANDLE;
	public static final VarHandle P_NOTIFICATIONS_HANDLE;
	public static final VarHandle INITIAL_SEEK_POINT_IN_PCMFRAMES_HANDLE;
	public static final VarHandle RANGE_BEG_IN_PCMFRAMES_HANDLE;
	public static final VarHandle RANGE_END_IN_PCMFRAMES_HANDLE;
	public static final VarHandle LOOP_POINT_BEG_IN_PCMFRAMES_HANDLE;
	public static final VarHandle LOOP_POINT_END_IN_PCMFRAMES_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle IS_LOOPING_HANDLE;

	public static final long P_FILE_PATH_BYTE_OFFSET;
	public static final long P_FILE_PATH_W_BYTE_OFFSET;
	public static final long P_NOTIFICATIONS_BYTE_OFFSET;
	public static final long INITIAL_SEEK_POINT_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long RANGE_BEG_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long RANGE_END_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long LOOP_POINT_BEG_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long LOOP_POINT_END_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long IS_LOOPING_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pFilePath"),
		    UNBOUNDED_ADDRESS.withName("pFilePathW"),
		    UNBOUNDED_ADDRESS.withName("pNotifications"),
		    JAVA_LONG.withName("initialSeekPointInPCMFrames"),
		    JAVA_LONG.withName("rangeBegInPCMFrames"),
		    JAVA_LONG.withName("rangeEndInPCMFrames"),
		    JAVA_LONG.withName("loopPointBegInPCMFrames"),
		    JAVA_LONG.withName("loopPointEndInPCMFrames"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("isLooping")
		).withName("ma_resource_manager_data_source_config").withByteAlignment(8);
		
		P_FILE_PATH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pFilePath"));
		P_FILE_PATH_W_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pFilePathW"));
		P_NOTIFICATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNotifications"));
		INITIAL_SEEK_POINT_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("initialSeekPointInPCMFrames"));
		RANGE_BEG_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rangeBegInPCMFrames"));
		RANGE_END_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rangeEndInPCMFrames"));
		LOOP_POINT_BEG_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loopPointBegInPCMFrames"));
		LOOP_POINT_END_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loopPointEndInPCMFrames"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		IS_LOOPING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isLooping"));
		
		P_FILE_PATH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pFilePath"));
		P_FILE_PATH_W_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pFilePathW"));
		P_NOTIFICATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNotifications"));
		INITIAL_SEEK_POINT_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("initialSeekPointInPCMFrames"));
		RANGE_BEG_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rangeBegInPCMFrames"));
		RANGE_END_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rangeEndInPCMFrames"));
		LOOP_POINT_BEG_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loopPointBegInPCMFrames"));
		LOOP_POINT_END_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loopPointEndInPCMFrames"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		IS_LOOPING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isLooping"));
		//@formatter:on
	}

	public MaResourceManagerDataSourceConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaResourceManagerDataSourceConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaResourceManagerDataSourceConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #pFilePath()
    public MaResourceManagerDataSourceConfig pFilePath(NativeByteArray pFilePath) {
    	P_FILE_PATH_HANDLE.set(segment, 0L, pFilePath.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray pFilePath() {
    	MemorySegment segment = (MemorySegment) P_FILE_PATH_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #pFilePathW()
    public MaResourceManagerDataSourceConfig pFilePathW(NativeShortArray pFilePathW) {
    	P_FILE_PATH_W_HANDLE.set(segment, 0L, pFilePathW.memorySegment());
    	return this;
    }
    
    public @Nullable NativeShortArray pFilePathW() {
    	MemorySegment segment = (MemorySegment) P_FILE_PATH_W_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeShortArray(segment);
    }
    
    /// @see #pNotifications()
    public MaResourceManagerDataSourceConfig pNotifications(MaResourceManagerPipelineNotifications pNotifications) {
    	P_NOTIFICATIONS_HANDLE.set(segment, 0L, pNotifications.memorySegment());
    	return this;
    }
    
    public @Nullable MaResourceManagerPipelineNotifications pNotifications() {
    	MemorySegment segment = (MemorySegment) P_NOTIFICATIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResourceManagerPipelineNotifications(segment);
    }
    
    /// @see #initialSeekPointInPCMFrames()
    public MaResourceManagerDataSourceConfig initialSeekPointInPCMFrames(long initialSeekPointInPCMFrames) {
    	INITIAL_SEEK_POINT_IN_PCMFRAMES_HANDLE.set(segment, 0L, initialSeekPointInPCMFrames);
    	return this;
    }
    
    public long initialSeekPointInPCMFrames() {
    	return (long) INITIAL_SEEK_POINT_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #rangeBegInPCMFrames()
    public MaResourceManagerDataSourceConfig rangeBegInPCMFrames(long rangeBegInPCMFrames) {
    	RANGE_BEG_IN_PCMFRAMES_HANDLE.set(segment, 0L, rangeBegInPCMFrames);
    	return this;
    }
    
    public long rangeBegInPCMFrames() {
    	return (long) RANGE_BEG_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #rangeEndInPCMFrames()
    public MaResourceManagerDataSourceConfig rangeEndInPCMFrames(long rangeEndInPCMFrames) {
    	RANGE_END_IN_PCMFRAMES_HANDLE.set(segment, 0L, rangeEndInPCMFrames);
    	return this;
    }
    
    public long rangeEndInPCMFrames() {
    	return (long) RANGE_END_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #loopPointBegInPCMFrames()
    public MaResourceManagerDataSourceConfig loopPointBegInPCMFrames(long loopPointBegInPCMFrames) {
    	LOOP_POINT_BEG_IN_PCMFRAMES_HANDLE.set(segment, 0L, loopPointBegInPCMFrames);
    	return this;
    }
    
    public long loopPointBegInPCMFrames() {
    	return (long) LOOP_POINT_BEG_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #loopPointEndInPCMFrames()
    public MaResourceManagerDataSourceConfig loopPointEndInPCMFrames(long loopPointEndInPCMFrames) {
    	LOOP_POINT_END_IN_PCMFRAMES_HANDLE.set(segment, 0L, loopPointEndInPCMFrames);
    	return this;
    }
    
    public long loopPointEndInPCMFrames() {
    	return (long) LOOP_POINT_END_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public MaResourceManagerDataSourceConfig flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #isLooping()
    public MaResourceManagerDataSourceConfig isLooping(int isLooping) {
    	IS_LOOPING_HANDLE.set(segment, 0L, isLooping);
    	return this;
    }
    
    public int isLooping() {
    	return (int) IS_LOOPING_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaResourceManagerDataSourceConfig set(MaResourceManagerDataSourceConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaResourceManagerDataSourceConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaResourceManagerDataSourceConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaResourceManagerDataSourceConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManagerDataSourceConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaResourceManagerDataSourceConfig> array(Arena arena, MaResourceManagerDataSourceConfig... structs) {
        NativeStructArray<MaResourceManagerDataSourceConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManagerDataSourceConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaResourceManagerDataSourceConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaResourceManagerDataSourceConfig(segment)
        );
    }

}