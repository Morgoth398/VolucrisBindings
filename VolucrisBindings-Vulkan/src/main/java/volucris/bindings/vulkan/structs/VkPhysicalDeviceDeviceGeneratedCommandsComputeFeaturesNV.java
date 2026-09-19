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

public final class VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV
		implements Struct<VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle DEVICE_GENERATED_COMPUTE_HANDLE;
    public static final VarHandle DEVICE_GENERATED_COMPUTE_PIPELINES_HANDLE;
    public static final VarHandle DEVICE_GENERATED_COMPUTE_CAPTURE_REPLAY_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long DEVICE_GENERATED_COMPUTE_BYTE_OFFSET;
    public static final long DEVICE_GENERATED_COMPUTE_PIPELINES_BYTE_OFFSET;
    public static final long DEVICE_GENERATED_COMPUTE_CAPTURE_REPLAY_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("deviceGeneratedCompute"),
            JAVA_INT.withName("deviceGeneratedComputePipelines"),
            JAVA_INT.withName("deviceGeneratedComputeCaptureReplay"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        DEVICE_GENERATED_COMPUTE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceGeneratedCompute"));
        DEVICE_GENERATED_COMPUTE_PIPELINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceGeneratedComputePipelines"));
        DEVICE_GENERATED_COMPUTE_CAPTURE_REPLAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceGeneratedComputeCaptureReplay"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        DEVICE_GENERATED_COMPUTE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedCompute"));
        DEVICE_GENERATED_COMPUTE_PIPELINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedComputePipelines"));
        DEVICE_GENERATED_COMPUTE_CAPTURE_REPLAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedComputeCaptureReplay"));
        //@formatter:on
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #deviceGeneratedCompute()
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedCompute(int deviceGeneratedCompute) {
    	DEVICE_GENERATED_COMPUTE_HANDLE.set(segment, 0L, deviceGeneratedCompute);
    	return this;
    }
    
    public int deviceGeneratedCompute() {
    	return (int) DEVICE_GENERATED_COMPUTE_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceGeneratedComputePipelines()
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedComputePipelines(int deviceGeneratedComputePipelines) {
    	DEVICE_GENERATED_COMPUTE_PIPELINES_HANDLE.set(segment, 0L, deviceGeneratedComputePipelines);
    	return this;
    }
    
    public int deviceGeneratedComputePipelines() {
    	return (int) DEVICE_GENERATED_COMPUTE_PIPELINES_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceGeneratedComputeCaptureReplay()
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedComputeCaptureReplay(int deviceGeneratedComputeCaptureReplay) {
    	DEVICE_GENERATED_COMPUTE_CAPTURE_REPLAY_HANDLE.set(segment, 0L, deviceGeneratedComputeCaptureReplay);
    	return this;
    }
    
    public int deviceGeneratedComputeCaptureReplay() {
    	return (int) DEVICE_GENERATED_COMPUTE_CAPTURE_REPLAY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV set(VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV> array(Arena arena, VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(segment)
        );
    }
    
}