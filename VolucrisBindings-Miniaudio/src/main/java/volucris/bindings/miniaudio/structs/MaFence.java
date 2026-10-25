/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

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

public final class MaFence
		implements Struct<MaFence> {

	public static final StructLayout LAYOUT;

	public static final VarHandle E_HANDLE;
	public static final VarHandle COUNTER_HANDLE;

	public static final long E_BYTE_OFFSET;
	public static final long COUNTER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("e"),
		    JAVA_INT.withName("counter"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_fence").withByteAlignment(8);
		
		E_HANDLE = LAYOUT.varHandle(PathElement.groupElement("e"));
		COUNTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("counter"));
		
		E_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("e"));
		COUNTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("counter"));
		//@formatter:on
	}

	public MaFence() {
	    this(Arena.ofAuto());
	}
	
	public MaFence(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaFence(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #e()
    public MaFence e(MemorySegment e) {
    	E_HANDLE.set(segment, 0L, e);
    	return this;
    }
    
    public @Nullable MemorySegment e() {
    	MemorySegment segment = (MemorySegment) E_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #counter()
    public MaFence counter(int counter) {
    	COUNTER_HANDLE.set(segment, 0L, counter);
    	return this;
    }
    
    public int counter() {
    	return (int) COUNTER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaFence set(MaFence other) {
        return set(other.segment);
    }
    
    @Override
    public MaFence set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaFence> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaFence> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaFence(segment),
            count
        );
    }
    
    public static NativeStructArray<MaFence> array(SegmentAllocator allocator, MaFence... structs) {
        NativeStructArray<MaFence> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaFence(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaFence> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaFence(segment)
        );
    }

}