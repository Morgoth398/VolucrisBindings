/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.meshoptimizer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MeshoptOverdrawStatistics
		implements Struct<MeshoptOverdrawStatistics> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PIXELS_COVERED_HANDLE;
	public static final VarHandle PIXELS_SHADED_HANDLE;
	public static final VarHandle OVERDRAW_HANDLE;

	public static final long PIXELS_COVERED_BYTE_OFFSET;
	public static final long PIXELS_SHADED_BYTE_OFFSET;
	public static final long OVERDRAW_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("pixels_covered"),
		    JAVA_INT.withName("pixels_shaded"),
		    JAVA_FLOAT.withName("overdraw")
		).withName("meshopt_OverdrawStatistics").withByteAlignment(4);
		
		PIXELS_COVERED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pixels_covered"));
		PIXELS_SHADED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pixels_shaded"));
		OVERDRAW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("overdraw"));
		
		PIXELS_COVERED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pixels_covered"));
		PIXELS_SHADED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pixels_shaded"));
		OVERDRAW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("overdraw"));
		//@formatter:on
	}

	public MeshoptOverdrawStatistics() {
	    this(Arena.ofAuto());
	}
	
	public MeshoptOverdrawStatistics(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MeshoptOverdrawStatistics(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #pixels_covered()
    public MeshoptOverdrawStatistics pixels_covered(int pixels_covered) {
    	PIXELS_COVERED_HANDLE.set(segment, 0L, pixels_covered);
    	return this;
    }
    
    public int pixels_covered() {
    	return (int) PIXELS_COVERED_HANDLE.get(segment, 0L);
    }
    
    /// @see #pixels_shaded()
    public MeshoptOverdrawStatistics pixels_shaded(int pixels_shaded) {
    	PIXELS_SHADED_HANDLE.set(segment, 0L, pixels_shaded);
    	return this;
    }
    
    public int pixels_shaded() {
    	return (int) PIXELS_SHADED_HANDLE.get(segment, 0L);
    }
    
    /// @see #overdraw()
    public MeshoptOverdrawStatistics overdraw(float overdraw) {
    	OVERDRAW_HANDLE.set(segment, 0L, overdraw);
    	return this;
    }
    
    public float overdraw() {
    	return (float) OVERDRAW_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MeshoptOverdrawStatistics set(MeshoptOverdrawStatistics other) {
        return set(other.segment);
    }
    
    @Override
    public MeshoptOverdrawStatistics set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MeshoptOverdrawStatistics> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MeshoptOverdrawStatistics> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MeshoptOverdrawStatistics(segment),
            count
        );
    }
    
    public static NativeStructArray<MeshoptOverdrawStatistics> array(SegmentAllocator allocator, MeshoptOverdrawStatistics... structs) {
        NativeStructArray<MeshoptOverdrawStatistics> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MeshoptOverdrawStatistics(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MeshoptOverdrawStatistics> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MeshoptOverdrawStatistics(segment)
        );
    }

}