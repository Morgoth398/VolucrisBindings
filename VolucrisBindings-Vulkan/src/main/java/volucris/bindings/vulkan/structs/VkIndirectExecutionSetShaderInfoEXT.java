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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkIndirectExecutionSetShaderInfoEXT
		implements Struct<VkIndirectExecutionSetShaderInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_COUNT_HANDLE;
	public static final VarHandle P_INITIAL_SHADERS_HANDLE;
	public static final VarHandle P_SET_LAYOUT_INFOS_HANDLE;
	public static final VarHandle MAX_SHADER_COUNT_HANDLE;
	public static final VarHandle PUSH_CONSTANT_RANGE_COUNT_HANDLE;
	public static final VarHandle P_PUSH_CONSTANT_RANGES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_COUNT_BYTE_OFFSET;
	public static final long P_INITIAL_SHADERS_BYTE_OFFSET;
	public static final long P_SET_LAYOUT_INFOS_BYTE_OFFSET;
	public static final long MAX_SHADER_COUNT_BYTE_OFFSET;
	public static final long PUSH_CONSTANT_RANGE_COUNT_BYTE_OFFSET;
	public static final long P_PUSH_CONSTANT_RANGES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pInitialShaders"),
		    UNBOUNDED_ADDRESS.withName("pSetLayoutInfos"),
		    JAVA_INT.withName("maxShaderCount"),
		    JAVA_INT.withName("pushConstantRangeCount"),
		    UNBOUNDED_ADDRESS.withName("pPushConstantRanges")
		).withName("VkIndirectExecutionSetShaderInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderCount"));
		P_INITIAL_SHADERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInitialShaders"));
		P_SET_LAYOUT_INFOS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSetLayoutInfos"));
		MAX_SHADER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxShaderCount"));
		PUSH_CONSTANT_RANGE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushConstantRangeCount"));
		P_PUSH_CONSTANT_RANGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPushConstantRanges"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderCount"));
		P_INITIAL_SHADERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInitialShaders"));
		P_SET_LAYOUT_INFOS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSetLayoutInfos"));
		MAX_SHADER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxShaderCount"));
		PUSH_CONSTANT_RANGE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushConstantRangeCount"));
		P_PUSH_CONSTANT_RANGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPushConstantRanges"));
		//@formatter:on
	}

	public VkIndirectExecutionSetShaderInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkIndirectExecutionSetShaderInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkIndirectExecutionSetShaderInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkIndirectExecutionSetShaderInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkIndirectExecutionSetShaderInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderCount()
    public VkIndirectExecutionSetShaderInfoEXT shaderCount(int shaderCount) {
    	SHADER_COUNT_HANDLE.set(segment, 0L, shaderCount);
    	return this;
    }
    
    public int shaderCount() {
    	return (int) SHADER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pInitialShaders()
    public VkIndirectExecutionSetShaderInfoEXT pInitialShaders(NativePointerArray pInitialShaders) {
    	P_INITIAL_SHADERS_HANDLE.set(segment, 0L, pInitialShaders.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pInitialShaders() {
    	MemorySegment segment = (MemorySegment) P_INITIAL_SHADERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #pSetLayoutInfos()
    public VkIndirectExecutionSetShaderInfoEXT pSetLayoutInfos(NativeStructArray<VkIndirectExecutionSetShaderLayoutInfoEXT> pSetLayoutInfos) {
    	P_SET_LAYOUT_INFOS_HANDLE.set(segment, 0L, pSetLayoutInfos.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkIndirectExecutionSetShaderLayoutInfoEXT> pSetLayoutInfos() {
    	MemorySegment segment = (MemorySegment) P_SET_LAYOUT_INFOS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkIndirectExecutionSetShaderLayoutInfoEXT.array(segment);
    }
    
    /// @see #maxShaderCount()
    public VkIndirectExecutionSetShaderInfoEXT maxShaderCount(int maxShaderCount) {
    	MAX_SHADER_COUNT_HANDLE.set(segment, 0L, maxShaderCount);
    	return this;
    }
    
    public int maxShaderCount() {
    	return (int) MAX_SHADER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pushConstantRangeCount()
    public VkIndirectExecutionSetShaderInfoEXT pushConstantRangeCount(int pushConstantRangeCount) {
    	PUSH_CONSTANT_RANGE_COUNT_HANDLE.set(segment, 0L, pushConstantRangeCount);
    	return this;
    }
    
    public int pushConstantRangeCount() {
    	return (int) PUSH_CONSTANT_RANGE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPushConstantRanges()
    public VkIndirectExecutionSetShaderInfoEXT pPushConstantRanges(NativeStructArray<VkPushConstantRange> pPushConstantRanges) {
    	P_PUSH_CONSTANT_RANGES_HANDLE.set(segment, 0L, pPushConstantRanges.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkPushConstantRange> pPushConstantRanges() {
    	MemorySegment segment = (MemorySegment) P_PUSH_CONSTANT_RANGES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkPushConstantRange.array(segment);
    }
    
    @Override
    public VkIndirectExecutionSetShaderInfoEXT set(VkIndirectExecutionSetShaderInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkIndirectExecutionSetShaderInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkIndirectExecutionSetShaderInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkIndirectExecutionSetShaderInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectExecutionSetShaderInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkIndirectExecutionSetShaderInfoEXT> array(Arena arena, VkIndirectExecutionSetShaderInfoEXT... structs) {
        NativeStructArray<VkIndirectExecutionSetShaderInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectExecutionSetShaderInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkIndirectExecutionSetShaderInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkIndirectExecutionSetShaderInfoEXT(segment)
        );
    }

}