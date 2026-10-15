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

public final class VkVideoInlineQueryInfoKHR
		implements Struct<VkVideoInlineQueryInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle QUERY_POOL_HANDLE;
	public static final VarHandle FIRST_QUERY_HANDLE;
	public static final VarHandle QUERY_COUNT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long QUERY_POOL_BYTE_OFFSET;
	public static final long FIRST_QUERY_BYTE_OFFSET;
	public static final long QUERY_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("queryPool"),
		    JAVA_INT.withName("firstQuery"),
		    JAVA_INT.withName("queryCount")
		).withName("VkVideoInlineQueryInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		QUERY_POOL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queryPool"));
		FIRST_QUERY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("firstQuery"));
		QUERY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queryCount"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		QUERY_POOL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queryPool"));
		FIRST_QUERY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("firstQuery"));
		QUERY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queryCount"));
		//@formatter:on
	}

	public VkVideoInlineQueryInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoInlineQueryInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoInlineQueryInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoInlineQueryInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoInlineQueryInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #queryPool()
    public VkVideoInlineQueryInfoKHR queryPool(VkQueryPool queryPool) {
    	QUERY_POOL_HANDLE.set(segment, 0L, queryPool.memorySegment());
    	return this;
    }
    
    public @Nullable VkQueryPool queryPool() {
    	MemorySegment segment = (MemorySegment) QUERY_POOL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkQueryPool(segment);
    }
    
    /// @see #firstQuery()
    public VkVideoInlineQueryInfoKHR firstQuery(int firstQuery) {
    	FIRST_QUERY_HANDLE.set(segment, 0L, firstQuery);
    	return this;
    }
    
    public int firstQuery() {
    	return (int) FIRST_QUERY_HANDLE.get(segment, 0L);
    }
    
    /// @see #queryCount()
    public VkVideoInlineQueryInfoKHR queryCount(int queryCount) {
    	QUERY_COUNT_HANDLE.set(segment, 0L, queryCount);
    	return this;
    }
    
    public int queryCount() {
    	return (int) QUERY_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoInlineQueryInfoKHR set(VkVideoInlineQueryInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoInlineQueryInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoInlineQueryInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoInlineQueryInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoInlineQueryInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoInlineQueryInfoKHR> array(Arena arena, VkVideoInlineQueryInfoKHR... structs) {
        NativeStructArray<VkVideoInlineQueryInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoInlineQueryInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoInlineQueryInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoInlineQueryInfoKHR(segment)
        );
    }

}