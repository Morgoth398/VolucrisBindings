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

public final class VkImageUsageFlags2CreateInfoKHR
		implements Struct<VkImageUsageFlags2CreateInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle USAGE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long USAGE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("usage")
		).withName("VkImageUsageFlags2CreateInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		USAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usage"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		USAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usage"));
		//@formatter:on
	}

	public VkImageUsageFlags2CreateInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkImageUsageFlags2CreateInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkImageUsageFlags2CreateInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkImageUsageFlags2CreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageUsageFlags2CreateInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #usage()
    public VkImageUsageFlags2CreateInfoKHR usage(long usage) {
    	USAGE_HANDLE.set(segment, 0L, usage);
    	return this;
    }
    
    public long usage() {
    	return (long) USAGE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkImageUsageFlags2CreateInfoKHR set(VkImageUsageFlags2CreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageUsageFlags2CreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageUsageFlags2CreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageUsageFlags2CreateInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageUsageFlags2CreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageUsageFlags2CreateInfoKHR> array(Arena arena, VkImageUsageFlags2CreateInfoKHR... structs) {
        NativeStructArray<VkImageUsageFlags2CreateInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageUsageFlags2CreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageUsageFlags2CreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageUsageFlags2CreateInfoKHR(segment)
        );
    }

}