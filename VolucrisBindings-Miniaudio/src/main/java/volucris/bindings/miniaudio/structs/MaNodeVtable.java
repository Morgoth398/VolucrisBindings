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
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaNodeVtable
		implements Struct<MaNodeVtable> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ON_PROCESS_HANDLE;
	public static final VarHandle ON_GET_REQUIRED_INPUT_FRAME_COUNT_HANDLE;
	public static final VarHandle INPUT_BUS_COUNT_HANDLE;
	public static final VarHandle OUTPUT_BUS_COUNT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;

	public static final long ON_PROCESS_BYTE_OFFSET;
	public static final long ON_GET_REQUIRED_INPUT_FRAME_COUNT_BYTE_OFFSET;
	public static final long INPUT_BUS_COUNT_BYTE_OFFSET;
	public static final long OUTPUT_BUS_COUNT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("onProcess"),
		    UNBOUNDED_ADDRESS.withName("onGetRequiredInputFrameCount"),
		    JAVA_BYTE.withName("inputBusCount"),
		    JAVA_BYTE.withName("outputBusCount"),
		    MemoryLayout.paddingLayout(2),
		    JAVA_INT.withName("flags")
		).withName("ma_node_vtable").withByteAlignment(8);
		
		ON_PROCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onProcess"));
		ON_GET_REQUIRED_INPUT_FRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onGetRequiredInputFrameCount"));
		INPUT_BUS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputBusCount"));
		OUTPUT_BUS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("outputBusCount"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		
		ON_PROCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onProcess"));
		ON_GET_REQUIRED_INPUT_FRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onGetRequiredInputFrameCount"));
		INPUT_BUS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputBusCount"));
		OUTPUT_BUS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("outputBusCount"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		//@formatter:on
	}

	public MaNodeVtable() {
	    this(Arena.ofAuto());
	}
	
	public MaNodeVtable(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaNodeVtable(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #onProcess()
    public MaNodeVtable onProcess(MaNodeOnProcess onProcess) {
    	ON_PROCESS_HANDLE.set(segment, 0L, onProcess.memorySegment());
    	return this;
    }
    
    public @Nullable MaNodeOnProcess onProcess() {
    	MemorySegment segment = (MemorySegment) ON_PROCESS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaNodeOnProcess.get(segment);
    }
    
    /// @see #onGetRequiredInputFrameCount()
    public MaNodeVtable onGetRequiredInputFrameCount(MaNodeOnGetRequiredInputFrameCount onGetRequiredInputFrameCount) {
    	ON_GET_REQUIRED_INPUT_FRAME_COUNT_HANDLE.set(segment, 0L, onGetRequiredInputFrameCount.memorySegment());
    	return this;
    }
    
    public @Nullable MaNodeOnGetRequiredInputFrameCount onGetRequiredInputFrameCount() {
    	MemorySegment segment = (MemorySegment) ON_GET_REQUIRED_INPUT_FRAME_COUNT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaNodeOnGetRequiredInputFrameCount.get(segment);
    }
    
    /// @see #inputBusCount()
    public MaNodeVtable inputBusCount(byte inputBusCount) {
    	INPUT_BUS_COUNT_HANDLE.set(segment, 0L, inputBusCount);
    	return this;
    }
    
    public byte inputBusCount() {
    	return (byte) INPUT_BUS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #outputBusCount()
    public MaNodeVtable outputBusCount(byte outputBusCount) {
    	OUTPUT_BUS_COUNT_HANDLE.set(segment, 0L, outputBusCount);
    	return this;
    }
    
    public byte outputBusCount() {
    	return (byte) OUTPUT_BUS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public MaNodeVtable flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaNodeVtable set(MaNodeVtable other) {
        return set(other.segment);
    }
    
    @Override
    public MaNodeVtable set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaNodeVtable> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaNodeVtable> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaNodeVtable(segment),
            count
        );
    }
    
    public static NativeStructArray<MaNodeVtable> array(SegmentAllocator allocator, MaNodeVtable... structs) {
        NativeStructArray<MaNodeVtable> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaNodeVtable(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaNodeVtable> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaNodeVtable(segment)
        );
    }

}