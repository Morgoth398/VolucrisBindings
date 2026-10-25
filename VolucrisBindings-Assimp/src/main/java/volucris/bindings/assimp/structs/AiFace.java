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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// @brief A single face in a mesh, referring to multiple vertices.
/// 
/// If mNumIndices is 3, we call the face 'triangle', for mNumIndices > 3
/// it's called 'polygon' (hey, that's just a definition!).
/// <br>
/// aiMesh::mPrimitiveTypes can be queried to quickly examine which types of
/// primitive are actually present in a mesh. The #aiProcess_SortByPType flag
/// executes a special post-processing algorithm which splits meshes with
/// *different* primitive types mixed up (e.g. lines and triangles) in several
/// 'clean' sub-meshes. Furthermore there is a configuration option (
/// #AI_CONFIG_PP_SBP_REMOVE) to force #aiProcess_SortByPType to remove
/// specific kinds of primitives from the imported scene, completely and forever.
/// In many cases you'll probably want to set this setting to
/// @code
/// aiPrimitiveType_LINE|aiPrimitiveType_POINT
/// @endcode
/// Together with the #aiProcess_Triangulate flag you can then be sure that
/// #aiFace::mNumIndices is always 3.
/// @note Take a look at the @link data Data Structures page @endlink for
/// more information on the layout and winding order of a face.
/// ```
public final class AiFace
		implements Struct<AiFace> {

	public static final StructLayout LAYOUT;

	public static final VarHandle M_NUM_INDICES_HANDLE;
	public static final VarHandle M_INDICES_HANDLE;

	public static final long M_NUM_INDICES_BYTE_OFFSET;
	public static final long M_INDICES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("mNumIndices"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("mIndices")
		).withName("aiFace").withByteAlignment(8);
		
		M_NUM_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumIndices"));
		M_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mIndices"));
		
		M_NUM_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumIndices"));
		M_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mIndices"));
		//@formatter:on
	}

	public AiFace() {
	    this(Arena.ofAuto());
	}
	
	public AiFace(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiFace(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #mNumIndices()
    public AiFace mNumIndices(int mNumIndices) {
    	M_NUM_INDICES_HANDLE.set(segment, 0L, mNumIndices);
    	return this;
    }
    
    /// ```
    /// Number of indices defining this face.
    /// The maximum value for this member is #AI_MAX_FACE_INDICES.
    /// ```
    public int mNumIndices() {
    	return (int) M_NUM_INDICES_HANDLE.get(segment, 0L);
    }
    
    /// @see #mIndices()
    public AiFace mIndices(NativeIntArray mIndices) {
    	M_INDICES_HANDLE.set(segment, 0L, mIndices.memorySegment());
    	return this;
    }
    
    /// ```
    /// Pointer to the indices array. Size of the array is given in numIndices.
    /// ```
    public @Nullable NativeIntArray mIndices() {
    	MemorySegment segment = (MemorySegment) M_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public AiFace set(AiFace other) {
        return set(other.segment);
    }
    
    @Override
    public AiFace set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiFace> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiFace> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiFace(segment),
            count
        );
    }
    
    public static NativeStructArray<AiFace> array(Arena arena, AiFace... structs) {
        NativeStructArray<AiFace> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiFace(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiFace> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiFace(segment)
        );
    }

}