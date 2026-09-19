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

public final class VkPhysicalDeviceShaderTileImageFeaturesEXT
		implements Struct<VkPhysicalDeviceShaderTileImageFeaturesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SHADER_TILE_IMAGE_COLOR_READ_ACCESS_HANDLE;
    public static final VarHandle SHADER_TILE_IMAGE_DEPTH_READ_ACCESS_HANDLE;
    public static final VarHandle SHADER_TILE_IMAGE_STENCIL_READ_ACCESS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SHADER_TILE_IMAGE_COLOR_READ_ACCESS_BYTE_OFFSET;
    public static final long SHADER_TILE_IMAGE_DEPTH_READ_ACCESS_BYTE_OFFSET;
    public static final long SHADER_TILE_IMAGE_STENCIL_READ_ACCESS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("shaderTileImageColorReadAccess"),
            JAVA_INT.withName("shaderTileImageDepthReadAccess"),
            JAVA_INT.withName("shaderTileImageStencilReadAccess"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceShaderTileImageFeaturesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SHADER_TILE_IMAGE_COLOR_READ_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderTileImageColorReadAccess"));
        SHADER_TILE_IMAGE_DEPTH_READ_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderTileImageDepthReadAccess"));
        SHADER_TILE_IMAGE_STENCIL_READ_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderTileImageStencilReadAccess"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SHADER_TILE_IMAGE_COLOR_READ_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageColorReadAccess"));
        SHADER_TILE_IMAGE_DEPTH_READ_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageDepthReadAccess"));
        SHADER_TILE_IMAGE_STENCIL_READ_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageStencilReadAccess"));
        //@formatter:on
    }

    public VkPhysicalDeviceShaderTileImageFeaturesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceShaderTileImageFeaturesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceShaderTileImageFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceShaderTileImageFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderTileImageFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderTileImageColorReadAccess()
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageColorReadAccess(int shaderTileImageColorReadAccess) {
    	SHADER_TILE_IMAGE_COLOR_READ_ACCESS_HANDLE.set(segment, 0L, shaderTileImageColorReadAccess);
    	return this;
    }
    
    public int shaderTileImageColorReadAccess() {
    	return (int) SHADER_TILE_IMAGE_COLOR_READ_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderTileImageDepthReadAccess()
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageDepthReadAccess(int shaderTileImageDepthReadAccess) {
    	SHADER_TILE_IMAGE_DEPTH_READ_ACCESS_HANDLE.set(segment, 0L, shaderTileImageDepthReadAccess);
    	return this;
    }
    
    public int shaderTileImageDepthReadAccess() {
    	return (int) SHADER_TILE_IMAGE_DEPTH_READ_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderTileImageStencilReadAccess()
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageStencilReadAccess(int shaderTileImageStencilReadAccess) {
    	SHADER_TILE_IMAGE_STENCIL_READ_ACCESS_HANDLE.set(segment, 0L, shaderTileImageStencilReadAccess);
    	return this;
    }
    
    public int shaderTileImageStencilReadAccess() {
    	return (int) SHADER_TILE_IMAGE_STENCIL_READ_ACCESS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderTileImageFeaturesEXT set(VkPhysicalDeviceShaderTileImageFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderTileImageFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderTileImageFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderTileImageFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderTileImageFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderTileImageFeaturesEXT> array(Arena arena, VkPhysicalDeviceShaderTileImageFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceShaderTileImageFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderTileImageFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderTileImageFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderTileImageFeaturesEXT(segment)
        );
    }
    
}