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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// A group of callbacks used by #clang_indexSourceFile and
/// #clang_indexTranslationUnit.
/// ```
public final class IndexerCallbacks
		implements Struct<IndexerCallbacks> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ABORT_QUERY_HANDLE;
	public static final VarHandle DIAGNOSTIC_HANDLE;
	public static final VarHandle ENTERED_MAIN_FILE_HANDLE;
	public static final VarHandle PP_INCLUDED_FILE_HANDLE;
	public static final VarHandle IMPORTED_ASTFILE_HANDLE;
	public static final VarHandle STARTED_TRANSLATION_UNIT_HANDLE;
	public static final VarHandle INDEX_DECLARATION_HANDLE;
	public static final VarHandle INDEX_ENTITY_REFERENCE_HANDLE;

	public static final long ABORT_QUERY_BYTE_OFFSET;
	public static final long DIAGNOSTIC_BYTE_OFFSET;
	public static final long ENTERED_MAIN_FILE_BYTE_OFFSET;
	public static final long PP_INCLUDED_FILE_BYTE_OFFSET;
	public static final long IMPORTED_ASTFILE_BYTE_OFFSET;
	public static final long STARTED_TRANSLATION_UNIT_BYTE_OFFSET;
	public static final long INDEX_DECLARATION_BYTE_OFFSET;
	public static final long INDEX_ENTITY_REFERENCE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("abortQuery"),
		    UNBOUNDED_ADDRESS.withName("diagnostic"),
		    UNBOUNDED_ADDRESS.withName("enteredMainFile"),
		    UNBOUNDED_ADDRESS.withName("ppIncludedFile"),
		    UNBOUNDED_ADDRESS.withName("importedASTFile"),
		    UNBOUNDED_ADDRESS.withName("startedTranslationUnit"),
		    UNBOUNDED_ADDRESS.withName("indexDeclaration"),
		    UNBOUNDED_ADDRESS.withName("indexEntityReference")
		).withName("IndexerCallbacks").withByteAlignment(8);
		
		ABORT_QUERY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("abortQuery"));
		DIAGNOSTIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("diagnostic"));
		ENTERED_MAIN_FILE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enteredMainFile"));
		PP_INCLUDED_FILE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ppIncludedFile"));
		IMPORTED_ASTFILE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("importedASTFile"));
		STARTED_TRANSLATION_UNIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("startedTranslationUnit"));
		INDEX_DECLARATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexDeclaration"));
		INDEX_ENTITY_REFERENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexEntityReference"));
		
		ABORT_QUERY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("abortQuery"));
		DIAGNOSTIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("diagnostic"));
		ENTERED_MAIN_FILE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enteredMainFile"));
		PP_INCLUDED_FILE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ppIncludedFile"));
		IMPORTED_ASTFILE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("importedASTFile"));
		STARTED_TRANSLATION_UNIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("startedTranslationUnit"));
		INDEX_DECLARATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexDeclaration"));
		INDEX_ENTITY_REFERENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexEntityReference"));
		//@formatter:on
	}

	public IndexerCallbacks() {
	    this(Arena.ofAuto());
	}
	
	public IndexerCallbacks(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public IndexerCallbacks(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #abortQuery()
    public IndexerCallbacks abortQuery(AbortQueryFunction abortQuery) {
    	ABORT_QUERY_HANDLE.set(segment, 0L, abortQuery.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// Called periodically to check whether indexing should be aborted.
    /// Should return 0 to continue, and non-zero to abort.
    /// ```
    public @Nullable AbortQueryFunction abortQuery() {
    	MemorySegment segment = (MemorySegment) ABORT_QUERY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return AbortQueryFunction.get(segment);
    }
    
    /// @see #diagnostic()
    public IndexerCallbacks diagnostic(DiagnosticFunction diagnostic) {
    	DIAGNOSTIC_HANDLE.set(segment, 0L, diagnostic.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// Called at the end of indexing; passes the complete diagnostic set.
    /// ```
    public @Nullable DiagnosticFunction diagnostic() {
    	MemorySegment segment = (MemorySegment) DIAGNOSTIC_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return DiagnosticFunction.get(segment);
    }
    
    /// @see #enteredMainFile()
    public IndexerCallbacks enteredMainFile(EnteredMainFileFunction enteredMainFile) {
    	ENTERED_MAIN_FILE_HANDLE.set(segment, 0L, enteredMainFile.memorySegment());
    	return this;
    }
    
    public @Nullable EnteredMainFileFunction enteredMainFile() {
    	MemorySegment segment = (MemorySegment) ENTERED_MAIN_FILE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return EnteredMainFileFunction.get(segment);
    }
    
    /// @see #ppIncludedFile()
    public IndexerCallbacks ppIncludedFile(PpIncludedFileFunction ppIncludedFile) {
    	PP_INCLUDED_FILE_HANDLE.set(segment, 0L, ppIncludedFile.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// Called when a file gets \#included/\#imported.
    /// ```
    public @Nullable PpIncludedFileFunction ppIncludedFile() {
    	MemorySegment segment = (MemorySegment) PP_INCLUDED_FILE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return PpIncludedFileFunction.get(segment);
    }
    
    /// @see #importedASTFile()
    public IndexerCallbacks importedASTFile(ImportedASTFileFunction importedASTFile) {
    	IMPORTED_ASTFILE_HANDLE.set(segment, 0L, importedASTFile.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// Called when a AST file (PCH or module) gets imported.
    /// 
    /// AST files will not get indexed (there will not be callbacks to index all
    /// the entities in an AST file). The recommended action is that, if the AST
    /// file is not already indexed, to initiate a new indexing job specific to
    /// the AST file.
    /// ```
    public @Nullable ImportedASTFileFunction importedASTFile() {
    	MemorySegment segment = (MemorySegment) IMPORTED_ASTFILE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return ImportedASTFileFunction.get(segment);
    }
    
    /// @see #startedTranslationUnit()
    public IndexerCallbacks startedTranslationUnit(StartedTranslationUnitFunction startedTranslationUnit) {
    	STARTED_TRANSLATION_UNIT_HANDLE.set(segment, 0L, startedTranslationUnit.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// Called at the beginning of indexing a translation unit.
    /// ```
    public @Nullable StartedTranslationUnitFunction startedTranslationUnit() {
    	MemorySegment segment = (MemorySegment) STARTED_TRANSLATION_UNIT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return StartedTranslationUnitFunction.get(segment);
    }
    
    /// @see #indexDeclaration()
    public IndexerCallbacks indexDeclaration(IndexDeclarationFunction indexDeclaration) {
    	INDEX_DECLARATION_HANDLE.set(segment, 0L, indexDeclaration.memorySegment());
    	return this;
    }
    
    public @Nullable IndexDeclarationFunction indexDeclaration() {
    	MemorySegment segment = (MemorySegment) INDEX_DECLARATION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return IndexDeclarationFunction.get(segment);
    }
    
    /// @see #indexEntityReference()
    public IndexerCallbacks indexEntityReference(IndexEntityReferenceFunction indexEntityReference) {
    	INDEX_ENTITY_REFERENCE_HANDLE.set(segment, 0L, indexEntityReference.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// Called to index a reference of an entity.
    /// ```
    public @Nullable IndexEntityReferenceFunction indexEntityReference() {
    	MemorySegment segment = (MemorySegment) INDEX_ENTITY_REFERENCE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return IndexEntityReferenceFunction.get(segment);
    }
    
    @Override
    public IndexerCallbacks set(IndexerCallbacks other) {
        return set(other.segment);
    }
    
    @Override
    public IndexerCallbacks set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<IndexerCallbacks> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<IndexerCallbacks> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new IndexerCallbacks(segment),
            count
        );
    }
    
    public static NativeStructArray<IndexerCallbacks> array(Arena arena, IndexerCallbacks... structs) {
        NativeStructArray<IndexerCallbacks> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new IndexerCallbacks(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<IndexerCallbacks> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new IndexerCallbacks(segment)
        );
    }

}