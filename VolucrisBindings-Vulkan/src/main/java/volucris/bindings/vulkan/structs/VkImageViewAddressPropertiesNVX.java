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

public final class VkImageViewAddressPropertiesNVX
		implements Struct<VkImageViewAddressPropertiesNVX> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DEVICE_ADDRESS_HANDLE;
	public static final VarHandle SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DEVICE_ADDRESS_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("deviceAddress"),
		    JAVA_LONG.withName("size")
		).withName("VkImageViewAddressPropertiesNVX").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DEVICE_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceAddress"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DEVICE_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceAddress"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		//@formatter:on
	}

	public VkImageViewAddressPropertiesNVX() {
	    this(Arena.ofAuto());
	}
	
	public VkImageViewAddressPropertiesNVX(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkImageViewAddressPropertiesNVX(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkImageViewAddressPropertiesNVX sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageViewAddressPropertiesNVX pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #deviceAddress()
    public VkImageViewAddressPropertiesNVX deviceAddress(long deviceAddress) {
    	DEVICE_ADDRESS_HANDLE.set(segment, 0L, deviceAddress);
    	return this;
    }
    
    public long deviceAddress() {
    	return (long) DEVICE_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkImageViewAddressPropertiesNVX size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkImageViewAddressPropertiesNVX set(VkImageViewAddressPropertiesNVX other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageViewAddressPropertiesNVX set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageViewAddressPropertiesNVX> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageViewAddressPropertiesNVX> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageViewAddressPropertiesNVX(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageViewAddressPropertiesNVX> array(SegmentAllocator allocator, VkImageViewAddressPropertiesNVX... structs) {
        NativeStructArray<VkImageViewAddressPropertiesNVX> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageViewAddressPropertiesNVX(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageViewAddressPropertiesNVX> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageViewAddressPropertiesNVX(segment)
        );
    }

}