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

public final class VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV
		implements Struct<VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_FRAGMENT_SHADING_RATE_INVOCATION_COUNT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_FRAGMENT_SHADING_RATE_INVOCATION_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxFragmentShadingRateInvocationCount"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_FRAGMENT_SHADING_RATE_INVOCATION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFragmentShadingRateInvocationCount"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_FRAGMENT_SHADING_RATE_INVOCATION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentShadingRateInvocationCount"));
        //@formatter:on
    }

    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxFragmentShadingRateInvocationCount()
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV maxFragmentShadingRateInvocationCount(int maxFragmentShadingRateInvocationCount) {
    	MAX_FRAGMENT_SHADING_RATE_INVOCATION_COUNT_HANDLE.set(segment, 0L, maxFragmentShadingRateInvocationCount);
    	return this;
    }
    
    public int maxFragmentShadingRateInvocationCount() {
    	return (int) MAX_FRAGMENT_SHADING_RATE_INVOCATION_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV set(VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV> array(Arena arena, VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV... structs) {
        NativeStructArray<VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(segment)
        );
    }
    
}