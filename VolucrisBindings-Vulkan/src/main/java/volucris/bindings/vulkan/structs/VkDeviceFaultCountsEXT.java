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

public final class VkDeviceFaultCountsEXT
		implements Struct<VkDeviceFaultCountsEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ADDRESS_INFO_COUNT_HANDLE;
	public static final VarHandle VENDOR_INFO_COUNT_HANDLE;
	public static final VarHandle VENDOR_BINARY_SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ADDRESS_INFO_COUNT_BYTE_OFFSET;
	public static final long VENDOR_INFO_COUNT_BYTE_OFFSET;
	public static final long VENDOR_BINARY_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("addressInfoCount"),
		    JAVA_INT.withName("vendorInfoCount"),
		    JAVA_LONG.withName("vendorBinarySize")
		).withName("VkDeviceFaultCountsEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ADDRESS_INFO_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressInfoCount"));
		VENDOR_INFO_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vendorInfoCount"));
		VENDOR_BINARY_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vendorBinarySize"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ADDRESS_INFO_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressInfoCount"));
		VENDOR_INFO_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vendorInfoCount"));
		VENDOR_BINARY_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vendorBinarySize"));
		//@formatter:on
	}

	public VkDeviceFaultCountsEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceFaultCountsEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDeviceFaultCountsEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDeviceFaultCountsEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceFaultCountsEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #addressInfoCount()
    public VkDeviceFaultCountsEXT addressInfoCount(int addressInfoCount) {
    	ADDRESS_INFO_COUNT_HANDLE.set(segment, 0L, addressInfoCount);
    	return this;
    }
    
    public int addressInfoCount() {
    	return (int) ADDRESS_INFO_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #vendorInfoCount()
    public VkDeviceFaultCountsEXT vendorInfoCount(int vendorInfoCount) {
    	VENDOR_INFO_COUNT_HANDLE.set(segment, 0L, vendorInfoCount);
    	return this;
    }
    
    public int vendorInfoCount() {
    	return (int) VENDOR_INFO_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #vendorBinarySize()
    public VkDeviceFaultCountsEXT vendorBinarySize(long vendorBinarySize) {
    	VENDOR_BINARY_SIZE_HANDLE.set(segment, 0L, vendorBinarySize);
    	return this;
    }
    
    public long vendorBinarySize() {
    	return (long) VENDOR_BINARY_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDeviceFaultCountsEXT set(VkDeviceFaultCountsEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceFaultCountsEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceFaultCountsEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceFaultCountsEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceFaultCountsEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceFaultCountsEXT> array(Arena arena, VkDeviceFaultCountsEXT... structs) {
        NativeStructArray<VkDeviceFaultCountsEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceFaultCountsEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceFaultCountsEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceFaultCountsEXT(segment)
        );
    }

}