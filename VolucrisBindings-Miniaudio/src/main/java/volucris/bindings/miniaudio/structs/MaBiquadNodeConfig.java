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

public final class MaBiquadNodeConfig
		implements Struct<MaBiquadNodeConfig> {

	public static final StructLayout LAYOUT;

	public static final long NODE_CONFIG_BYTE_OFFSET;
	public static final long BIQUAD_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeConfig nodeConfig;
	private final MaBiquadConfig biquad;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeConfig.LAYOUT.withName("nodeConfig"),
		    MaBiquadConfig.LAYOUT.withName("biquad")
		).withName("ma_biquad_node_config").withByteAlignment(8);
		
		NODE_CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeConfig"));
		BIQUAD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("biquad"));
		//@formatter:on
	}

	public MaBiquadNodeConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaBiquadNodeConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaBiquadNodeConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    nodeConfig = new MaNodeConfig(segment.asSlice(NODE_CONFIG_BYTE_OFFSET, MaNodeConfig.LAYOUT));
	    biquad = new MaBiquadConfig(segment.asSlice(BIQUAD_BYTE_OFFSET, MaBiquadConfig.LAYOUT));
	}

    /// @see #nodeConfig()
    public MaBiquadNodeConfig nodeConfig(Consumer<MaNodeConfig> consumer) {
    	consumer.accept(nodeConfig);
    	return this;
    }
    
    /// @see #nodeConfig()
    public MaBiquadNodeConfig nodeConfig(MaNodeConfig other) {
    	nodeConfig.set(other);
    	return this;
    }
    
    public MaNodeConfig nodeConfig() {
    	return nodeConfig;
    }
    
    /// @see #biquad()
    public MaBiquadNodeConfig biquad(Consumer<MaBiquadConfig> consumer) {
    	consumer.accept(biquad);
    	return this;
    }
    
    /// @see #biquad()
    public MaBiquadNodeConfig biquad(MaBiquadConfig other) {
    	biquad.set(other);
    	return this;
    }
    
    public MaBiquadConfig biquad() {
    	return biquad;
    }
    
    @Override
    public MaBiquadNodeConfig set(MaBiquadNodeConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaBiquadNodeConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaBiquadNodeConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaBiquadNodeConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaBiquadNodeConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaBiquadNodeConfig> array(SegmentAllocator allocator, MaBiquadNodeConfig... structs) {
        NativeStructArray<MaBiquadNodeConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaBiquadNodeConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaBiquadNodeConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaBiquadNodeConfig(segment)
        );
    }

}