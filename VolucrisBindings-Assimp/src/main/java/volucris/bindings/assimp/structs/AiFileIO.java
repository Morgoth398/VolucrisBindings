/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
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
/// @brief C-API: File system callbacks
/// 
/// Provided are functions to open and close files. Supply a custom structure to
/// the import function. If you don't, a default implementation is used. Use custom
/// file systems to enable reading from other sources, such as ZIPs
/// or memory locations.
/// ```
public final class AiFileIO
		implements Struct<AiFileIO> {

	public static final StructLayout LAYOUT;

	public static final VarHandle OPEN_PROC_HANDLE;
	public static final VarHandle CLOSE_PROC_HANDLE;
	public static final VarHandle USER_DATA_HANDLE;

	public static final long OPEN_PROC_BYTE_OFFSET;
	public static final long CLOSE_PROC_BYTE_OFFSET;
	public static final long USER_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("OpenProc"),
		    UNBOUNDED_ADDRESS.withName("CloseProc"),
		    UNBOUNDED_ADDRESS.withName("UserData")
		).withName("aiFileIO").withByteAlignment(8);
		
		OPEN_PROC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OpenProc"));
		CLOSE_PROC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CloseProc"));
		USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("UserData"));
		
		OPEN_PROC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OpenProc"));
		CLOSE_PROC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CloseProc"));
		USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("UserData"));
		//@formatter:on
	}

	public AiFileIO() {
	    this(Arena.ofAuto());
	}
	
	public AiFileIO(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public AiFileIO(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #openProc()
    public AiFileIO openProc(AiFileOpenProc openProc) {
    	OPEN_PROC_HANDLE.set(segment, 0L, openProc.memorySegment());
    	return this;
    }
    
    /// ```
    /// Function used to open a new file
    /// ```
    public @Nullable AiFileOpenProc openProc() {
    	MemorySegment segment = (MemorySegment) OPEN_PROC_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return AiFileOpenProc.get(segment);
    }
    
    /// @see #closeProc()
    public AiFileIO closeProc(AiFileCloseProc closeProc) {
    	CLOSE_PROC_HANDLE.set(segment, 0L, closeProc.memorySegment());
    	return this;
    }
    
    /// ```
    /// Function used to close an existing file
    /// ```
    public @Nullable AiFileCloseProc closeProc() {
    	MemorySegment segment = (MemorySegment) CLOSE_PROC_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return AiFileCloseProc.get(segment);
    }
    
    /// @see #userData()
    public AiFileIO userData(NativeByteArray userData) {
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
    public AiFileIO set(AiFileIO other) {
        return set(other.segment);
    }
    
    @Override
    public AiFileIO set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiFileIO> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiFileIO> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiFileIO(segment),
            count
        );
    }
    
    public static NativeStructArray<AiFileIO> array(Arena arena, AiFileIO... structs) {
        NativeStructArray<AiFileIO> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiFileIO(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiFileIO> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiFileIO(segment)
        );
    }

}