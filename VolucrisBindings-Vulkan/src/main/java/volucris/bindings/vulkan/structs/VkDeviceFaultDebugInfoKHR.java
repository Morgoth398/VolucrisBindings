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

public final class VkDeviceFaultDebugInfoKHR
		implements Struct<VkDeviceFaultDebugInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VENDOR_BINARY_SIZE_HANDLE;
	public static final VarHandle P_VENDOR_BINARY_DATA_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VENDOR_BINARY_SIZE_BYTE_OFFSET;
	public static final long P_VENDOR_BINARY_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("vendorBinarySize"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pVendorBinaryData")
		).withName("VkDeviceFaultDebugInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VENDOR_BINARY_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vendorBinarySize"));
		P_VENDOR_BINARY_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pVendorBinaryData"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VENDOR_BINARY_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vendorBinarySize"));
		P_VENDOR_BINARY_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pVendorBinaryData"));
		//@formatter:on
	}

	public VkDeviceFaultDebugInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceFaultDebugInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDeviceFaultDebugInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDeviceFaultDebugInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceFaultDebugInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #vendorBinarySize()
    public VkDeviceFaultDebugInfoKHR vendorBinarySize(int vendorBinarySize) {
    	VENDOR_BINARY_SIZE_HANDLE.set(segment, 0L, vendorBinarySize);
    	return this;
    }
    
    public int vendorBinarySize() {
    	return (int) VENDOR_BINARY_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pVendorBinaryData()
    public VkDeviceFaultDebugInfoKHR pVendorBinaryData(MemorySegment pVendorBinaryData) {
    	P_VENDOR_BINARY_DATA_HANDLE.set(segment, 0L, pVendorBinaryData);
    	return this;
    }
    
    public @Nullable MemorySegment pVendorBinaryData() {
    	MemorySegment segment = (MemorySegment) P_VENDOR_BINARY_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkDeviceFaultDebugInfoKHR set(VkDeviceFaultDebugInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceFaultDebugInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceFaultDebugInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceFaultDebugInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceFaultDebugInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceFaultDebugInfoKHR> array(Arena arena, VkDeviceFaultDebugInfoKHR... structs) {
        NativeStructArray<VkDeviceFaultDebugInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceFaultDebugInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceFaultDebugInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceFaultDebugInfoKHR(segment)
        );
    }

}