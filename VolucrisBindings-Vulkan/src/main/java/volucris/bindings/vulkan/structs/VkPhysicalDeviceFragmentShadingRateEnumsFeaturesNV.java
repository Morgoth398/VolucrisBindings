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

public final class VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV
		implements Struct<VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FRAGMENT_SHADING_RATE_ENUMS_HANDLE;
	public static final VarHandle SUPERSAMPLE_FRAGMENT_SHADING_RATES_HANDLE;
	public static final VarHandle NO_INVOCATION_FRAGMENT_SHADING_RATES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FRAGMENT_SHADING_RATE_ENUMS_BYTE_OFFSET;
	public static final long SUPERSAMPLE_FRAGMENT_SHADING_RATES_BYTE_OFFSET;
	public static final long NO_INVOCATION_FRAGMENT_SHADING_RATES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("fragmentShadingRateEnums"),
		    JAVA_INT.withName("supersampleFragmentShadingRates"),
		    JAVA_INT.withName("noInvocationFragmentShadingRates"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FRAGMENT_SHADING_RATE_ENUMS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentShadingRateEnums"));
		SUPERSAMPLE_FRAGMENT_SHADING_RATES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supersampleFragmentShadingRates"));
		NO_INVOCATION_FRAGMENT_SHADING_RATES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noInvocationFragmentShadingRates"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FRAGMENT_SHADING_RATE_ENUMS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateEnums"));
		SUPERSAMPLE_FRAGMENT_SHADING_RATES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supersampleFragmentShadingRates"));
		NO_INVOCATION_FRAGMENT_SHADING_RATES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noInvocationFragmentShadingRates"));
		//@formatter:on
	}

	public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #fragmentShadingRateEnums()
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV fragmentShadingRateEnums(int fragmentShadingRateEnums) {
    	FRAGMENT_SHADING_RATE_ENUMS_HANDLE.set(segment, 0L, fragmentShadingRateEnums);
    	return this;
    }
    
    public int fragmentShadingRateEnums() {
    	return (int) FRAGMENT_SHADING_RATE_ENUMS_HANDLE.get(segment, 0L);
    }
    
    /// @see #supersampleFragmentShadingRates()
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV supersampleFragmentShadingRates(int supersampleFragmentShadingRates) {
    	SUPERSAMPLE_FRAGMENT_SHADING_RATES_HANDLE.set(segment, 0L, supersampleFragmentShadingRates);
    	return this;
    }
    
    public int supersampleFragmentShadingRates() {
    	return (int) SUPERSAMPLE_FRAGMENT_SHADING_RATES_HANDLE.get(segment, 0L);
    }
    
    /// @see #noInvocationFragmentShadingRates()
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV noInvocationFragmentShadingRates(int noInvocationFragmentShadingRates) {
    	NO_INVOCATION_FRAGMENT_SHADING_RATES_HANDLE.set(segment, 0L, noInvocationFragmentShadingRates);
    	return this;
    }
    
    public int noInvocationFragmentShadingRates() {
    	return (int) NO_INVOCATION_FRAGMENT_SHADING_RATES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV set(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV> array(SegmentAllocator allocator, VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(segment)
        );
    }

}