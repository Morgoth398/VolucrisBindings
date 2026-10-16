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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaDataSourceNodeConfig
		implements Struct<MaDataSourceNodeConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_DATA_SOURCE_HANDLE;

	public static final long NODE_CONFIG_BYTE_OFFSET;
	public static final long P_DATA_SOURCE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeConfig nodeConfig;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeConfig.LAYOUT.withName("nodeConfig"),
		    UNBOUNDED_ADDRESS.withName("pDataSource")
		).withName("ma_data_source_node_config").withByteAlignment(8);
		
		P_DATA_SOURCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDataSource"));
		
		NODE_CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeConfig"));
		P_DATA_SOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDataSource"));
		//@formatter:on
	}

	public MaDataSourceNodeConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaDataSourceNodeConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaDataSourceNodeConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    nodeConfig = new MaNodeConfig(segment.asSlice(NODE_CONFIG_BYTE_OFFSET, MaNodeConfig.LAYOUT));
	}

    /// @see #nodeConfig()
    public MaDataSourceNodeConfig nodeConfig(Consumer<MaNodeConfig> consumer) {
    	consumer.accept(nodeConfig);
    	return this;
    }
    
    /// @see #nodeConfig()
    public MaDataSourceNodeConfig nodeConfig(MaNodeConfig other) {
    	nodeConfig.set(other);
    	return this;
    }
    
    public MaNodeConfig nodeConfig() {
    	return nodeConfig;
    }
    
    /// @see #pDataSource()
    public MaDataSourceNodeConfig pDataSource(MemorySegment pDataSource) {
    	P_DATA_SOURCE_HANDLE.set(segment, 0L, pDataSource);
    	return this;
    }
    
    public @Nullable MemorySegment pDataSource() {
    	MemorySegment segment = (MemorySegment) P_DATA_SOURCE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public MaDataSourceNodeConfig set(MaDataSourceNodeConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaDataSourceNodeConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDataSourceNodeConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDataSourceNodeConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDataSourceNodeConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDataSourceNodeConfig> array(Arena arena, MaDataSourceNodeConfig... structs) {
        NativeStructArray<MaDataSourceNodeConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDataSourceNodeConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDataSourceNodeConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDataSourceNodeConfig(segment)
        );
    }

}