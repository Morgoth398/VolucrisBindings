/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.assimp.callbacks.*;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// @brief C-API: File callbacks
/// 
/// Actually, it's a data structure to wrap a set of fXXXX (e.g fopen)
/// replacement functions.
/// 
/// The default implementation of the functions utilizes the fXXX functions from
/// the CRT. However, you can supply a custom implementation to Assimp by
/// delivering a custom aiFileIO. Use this to enable reading from other sources,
/// such as ZIP archives or memory locations.
/// ```
public final class AiFile
		implements Struct<AiFile> {

	public static final StructLayout LAYOUT;

	public static final VarHandle READ_PROC_HANDLE;
	public static final VarHandle WRITE_PROC_HANDLE;
	public static final VarHandle TELL_PROC_HANDLE;
	public static final VarHandle FILE_SIZE_PROC_HANDLE;
	public static final VarHandle SEEK_PROC_HANDLE;
	public static final VarHandle FLUSH_PROC_HANDLE;
	public static final VarHandle USER_DATA_HANDLE;

	public static final long READ_PROC_BYTE_OFFSET;
	public static final long WRITE_PROC_BYTE_OFFSET;
	public static final long TELL_PROC_BYTE_OFFSET;
	public static final long FILE_SIZE_PROC_BYTE_OFFSET;
	public static final long SEEK_PROC_BYTE_OFFSET;
	public static final long FLUSH_PROC_BYTE_OFFSET;
	public static final long USER_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("ReadProc"),
		    UNBOUNDED_ADDRESS.withName("WriteProc"),
		    UNBOUNDED_ADDRESS.withName("TellProc"),
		    UNBOUNDED_ADDRESS.withName("FileSizeProc"),
		    UNBOUNDED_ADDRESS.withName("SeekProc"),
		    UNBOUNDED_ADDRESS.withName("FlushProc"),
		    UNBOUNDED_ADDRESS.withName("UserData")
		).withName("aiFile").withByteAlignment(8);
		
		READ_PROC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ReadProc"));
		WRITE_PROC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("WriteProc"));
		TELL_PROC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("TellProc"));
		FILE_SIZE_PROC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("FileSizeProc"));
		SEEK_PROC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("SeekProc"));
		FLUSH_PROC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("FlushProc"));
		USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("UserData"));
		
		READ_PROC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ReadProc"));
		WRITE_PROC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("WriteProc"));
		TELL_PROC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("TellProc"));
		FILE_SIZE_PROC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("FileSizeProc"));
		SEEK_PROC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("SeekProc"));
		FLUSH_PROC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("FlushProc"));
		USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("UserData"));
		//@formatter:on
	}

	public AiFile() {
	    this(Arena.ofAuto());
	}
	
	public AiFile(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiFile(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #readProc()
    public AiFile readProc(AiFileReadProc readProc) {
    	READ_PROC_HANDLE.set(segment, 0L, readProc.memorySegment());
    	return this;
    }
    
    /// ```
    /// Callback to read from a file
    /// ```
    public @Nullable AiFileReadProc readProc() {
    	MemorySegment segment = (MemorySegment) READ_PROC_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return AiFileReadProc.get(segment);
    }
    
    /// @see #writeProc()
    public AiFile writeProc(AiFileWriteProc writeProc) {
    	WRITE_PROC_HANDLE.set(segment, 0L, writeProc.memorySegment());
    	return this;
    }
    
    /// ```
    /// Callback to write to a file
    /// ```
    public @Nullable AiFileWriteProc writeProc() {
    	MemorySegment segment = (MemorySegment) WRITE_PROC_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return AiFileWriteProc.get(segment);
    }
    
    /// @see #tellProc()
    public AiFile tellProc(AiFileTellProc tellProc) {
    	TELL_PROC_HANDLE.set(segment, 0L, tellProc.memorySegment());
    	return this;
    }
    
    /// ```
    /// Callback to retrieve the current position of
    /// the file cursor (ftell())
    /// ```
    public @Nullable AiFileTellProc tellProc() {
    	MemorySegment segment = (MemorySegment) TELL_PROC_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return AiFileTellProc.get(segment);
    }
    
    /// @see #fileSizeProc()
    public AiFile fileSizeProc(AiFileTellProc fileSizeProc) {
    	FILE_SIZE_PROC_HANDLE.set(segment, 0L, fileSizeProc.memorySegment());
    	return this;
    }
    
    /// ```
    /// Callback to retrieve the size of the file,
    /// in bytes
    /// ```
    public @Nullable AiFileTellProc fileSizeProc() {
    	MemorySegment segment = (MemorySegment) FILE_SIZE_PROC_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return AiFileTellProc.get(segment);
    }
    
    /// @see #seekProc()
    public AiFile seekProc(AiFileSeek seekProc) {
    	SEEK_PROC_HANDLE.set(segment, 0L, seekProc.memorySegment());
    	return this;
    }
    
    /// ```
    /// Callback to set the current position
    /// of the file cursor (fseek())
    /// ```
    public @Nullable AiFileSeek seekProc() {
    	MemorySegment segment = (MemorySegment) SEEK_PROC_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return AiFileSeek.get(segment);
    }
    
    /// @see #flushProc()
    public AiFile flushProc(AiFileFlushProc flushProc) {
    	FLUSH_PROC_HANDLE.set(segment, 0L, flushProc.memorySegment());
    	return this;
    }
    
    /// ```
    /// Callback to flush the file contents
    /// ```
    public @Nullable AiFileFlushProc flushProc() {
    	MemorySegment segment = (MemorySegment) FLUSH_PROC_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return AiFileFlushProc.get(segment);
    }
    
    /// @see #userData()
    public AiFile userData(NativeByteArray userData) {
    	USER_DATA_HANDLE.set(segment, 0L, userData.memorySegment());
    	return this;
    }
    
    /// ```
    /// User-defined, opaque data
    /// ```
    public @Nullable NativeByteArray userData() {
    	MemorySegment segment = (MemorySegment) USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    @Override
    public AiFile set(AiFile other) {
        return set(other.segment);
    }
    
    @Override
    public AiFile set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiFile> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiFile> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiFile(segment),
            count
        );
    }
    
    public static NativeStructArray<AiFile> array(Arena arena, AiFile... structs) {
        NativeStructArray<AiFile> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiFile(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiFile> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiFile(segment)
        );
    }

}