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

public final class VkDescriptorSetVariableDescriptorCountLayoutSupport
		implements Struct<VkDescriptorSetVariableDescriptorCountLayoutSupport> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_VARIABLE_DESCRIPTOR_COUNT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_VARIABLE_DESCRIPTOR_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxVariableDescriptorCount"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkDescriptorSetVariableDescriptorCountLayoutSupport").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_VARIABLE_DESCRIPTOR_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxVariableDescriptorCount"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_VARIABLE_DESCRIPTOR_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxVariableDescriptorCount"));
        //@formatter:on
    }

    public VkDescriptorSetVariableDescriptorCountLayoutSupport() {
        this(Arena.ofAuto());
    }
    
    public VkDescriptorSetVariableDescriptorCountLayoutSupport(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDescriptorSetVariableDescriptorCountLayoutSupport(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDescriptorSetVariableDescriptorCountLayoutSupport sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDescriptorSetVariableDescriptorCountLayoutSupport pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxVariableDescriptorCount()
    public VkDescriptorSetVariableDescriptorCountLayoutSupport maxVariableDescriptorCount(int maxVariableDescriptorCount) {
    	MAX_VARIABLE_DESCRIPTOR_COUNT_HANDLE.set(segment, 0L, maxVariableDescriptorCount);
    	return this;
    }
    
    public int maxVariableDescriptorCount() {
    	return (int) MAX_VARIABLE_DESCRIPTOR_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorSetVariableDescriptorCountLayoutSupport set(VkDescriptorSetVariableDescriptorCountLayoutSupport other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorSetVariableDescriptorCountLayoutSupport set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorSetVariableDescriptorCountLayoutSupport> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorSetVariableDescriptorCountLayoutSupport> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorSetVariableDescriptorCountLayoutSupport(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorSetVariableDescriptorCountLayoutSupport> array(Arena arena, VkDescriptorSetVariableDescriptorCountLayoutSupport... structs) {
        NativeStructArray<VkDescriptorSetVariableDescriptorCountLayoutSupport> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorSetVariableDescriptorCountLayoutSupport(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorSetVariableDescriptorCountLayoutSupport> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorSetVariableDescriptorCountLayoutSupport(segment)
        );
    }
    
}