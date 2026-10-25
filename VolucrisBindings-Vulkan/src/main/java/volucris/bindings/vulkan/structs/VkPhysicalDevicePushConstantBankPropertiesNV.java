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

public final class VkPhysicalDevicePushConstantBankPropertiesNV
		implements Struct<VkPhysicalDevicePushConstantBankPropertiesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_GRAPHICS_PUSH_CONSTANT_BANKS_HANDLE;
	public static final VarHandle MAX_COMPUTE_PUSH_CONSTANT_BANKS_HANDLE;
	public static final VarHandle MAX_GRAPHICS_PUSH_DATA_BANKS_HANDLE;
	public static final VarHandle MAX_COMPUTE_PUSH_DATA_BANKS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_GRAPHICS_PUSH_CONSTANT_BANKS_BYTE_OFFSET;
	public static final long MAX_COMPUTE_PUSH_CONSTANT_BANKS_BYTE_OFFSET;
	public static final long MAX_GRAPHICS_PUSH_DATA_BANKS_BYTE_OFFSET;
	public static final long MAX_COMPUTE_PUSH_DATA_BANKS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maxGraphicsPushConstantBanks"),
		    JAVA_INT.withName("maxComputePushConstantBanks"),
		    JAVA_INT.withName("maxGraphicsPushDataBanks"),
		    JAVA_INT.withName("maxComputePushDataBanks")
		).withName("VkPhysicalDevicePushConstantBankPropertiesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_GRAPHICS_PUSH_CONSTANT_BANKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxGraphicsPushConstantBanks"));
		MAX_COMPUTE_PUSH_CONSTANT_BANKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxComputePushConstantBanks"));
		MAX_GRAPHICS_PUSH_DATA_BANKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxGraphicsPushDataBanks"));
		MAX_COMPUTE_PUSH_DATA_BANKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxComputePushDataBanks"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_GRAPHICS_PUSH_CONSTANT_BANKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxGraphicsPushConstantBanks"));
		MAX_COMPUTE_PUSH_CONSTANT_BANKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxComputePushConstantBanks"));
		MAX_GRAPHICS_PUSH_DATA_BANKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxGraphicsPushDataBanks"));
		MAX_COMPUTE_PUSH_DATA_BANKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxComputePushDataBanks"));
		//@formatter:on
	}

	public VkPhysicalDevicePushConstantBankPropertiesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDevicePushConstantBankPropertiesNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDevicePushConstantBankPropertiesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDevicePushConstantBankPropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevicePushConstantBankPropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxGraphicsPushConstantBanks()
    public VkPhysicalDevicePushConstantBankPropertiesNV maxGraphicsPushConstantBanks(int maxGraphicsPushConstantBanks) {
    	MAX_GRAPHICS_PUSH_CONSTANT_BANKS_HANDLE.set(segment, 0L, maxGraphicsPushConstantBanks);
    	return this;
    }
    
    public int maxGraphicsPushConstantBanks() {
    	return (int) MAX_GRAPHICS_PUSH_CONSTANT_BANKS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxComputePushConstantBanks()
    public VkPhysicalDevicePushConstantBankPropertiesNV maxComputePushConstantBanks(int maxComputePushConstantBanks) {
    	MAX_COMPUTE_PUSH_CONSTANT_BANKS_HANDLE.set(segment, 0L, maxComputePushConstantBanks);
    	return this;
    }
    
    public int maxComputePushConstantBanks() {
    	return (int) MAX_COMPUTE_PUSH_CONSTANT_BANKS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxGraphicsPushDataBanks()
    public VkPhysicalDevicePushConstantBankPropertiesNV maxGraphicsPushDataBanks(int maxGraphicsPushDataBanks) {
    	MAX_GRAPHICS_PUSH_DATA_BANKS_HANDLE.set(segment, 0L, maxGraphicsPushDataBanks);
    	return this;
    }
    
    public int maxGraphicsPushDataBanks() {
    	return (int) MAX_GRAPHICS_PUSH_DATA_BANKS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxComputePushDataBanks()
    public VkPhysicalDevicePushConstantBankPropertiesNV maxComputePushDataBanks(int maxComputePushDataBanks) {
    	MAX_COMPUTE_PUSH_DATA_BANKS_HANDLE.set(segment, 0L, maxComputePushDataBanks);
    	return this;
    }
    
    public int maxComputePushDataBanks() {
    	return (int) MAX_COMPUTE_PUSH_DATA_BANKS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevicePushConstantBankPropertiesNV set(VkPhysicalDevicePushConstantBankPropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevicePushConstantBankPropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevicePushConstantBankPropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevicePushConstantBankPropertiesNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDevicePushConstantBankPropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevicePushConstantBankPropertiesNV> array(SegmentAllocator allocator, VkPhysicalDevicePushConstantBankPropertiesNV... structs) {
        NativeStructArray<VkPhysicalDevicePushConstantBankPropertiesNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDevicePushConstantBankPropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevicePushConstantBankPropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevicePushConstantBankPropertiesNV(segment)
        );
    }

}