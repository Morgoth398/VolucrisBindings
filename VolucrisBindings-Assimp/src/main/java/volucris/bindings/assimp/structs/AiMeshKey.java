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
/// Binds a anim-mesh to a specific point in time.
/// ```
public final class AiMeshKey
		implements Struct<AiMeshKey> {

	public static final StructLayout LAYOUT;

	public static final VarHandle M_TIME_HANDLE;
	public static final VarHandle M_VALUE_HANDLE;

	public static final long M_TIME_BYTE_OFFSET;
	public static final long M_VALUE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_DOUBLE.withName("mTime"),
		    JAVA_INT.withName("mValue"),
		    MemoryLayout.paddingLayout(4)
		).withName("aiMeshKey").withByteAlignment(8);
		
		M_TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mTime"));
		M_VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mValue"));
		
		M_TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mTime"));
		M_VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mValue"));
		//@formatter:on
	}

	public AiMeshKey() {
	    this(Arena.ofAuto());
	}
	
	public AiMeshKey(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public AiMeshKey(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #mTime()
    public AiMeshKey mTime(double mTime) {
    	M_TIME_HANDLE.set(segment, 0L, mTime);
    	return this;
    }
    
    /// ```
    /// The time of this key
    /// ```
    public double mTime() {
    	return (double) M_TIME_HANDLE.get(segment, 0L);
    }
    
    /// @see #mValue()
    public AiMeshKey mValue(int mValue) {
    	M_VALUE_HANDLE.set(segment, 0L, mValue);
    	return this;
    }
    
    /// ```
    /// Index into the aiMesh::mAnimMeshes array of the
    /// mesh corresponding to the #aiMeshAnim hosting this
    /// key frame. The referenced anim mesh is evaluated
    /// according to the rules defined in the docs for #aiAnimMesh.
    /// ```
    public int mValue() {
    	return (int) M_VALUE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiMeshKey set(AiMeshKey other) {
        return set(other.segment);
    }
    
    @Override
    public AiMeshKey set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiMeshKey> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiMeshKey> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMeshKey(segment),
            count
        );
    }
    
    public static NativeStructArray<AiMeshKey> array(Arena arena, AiMeshKey... structs) {
        NativeStructArray<AiMeshKey> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMeshKey(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiMeshKey> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiMeshKey(segment)
        );
    }

}