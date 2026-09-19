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

public final class VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM
		implements Struct<VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SHADER_MULTIPLE_WAIT_QUEUES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SHADER_MULTIPLE_WAIT_QUEUES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("shaderMultipleWaitQueues"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SHADER_MULTIPLE_WAIT_QUEUES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderMultipleWaitQueues"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SHADER_MULTIPLE_WAIT_QUEUES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderMultipleWaitQueues"));
        //@formatter:on
    }

    public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderMultipleWaitQueues()
    public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM shaderMultipleWaitQueues(int shaderMultipleWaitQueues) {
    	SHADER_MULTIPLE_WAIT_QUEUES_HANDLE.set(segment, 0L, shaderMultipleWaitQueues);
    	return this;
    }
    
    public int shaderMultipleWaitQueues() {
    	return (int) SHADER_MULTIPLE_WAIT_QUEUES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM set(VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM> array(Arena arena, VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM... structs) {
        NativeStructArray<VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderMultipleWaitQueuesFeaturesQCOM(segment)
        );
    }
    
}