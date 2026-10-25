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

public final class MaPeakNodeConfig
		implements Struct<MaPeakNodeConfig> {

	public static final StructLayout LAYOUT;

	public static final long NODE_CONFIG_BYTE_OFFSET;
	public static final long PEAK_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeConfig nodeConfig;
	private final MaPeak2Config peak;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeConfig.LAYOUT.withName("nodeConfig"),
		    MaPeak2Config.LAYOUT.withName("peak")
		).withName("ma_peak_node_config").withByteAlignment(8);
		
		NODE_CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeConfig"));
		PEAK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("peak"));
		//@formatter:on
	}

	public MaPeakNodeConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaPeakNodeConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaPeakNodeConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    nodeConfig = new MaNodeConfig(segment.asSlice(NODE_CONFIG_BYTE_OFFSET, MaNodeConfig.LAYOUT));
	    peak = new MaPeak2Config(segment.asSlice(PEAK_BYTE_OFFSET, MaPeak2Config.LAYOUT));
	}

    /// @see #nodeConfig()
    public MaPeakNodeConfig nodeConfig(Consumer<MaNodeConfig> consumer) {
    	consumer.accept(nodeConfig);
    	return this;
    }
    
    /// @see #nodeConfig()
    public MaPeakNodeConfig nodeConfig(MaNodeConfig other) {
    	nodeConfig.set(other);
    	return this;
    }
    
    public MaNodeConfig nodeConfig() {
    	return nodeConfig;
    }
    
    /// @see #peak()
    public MaPeakNodeConfig peak(Consumer<MaPeak2Config> consumer) {
    	consumer.accept(peak);
    	return this;
    }
    
    /// @see #peak()
    public MaPeakNodeConfig peak(MaPeak2Config other) {
    	peak.set(other);
    	return this;
    }
    
    public MaPeak2Config peak() {
    	return peak;
    }
    
    @Override
    public MaPeakNodeConfig set(MaPeakNodeConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaPeakNodeConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaPeakNodeConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaPeakNodeConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaPeakNodeConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaPeakNodeConfig> array(SegmentAllocator allocator, MaPeakNodeConfig... structs) {
        NativeStructArray<MaPeakNodeConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaPeakNodeConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaPeakNodeConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaPeakNodeConfig(segment)
        );
    }

}