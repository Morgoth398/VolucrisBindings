/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkSamplerBorderColorComponentMappingCreateInfoEXT
		implements Struct<VkSamplerBorderColorComponentMappingCreateInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SRGB_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long COMPONENTS_BYTE_OFFSET;
    public static final long SRGB_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkComponentMapping components;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkComponentMapping.LAYOUT.withName("components"),
            JAVA_INT.withName("srgb"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkSamplerBorderColorComponentMappingCreateInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SRGB_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srgb"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        COMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("components"));
        SRGB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srgb"));
        //@formatter:on
    }

    public VkSamplerBorderColorComponentMappingCreateInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkSamplerBorderColorComponentMappingCreateInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSamplerBorderColorComponentMappingCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
        components = new VkComponentMapping(segment.asSlice(COMPONENTS_BYTE_OFFSET, VkComponentMapping.LAYOUT));
    }

    /// @see #sType()
    public VkSamplerBorderColorComponentMappingCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSamplerBorderColorComponentMappingCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #srgb()
    public VkSamplerBorderColorComponentMappingCreateInfoEXT srgb(int srgb) {
    	SRGB_HANDLE.set(segment, 0L, srgb);
    	return this;
    }
    
    public int srgb() {
    	return (int) SRGB_HANDLE.get(segment, 0L);
    }
    
    /// @see #components()
    public VkSamplerBorderColorComponentMappingCreateInfoEXT components(Consumer<VkComponentMapping> consumer) {
    	consumer.accept(components);
    	return this;
    }
    
    /// @see #components()
    public VkSamplerBorderColorComponentMappingCreateInfoEXT components(VkComponentMapping other) {
    	components.set(other);
    	return this;
    }
    
    public VkComponentMapping components() {
    	return components;
    }
    
    @Override
    public VkSamplerBorderColorComponentMappingCreateInfoEXT set(VkSamplerBorderColorComponentMappingCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkSamplerBorderColorComponentMappingCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSamplerBorderColorComponentMappingCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSamplerBorderColorComponentMappingCreateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSamplerBorderColorComponentMappingCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSamplerBorderColorComponentMappingCreateInfoEXT> array(Arena arena, VkSamplerBorderColorComponentMappingCreateInfoEXT... structs) {
        NativeStructArray<VkSamplerBorderColorComponentMappingCreateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSamplerBorderColorComponentMappingCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSamplerBorderColorComponentMappingCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSamplerBorderColorComponentMappingCreateInfoEXT(segment)
        );
    }
    
}