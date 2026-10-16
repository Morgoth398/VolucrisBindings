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

public final class MaResourceManagerDataStream
		implements Struct<MaResourceManagerDataStream> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_RESOURCE_MANAGER_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle IS_DECODER_INITIALIZED_HANDLE;
	public static final VarHandle TOTAL_LENGTH_IN_PCMFRAMES_HANDLE;
	public static final VarHandle RELATIVE_CURSOR_HANDLE;
	public static final VarHandle ABSOLUTE_CURSOR_HANDLE;
	public static final VarHandle CURRENT_PAGE_INDEX_HANDLE;
	public static final VarHandle EXECUTION_COUNTER_HANDLE;
	public static final VarHandle EXECUTION_POINTER_HANDLE;
	public static final VarHandle IS_LOOPING_HANDLE;
	public static final VarHandle P_PAGE_DATA_HANDLE;
	public static final VarHandle PAGE_FRAME_COUNT_HANDLE;
	public static final VarHandle RESULT_HANDLE;
	public static final VarHandle IS_DECODER_AT_END_HANDLE;
	public static final VarHandle IS_PAGE_VALID_HANDLE;
	public static final VarHandle SEEK_COUNTER_HANDLE;

	public static final long DS_BYTE_OFFSET;
	public static final long P_RESOURCE_MANAGER_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long DECODER_BYTE_OFFSET;
	public static final long IS_DECODER_INITIALIZED_BYTE_OFFSET;
	public static final long TOTAL_LENGTH_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long RELATIVE_CURSOR_BYTE_OFFSET;
	public static final long ABSOLUTE_CURSOR_BYTE_OFFSET;
	public static final long CURRENT_PAGE_INDEX_BYTE_OFFSET;
	public static final long EXECUTION_COUNTER_BYTE_OFFSET;
	public static final long EXECUTION_POINTER_BYTE_OFFSET;
	public static final long IS_LOOPING_BYTE_OFFSET;
	public static final long P_PAGE_DATA_BYTE_OFFSET;
	public static final long PAGE_FRAME_COUNT_BYTE_OFFSET;
	public static final long RESULT_BYTE_OFFSET;
	public static final long IS_DECODER_AT_END_BYTE_OFFSET;
	public static final long IS_PAGE_VALID_BYTE_OFFSET;
	public static final long SEEK_COUNTER_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaDataSourceBase ds;
	private final MaDecoder decoder;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaDataSourceBase.LAYOUT.withName("ds"),
		    UNBOUNDED_ADDRESS.withName("pResourceManager"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    MaDecoder.LAYOUT.withName("decoder"),
		    JAVA_INT.withName("isDecoderInitialized"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("totalLengthInPCMFrames"),
		    JAVA_INT.withName("relativeCursor"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("absoluteCursor"),
		    JAVA_INT.withName("currentPageIndex"),
		    JAVA_INT.withName("executionCounter"),
		    JAVA_INT.withName("executionPointer"),
		    JAVA_INT.withName("isLooping"),
		    UNBOUNDED_ADDRESS.withName("pPageData"),
		    MemoryLayout.sequenceLayout(2, JAVA_INT).withName("pageFrameCount"),
		    JAVA_INT.withName("result"),
		    JAVA_INT.withName("isDecoderAtEnd"),
		    MemoryLayout.sequenceLayout(2, JAVA_INT).withName("isPageValid"),
		    JAVA_INT.withName("seekCounter"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_resource_manager_data_stream").withByteAlignment(8);
		
		P_RESOURCE_MANAGER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pResourceManager"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		IS_DECODER_INITIALIZED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isDecoderInitialized"));
		TOTAL_LENGTH_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("totalLengthInPCMFrames"));
		RELATIVE_CURSOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("relativeCursor"));
		ABSOLUTE_CURSOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("absoluteCursor"));
		CURRENT_PAGE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("currentPageIndex"));
		EXECUTION_COUNTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("executionCounter"));
		EXECUTION_POINTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("executionPointer"));
		IS_LOOPING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isLooping"));
		P_PAGE_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPageData"));
		PAGE_FRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pageFrameCount"), PathElement.sequenceElement());
		RESULT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("result"));
		IS_DECODER_AT_END_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isDecoderAtEnd"));
		IS_PAGE_VALID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isPageValid"), PathElement.sequenceElement());
		SEEK_COUNTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("seekCounter"));
		
		DS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ds"));
		P_RESOURCE_MANAGER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pResourceManager"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		DECODER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("decoder"));
		IS_DECODER_INITIALIZED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isDecoderInitialized"));
		TOTAL_LENGTH_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("totalLengthInPCMFrames"));
		RELATIVE_CURSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("relativeCursor"));
		ABSOLUTE_CURSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("absoluteCursor"));
		CURRENT_PAGE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("currentPageIndex"));
		EXECUTION_COUNTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("executionCounter"));
		EXECUTION_POINTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("executionPointer"));
		IS_LOOPING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isLooping"));
		P_PAGE_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPageData"));
		PAGE_FRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pageFrameCount"));
		RESULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("result"));
		IS_DECODER_AT_END_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isDecoderAtEnd"));
		IS_PAGE_VALID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isPageValid"));
		SEEK_COUNTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seekCounter"));
		//@formatter:on
	}

	public MaResourceManagerDataStream() {
	    this(Arena.ofAuto());
	}
	
	public MaResourceManagerDataStream(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaResourceManagerDataStream(MemorySegment segment) {
	    this.segment = segment;
	
	    ds = new MaDataSourceBase(segment.asSlice(DS_BYTE_OFFSET, MaDataSourceBase.LAYOUT));
	    decoder = new MaDecoder(segment.asSlice(DECODER_BYTE_OFFSET, MaDecoder.LAYOUT));
	}

    /// @see #ds()
    public MaResourceManagerDataStream ds(Consumer<MaDataSourceBase> consumer) {
    	consumer.accept(ds);
    	return this;
    }
    
    /// @see #ds()
    public MaResourceManagerDataStream ds(MaDataSourceBase other) {
    	ds.set(other);
    	return this;
    }
    
    public MaDataSourceBase ds() {
    	return ds;
    }
    
    /// @see #pResourceManager()
    public MaResourceManagerDataStream pResourceManager(MaResourceManager pResourceManager) {
    	P_RESOURCE_MANAGER_HANDLE.set(segment, 0L, pResourceManager.memorySegment());
    	return this;
    }
    
    public @Nullable MaResourceManager pResourceManager() {
    	MemorySegment segment = (MemorySegment) P_RESOURCE_MANAGER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResourceManager(segment);
    }
    
    /// @see #flags()
    public MaResourceManagerDataStream flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #decoder()
    public MaResourceManagerDataStream decoder(Consumer<MaDecoder> consumer) {
    	consumer.accept(decoder);
    	return this;
    }
    
    /// @see #decoder()
    public MaResourceManagerDataStream decoder(MaDecoder other) {
    	decoder.set(other);
    	return this;
    }
    
    public MaDecoder decoder() {
    	return decoder;
    }
    
    /// @see #isDecoderInitialized()
    public MaResourceManagerDataStream isDecoderInitialized(int isDecoderInitialized) {
    	IS_DECODER_INITIALIZED_HANDLE.set(segment, 0L, isDecoderInitialized);
    	return this;
    }
    
    public int isDecoderInitialized() {
    	return (int) IS_DECODER_INITIALIZED_HANDLE.get(segment, 0L);
    }
    
    /// @see #totalLengthInPCMFrames()
    public MaResourceManagerDataStream totalLengthInPCMFrames(long totalLengthInPCMFrames) {
    	TOTAL_LENGTH_IN_PCMFRAMES_HANDLE.set(segment, 0L, totalLengthInPCMFrames);
    	return this;
    }
    
    public long totalLengthInPCMFrames() {
    	return (long) TOTAL_LENGTH_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #relativeCursor()
    public MaResourceManagerDataStream relativeCursor(int relativeCursor) {
    	RELATIVE_CURSOR_HANDLE.set(segment, 0L, relativeCursor);
    	return this;
    }
    
    public int relativeCursor() {
    	return (int) RELATIVE_CURSOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #absoluteCursor()
    public MaResourceManagerDataStream absoluteCursor(long absoluteCursor) {
    	ABSOLUTE_CURSOR_HANDLE.set(segment, 0L, absoluteCursor);
    	return this;
    }
    
    public long absoluteCursor() {
    	return (long) ABSOLUTE_CURSOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #currentPageIndex()
    public MaResourceManagerDataStream currentPageIndex(int currentPageIndex) {
    	CURRENT_PAGE_INDEX_HANDLE.set(segment, 0L, currentPageIndex);
    	return this;
    }
    
    public int currentPageIndex() {
    	return (int) CURRENT_PAGE_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #executionCounter()
    public MaResourceManagerDataStream executionCounter(int executionCounter) {
    	EXECUTION_COUNTER_HANDLE.set(segment, 0L, executionCounter);
    	return this;
    }
    
    public int executionCounter() {
    	return (int) EXECUTION_COUNTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #executionPointer()
    public MaResourceManagerDataStream executionPointer(int executionPointer) {
    	EXECUTION_POINTER_HANDLE.set(segment, 0L, executionPointer);
    	return this;
    }
    
    public int executionPointer() {
    	return (int) EXECUTION_POINTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #isLooping()
    public MaResourceManagerDataStream isLooping(int isLooping) {
    	IS_LOOPING_HANDLE.set(segment, 0L, isLooping);
    	return this;
    }
    
    public int isLooping() {
    	return (int) IS_LOOPING_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPageData()
    public MaResourceManagerDataStream pPageData(MemorySegment pPageData) {
    	P_PAGE_DATA_HANDLE.set(segment, 0L, pPageData);
    	return this;
    }
    
    public @Nullable MemorySegment pPageData() {
    	MemorySegment segment = (MemorySegment) P_PAGE_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pageFrameCount(int)
    public MaResourceManagerDataStream pageFrameCount(int pageFrameCount, int index0) {
    	PAGE_FRAME_COUNT_HANDLE.set(segment, 0L, index0, pageFrameCount);
    	return this;
    }
    
    public int pageFrameCount(int index0) {
    	return (int) PAGE_FRAME_COUNT_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #result()
    public MaResourceManagerDataStream result(int result) {
    	RESULT_HANDLE.set(segment, 0L, result);
    	return this;
    }
    
    public int result() {
    	return (int) RESULT_HANDLE.get(segment, 0L);
    }
    
    /// @see #isDecoderAtEnd()
    public MaResourceManagerDataStream isDecoderAtEnd(int isDecoderAtEnd) {
    	IS_DECODER_AT_END_HANDLE.set(segment, 0L, isDecoderAtEnd);
    	return this;
    }
    
    public int isDecoderAtEnd() {
    	return (int) IS_DECODER_AT_END_HANDLE.get(segment, 0L);
    }
    
    /// @see #isPageValid(int)
    public MaResourceManagerDataStream isPageValid(int isPageValid, int index0) {
    	IS_PAGE_VALID_HANDLE.set(segment, 0L, index0, isPageValid);
    	return this;
    }
    
    public int isPageValid(int index0) {
    	return (int) IS_PAGE_VALID_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #seekCounter()
    public MaResourceManagerDataStream seekCounter(int seekCounter) {
    	SEEK_COUNTER_HANDLE.set(segment, 0L, seekCounter);
    	return this;
    }
    
    public int seekCounter() {
    	return (int) SEEK_COUNTER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaResourceManagerDataStream set(MaResourceManagerDataStream other) {
        return set(other.segment);
    }
    
    @Override
    public MaResourceManagerDataStream set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaResourceManagerDataStream> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaResourceManagerDataStream> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManagerDataStream(segment),
            count
        );
    }
    
    public static NativeStructArray<MaResourceManagerDataStream> array(Arena arena, MaResourceManagerDataStream... structs) {
        NativeStructArray<MaResourceManagerDataStream> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManagerDataStream(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaResourceManagerDataStream> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaResourceManagerDataStream(segment)
        );
    }

}