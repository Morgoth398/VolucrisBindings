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

public final class MaNotchNodeConfig
		implements Struct<MaNotchNodeConfig> {

	public static final StructLayout LAYOUT;

	public static final long NODE_CONFIG_BYTE_OFFSET;
	public static final long NOTCH_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeConfig nodeConfig;
	private final MaNotch2Config notch;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeConfig.LAYOUT.withName("nodeConfig"),
		    MaNotch2Config.LAYOUT.withName("notch")
		).withName("ma_notch_node_config").withByteAlignment(8);
		
		NODE_CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeConfig"));
		NOTCH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("notch"));
		//@formatter:on
	}

	public MaNotchNodeConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaNotchNodeConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaNotchNodeConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    nodeConfig = new MaNodeConfig(segment.asSlice(NODE_CONFIG_BYTE_OFFSET, MaNodeConfig.LAYOUT));
	    notch = new MaNotch2Config(segment.asSlice(NOTCH_BYTE_OFFSET, MaNotch2Config.LAYOUT));
	}

    /// @see #nodeConfig()
    public MaNotchNodeConfig nodeConfig(Consumer<MaNodeConfig> consumer) {
    	consumer.accept(nodeConfig);
    	return this;
    }
    
    /// @see #nodeConfig()
    public MaNotchNodeConfig nodeConfig(MaNodeConfig other) {
    	nodeConfig.set(other);
    	return this;
    }
    
    public MaNodeConfig nodeConfig() {
    	return nodeConfig;
    }
    
    /// @see #notch()
    public MaNotchNodeConfig notch(Consumer<MaNotch2Config> consumer) {
    	consumer.accept(notch);
    	return this;
    }
    
    /// @see #notch()
    public MaNotchNodeConfig notch(MaNotch2Config other) {
    	notch.set(other);
    	return this;
    }
    
    public MaNotch2Config notch() {
    	return notch;
    }
    
    @Override
    public MaNotchNodeConfig set(MaNotchNodeConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaNotchNodeConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaNotchNodeConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaNotchNodeConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaNotchNodeConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaNotchNodeConfig> array(Arena arena, MaNotchNodeConfig... structs) {
        NativeStructArray<MaNotchNodeConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaNotchNodeConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaNotchNodeConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaNotchNodeConfig(segment)
        );
    }

}