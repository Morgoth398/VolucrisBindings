/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaHpfNodeConfig
		implements Struct<MaHpfNodeConfig> {

	public static final StructLayout LAYOUT;

	public static final long NODE_CONFIG_BYTE_OFFSET;
	public static final long HPF_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeConfig nodeConfig;
	private final MaHpfConfig hpf;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeConfig.LAYOUT.withName("nodeConfig"),
		    MaHpfConfig.LAYOUT.withName("hpf")
		).withName("ma_hpf_node_config").withByteAlignment(8);
		
		NODE_CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeConfig"));
		HPF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hpf"));
		//@formatter:on
	}

	public MaHpfNodeConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaHpfNodeConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaHpfNodeConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    nodeConfig = new MaNodeConfig(segment.asSlice(NODE_CONFIG_BYTE_OFFSET, MaNodeConfig.LAYOUT));
	    hpf = new MaHpfConfig(segment.asSlice(HPF_BYTE_OFFSET, MaHpfConfig.LAYOUT));
	}

    /// @see #nodeConfig()
    public MaHpfNodeConfig nodeConfig(Consumer<MaNodeConfig> consumer) {
    	consumer.accept(nodeConfig);
    	return this;
    }
    
    /// @see #nodeConfig()
    public MaHpfNodeConfig nodeConfig(MaNodeConfig other) {
    	nodeConfig.set(other);
    	return this;
    }
    
    public MaNodeConfig nodeConfig() {
    	return nodeConfig;
    }
    
    /// @see #hpf()
    public MaHpfNodeConfig hpf(Consumer<MaHpfConfig> consumer) {
    	consumer.accept(hpf);
    	return this;
    }
    
    /// @see #hpf()
    public MaHpfNodeConfig hpf(MaHpfConfig other) {
    	hpf.set(other);
    	return this;
    }
    
    public MaHpfConfig hpf() {
    	return hpf;
    }
    
    @Override
    public MaHpfNodeConfig set(MaHpfNodeConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaHpfNodeConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaHpfNodeConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaHpfNodeConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaHpfNodeConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaHpfNodeConfig> array(Arena arena, MaHpfNodeConfig... structs) {
        NativeStructArray<MaHpfNodeConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaHpfNodeConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaHpfNodeConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaHpfNodeConfig(segment)
        );
    }

}