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

public final class VkPhysicalDeviceTileShadingFeaturesQCOM
		implements Struct<VkPhysicalDeviceTileShadingFeaturesQCOM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle TILE_SHADING_HANDLE;
    public static final VarHandle TILE_SHADING_FRAGMENT_STAGE_HANDLE;
    public static final VarHandle TILE_SHADING_COLOR_ATTACHMENTS_HANDLE;
    public static final VarHandle TILE_SHADING_DEPTH_ATTACHMENTS_HANDLE;
    public static final VarHandle TILE_SHADING_STENCIL_ATTACHMENTS_HANDLE;
    public static final VarHandle TILE_SHADING_INPUT_ATTACHMENTS_HANDLE;
    public static final VarHandle TILE_SHADING_SAMPLED_ATTACHMENTS_HANDLE;
    public static final VarHandle TILE_SHADING_PER_TILE_DRAW_HANDLE;
    public static final VarHandle TILE_SHADING_PER_TILE_DISPATCH_HANDLE;
    public static final VarHandle TILE_SHADING_DISPATCH_TILE_HANDLE;
    public static final VarHandle TILE_SHADING_APRON_HANDLE;
    public static final VarHandle TILE_SHADING_ANISOTROPIC_APRON_HANDLE;
    public static final VarHandle TILE_SHADING_ATOMIC_OPS_HANDLE;
    public static final VarHandle TILE_SHADING_IMAGE_PROCESSING_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long TILE_SHADING_BYTE_OFFSET;
    public static final long TILE_SHADING_FRAGMENT_STAGE_BYTE_OFFSET;
    public static final long TILE_SHADING_COLOR_ATTACHMENTS_BYTE_OFFSET;
    public static final long TILE_SHADING_DEPTH_ATTACHMENTS_BYTE_OFFSET;
    public static final long TILE_SHADING_STENCIL_ATTACHMENTS_BYTE_OFFSET;
    public static final long TILE_SHADING_INPUT_ATTACHMENTS_BYTE_OFFSET;
    public static final long TILE_SHADING_SAMPLED_ATTACHMENTS_BYTE_OFFSET;
    public static final long TILE_SHADING_PER_TILE_DRAW_BYTE_OFFSET;
    public static final long TILE_SHADING_PER_TILE_DISPATCH_BYTE_OFFSET;
    public static final long TILE_SHADING_DISPATCH_TILE_BYTE_OFFSET;
    public static final long TILE_SHADING_APRON_BYTE_OFFSET;
    public static final long TILE_SHADING_ANISOTROPIC_APRON_BYTE_OFFSET;
    public static final long TILE_SHADING_ATOMIC_OPS_BYTE_OFFSET;
    public static final long TILE_SHADING_IMAGE_PROCESSING_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("tileShading"),
            JAVA_INT.withName("tileShadingFragmentStage"),
            JAVA_INT.withName("tileShadingColorAttachments"),
            JAVA_INT.withName("tileShadingDepthAttachments"),
            JAVA_INT.withName("tileShadingStencilAttachments"),
            JAVA_INT.withName("tileShadingInputAttachments"),
            JAVA_INT.withName("tileShadingSampledAttachments"),
            JAVA_INT.withName("tileShadingPerTileDraw"),
            JAVA_INT.withName("tileShadingPerTileDispatch"),
            JAVA_INT.withName("tileShadingDispatchTile"),
            JAVA_INT.withName("tileShadingApron"),
            JAVA_INT.withName("tileShadingAnisotropicApron"),
            JAVA_INT.withName("tileShadingAtomicOps"),
            JAVA_INT.withName("tileShadingImageProcessing")
        ).withName("VkPhysicalDeviceTileShadingFeaturesQCOM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        TILE_SHADING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tileShading"));
        TILE_SHADING_FRAGMENT_STAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tileShadingFragmentStage"));
        TILE_SHADING_COLOR_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tileShadingColorAttachments"));
        TILE_SHADING_DEPTH_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tileShadingDepthAttachments"));
        TILE_SHADING_STENCIL_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tileShadingStencilAttachments"));
        TILE_SHADING_INPUT_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tileShadingInputAttachments"));
        TILE_SHADING_SAMPLED_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tileShadingSampledAttachments"));
        TILE_SHADING_PER_TILE_DRAW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tileShadingPerTileDraw"));
        TILE_SHADING_PER_TILE_DISPATCH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tileShadingPerTileDispatch"));
        TILE_SHADING_DISPATCH_TILE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tileShadingDispatchTile"));
        TILE_SHADING_APRON_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tileShadingApron"));
        TILE_SHADING_ANISOTROPIC_APRON_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tileShadingAnisotropicApron"));
        TILE_SHADING_ATOMIC_OPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tileShadingAtomicOps"));
        TILE_SHADING_IMAGE_PROCESSING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tileShadingImageProcessing"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        TILE_SHADING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileShading"));
        TILE_SHADING_FRAGMENT_STAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileShadingFragmentStage"));
        TILE_SHADING_COLOR_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileShadingColorAttachments"));
        TILE_SHADING_DEPTH_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileShadingDepthAttachments"));
        TILE_SHADING_STENCIL_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileShadingStencilAttachments"));
        TILE_SHADING_INPUT_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileShadingInputAttachments"));
        TILE_SHADING_SAMPLED_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileShadingSampledAttachments"));
        TILE_SHADING_PER_TILE_DRAW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileShadingPerTileDraw"));
        TILE_SHADING_PER_TILE_DISPATCH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileShadingPerTileDispatch"));
        TILE_SHADING_DISPATCH_TILE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileShadingDispatchTile"));
        TILE_SHADING_APRON_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileShadingApron"));
        TILE_SHADING_ANISOTROPIC_APRON_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileShadingAnisotropicApron"));
        TILE_SHADING_ATOMIC_OPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileShadingAtomicOps"));
        TILE_SHADING_IMAGE_PROCESSING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileShadingImageProcessing"));
        //@formatter:on
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceTileShadingFeaturesQCOM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceTileShadingFeaturesQCOM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceTileShadingFeaturesQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceTileShadingFeaturesQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #tileShading()
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShading(int tileShading) {
    	TILE_SHADING_HANDLE.set(segment, 0L, tileShading);
    	return this;
    }
    
    public int tileShading() {
    	return (int) TILE_SHADING_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileShadingFragmentStage()
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingFragmentStage(int tileShadingFragmentStage) {
    	TILE_SHADING_FRAGMENT_STAGE_HANDLE.set(segment, 0L, tileShadingFragmentStage);
    	return this;
    }
    
    public int tileShadingFragmentStage() {
    	return (int) TILE_SHADING_FRAGMENT_STAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileShadingColorAttachments()
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingColorAttachments(int tileShadingColorAttachments) {
    	TILE_SHADING_COLOR_ATTACHMENTS_HANDLE.set(segment, 0L, tileShadingColorAttachments);
    	return this;
    }
    
    public int tileShadingColorAttachments() {
    	return (int) TILE_SHADING_COLOR_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileShadingDepthAttachments()
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingDepthAttachments(int tileShadingDepthAttachments) {
    	TILE_SHADING_DEPTH_ATTACHMENTS_HANDLE.set(segment, 0L, tileShadingDepthAttachments);
    	return this;
    }
    
    public int tileShadingDepthAttachments() {
    	return (int) TILE_SHADING_DEPTH_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileShadingStencilAttachments()
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingStencilAttachments(int tileShadingStencilAttachments) {
    	TILE_SHADING_STENCIL_ATTACHMENTS_HANDLE.set(segment, 0L, tileShadingStencilAttachments);
    	return this;
    }
    
    public int tileShadingStencilAttachments() {
    	return (int) TILE_SHADING_STENCIL_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileShadingInputAttachments()
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingInputAttachments(int tileShadingInputAttachments) {
    	TILE_SHADING_INPUT_ATTACHMENTS_HANDLE.set(segment, 0L, tileShadingInputAttachments);
    	return this;
    }
    
    public int tileShadingInputAttachments() {
    	return (int) TILE_SHADING_INPUT_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileShadingSampledAttachments()
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingSampledAttachments(int tileShadingSampledAttachments) {
    	TILE_SHADING_SAMPLED_ATTACHMENTS_HANDLE.set(segment, 0L, tileShadingSampledAttachments);
    	return this;
    }
    
    public int tileShadingSampledAttachments() {
    	return (int) TILE_SHADING_SAMPLED_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileShadingPerTileDraw()
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingPerTileDraw(int tileShadingPerTileDraw) {
    	TILE_SHADING_PER_TILE_DRAW_HANDLE.set(segment, 0L, tileShadingPerTileDraw);
    	return this;
    }
    
    public int tileShadingPerTileDraw() {
    	return (int) TILE_SHADING_PER_TILE_DRAW_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileShadingPerTileDispatch()
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingPerTileDispatch(int tileShadingPerTileDispatch) {
    	TILE_SHADING_PER_TILE_DISPATCH_HANDLE.set(segment, 0L, tileShadingPerTileDispatch);
    	return this;
    }
    
    public int tileShadingPerTileDispatch() {
    	return (int) TILE_SHADING_PER_TILE_DISPATCH_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileShadingDispatchTile()
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingDispatchTile(int tileShadingDispatchTile) {
    	TILE_SHADING_DISPATCH_TILE_HANDLE.set(segment, 0L, tileShadingDispatchTile);
    	return this;
    }
    
    public int tileShadingDispatchTile() {
    	return (int) TILE_SHADING_DISPATCH_TILE_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileShadingApron()
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingApron(int tileShadingApron) {
    	TILE_SHADING_APRON_HANDLE.set(segment, 0L, tileShadingApron);
    	return this;
    }
    
    public int tileShadingApron() {
    	return (int) TILE_SHADING_APRON_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileShadingAnisotropicApron()
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingAnisotropicApron(int tileShadingAnisotropicApron) {
    	TILE_SHADING_ANISOTROPIC_APRON_HANDLE.set(segment, 0L, tileShadingAnisotropicApron);
    	return this;
    }
    
    public int tileShadingAnisotropicApron() {
    	return (int) TILE_SHADING_ANISOTROPIC_APRON_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileShadingAtomicOps()
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingAtomicOps(int tileShadingAtomicOps) {
    	TILE_SHADING_ATOMIC_OPS_HANDLE.set(segment, 0L, tileShadingAtomicOps);
    	return this;
    }
    
    public int tileShadingAtomicOps() {
    	return (int) TILE_SHADING_ATOMIC_OPS_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileShadingImageProcessing()
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingImageProcessing(int tileShadingImageProcessing) {
    	TILE_SHADING_IMAGE_PROCESSING_HANDLE.set(segment, 0L, tileShadingImageProcessing);
    	return this;
    }
    
    public int tileShadingImageProcessing() {
    	return (int) TILE_SHADING_IMAGE_PROCESSING_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceTileShadingFeaturesQCOM set(VkPhysicalDeviceTileShadingFeaturesQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceTileShadingFeaturesQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceTileShadingFeaturesQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceTileShadingFeaturesQCOM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceTileShadingFeaturesQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceTileShadingFeaturesQCOM> array(Arena arena, VkPhysicalDeviceTileShadingFeaturesQCOM... structs) {
        NativeStructArray<VkPhysicalDeviceTileShadingFeaturesQCOM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceTileShadingFeaturesQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceTileShadingFeaturesQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceTileShadingFeaturesQCOM(segment)
        );
    }
    
}