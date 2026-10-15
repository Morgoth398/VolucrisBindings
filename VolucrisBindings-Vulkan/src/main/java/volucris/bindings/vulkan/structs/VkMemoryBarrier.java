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

public final class VkMemoryBarrier
		implements Struct<VkMemoryBarrier> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SRC_ACCESS_MASK_HANDLE;
	public static final VarHandle DST_ACCESS_MASK_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SRC_ACCESS_MASK_BYTE_OFFSET;
	public static final long DST_ACCESS_MASK_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("srcAccessMask"),
		    JAVA_INT.withName("dstAccessMask")
		).withName("VkMemoryBarrier").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SRC_ACCESS_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcAccessMask"));
		DST_ACCESS_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstAccessMask"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SRC_ACCESS_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
		DST_ACCESS_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
		//@formatter:on
	}

	public VkMemoryBarrier() {
	    this(Arena.ofAuto());
	}
	
	public VkMemoryBarrier(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkMemoryBarrier(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkMemoryBarrier sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMemoryBarrier pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #srcAccessMask()
    public VkMemoryBarrier srcAccessMask(int srcAccessMask) {
    	SRC_ACCESS_MASK_HANDLE.set(segment, 0L, srcAccessMask);
    	return this;
    }
    
    public int srcAccessMask() {
    	return (int) SRC_ACCESS_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstAccessMask()
    public VkMemoryBarrier dstAccessMask(int dstAccessMask) {
    	DST_ACCESS_MASK_HANDLE.set(segment, 0L, dstAccessMask);
    	return this;
    }
    
    public int dstAccessMask() {
    	return (int) DST_ACCESS_MASK_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMemoryBarrier set(VkMemoryBarrier other) {
        return set(other.segment);
    }
    
    @Override
    public VkMemoryBarrier set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMemoryBarrier> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMemoryBarrier> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryBarrier(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMemoryBarrier> array(Arena arena, VkMemoryBarrier... structs) {
        NativeStructArray<VkMemoryBarrier> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryBarrier(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMemoryBarrier> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMemoryBarrier(segment)
        );
    }

}