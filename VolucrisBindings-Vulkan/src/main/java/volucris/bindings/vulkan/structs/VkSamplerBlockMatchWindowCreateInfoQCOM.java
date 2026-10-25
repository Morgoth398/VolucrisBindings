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

public final class VkSamplerBlockMatchWindowCreateInfoQCOM
		implements Struct<VkSamplerBlockMatchWindowCreateInfoQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle WINDOW_COMPARE_MODE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long WINDOW_EXTENT_BYTE_OFFSET;
	public static final long WINDOW_COMPARE_MODE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D windowExtent;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkExtent2D.LAYOUT.withName("windowExtent"),
		    JAVA_INT.withName("windowCompareMode"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkSamplerBlockMatchWindowCreateInfoQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		WINDOW_COMPARE_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("windowCompareMode"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		WINDOW_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("windowExtent"));
		WINDOW_COMPARE_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("windowCompareMode"));
		//@formatter:on
	}

	public VkSamplerBlockMatchWindowCreateInfoQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkSamplerBlockMatchWindowCreateInfoQCOM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSamplerBlockMatchWindowCreateInfoQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	    windowExtent = new VkExtent2D(segment.asSlice(WINDOW_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #sType()
    public VkSamplerBlockMatchWindowCreateInfoQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSamplerBlockMatchWindowCreateInfoQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #windowExtent()
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(windowExtent);
    	return this;
    }
    
    /// @see #windowExtent()
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowExtent(VkExtent2D other) {
    	windowExtent.set(other);
    	return this;
    }
    
    public VkExtent2D windowExtent() {
    	return windowExtent;
    }
    
    /// @see #windowCompareMode()
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowCompareMode(int windowCompareMode) {
    	WINDOW_COMPARE_MODE_HANDLE.set(segment, 0L, windowCompareMode);
    	return this;
    }
    
    public int windowCompareMode() {
    	return (int) WINDOW_COMPARE_MODE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSamplerBlockMatchWindowCreateInfoQCOM set(VkSamplerBlockMatchWindowCreateInfoQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkSamplerBlockMatchWindowCreateInfoQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSamplerBlockMatchWindowCreateInfoQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSamplerBlockMatchWindowCreateInfoQCOM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSamplerBlockMatchWindowCreateInfoQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSamplerBlockMatchWindowCreateInfoQCOM> array(SegmentAllocator allocator, VkSamplerBlockMatchWindowCreateInfoQCOM... structs) {
        NativeStructArray<VkSamplerBlockMatchWindowCreateInfoQCOM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSamplerBlockMatchWindowCreateInfoQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSamplerBlockMatchWindowCreateInfoQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSamplerBlockMatchWindowCreateInfoQCOM(segment)
        );
    }

}