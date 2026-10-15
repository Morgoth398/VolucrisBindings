/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// Data for ppIncludedFile callback.
/// ```
public final class CXIdxIncludedFileInfo
		implements Struct<CXIdxIncludedFileInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FILENAME_HANDLE;
	public static final VarHandle FILE_HANDLE;
	public static final VarHandle IS_IMPORT_HANDLE;
	public static final VarHandle IS_ANGLED_HANDLE;
	public static final VarHandle IS_MODULE_IMPORT_HANDLE;

	public static final long HASH_LOC_BYTE_OFFSET;
	public static final long FILENAME_BYTE_OFFSET;
	public static final long FILE_BYTE_OFFSET;
	public static final long IS_IMPORT_BYTE_OFFSET;
	public static final long IS_ANGLED_BYTE_OFFSET;
	public static final long IS_MODULE_IMPORT_BYTE_OFFSET;

	private final MemorySegment segment;

	private final CXIdxLoc hashLoc;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    CXIdxLoc.LAYOUT.withName("hashLoc"),
		    UNBOUNDED_ADDRESS.withName("filename"),
		    UNBOUNDED_ADDRESS.withName("file"),
		    JAVA_INT.withName("isImport"),
		    JAVA_INT.withName("isAngled"),
		    JAVA_INT.withName("isModuleImport"),
		    MemoryLayout.paddingLayout(4)
		).withName("CXIdxIncludedFileInfo").withByteAlignment(8);
		
		FILENAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("filename"));
		FILE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("file"));
		IS_IMPORT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isImport"));
		IS_ANGLED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isAngled"));
		IS_MODULE_IMPORT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isModuleImport"));
		
		HASH_LOC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hashLoc"));
		FILENAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("filename"));
		FILE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("file"));
		IS_IMPORT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isImport"));
		IS_ANGLED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isAngled"));
		IS_MODULE_IMPORT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isModuleImport"));
		//@formatter:on
	}

	public CXIdxIncludedFileInfo() {
	    this(Arena.ofAuto());
	}
	
	public CXIdxIncludedFileInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public CXIdxIncludedFileInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    hashLoc = new CXIdxLoc(segment.asSlice(HASH_LOC_BYTE_OFFSET, CXIdxLoc.LAYOUT));
	}

    /// @see #hashLoc()
    public CXIdxIncludedFileInfo hashLoc(Consumer<CXIdxLoc> consumer) {
    	consumer.accept(hashLoc);
    	return this;
    }
    
    /// @see #hashLoc()
    public CXIdxIncludedFileInfo hashLoc(CXIdxLoc other) {
    	hashLoc.set(other);
    	return this;
    }
    
    /// ```
    /// 
    /// Location of '#' in the \#include/\#import directive.
    /// ```
    public CXIdxLoc hashLoc() {
    	return hashLoc;
    }
    
    /// @see #filename()
    public CXIdxIncludedFileInfo filename(NativeByteArray filename) {
    	FILENAME_HANDLE.set(segment, 0L, filename.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// Filename as written in the \#include/\#import directive.
    /// ```
    public @Nullable NativeByteArray filename() {
    	MemorySegment segment = (MemorySegment) FILENAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #file()
    public CXIdxIncludedFileInfo file(MemorySegment file) {
    	FILE_HANDLE.set(segment, 0L, file);
    	return this;
    }
    
    /// ```
    /// 
    /// The actual file that the \#include/\#import directive resolved to.
    /// ```
    public @Nullable MemorySegment file() {
    	MemorySegment segment = (MemorySegment) FILE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #isImport()
    public CXIdxIncludedFileInfo isImport(int isImport) {
    	IS_IMPORT_HANDLE.set(segment, 0L, isImport);
    	return this;
    }
    
    public int isImport() {
    	return (int) IS_IMPORT_HANDLE.get(segment, 0L);
    }
    
    /// @see #isAngled()
    public CXIdxIncludedFileInfo isAngled(int isAngled) {
    	IS_ANGLED_HANDLE.set(segment, 0L, isAngled);
    	return this;
    }
    
    public int isAngled() {
    	return (int) IS_ANGLED_HANDLE.get(segment, 0L);
    }
    
    /// @see #isModuleImport()
    public CXIdxIncludedFileInfo isModuleImport(int isModuleImport) {
    	IS_MODULE_IMPORT_HANDLE.set(segment, 0L, isModuleImport);
    	return this;
    }
    
    /// ```
    /// 
    /// Non-zero if the directive was automatically turned into a module
    /// import.
    /// ```
    public int isModuleImport() {
    	return (int) IS_MODULE_IMPORT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CXIdxIncludedFileInfo set(CXIdxIncludedFileInfo other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxIncludedFileInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxIncludedFileInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxIncludedFileInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxIncludedFileInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxIncludedFileInfo> array(Arena arena, CXIdxIncludedFileInfo... structs) {
        NativeStructArray<CXIdxIncludedFileInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxIncludedFileInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxIncludedFileInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxIncludedFileInfo(segment)
        );
    }

}