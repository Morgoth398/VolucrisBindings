/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// Data for IndexerCallbacks#importedASTFile.
/// ```
public final class CXIdxImportedASTFileInfo
		implements Struct<CXIdxImportedASTFileInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FILE_HANDLE;
	public static final VarHandle MODULE_HANDLE;
	public static final VarHandle IS_IMPLICIT_HANDLE;

	public static final long FILE_BYTE_OFFSET;
	public static final long MODULE_BYTE_OFFSET;
	public static final long LOC_BYTE_OFFSET;
	public static final long IS_IMPLICIT_BYTE_OFFSET;

	private final MemorySegment segment;

	private final CXIdxLoc loc;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("file"),
		    UNBOUNDED_ADDRESS.withName("module"),
		    CXIdxLoc.LAYOUT.withName("loc"),
		    JAVA_INT.withName("isImplicit"),
		    MemoryLayout.paddingLayout(4)
		).withName("CXIdxImportedASTFileInfo").withByteAlignment(8);
		
		FILE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("file"));
		MODULE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("module"));
		IS_IMPLICIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isImplicit"));
		
		FILE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("file"));
		MODULE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("module"));
		LOC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loc"));
		IS_IMPLICIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isImplicit"));
		//@formatter:on
	}

	public CXIdxImportedASTFileInfo() {
	    this(Arena.ofAuto());
	}
	
	public CXIdxImportedASTFileInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public CXIdxImportedASTFileInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    loc = new CXIdxLoc(segment.asSlice(LOC_BYTE_OFFSET, CXIdxLoc.LAYOUT));
	}

    /// @see #file()
    public CXIdxImportedASTFileInfo file(MemorySegment file) {
    	FILE_HANDLE.set(segment, 0L, file);
    	return this;
    }
    
    /// ```
    /// 
    /// Top level AST file containing the imported PCH, module or submodule.
    /// ```
    public @Nullable MemorySegment file() {
    	MemorySegment segment = (MemorySegment) FILE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #module()
    public CXIdxImportedASTFileInfo module(MemorySegment module) {
    	MODULE_HANDLE.set(segment, 0L, module);
    	return this;
    }
    
    /// ```
    /// 
    /// The imported module or NULL if the AST file is a PCH.
    /// ```
    public @Nullable MemorySegment module() {
    	MemorySegment segment = (MemorySegment) MODULE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #loc()
    public CXIdxImportedASTFileInfo loc(Consumer<CXIdxLoc> consumer) {
    	consumer.accept(loc);
    	return this;
    }
    
    /// @see #loc()
    public CXIdxImportedASTFileInfo loc(CXIdxLoc other) {
    	loc.set(other);
    	return this;
    }
    
    /// ```
    /// 
    /// Location where the file is imported. Applicable only for modules.
    /// ```
    public CXIdxLoc loc() {
    	return loc;
    }
    
    /// @see #isImplicit()
    public CXIdxImportedASTFileInfo isImplicit(int isImplicit) {
    	IS_IMPLICIT_HANDLE.set(segment, 0L, isImplicit);
    	return this;
    }
    
    /// ```
    /// 
    /// Non-zero if an inclusion directive was automatically turned into
    /// a module import. Applicable only for modules.
    /// ```
    public int isImplicit() {
    	return (int) IS_IMPLICIT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CXIdxImportedASTFileInfo set(CXIdxImportedASTFileInfo other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxImportedASTFileInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxImportedASTFileInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxImportedASTFileInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxImportedASTFileInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxImportedASTFileInfo> array(Arena arena, CXIdxImportedASTFileInfo... structs) {
        NativeStructArray<CXIdxImportedASTFileInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxImportedASTFileInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxImportedASTFileInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxImportedASTFileInfo(segment)
        );
    }

}