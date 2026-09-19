/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// @brief A single influence of a bone on a vertex.
/// ```
public final class AiVertexWeight
		implements Struct<AiVertexWeight> {

    public static final StructLayout LAYOUT;

    public static final VarHandle M_VERTEX_ID_HANDLE;
    public static final VarHandle M_WEIGHT_HANDLE;

    public static final long M_VERTEX_ID_BYTE_OFFSET;
    public static final long M_WEIGHT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("mVertexId"),
            JAVA_FLOAT.withName("mWeight")
        ).withName("aiVertexWeight").withByteAlignment(4);
        
        M_VERTEX_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mVertexId"));
        M_WEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mWeight"));
        
        M_VERTEX_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mVertexId"));
        M_WEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mWeight"));
        //@formatter:on
    }

    public AiVertexWeight() {
        this(Arena.ofAuto());
    }
    
    public AiVertexWeight(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public AiVertexWeight(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #mVertexId()
    public AiVertexWeight mVertexId(int mVertexId) {
    	M_VERTEX_ID_HANDLE.set(segment, 0L, mVertexId);
    	return this;
    }
    
    /// ```
    /// Index of the vertex which is influenced by the bone.
    /// ```
    public int mVertexId() {
    	return (int) M_VERTEX_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #mWeight()
    public AiVertexWeight mWeight(float mWeight) {
    	M_WEIGHT_HANDLE.set(segment, 0L, mWeight);
    	return this;
    }
    
    /// ```
    /// The strength of the influence in the range (0...1).
    /// The influence from all bones at one vertex amounts to 1.
    /// ```
    public float mWeight() {
    	return (float) M_WEIGHT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiVertexWeight set(AiVertexWeight other) {
        return set(other.segment);
    }
    
    @Override
    public AiVertexWeight set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiVertexWeight> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiVertexWeight> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiVertexWeight(segment),
            count
        );
    }
    
    public static NativeStructArray<AiVertexWeight> array(Arena arena, AiVertexWeight... structs) {
        NativeStructArray<AiVertexWeight> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiVertexWeight(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiVertexWeight> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiVertexWeight(segment)
        );
    }
    
}