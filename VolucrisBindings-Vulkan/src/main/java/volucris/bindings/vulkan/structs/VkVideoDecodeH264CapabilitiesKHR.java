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

public final class VkVideoDecodeH264CapabilitiesKHR
		implements Struct<VkVideoDecodeH264CapabilitiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_LEVEL_IDC_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_LEVEL_IDC_BYTE_OFFSET;
	public static final long FIELD_OFFSET_GRANULARITY_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkOffset2D fieldOffsetGranularity;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maxLevelIdc"),
		    VkOffset2D.LAYOUT.withName("fieldOffsetGranularity"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkVideoDecodeH264CapabilitiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_LEVEL_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxLevelIdc"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_LEVEL_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxLevelIdc"));
		FIELD_OFFSET_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fieldOffsetGranularity"));
		//@formatter:on
	}

	public VkVideoDecodeH264CapabilitiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoDecodeH264CapabilitiesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoDecodeH264CapabilitiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    fieldOffsetGranularity = new VkOffset2D(segment.asSlice(FIELD_OFFSET_GRANULARITY_BYTE_OFFSET, VkOffset2D.LAYOUT));
	}

    /// @see #sType()
    public VkVideoDecodeH264CapabilitiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeH264CapabilitiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxLevelIdc()
    public VkVideoDecodeH264CapabilitiesKHR maxLevelIdc(int maxLevelIdc) {
    	MAX_LEVEL_IDC_HANDLE.set(segment, 0L, maxLevelIdc);
    	return this;
    }
    
    public int maxLevelIdc() {
    	return (int) MAX_LEVEL_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #fieldOffsetGranularity()
    public VkVideoDecodeH264CapabilitiesKHR fieldOffsetGranularity(Consumer<VkOffset2D> consumer) {
    	consumer.accept(fieldOffsetGranularity);
    	return this;
    }
    
    /// @see #fieldOffsetGranularity()
    public VkVideoDecodeH264CapabilitiesKHR fieldOffsetGranularity(VkOffset2D other) {
    	fieldOffsetGranularity.set(other);
    	return this;
    }
    
    public VkOffset2D fieldOffsetGranularity() {
    	return fieldOffsetGranularity;
    }
    
    @Override
    public VkVideoDecodeH264CapabilitiesKHR set(VkVideoDecodeH264CapabilitiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeH264CapabilitiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeH264CapabilitiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeH264CapabilitiesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoDecodeH264CapabilitiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeH264CapabilitiesKHR> array(SegmentAllocator allocator, VkVideoDecodeH264CapabilitiesKHR... structs) {
        NativeStructArray<VkVideoDecodeH264CapabilitiesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoDecodeH264CapabilitiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeH264CapabilitiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeH264CapabilitiesKHR(segment)
        );
    }

}