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
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Meta information about a particular importer. Importers need to fill
/// this structure, but they can freely decide how talkative they are.
/// A common use case for loader meta info is a user interface
/// in which the user can choose between various import/export file
/// formats. Building such an UI by hand means a lot of maintenance
/// as importers/exporters are added to Assimp, so it might be useful
/// to have a common mechanism to query some rough importer
/// characteristics.
/// ```
public final class AiImporterDesc
		implements Struct<AiImporterDesc> {

	public static final StructLayout LAYOUT;

	public static final VarHandle M_NAME_HANDLE;
	public static final VarHandle M_AUTHOR_HANDLE;
	public static final VarHandle M_MAINTAINER_HANDLE;
	public static final VarHandle M_COMMENTS_HANDLE;
	public static final VarHandle M_FLAGS_HANDLE;
	public static final VarHandle M_MIN_MAJOR_HANDLE;
	public static final VarHandle M_MIN_MINOR_HANDLE;
	public static final VarHandle M_MAX_MAJOR_HANDLE;
	public static final VarHandle M_MAX_MINOR_HANDLE;
	public static final VarHandle M_FILE_EXTENSIONS_HANDLE;

	public static final long M_NAME_BYTE_OFFSET;
	public static final long M_AUTHOR_BYTE_OFFSET;
	public static final long M_MAINTAINER_BYTE_OFFSET;
	public static final long M_COMMENTS_BYTE_OFFSET;
	public static final long M_FLAGS_BYTE_OFFSET;
	public static final long M_MIN_MAJOR_BYTE_OFFSET;
	public static final long M_MIN_MINOR_BYTE_OFFSET;
	public static final long M_MAX_MAJOR_BYTE_OFFSET;
	public static final long M_MAX_MINOR_BYTE_OFFSET;
	public static final long M_FILE_EXTENSIONS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("mName"),
		    UNBOUNDED_ADDRESS.withName("mAuthor"),
		    UNBOUNDED_ADDRESS.withName("mMaintainer"),
		    UNBOUNDED_ADDRESS.withName("mComments"),
		    JAVA_INT.withName("mFlags"),
		    JAVA_INT.withName("mMinMajor"),
		    JAVA_INT.withName("mMinMinor"),
		    JAVA_INT.withName("mMaxMajor"),
		    JAVA_INT.withName("mMaxMinor"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("mFileExtensions")
		).withName("aiImporterDesc").withByteAlignment(8);
		
		M_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mName"));
		M_AUTHOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mAuthor"));
		M_MAINTAINER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mMaintainer"));
		M_COMMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mComments"));
		M_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mFlags"));
		M_MIN_MAJOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mMinMajor"));
		M_MIN_MINOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mMinMinor"));
		M_MAX_MAJOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mMaxMajor"));
		M_MAX_MINOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mMaxMinor"));
		M_FILE_EXTENSIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mFileExtensions"));
		
		M_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mName"));
		M_AUTHOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mAuthor"));
		M_MAINTAINER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMaintainer"));
		M_COMMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mComments"));
		M_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mFlags"));
		M_MIN_MAJOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMinMajor"));
		M_MIN_MINOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMinMinor"));
		M_MAX_MAJOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMaxMajor"));
		M_MAX_MINOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMaxMinor"));
		M_FILE_EXTENSIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mFileExtensions"));
		//@formatter:on
	}

	public AiImporterDesc() {
	    this(Arena.ofAuto());
	}
	
	public AiImporterDesc(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiImporterDesc(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #mName()
    public AiImporterDesc mName(NativeByteArray mName) {
    	M_NAME_HANDLE.set(segment, 0L, mName.memorySegment());
    	return this;
    }
    
    /// ```
    /// Full name of the importer (i.e. Blender3D importer)
    /// ```
    public @Nullable NativeByteArray mName() {
    	MemorySegment segment = (MemorySegment) M_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #mAuthor()
    public AiImporterDesc mAuthor(NativeByteArray mAuthor) {
    	M_AUTHOR_HANDLE.set(segment, 0L, mAuthor.memorySegment());
    	return this;
    }
    
    /// ```
    /// Original author (left blank if unknown or whole assimp team)
    /// ```
    public @Nullable NativeByteArray mAuthor() {
    	MemorySegment segment = (MemorySegment) M_AUTHOR_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #mMaintainer()
    public AiImporterDesc mMaintainer(NativeByteArray mMaintainer) {
    	M_MAINTAINER_HANDLE.set(segment, 0L, mMaintainer.memorySegment());
    	return this;
    }
    
    /// ```
    /// Current maintainer, left blank if the author maintains
    /// ```
    public @Nullable NativeByteArray mMaintainer() {
    	MemorySegment segment = (MemorySegment) M_MAINTAINER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #mComments()
    public AiImporterDesc mComments(NativeByteArray mComments) {
    	M_COMMENTS_HANDLE.set(segment, 0L, mComments.memorySegment());
    	return this;
    }
    
    /// ```
    /// Implementation comments, i.e. unimplemented features
    /// ```
    public @Nullable NativeByteArray mComments() {
    	MemorySegment segment = (MemorySegment) M_COMMENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #mFlags()
    public AiImporterDesc mFlags(int mFlags) {
    	M_FLAGS_HANDLE.set(segment, 0L, mFlags);
    	return this;
    }
    
    /// ```
    /// These flags indicate some characteristics common to many
    ///         importers.
    /// ```
    public int mFlags() {
    	return (int) M_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mMinMajor()
    public AiImporterDesc mMinMajor(int mMinMajor) {
    	M_MIN_MAJOR_HANDLE.set(segment, 0L, mMinMajor);
    	return this;
    }
    
    /// ```
    /// Minimum format version that can be loaded im major.minor format,
    ///         both are set to 0 if there is either no version scheme
    ///         or if the loader doesn't care.
    /// ```
    public int mMinMajor() {
    	return (int) M_MIN_MAJOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #mMinMinor()
    public AiImporterDesc mMinMinor(int mMinMinor) {
    	M_MIN_MINOR_HANDLE.set(segment, 0L, mMinMinor);
    	return this;
    }
    
    public int mMinMinor() {
    	return (int) M_MIN_MINOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #mMaxMajor()
    public AiImporterDesc mMaxMajor(int mMaxMajor) {
    	M_MAX_MAJOR_HANDLE.set(segment, 0L, mMaxMajor);
    	return this;
    }
    
    /// ```
    /// Maximum format version that can be loaded im major.minor format,
    ///         both are set to 0 if there is either no version scheme
    ///         or if the loader doesn't care. Loaders that expect to be
    ///         forward-compatible to potential future format versions should
    ///         indicate  zero, otherwise they should specify the current
    ///         maximum version.
    /// ```
    public int mMaxMajor() {
    	return (int) M_MAX_MAJOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #mMaxMinor()
    public AiImporterDesc mMaxMinor(int mMaxMinor) {
    	M_MAX_MINOR_HANDLE.set(segment, 0L, mMaxMinor);
    	return this;
    }
    
    public int mMaxMinor() {
    	return (int) M_MAX_MINOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #mFileExtensions()
    public AiImporterDesc mFileExtensions(NativeByteArray mFileExtensions) {
    	M_FILE_EXTENSIONS_HANDLE.set(segment, 0L, mFileExtensions.memorySegment());
    	return this;
    }
    
    /// ```
    /// List of file extensions this importer can handle.
    ///         List entries are separated by space characters.
    ///         All entries are lower case without a leading dot (i.e.
    ///         "xml dae" would be a valid value. Note that multiple
    ///         importers may respond to the same file extension -
    ///         assimp calls all importers in the order in which they
    ///         are registered and each importer gets the opportunity
    ///         to load the file until one importer "claims" the file. Apart
    ///         from file extension checks, importers typically use
    ///         other methods to quickly reject files (i.e. magic
    ///         words) so this does not mean that common or generic
    ///         file extensions such as XML would be tediously slow.
    /// ```
    public @Nullable NativeByteArray mFileExtensions() {
    	MemorySegment segment = (MemorySegment) M_FILE_EXTENSIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    @Override
    public AiImporterDesc set(AiImporterDesc other) {
        return set(other.segment);
    }
    
    @Override
    public AiImporterDesc set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiImporterDesc> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiImporterDesc> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiImporterDesc(segment),
            count
        );
    }
    
    public static NativeStructArray<AiImporterDesc> array(Arena arena, AiImporterDesc... structs) {
        NativeStructArray<AiImporterDesc> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiImporterDesc(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiImporterDesc> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiImporterDesc(segment)
        );
    }

}