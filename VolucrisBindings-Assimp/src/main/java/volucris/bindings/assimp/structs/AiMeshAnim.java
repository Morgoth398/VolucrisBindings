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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Describes vertex-based animations for a single mesh or a group of
/// meshes. Meshes carry the animation data for each frame in their
/// aiMesh::mAnimMeshes array. The purpose of aiMeshAnim is to
/// define keyframes linking each mesh attachment to a particular
/// point in time.
/// ```
public final class AiMeshAnim
		implements Struct<AiMeshAnim> {

	public static final StructLayout LAYOUT;

	public static final VarHandle M_NUM_KEYS_HANDLE;
	public static final VarHandle M_KEYS_HANDLE;

	public static final long M_NAME_BYTE_OFFSET;
	public static final long M_NUM_KEYS_BYTE_OFFSET;
	public static final long M_KEYS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final AiString mName;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    AiString.LAYOUT.withName("mName"),
		    JAVA_INT.withName("mNumKeys"),
		    UNBOUNDED_ADDRESS.withName("mKeys")
		).withName("aiMeshAnim").withByteAlignment(8);
		
		M_NUM_KEYS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumKeys"));
		M_KEYS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mKeys"));
		
		M_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mName"));
		M_NUM_KEYS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumKeys"));
		M_KEYS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mKeys"));
		//@formatter:on
	}

	public AiMeshAnim() {
	    this(Arena.ofAuto());
	}
	
	public AiMeshAnim(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public AiMeshAnim(MemorySegment segment) {
	    this.segment = segment;
	
	    mName = new AiString(segment.asSlice(M_NAME_BYTE_OFFSET, AiString.LAYOUT));
	}

    /// @see #mName()
    public AiMeshAnim mName(Consumer<AiString> consumer) {
    	consumer.accept(mName);
    	return this;
    }
    
    /// @see #mName()
    public AiMeshAnim mName(AiString other) {
    	mName.set(other);
    	return this;
    }
    
    /// ```
    /// Name of the mesh to be animated. An empty string is not allowed,
    /// animated meshes need to be named (not necessarily uniquely,
    /// the name can basically serve as wild-card to select a group
    /// of meshes with similar animation setup)
    /// ```
    public AiString mName() {
    	return mName;
    }
    
    /// @see #mNumKeys()
    public AiMeshAnim mNumKeys(int mNumKeys) {
    	M_NUM_KEYS_HANDLE.set(segment, 0L, mNumKeys);
    	return this;
    }
    
    /// ```
    /// Size of the #mKeys array. Must be 1, at least.
    /// ```
    public int mNumKeys() {
    	return (int) M_NUM_KEYS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mKeys()
    public AiMeshAnim mKeys(AiMeshKey mKeys) {
    	M_KEYS_HANDLE.set(segment, 0L, mKeys.memorySegment());
    	return this;
    }
    
    /// ```
    /// Key frames of the animation. May not be nullptr.
    /// ```
    public @Nullable AiMeshKey mKeys() {
    	MemorySegment segment = (MemorySegment) M_KEYS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AiMeshKey(segment);
    }
    
    @Override
    public AiMeshAnim set(AiMeshAnim other) {
        return set(other.segment);
    }
    
    @Override
    public AiMeshAnim set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiMeshAnim> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiMeshAnim> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMeshAnim(segment),
            count
        );
    }
    
    public static NativeStructArray<AiMeshAnim> array(Arena arena, AiMeshAnim... structs) {
        NativeStructArray<AiMeshAnim> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMeshAnim(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiMeshAnim> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiMeshAnim(segment)
        );
    }

}