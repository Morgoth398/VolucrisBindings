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

public final class VkPhysicalDeviceShaderSMBuiltinsPropertiesNV
		implements Struct<VkPhysicalDeviceShaderSMBuiltinsPropertiesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SHADER_SMCOUNT_HANDLE;
    public static final VarHandle SHADER_WARPS_PER_SM_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SHADER_SMCOUNT_BYTE_OFFSET;
    public static final long SHADER_WARPS_PER_SM_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("shaderSMCount"),
            JAVA_INT.withName("shaderWarpsPerSM")
        ).withName("VkPhysicalDeviceShaderSMBuiltinsPropertiesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SHADER_SMCOUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSMCount"));
        SHADER_WARPS_PER_SM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderWarpsPerSM"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SHADER_SMCOUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSMCount"));
        SHADER_WARPS_PER_SM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderWarpsPerSM"));
        //@formatter:on
    }

    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderSMCount()
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV shaderSMCount(int shaderSMCount) {
    	SHADER_SMCOUNT_HANDLE.set(segment, 0L, shaderSMCount);
    	return this;
    }
    
    public int shaderSMCount() {
    	return (int) SHADER_SMCOUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderWarpsPerSM()
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV shaderWarpsPerSM(int shaderWarpsPerSM) {
    	SHADER_WARPS_PER_SM_HANDLE.set(segment, 0L, shaderWarpsPerSM);
    	return this;
    }
    
    public int shaderWarpsPerSM() {
    	return (int) SHADER_WARPS_PER_SM_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV set(VkPhysicalDeviceShaderSMBuiltinsPropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderSMBuiltinsPropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderSMBuiltinsPropertiesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderSMBuiltinsPropertiesNV> array(Arena arena, VkPhysicalDeviceShaderSMBuiltinsPropertiesNV... structs) {
        NativeStructArray<VkPhysicalDeviceShaderSMBuiltinsPropertiesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderSMBuiltinsPropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(segment)
        );
    }
    
}