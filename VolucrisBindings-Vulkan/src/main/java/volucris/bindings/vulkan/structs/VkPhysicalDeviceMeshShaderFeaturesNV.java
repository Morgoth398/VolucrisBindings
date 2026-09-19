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

public final class VkPhysicalDeviceMeshShaderFeaturesNV
		implements Struct<VkPhysicalDeviceMeshShaderFeaturesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle TASK_SHADER_HANDLE;
    public static final VarHandle MESH_SHADER_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long TASK_SHADER_BYTE_OFFSET;
    public static final long MESH_SHADER_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("taskShader"),
            JAVA_INT.withName("meshShader")
        ).withName("VkPhysicalDeviceMeshShaderFeaturesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        TASK_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("taskShader"));
        MESH_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("meshShader"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        TASK_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("taskShader"));
        MESH_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("meshShader"));
        //@formatter:on
    }

    public VkPhysicalDeviceMeshShaderFeaturesNV() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceMeshShaderFeaturesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceMeshShaderFeaturesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceMeshShaderFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMeshShaderFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #taskShader()
    public VkPhysicalDeviceMeshShaderFeaturesNV taskShader(int taskShader) {
    	TASK_SHADER_HANDLE.set(segment, 0L, taskShader);
    	return this;
    }
    
    public int taskShader() {
    	return (int) TASK_SHADER_HANDLE.get(segment, 0L);
    }
    
    /// @see #meshShader()
    public VkPhysicalDeviceMeshShaderFeaturesNV meshShader(int meshShader) {
    	MESH_SHADER_HANDLE.set(segment, 0L, meshShader);
    	return this;
    }
    
    public int meshShader() {
    	return (int) MESH_SHADER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMeshShaderFeaturesNV set(VkPhysicalDeviceMeshShaderFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMeshShaderFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMeshShaderFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMeshShaderFeaturesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMeshShaderFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMeshShaderFeaturesNV> array(Arena arena, VkPhysicalDeviceMeshShaderFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceMeshShaderFeaturesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMeshShaderFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMeshShaderFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMeshShaderFeaturesNV(segment)
        );
    }
    
}