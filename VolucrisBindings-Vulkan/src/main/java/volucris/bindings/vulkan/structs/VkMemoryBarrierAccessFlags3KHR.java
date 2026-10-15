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

public final class VkMemoryBarrierAccessFlags3KHR
		implements Struct<VkMemoryBarrierAccessFlags3KHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SRC_ACCESS_MASK3_HANDLE;
	public static final VarHandle DST_ACCESS_MASK3_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SRC_ACCESS_MASK3_BYTE_OFFSET;
	public static final long DST_ACCESS_MASK3_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("srcAccessMask3"),
		    JAVA_LONG.withName("dstAccessMask3")
		).withName("VkMemoryBarrierAccessFlags3KHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SRC_ACCESS_MASK3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcAccessMask3"));
		DST_ACCESS_MASK3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstAccessMask3"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SRC_ACCESS_MASK3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask3"));
		DST_ACCESS_MASK3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask3"));
		//@formatter:on
	}

	public VkMemoryBarrierAccessFlags3KHR() {
	    this(Arena.ofAuto());
	}
	
	public VkMemoryBarrierAccessFlags3KHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkMemoryBarrierAccessFlags3KHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkMemoryBarrierAccessFlags3KHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMemoryBarrierAccessFlags3KHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #srcAccessMask3()
    public VkMemoryBarrierAccessFlags3KHR srcAccessMask3(long srcAccessMask3) {
    	SRC_ACCESS_MASK3_HANDLE.set(segment, 0L, srcAccessMask3);
    	return this;
    }
    
    public long srcAccessMask3() {
    	return (long) SRC_ACCESS_MASK3_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstAccessMask3()
    public VkMemoryBarrierAccessFlags3KHR dstAccessMask3(long dstAccessMask3) {
    	DST_ACCESS_MASK3_HANDLE.set(segment, 0L, dstAccessMask3);
    	return this;
    }
    
    public long dstAccessMask3() {
    	return (long) DST_ACCESS_MASK3_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMemoryBarrierAccessFlags3KHR set(VkMemoryBarrierAccessFlags3KHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkMemoryBarrierAccessFlags3KHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMemoryBarrierAccessFlags3KHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMemoryBarrierAccessFlags3KHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryBarrierAccessFlags3KHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMemoryBarrierAccessFlags3KHR> array(Arena arena, VkMemoryBarrierAccessFlags3KHR... structs) {
        NativeStructArray<VkMemoryBarrierAccessFlags3KHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryBarrierAccessFlags3KHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMemoryBarrierAccessFlags3KHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMemoryBarrierAccessFlags3KHR(segment)
        );
    }

}