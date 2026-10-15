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

public final class VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR
		implements Struct<VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VIDEO_ENCODE_FEEDBACK2_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VIDEO_ENCODE_FEEDBACK2_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("videoEncodeFeedback2"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VIDEO_ENCODE_FEEDBACK2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("videoEncodeFeedback2"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VIDEO_ENCODE_FEEDBACK2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("videoEncodeFeedback2"));
		//@formatter:on
	}

	public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #videoEncodeFeedback2()
    public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR videoEncodeFeedback2(int videoEncodeFeedback2) {
    	VIDEO_ENCODE_FEEDBACK2_HANDLE.set(segment, 0L, videoEncodeFeedback2);
    	return this;
    }
    
    public int videoEncodeFeedback2() {
    	return (int) VIDEO_ENCODE_FEEDBACK2_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR set(VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR> array(Arena arena, VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR(segment)
        );
    }

}