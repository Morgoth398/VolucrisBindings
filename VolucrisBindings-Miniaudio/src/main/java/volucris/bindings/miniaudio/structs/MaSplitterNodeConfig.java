/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaSplitterNodeConfig
		implements Struct<MaSplitterNodeConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle OUTPUT_BUS_COUNT_HANDLE;

	public static final long NODE_CONFIG_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long OUTPUT_BUS_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeConfig nodeConfig;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeConfig.LAYOUT.withName("nodeConfig"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("outputBusCount")
		).withName("ma_splitter_node_config").withByteAlignment(8);
		
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		OUTPUT_BUS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("outputBusCount"));
		
		NODE_CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeConfig"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		OUTPUT_BUS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("outputBusCount"));
		//@formatter:on
	}

	public MaSplitterNodeConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaSplitterNodeConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaSplitterNodeConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    nodeConfig = new MaNodeConfig(segment.asSlice(NODE_CONFIG_BYTE_OFFSET, MaNodeConfig.LAYOUT));
	}

    /// @see #nodeConfig()
    public MaSplitterNodeConfig nodeConfig(Consumer<MaNodeConfig> consumer) {
    	consumer.accept(nodeConfig);
    	return this;
    }
    
    /// @see #nodeConfig()
    public MaSplitterNodeConfig nodeConfig(MaNodeConfig other) {
    	nodeConfig.set(other);
    	return this;
    }
    
    public MaNodeConfig nodeConfig() {
    	return nodeConfig;
    }
    
    /// @see #channels()
    public MaSplitterNodeConfig channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #outputBusCount()
    public MaSplitterNodeConfig outputBusCount(int outputBusCount) {
    	OUTPUT_BUS_COUNT_HANDLE.set(segment, 0L, outputBusCount);
    	return this;
    }
    
    public int outputBusCount() {
    	return (int) OUTPUT_BUS_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaSplitterNodeConfig set(MaSplitterNodeConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaSplitterNodeConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaSplitterNodeConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaSplitterNodeConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaSplitterNodeConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaSplitterNodeConfig> array(Arena arena, MaSplitterNodeConfig... structs) {
        NativeStructArray<MaSplitterNodeConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaSplitterNodeConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaSplitterNodeConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaSplitterNodeConfig(segment)
        );
    }

}