/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// Identifies an array of ranges.
/// ```
public final class CXSourceRangeList
		implements Struct<CXSourceRangeList> {

	public static final StructLayout LAYOUT;

	public static final VarHandle COUNT_HANDLE;
	public static final VarHandle RANGES_HANDLE;

	public static final long COUNT_BYTE_OFFSET;
	public static final long RANGES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("count"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("ranges")
		).withName("CXSourceRangeList").withByteAlignment(8);
		
		COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("count"));
		RANGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ranges"));
		
		COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("count"));
		RANGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ranges"));
		//@formatter:on
	}

	public CXSourceRangeList() {
	    this(Arena.ofAuto());
	}
	
	public CXSourceRangeList(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public CXSourceRangeList(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #count()
    public CXSourceRangeList count(int count) {
    	COUNT_HANDLE.set(segment, 0L, count);
    	return this;
    }
    
    /// ```
    /// The number of ranges in the \c ranges array.
    /// ```
    public int count() {
    	return (int) COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #ranges()
    public CXSourceRangeList ranges(CXSourceRange ranges) {
    	RANGES_HANDLE.set(segment, 0L, ranges.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// An array of \c CXSourceRanges.
    /// ```
    public @Nullable CXSourceRange ranges() {
    	MemorySegment segment = (MemorySegment) RANGES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceRange(segment);
    }
    
    @Override
    public CXSourceRangeList set(CXSourceRangeList other) {
        return set(other.segment);
    }
    
    @Override
    public CXSourceRangeList set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXSourceRangeList> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXSourceRangeList> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXSourceRangeList(segment),
            count
        );
    }
    
    public static NativeStructArray<CXSourceRangeList> array(Arena arena, CXSourceRangeList... structs) {
        NativeStructArray<CXSourceRangeList> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXSourceRangeList(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXSourceRangeList> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXSourceRangeList(segment)
        );
    }

}