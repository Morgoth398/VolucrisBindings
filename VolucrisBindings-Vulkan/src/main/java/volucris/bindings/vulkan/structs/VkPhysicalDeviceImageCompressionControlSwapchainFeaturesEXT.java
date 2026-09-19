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

public final class VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT
		implements Struct<VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("imageCompressionControlSwapchain"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageCompressionControlSwapchain"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageCompressionControlSwapchain"));
        //@formatter:on
    }

    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #imageCompressionControlSwapchain()
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT imageCompressionControlSwapchain(int imageCompressionControlSwapchain) {
    	IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_HANDLE.set(segment, 0L, imageCompressionControlSwapchain);
    	return this;
    }
    
    public int imageCompressionControlSwapchain() {
    	return (int) IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT set(VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT> array(Arena arena, VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(segment)
        );
    }
    
}