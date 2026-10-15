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

public final class VkHostAddressRangeEXT
		implements Struct<VkHostAddressRangeEXT> {

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
		).withName("VkHostAddressRangeEXT").withByteAlignment(8);
		
		ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("address"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		
		ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("address"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		//@formatter:on
	}

	public VkHostAddressRangeEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkHostAddressRangeEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkHostAddressRangeEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #address()
    public VkHostAddressRangeEXT address(MemorySegment address) {
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
    public VkHostAddressRangeEXT size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkHostAddressRangeEXT set(VkHostAddressRangeEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkHostAddressRangeEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkHostAddressRangeEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkHostAddressRangeEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkHostAddressRangeEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkHostAddressRangeEXT> array(Arena arena, VkHostAddressRangeEXT... structs) {
        NativeStructArray<VkHostAddressRangeEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkHostAddressRangeEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkHostAddressRangeEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkHostAddressRangeEXT(segment)
        );
    }

}