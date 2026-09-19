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

public final class VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV
		implements Struct<VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SHADER_FLOAT16_VECTOR_ATOMICS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SHADER_FLOAT16_VECTOR_ATOMICS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("shaderFloat16VectorAtomics"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SHADER_FLOAT16_VECTOR_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderFloat16VectorAtomics"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SHADER_FLOAT16_VECTOR_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat16VectorAtomics"));
        //@formatter:on
    }

    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderFloat16VectorAtomics()
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV shaderFloat16VectorAtomics(int shaderFloat16VectorAtomics) {
    	SHADER_FLOAT16_VECTOR_ATOMICS_HANDLE.set(segment, 0L, shaderFloat16VectorAtomics);
    	return this;
    }
    
    public int shaderFloat16VectorAtomics() {
    	return (int) SHADER_FLOAT16_VECTOR_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV set(VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV> array(Arena arena, VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(segment)
        );
    }
    
}