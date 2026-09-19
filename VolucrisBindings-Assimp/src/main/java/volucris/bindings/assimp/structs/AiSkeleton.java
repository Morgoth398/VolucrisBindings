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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// @brief A skeleton represents the bone hierarchy of an animation.
/// 
/// Skeleton animations can be described as a tree of bones:
/// root
/// |
/// node1
/// /   \
/// node3  node4
/// If you want to calculate the transformation of node three you need to compute the
/// transformation hierarchy for the transformation chain of node3:
/// root->node1->node3
/// Each node is represented as a skeleton instance.
/// ```
public final class AiSkeleton
		implements Struct<AiSkeleton> {

    public static final StructLayout LAYOUT;

    public static final VarHandle M_NUM_BONES_HANDLE;
    public static final VarHandle M_BONES_HANDLE;

    public static final long M_NAME_BYTE_OFFSET;
    public static final long M_NUM_BONES_BYTE_OFFSET;
    public static final long M_BONES_BYTE_OFFSET;

    private final MemorySegment segment;

    private final AiString mName;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            AiString.LAYOUT.withName("mName"),
            JAVA_INT.withName("mNumBones"),
            UNBOUNDED_ADDRESS.withName("mBones")
        ).withName("aiSkeleton").withByteAlignment(8);
        
        M_NUM_BONES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumBones"));
        M_BONES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mBones"));
        
        M_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mName"));
        M_NUM_BONES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumBones"));
        M_BONES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mBones"));
        //@formatter:on
    }

    public AiSkeleton() {
        this(Arena.ofAuto());
    }
    
    public AiSkeleton(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public AiSkeleton(MemorySegment segment) {
        this.segment = segment;
    
        mName = new AiString(segment.asSlice(M_NAME_BYTE_OFFSET, AiString.LAYOUT));
    }

    /// @see #mNumBones()
    public AiSkeleton mNumBones(int mNumBones) {
    	M_NUM_BONES_HANDLE.set(segment, 0L, mNumBones);
    	return this;
    }
    
    /// ```
    /// 
    /// @brief  The number of bones in the skeleton.
    /// ```
    public int mNumBones() {
    	return (int) M_NUM_BONES_HANDLE.get(segment, 0L);
    }
    
    /// @see #mBones()
    public AiSkeleton mBones(NativePointerArray mBones) {
    	M_BONES_HANDLE.set(segment, 0L, mBones.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// @brief The bone instance in the skeleton.
    /// ```
    public @Nullable NativePointerArray mBones() {
    	MemorySegment segment = (MemorySegment) M_BONES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #mName()
    public AiSkeleton mName(Consumer<AiString> consumer) {
    	consumer.accept(mName);
    	return this;
    }
    
    /// @see #mName()
    public AiSkeleton mName(AiString other) {
    	mName.set(other);
    	return this;
    }
    
    /// ```
    /// 
    /// @brief The name of the skeleton instance.
    /// ```
    public AiString mName() {
    	return mName;
    }
    
    @Override
    public AiSkeleton set(AiSkeleton other) {
        return set(other.segment);
    }
    
    @Override
    public AiSkeleton set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiSkeleton> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiSkeleton> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiSkeleton(segment),
            count
        );
    }
    
    public static NativeStructArray<AiSkeleton> array(Arena arena, AiSkeleton... structs) {
        NativeStructArray<AiSkeleton> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiSkeleton(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiSkeleton> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiSkeleton(segment)
        );
    }
    
}