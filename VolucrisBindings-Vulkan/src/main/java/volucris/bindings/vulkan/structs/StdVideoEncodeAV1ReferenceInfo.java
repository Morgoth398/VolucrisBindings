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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class StdVideoEncodeAV1ReferenceInfo
		implements Struct<StdVideoEncodeAV1ReferenceInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle REF_FRAME_ID_HANDLE;
	public static final VarHandle FRAME_TYPE_HANDLE;
	public static final VarHandle ORDER_HINT_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;
	public static final VarHandle P_EXTENSION_HEADER_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long REF_FRAME_ID_BYTE_OFFSET;
	public static final long FRAME_TYPE_BYTE_OFFSET;
	public static final long ORDER_HINT_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;
	public static final long P_EXTENSION_HEADER_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoEncodeAV1ReferenceInfoFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoEncodeAV1ReferenceInfoFlags.LAYOUT.withName("flags"),
		    JAVA_INT.withName("RefFrameId"),
		    JAVA_INT.withName("frame_type"),
		    JAVA_BYTE.withName("OrderHint"),
		    MemoryLayout.sequenceLayout(3, JAVA_BYTE).withName("reserved1"),
		    UNBOUNDED_ADDRESS.withName("pExtensionHeader")
		).withName("StdVideoEncodeAV1ReferenceInfo").withByteAlignment(8);
		
		REF_FRAME_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("RefFrameId"));
		FRAME_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frame_type"));
		ORDER_HINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OrderHint"));
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"), PathElement.sequenceElement());
		P_EXTENSION_HEADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pExtensionHeader"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		REF_FRAME_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("RefFrameId"));
		FRAME_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frame_type"));
		ORDER_HINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OrderHint"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		P_EXTENSION_HEADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pExtensionHeader"));
		//@formatter:on
	}

	public StdVideoEncodeAV1ReferenceInfo() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoEncodeAV1ReferenceInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoEncodeAV1ReferenceInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoEncodeAV1ReferenceInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoEncodeAV1ReferenceInfoFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoEncodeAV1ReferenceInfo flags(Consumer<StdVideoEncodeAV1ReferenceInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoEncodeAV1ReferenceInfo flags(StdVideoEncodeAV1ReferenceInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoEncodeAV1ReferenceInfoFlags flags() {
    	return flags;
    }
    
    /// @see #refFrameId()
    public StdVideoEncodeAV1ReferenceInfo refFrameId(int refFrameId) {
    	REF_FRAME_ID_HANDLE.set(segment, 0L, refFrameId);
    	return this;
    }
    
    public int refFrameId() {
    	return (int) REF_FRAME_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #frame_type()
    public StdVideoEncodeAV1ReferenceInfo frame_type(int frame_type) {
    	FRAME_TYPE_HANDLE.set(segment, 0L, frame_type);
    	return this;
    }
    
    public int frame_type() {
    	return (int) FRAME_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #orderHint()
    public StdVideoEncodeAV1ReferenceInfo orderHint(byte orderHint) {
    	ORDER_HINT_HANDLE.set(segment, 0L, orderHint);
    	return this;
    }
    
    public byte orderHint() {
    	return (byte) ORDER_HINT_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1(int)
    public StdVideoEncodeAV1ReferenceInfo reserved1(byte reserved1, int index0) {
    	RESERVED1_HANDLE.set(segment, 0L, index0, reserved1);
    	return this;
    }
    
    public byte reserved1(int index0) {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #pExtensionHeader()
    public StdVideoEncodeAV1ReferenceInfo pExtensionHeader(StdVideoEncodeAV1ExtensionHeader pExtensionHeader) {
    	P_EXTENSION_HEADER_HANDLE.set(segment, 0L, pExtensionHeader.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoEncodeAV1ExtensionHeader pExtensionHeader() {
    	MemorySegment segment = (MemorySegment) P_EXTENSION_HEADER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoEncodeAV1ExtensionHeader(segment);
    }
    
    @Override
    public StdVideoEncodeAV1ReferenceInfo set(StdVideoEncodeAV1ReferenceInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeAV1ReferenceInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeAV1ReferenceInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeAV1ReferenceInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoEncodeAV1ReferenceInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeAV1ReferenceInfo> array(SegmentAllocator allocator, StdVideoEncodeAV1ReferenceInfo... structs) {
        NativeStructArray<StdVideoEncodeAV1ReferenceInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoEncodeAV1ReferenceInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeAV1ReferenceInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeAV1ReferenceInfo(segment)
        );
    }

}