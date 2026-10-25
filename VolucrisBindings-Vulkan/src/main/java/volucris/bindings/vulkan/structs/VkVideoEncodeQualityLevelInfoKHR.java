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

public final class VkVideoEncodeQualityLevelInfoKHR
		implements Struct<VkVideoEncodeQualityLevelInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle QUALITY_LEVEL_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long QUALITY_LEVEL_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("qualityLevel"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkVideoEncodeQualityLevelInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		QUALITY_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("qualityLevel"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		QUALITY_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("qualityLevel"));
		//@formatter:on
	}

	public VkVideoEncodeQualityLevelInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeQualityLevelInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoEncodeQualityLevelInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeQualityLevelInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeQualityLevelInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #qualityLevel()
    public VkVideoEncodeQualityLevelInfoKHR qualityLevel(int qualityLevel) {
    	QUALITY_LEVEL_HANDLE.set(segment, 0L, qualityLevel);
    	return this;
    }
    
    public int qualityLevel() {
    	return (int) QUALITY_LEVEL_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeQualityLevelInfoKHR set(VkVideoEncodeQualityLevelInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeQualityLevelInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeQualityLevelInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeQualityLevelInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeQualityLevelInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeQualityLevelInfoKHR> array(SegmentAllocator allocator, VkVideoEncodeQualityLevelInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeQualityLevelInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeQualityLevelInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeQualityLevelInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeQualityLevelInfoKHR(segment)
        );
    }

}