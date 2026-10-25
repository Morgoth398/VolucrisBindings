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

public final class CXCursorAndRangeVisitor
		implements Struct<CXCursorAndRangeVisitor> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CONTEXT_HANDLE;
	public static final VarHandle VISIT_HANDLE;

	public static final long CONTEXT_BYTE_OFFSET;
	public static final long VISIT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("context"),
		    UNBOUNDED_ADDRESS.withName("visit")
		).withName("CXCursorAndRangeVisitor").withByteAlignment(8);
		
		CONTEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("context"));
		VISIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("visit"));
		
		CONTEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("context"));
		VISIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("visit"));
		//@formatter:on
	}

	public CXCursorAndRangeVisitor() {
	    this(Arena.ofAuto());
	}
	
	public CXCursorAndRangeVisitor(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public CXCursorAndRangeVisitor(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #context()
    public CXCursorAndRangeVisitor context(MemorySegment context) {
    	CONTEXT_HANDLE.set(segment, 0L, context);
    	return this;
    }
    
    public @Nullable MemorySegment context() {
    	MemorySegment segment = (MemorySegment) CONTEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #visit()
    public CXCursorAndRangeVisitor visit(CXCursorAndRangeVisitorFunction visit) {
    	VISIT_HANDLE.set(segment, 0L, visit.memorySegment());
    	return this;
    }
    
    public @Nullable CXCursorAndRangeVisitorFunction visit() {
    	MemorySegment segment = (MemorySegment) VISIT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return CXCursorAndRangeVisitorFunction.get(segment);
    }
    
    @Override
    public CXCursorAndRangeVisitor set(CXCursorAndRangeVisitor other) {
        return set(other.segment);
    }
    
    @Override
    public CXCursorAndRangeVisitor set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXCursorAndRangeVisitor> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXCursorAndRangeVisitor> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXCursorAndRangeVisitor(segment),
            count
        );
    }
    
    public static NativeStructArray<CXCursorAndRangeVisitor> array(Arena arena, CXCursorAndRangeVisitor... structs) {
        NativeStructArray<CXCursorAndRangeVisitor> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXCursorAndRangeVisitor(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXCursorAndRangeVisitor> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXCursorAndRangeVisitor(segment)
        );
    }

}