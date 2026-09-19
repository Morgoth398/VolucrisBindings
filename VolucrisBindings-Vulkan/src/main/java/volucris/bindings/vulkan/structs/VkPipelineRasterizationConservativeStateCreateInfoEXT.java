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

public final class VkPipelineRasterizationConservativeStateCreateInfoEXT
		implements Struct<VkPipelineRasterizationConservativeStateCreateInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle CONSERVATIVE_RASTERIZATION_MODE_HANDLE;
    public static final VarHandle EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long CONSERVATIVE_RASTERIZATION_MODE_BYTE_OFFSET;
    public static final long EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("conservativeRasterizationMode"),
            JAVA_FLOAT.withName("extraPrimitiveOverestimationSize"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPipelineRasterizationConservativeStateCreateInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        CONSERVATIVE_RASTERIZATION_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("conservativeRasterizationMode"));
        EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extraPrimitiveOverestimationSize"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        CONSERVATIVE_RASTERIZATION_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("conservativeRasterizationMode"));
        EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extraPrimitiveOverestimationSize"));
        //@formatter:on
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPipelineRasterizationConservativeStateCreateInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPipelineRasterizationConservativeStateCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPipelineRasterizationConservativeStateCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineRasterizationConservativeStateCreateInfoEXT pNext(MemorySegment pNext) {
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
    public VkPipelineRasterizationConservativeStateCreateInfoEXT flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #conservativeRasterizationMode()
    public VkPipelineRasterizationConservativeStateCreateInfoEXT conservativeRasterizationMode(int conservativeRasterizationMode) {
    	CONSERVATIVE_RASTERIZATION_MODE_HANDLE.set(segment, 0L, conservativeRasterizationMode);
    	return this;
    }
    
    public int conservativeRasterizationMode() {
    	return (int) CONSERVATIVE_RASTERIZATION_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extraPrimitiveOverestimationSize()
    public VkPipelineRasterizationConservativeStateCreateInfoEXT extraPrimitiveOverestimationSize(float extraPrimitiveOverestimationSize) {
    	EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_HANDLE.set(segment, 0L, extraPrimitiveOverestimationSize);
    	return this;
    }
    
    public float extraPrimitiveOverestimationSize() {
    	return (float) EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPipelineRasterizationConservativeStateCreateInfoEXT set(VkPipelineRasterizationConservativeStateCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineRasterizationConservativeStateCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineRasterizationConservativeStateCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineRasterizationConservativeStateCreateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineRasterizationConservativeStateCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineRasterizationConservativeStateCreateInfoEXT> array(Arena arena, VkPipelineRasterizationConservativeStateCreateInfoEXT... structs) {
        NativeStructArray<VkPipelineRasterizationConservativeStateCreateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineRasterizationConservativeStateCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineRasterizationConservativeStateCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineRasterizationConservativeStateCreateInfoEXT(segment)
        );
    }
    
}