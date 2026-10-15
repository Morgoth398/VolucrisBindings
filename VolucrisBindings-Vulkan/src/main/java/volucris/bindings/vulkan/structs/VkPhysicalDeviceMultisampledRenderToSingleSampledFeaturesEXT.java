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

public final class VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT
		implements Struct<VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("multisampledRenderToSingleSampled"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("multisampledRenderToSingleSampled"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("multisampledRenderToSingleSampled"));
		//@formatter:on
	}

	public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #multisampledRenderToSingleSampled()
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT multisampledRenderToSingleSampled(int multisampledRenderToSingleSampled) {
    	MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_HANDLE.set(segment, 0L, multisampledRenderToSingleSampled);
    	return this;
    }
    
    public int multisampledRenderToSingleSampled() {
    	return (int) MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT set(VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT> array(Arena arena, VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(segment)
        );
    }

}