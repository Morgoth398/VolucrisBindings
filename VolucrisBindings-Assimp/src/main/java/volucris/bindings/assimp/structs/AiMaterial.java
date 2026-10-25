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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class AiMaterial
		implements Struct<AiMaterial> {

	public static final StructLayout LAYOUT;

	public static final VarHandle M_PROPERTIES_HANDLE;
	public static final VarHandle M_NUM_PROPERTIES_HANDLE;
	public static final VarHandle M_NUM_ALLOCATED_HANDLE;

	public static final long M_PROPERTIES_BYTE_OFFSET;
	public static final long M_NUM_PROPERTIES_BYTE_OFFSET;
	public static final long M_NUM_ALLOCATED_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("mProperties"),
		    JAVA_INT.withName("mNumProperties"),
		    JAVA_INT.withName("mNumAllocated")
		).withName("aiMaterial").withByteAlignment(8);
		
		M_PROPERTIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mProperties"));
		M_NUM_PROPERTIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumProperties"));
		M_NUM_ALLOCATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumAllocated"));
		
		M_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mProperties"));
		M_NUM_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumProperties"));
		M_NUM_ALLOCATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumAllocated"));
		//@formatter:on
	}

	public AiMaterial() {
	    this(Arena.ofAuto());
	}
	
	public AiMaterial(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiMaterial(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #mProperties()
    public AiMaterial mProperties(NativePointerArray mProperties) {
    	M_PROPERTIES_HANDLE.set(segment, 0L, mProperties.memorySegment());
    	return this;
    }
    
    /// ```
    /// List of all material properties loaded.
    /// ```
    public @Nullable NativePointerArray mProperties() {
    	MemorySegment segment = (MemorySegment) M_PROPERTIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #mNumProperties()
    public AiMaterial mNumProperties(int mNumProperties) {
    	M_NUM_PROPERTIES_HANDLE.set(segment, 0L, mNumProperties);
    	return this;
    }
    
    /// ```
    /// Number of properties in the data base
    /// ```
    public int mNumProperties() {
    	return (int) M_NUM_PROPERTIES_HANDLE.get(segment, 0L);
    }
    
    /// @see #mNumAllocated()
    public AiMaterial mNumAllocated(int mNumAllocated) {
    	M_NUM_ALLOCATED_HANDLE.set(segment, 0L, mNumAllocated);
    	return this;
    }
    
    /// ```
    /// Storage allocated
    /// ```
    public int mNumAllocated() {
    	return (int) M_NUM_ALLOCATED_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiMaterial set(AiMaterial other) {
        return set(other.segment);
    }
    
    @Override
    public AiMaterial set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiMaterial> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiMaterial> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMaterial(segment),
            count
        );
    }
    
    public static NativeStructArray<AiMaterial> array(Arena arena, AiMaterial... structs) {
        NativeStructArray<AiMaterial> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMaterial(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiMaterial> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiMaterial(segment)
        );
    }

}