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

public final class VkPhysicalDeviceMaintenance10PropertiesKHR
		implements Struct<VkPhysicalDeviceMaintenance10PropertiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle RGBA4_OPAQUE_BLACK_SWIZZLED_HANDLE;
	public static final VarHandle RESOLVE_SRGB_FORMAT_APPLIES_TRANSFER_FUNCTION_HANDLE;
	public static final VarHandle RESOLVE_SRGB_FORMAT_SUPPORTS_TRANSFER_FUNCTION_CONTROL_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long RGBA4_OPAQUE_BLACK_SWIZZLED_BYTE_OFFSET;
	public static final long RESOLVE_SRGB_FORMAT_APPLIES_TRANSFER_FUNCTION_BYTE_OFFSET;
	public static final long RESOLVE_SRGB_FORMAT_SUPPORTS_TRANSFER_FUNCTION_CONTROL_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("rgba4OpaqueBlackSwizzled"),
		    JAVA_INT.withName("resolveSrgbFormatAppliesTransferFunction"),
		    JAVA_INT.withName("resolveSrgbFormatSupportsTransferFunctionControl"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceMaintenance10PropertiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		RGBA4_OPAQUE_BLACK_SWIZZLED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rgba4OpaqueBlackSwizzled"));
		RESOLVE_SRGB_FORMAT_APPLIES_TRANSFER_FUNCTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("resolveSrgbFormatAppliesTransferFunction"));
		RESOLVE_SRGB_FORMAT_SUPPORTS_TRANSFER_FUNCTION_CONTROL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("resolveSrgbFormatSupportsTransferFunctionControl"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		RGBA4_OPAQUE_BLACK_SWIZZLED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rgba4OpaqueBlackSwizzled"));
		RESOLVE_SRGB_FORMAT_APPLIES_TRANSFER_FUNCTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resolveSrgbFormatAppliesTransferFunction"));
		RESOLVE_SRGB_FORMAT_SUPPORTS_TRANSFER_FUNCTION_CONTROL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resolveSrgbFormatSupportsTransferFunctionControl"));
		//@formatter:on
	}

	public VkPhysicalDeviceMaintenance10PropertiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceMaintenance10PropertiesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceMaintenance10PropertiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceMaintenance10PropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMaintenance10PropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #rgba4OpaqueBlackSwizzled()
    public VkPhysicalDeviceMaintenance10PropertiesKHR rgba4OpaqueBlackSwizzled(int rgba4OpaqueBlackSwizzled) {
    	RGBA4_OPAQUE_BLACK_SWIZZLED_HANDLE.set(segment, 0L, rgba4OpaqueBlackSwizzled);
    	return this;
    }
    
    public int rgba4OpaqueBlackSwizzled() {
    	return (int) RGBA4_OPAQUE_BLACK_SWIZZLED_HANDLE.get(segment, 0L);
    }
    
    /// @see #resolveSrgbFormatAppliesTransferFunction()
    public VkPhysicalDeviceMaintenance10PropertiesKHR resolveSrgbFormatAppliesTransferFunction(int resolveSrgbFormatAppliesTransferFunction) {
    	RESOLVE_SRGB_FORMAT_APPLIES_TRANSFER_FUNCTION_HANDLE.set(segment, 0L, resolveSrgbFormatAppliesTransferFunction);
    	return this;
    }
    
    public int resolveSrgbFormatAppliesTransferFunction() {
    	return (int) RESOLVE_SRGB_FORMAT_APPLIES_TRANSFER_FUNCTION_HANDLE.get(segment, 0L);
    }
    
    /// @see #resolveSrgbFormatSupportsTransferFunctionControl()
    public VkPhysicalDeviceMaintenance10PropertiesKHR resolveSrgbFormatSupportsTransferFunctionControl(int resolveSrgbFormatSupportsTransferFunctionControl) {
    	RESOLVE_SRGB_FORMAT_SUPPORTS_TRANSFER_FUNCTION_CONTROL_HANDLE.set(segment, 0L, resolveSrgbFormatSupportsTransferFunctionControl);
    	return this;
    }
    
    public int resolveSrgbFormatSupportsTransferFunctionControl() {
    	return (int) RESOLVE_SRGB_FORMAT_SUPPORTS_TRANSFER_FUNCTION_CONTROL_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance10PropertiesKHR set(VkPhysicalDeviceMaintenance10PropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance10PropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMaintenance10PropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance10PropertiesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance10PropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance10PropertiesKHR> array(SegmentAllocator allocator, VkPhysicalDeviceMaintenance10PropertiesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceMaintenance10PropertiesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance10PropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance10PropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance10PropertiesKHR(segment)
        );
    }

}