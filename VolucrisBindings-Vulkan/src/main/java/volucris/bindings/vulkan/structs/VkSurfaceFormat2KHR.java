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
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkSurfaceFormat2KHR
		implements Struct<VkSurfaceFormat2KHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SURFACE_FORMAT_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkSurfaceFormatKHR surfaceFormat;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkSurfaceFormatKHR.LAYOUT.withName("surfaceFormat")
		).withName("VkSurfaceFormat2KHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SURFACE_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("surfaceFormat"));
		//@formatter:on
	}

	public VkSurfaceFormat2KHR() {
	    this(Arena.ofAuto());
	}
	
	public VkSurfaceFormat2KHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSurfaceFormat2KHR(MemorySegment segment) {
	    this.segment = segment;
	
	    surfaceFormat = new VkSurfaceFormatKHR(segment.asSlice(SURFACE_FORMAT_BYTE_OFFSET, VkSurfaceFormatKHR.LAYOUT));
	}

    /// @see #sType()
    public VkSurfaceFormat2KHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSurfaceFormat2KHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #surfaceFormat()
    public VkSurfaceFormat2KHR surfaceFormat(Consumer<VkSurfaceFormatKHR> consumer) {
    	consumer.accept(surfaceFormat);
    	return this;
    }
    
    /// @see #surfaceFormat()
    public VkSurfaceFormat2KHR surfaceFormat(VkSurfaceFormatKHR other) {
    	surfaceFormat.set(other);
    	return this;
    }
    
    public VkSurfaceFormatKHR surfaceFormat() {
    	return surfaceFormat;
    }
    
    @Override
    public VkSurfaceFormat2KHR set(VkSurfaceFormat2KHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkSurfaceFormat2KHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSurfaceFormat2KHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSurfaceFormat2KHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSurfaceFormat2KHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSurfaceFormat2KHR> array(SegmentAllocator allocator, VkSurfaceFormat2KHR... structs) {
        NativeStructArray<VkSurfaceFormat2KHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSurfaceFormat2KHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSurfaceFormat2KHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSurfaceFormat2KHR(segment)
        );
    }

}