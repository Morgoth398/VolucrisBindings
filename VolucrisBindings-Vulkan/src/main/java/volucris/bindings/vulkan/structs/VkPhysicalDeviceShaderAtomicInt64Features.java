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

public final class VkPhysicalDeviceShaderAtomicInt64Features
		implements Struct<VkPhysicalDeviceShaderAtomicInt64Features> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SHADER_BUFFER_INT64_ATOMICS_HANDLE;
    public static final VarHandle SHADER_SHARED_INT64_ATOMICS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SHADER_BUFFER_INT64_ATOMICS_BYTE_OFFSET;
    public static final long SHADER_SHARED_INT64_ATOMICS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("shaderBufferInt64Atomics"),
            JAVA_INT.withName("shaderSharedInt64Atomics")
        ).withName("VkPhysicalDeviceShaderAtomicInt64Features").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SHADER_BUFFER_INT64_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderBufferInt64Atomics"));
        SHADER_SHARED_INT64_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSharedInt64Atomics"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SHADER_BUFFER_INT64_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferInt64Atomics"));
        SHADER_SHARED_INT64_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedInt64Atomics"));
        //@formatter:on
    }

    public VkPhysicalDeviceShaderAtomicInt64Features() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceShaderAtomicInt64Features(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceShaderAtomicInt64Features(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceShaderAtomicInt64Features sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderAtomicInt64Features pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderBufferInt64Atomics()
    public VkPhysicalDeviceShaderAtomicInt64Features shaderBufferInt64Atomics(int shaderBufferInt64Atomics) {
    	SHADER_BUFFER_INT64_ATOMICS_HANDLE.set(segment, 0L, shaderBufferInt64Atomics);
    	return this;
    }
    
    public int shaderBufferInt64Atomics() {
    	return (int) SHADER_BUFFER_INT64_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSharedInt64Atomics()
    public VkPhysicalDeviceShaderAtomicInt64Features shaderSharedInt64Atomics(int shaderSharedInt64Atomics) {
    	SHADER_SHARED_INT64_ATOMICS_HANDLE.set(segment, 0L, shaderSharedInt64Atomics);
    	return this;
    }
    
    public int shaderSharedInt64Atomics() {
    	return (int) SHADER_SHARED_INT64_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderAtomicInt64Features set(VkPhysicalDeviceShaderAtomicInt64Features other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderAtomicInt64Features set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderAtomicInt64Features> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderAtomicInt64Features> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderAtomicInt64Features(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderAtomicInt64Features> array(Arena arena, VkPhysicalDeviceShaderAtomicInt64Features... structs) {
        NativeStructArray<VkPhysicalDeviceShaderAtomicInt64Features> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderAtomicInt64Features(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderAtomicInt64Features> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderAtomicInt64Features(segment)
        );
    }
    
}