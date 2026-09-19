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

public final class VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures
		implements Struct<VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SHADER_ZERO_INITIALIZE_WORKGROUP_MEMORY_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SHADER_ZERO_INITIALIZE_WORKGROUP_MEMORY_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("shaderZeroInitializeWorkgroupMemory"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SHADER_ZERO_INITIALIZE_WORKGROUP_MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SHADER_ZERO_INITIALIZE_WORKGROUP_MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));
        //@formatter:on
    }

    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderZeroInitializeWorkgroupMemory()
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures shaderZeroInitializeWorkgroupMemory(int shaderZeroInitializeWorkgroupMemory) {
    	SHADER_ZERO_INITIALIZE_WORKGROUP_MEMORY_HANDLE.set(segment, 0L, shaderZeroInitializeWorkgroupMemory);
    	return this;
    }
    
    public int shaderZeroInitializeWorkgroupMemory() {
    	return (int) SHADER_ZERO_INITIALIZE_WORKGROUP_MEMORY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures set(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures> array(Arena arena, VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(segment)
        );
    }
    
}