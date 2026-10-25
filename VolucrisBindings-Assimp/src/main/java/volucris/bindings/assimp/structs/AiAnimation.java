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
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// An animation consists of key-frame data for a number of nodes. For
/// each node affected by the animation a separate series of data is given.
/// ```
public final class AiAnimation
		implements Struct<AiAnimation> {

	public static final StructLayout LAYOUT;

	public static final VarHandle M_DURATION_HANDLE;
	public static final VarHandle M_TICKS_PER_SECOND_HANDLE;
	public static final VarHandle M_NUM_CHANNELS_HANDLE;
	public static final VarHandle M_CHANNELS_HANDLE;
	public static final VarHandle M_NUM_MESH_CHANNELS_HANDLE;
	public static final VarHandle M_MESH_CHANNELS_HANDLE;
	public static final VarHandle M_NUM_MORPH_MESH_CHANNELS_HANDLE;
	public static final VarHandle M_MORPH_MESH_CHANNELS_HANDLE;

	public static final long M_NAME_BYTE_OFFSET;
	public static final long M_DURATION_BYTE_OFFSET;
	public static final long M_TICKS_PER_SECOND_BYTE_OFFSET;
	public static final long M_NUM_CHANNELS_BYTE_OFFSET;
	public static final long M_CHANNELS_BYTE_OFFSET;
	public static final long M_NUM_MESH_CHANNELS_BYTE_OFFSET;
	public static final long M_MESH_CHANNELS_BYTE_OFFSET;
	public static final long M_NUM_MORPH_MESH_CHANNELS_BYTE_OFFSET;
	public static final long M_MORPH_MESH_CHANNELS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final AiString mName;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    AiString.LAYOUT.withName("mName"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_DOUBLE.withName("mDuration"),
		    JAVA_DOUBLE.withName("mTicksPerSecond"),
		    JAVA_INT.withName("mNumChannels"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("mChannels"),
		    JAVA_INT.withName("mNumMeshChannels"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("mMeshChannels"),
		    JAVA_INT.withName("mNumMorphMeshChannels"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("mMorphMeshChannels")
		).withName("aiAnimation").withByteAlignment(8);
		
		M_DURATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mDuration"));
		M_TICKS_PER_SECOND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mTicksPerSecond"));
		M_NUM_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumChannels"));
		M_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mChannels"));
		M_NUM_MESH_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumMeshChannels"));
		M_MESH_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mMeshChannels"));
		M_NUM_MORPH_MESH_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumMorphMeshChannels"));
		M_MORPH_MESH_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mMorphMeshChannels"));
		
		M_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mName"));
		M_DURATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mDuration"));
		M_TICKS_PER_SECOND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mTicksPerSecond"));
		M_NUM_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumChannels"));
		M_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mChannels"));
		M_NUM_MESH_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumMeshChannels"));
		M_MESH_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMeshChannels"));
		M_NUM_MORPH_MESH_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumMorphMeshChannels"));
		M_MORPH_MESH_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMorphMeshChannels"));
		//@formatter:on
	}

	public AiAnimation() {
	    this(Arena.ofAuto());
	}
	
	public AiAnimation(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiAnimation(MemorySegment segment) {
	    this.segment = segment;
	
	    mName = new AiString(segment.asSlice(M_NAME_BYTE_OFFSET, AiString.LAYOUT));
	}

    /// @see #mName()
    public AiAnimation mName(Consumer<AiString> consumer) {
    	consumer.accept(mName);
    	return this;
    }
    
    /// @see #mName()
    public AiAnimation mName(AiString other) {
    	mName.set(other);
    	return this;
    }
    
    /// ```
    /// The name of the animation. If the modeling package this data was
    /// exported from does support only a single animation channel, this
    /// name is usually empty (length is zero).
    /// ```
    public AiString mName() {
    	return mName;
    }
    
    /// @see #mDuration()
    public AiAnimation mDuration(double mDuration) {
    	M_DURATION_HANDLE.set(segment, 0L, mDuration);
    	return this;
    }
    
    /// ```
    /// Duration of the animation in ticks.
    /// ```
    public double mDuration() {
    	return (double) M_DURATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #mTicksPerSecond()
    public AiAnimation mTicksPerSecond(double mTicksPerSecond) {
    	M_TICKS_PER_SECOND_HANDLE.set(segment, 0L, mTicksPerSecond);
    	return this;
    }
    
    /// ```
    /// Ticks per second. 0 if not specified in the imported file
    /// ```
    public double mTicksPerSecond() {
    	return (double) M_TICKS_PER_SECOND_HANDLE.get(segment, 0L);
    }
    
    /// @see #mNumChannels()
    public AiAnimation mNumChannels(int mNumChannels) {
    	M_NUM_CHANNELS_HANDLE.set(segment, 0L, mNumChannels);
    	return this;
    }
    
    /// ```
    /// The number of bone animation channels. Each channel affects
    /// a single node.
    /// ```
    public int mNumChannels() {
    	return (int) M_NUM_CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mChannels()
    public AiAnimation mChannels(NativePointerArray mChannels) {
    	M_CHANNELS_HANDLE.set(segment, 0L, mChannels.memorySegment());
    	return this;
    }
    
    /// ```
    /// The node animation channels. Each channel affects a single node.
    /// The array is mNumChannels in size.
    /// ```
    public @Nullable NativePointerArray mChannels() {
    	MemorySegment segment = (MemorySegment) M_CHANNELS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #mNumMeshChannels()
    public AiAnimation mNumMeshChannels(int mNumMeshChannels) {
    	M_NUM_MESH_CHANNELS_HANDLE.set(segment, 0L, mNumMeshChannels);
    	return this;
    }
    
    /// ```
    /// The number of mesh animation channels. Each channel affects
    /// a single mesh and defines vertex-based animation.
    /// ```
    public int mNumMeshChannels() {
    	return (int) M_NUM_MESH_CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mMeshChannels()
    public AiAnimation mMeshChannels(NativePointerArray mMeshChannels) {
    	M_MESH_CHANNELS_HANDLE.set(segment, 0L, mMeshChannels.memorySegment());
    	return this;
    }
    
    /// ```
    /// The mesh animation channels. Each channel affects a single mesh.
    /// The array is mNumMeshChannels in size.
    /// ```
    public @Nullable NativePointerArray mMeshChannels() {
    	MemorySegment segment = (MemorySegment) M_MESH_CHANNELS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #mNumMorphMeshChannels()
    public AiAnimation mNumMorphMeshChannels(int mNumMorphMeshChannels) {
    	M_NUM_MORPH_MESH_CHANNELS_HANDLE.set(segment, 0L, mNumMorphMeshChannels);
    	return this;
    }
    
    /// ```
    /// The number of mesh animation channels. Each channel affects
    /// a single mesh and defines morphing animation.
    /// ```
    public int mNumMorphMeshChannels() {
    	return (int) M_NUM_MORPH_MESH_CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mMorphMeshChannels()
    public AiAnimation mMorphMeshChannels(NativePointerArray mMorphMeshChannels) {
    	M_MORPH_MESH_CHANNELS_HANDLE.set(segment, 0L, mMorphMeshChannels.memorySegment());
    	return this;
    }
    
    /// ```
    /// The morph mesh animation channels. Each channel affects a single mesh.
    /// The array is mNumMorphMeshChannels in size.
    /// ```
    public @Nullable NativePointerArray mMorphMeshChannels() {
    	MemorySegment segment = (MemorySegment) M_MORPH_MESH_CHANNELS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public AiAnimation set(AiAnimation other) {
        return set(other.segment);
    }
    
    @Override
    public AiAnimation set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiAnimation> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiAnimation> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiAnimation(segment),
            count
        );
    }
    
    public static NativeStructArray<AiAnimation> array(Arena arena, AiAnimation... structs) {
        NativeStructArray<AiAnimation> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiAnimation(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiAnimation> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiAnimation(segment)
        );
    }

}