/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkExtent2D
		implements Struct<VkExtent2D> {

	public static final StructLayout LAYOUT;

	public static final VarHandle WIDTH_HANDLE;
	public static final VarHandle HEIGHT_HANDLE;

	public static final long WIDTH_BYTE_OFFSET;
	public static final long HEIGHT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("width"),
		    JAVA_INT.withName("height")
		).withName("VkExtent2D").withByteAlignment(4);
		
		WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("width"));
		HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("height"));
		
		WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("width"));
		HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("height"));
		//@formatter:on
	}

	public VkExtent2D() {
	    this(Arena.ofAuto());
	}
	
	public VkExtent2D(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkExtent2D(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #width()
    public VkExtent2D width(int width) {
    	WIDTH_HANDLE.set(segment, 0L, width);
    	return this;
    }
    
    public int width() {
    	return (int) WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #height()
    public VkExtent2D height(int height) {
    	HEIGHT_HANDLE.set(segment, 0L, height);
    	return this;
    }
    
    public int height() {
    	return (int) HEIGHT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkExtent2D set(VkExtent2D other) {
        return set(other.segment);
    }
    
    @Override
    public VkExtent2D set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkExtent2D> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkExtent2D> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExtent2D(segment),
            count
        );
    }
    
    public static NativeStructArray<VkExtent2D> array(Arena arena, VkExtent2D... structs) {
        NativeStructArray<VkExtent2D> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExtent2D(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkExtent2D> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkExtent2D(segment)
        );
    }

}