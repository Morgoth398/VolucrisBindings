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
/// Source location passed to index callbacks.
/// ```
public final class CXIdxLoc
		implements Struct<CXIdxLoc> {

    public static final StructLayout LAYOUT;

    public static final VarHandle PTR_DATA_HANDLE;
    public static final VarHandle INT_DATA_HANDLE;

    public static final long PTR_DATA_BYTE_OFFSET;
    public static final long INT_DATA_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, UNBOUNDED_ADDRESS).withName("ptr_data"),
            JAVA_INT.withName("int_data"),
            MemoryLayout.paddingLayout(4)
        ).withName("CXIdxLoc").withByteAlignment(8);
        
        PTR_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ptr_data"), PathElement.sequenceElement());
        INT_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("int_data"));
        
        PTR_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ptr_data"));
        INT_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("int_data"));
        //@formatter:on
    }

    public CXIdxLoc() {
        this(Arena.ofAuto());
    }
    
    public CXIdxLoc(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CXIdxLoc(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #ptr_data(int)
    public CXIdxLoc ptr_data(MemorySegment ptr_data, int index0) {
    	PTR_DATA_HANDLE.set(segment, 0L, index0, ptr_data);
    	return this;
    }
    
    public @Nullable MemorySegment ptr_data(int index0) {
    	MemorySegment segment = (MemorySegment) PTR_DATA_HANDLE.get(this.segment, 0L, index0);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #int_data()
    public CXIdxLoc int_data(int int_data) {
    	INT_DATA_HANDLE.set(segment, 0L, int_data);
    	return this;
    }
    
    public int int_data() {
    	return (int) INT_DATA_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CXIdxLoc set(CXIdxLoc other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxLoc set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxLoc> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxLoc> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxLoc(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxLoc> array(Arena arena, CXIdxLoc... structs) {
        NativeStructArray<CXIdxLoc> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxLoc(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxLoc> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxLoc(segment)
        );
    }
    
}