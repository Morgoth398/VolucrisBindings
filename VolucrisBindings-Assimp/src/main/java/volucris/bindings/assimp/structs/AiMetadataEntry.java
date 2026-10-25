/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

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

/// ```
/// 
/// Metadata entry
/// 
/// The type field uniquely identifies the underlying type of the data field
/// ```
public final class AiMetadataEntry
		implements Struct<AiMetadataEntry> {

	public static final StructLayout LAYOUT;

	public static final VarHandle M_TYPE_HANDLE;
	public static final VarHandle M_DATA_HANDLE;

	public static final long M_TYPE_BYTE_OFFSET;
	public static final long M_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("mType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("mData")
		).withName("aiMetadataEntry").withByteAlignment(8);
		
		M_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mType"));
		M_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mData"));
		
		M_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mType"));
		M_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mData"));
		//@formatter:on
	}

	public AiMetadataEntry() {
	    this(Arena.ofAuto());
	}
	
	public AiMetadataEntry(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiMetadataEntry(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #mType()
    public AiMetadataEntry mType(int mType) {
    	M_TYPE_HANDLE.set(segment, 0L, mType);
    	return this;
    }
    
    public int mType() {
    	return (int) M_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #mData()
    public AiMetadataEntry mData(MemorySegment mData) {
    	M_DATA_HANDLE.set(segment, 0L, mData);
    	return this;
    }
    
    public @Nullable MemorySegment mData() {
    	MemorySegment segment = (MemorySegment) M_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public AiMetadataEntry set(AiMetadataEntry other) {
        return set(other.segment);
    }
    
    @Override
    public AiMetadataEntry set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiMetadataEntry> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiMetadataEntry> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMetadataEntry(segment),
            count
        );
    }
    
    public static NativeStructArray<AiMetadataEntry> array(Arena arena, AiMetadataEntry... structs) {
        NativeStructArray<AiMetadataEntry> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMetadataEntry(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiMetadataEntry> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiMetadataEntry(segment)
        );
    }

}