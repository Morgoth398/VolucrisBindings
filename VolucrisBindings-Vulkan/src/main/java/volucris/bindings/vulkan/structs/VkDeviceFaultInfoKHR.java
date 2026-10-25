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

public final class VkDeviceFaultInfoKHR
		implements Struct<VkDeviceFaultInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle GROUP_ID_HANDLE;
	public static final VarHandle DESCRIPTION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long GROUP_ID_BYTE_OFFSET;
	public static final long DESCRIPTION_BYTE_OFFSET;
	public static final long FAULT_ADDRESS_INFO_BYTE_OFFSET;
	public static final long INSTRUCTION_ADDRESS_INFO_BYTE_OFFSET;
	public static final long VENDOR_INFO_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDeviceFaultAddressInfoKHR faultAddressInfo;
	private final VkDeviceFaultAddressInfoKHR instructionAddressInfo;
	private final VkDeviceFaultVendorInfoKHR vendorInfo;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("groupId"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("description"),
		    VkDeviceFaultAddressInfoKHR.LAYOUT.withName("faultAddressInfo"),
		    VkDeviceFaultAddressInfoKHR.LAYOUT.withName("instructionAddressInfo"),
		    VkDeviceFaultVendorInfoKHR.LAYOUT.withName("vendorInfo")
		).withName("VkDeviceFaultInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		GROUP_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("groupId"));
		DESCRIPTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		GROUP_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("groupId"));
		DESCRIPTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("description"));
		FAULT_ADDRESS_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("faultAddressInfo"));
		INSTRUCTION_ADDRESS_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("instructionAddressInfo"));
		VENDOR_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vendorInfo"));
		//@formatter:on
	}

	public VkDeviceFaultInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceFaultInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDeviceFaultInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    faultAddressInfo = new VkDeviceFaultAddressInfoKHR(segment.asSlice(FAULT_ADDRESS_INFO_BYTE_OFFSET, VkDeviceFaultAddressInfoKHR.LAYOUT));
	    instructionAddressInfo = new VkDeviceFaultAddressInfoKHR(segment.asSlice(INSTRUCTION_ADDRESS_INFO_BYTE_OFFSET, VkDeviceFaultAddressInfoKHR.LAYOUT));
	    vendorInfo = new VkDeviceFaultVendorInfoKHR(segment.asSlice(VENDOR_INFO_BYTE_OFFSET, VkDeviceFaultVendorInfoKHR.LAYOUT));
	}

    /// @see #sType()
    public VkDeviceFaultInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceFaultInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkDeviceFaultInfoKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #groupId()
    public VkDeviceFaultInfoKHR groupId(long groupId) {
    	GROUP_ID_HANDLE.set(segment, 0L, groupId);
    	return this;
    }
    
    public long groupId() {
    	return (long) GROUP_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #description(int)
    public VkDeviceFaultInfoKHR description(byte description, int index0) {
    	DESCRIPTION_HANDLE.set(segment, 0L, index0, description);
    	return this;
    }
    
    public byte description(int index0) {
    	return (byte) DESCRIPTION_HANDLE.get(segment, 0L, index0);
    }
    
    public String description() {
        return segment.getString(DESCRIPTION_BYTE_OFFSET);
    }
    
    /// @see #faultAddressInfo()
    public VkDeviceFaultInfoKHR faultAddressInfo(Consumer<VkDeviceFaultAddressInfoKHR> consumer) {
    	consumer.accept(faultAddressInfo);
    	return this;
    }
    
    /// @see #faultAddressInfo()
    public VkDeviceFaultInfoKHR faultAddressInfo(VkDeviceFaultAddressInfoKHR other) {
    	faultAddressInfo.set(other);
    	return this;
    }
    
    public VkDeviceFaultAddressInfoKHR faultAddressInfo() {
    	return faultAddressInfo;
    }
    
    /// @see #instructionAddressInfo()
    public VkDeviceFaultInfoKHR instructionAddressInfo(Consumer<VkDeviceFaultAddressInfoKHR> consumer) {
    	consumer.accept(instructionAddressInfo);
    	return this;
    }
    
    /// @see #instructionAddressInfo()
    public VkDeviceFaultInfoKHR instructionAddressInfo(VkDeviceFaultAddressInfoKHR other) {
    	instructionAddressInfo.set(other);
    	return this;
    }
    
    public VkDeviceFaultAddressInfoKHR instructionAddressInfo() {
    	return instructionAddressInfo;
    }
    
    /// @see #vendorInfo()
    public VkDeviceFaultInfoKHR vendorInfo(Consumer<VkDeviceFaultVendorInfoKHR> consumer) {
    	consumer.accept(vendorInfo);
    	return this;
    }
    
    /// @see #vendorInfo()
    public VkDeviceFaultInfoKHR vendorInfo(VkDeviceFaultVendorInfoKHR other) {
    	vendorInfo.set(other);
    	return this;
    }
    
    public VkDeviceFaultVendorInfoKHR vendorInfo() {
    	return vendorInfo;
    }
    
    @Override
    public VkDeviceFaultInfoKHR set(VkDeviceFaultInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceFaultInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceFaultInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceFaultInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceFaultInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceFaultInfoKHR> array(SegmentAllocator allocator, VkDeviceFaultInfoKHR... structs) {
        NativeStructArray<VkDeviceFaultInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceFaultInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceFaultInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceFaultInfoKHR(segment)
        );
    }

}