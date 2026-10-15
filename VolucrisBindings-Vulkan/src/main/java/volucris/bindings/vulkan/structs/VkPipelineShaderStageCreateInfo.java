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

public final class VkPipelineShaderStageCreateInfo
		implements Struct<VkPipelineShaderStageCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle STAGE_HANDLE;
	public static final VarHandle MODULE_HANDLE;
	public static final VarHandle P_NAME_HANDLE;
	public static final VarHandle P_SPECIALIZATION_INFO_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long STAGE_BYTE_OFFSET;
	public static final long MODULE_BYTE_OFFSET;
	public static final long P_NAME_BYTE_OFFSET;
	public static final long P_SPECIALIZATION_INFO_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("stage"),
		    UNBOUNDED_ADDRESS.withName("module"),
		    UNBOUNDED_ADDRESS.withName("pName"),
		    UNBOUNDED_ADDRESS.withName("pSpecializationInfo")
		).withName("VkPipelineShaderStageCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		STAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stage"));
		MODULE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("module"));
		P_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pName"));
		P_SPECIALIZATION_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSpecializationInfo"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		STAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stage"));
		MODULE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("module"));
		P_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pName"));
		P_SPECIALIZATION_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSpecializationInfo"));
		//@formatter:on
	}

	public VkPipelineShaderStageCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineShaderStageCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineShaderStageCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineShaderStageCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineShaderStageCreateInfo pNext(MemorySegment pNext) {
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
    public VkPipelineShaderStageCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #stage()
    public VkPipelineShaderStageCreateInfo stage(int stage) {
    	STAGE_HANDLE.set(segment, 0L, stage);
    	return this;
    }
    
    public int stage() {
    	return (int) STAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #module()
    public VkPipelineShaderStageCreateInfo module(VkShaderModule module) {
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
    public VkPipelineShaderStageCreateInfo pName(Arena arena, String pName) {
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
    public VkPipelineShaderStageCreateInfo pSpecializationInfo(VkSpecializationInfo pSpecializationInfo) {
    	P_SPECIALIZATION_INFO_HANDLE.set(segment, 0L, pSpecializationInfo.memorySegment());
    	return this;
    }
    
    public @Nullable VkSpecializationInfo pSpecializationInfo() {
    	MemorySegment segment = (MemorySegment) P_SPECIALIZATION_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkSpecializationInfo(segment);
    }
    
    @Override
    public VkPipelineShaderStageCreateInfo set(VkPipelineShaderStageCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineShaderStageCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineShaderStageCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineShaderStageCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineShaderStageCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineShaderStageCreateInfo> array(Arena arena, VkPipelineShaderStageCreateInfo... structs) {
        NativeStructArray<VkPipelineShaderStageCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineShaderStageCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineShaderStageCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineShaderStageCreateInfo(segment)
        );
    }

}