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

public final class MaLpfNodeConfig
		implements Struct<MaLpfNodeConfig> {

	public static final StructLayout LAYOUT;

	public static final long NODE_CONFIG_BYTE_OFFSET;
	public static final long LPF_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeConfig nodeConfig;
	private final MaLpfConfig lpf;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeConfig.LAYOUT.withName("nodeConfig"),
		    MaLpfConfig.LAYOUT.withName("lpf")
		).withName("ma_lpf_node_config").withByteAlignment(8);
		
		NODE_CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeConfig"));
		LPF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lpf"));
		//@formatter:on
	}

	public MaLpfNodeConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaLpfNodeConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaLpfNodeConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    nodeConfig = new MaNodeConfig(segment.asSlice(NODE_CONFIG_BYTE_OFFSET, MaNodeConfig.LAYOUT));
	    lpf = new MaLpfConfig(segment.asSlice(LPF_BYTE_OFFSET, MaLpfConfig.LAYOUT));
	}

    /// @see #nodeConfig()
    public MaLpfNodeConfig nodeConfig(Consumer<MaNodeConfig> consumer) {
    	consumer.accept(nodeConfig);
    	return this;
    }
    
    /// @see #nodeConfig()
    public MaLpfNodeConfig nodeConfig(MaNodeConfig other) {
    	nodeConfig.set(other);
    	return this;
    }
    
    public MaNodeConfig nodeConfig() {
    	return nodeConfig;
    }
    
    /// @see #lpf()
    public MaLpfNodeConfig lpf(Consumer<MaLpfConfig> consumer) {
    	consumer.accept(lpf);
    	return this;
    }
    
    /// @see #lpf()
    public MaLpfNodeConfig lpf(MaLpfConfig other) {
    	lpf.set(other);
    	return this;
    }
    
    public MaLpfConfig lpf() {
    	return lpf;
    }
    
    @Override
    public MaLpfNodeConfig set(MaLpfNodeConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaLpfNodeConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaLpfNodeConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaLpfNodeConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaLpfNodeConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaLpfNodeConfig> array(SegmentAllocator allocator, MaLpfNodeConfig... structs) {
        NativeStructArray<MaLpfNodeConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaLpfNodeConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaLpfNodeConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaLpfNodeConfig(segment)
        );
    }

}