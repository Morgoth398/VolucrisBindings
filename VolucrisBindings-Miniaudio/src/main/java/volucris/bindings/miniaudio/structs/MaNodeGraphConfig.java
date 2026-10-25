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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaNodeGraphConfig
		implements Struct<MaNodeGraphConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle PROCESSING_SIZE_IN_FRAMES_HANDLE;
	public static final VarHandle PRE_MIX_STACK_SIZE_IN_BYTES_HANDLE;

	public static final long CHANNELS_BYTE_OFFSET;
	public static final long PROCESSING_SIZE_IN_FRAMES_BYTE_OFFSET;
	public static final long PRE_MIX_STACK_SIZE_IN_BYTES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("processingSizeInFrames"),
		    JAVA_LONG.withName("preMixStackSizeInBytes")
		).withName("ma_node_graph_config").withByteAlignment(8);
		
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		PROCESSING_SIZE_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("processingSizeInFrames"));
		PRE_MIX_STACK_SIZE_IN_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preMixStackSizeInBytes"));
		
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		PROCESSING_SIZE_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("processingSizeInFrames"));
		PRE_MIX_STACK_SIZE_IN_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preMixStackSizeInBytes"));
		//@formatter:on
	}

	public MaNodeGraphConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaNodeGraphConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaNodeGraphConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #channels()
    public MaNodeGraphConfig channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #processingSizeInFrames()
    public MaNodeGraphConfig processingSizeInFrames(int processingSizeInFrames) {
    	PROCESSING_SIZE_IN_FRAMES_HANDLE.set(segment, 0L, processingSizeInFrames);
    	return this;
    }
    
    public int processingSizeInFrames() {
    	return (int) PROCESSING_SIZE_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #preMixStackSizeInBytes()
    public MaNodeGraphConfig preMixStackSizeInBytes(long preMixStackSizeInBytes) {
    	PRE_MIX_STACK_SIZE_IN_BYTES_HANDLE.set(segment, 0L, preMixStackSizeInBytes);
    	return this;
    }
    
    public long preMixStackSizeInBytes() {
    	return (long) PRE_MIX_STACK_SIZE_IN_BYTES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaNodeGraphConfig set(MaNodeGraphConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaNodeGraphConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaNodeGraphConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaNodeGraphConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaNodeGraphConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaNodeGraphConfig> array(SegmentAllocator allocator, MaNodeGraphConfig... structs) {
        NativeStructArray<MaNodeGraphConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaNodeGraphConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaNodeGraphConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaNodeGraphConfig(segment)
        );
    }

}