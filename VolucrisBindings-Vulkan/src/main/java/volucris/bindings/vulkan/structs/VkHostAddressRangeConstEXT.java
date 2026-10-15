/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkHostAddressRangeConstEXT
		implements Struct<VkHostAddressRangeConstEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ADDRESS_HANDLE;
	public static final VarHandle SIZE_HANDLE;

	public static final long ADDRESS_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("address"),
		    JAVA_LONG.withName("size")
		).withName("VkHostAddressRangeConstEXT").withByteAlignment(8);
		
		ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("address"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		
		ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("address"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		//@formatter:on
	}

	public VkHostAddressRangeConstEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkHostAddressRangeConstEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkHostAddressRangeConstEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #address()
    public VkHostAddressRangeConstEXT address(MemorySegment address) {
    	ADDRESS_HANDLE.set(segment, 0L, address);
    	return this;
    }
    
    public @Nullable MemorySegment address() {
    	MemorySegment segment = (MemorySegment) ADDRESS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #size()
    public VkHostAddressRangeConstEXT size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkHostAddressRangeConstEXT set(VkHostAddressRangeConstEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkHostAddressRangeConstEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkHostAddressRangeConstEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkHostAddressRangeConstEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkHostAddressRangeConstEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkHostAddressRangeConstEXT> array(Arena arena, VkHostAddressRangeConstEXT... structs) {
        NativeStructArray<VkHostAddressRangeConstEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkHostAddressRangeConstEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkHostAddressRangeConstEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkHostAddressRangeConstEXT(segment)
        );
    }

}