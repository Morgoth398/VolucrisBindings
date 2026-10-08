/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// Provides the contents of a file that has not yet been saved to disk.
/// 
/// Each CXUnsavedFile instance provides the name of a file on the
/// system along with the current contents of that file that have not
/// yet been saved to disk.
/// ```
public final class CXUnsavedFile
		implements Struct<CXUnsavedFile> {

    public static final StructLayout LAYOUT;

    public static final VarHandle FILENAME_HANDLE;
    public static final VarHandle CONTENTS_HANDLE;
    public static final VarHandle LENGTH_HANDLE;

    public static final long FILENAME_BYTE_OFFSET;
    public static final long CONTENTS_BYTE_OFFSET;
    public static final long LENGTH_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("Filename"),
            UNBOUNDED_ADDRESS.withName("Contents"),
            JAVA_INT.withName("Length"),
            MemoryLayout.paddingLayout(4)
        ).withName("CXUnsavedFile").withByteAlignment(8);
        
        FILENAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("Filename"));
        CONTENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("Contents"));
        LENGTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("Length"));
        
        FILENAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Filename"));
        CONTENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Contents"));
        LENGTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Length"));
        //@formatter:on
    }

    public CXUnsavedFile() {
        this(Arena.ofAuto());
    }
    
    public CXUnsavedFile(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CXUnsavedFile(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #filename()
    public CXUnsavedFile filename(NativeByteArray filename) {
    	FILENAME_HANDLE.set(segment, 0L, filename.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// The file whose contents have not yet been saved.
    /// 
    /// This file must already exist in the file system.
    /// ```
    public @Nullable NativeByteArray filename() {
    	MemorySegment segment = (MemorySegment) FILENAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #contents()
    public CXUnsavedFile contents(NativeByteArray contents) {
    	CONTENTS_HANDLE.set(segment, 0L, contents.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// A buffer containing the unsaved contents of this file.
    /// ```
    public @Nullable NativeByteArray contents() {
    	MemorySegment segment = (MemorySegment) CONTENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #length()
    public CXUnsavedFile length(int length) {
    	LENGTH_HANDLE.set(segment, 0L, length);
    	return this;
    }
    
    /// ```
    /// 
    /// The length of the unsaved contents of this buffer.
    /// ```
    public int length() {
    	return (int) LENGTH_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CXUnsavedFile set(CXUnsavedFile other) {
        return set(other.segment);
    }
    
    @Override
    public CXUnsavedFile set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXUnsavedFile> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXUnsavedFile> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXUnsavedFile(segment),
            count
        );
    }
    
    public static NativeStructArray<CXUnsavedFile> array(Arena arena, CXUnsavedFile... structs) {
        NativeStructArray<CXUnsavedFile> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXUnsavedFile(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXUnsavedFile> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXUnsavedFile(segment)
        );
    }
    
}