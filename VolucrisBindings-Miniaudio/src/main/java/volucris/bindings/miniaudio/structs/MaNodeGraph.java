/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaNodeGraph
		implements Struct<MaNodeGraph> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_PROCESSING_CACHE_HANDLE;
	public static final VarHandle PROCESSING_CACHE_FRAMES_REMAINING_HANDLE;
	public static final VarHandle PROCESSING_SIZE_IN_FRAMES_HANDLE;
	public static final VarHandle IS_READING_HANDLE;
	public static final VarHandle P_PRE_MIX_STACK_HANDLE;

	public static final long BASE_BYTE_OFFSET;
	public static final long ENDPOINT_BYTE_OFFSET;
	public static final long P_PROCESSING_CACHE_BYTE_OFFSET;
	public static final long PROCESSING_CACHE_FRAMES_REMAINING_BYTE_OFFSET;
	public static final long PROCESSING_SIZE_IN_FRAMES_BYTE_OFFSET;
	public static final long IS_READING_BYTE_OFFSET;
	public static final long P_PRE_MIX_STACK_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeBase base;
	private final MaNodeBase endpoint;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeBase.LAYOUT.withName("base"),
		    MaNodeBase.LAYOUT.withName("endpoint"),
		    UNBOUNDED_ADDRESS.withName("pProcessingCache"),
		    JAVA_INT.withName("processingCacheFramesRemaining"),
		    JAVA_INT.withName("processingSizeInFrames"),
		    JAVA_INT.withName("isReading"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pPreMixStack")
		).withName("ma_node_graph").withByteAlignment(8);
		
		P_PROCESSING_CACHE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pProcessingCache"));
		PROCESSING_CACHE_FRAMES_REMAINING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("processingCacheFramesRemaining"));
		PROCESSING_SIZE_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("processingSizeInFrames"));
		IS_READING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isReading"));
		P_PRE_MIX_STACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPreMixStack"));
		
		BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
		ENDPOINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("endpoint"));
		P_PROCESSING_CACHE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pProcessingCache"));
		PROCESSING_CACHE_FRAMES_REMAINING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("processingCacheFramesRemaining"));
		PROCESSING_SIZE_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("processingSizeInFrames"));
		IS_READING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isReading"));
		P_PRE_MIX_STACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPreMixStack"));
		//@formatter:on
	}

	public MaNodeGraph() {
	    this(Arena.ofAuto());
	}
	
	public MaNodeGraph(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaNodeGraph(MemorySegment segment) {
	    this.segment = segment;
	
	    base = new MaNodeBase(segment.asSlice(BASE_BYTE_OFFSET, MaNodeBase.LAYOUT));
	    endpoint = new MaNodeBase(segment.asSlice(ENDPOINT_BYTE_OFFSET, MaNodeBase.LAYOUT));
	}

    /// @see #base()
    public MaNodeGraph base(Consumer<MaNodeBase> consumer) {
    	consumer.accept(base);
    	return this;
    }
    
    /// @see #base()
    public MaNodeGraph base(MaNodeBase other) {
    	base.set(other);
    	return this;
    }
    
    public MaNodeBase base() {
    	return base;
    }
    
    /// @see #endpoint()
    public MaNodeGraph endpoint(Consumer<MaNodeBase> consumer) {
    	consumer.accept(endpoint);
    	return this;
    }
    
    /// @see #endpoint()
    public MaNodeGraph endpoint(MaNodeBase other) {
    	endpoint.set(other);
    	return this;
    }
    
    public MaNodeBase endpoint() {
    	return endpoint;
    }
    
    /// @see #pProcessingCache()
    public MaNodeGraph pProcessingCache(NativeFloatArray pProcessingCache) {
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
    public MaNodeGraph processingCacheFramesRemaining(int processingCacheFramesRemaining) {
    	PROCESSING_CACHE_FRAMES_REMAINING_HANDLE.set(segment, 0L, processingCacheFramesRemaining);
    	return this;
    }
    
    public int processingCacheFramesRemaining() {
    	return (int) PROCESSING_CACHE_FRAMES_REMAINING_HANDLE.get(segment, 0L);
    }
    
    /// @see #processingSizeInFrames()
    public MaNodeGraph processingSizeInFrames(int processingSizeInFrames) {
    	PROCESSING_SIZE_IN_FRAMES_HANDLE.set(segment, 0L, processingSizeInFrames);
    	return this;
    }
    
    public int processingSizeInFrames() {
    	return (int) PROCESSING_SIZE_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #isReading()
    public MaNodeGraph isReading(int isReading) {
    	IS_READING_HANDLE.set(segment, 0L, isReading);
    	return this;
    }
    
    public int isReading() {
    	return (int) IS_READING_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPreMixStack()
    public MaNodeGraph pPreMixStack(MaStack pPreMixStack) {
    	P_PRE_MIX_STACK_HANDLE.set(segment, 0L, pPreMixStack.memorySegment());
    	return this;
    }
    
    public @Nullable MaStack pPreMixStack() {
    	MemorySegment segment = (MemorySegment) P_PRE_MIX_STACK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaStack(segment);
    }
    
    @Override
    public MaNodeGraph set(MaNodeGraph other) {
        return set(other.segment);
    }
    
    @Override
    public MaNodeGraph set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaNodeGraph> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaNodeGraph> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaNodeGraph(segment),
            count
        );
    }
    
    public static NativeStructArray<MaNodeGraph> array(SegmentAllocator allocator, MaNodeGraph... structs) {
        NativeStructArray<MaNodeGraph> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaNodeGraph(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaNodeGraph> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaNodeGraph(segment)
        );
    }

}