/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoEncodeH264ReferenceListsInfoFlags
		implements Struct<StdVideoEncodeH264ReferenceListsInfoFlags> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BIT_FIELDS0_HANDLE;

	public static final long BIT_FIELDS0_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("bitFields0")
		).withName("StdVideoEncodeH264ReferenceListsInfoFlags").withByteAlignment(4);
		
		BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
		
		BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
		//@formatter:on
	}

	public StdVideoEncodeH264ReferenceListsInfoFlags() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoEncodeH264ReferenceListsInfoFlags(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoEncodeH264ReferenceListsInfoFlags(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #bitFields0()
    public StdVideoEncodeH264ReferenceListsInfoFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// ref_pic_list_modification_flag_l0 : 1
    /// ref_pic_list_modification_flag_l1 : 1
    /// reserved : 30
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoEncodeH264ReferenceListsInfoFlags set(StdVideoEncodeH264ReferenceListsInfoFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH264ReferenceListsInfoFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH264ReferenceListsInfoFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH264ReferenceListsInfoFlags> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoEncodeH264ReferenceListsInfoFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH264ReferenceListsInfoFlags> array(SegmentAllocator allocator, StdVideoEncodeH264ReferenceListsInfoFlags... structs) {
        NativeStructArray<StdVideoEncodeH264ReferenceListsInfoFlags> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoEncodeH264ReferenceListsInfoFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH264ReferenceListsInfoFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH264ReferenceListsInfoFlags(segment)
        );
    }

}