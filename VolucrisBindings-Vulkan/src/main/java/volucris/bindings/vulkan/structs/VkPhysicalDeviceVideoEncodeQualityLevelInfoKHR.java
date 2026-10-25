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

public final class VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR
		implements Struct<VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_VIDEO_PROFILE_HANDLE;
	public static final VarHandle QUALITY_LEVEL_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_VIDEO_PROFILE_BYTE_OFFSET;
	public static final long QUALITY_LEVEL_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pVideoProfile"),
		    JAVA_INT.withName("qualityLevel"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_VIDEO_PROFILE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pVideoProfile"));
		QUALITY_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("qualityLevel"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_VIDEO_PROFILE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pVideoProfile"));
		QUALITY_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("qualityLevel"));
		//@formatter:on
	}

	public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pVideoProfile()
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pVideoProfile(VkVideoProfileInfoKHR pVideoProfile) {
    	P_VIDEO_PROFILE_HANDLE.set(segment, 0L, pVideoProfile.memorySegment());
    	return this;
    }
    
    public @Nullable VkVideoProfileInfoKHR pVideoProfile() {
    	MemorySegment segment = (MemorySegment) P_VIDEO_PROFILE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkVideoProfileInfoKHR(segment);
    }
    
    /// @see #qualityLevel()
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR qualityLevel(int qualityLevel) {
    	QUALITY_LEVEL_HANDLE.set(segment, 0L, qualityLevel);
    	return this;
    }
    
    public int qualityLevel() {
    	return (int) QUALITY_LEVEL_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR set(VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR> array(SegmentAllocator allocator, VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR... structs) {
        NativeStructArray<VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(segment)
        );
    }

}