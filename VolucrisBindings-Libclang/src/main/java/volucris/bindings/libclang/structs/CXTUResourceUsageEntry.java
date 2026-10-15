/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class CXTUResourceUsageEntry
		implements Struct<CXTUResourceUsageEntry> {

	public static final StructLayout LAYOUT;

	public static final VarHandle KIND_HANDLE;
	public static final VarHandle AMOUNT_HANDLE;

	public static final long KIND_BYTE_OFFSET;
	public static final long AMOUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("kind"),
		    JAVA_INT.withName("amount")
		).withName("CXTUResourceUsageEntry").withByteAlignment(4);
		
		KIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("kind"));
		AMOUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("amount"));
		
		KIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("kind"));
		AMOUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("amount"));
		//@formatter:on
	}

	public CXTUResourceUsageEntry() {
	    this(Arena.ofAuto());
	}
	
	public CXTUResourceUsageEntry(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public CXTUResourceUsageEntry(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #kind()
    public CXTUResourceUsageEntry kind(int kind) {
    	KIND_HANDLE.set(segment, 0L, kind);
    	return this;
    }
    
    public int kind() {
    	return (int) KIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #amount()
    public CXTUResourceUsageEntry amount(int amount) {
    	AMOUNT_HANDLE.set(segment, 0L, amount);
    	return this;
    }
    
    public int amount() {
    	return (int) AMOUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CXTUResourceUsageEntry set(CXTUResourceUsageEntry other) {
        return set(other.segment);
    }
    
    @Override
    public CXTUResourceUsageEntry set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXTUResourceUsageEntry> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXTUResourceUsageEntry> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXTUResourceUsageEntry(segment),
            count
        );
    }
    
    public static NativeStructArray<CXTUResourceUsageEntry> array(Arena arena, CXTUResourceUsageEntry... structs) {
        NativeStructArray<CXTUResourceUsageEntry> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXTUResourceUsageEntry(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXTUResourceUsageEntry> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXTUResourceUsageEntry(segment)
        );
    }

}