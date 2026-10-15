/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.yoga;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class YGSize
		implements Struct<YGSize> {

	public static final StructLayout LAYOUT;

	public static final VarHandle WIDTH_HANDLE;
	public static final VarHandle HEIGHT_HANDLE;

	public static final long WIDTH_BYTE_OFFSET;
	public static final long HEIGHT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_FLOAT.withName("width"),
		    JAVA_FLOAT.withName("height")
		).withName("YGSize").withByteAlignment(4);
		
		WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("width"));
		HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("height"));
		
		WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("width"));
		HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("height"));
		//@formatter:on
	}

	public YGSize() {
	    this(Arena.ofAuto());
	}
	
	public YGSize(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public YGSize(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #width()
    public YGSize width(float width) {
    	WIDTH_HANDLE.set(segment, 0L, width);
    	return this;
    }
    
    public float width() {
    	return (float) WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #height()
    public YGSize height(float height) {
    	HEIGHT_HANDLE.set(segment, 0L, height);
    	return this;
    }
    
    public float height() {
    	return (float) HEIGHT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public YGSize set(YGSize other) {
        return set(other.segment);
    }
    
    @Override
    public YGSize set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<YGSize> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<YGSize> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new YGSize(segment),
            count
        );
    }
    
    public static NativeStructArray<YGSize> array(Arena arena, YGSize... structs) {
        NativeStructArray<YGSize> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new YGSize(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<YGSize> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new YGSize(segment)
        );
    }

}