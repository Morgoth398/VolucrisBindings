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

public final class VkPipelineRasterizationDepthClipStateCreateInfoEXT
		implements Struct<VkPipelineRasterizationDepthClipStateCreateInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle DEPTH_CLIP_ENABLE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long DEPTH_CLIP_ENABLE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("depthClipEnable")
        ).withName("VkPipelineRasterizationDepthClipStateCreateInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        DEPTH_CLIP_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthClipEnable"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        DEPTH_CLIP_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthClipEnable"));
        //@formatter:on
    }

    public VkPipelineRasterizationDepthClipStateCreateInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthClipEnable()
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT depthClipEnable(int depthClipEnable) {
    	DEPTH_CLIP_ENABLE_HANDLE.set(segment, 0L, depthClipEnable);
    	return this;
    }
    
    public int depthClipEnable() {
    	return (int) DEPTH_CLIP_ENABLE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT set(VkPipelineRasterizationDepthClipStateCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineRasterizationDepthClipStateCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineRasterizationDepthClipStateCreateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineRasterizationDepthClipStateCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineRasterizationDepthClipStateCreateInfoEXT> array(Arena arena, VkPipelineRasterizationDepthClipStateCreateInfoEXT... structs) {
        NativeStructArray<VkPipelineRasterizationDepthClipStateCreateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineRasterizationDepthClipStateCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineRasterizationDepthClipStateCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineRasterizationDepthClipStateCreateInfoEXT(segment)
        );
    }
    
}