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

public final class VkPhysicalDeviceConditionalRenderingFeaturesEXT
		implements Struct<VkPhysicalDeviceConditionalRenderingFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle CONDITIONAL_RENDERING_HANDLE;
	public static final VarHandle INHERITED_CONDITIONAL_RENDERING_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long CONDITIONAL_RENDERING_BYTE_OFFSET;
	public static final long INHERITED_CONDITIONAL_RENDERING_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("conditionalRendering"),
		    JAVA_INT.withName("inheritedConditionalRendering")
		).withName("VkPhysicalDeviceConditionalRenderingFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		CONDITIONAL_RENDERING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("conditionalRendering"));
		INHERITED_CONDITIONAL_RENDERING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inheritedConditionalRendering"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		CONDITIONAL_RENDERING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("conditionalRendering"));
		INHERITED_CONDITIONAL_RENDERING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inheritedConditionalRendering"));
		//@formatter:on
	}

	public VkPhysicalDeviceConditionalRenderingFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceConditionalRenderingFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceConditionalRenderingFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #conditionalRendering()
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT conditionalRendering(int conditionalRendering) {
    	CONDITIONAL_RENDERING_HANDLE.set(segment, 0L, conditionalRendering);
    	return this;
    }
    
    public int conditionalRendering() {
    	return (int) CONDITIONAL_RENDERING_HANDLE.get(segment, 0L);
    }
    
    /// @see #inheritedConditionalRendering()
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT inheritedConditionalRendering(int inheritedConditionalRendering) {
    	INHERITED_CONDITIONAL_RENDERING_HANDLE.set(segment, 0L, inheritedConditionalRendering);
    	return this;
    }
    
    public int inheritedConditionalRendering() {
    	return (int) INHERITED_CONDITIONAL_RENDERING_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT set(VkPhysicalDeviceConditionalRenderingFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceConditionalRenderingFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceConditionalRenderingFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceConditionalRenderingFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceConditionalRenderingFeaturesEXT> array(Arena arena, VkPhysicalDeviceConditionalRenderingFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceConditionalRenderingFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceConditionalRenderingFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceConditionalRenderingFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceConditionalRenderingFeaturesEXT(segment)
        );
    }

}