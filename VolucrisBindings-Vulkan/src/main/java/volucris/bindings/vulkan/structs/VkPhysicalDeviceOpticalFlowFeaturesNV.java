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

public final class VkPhysicalDeviceOpticalFlowFeaturesNV
		implements Struct<VkPhysicalDeviceOpticalFlowFeaturesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle OPTICAL_FLOW_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long OPTICAL_FLOW_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("opticalFlow"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceOpticalFlowFeaturesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        OPTICAL_FLOW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("opticalFlow"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        OPTICAL_FLOW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("opticalFlow"));
        //@formatter:on
    }

    public VkPhysicalDeviceOpticalFlowFeaturesNV() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceOpticalFlowFeaturesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceOpticalFlowFeaturesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceOpticalFlowFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceOpticalFlowFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #opticalFlow()
    public VkPhysicalDeviceOpticalFlowFeaturesNV opticalFlow(int opticalFlow) {
    	OPTICAL_FLOW_HANDLE.set(segment, 0L, opticalFlow);
    	return this;
    }
    
    public int opticalFlow() {
    	return (int) OPTICAL_FLOW_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceOpticalFlowFeaturesNV set(VkPhysicalDeviceOpticalFlowFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceOpticalFlowFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceOpticalFlowFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceOpticalFlowFeaturesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceOpticalFlowFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceOpticalFlowFeaturesNV> array(Arena arena, VkPhysicalDeviceOpticalFlowFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceOpticalFlowFeaturesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceOpticalFlowFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceOpticalFlowFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceOpticalFlowFeaturesNV(segment)
        );
    }
    
}