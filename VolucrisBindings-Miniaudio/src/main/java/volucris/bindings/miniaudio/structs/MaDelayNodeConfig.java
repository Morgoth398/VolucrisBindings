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

public final class MaDelayNodeConfig
		implements Struct<MaDelayNodeConfig> {

	public static final StructLayout LAYOUT;

	public static final long NODE_CONFIG_BYTE_OFFSET;
	public static final long DELAY_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeConfig nodeConfig;
	private final MaDelayConfig delay;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeConfig.LAYOUT.withName("nodeConfig"),
		    MaDelayConfig.LAYOUT.withName("delay"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_delay_node_config").withByteAlignment(8);
		
		NODE_CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeConfig"));
		DELAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delay"));
		//@formatter:on
	}

	public MaDelayNodeConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaDelayNodeConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaDelayNodeConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    nodeConfig = new MaNodeConfig(segment.asSlice(NODE_CONFIG_BYTE_OFFSET, MaNodeConfig.LAYOUT));
	    delay = new MaDelayConfig(segment.asSlice(DELAY_BYTE_OFFSET, MaDelayConfig.LAYOUT));
	}

    /// @see #nodeConfig()
    public MaDelayNodeConfig nodeConfig(Consumer<MaNodeConfig> consumer) {
    	consumer.accept(nodeConfig);
    	return this;
    }
    
    /// @see #nodeConfig()
    public MaDelayNodeConfig nodeConfig(MaNodeConfig other) {
    	nodeConfig.set(other);
    	return this;
    }
    
    public MaNodeConfig nodeConfig() {
    	return nodeConfig;
    }
    
    /// @see #delay()
    public MaDelayNodeConfig delay(Consumer<MaDelayConfig> consumer) {
    	consumer.accept(delay);
    	return this;
    }
    
    /// @see #delay()
    public MaDelayNodeConfig delay(MaDelayConfig other) {
    	delay.set(other);
    	return this;
    }
    
    public MaDelayConfig delay() {
    	return delay;
    }
    
    @Override
    public MaDelayNodeConfig set(MaDelayNodeConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaDelayNodeConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDelayNodeConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDelayNodeConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDelayNodeConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDelayNodeConfig> array(SegmentAllocator allocator, MaDelayNodeConfig... structs) {
        NativeStructArray<MaDelayNodeConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDelayNodeConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDelayNodeConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDelayNodeConfig(segment)
        );
    }

}