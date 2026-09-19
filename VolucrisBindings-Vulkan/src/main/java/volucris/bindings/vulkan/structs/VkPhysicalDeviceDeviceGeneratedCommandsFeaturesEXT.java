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

public final class VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT
		implements Struct<VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle DEVICE_GENERATED_COMMANDS_HANDLE;
    public static final VarHandle DYNAMIC_GENERATED_PIPELINE_LAYOUT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long DEVICE_GENERATED_COMMANDS_BYTE_OFFSET;
    public static final long DYNAMIC_GENERATED_PIPELINE_LAYOUT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("deviceGeneratedCommands"),
            JAVA_INT.withName("dynamicGeneratedPipelineLayout")
        ).withName("VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        DEVICE_GENERATED_COMMANDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceGeneratedCommands"));
        DYNAMIC_GENERATED_PIPELINE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dynamicGeneratedPipelineLayout"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        DEVICE_GENERATED_COMMANDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedCommands"));
        DYNAMIC_GENERATED_PIPELINE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dynamicGeneratedPipelineLayout"));
        //@formatter:on
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #deviceGeneratedCommands()
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT deviceGeneratedCommands(int deviceGeneratedCommands) {
    	DEVICE_GENERATED_COMMANDS_HANDLE.set(segment, 0L, deviceGeneratedCommands);
    	return this;
    }
    
    public int deviceGeneratedCommands() {
    	return (int) DEVICE_GENERATED_COMMANDS_HANDLE.get(segment, 0L);
    }
    
    /// @see #dynamicGeneratedPipelineLayout()
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT dynamicGeneratedPipelineLayout(int dynamicGeneratedPipelineLayout) {
    	DYNAMIC_GENERATED_PIPELINE_LAYOUT_HANDLE.set(segment, 0L, dynamicGeneratedPipelineLayout);
    	return this;
    }
    
    public int dynamicGeneratedPipelineLayout() {
    	return (int) DYNAMIC_GENERATED_PIPELINE_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT set(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT> array(Arena arena, VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(segment)
        );
    }
    
}