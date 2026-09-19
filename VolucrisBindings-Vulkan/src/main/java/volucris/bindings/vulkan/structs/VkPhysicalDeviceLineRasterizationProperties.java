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

public final class VkPhysicalDeviceLineRasterizationProperties
		implements Struct<VkPhysicalDeviceLineRasterizationProperties> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle LINE_SUB_PIXEL_PRECISION_BITS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long LINE_SUB_PIXEL_PRECISION_BITS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("lineSubPixelPrecisionBits"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceLineRasterizationProperties").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        LINE_SUB_PIXEL_PRECISION_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lineSubPixelPrecisionBits"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        LINE_SUB_PIXEL_PRECISION_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lineSubPixelPrecisionBits"));
        //@formatter:on
    }

    public VkPhysicalDeviceLineRasterizationProperties() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceLineRasterizationProperties(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceLineRasterizationProperties(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceLineRasterizationProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceLineRasterizationProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #lineSubPixelPrecisionBits()
    public VkPhysicalDeviceLineRasterizationProperties lineSubPixelPrecisionBits(int lineSubPixelPrecisionBits) {
    	LINE_SUB_PIXEL_PRECISION_BITS_HANDLE.set(segment, 0L, lineSubPixelPrecisionBits);
    	return this;
    }
    
    public int lineSubPixelPrecisionBits() {
    	return (int) LINE_SUB_PIXEL_PRECISION_BITS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceLineRasterizationProperties set(VkPhysicalDeviceLineRasterizationProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceLineRasterizationProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceLineRasterizationProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceLineRasterizationProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceLineRasterizationProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceLineRasterizationProperties> array(Arena arena, VkPhysicalDeviceLineRasterizationProperties... structs) {
        NativeStructArray<VkPhysicalDeviceLineRasterizationProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceLineRasterizationProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceLineRasterizationProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceLineRasterizationProperties(segment)
        );
    }
    
}