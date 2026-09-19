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

public final class VkPhysicalDeviceShaderImageFootprintFeaturesNV
		implements Struct<VkPhysicalDeviceShaderImageFootprintFeaturesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle IMAGE_FOOTPRINT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long IMAGE_FOOTPRINT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("imageFootprint"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceShaderImageFootprintFeaturesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        IMAGE_FOOTPRINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageFootprint"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        IMAGE_FOOTPRINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageFootprint"));
        //@formatter:on
    }

    public VkPhysicalDeviceShaderImageFootprintFeaturesNV() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #imageFootprint()
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV imageFootprint(int imageFootprint) {
    	IMAGE_FOOTPRINT_HANDLE.set(segment, 0L, imageFootprint);
    	return this;
    }
    
    public int imageFootprint() {
    	return (int) IMAGE_FOOTPRINT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV set(VkPhysicalDeviceShaderImageFootprintFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderImageFootprintFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderImageFootprintFeaturesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderImageFootprintFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderImageFootprintFeaturesNV> array(Arena arena, VkPhysicalDeviceShaderImageFootprintFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceShaderImageFootprintFeaturesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderImageFootprintFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderImageFootprintFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderImageFootprintFeaturesNV(segment)
        );
    }
    
}