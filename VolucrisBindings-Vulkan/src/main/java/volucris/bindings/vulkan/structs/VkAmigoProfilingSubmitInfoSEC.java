/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
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

public final class VkAmigoProfilingSubmitInfoSEC
		implements Struct<VkAmigoProfilingSubmitInfoSEC> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FIRST_DRAW_TIMESTAMP_HANDLE;
	public static final VarHandle SWAP_BUFFER_TIMESTAMP_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FIRST_DRAW_TIMESTAMP_BYTE_OFFSET;
	public static final long SWAP_BUFFER_TIMESTAMP_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("firstDrawTimestamp"),
		    JAVA_LONG.withName("swapBufferTimestamp")
		).withName("VkAmigoProfilingSubmitInfoSEC").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FIRST_DRAW_TIMESTAMP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("firstDrawTimestamp"));
		SWAP_BUFFER_TIMESTAMP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("swapBufferTimestamp"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FIRST_DRAW_TIMESTAMP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("firstDrawTimestamp"));
		SWAP_BUFFER_TIMESTAMP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("swapBufferTimestamp"));
		//@formatter:on
	}

	public VkAmigoProfilingSubmitInfoSEC() {
	    this(Arena.ofAuto());
	}
	
	public VkAmigoProfilingSubmitInfoSEC(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkAmigoProfilingSubmitInfoSEC(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkAmigoProfilingSubmitInfoSEC sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAmigoProfilingSubmitInfoSEC pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #firstDrawTimestamp()
    public VkAmigoProfilingSubmitInfoSEC firstDrawTimestamp(long firstDrawTimestamp) {
    	FIRST_DRAW_TIMESTAMP_HANDLE.set(segment, 0L, firstDrawTimestamp);
    	return this;
    }
    
    public long firstDrawTimestamp() {
    	return (long) FIRST_DRAW_TIMESTAMP_HANDLE.get(segment, 0L);
    }
    
    /// @see #swapBufferTimestamp()
    public VkAmigoProfilingSubmitInfoSEC swapBufferTimestamp(long swapBufferTimestamp) {
    	SWAP_BUFFER_TIMESTAMP_HANDLE.set(segment, 0L, swapBufferTimestamp);
    	return this;
    }
    
    public long swapBufferTimestamp() {
    	return (long) SWAP_BUFFER_TIMESTAMP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAmigoProfilingSubmitInfoSEC set(VkAmigoProfilingSubmitInfoSEC other) {
        return set(other.segment);
    }
    
    @Override
    public VkAmigoProfilingSubmitInfoSEC set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAmigoProfilingSubmitInfoSEC> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAmigoProfilingSubmitInfoSEC> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAmigoProfilingSubmitInfoSEC(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAmigoProfilingSubmitInfoSEC> array(SegmentAllocator allocator, VkAmigoProfilingSubmitInfoSEC... structs) {
        NativeStructArray<VkAmigoProfilingSubmitInfoSEC> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAmigoProfilingSubmitInfoSEC(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAmigoProfilingSubmitInfoSEC> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAmigoProfilingSubmitInfoSEC(segment)
        );
    }

}