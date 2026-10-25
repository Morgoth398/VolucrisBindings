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
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoDecodeAV1ReferenceInfo
		implements Struct<StdVideoDecodeAV1ReferenceInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FRAME_TYPE_HANDLE;
	public static final VarHandle REF_FRAME_SIGN_BIAS_HANDLE;
	public static final VarHandle ORDER_HINT_HANDLE;
	public static final VarHandle SAVED_ORDER_HINTS_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long FRAME_TYPE_BYTE_OFFSET;
	public static final long REF_FRAME_SIGN_BIAS_BYTE_OFFSET;
	public static final long ORDER_HINT_BYTE_OFFSET;
	public static final long SAVED_ORDER_HINTS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoDecodeAV1ReferenceInfoFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoDecodeAV1ReferenceInfoFlags.LAYOUT.withName("flags"),
		    JAVA_BYTE.withName("frame_type"),
		    JAVA_BYTE.withName("RefFrameSignBias"),
		    JAVA_BYTE.withName("OrderHint"),
		    MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("SavedOrderHints"),
		    MemoryLayout.paddingLayout(1)
		).withName("StdVideoDecodeAV1ReferenceInfo").withByteAlignment(4);
		
		FRAME_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frame_type"));
		REF_FRAME_SIGN_BIAS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("RefFrameSignBias"));
		ORDER_HINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OrderHint"));
		SAVED_ORDER_HINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("SavedOrderHints"), PathElement.sequenceElement());
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		FRAME_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frame_type"));
		REF_FRAME_SIGN_BIAS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("RefFrameSignBias"));
		ORDER_HINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OrderHint"));
		SAVED_ORDER_HINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("SavedOrderHints"));
		//@formatter:on
	}

	public StdVideoDecodeAV1ReferenceInfo() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoDecodeAV1ReferenceInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoDecodeAV1ReferenceInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoDecodeAV1ReferenceInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoDecodeAV1ReferenceInfoFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoDecodeAV1ReferenceInfo flags(Consumer<StdVideoDecodeAV1ReferenceInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoDecodeAV1ReferenceInfo flags(StdVideoDecodeAV1ReferenceInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoDecodeAV1ReferenceInfoFlags flags() {
    	return flags;
    }
    
    /// @see #frame_type()
    public StdVideoDecodeAV1ReferenceInfo frame_type(byte frame_type) {
    	FRAME_TYPE_HANDLE.set(segment, 0L, frame_type);
    	return this;
    }
    
    public byte frame_type() {
    	return (byte) FRAME_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #refFrameSignBias()
    public StdVideoDecodeAV1ReferenceInfo refFrameSignBias(byte refFrameSignBias) {
    	REF_FRAME_SIGN_BIAS_HANDLE.set(segment, 0L, refFrameSignBias);
    	return this;
    }
    
    public byte refFrameSignBias() {
    	return (byte) REF_FRAME_SIGN_BIAS_HANDLE.get(segment, 0L);
    }
    
    /// @see #orderHint()
    public StdVideoDecodeAV1ReferenceInfo orderHint(byte orderHint) {
    	ORDER_HINT_HANDLE.set(segment, 0L, orderHint);
    	return this;
    }
    
    public byte orderHint() {
    	return (byte) ORDER_HINT_HANDLE.get(segment, 0L);
    }
    
    /// @see #savedOrderHints(int)
    public StdVideoDecodeAV1ReferenceInfo savedOrderHints(byte savedOrderHints, int index0) {
    	SAVED_ORDER_HINTS_HANDLE.set(segment, 0L, index0, savedOrderHints);
    	return this;
    }
    
    public byte savedOrderHints(int index0) {
    	return (byte) SAVED_ORDER_HINTS_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public StdVideoDecodeAV1ReferenceInfo set(StdVideoDecodeAV1ReferenceInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoDecodeAV1ReferenceInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoDecodeAV1ReferenceInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoDecodeAV1ReferenceInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoDecodeAV1ReferenceInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoDecodeAV1ReferenceInfo> array(SegmentAllocator allocator, StdVideoDecodeAV1ReferenceInfo... structs) {
        NativeStructArray<StdVideoDecodeAV1ReferenceInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoDecodeAV1ReferenceInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoDecodeAV1ReferenceInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoDecodeAV1ReferenceInfo(segment)
        );
    }

}