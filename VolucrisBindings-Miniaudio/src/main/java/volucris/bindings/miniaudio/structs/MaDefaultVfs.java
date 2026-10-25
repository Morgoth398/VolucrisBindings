/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaDefaultVfs
		implements Struct<MaDefaultVfs> {

	public static final StructLayout LAYOUT;

	public static final long CB_BYTE_OFFSET;
	public static final long ALLOCATION_CALLBACKS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaVfsCallbacks cb;
	private final MaAllocationCallbacks allocationCallbacks;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaVfsCallbacks.LAYOUT.withName("cb"),
		    MaAllocationCallbacks.LAYOUT.withName("allocationCallbacks")
		).withName("ma_default_vfs").withByteAlignment(8);
		
		CB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cb"));
		ALLOCATION_CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationCallbacks"));
		//@formatter:on
	}

	public MaDefaultVfs() {
	    this(Arena.ofAuto());
	}
	
	public MaDefaultVfs(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaDefaultVfs(MemorySegment segment) {
	    this.segment = segment;
	
	    cb = new MaVfsCallbacks(segment.asSlice(CB_BYTE_OFFSET, MaVfsCallbacks.LAYOUT));
	    allocationCallbacks = new MaAllocationCallbacks(segment.asSlice(ALLOCATION_CALLBACKS_BYTE_OFFSET, MaAllocationCallbacks.LAYOUT));
	}

    /// @see #cb()
    public MaDefaultVfs cb(Consumer<MaVfsCallbacks> consumer) {
    	consumer.accept(cb);
    	return this;
    }
    
    /// @see #cb()
    public MaDefaultVfs cb(MaVfsCallbacks other) {
    	cb.set(other);
    	return this;
    }
    
    public MaVfsCallbacks cb() {
    	return cb;
    }
    
    /// @see #allocationCallbacks()
    public MaDefaultVfs allocationCallbacks(Consumer<MaAllocationCallbacks> consumer) {
    	consumer.accept(allocationCallbacks);
    	return this;
    }
    
    /// @see #allocationCallbacks()
    public MaDefaultVfs allocationCallbacks(MaAllocationCallbacks other) {
    	allocationCallbacks.set(other);
    	return this;
    }
    
    public MaAllocationCallbacks allocationCallbacks() {
    	return allocationCallbacks;
    }
    
    @Override
    public MaDefaultVfs set(MaDefaultVfs other) {
        return set(other.segment);
    }
    
    @Override
    public MaDefaultVfs set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDefaultVfs> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDefaultVfs> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDefaultVfs(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDefaultVfs> array(SegmentAllocator allocator, MaDefaultVfs... structs) {
        NativeStructArray<MaDefaultVfs> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDefaultVfs(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDefaultVfs> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDefaultVfs(segment)
        );
    }

}