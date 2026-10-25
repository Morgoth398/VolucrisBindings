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

public final class VkPhysicalDeviceShaderTileImagePropertiesEXT
		implements Struct<VkPhysicalDeviceShaderTileImagePropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_TILE_IMAGE_COHERENT_READ_ACCELERATED_HANDLE;
	public static final VarHandle SHADER_TILE_IMAGE_READ_SAMPLE_FROM_PIXEL_RATE_INVOCATION_HANDLE;
	public static final VarHandle SHADER_TILE_IMAGE_READ_FROM_HELPER_INVOCATION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_TILE_IMAGE_COHERENT_READ_ACCELERATED_BYTE_OFFSET;
	public static final long SHADER_TILE_IMAGE_READ_SAMPLE_FROM_PIXEL_RATE_INVOCATION_BYTE_OFFSET;
	public static final long SHADER_TILE_IMAGE_READ_FROM_HELPER_INVOCATION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderTileImageCoherentReadAccelerated"),
		    JAVA_INT.withName("shaderTileImageReadSampleFromPixelRateInvocation"),
		    JAVA_INT.withName("shaderTileImageReadFromHelperInvocation"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceShaderTileImagePropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_TILE_IMAGE_COHERENT_READ_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderTileImageCoherentReadAccelerated"));
		SHADER_TILE_IMAGE_READ_SAMPLE_FROM_PIXEL_RATE_INVOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderTileImageReadSampleFromPixelRateInvocation"));
		SHADER_TILE_IMAGE_READ_FROM_HELPER_INVOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderTileImageReadFromHelperInvocation"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_TILE_IMAGE_COHERENT_READ_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageCoherentReadAccelerated"));
		SHADER_TILE_IMAGE_READ_SAMPLE_FROM_PIXEL_RATE_INVOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageReadSampleFromPixelRateInvocation"));
		SHADER_TILE_IMAGE_READ_FROM_HELPER_INVOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageReadFromHelperInvocation"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderTileImagePropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderTileImagePropertiesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderTileImagePropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderTileImagePropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderTileImagePropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderTileImageCoherentReadAccelerated()
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageCoherentReadAccelerated(int shaderTileImageCoherentReadAccelerated) {
    	SHADER_TILE_IMAGE_COHERENT_READ_ACCELERATED_HANDLE.set(segment, 0L, shaderTileImageCoherentReadAccelerated);
    	return this;
    }
    
    public int shaderTileImageCoherentReadAccelerated() {
    	return (int) SHADER_TILE_IMAGE_COHERENT_READ_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderTileImageReadSampleFromPixelRateInvocation()
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageReadSampleFromPixelRateInvocation(int shaderTileImageReadSampleFromPixelRateInvocation) {
    	SHADER_TILE_IMAGE_READ_SAMPLE_FROM_PIXEL_RATE_INVOCATION_HANDLE.set(segment, 0L, shaderTileImageReadSampleFromPixelRateInvocation);
    	return this;
    }
    
    public int shaderTileImageReadSampleFromPixelRateInvocation() {
    	return (int) SHADER_TILE_IMAGE_READ_SAMPLE_FROM_PIXEL_RATE_INVOCATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderTileImageReadFromHelperInvocation()
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageReadFromHelperInvocation(int shaderTileImageReadFromHelperInvocation) {
    	SHADER_TILE_IMAGE_READ_FROM_HELPER_INVOCATION_HANDLE.set(segment, 0L, shaderTileImageReadFromHelperInvocation);
    	return this;
    }
    
    public int shaderTileImageReadFromHelperInvocation() {
    	return (int) SHADER_TILE_IMAGE_READ_FROM_HELPER_INVOCATION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderTileImagePropertiesEXT set(VkPhysicalDeviceShaderTileImagePropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderTileImagePropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderTileImagePropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderTileImagePropertiesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderTileImagePropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderTileImagePropertiesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceShaderTileImagePropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceShaderTileImagePropertiesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderTileImagePropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderTileImagePropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderTileImagePropertiesEXT(segment)
        );
    }

}