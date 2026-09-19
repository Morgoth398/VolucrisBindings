/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.unions;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.structs.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkResourceDescriptorDataEXT
		implements Struct<VkResourceDescriptorDataEXT> {

    public static final UnionLayout LAYOUT;

    public static final VarHandle P_IMAGE_HANDLE;
    public static final VarHandle P_TEXEL_BUFFER_HANDLE;
    public static final VarHandle P_ADDRESS_RANGE_HANDLE;
    public static final VarHandle P_TENSOR_ARM_HANDLE;

    public static final long P_IMAGE_BYTE_OFFSET;
    public static final long P_TEXEL_BUFFER_BYTE_OFFSET;
    public static final long P_ADDRESS_RANGE_BYTE_OFFSET;
    public static final long P_TENSOR_ARM_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.unionLayout(
            UNBOUNDED_ADDRESS.withName("pImage"),
            UNBOUNDED_ADDRESS.withName("pTexelBuffer"),
            UNBOUNDED_ADDRESS.withName("pAddressRange"),
            UNBOUNDED_ADDRESS.withName("pTensorARM")
        ).withName("VkResourceDescriptorDataEXT").withByteAlignment(8);
        
        P_IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pImage"));
        P_TEXEL_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTexelBuffer"));
        P_ADDRESS_RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pAddressRange"));
        P_TENSOR_ARM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTensorARM"));
        
        P_IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pImage"));
        P_TEXEL_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTexelBuffer"));
        P_ADDRESS_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pAddressRange"));
        P_TENSOR_ARM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTensorARM"));
        //@formatter:on
    }

    public VkResourceDescriptorDataEXT() {
        this(Arena.ofAuto());
    }
    
    public VkResourceDescriptorDataEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkResourceDescriptorDataEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #pImage()
    public VkResourceDescriptorDataEXT pImage(VkImageDescriptorInfoEXT pImage) {
    	P_IMAGE_HANDLE.set(segment, 0L, pImage.memorySegment());
    	return this;
    }
    
    public @Nullable VkImageDescriptorInfoEXT pImage() {
    	MemorySegment segment = (MemorySegment) P_IMAGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImageDescriptorInfoEXT(segment);
    }
    
    /// @see #pTexelBuffer()
    public VkResourceDescriptorDataEXT pTexelBuffer(VkTexelBufferDescriptorInfoEXT pTexelBuffer) {
    	P_TEXEL_BUFFER_HANDLE.set(segment, 0L, pTexelBuffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkTexelBufferDescriptorInfoEXT pTexelBuffer() {
    	MemorySegment segment = (MemorySegment) P_TEXEL_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkTexelBufferDescriptorInfoEXT(segment);
    }
    
    /// @see #pAddressRange()
    public VkResourceDescriptorDataEXT pAddressRange(VkDeviceAddressRangeKHR pAddressRange) {
    	P_ADDRESS_RANGE_HANDLE.set(segment, 0L, pAddressRange.memorySegment());
    	return this;
    }
    
    public @Nullable VkDeviceAddressRangeKHR pAddressRange() {
    	MemorySegment segment = (MemorySegment) P_ADDRESS_RANGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDeviceAddressRangeKHR(segment);
    }
    
    /// @see #pTensorARM()
    public VkResourceDescriptorDataEXT pTensorARM(VkTensorViewCreateInfoARM pTensorARM) {
    	P_TENSOR_ARM_HANDLE.set(segment, 0L, pTensorARM.memorySegment());
    	return this;
    }
    
    public @Nullable VkTensorViewCreateInfoARM pTensorARM() {
    	MemorySegment segment = (MemorySegment) P_TENSOR_ARM_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkTensorViewCreateInfoARM(segment);
    }
    
    @Override
    public VkResourceDescriptorDataEXT set(VkResourceDescriptorDataEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkResourceDescriptorDataEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkResourceDescriptorDataEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkResourceDescriptorDataEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkResourceDescriptorDataEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkResourceDescriptorDataEXT> array(Arena arena, VkResourceDescriptorDataEXT... structs) {
        NativeStructArray<VkResourceDescriptorDataEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkResourceDescriptorDataEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkResourceDescriptorDataEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkResourceDescriptorDataEXT(segment)
        );
    }
    
}