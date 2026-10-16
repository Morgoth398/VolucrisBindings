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

public final class MaLoshelfNodeConfig
		implements Struct<MaLoshelfNodeConfig> {

	public static final StructLayout LAYOUT;

	public static final long NODE_CONFIG_BYTE_OFFSET;
	public static final long LOSHELF_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeConfig nodeConfig;
	private final MaLoshelf2Config loshelf;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeConfig.LAYOUT.withName("nodeConfig"),
		    MaLoshelf2Config.LAYOUT.withName("loshelf")
		).withName("ma_loshelf_node_config").withByteAlignment(8);
		
		NODE_CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeConfig"));
		LOSHELF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loshelf"));
		//@formatter:on
	}

	public MaLoshelfNodeConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaLoshelfNodeConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaLoshelfNodeConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    nodeConfig = new MaNodeConfig(segment.asSlice(NODE_CONFIG_BYTE_OFFSET, MaNodeConfig.LAYOUT));
	    loshelf = new MaLoshelf2Config(segment.asSlice(LOSHELF_BYTE_OFFSET, MaLoshelf2Config.LAYOUT));
	}

    /// @see #nodeConfig()
    public MaLoshelfNodeConfig nodeConfig(Consumer<MaNodeConfig> consumer) {
    	consumer.accept(nodeConfig);
    	return this;
    }
    
    /// @see #nodeConfig()
    public MaLoshelfNodeConfig nodeConfig(MaNodeConfig other) {
    	nodeConfig.set(other);
    	return this;
    }
    
    public MaNodeConfig nodeConfig() {
    	return nodeConfig;
    }
    
    /// @see #loshelf()
    public MaLoshelfNodeConfig loshelf(Consumer<MaLoshelf2Config> consumer) {
    	consumer.accept(loshelf);
    	return this;
    }
    
    /// @see #loshelf()
    public MaLoshelfNodeConfig loshelf(MaLoshelf2Config other) {
    	loshelf.set(other);
    	return this;
    }
    
    public MaLoshelf2Config loshelf() {
    	return loshelf;
    }
    
    @Override
    public MaLoshelfNodeConfig set(MaLoshelfNodeConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaLoshelfNodeConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaLoshelfNodeConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaLoshelfNodeConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaLoshelfNodeConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaLoshelfNodeConfig> array(Arena arena, MaLoshelfNodeConfig... structs) {
        NativeStructArray<MaLoshelfNodeConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaLoshelfNodeConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaLoshelfNodeConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaLoshelfNodeConfig(segment)
        );
    }

}