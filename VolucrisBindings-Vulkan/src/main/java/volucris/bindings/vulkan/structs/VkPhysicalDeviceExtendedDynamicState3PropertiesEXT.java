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

public final class VkPhysicalDeviceExtendedDynamicState3PropertiesEXT
		implements Struct<VkPhysicalDeviceExtendedDynamicState3PropertiesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle DYNAMIC_PRIMITIVE_TOPOLOGY_UNRESTRICTED_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long DYNAMIC_PRIMITIVE_TOPOLOGY_UNRESTRICTED_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("dynamicPrimitiveTopologyUnrestricted"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceExtendedDynamicState3PropertiesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        DYNAMIC_PRIMITIVE_TOPOLOGY_UNRESTRICTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dynamicPrimitiveTopologyUnrestricted"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        DYNAMIC_PRIMITIVE_TOPOLOGY_UNRESTRICTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dynamicPrimitiveTopologyUnrestricted"));
        //@formatter:on
    }

    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #dynamicPrimitiveTopologyUnrestricted()
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT dynamicPrimitiveTopologyUnrestricted(int dynamicPrimitiveTopologyUnrestricted) {
    	DYNAMIC_PRIMITIVE_TOPOLOGY_UNRESTRICTED_HANDLE.set(segment, 0L, dynamicPrimitiveTopologyUnrestricted);
    	return this;
    }
    
    public int dynamicPrimitiveTopologyUnrestricted() {
    	return (int) DYNAMIC_PRIMITIVE_TOPOLOGY_UNRESTRICTED_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT set(VkPhysicalDeviceExtendedDynamicState3PropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceExtendedDynamicState3PropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceExtendedDynamicState3PropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceExtendedDynamicState3PropertiesEXT> array(Arena arena, VkPhysicalDeviceExtendedDynamicState3PropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceExtendedDynamicState3PropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceExtendedDynamicState3PropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(segment)
        );
    }
    
}