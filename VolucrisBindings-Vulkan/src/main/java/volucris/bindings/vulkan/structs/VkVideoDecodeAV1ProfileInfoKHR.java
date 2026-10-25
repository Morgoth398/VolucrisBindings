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

public final class VkVideoDecodeAV1ProfileInfoKHR
		implements Struct<VkVideoDecodeAV1ProfileInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STD_PROFILE_HANDLE;
	public static final VarHandle FILM_GRAIN_SUPPORT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STD_PROFILE_BYTE_OFFSET;
	public static final long FILM_GRAIN_SUPPORT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("stdProfile"),
		    JAVA_INT.withName("filmGrainSupport")
		).withName("VkVideoDecodeAV1ProfileInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STD_PROFILE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stdProfile"));
		FILM_GRAIN_SUPPORT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("filmGrainSupport"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STD_PROFILE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stdProfile"));
		FILM_GRAIN_SUPPORT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("filmGrainSupport"));
		//@formatter:on
	}

	public VkVideoDecodeAV1ProfileInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoDecodeAV1ProfileInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoDecodeAV1ProfileInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoDecodeAV1ProfileInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeAV1ProfileInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #stdProfile()
    public VkVideoDecodeAV1ProfileInfoKHR stdProfile(int stdProfile) {
    	STD_PROFILE_HANDLE.set(segment, 0L, stdProfile);
    	return this;
    }
    
    public int stdProfile() {
    	return (int) STD_PROFILE_HANDLE.get(segment, 0L);
    }
    
    /// @see #filmGrainSupport()
    public VkVideoDecodeAV1ProfileInfoKHR filmGrainSupport(int filmGrainSupport) {
    	FILM_GRAIN_SUPPORT_HANDLE.set(segment, 0L, filmGrainSupport);
    	return this;
    }
    
    public int filmGrainSupport() {
    	return (int) FILM_GRAIN_SUPPORT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoDecodeAV1ProfileInfoKHR set(VkVideoDecodeAV1ProfileInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeAV1ProfileInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeAV1ProfileInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeAV1ProfileInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoDecodeAV1ProfileInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeAV1ProfileInfoKHR> array(SegmentAllocator allocator, VkVideoDecodeAV1ProfileInfoKHR... structs) {
        NativeStructArray<VkVideoDecodeAV1ProfileInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoDecodeAV1ProfileInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeAV1ProfileInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeAV1ProfileInfoKHR(segment)
        );
    }

}