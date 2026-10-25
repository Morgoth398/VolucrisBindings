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

public final class MaHishelfNodeConfig
		implements Struct<MaHishelfNodeConfig> {

	public static final StructLayout LAYOUT;

	public static final long NODE_CONFIG_BYTE_OFFSET;
	public static final long HISHELF_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeConfig nodeConfig;
	private final MaHishelf2Config hishelf;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeConfig.LAYOUT.withName("nodeConfig"),
		    MaHishelf2Config.LAYOUT.withName("hishelf")
		).withName("ma_hishelf_node_config").withByteAlignment(8);
		
		NODE_CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeConfig"));
		HISHELF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hishelf"));
		//@formatter:on
	}

	public MaHishelfNodeConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaHishelfNodeConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaHishelfNodeConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    nodeConfig = new MaNodeConfig(segment.asSlice(NODE_CONFIG_BYTE_OFFSET, MaNodeConfig.LAYOUT));
	    hishelf = new MaHishelf2Config(segment.asSlice(HISHELF_BYTE_OFFSET, MaHishelf2Config.LAYOUT));
	}

    /// @see #nodeConfig()
    public MaHishelfNodeConfig nodeConfig(Consumer<MaNodeConfig> consumer) {
    	consumer.accept(nodeConfig);
    	return this;
    }
    
    /// @see #nodeConfig()
    public MaHishelfNodeConfig nodeConfig(MaNodeConfig other) {
    	nodeConfig.set(other);
    	return this;
    }
    
    public MaNodeConfig nodeConfig() {
    	return nodeConfig;
    }
    
    /// @see #hishelf()
    public MaHishelfNodeConfig hishelf(Consumer<MaHishelf2Config> consumer) {
    	consumer.accept(hishelf);
    	return this;
    }
    
    /// @see #hishelf()
    public MaHishelfNodeConfig hishelf(MaHishelf2Config other) {
    	hishelf.set(other);
    	return this;
    }
    
    public MaHishelf2Config hishelf() {
    	return hishelf;
    }
    
    @Override
    public MaHishelfNodeConfig set(MaHishelfNodeConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaHishelfNodeConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaHishelfNodeConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaHishelfNodeConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaHishelfNodeConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaHishelfNodeConfig> array(SegmentAllocator allocator, MaHishelfNodeConfig... structs) {
        NativeStructArray<MaHishelfNodeConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaHishelfNodeConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaHishelfNodeConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaHishelfNodeConfig(segment)
        );
    }

}