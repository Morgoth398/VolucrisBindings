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

public final class MaBpfNodeConfig
		implements Struct<MaBpfNodeConfig> {

	public static final StructLayout LAYOUT;

	public static final long NODE_CONFIG_BYTE_OFFSET;
	public static final long BPF_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeConfig nodeConfig;
	private final MaBpfConfig bpf;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeConfig.LAYOUT.withName("nodeConfig"),
		    MaBpfConfig.LAYOUT.withName("bpf")
		).withName("ma_bpf_node_config").withByteAlignment(8);
		
		NODE_CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeConfig"));
		BPF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bpf"));
		//@formatter:on
	}

	public MaBpfNodeConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaBpfNodeConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaBpfNodeConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    nodeConfig = new MaNodeConfig(segment.asSlice(NODE_CONFIG_BYTE_OFFSET, MaNodeConfig.LAYOUT));
	    bpf = new MaBpfConfig(segment.asSlice(BPF_BYTE_OFFSET, MaBpfConfig.LAYOUT));
	}

    /// @see #nodeConfig()
    public MaBpfNodeConfig nodeConfig(Consumer<MaNodeConfig> consumer) {
    	consumer.accept(nodeConfig);
    	return this;
    }
    
    /// @see #nodeConfig()
    public MaBpfNodeConfig nodeConfig(MaNodeConfig other) {
    	nodeConfig.set(other);
    	return this;
    }
    
    public MaNodeConfig nodeConfig() {
    	return nodeConfig;
    }
    
    /// @see #bpf()
    public MaBpfNodeConfig bpf(Consumer<MaBpfConfig> consumer) {
    	consumer.accept(bpf);
    	return this;
    }
    
    /// @see #bpf()
    public MaBpfNodeConfig bpf(MaBpfConfig other) {
    	bpf.set(other);
    	return this;
    }
    
    public MaBpfConfig bpf() {
    	return bpf;
    }
    
    @Override
    public MaBpfNodeConfig set(MaBpfNodeConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaBpfNodeConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaBpfNodeConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaBpfNodeConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaBpfNodeConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaBpfNodeConfig> array(SegmentAllocator allocator, MaBpfNodeConfig... structs) {
        NativeStructArray<MaBpfNodeConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaBpfNodeConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaBpfNodeConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaBpfNodeConfig(segment)
        );
    }

}