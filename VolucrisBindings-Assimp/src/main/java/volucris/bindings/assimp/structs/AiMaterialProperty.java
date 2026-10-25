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
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// @brief Data structure for a single material property
/// 
/// As an user, you'll probably never need to deal with this data structure.
/// Just use the provided aiGetMaterialXXX() or aiMaterial::Get() family
/// of functions to query material properties easily. Processing them
/// manually is faster, but it is not the recommended way. It isn't worth
/// the effort. <br>
/// Material property names follow a simple scheme:
/// @code
/// $<name>
/// ?<name>
/// A public property, there must be corresponding AI_MATKEY_XXX define
/// 2nd: Public, but ignored by the #aiProcess_RemoveRedundantMaterials
/// post-processing step.
/// ~<name>
/// A temporary property for internal use.
/// @endcode
/// @see aiMaterial
/// ```
public final class AiMaterialProperty
		implements Struct<AiMaterialProperty> {

	public static final StructLayout LAYOUT;

	public static final VarHandle M_SEMANTIC_HANDLE;
	public static final VarHandle M_INDEX_HANDLE;
	public static final VarHandle M_DATA_LENGTH_HANDLE;
	public static final VarHandle M_TYPE_HANDLE;
	public static final VarHandle M_DATA_HANDLE;

	public static final long M_KEY_BYTE_OFFSET;
	public static final long M_SEMANTIC_BYTE_OFFSET;
	public static final long M_INDEX_BYTE_OFFSET;
	public static final long M_DATA_LENGTH_BYTE_OFFSET;
	public static final long M_TYPE_BYTE_OFFSET;
	public static final long M_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final AiString mKey;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    AiString.LAYOUT.withName("mKey"),
		    JAVA_INT.withName("mSemantic"),
		    JAVA_INT.withName("mIndex"),
		    JAVA_INT.withName("mDataLength"),
		    JAVA_INT.withName("mType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("mData")
		).withName("aiMaterialProperty").withByteAlignment(8);
		
		M_SEMANTIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mSemantic"));
		M_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mIndex"));
		M_DATA_LENGTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mDataLength"));
		M_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mType"));
		M_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mData"));
		
		M_KEY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mKey"));
		M_SEMANTIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mSemantic"));
		M_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mIndex"));
		M_DATA_LENGTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mDataLength"));
		M_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mType"));
		M_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mData"));
		//@formatter:on
	}

	public AiMaterialProperty() {
	    this(Arena.ofAuto());
	}
	
	public AiMaterialProperty(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiMaterialProperty(MemorySegment segment) {
	    this.segment = segment;
	
	    mKey = new AiString(segment.asSlice(M_KEY_BYTE_OFFSET, AiString.LAYOUT));
	}

    /// @see #mKey()
    public AiMaterialProperty mKey(Consumer<AiString> consumer) {
    	consumer.accept(mKey);
    	return this;
    }
    
    /// @see #mKey()
    public AiMaterialProperty mKey(AiString other) {
    	mKey.set(other);
    	return this;
    }
    
    /// ```
    /// Specifies the name of the property (key)
    /// Keys are generally case insensitive.
    /// ```
    public AiString mKey() {
    	return mKey;
    }
    
    /// @see #mSemantic()
    public AiMaterialProperty mSemantic(int mSemantic) {
    	M_SEMANTIC_HANDLE.set(segment, 0L, mSemantic);
    	return this;
    }
    
    /// ```
    /// Textures: Specifies their exact usage semantic.
    /// For non-texture properties, this member is always 0
    /// (or, better-said, #aiTextureType_NONE).
    /// ```
    public int mSemantic() {
    	return (int) M_SEMANTIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #mIndex()
    public AiMaterialProperty mIndex(int mIndex) {
    	M_INDEX_HANDLE.set(segment, 0L, mIndex);
    	return this;
    }
    
    /// ```
    /// Textures: Specifies the index of the texture.
    /// For non-texture properties, this member is always 0.
    /// ```
    public int mIndex() {
    	return (int) M_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #mDataLength()
    public AiMaterialProperty mDataLength(int mDataLength) {
    	M_DATA_LENGTH_HANDLE.set(segment, 0L, mDataLength);
    	return this;
    }
    
    /// ```
    /// Size of the buffer mData is pointing to, in bytes.
    /// This value may not be 0.
    /// ```
    public int mDataLength() {
    	return (int) M_DATA_LENGTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #mType()
    public AiMaterialProperty mType(int mType) {
    	M_TYPE_HANDLE.set(segment, 0L, mType);
    	return this;
    }
    
    /// ```
    /// Type information for the property.
    /// 
    /// Defines the data layout inside the data buffer. This is used
    /// by the library internally to perform debug checks and to
    /// utilize proper type conversions.
    /// (It's probably a hacky solution, but it works.)
    /// ```
    public int mType() {
    	return (int) M_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #mData()
    public AiMaterialProperty mData(NativeByteArray mData) {
    	M_DATA_HANDLE.set(segment, 0L, mData.memorySegment());
    	return this;
    }
    
    /// ```
    /// Binary buffer to hold the property's value.
    /// The size of the buffer is always mDataLength.
    /// ```
    public @Nullable NativeByteArray mData() {
    	MemorySegment segment = (MemorySegment) M_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    @Override
    public AiMaterialProperty set(AiMaterialProperty other) {
        return set(other.segment);
    }
    
    @Override
    public AiMaterialProperty set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiMaterialProperty> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiMaterialProperty> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMaterialProperty(segment),
            count
        );
    }
    
    public static NativeStructArray<AiMaterialProperty> array(Arena arena, AiMaterialProperty... structs) {
        NativeStructArray<AiMaterialProperty> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMaterialProperty(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiMaterialProperty> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiMaterialProperty(segment)
        );
    }

}