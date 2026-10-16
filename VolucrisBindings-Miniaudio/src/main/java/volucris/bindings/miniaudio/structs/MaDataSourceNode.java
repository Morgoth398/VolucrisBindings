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

public final class MaDataSourceNode
		implements Struct<MaDataSourceNode> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_DATA_SOURCE_HANDLE;

	public static final long BASE_BYTE_OFFSET;
	public static final long P_DATA_SOURCE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeBase base;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeBase.LAYOUT.withName("base"),
		    UNBOUNDED_ADDRESS.withName("pDataSource")
		).withName("ma_data_source_node").withByteAlignment(8);
		
		P_DATA_SOURCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDataSource"));
		
		BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
		P_DATA_SOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDataSource"));
		//@formatter:on
	}

	public MaDataSourceNode() {
	    this(Arena.ofAuto());
	}
	
	public MaDataSourceNode(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaDataSourceNode(MemorySegment segment) {
	    this.segment = segment;
	
	    base = new MaNodeBase(segment.asSlice(BASE_BYTE_OFFSET, MaNodeBase.LAYOUT));
	}

    /// @see #base()
    public MaDataSourceNode base(Consumer<MaNodeBase> consumer) {
    	consumer.accept(base);
    	return this;
    }
    
    /// @see #base()
    public MaDataSourceNode base(MaNodeBase other) {
    	base.set(other);
    	return this;
    }
    
    public MaNodeBase base() {
    	return base;
    }
    
    /// @see #pDataSource()
    public MaDataSourceNode pDataSource(MemorySegment pDataSource) {
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
    public MaDataSourceNode set(MaDataSourceNode other) {
        return set(other.segment);
    }
    
    @Override
    public MaDataSourceNode set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDataSourceNode> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDataSourceNode> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDataSourceNode(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDataSourceNode> array(Arena arena, MaDataSourceNode... structs) {
        NativeStructArray<MaDataSourceNode> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDataSourceNode(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDataSourceNode> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDataSourceNode(segment)
        );
    }

}