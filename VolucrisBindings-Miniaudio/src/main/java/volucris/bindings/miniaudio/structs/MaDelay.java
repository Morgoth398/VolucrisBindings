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

public final class MaDelay
		implements Struct<MaDelay> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CURSOR_HANDLE;
	public static final VarHandle BUFFER_SIZE_IN_FRAMES_HANDLE;
	public static final VarHandle P_BUFFER_HANDLE;

	public static final long CONFIG_BYTE_OFFSET;
	public static final long CURSOR_BYTE_OFFSET;
	public static final long BUFFER_SIZE_IN_FRAMES_BYTE_OFFSET;
	public static final long P_BUFFER_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaDelayConfig config;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaDelayConfig.LAYOUT.withName("config"),
		    JAVA_INT.withName("cursor"),
		    JAVA_INT.withName("bufferSizeInFrames"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pBuffer")
		).withName("ma_delay").withByteAlignment(8);
		
		CURSOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cursor"));
		BUFFER_SIZE_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferSizeInFrames"));
		P_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBuffer"));
		
		CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("config"));
		CURSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cursor"));
		BUFFER_SIZE_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferSizeInFrames"));
		P_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBuffer"));
		//@formatter:on
	}

	public MaDelay() {
	    this(Arena.ofAuto());
	}
	
	public MaDelay(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaDelay(MemorySegment segment) {
	    this.segment = segment;
	
	    config = new MaDelayConfig(segment.asSlice(CONFIG_BYTE_OFFSET, MaDelayConfig.LAYOUT));
	}

    /// @see #config()
    public MaDelay config(Consumer<MaDelayConfig> consumer) {
    	consumer.accept(config);
    	return this;
    }
    
    /// @see #config()
    public MaDelay config(MaDelayConfig other) {
    	config.set(other);
    	return this;
    }
    
    public MaDelayConfig config() {
    	return config;
    }
    
    /// @see #cursor()
    public MaDelay cursor(int cursor) {
    	CURSOR_HANDLE.set(segment, 0L, cursor);
    	return this;
    }
    
    public int cursor() {
    	return (int) CURSOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferSizeInFrames()
    public MaDelay bufferSizeInFrames(int bufferSizeInFrames) {
    	BUFFER_SIZE_IN_FRAMES_HANDLE.set(segment, 0L, bufferSizeInFrames);
    	return this;
    }
    
    public int bufferSizeInFrames() {
    	return (int) BUFFER_SIZE_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #pBuffer()
    public MaDelay pBuffer(NativeFloatArray pBuffer) {
    	P_BUFFER_HANDLE.set(segment, 0L, pBuffer.memorySegment());
    	return this;
    }
    
    public @Nullable NativeFloatArray pBuffer() {
    	MemorySegment segment = (MemorySegment) P_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    @Override
    public MaDelay set(MaDelay other) {
        return set(other.segment);
    }
    
    @Override
    public MaDelay set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDelay> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDelay> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDelay(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDelay> array(SegmentAllocator allocator, MaDelay... structs) {
        NativeStructArray<MaDelay> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDelay(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDelay> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDelay(segment)
        );
    }

}