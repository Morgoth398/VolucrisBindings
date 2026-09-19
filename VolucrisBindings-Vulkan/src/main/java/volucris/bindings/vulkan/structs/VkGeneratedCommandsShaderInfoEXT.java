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

public final class VkGeneratedCommandsShaderInfoEXT
		implements Struct<VkGeneratedCommandsShaderInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SHADER_COUNT_HANDLE;
    public static final VarHandle P_SHADERS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SHADER_COUNT_BYTE_OFFSET;
    public static final long P_SHADERS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("shaderCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pShaders")
        ).withName("VkGeneratedCommandsShaderInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SHADER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderCount"));
        P_SHADERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pShaders"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SHADER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderCount"));
        P_SHADERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pShaders"));
        //@formatter:on
    }

    public VkGeneratedCommandsShaderInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkGeneratedCommandsShaderInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkGeneratedCommandsShaderInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkGeneratedCommandsShaderInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkGeneratedCommandsShaderInfoEXT pNext(MemorySegment pNext) {
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
    public VkGeneratedCommandsShaderInfoEXT shaderCount(int shaderCount) {
    	SHADER_COUNT_HANDLE.set(segment, 0L, shaderCount);
    	return this;
    }
    
    public int shaderCount() {
    	return (int) SHADER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pShaders()
    public VkGeneratedCommandsShaderInfoEXT pShaders(NativePointerArray pShaders) {
    	P_SHADERS_HANDLE.set(segment, 0L, pShaders.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pShaders() {
    	MemorySegment segment = (MemorySegment) P_SHADERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public VkGeneratedCommandsShaderInfoEXT set(VkGeneratedCommandsShaderInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkGeneratedCommandsShaderInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGeneratedCommandsShaderInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGeneratedCommandsShaderInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeneratedCommandsShaderInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGeneratedCommandsShaderInfoEXT> array(Arena arena, VkGeneratedCommandsShaderInfoEXT... structs) {
        NativeStructArray<VkGeneratedCommandsShaderInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeneratedCommandsShaderInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGeneratedCommandsShaderInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGeneratedCommandsShaderInfoEXT(segment)
        );
    }
    
}