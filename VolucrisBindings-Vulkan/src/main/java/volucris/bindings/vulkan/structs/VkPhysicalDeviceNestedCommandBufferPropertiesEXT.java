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

public final class VkPhysicalDeviceNestedCommandBufferPropertiesEXT
		implements Struct<VkPhysicalDeviceNestedCommandBufferPropertiesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_COMMAND_BUFFER_NESTING_LEVEL_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_COMMAND_BUFFER_NESTING_LEVEL_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxCommandBufferNestingLevel"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceNestedCommandBufferPropertiesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_COMMAND_BUFFER_NESTING_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxCommandBufferNestingLevel"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_COMMAND_BUFFER_NESTING_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxCommandBufferNestingLevel"));
        //@formatter:on
    }

    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxCommandBufferNestingLevel()
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT maxCommandBufferNestingLevel(int maxCommandBufferNestingLevel) {
    	MAX_COMMAND_BUFFER_NESTING_LEVEL_HANDLE.set(segment, 0L, maxCommandBufferNestingLevel);
    	return this;
    }
    
    public int maxCommandBufferNestingLevel() {
    	return (int) MAX_COMMAND_BUFFER_NESTING_LEVEL_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT set(VkPhysicalDeviceNestedCommandBufferPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceNestedCommandBufferPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceNestedCommandBufferPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceNestedCommandBufferPropertiesEXT> array(Arena arena, VkPhysicalDeviceNestedCommandBufferPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceNestedCommandBufferPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceNestedCommandBufferPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(segment)
        );
    }
    
}