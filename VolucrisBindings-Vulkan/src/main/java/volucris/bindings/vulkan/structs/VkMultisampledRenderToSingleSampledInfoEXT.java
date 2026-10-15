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

public final class VkMultisampledRenderToSingleSampledInfoEXT
		implements Struct<VkMultisampledRenderToSingleSampledInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_ENABLE_HANDLE;
	public static final VarHandle RASTERIZATION_SAMPLES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_ENABLE_BYTE_OFFSET;
	public static final long RASTERIZATION_SAMPLES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("multisampledRenderToSingleSampledEnable"),
		    JAVA_INT.withName("rasterizationSamples")
		).withName("VkMultisampledRenderToSingleSampledInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("multisampledRenderToSingleSampledEnable"));
		RASTERIZATION_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rasterizationSamples"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("multisampledRenderToSingleSampledEnable"));
		RASTERIZATION_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rasterizationSamples"));
		//@formatter:on
	}

	public VkMultisampledRenderToSingleSampledInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkMultisampledRenderToSingleSampledInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkMultisampledRenderToSingleSampledInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkMultisampledRenderToSingleSampledInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMultisampledRenderToSingleSampledInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #multisampledRenderToSingleSampledEnable()
    public VkMultisampledRenderToSingleSampledInfoEXT multisampledRenderToSingleSampledEnable(int multisampledRenderToSingleSampledEnable) {
    	MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_ENABLE_HANDLE.set(segment, 0L, multisampledRenderToSingleSampledEnable);
    	return this;
    }
    
    public int multisampledRenderToSingleSampledEnable() {
    	return (int) MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #rasterizationSamples()
    public VkMultisampledRenderToSingleSampledInfoEXT rasterizationSamples(int rasterizationSamples) {
    	RASTERIZATION_SAMPLES_HANDLE.set(segment, 0L, rasterizationSamples);
    	return this;
    }
    
    public int rasterizationSamples() {
    	return (int) RASTERIZATION_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMultisampledRenderToSingleSampledInfoEXT set(VkMultisampledRenderToSingleSampledInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkMultisampledRenderToSingleSampledInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMultisampledRenderToSingleSampledInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMultisampledRenderToSingleSampledInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMultisampledRenderToSingleSampledInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMultisampledRenderToSingleSampledInfoEXT> array(Arena arena, VkMultisampledRenderToSingleSampledInfoEXT... structs) {
        NativeStructArray<VkMultisampledRenderToSingleSampledInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMultisampledRenderToSingleSampledInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMultisampledRenderToSingleSampledInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMultisampledRenderToSingleSampledInfoEXT(segment)
        );
    }

}