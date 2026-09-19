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
/// Describes a morphing animation of a given mesh.
/// ```
public final class AiMeshMorphAnim
		implements Struct<AiMeshMorphAnim> {

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
        ).withName("aiMeshMorphAnim").withByteAlignment(8);
        
        M_NUM_KEYS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumKeys"));
        M_KEYS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mKeys"));
        
        M_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mName"));
        M_NUM_KEYS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumKeys"));
        M_KEYS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mKeys"));
        //@formatter:on
    }

    public AiMeshMorphAnim() {
        this(Arena.ofAuto());
    }
    
    public AiMeshMorphAnim(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public AiMeshMorphAnim(MemorySegment segment) {
        this.segment = segment;
    
        mName = new AiString(segment.asSlice(M_NAME_BYTE_OFFSET, AiString.LAYOUT));
    }

    /// @see #mNumKeys()
    public AiMeshMorphAnim mNumKeys(int mNumKeys) {
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
    public AiMeshMorphAnim mKeys(AiMeshMorphKey mKeys) {
    	M_KEYS_HANDLE.set(segment, 0L, mKeys.memorySegment());
    	return this;
    }
    
    /// ```
    /// Key frames of the animation. May not be nullptr.
    /// ```
    public @Nullable AiMeshMorphKey mKeys() {
    	MemorySegment segment = (MemorySegment) M_KEYS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AiMeshMorphKey(segment);
    }
    
    /// @see #mName()
    public AiMeshMorphAnim mName(Consumer<AiString> consumer) {
    	consumer.accept(mName);
    	return this;
    }
    
    /// @see #mName()
    public AiMeshMorphAnim mName(AiString other) {
    	mName.set(other);
    	return this;
    }
    
    /// ```
    /// Name of the mesh to be animated. An empty string is not allowed,
    /// animated meshes need to be named (not necessarily uniquely,
    /// the name can basically serve as wildcard to select a group
    /// of meshes with similar animation setup)
    /// ```
    public AiString mName() {
    	return mName;
    }
    
    @Override
    public AiMeshMorphAnim set(AiMeshMorphAnim other) {
        return set(other.segment);
    }
    
    @Override
    public AiMeshMorphAnim set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiMeshMorphAnim> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiMeshMorphAnim> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMeshMorphAnim(segment),
            count
        );
    }
    
    public static NativeStructArray<AiMeshMorphAnim> array(Arena arena, AiMeshMorphAnim... structs) {
        NativeStructArray<AiMeshMorphAnim> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMeshMorphAnim(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiMeshMorphAnim> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiMeshMorphAnim(segment)
        );
    }
    
}