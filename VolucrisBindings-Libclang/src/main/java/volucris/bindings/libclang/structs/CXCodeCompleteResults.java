/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.structs;

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
/// Contains the results of code-completion.
/// 
/// This data structure contains the results of code completion, as
/// produced by \c clang_codeCompleteAt(). Its contents must be freed by
/// \c clang_disposeCodeCompleteResults.
/// ```
public final class CXCodeCompleteResults
		implements Struct<CXCodeCompleteResults> {

    public static final StructLayout LAYOUT;

    public static final VarHandle RESULTS_HANDLE;
    public static final VarHandle NUM_RESULTS_HANDLE;

    public static final long RESULTS_BYTE_OFFSET;
    public static final long NUM_RESULTS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("Results"),
            JAVA_INT.withName("NumResults"),
            MemoryLayout.paddingLayout(4)
        ).withName("CXCodeCompleteResults").withByteAlignment(8);
        
        RESULTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("Results"));
        NUM_RESULTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("NumResults"));
        
        RESULTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Results"));
        NUM_RESULTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("NumResults"));
        //@formatter:on
    }

    public CXCodeCompleteResults() {
        this(Arena.ofAuto());
    }
    
    public CXCodeCompleteResults(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CXCodeCompleteResults(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #results()
    public CXCodeCompleteResults results(CXCompletionResult results) {
    	RESULTS_HANDLE.set(segment, 0L, results.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// The code-completion results.
    /// ```
    public @Nullable CXCompletionResult results() {
    	MemorySegment segment = (MemorySegment) RESULTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXCompletionResult(segment);
    }
    
    /// @see #numResults()
    public CXCodeCompleteResults numResults(int numResults) {
    	NUM_RESULTS_HANDLE.set(segment, 0L, numResults);
    	return this;
    }
    
    /// ```
    /// 
    /// The number of code-completion results stored in the
    /// \c Results array.
    /// ```
    public int numResults() {
    	return (int) NUM_RESULTS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CXCodeCompleteResults set(CXCodeCompleteResults other) {
        return set(other.segment);
    }
    
    @Override
    public CXCodeCompleteResults set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXCodeCompleteResults> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXCodeCompleteResults> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXCodeCompleteResults(segment),
            count
        );
    }
    
    public static NativeStructArray<CXCodeCompleteResults> array(Arena arena, CXCodeCompleteResults... structs) {
        NativeStructArray<CXCodeCompleteResults> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXCodeCompleteResults(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXCodeCompleteResults> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXCodeCompleteResults(segment)
        );
    }
    
}