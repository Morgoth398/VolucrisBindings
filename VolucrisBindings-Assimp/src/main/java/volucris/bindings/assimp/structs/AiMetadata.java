/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// Container for holding metadata.
/// 
/// Metadata is a key-value store using string keys and values.
/// ```
public final class AiMetadata
		implements Struct<AiMetadata> {

    public static final StructLayout LAYOUT;

    public static final VarHandle M_NUM_PROPERTIES_HANDLE;
    public static final VarHandle M_KEYS_HANDLE;
    public static final VarHandle M_VALUES_HANDLE;

    public static final long M_NUM_PROPERTIES_BYTE_OFFSET;
    public static final long M_KEYS_BYTE_OFFSET;
    public static final long M_VALUES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("mNumProperties"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("mKeys"),
            UNBOUNDED_ADDRESS.withName("mValues")
        ).withName("aiMetadata").withByteAlignment(8);
        
        M_NUM_PROPERTIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumProperties"));
        M_KEYS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mKeys"));
        M_VALUES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mValues"));
        
        M_NUM_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumProperties"));
        M_KEYS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mKeys"));
        M_VALUES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mValues"));
        //@formatter:on
    }

    public AiMetadata() {
        this(Arena.ofAuto());
    }
    
    public AiMetadata(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public AiMetadata(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #mNumProperties()
    public AiMetadata mNumProperties(int mNumProperties) {
    	M_NUM_PROPERTIES_HANDLE.set(segment, 0L, mNumProperties);
    	return this;
    }
    
    /// ```
    /// Length of the mKeys and mValues arrays, respectively
    /// ```
    public int mNumProperties() {
    	return (int) M_NUM_PROPERTIES_HANDLE.get(segment, 0L);
    }
    
    /// @see #mKeys()
    public AiMetadata mKeys(NativeStructArray<AiString> mKeys) {
    	M_KEYS_HANDLE.set(segment, 0L, mKeys.memorySegment());
    	return this;
    }
    
    /// ```
    /// Arrays of keys, may not be NULL. Entries in this array may not be NULL as well.
    /// ```
    public @Nullable NativeStructArray<AiString> mKeys() {
    	MemorySegment segment = (MemorySegment) M_KEYS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiString.array(segment);
    }
    
    /// @see #mValues()
    public AiMetadata mValues(NativeStructArray<AiMetadataEntry> mValues) {
    	M_VALUES_HANDLE.set(segment, 0L, mValues.memorySegment());
    	return this;
    }
    
    /// ```
    /// Arrays of values, may not be NULL. Entries in this array may be NULL if the
    /// corresponding property key has no assigned value.
    /// ```
    public @Nullable NativeStructArray<AiMetadataEntry> mValues() {
    	MemorySegment segment = (MemorySegment) M_VALUES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiMetadataEntry.array(segment);
    }
    
    @Override
    public AiMetadata set(AiMetadata other) {
        return set(other.segment);
    }
    
    @Override
    public AiMetadata set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiMetadata> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiMetadata> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMetadata(segment),
            count
        );
    }
    
    public static NativeStructArray<AiMetadata> array(Arena arena, AiMetadata... structs) {
        NativeStructArray<AiMetadata> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMetadata(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiMetadata> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiMetadata(segment)
        );
    }
    
}