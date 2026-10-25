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
/// The memory usage of a CXTranslationUnit, broken into categories.
/// ```
public final class CXTUResourceUsage
		implements Struct<CXTUResourceUsage> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DATA_HANDLE;
	public static final VarHandle NUM_ENTRIES_HANDLE;
	public static final VarHandle ENTRIES_HANDLE;

	public static final long DATA_BYTE_OFFSET;
	public static final long NUM_ENTRIES_BYTE_OFFSET;
	public static final long ENTRIES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("data"),
		    JAVA_INT.withName("numEntries"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("entries")
		).withName("CXTUResourceUsage").withByteAlignment(8);
		
		DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("data"));
		NUM_ENTRIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numEntries"));
		ENTRIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("entries"));
		
		DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
		NUM_ENTRIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numEntries"));
		ENTRIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("entries"));
		//@formatter:on
	}

	public CXTUResourceUsage() {
	    this(Arena.ofAuto());
	}
	
	public CXTUResourceUsage(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public CXTUResourceUsage(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #data()
    public CXTUResourceUsage data(MemorySegment data) {
    	DATA_HANDLE.set(segment, 0L, data);
    	return this;
    }
    
    public @Nullable MemorySegment data() {
    	MemorySegment segment = (MemorySegment) DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #numEntries()
    public CXTUResourceUsage numEntries(int numEntries) {
    	NUM_ENTRIES_HANDLE.set(segment, 0L, numEntries);
    	return this;
    }
    
    public int numEntries() {
    	return (int) NUM_ENTRIES_HANDLE.get(segment, 0L);
    }
    
    /// @see #entries()
    public CXTUResourceUsage entries(CXTUResourceUsageEntry entries) {
    	ENTRIES_HANDLE.set(segment, 0L, entries.memorySegment());
    	return this;
    }
    
    public @Nullable CXTUResourceUsageEntry entries() {
    	MemorySegment segment = (MemorySegment) ENTRIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXTUResourceUsageEntry(segment);
    }
    
    @Override
    public CXTUResourceUsage set(CXTUResourceUsage other) {
        return set(other.segment);
    }
    
    @Override
    public CXTUResourceUsage set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXTUResourceUsage> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXTUResourceUsage> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXTUResourceUsage(segment),
            count
        );
    }
    
    public static NativeStructArray<CXTUResourceUsage> array(Arena arena, CXTUResourceUsage... structs) {
        NativeStructArray<CXTUResourceUsage> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXTUResourceUsage(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXTUResourceUsage> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXTUResourceUsage(segment)
        );
    }

}