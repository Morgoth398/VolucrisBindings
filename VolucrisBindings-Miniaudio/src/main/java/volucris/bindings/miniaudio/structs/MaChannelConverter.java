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
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaChannelConverter
		implements Struct<MaChannelConverter> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_IN_HANDLE;
	public static final VarHandle CHANNELS_OUT_HANDLE;
	public static final VarHandle MIXING_MODE_HANDLE;
	public static final VarHandle CONVERSION_PATH_HANDLE;
	public static final VarHandle P_CHANNEL_MAP_IN_HANDLE;
	public static final VarHandle P_CHANNEL_MAP_OUT_HANDLE;
	public static final VarHandle P_SHUFFLE_TABLE_HANDLE;
	public static final VarHandle _P_HEAP_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_IN_BYTE_OFFSET;
	public static final long CHANNELS_OUT_BYTE_OFFSET;
	public static final long MIXING_MODE_BYTE_OFFSET;
	public static final long CONVERSION_PATH_BYTE_OFFSET;
	public static final long P_CHANNEL_MAP_IN_BYTE_OFFSET;
	public static final long P_CHANNEL_MAP_OUT_BYTE_OFFSET;
	public static final long P_SHUFFLE_TABLE_BYTE_OFFSET;
	public static final long WEIGHTS_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	private final Weights weights;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channelsIn"),
		    JAVA_INT.withName("channelsOut"),
		    JAVA_INT.withName("mixingMode"),
		    JAVA_INT.withName("conversionPath"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pChannelMapIn"),
		    UNBOUNDED_ADDRESS.withName("pChannelMapOut"),
		    UNBOUNDED_ADDRESS.withName("pShuffleTable"),
		    Weights.LAYOUT.withName("weights"),
		    UNBOUNDED_ADDRESS.withName("_pHeap"),
		    JAVA_INT.withName("_ownsHeap"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_channel_converter").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelsIn"));
		CHANNELS_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelsOut"));
		MIXING_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mixingMode"));
		CONVERSION_PATH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("conversionPath"));
		P_CHANNEL_MAP_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pChannelMapIn"));
		P_CHANNEL_MAP_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pChannelMapOut"));
		P_SHUFFLE_TABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pShuffleTable"));
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelsIn"));
		CHANNELS_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelsOut"));
		MIXING_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mixingMode"));
		CONVERSION_PATH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("conversionPath"));
		P_CHANNEL_MAP_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pChannelMapIn"));
		P_CHANNEL_MAP_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pChannelMapOut"));
		P_SHUFFLE_TABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pShuffleTable"));
		WEIGHTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("weights"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		//@formatter:on
	}

	public MaChannelConverter() {
	    this(Arena.ofAuto());
	}
	
	public MaChannelConverter(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaChannelConverter(MemorySegment segment) {
	    this.segment = segment;
	
	    weights = new Weights(segment.asSlice(WEIGHTS_BYTE_OFFSET, Weights.LAYOUT));
	}

    /// @see #format()
    public MaChannelConverter format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channelsIn()
    public MaChannelConverter channelsIn(int channelsIn) {
    	CHANNELS_IN_HANDLE.set(segment, 0L, channelsIn);
    	return this;
    }
    
    public int channelsIn() {
    	return (int) CHANNELS_IN_HANDLE.get(segment, 0L);
    }
    
    /// @see #channelsOut()
    public MaChannelConverter channelsOut(int channelsOut) {
    	CHANNELS_OUT_HANDLE.set(segment, 0L, channelsOut);
    	return this;
    }
    
    public int channelsOut() {
    	return (int) CHANNELS_OUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #mixingMode()
    public MaChannelConverter mixingMode(int mixingMode) {
    	MIXING_MODE_HANDLE.set(segment, 0L, mixingMode);
    	return this;
    }
    
    public int mixingMode() {
    	return (int) MIXING_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #conversionPath()
    public MaChannelConverter conversionPath(int conversionPath) {
    	CONVERSION_PATH_HANDLE.set(segment, 0L, conversionPath);
    	return this;
    }
    
    public int conversionPath() {
    	return (int) CONVERSION_PATH_HANDLE.get(segment, 0L);
    }
    
    /// @see #pChannelMapIn()
    public MaChannelConverter pChannelMapIn(NativeByteArray pChannelMapIn) {
    	P_CHANNEL_MAP_IN_HANDLE.set(segment, 0L, pChannelMapIn.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray pChannelMapIn() {
    	MemorySegment segment = (MemorySegment) P_CHANNEL_MAP_IN_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #pChannelMapOut()
    public MaChannelConverter pChannelMapOut(NativeByteArray pChannelMapOut) {
    	P_CHANNEL_MAP_OUT_HANDLE.set(segment, 0L, pChannelMapOut.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray pChannelMapOut() {
    	MemorySegment segment = (MemorySegment) P_CHANNEL_MAP_OUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #pShuffleTable()
    public MaChannelConverter pShuffleTable(NativeByteArray pShuffleTable) {
    	P_SHUFFLE_TABLE_HANDLE.set(segment, 0L, pShuffleTable.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray pShuffleTable() {
    	MemorySegment segment = (MemorySegment) P_SHUFFLE_TABLE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #weights()
    public MaChannelConverter weights(Consumer<Weights> consumer) {
    	consumer.accept(weights);
    	return this;
    }
    
    /// @see #weights()
    public MaChannelConverter weights(Weights other) {
    	weights.set(other);
    	return this;
    }
    
    public Weights weights() {
    	return weights;
    }
    
    /// @see #_pHeap()
    public MaChannelConverter _pHeap(MemorySegment _pHeap) {
    	_P_HEAP_HANDLE.set(segment, 0L, _pHeap);
    	return this;
    }
    
    public @Nullable MemorySegment _pHeap() {
    	MemorySegment segment = (MemorySegment) _P_HEAP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #_ownsHeap()
    public MaChannelConverter _ownsHeap(int _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public int _ownsHeap() {
    	return (int) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaChannelConverter set(MaChannelConverter other) {
        return set(other.segment);
    }
    
    @Override
    public MaChannelConverter set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaChannelConverter> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaChannelConverter> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaChannelConverter(segment),
            count
        );
    }
    
    public static NativeStructArray<MaChannelConverter> array(SegmentAllocator allocator, MaChannelConverter... structs) {
        NativeStructArray<MaChannelConverter> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaChannelConverter(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaChannelConverter> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaChannelConverter(segment)
        );
    }

	public static class Weights implements Struct<Weights> {
	
		public static final UnionLayout LAYOUT;
	
		public static final VarHandle F32_HANDLE;
		public static final VarHandle S16_HANDLE;
	
		public static final long F32_BYTE_OFFSET;
		public static final long S16_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.unionLayout(
			    UNBOUNDED_ADDRESS.withName("f32"),
			    UNBOUNDED_ADDRESS.withName("s16")
			).withName("Weights").withByteAlignment(8);
			
			F32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("f32"));
			S16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("s16"));
			
			F32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("f32"));
			S16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("s16"));
			//@formatter:on
		}
	
		public Weights() {
		    this(Arena.ofAuto());
		}
		
		public Weights(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Weights(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #f32()
	    public Weights f32(NativePointerArray f32) {
	    	F32_HANDLE.set(segment, 0L, f32.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativePointerArray f32() {
	    	MemorySegment segment = (MemorySegment) F32_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativePointerArray(segment);
	    }
	    
	    /// @see #s16()
	    public Weights s16(NativePointerArray s16) {
	    	S16_HANDLE.set(segment, 0L, s16.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativePointerArray s16() {
	    	MemorySegment segment = (MemorySegment) S16_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativePointerArray(segment);
	    }
	    
	    @Override
	    public Weights set(Weights other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Weights set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Weights> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Weights> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Weights(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Weights> array(SegmentAllocator allocator, Weights... structs) {
	        NativeStructArray<Weights> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Weights(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Weights> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Weights(segment)
	        );
	    }
	
	}
}