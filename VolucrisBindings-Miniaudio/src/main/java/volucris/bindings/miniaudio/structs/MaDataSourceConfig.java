/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaDataSourceConfig
		implements Struct<MaDataSourceConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle VTABLE_HANDLE;

	public static final long VTABLE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("vtable")
		).withName("ma_data_source_config").withByteAlignment(8);
		
		VTABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vtable"));
		
		VTABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vtable"));
		//@formatter:on
	}

	public MaDataSourceConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaDataSourceConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaDataSourceConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #vtable()
    public MaDataSourceConfig vtable(MaDataSourceVtable vtable) {
    	VTABLE_HANDLE.set(segment, 0L, vtable.memorySegment());
    	return this;
    }
    
    public @Nullable MaDataSourceVtable vtable() {
    	MemorySegment segment = (MemorySegment) VTABLE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDataSourceVtable(segment);
    }
    
    @Override
    public MaDataSourceConfig set(MaDataSourceConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaDataSourceConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDataSourceConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDataSourceConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDataSourceConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDataSourceConfig> array(SegmentAllocator allocator, MaDataSourceConfig... structs) {
        NativeStructArray<MaDataSourceConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDataSourceConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDataSourceConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDataSourceConfig(segment)
        );
    }

}