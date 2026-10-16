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

/// ```
/// *********************************************************************************************************************************************************
/// 
/// Ring Buffer
/// 
/// **********************************************************************************************************************************************************
/// ```
public final class MaRb
		implements Struct<MaRb> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_BUFFER_HANDLE;
	public static final VarHandle SUBBUFFER_SIZE_IN_BYTES_HANDLE;
	public static final VarHandle SUBBUFFER_COUNT_HANDLE;
	public static final VarHandle SUBBUFFER_STRIDE_IN_BYTES_HANDLE;
	public static final VarHandle ENCODED_READ_OFFSET_HANDLE;
	public static final VarHandle ENCODED_WRITE_OFFSET_HANDLE;
	public static final VarHandle OWNS_BUFFER_HANDLE;
	public static final VarHandle CLEAR_ON_WRITE_ACQUIRE_HANDLE;

	public static final long P_BUFFER_BYTE_OFFSET;
	public static final long SUBBUFFER_SIZE_IN_BYTES_BYTE_OFFSET;
	public static final long SUBBUFFER_COUNT_BYTE_OFFSET;
	public static final long SUBBUFFER_STRIDE_IN_BYTES_BYTE_OFFSET;
	public static final long ENCODED_READ_OFFSET_BYTE_OFFSET;
	public static final long ENCODED_WRITE_OFFSET_BYTE_OFFSET;
	public static final long OWNS_BUFFER_BYTE_OFFSET;
	public static final long CLEAR_ON_WRITE_ACQUIRE_BYTE_OFFSET;
	public static final long ALLOCATION_CALLBACKS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaAllocationCallbacks allocationCallbacks;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pBuffer"),
		    JAVA_INT.withName("subbufferSizeInBytes"),
		    JAVA_INT.withName("subbufferCount"),
		    JAVA_INT.withName("subbufferStrideInBytes"),
		    JAVA_INT.withName("encodedReadOffset"),
		    JAVA_INT.withName("encodedWriteOffset"),
		    JAVA_BYTE.withName("ownsBuffer"),
		    JAVA_BYTE.withName("clearOnWriteAcquire"),
		    MemoryLayout.paddingLayout(2),
		    MaAllocationCallbacks.LAYOUT.withName("allocationCallbacks")
		).withName("ma_rb").withByteAlignment(8);
		
		P_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBuffer"));
		SUBBUFFER_SIZE_IN_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subbufferSizeInBytes"));
		SUBBUFFER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subbufferCount"));
		SUBBUFFER_STRIDE_IN_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subbufferStrideInBytes"));
		ENCODED_READ_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("encodedReadOffset"));
		ENCODED_WRITE_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("encodedWriteOffset"));
		OWNS_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ownsBuffer"));
		CLEAR_ON_WRITE_ACQUIRE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clearOnWriteAcquire"));
		
		P_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBuffer"));
		SUBBUFFER_SIZE_IN_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subbufferSizeInBytes"));
		SUBBUFFER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subbufferCount"));
		SUBBUFFER_STRIDE_IN_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subbufferStrideInBytes"));
		ENCODED_READ_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("encodedReadOffset"));
		ENCODED_WRITE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("encodedWriteOffset"));
		OWNS_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ownsBuffer"));
		CLEAR_ON_WRITE_ACQUIRE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clearOnWriteAcquire"));
		ALLOCATION_CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationCallbacks"));
		//@formatter:on
	}

	public MaRb() {
	    this(Arena.ofAuto());
	}
	
	public MaRb(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaRb(MemorySegment segment) {
	    this.segment = segment;
	
	    allocationCallbacks = new MaAllocationCallbacks(segment.asSlice(ALLOCATION_CALLBACKS_BYTE_OFFSET, MaAllocationCallbacks.LAYOUT));
	}

    /// @see #pBuffer()
    public MaRb pBuffer(MemorySegment pBuffer) {
    	P_BUFFER_HANDLE.set(segment, 0L, pBuffer);
    	return this;
    }
    
    public @Nullable MemorySegment pBuffer() {
    	MemorySegment segment = (MemorySegment) P_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #subbufferSizeInBytes()
    public MaRb subbufferSizeInBytes(int subbufferSizeInBytes) {
    	SUBBUFFER_SIZE_IN_BYTES_HANDLE.set(segment, 0L, subbufferSizeInBytes);
    	return this;
    }
    
    public int subbufferSizeInBytes() {
    	return (int) SUBBUFFER_SIZE_IN_BYTES_HANDLE.get(segment, 0L);
    }
    
    /// @see #subbufferCount()
    public MaRb subbufferCount(int subbufferCount) {
    	SUBBUFFER_COUNT_HANDLE.set(segment, 0L, subbufferCount);
    	return this;
    }
    
    public int subbufferCount() {
    	return (int) SUBBUFFER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #subbufferStrideInBytes()
    public MaRb subbufferStrideInBytes(int subbufferStrideInBytes) {
    	SUBBUFFER_STRIDE_IN_BYTES_HANDLE.set(segment, 0L, subbufferStrideInBytes);
    	return this;
    }
    
    public int subbufferStrideInBytes() {
    	return (int) SUBBUFFER_STRIDE_IN_BYTES_HANDLE.get(segment, 0L);
    }
    
    /// @see #encodedReadOffset()
    public MaRb encodedReadOffset(int encodedReadOffset) {
    	ENCODED_READ_OFFSET_HANDLE.set(segment, 0L, encodedReadOffset);
    	return this;
    }
    
    public int encodedReadOffset() {
    	return (int) ENCODED_READ_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #encodedWriteOffset()
    public MaRb encodedWriteOffset(int encodedWriteOffset) {
    	ENCODED_WRITE_OFFSET_HANDLE.set(segment, 0L, encodedWriteOffset);
    	return this;
    }
    
    public int encodedWriteOffset() {
    	return (int) ENCODED_WRITE_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #ownsBuffer()
    public MaRb ownsBuffer(byte ownsBuffer) {
    	OWNS_BUFFER_HANDLE.set(segment, 0L, ownsBuffer);
    	return this;
    }
    
    public byte ownsBuffer() {
    	return (byte) OWNS_BUFFER_HANDLE.get(segment, 0L);
    }
    
    /// @see #clearOnWriteAcquire()
    public MaRb clearOnWriteAcquire(byte clearOnWriteAcquire) {
    	CLEAR_ON_WRITE_ACQUIRE_HANDLE.set(segment, 0L, clearOnWriteAcquire);
    	return this;
    }
    
    public byte clearOnWriteAcquire() {
    	return (byte) CLEAR_ON_WRITE_ACQUIRE_HANDLE.get(segment, 0L);
    }
    
    /// @see #allocationCallbacks()
    public MaRb allocationCallbacks(Consumer<MaAllocationCallbacks> consumer) {
    	consumer.accept(allocationCallbacks);
    	return this;
    }
    
    /// @see #allocationCallbacks()
    public MaRb allocationCallbacks(MaAllocationCallbacks other) {
    	allocationCallbacks.set(other);
    	return this;
    }
    
    public MaAllocationCallbacks allocationCallbacks() {
    	return allocationCallbacks;
    }
    
    @Override
    public MaRb set(MaRb other) {
        return set(other.segment);
    }
    
    @Override
    public MaRb set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaRb> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaRb> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaRb(segment),
            count
        );
    }
    
    public static NativeStructArray<MaRb> array(Arena arena, MaRb... structs) {
        NativeStructArray<MaRb> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaRb(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaRb> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaRb(segment)
        );
    }

}