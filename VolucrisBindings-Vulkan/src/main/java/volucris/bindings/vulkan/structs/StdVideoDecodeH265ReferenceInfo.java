/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoDecodeH265ReferenceInfo
		implements Struct<StdVideoDecodeH265ReferenceInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PIC_ORDER_CNT_VAL_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long PIC_ORDER_CNT_VAL_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoDecodeH265ReferenceInfoFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoDecodeH265ReferenceInfoFlags.LAYOUT.withName("flags"),
		    JAVA_INT.withName("PicOrderCntVal")
		).withName("StdVideoDecodeH265ReferenceInfo").withByteAlignment(4);
		
		PIC_ORDER_CNT_VAL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("PicOrderCntVal"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		PIC_ORDER_CNT_VAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCntVal"));
		//@formatter:on
	}

	public StdVideoDecodeH265ReferenceInfo() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoDecodeH265ReferenceInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoDecodeH265ReferenceInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoDecodeH265ReferenceInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoDecodeH265ReferenceInfoFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoDecodeH265ReferenceInfo flags(Consumer<StdVideoDecodeH265ReferenceInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoDecodeH265ReferenceInfo flags(StdVideoDecodeH265ReferenceInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoDecodeH265ReferenceInfoFlags flags() {
    	return flags;
    }
    
    /// @see #picOrderCntVal()
    public StdVideoDecodeH265ReferenceInfo picOrderCntVal(int picOrderCntVal) {
    	PIC_ORDER_CNT_VAL_HANDLE.set(segment, 0L, picOrderCntVal);
    	return this;
    }
    
    public int picOrderCntVal() {
    	return (int) PIC_ORDER_CNT_VAL_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoDecodeH265ReferenceInfo set(StdVideoDecodeH265ReferenceInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoDecodeH265ReferenceInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoDecodeH265ReferenceInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoDecodeH265ReferenceInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoDecodeH265ReferenceInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoDecodeH265ReferenceInfo> array(Arena arena, StdVideoDecodeH265ReferenceInfo... structs) {
        NativeStructArray<StdVideoDecodeH265ReferenceInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoDecodeH265ReferenceInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoDecodeH265ReferenceInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoDecodeH265ReferenceInfo(segment)
        );
    }

}