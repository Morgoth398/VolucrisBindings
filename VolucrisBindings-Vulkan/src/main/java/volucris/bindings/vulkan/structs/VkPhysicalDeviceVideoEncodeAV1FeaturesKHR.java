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

public final class VkPhysicalDeviceVideoEncodeAV1FeaturesKHR
		implements Struct<VkPhysicalDeviceVideoEncodeAV1FeaturesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VIDEO_ENCODE_AV1_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VIDEO_ENCODE_AV1_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("videoEncodeAV1"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceVideoEncodeAV1FeaturesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VIDEO_ENCODE_AV1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("videoEncodeAV1"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VIDEO_ENCODE_AV1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("videoEncodeAV1"));
		//@formatter:on
	}

	public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #videoEncodeAV1()
    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR videoEncodeAV1(int videoEncodeAV1) {
    	VIDEO_ENCODE_AV1_HANDLE.set(segment, 0L, videoEncodeAV1);
    	return this;
    }
    
    public int videoEncodeAV1() {
    	return (int) VIDEO_ENCODE_AV1_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR set(VkPhysicalDeviceVideoEncodeAV1FeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceVideoEncodeAV1FeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceVideoEncodeAV1FeaturesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceVideoEncodeAV1FeaturesKHR> array(Arena arena, VkPhysicalDeviceVideoEncodeAV1FeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceVideoEncodeAV1FeaturesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceVideoEncodeAV1FeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(segment)
        );
    }

}