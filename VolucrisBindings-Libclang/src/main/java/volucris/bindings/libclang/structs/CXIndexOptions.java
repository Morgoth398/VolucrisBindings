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
/// Index initialization options.
/// 
/// 0 is the default value of each member of this struct except for Size.
/// Initialize the struct in one of the following three ways to avoid adapting
/// code each time a new member is added to it:
/// \code
/// CXIndexOptions Opts;
/// memset(&Opts, 0, sizeof(Opts));
/// Opts.Size = sizeof(CXIndexOptions);
/// \endcode
/// or explicitly initialize the first data member and zero-initialize the rest:
/// \code
/// CXIndexOptions Opts = { sizeof(CXIndexOptions) };
/// \endcode
/// or to prevent the -Wmissing-field-initializers warning for the above version:
/// \code
/// CXIndexOptions Opts{};
/// Opts.Size = sizeof(CXIndexOptions);
/// \endcode
/// ```
public final class CXIndexOptions
		implements Struct<CXIndexOptions> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SIZE_HANDLE;
    public static final VarHandle THREAD_BACKGROUND_PRIORITY_FOR_INDEXING_HANDLE;
    public static final VarHandle THREAD_BACKGROUND_PRIORITY_FOR_EDITING_HANDLE;
    public static final VarHandle BIT_FIELDS0_HANDLE;
    public static final VarHandle PREAMBLE_STORAGE_PATH_HANDLE;
    public static final VarHandle INVOCATION_EMISSION_PATH_HANDLE;

    public static final long SIZE_BYTE_OFFSET;
    public static final long THREAD_BACKGROUND_PRIORITY_FOR_INDEXING_BYTE_OFFSET;
    public static final long THREAD_BACKGROUND_PRIORITY_FOR_EDITING_BYTE_OFFSET;
    public static final long BIT_FIELDS0_BYTE_OFFSET;
    public static final long PREAMBLE_STORAGE_PATH_BYTE_OFFSET;
    public static final long INVOCATION_EMISSION_PATH_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("Size"),
            JAVA_BYTE.withName("ThreadBackgroundPriorityForIndexing"),
            JAVA_BYTE.withName("ThreadBackgroundPriorityForEditing"),
            MemoryLayout.paddingLayout(2),
            JAVA_INT.withName("bitFields0"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("PreambleStoragePath"),
            UNBOUNDED_ADDRESS.withName("InvocationEmissionPath")
        ).withName("CXIndexOptions").withByteAlignment(8);
        
        SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("Size"));
        THREAD_BACKGROUND_PRIORITY_FOR_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ThreadBackgroundPriorityForIndexing"));
        THREAD_BACKGROUND_PRIORITY_FOR_EDITING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ThreadBackgroundPriorityForEditing"));
        BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
        PREAMBLE_STORAGE_PATH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("PreambleStoragePath"));
        INVOCATION_EMISSION_PATH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("InvocationEmissionPath"));
        
        SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Size"));
        THREAD_BACKGROUND_PRIORITY_FOR_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ThreadBackgroundPriorityForIndexing"));
        THREAD_BACKGROUND_PRIORITY_FOR_EDITING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ThreadBackgroundPriorityForEditing"));
        BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
        PREAMBLE_STORAGE_PATH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("PreambleStoragePath"));
        INVOCATION_EMISSION_PATH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("InvocationEmissionPath"));
        //@formatter:on
    }

    public CXIndexOptions() {
        this(Arena.ofAuto());
    }
    
    public CXIndexOptions(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CXIndexOptions(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #size()
    public CXIndexOptions size(int size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    /// ```
    /// 
    /// The size of struct CXIndexOptions used for option versioning.
    /// 
    /// Always initialize this member to sizeof(CXIndexOptions), or assign
    /// sizeof(CXIndexOptions) to it right after creating a CXIndexOptions object.
    /// ```
    public int size() {
    	return (int) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #threadBackgroundPriorityForIndexing()
    public CXIndexOptions threadBackgroundPriorityForIndexing(byte threadBackgroundPriorityForIndexing) {
    	THREAD_BACKGROUND_PRIORITY_FOR_INDEXING_HANDLE.set(segment, 0L, threadBackgroundPriorityForIndexing);
    	return this;
    }
    
    /// ```
    /// 
    /// A CXChoice enumerator that specifies the indexing priority policy.
    /// \sa CXGlobalOpt_ThreadBackgroundPriorityForIndexing
    /// ```
    public byte threadBackgroundPriorityForIndexing() {
    	return (byte) THREAD_BACKGROUND_PRIORITY_FOR_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #threadBackgroundPriorityForEditing()
    public CXIndexOptions threadBackgroundPriorityForEditing(byte threadBackgroundPriorityForEditing) {
    	THREAD_BACKGROUND_PRIORITY_FOR_EDITING_HANDLE.set(segment, 0L, threadBackgroundPriorityForEditing);
    	return this;
    }
    
    /// ```
    /// 
    /// A CXChoice enumerator that specifies the editing priority policy.
    /// \sa CXGlobalOpt_ThreadBackgroundPriorityForEditing
    /// ```
    public byte threadBackgroundPriorityForEditing() {
    	return (byte) THREAD_BACKGROUND_PRIORITY_FOR_EDITING_HANDLE.get(segment, 0L);
    }
    
    /// @see #bitFields0()
    public CXIndexOptions bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// ExcludeDeclarationsFromPCH : 1
    /// DisplayDiagnostics : 1
    /// StorePreamblesInMemory : 1
    ///  : 13
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    /// @see #preambleStoragePath()
    public CXIndexOptions preambleStoragePath(NativeByteArray preambleStoragePath) {
    	PREAMBLE_STORAGE_PATH_HANDLE.set(segment, 0L, preambleStoragePath.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// The path to a directory, in which to store temporary PCH files. If null or
    /// empty, the default system temporary directory is used. These PCH files are
    /// deleted on clean exit but stay on disk if the program crashes or is killed.
    /// 
    /// This option is ignored if \a StorePreamblesInMemory is non-zero.
    /// 
    /// Libclang does not create the directory at the specified path in the file
    /// system. Therefore it must exist, or storing PCH files will fail.
    /// ```
    public @Nullable NativeByteArray preambleStoragePath() {
    	MemorySegment segment = (MemorySegment) PREAMBLE_STORAGE_PATH_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #invocationEmissionPath()
    public CXIndexOptions invocationEmissionPath(NativeByteArray invocationEmissionPath) {
    	INVOCATION_EMISSION_PATH_HANDLE.set(segment, 0L, invocationEmissionPath.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// Specifies a path which will contain log files for certain libclang
    /// invocations. A null value implies that libclang invocations are not logged.
    /// ```
    public @Nullable NativeByteArray invocationEmissionPath() {
    	MemorySegment segment = (MemorySegment) INVOCATION_EMISSION_PATH_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    @Override
    public CXIndexOptions set(CXIndexOptions other) {
        return set(other.segment);
    }
    
    @Override
    public CXIndexOptions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIndexOptions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIndexOptions> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIndexOptions(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIndexOptions> array(Arena arena, CXIndexOptions... structs) {
        NativeStructArray<CXIndexOptions> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIndexOptions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIndexOptions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIndexOptions(segment)
        );
    }
    
}