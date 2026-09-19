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

public final class VkDataGraphPipelineShaderModuleCreateInfoARM
		implements Struct<VkDataGraphPipelineShaderModuleCreateInfoARM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MODULE_HANDLE;
    public static final VarHandle P_NAME_HANDLE;
    public static final VarHandle P_SPECIALIZATION_INFO_HANDLE;
    public static final VarHandle CONSTANT_COUNT_HANDLE;
    public static final VarHandle P_CONSTANTS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MODULE_BYTE_OFFSET;
    public static final long P_NAME_BYTE_OFFSET;
    public static final long P_SPECIALIZATION_INFO_BYTE_OFFSET;
    public static final long CONSTANT_COUNT_BYTE_OFFSET;
    public static final long P_CONSTANTS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("module"),
            UNBOUNDED_ADDRESS.withName("pName"),
            UNBOUNDED_ADDRESS.withName("pSpecializationInfo"),
            JAVA_INT.withName("constantCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pConstants")
        ).withName("VkDataGraphPipelineShaderModuleCreateInfoARM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MODULE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("module"));
        P_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pName"));
        P_SPECIALIZATION_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSpecializationInfo"));
        CONSTANT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("constantCount"));
        P_CONSTANTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pConstants"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MODULE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("module"));
        P_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pName"));
        P_SPECIALIZATION_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSpecializationInfo"));
        CONSTANT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("constantCount"));
        P_CONSTANTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pConstants"));
        //@formatter:on
    }

    public VkDataGraphPipelineShaderModuleCreateInfoARM() {
        this(Arena.ofAuto());
    }
    
    public VkDataGraphPipelineShaderModuleCreateInfoARM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDataGraphPipelineShaderModuleCreateInfoARM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDataGraphPipelineShaderModuleCreateInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDataGraphPipelineShaderModuleCreateInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #module()
    public VkDataGraphPipelineShaderModuleCreateInfoARM module(VkShaderModule module) {
    	MODULE_HANDLE.set(segment, 0L, module.memorySegment());
    	return this;
    }
    
    public @Nullable VkShaderModule module() {
    	MemorySegment segment = (MemorySegment) MODULE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkShaderModule(segment);
    }
    
    /// @see #pName()
    public VkDataGraphPipelineShaderModuleCreateInfoARM pName(Arena arena, String pName) {
    	P_NAME_HANDLE.set(segment, 0L, arena.allocateFrom(pName));
    	return this;
    }
    
    public @Nullable String pName() {
    	MemorySegment segment = (MemorySegment) P_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// @see #pSpecializationInfo()
    public VkDataGraphPipelineShaderModuleCreateInfoARM pSpecializationInfo(VkSpecializationInfo pSpecializationInfo) {
    	P_SPECIALIZATION_INFO_HANDLE.set(segment, 0L, pSpecializationInfo.memorySegment());
    	return this;
    }
    
    public @Nullable VkSpecializationInfo pSpecializationInfo() {
    	MemorySegment segment = (MemorySegment) P_SPECIALIZATION_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkSpecializationInfo(segment);
    }
    
    /// @see #constantCount()
    public VkDataGraphPipelineShaderModuleCreateInfoARM constantCount(int constantCount) {
    	CONSTANT_COUNT_HANDLE.set(segment, 0L, constantCount);
    	return this;
    }
    
    public int constantCount() {
    	return (int) CONSTANT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pConstants()
    public VkDataGraphPipelineShaderModuleCreateInfoARM pConstants(NativeStructArray<VkDataGraphPipelineConstantARM> pConstants) {
    	P_CONSTANTS_HANDLE.set(segment, 0L, pConstants.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDataGraphPipelineConstantARM> pConstants() {
    	MemorySegment segment = (MemorySegment) P_CONSTANTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDataGraphPipelineConstantARM.array(segment);
    }
    
    @Override
    public VkDataGraphPipelineShaderModuleCreateInfoARM set(VkDataGraphPipelineShaderModuleCreateInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphPipelineShaderModuleCreateInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphPipelineShaderModuleCreateInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphPipelineShaderModuleCreateInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineShaderModuleCreateInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphPipelineShaderModuleCreateInfoARM> array(Arena arena, VkDataGraphPipelineShaderModuleCreateInfoARM... structs) {
        NativeStructArray<VkDataGraphPipelineShaderModuleCreateInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineShaderModuleCreateInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphPipelineShaderModuleCreateInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphPipelineShaderModuleCreateInfoARM(segment)
        );
    }
    
}