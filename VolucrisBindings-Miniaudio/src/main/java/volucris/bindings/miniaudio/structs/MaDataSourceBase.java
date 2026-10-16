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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaDataSourceBase
		implements Struct<MaDataSourceBase> {

	public static final StructLayout LAYOUT;

	public static final VarHandle VTABLE_HANDLE;
	public static final VarHandle RANGE_BEG_IN_FRAMES_HANDLE;
	public static final VarHandle RANGE_END_IN_FRAMES_HANDLE;
	public static final VarHandle LOOP_BEG_IN_FRAMES_HANDLE;
	public static final VarHandle LOOP_END_IN_FRAMES_HANDLE;
	public static final VarHandle P_CURRENT_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ON_GET_NEXT_HANDLE;
	public static final VarHandle IS_LOOPING_HANDLE;

	public static final long VTABLE_BYTE_OFFSET;
	public static final long RANGE_BEG_IN_FRAMES_BYTE_OFFSET;
	public static final long RANGE_END_IN_FRAMES_BYTE_OFFSET;
	public static final long LOOP_BEG_IN_FRAMES_BYTE_OFFSET;
	public static final long LOOP_END_IN_FRAMES_BYTE_OFFSET;
	public static final long P_CURRENT_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ON_GET_NEXT_BYTE_OFFSET;
	public static final long IS_LOOPING_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("vtable"),
		    JAVA_LONG.withName("rangeBegInFrames"),
		    JAVA_LONG.withName("rangeEndInFrames"),
		    JAVA_LONG.withName("loopBegInFrames"),
		    JAVA_LONG.withName("loopEndInFrames"),
		    UNBOUNDED_ADDRESS.withName("pCurrent"),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("onGetNext"),
		    JAVA_INT.withName("isLooping"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_data_source_base").withByteAlignment(8);
		
		VTABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vtable"));
		RANGE_BEG_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rangeBegInFrames"));
		RANGE_END_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rangeEndInFrames"));
		LOOP_BEG_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loopBegInFrames"));
		LOOP_END_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loopEndInFrames"));
		P_CURRENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCurrent"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ON_GET_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onGetNext"));
		IS_LOOPING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isLooping"));
		
		VTABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vtable"));
		RANGE_BEG_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rangeBegInFrames"));
		RANGE_END_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rangeEndInFrames"));
		LOOP_BEG_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loopBegInFrames"));
		LOOP_END_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loopEndInFrames"));
		P_CURRENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCurrent"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ON_GET_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onGetNext"));
		IS_LOOPING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isLooping"));
		//@formatter:on
	}

	public MaDataSourceBase() {
	    this(Arena.ofAuto());
	}
	
	public MaDataSourceBase(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaDataSourceBase(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #vtable()
    public MaDataSourceBase vtable(MaDataSourceVtable vtable) {
    	VTABLE_HANDLE.set(segment, 0L, vtable.memorySegment());
    	return this;
    }
    
    public @Nullable MaDataSourceVtable vtable() {
    	MemorySegment segment = (MemorySegment) VTABLE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDataSourceVtable(segment);
    }
    
    /// @see #rangeBegInFrames()
    public MaDataSourceBase rangeBegInFrames(long rangeBegInFrames) {
    	RANGE_BEG_IN_FRAMES_HANDLE.set(segment, 0L, rangeBegInFrames);
    	return this;
    }
    
    public long rangeBegInFrames() {
    	return (long) RANGE_BEG_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #rangeEndInFrames()
    public MaDataSourceBase rangeEndInFrames(long rangeEndInFrames) {
    	RANGE_END_IN_FRAMES_HANDLE.set(segment, 0L, rangeEndInFrames);
    	return this;
    }
    
    public long rangeEndInFrames() {
    	return (long) RANGE_END_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #loopBegInFrames()
    public MaDataSourceBase loopBegInFrames(long loopBegInFrames) {
    	LOOP_BEG_IN_FRAMES_HANDLE.set(segment, 0L, loopBegInFrames);
    	return this;
    }
    
    public long loopBegInFrames() {
    	return (long) LOOP_BEG_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #loopEndInFrames()
    public MaDataSourceBase loopEndInFrames(long loopEndInFrames) {
    	LOOP_END_IN_FRAMES_HANDLE.set(segment, 0L, loopEndInFrames);
    	return this;
    }
    
    public long loopEndInFrames() {
    	return (long) LOOP_END_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCurrent()
    public MaDataSourceBase pCurrent(MemorySegment pCurrent) {
    	P_CURRENT_HANDLE.set(segment, 0L, pCurrent);
    	return this;
    }
    
    public @Nullable MemorySegment pCurrent() {
    	MemorySegment segment = (MemorySegment) P_CURRENT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pNext()
    public MaDataSourceBase pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #onGetNext()
    public MaDataSourceBase onGetNext(MaDataSourceGetNextProc onGetNext) {
    	ON_GET_NEXT_HANDLE.set(segment, 0L, onGetNext.memorySegment());
    	return this;
    }
    
    public @Nullable MaDataSourceGetNextProc onGetNext() {
    	MemorySegment segment = (MemorySegment) ON_GET_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDataSourceGetNextProc.get(segment);
    }
    
    /// @see #isLooping()
    public MaDataSourceBase isLooping(int isLooping) {
    	IS_LOOPING_HANDLE.set(segment, 0L, isLooping);
    	return this;
    }
    
    public int isLooping() {
    	return (int) IS_LOOPING_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaDataSourceBase set(MaDataSourceBase other) {
        return set(other.segment);
    }
    
    @Override
    public MaDataSourceBase set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDataSourceBase> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDataSourceBase> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDataSourceBase(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDataSourceBase> array(Arena arena, MaDataSourceBase... structs) {
        NativeStructArray<MaDataSourceBase> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDataSourceBase(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDataSourceBase> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDataSourceBase(segment)
        );
    }

}