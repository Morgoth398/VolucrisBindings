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

public final class VkPipelineViewportDepthClampControlCreateInfoEXT
		implements Struct<VkPipelineViewportDepthClampControlCreateInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle DEPTH_CLAMP_MODE_HANDLE;
    public static final VarHandle P_DEPTH_CLAMP_RANGE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long DEPTH_CLAMP_MODE_BYTE_OFFSET;
    public static final long P_DEPTH_CLAMP_RANGE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("depthClampMode"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pDepthClampRange")
        ).withName("VkPipelineViewportDepthClampControlCreateInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        DEPTH_CLAMP_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthClampMode"));
        P_DEPTH_CLAMP_RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDepthClampRange"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        DEPTH_CLAMP_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthClampMode"));
        P_DEPTH_CLAMP_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDepthClampRange"));
        //@formatter:on
    }

    public VkPipelineViewportDepthClampControlCreateInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPipelineViewportDepthClampControlCreateInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPipelineViewportDepthClampControlCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPipelineViewportDepthClampControlCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineViewportDepthClampControlCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #depthClampMode()
    public VkPipelineViewportDepthClampControlCreateInfoEXT depthClampMode(int depthClampMode) {
    	DEPTH_CLAMP_MODE_HANDLE.set(segment, 0L, depthClampMode);
    	return this;
    }
    
    public int depthClampMode() {
    	return (int) DEPTH_CLAMP_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDepthClampRange()
    public VkPipelineViewportDepthClampControlCreateInfoEXT pDepthClampRange(VkDepthClampRangeEXT pDepthClampRange) {
    	P_DEPTH_CLAMP_RANGE_HANDLE.set(segment, 0L, pDepthClampRange.memorySegment());
    	return this;
    }
    
    public @Nullable VkDepthClampRangeEXT pDepthClampRange() {
    	MemorySegment segment = (MemorySegment) P_DEPTH_CLAMP_RANGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDepthClampRangeEXT(segment);
    }
    
    @Override
    public VkPipelineViewportDepthClampControlCreateInfoEXT set(VkPipelineViewportDepthClampControlCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineViewportDepthClampControlCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineViewportDepthClampControlCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineViewportDepthClampControlCreateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineViewportDepthClampControlCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineViewportDepthClampControlCreateInfoEXT> array(Arena arena, VkPipelineViewportDepthClampControlCreateInfoEXT... structs) {
        NativeStructArray<VkPipelineViewportDepthClampControlCreateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineViewportDepthClampControlCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineViewportDepthClampControlCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineViewportDepthClampControlCreateInfoEXT(segment)
        );
    }
    
}