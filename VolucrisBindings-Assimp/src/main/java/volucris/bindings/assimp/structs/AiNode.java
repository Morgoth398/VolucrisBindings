/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// A node in the imported hierarchy.
/// 
/// Each node has name, a parent node (except for the root node),
/// a transformation relative to its parent and possibly several child nodes.
/// Simple file formats don't support hierarchical structures - for these formats
/// the imported scene does consist of only a single root node without children.
/// ```
public final class AiNode
		implements Struct<AiNode> {

	public static final StructLayout LAYOUT;

	public static final VarHandle M_PARENT_HANDLE;
	public static final VarHandle M_NUM_CHILDREN_HANDLE;
	public static final VarHandle M_CHILDREN_HANDLE;
	public static final VarHandle M_NUM_MESHES_HANDLE;
	public static final VarHandle M_MESHES_HANDLE;
	public static final VarHandle M_META_DATA_HANDLE;

	public static final long M_NAME_BYTE_OFFSET;
	public static final long M_TRANSFORMATION_BYTE_OFFSET;
	public static final long M_PARENT_BYTE_OFFSET;
	public static final long M_NUM_CHILDREN_BYTE_OFFSET;
	public static final long M_CHILDREN_BYTE_OFFSET;
	public static final long M_NUM_MESHES_BYTE_OFFSET;
	public static final long M_MESHES_BYTE_OFFSET;
	public static final long M_META_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final AiString mName;
	private final AiMatrix4x4 mTransformation;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    AiString.LAYOUT.withName("mName"),
		    AiMatrix4x4.LAYOUT.withName("mTransformation"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("mParent"),
		    JAVA_INT.withName("mNumChildren"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("mChildren"),
		    JAVA_INT.withName("mNumMeshes"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("mMeshes"),
		    UNBOUNDED_ADDRESS.withName("mMetaData")
		).withName("aiNode").withByteAlignment(8);
		
		M_PARENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mParent"));
		M_NUM_CHILDREN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumChildren"));
		M_CHILDREN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mChildren"));
		M_NUM_MESHES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumMeshes"));
		M_MESHES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mMeshes"));
		M_META_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mMetaData"));
		
		M_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mName"));
		M_TRANSFORMATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mTransformation"));
		M_PARENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mParent"));
		M_NUM_CHILDREN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumChildren"));
		M_CHILDREN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mChildren"));
		M_NUM_MESHES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumMeshes"));
		M_MESHES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMeshes"));
		M_META_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMetaData"));
		//@formatter:on
	}

	public AiNode() {
	    this(Arena.ofAuto());
	}
	
	public AiNode(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public AiNode(MemorySegment segment) {
	    this.segment = segment;
	
	    mName = new AiString(segment.asSlice(M_NAME_BYTE_OFFSET, AiString.LAYOUT));
	    mTransformation = new AiMatrix4x4(segment.asSlice(M_TRANSFORMATION_BYTE_OFFSET, AiMatrix4x4.LAYOUT));
	}

    /// @see #mName()
    public AiNode mName(Consumer<AiString> consumer) {
    	consumer.accept(mName);
    	return this;
    }
    
    /// @see #mName()
    public AiNode mName(AiString other) {
    	mName.set(other);
    	return this;
    }
    
    /// ```
    /// The name of the node.
    /// 
    /// The name might be empty (length of zero) but all nodes which
    /// need to be referenced by either bones or animations are named.
    /// Multiple nodes may have the same name, except for nodes which are referenced
    /// by bones (see #aiBone and #aiMesh::mBones). Their names *must* be unique.
    /// 
    /// Cameras and lights reference a specific node by name - if there
    /// are multiple nodes with this name, they are assigned to each of them.
    /// <br>
    /// There are no limitations with regard to the characters contained in
    /// the name string as it is usually taken directly from the source file.
    /// 
    /// Implementations should be able to handle tokens such as whitespace, tabs,
    /// line feeds, quotation marks, ampersands etc.
    /// 
    /// Sometimes assimp introduces new nodes not present in the source file
    /// into the hierarchy (usually out of necessity because sometimes the
    /// source hierarchy format is simply not compatible). Their names are
    /// surrounded by @verbatim <> @endverbatim e.g.
    /// @verbatim<DummyRootNode> @endverbatim.
    /// ```
    public AiString mName() {
    	return mName;
    }
    
    /// @see #mTransformation()
    public AiNode mTransformation(Consumer<AiMatrix4x4> consumer) {
    	consumer.accept(mTransformation);
    	return this;
    }
    
    /// @see #mTransformation()
    public AiNode mTransformation(AiMatrix4x4 other) {
    	mTransformation.set(other);
    	return this;
    }
    
    /// ```
    /// The transformation relative to the node's parent.
    /// ```
    public AiMatrix4x4 mTransformation() {
    	return mTransformation;
    }
    
    /// @see #mParent()
    public AiNode mParent(AiNode mParent) {
    	M_PARENT_HANDLE.set(segment, 0L, mParent.memorySegment());
    	return this;
    }
    
    /// ```
    /// Parent node. nullptr if this node is the root node.
    /// ```
    public @Nullable AiNode mParent() {
    	MemorySegment segment = (MemorySegment) M_PARENT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AiNode(segment);
    }
    
    /// @see #mNumChildren()
    public AiNode mNumChildren(int mNumChildren) {
    	M_NUM_CHILDREN_HANDLE.set(segment, 0L, mNumChildren);
    	return this;
    }
    
    /// ```
    /// The number of child nodes of this node.
    /// ```
    public int mNumChildren() {
    	return (int) M_NUM_CHILDREN_HANDLE.get(segment, 0L);
    }
    
    /// @see #mChildren()
    public AiNode mChildren(NativePointerArray mChildren) {
    	M_CHILDREN_HANDLE.set(segment, 0L, mChildren.memorySegment());
    	return this;
    }
    
    /// ```
    /// The child nodes of this node. nullptr if mNumChildren is 0.
    /// ```
    public @Nullable NativePointerArray mChildren() {
    	MemorySegment segment = (MemorySegment) M_CHILDREN_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #mNumMeshes()
    public AiNode mNumMeshes(int mNumMeshes) {
    	M_NUM_MESHES_HANDLE.set(segment, 0L, mNumMeshes);
    	return this;
    }
    
    /// ```
    /// The number of meshes of this node.
    /// ```
    public int mNumMeshes() {
    	return (int) M_NUM_MESHES_HANDLE.get(segment, 0L);
    }
    
    /// @see #mMeshes()
    public AiNode mMeshes(NativeIntArray mMeshes) {
    	M_MESHES_HANDLE.set(segment, 0L, mMeshes.memorySegment());
    	return this;
    }
    
    /// ```
    /// The meshes of this node. Each entry is an index into the
    /// mesh list of the #aiScene.
    /// ```
    public @Nullable NativeIntArray mMeshes() {
    	MemorySegment segment = (MemorySegment) M_MESHES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #mMetaData()
    public AiNode mMetaData(AiMetadata mMetaData) {
    	M_META_DATA_HANDLE.set(segment, 0L, mMetaData.memorySegment());
    	return this;
    }
    
    /// ```
    /// Metadata associated with this node or nullptr if there is no metadata.
    /// Whether any metadata is generated depends on the source file format. See the
    /// @link importer_notes @endlink page for more information on every source file
    /// format. Importers that don't document any metadata don't write any.
    /// ```
    public @Nullable AiMetadata mMetaData() {
    	MemorySegment segment = (MemorySegment) M_META_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AiMetadata(segment);
    }
    
    @Override
    public AiNode set(AiNode other) {
        return set(other.segment);
    }
    
    @Override
    public AiNode set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiNode> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiNode> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiNode(segment),
            count
        );
    }
    
    public static NativeStructArray<AiNode> array(Arena arena, AiNode... structs) {
        NativeStructArray<AiNode> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiNode(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiNode> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiNode(segment)
        );
    }

}